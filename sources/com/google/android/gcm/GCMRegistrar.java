package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class GCMRegistrar {
    private static final String BACKOFF_MS = "backoff_ms";
    private static final int DEFAULT_BACKOFF_MS = 3000;
    public static final long DEFAULT_ON_SERVER_LIFESPAN_MS = 604800000;
    private static final String GSF_PACKAGE = "com.google.android.gsf";
    private static final String PREFERENCES = "com.google.android.gcm";
    private static final String PROPERTY_APP_VERSION = "appVersion";
    private static final String PROPERTY_ON_SERVER = "onServer";
    private static final String PROPERTY_ON_SERVER_EXPIRATION_TIME = "onServerExpirationTime";
    private static final String PROPERTY_ON_SERVER_LIFESPAN = "onServerLifeSpan";
    private static final String PROPERTY_REG_ID = "regId";
    private static final String TAG = "GCMRegistrar";
    private static GCMBroadcastReceiver sRetryReceiver;
    private static String sRetryReceiverClassName;

    public static void checkDevice(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 8) {
            try {
                context.getPackageManager().getPackageInfo(GSF_PACKAGE, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
            }
        } else {
            throw new UnsupportedOperationException("Device must be at least API Level 8 (instead of " + i + ")");
        }
    }

    public static void checkManifest(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        String str = packageName + ".permission.C2D_MESSAGE";
        try {
            packageManager.getPermissionInfo(str, 4096);
            try {
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 2).receivers;
                if (activityInfoArr == null || activityInfoArr.length == 0) {
                    throw new IllegalStateException("No receiver for package " + packageName);
                }
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "number of receivers for " + packageName + ": " + activityInfoArr.length);
                }
                HashSet hashSet = new HashSet();
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (GCMConstants.PERMISSION_GCM_INTENTS.equals(activityInfo.permission)) {
                        hashSet.add(activityInfo.name);
                    }
                }
                if (!hashSet.isEmpty()) {
                    checkReceiver(context, hashSet, GCMConstants.INTENT_FROM_GCM_REGISTRATION_CALLBACK);
                    checkReceiver(context, hashSet, GCMConstants.INTENT_FROM_GCM_MESSAGE);
                    return;
                }
                throw new IllegalStateException("No receiver allowed to receive com.google.android.c2dm.permission.SEND");
            } catch (PackageManager.NameNotFoundException unused) {
                throw new IllegalStateException("Could not get receivers for package " + packageName);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new IllegalStateException("Application does not define permission " + str);
        }
    }

    private static void checkReceiver(Context context, Set<String> set, String str) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 32);
        if (!queryBroadcastReceivers.isEmpty()) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Found " + queryBroadcastReceivers.size() + " receivers for action " + str);
            }
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                String str2 = resolveInfo.activityInfo.name;
                if (!set.contains(str2)) {
                    throw new IllegalStateException("Receiver " + str2 + " is not set with permission " + GCMConstants.PERMISSION_GCM_INTENTS);
                }
            }
            return;
        }
        throw new IllegalStateException("No receivers for action " + str);
    }

    public static void register(Context context, String... strArr) {
        resetBackoff(context);
        internalRegister(context, strArr);
    }

    static void internalRegister(Context context, String... strArr) {
        String flatSenderIds = getFlatSenderIds(strArr);
        Log.v(TAG, "Registering app " + context.getPackageName() + " of senders " + flatSenderIds);
        Intent intent = new Intent(GCMConstants.INTENT_TO_GCM_REGISTRATION);
        intent.setPackage(GSF_PACKAGE);
        intent.putExtra(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra(GCMConstants.EXTRA_SENDER, flatSenderIds);
        context.startService(intent);
    }

    static String getFlatSenderIds(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(',');
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static void unregister(Context context) {
        resetBackoff(context);
        internalUnregister(context);
    }

    public static synchronized void onDestroy(Context context) {
        synchronized (GCMRegistrar.class) {
            if (sRetryReceiver != null) {
                Log.v(TAG, "Unregistering receiver");
                context.unregisterReceiver(sRetryReceiver);
                sRetryReceiver = null;
            }
        }
    }

    static void internalUnregister(Context context) {
        Log.v(TAG, "Unregistering app " + context.getPackageName());
        Intent intent = new Intent(GCMConstants.INTENT_TO_GCM_UNREGISTRATION);
        intent.setPackage(GSF_PACKAGE);
        intent.putExtra(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        context.startService(intent);
    }

    static synchronized void setRetryBroadcastReceiver(Context context) {
        synchronized (GCMRegistrar.class) {
            if (sRetryReceiver == null) {
                if (sRetryReceiverClassName == null) {
                    Log.e(TAG, "internal error: retry receiver class not set yet");
                    sRetryReceiver = new GCMBroadcastReceiver();
                } else {
                    try {
                        sRetryReceiver = (GCMBroadcastReceiver) Class.forName(sRetryReceiverClassName).newInstance();
                    } catch (Exception unused) {
                        Log.e(TAG, "Could not create instance of " + sRetryReceiverClassName + ". Using " + GCMBroadcastReceiver.class.getName() + " directly.");
                        sRetryReceiver = new GCMBroadcastReceiver();
                    }
                }
                String packageName = context.getPackageName();
                IntentFilter intentFilter = new IntentFilter(GCMConstants.INTENT_FROM_GCM_LIBRARY_RETRY);
                intentFilter.addCategory(packageName);
                Log.v(TAG, "Registering receiver");
                context.registerReceiver(sRetryReceiver, intentFilter, packageName + ".permission.C2D_MESSAGE", (Handler) null);
            }
        }
    }

    static void setRetryReceiverClassName(String str) {
        Log.v(TAG, "Setting the name of retry receiver class to " + str);
        sRetryReceiverClassName = str;
    }

    public static String getRegistrationId(Context context) {
        SharedPreferences gCMPreferences = getGCMPreferences(context);
        String string = gCMPreferences.getString(PROPERTY_REG_ID, "");
        int i = gCMPreferences.getInt(PROPERTY_APP_VERSION, Integer.MIN_VALUE);
        int appVersion = getAppVersion(context);
        if (i == Integer.MIN_VALUE || i == appVersion) {
            return string;
        }
        Log.v(TAG, "App version changed from " + i + " to " + appVersion + "; resetting registration id");
        clearRegistrationId(context);
        return "";
    }

    public static boolean isRegistered(Context context) {
        return getRegistrationId(context).length() > 0;
    }

    static String clearRegistrationId(Context context) {
        return setRegistrationId(context, "");
    }

    static String setRegistrationId(Context context, String str) {
        SharedPreferences gCMPreferences = getGCMPreferences(context);
        String string = gCMPreferences.getString(PROPERTY_REG_ID, "");
        int appVersion = getAppVersion(context);
        Log.v(TAG, "Saving regId on app version " + appVersion);
        SharedPreferences.Editor edit = gCMPreferences.edit();
        edit.putString(PROPERTY_REG_ID, str);
        edit.putInt(PROPERTY_APP_VERSION, appVersion);
        edit.commit();
        return string;
    }

    public static void setRegisteredOnServer(Context context, boolean z) {
        SharedPreferences.Editor edit = getGCMPreferences(context).edit();
        edit.putBoolean(PROPERTY_ON_SERVER, z);
        long currentTimeMillis = System.currentTimeMillis() + getRegisterOnServerLifespan(context);
        Log.v(TAG, "Setting registeredOnServer status as " + z + " until " + new Timestamp(currentTimeMillis));
        edit.putLong(PROPERTY_ON_SERVER_EXPIRATION_TIME, currentTimeMillis);
        edit.commit();
    }

    public static boolean isRegisteredOnServer(Context context) {
        SharedPreferences gCMPreferences = getGCMPreferences(context);
        boolean z = gCMPreferences.getBoolean(PROPERTY_ON_SERVER, false);
        Log.v(TAG, "Is registered on server: " + z);
        if (z) {
            long j = gCMPreferences.getLong(PROPERTY_ON_SERVER_EXPIRATION_TIME, -1);
            if (System.currentTimeMillis() > j) {
                Log.v(TAG, "flag expired on: " + new Timestamp(j));
                return false;
            }
        }
        return z;
    }

    public static long getRegisterOnServerLifespan(Context context) {
        return getGCMPreferences(context).getLong(PROPERTY_ON_SERVER_LIFESPAN, DEFAULT_ON_SERVER_LIFESPAN_MS);
    }

    public static void setRegisterOnServerLifespan(Context context, long j) {
        SharedPreferences.Editor edit = getGCMPreferences(context).edit();
        edit.putLong(PROPERTY_ON_SERVER_LIFESPAN, j);
        edit.commit();
    }

    private static int getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Coult not get package name: " + e);
        }
    }

    static void resetBackoff(Context context) {
        Log.d(TAG, "resetting backoff for " + context.getPackageName());
        setBackoff(context, 3000);
    }

    static int getBackoff(Context context) {
        return getGCMPreferences(context).getInt(BACKOFF_MS, 3000);
    }

    static void setBackoff(Context context, int i) {
        SharedPreferences.Editor edit = getGCMPreferences(context).edit();
        edit.putInt(BACKOFF_MS, i);
        edit.commit();
    }

    private static SharedPreferences getGCMPreferences(Context context) {
        return context.getSharedPreferences(PREFERENCES, 0);
    }

    private GCMRegistrar() {
        throw new UnsupportedOperationException();
    }
}
