package com.google.android.gcm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class GCMBaseIntentService extends IntentService {
    private static final String EXTRA_TOKEN = "token";
    private static final Object LOCK = GCMBaseIntentService.class;
    private static final int MAX_BACKOFF_MS = ((int) TimeUnit.SECONDS.toMillis(3600));
    public static final String TAG = "GCMBaseIntentService";
    private static final String TOKEN = Long.toBinaryString(sRandom.nextLong());
    private static final String WAKELOCK_KEY = "GCM_LIB";
    private static int sCounter;
    private static final Random sRandom = new Random();
    private static PowerManager.WakeLock sWakeLock;
    private final String[] mSenderIds;

    /* access modifiers changed from: protected */
    public void onDeletedMessages(Context context, int i) {
    }

    /* access modifiers changed from: protected */
    public abstract void onError(Context context, String str);

    /* access modifiers changed from: protected */
    public abstract void onMessage(Context context, Intent intent);

    /* access modifiers changed from: protected */
    public boolean onRecoverableError(Context context, String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void onRegistered(Context context, String str);

    /* access modifiers changed from: protected */
    public abstract void onUnregistered(Context context, String str);

    protected GCMBaseIntentService() {
        this(getName("DynamicSenderIds"), (String[]) null);
    }

    protected GCMBaseIntentService(String... strArr) {
        this(getName(strArr), strArr);
    }

    private GCMBaseIntentService(String str, String[] strArr) {
        super(str);
        this.mSenderIds = strArr;
    }

    private static String getName(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("GCMIntentService-");
        sb.append(str);
        sb.append("-");
        int i = sCounter + 1;
        sCounter = i;
        sb.append(i);
        String sb2 = sb.toString();
        Log.v(TAG, "Intent service name: " + sb2);
        return sb2;
    }

    private static String getName(String[] strArr) {
        return getName(GCMRegistrar.getFlatSenderIds(strArr));
    }

    /* access modifiers changed from: protected */
    public String[] getSenderIds(Context context) {
        String[] strArr = this.mSenderIds;
        if (strArr != null) {
            return strArr;
        }
        throw new IllegalStateException("sender id not set on constructor");
    }

    public final void onHandleIntent(Intent intent) {
        String stringExtra;
        try {
            Context applicationContext = getApplicationContext();
            String action = intent.getAction();
            if (action.equals(GCMConstants.INTENT_FROM_GCM_REGISTRATION_CALLBACK)) {
                GCMRegistrar.setRetryBroadcastReceiver(applicationContext);
                handleRegistration(applicationContext, intent);
            } else if (action.equals(GCMConstants.INTENT_FROM_GCM_MESSAGE)) {
                String stringExtra2 = intent.getStringExtra("message_type");
                if (stringExtra2 == null) {
                    onMessage(applicationContext, intent);
                } else if (stringExtra2.equals("deleted_messages")) {
                    stringExtra = intent.getStringExtra(GCMConstants.EXTRA_TOTAL_DELETED);
                    if (stringExtra != null) {
                        int parseInt = Integer.parseInt(stringExtra);
                        Log.v(TAG, "Received deleted messages notification: " + parseInt);
                        onDeletedMessages(applicationContext, parseInt);
                    }
                } else {
                    Log.e(TAG, "Received unknown special message: " + stringExtra2);
                }
            } else if (action.equals(GCMConstants.INTENT_FROM_GCM_LIBRARY_RETRY)) {
                String stringExtra3 = intent.getStringExtra("token");
                if (!TOKEN.equals(stringExtra3)) {
                    Log.e(TAG, "Received invalid token: " + stringExtra3);
                    synchronized (LOCK) {
                        if (sWakeLock != null) {
                            Log.v(TAG, "Releasing wakelock");
                            sWakeLock.release();
                        } else {
                            Log.e(TAG, "Wakelock reference is null");
                        }
                    }
                    return;
                } else if (GCMRegistrar.isRegistered(applicationContext)) {
                    GCMRegistrar.internalUnregister(applicationContext);
                } else {
                    GCMRegistrar.internalRegister(applicationContext, getSenderIds(applicationContext));
                }
            }
        } catch (NumberFormatException unused) {
            Log.e(TAG, "GCM returned invalid number of deleted messages: " + stringExtra);
        } catch (Throwable th) {
            synchronized (LOCK) {
                if (sWakeLock != null) {
                    Log.v(TAG, "Releasing wakelock");
                    sWakeLock.release();
                } else {
                    Log.e(TAG, "Wakelock reference is null");
                }
                throw th;
            }
        }
        synchronized (LOCK) {
            if (sWakeLock != null) {
                Log.v(TAG, "Releasing wakelock");
                sWakeLock.release();
            } else {
                Log.e(TAG, "Wakelock reference is null");
            }
        }
    }

    static void runIntentInService(Context context, Intent intent, String str) {
        synchronized (LOCK) {
            if (sWakeLock == null) {
                sWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, WAKELOCK_KEY);
            }
        }
        Log.v(TAG, "Acquiring wakelock");
        sWakeLock.acquire();
        intent.setClassName(context, str);
        context.startService(intent);
    }

    private void handleRegistration(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(GCMConstants.EXTRA_REGISTRATION_ID);
        String stringExtra2 = intent.getStringExtra("error");
        String stringExtra3 = intent.getStringExtra(GCMConstants.EXTRA_UNREGISTERED);
        Log.d(TAG, "handleRegistration: registrationId = " + stringExtra + ", error = " + stringExtra2 + ", unregistered = " + stringExtra3);
        if (stringExtra != null) {
            GCMRegistrar.resetBackoff(context);
            GCMRegistrar.setRegistrationId(context, stringExtra);
            onRegistered(context, stringExtra);
        } else if (stringExtra3 != null) {
            GCMRegistrar.resetBackoff(context);
            onUnregistered(context, GCMRegistrar.clearRegistrationId(context));
        } else {
            Log.d(TAG, "Registration error: " + stringExtra2);
            if (!"SERVICE_NOT_AVAILABLE".equals(stringExtra2)) {
                onError(context, stringExtra2);
            } else if (onRecoverableError(context, stringExtra2)) {
                int backoff = GCMRegistrar.getBackoff(context);
                int nextInt = (backoff / 2) + sRandom.nextInt(backoff);
                Log.d(TAG, "Scheduling registration retry, backoff = " + nextInt + " (" + backoff + ")");
                Intent intent2 = new Intent(GCMConstants.INTENT_FROM_GCM_LIBRARY_RETRY);
                intent2.putExtra("token", TOKEN);
                ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(3, SystemClock.elapsedRealtime() + ((long) nextInt), PendingIntent.getBroadcast(context, 0, intent2, 0));
                if (backoff < MAX_BACKOFF_MS) {
                    GCMRegistrar.setBackoff(context, backoff * 2);
                }
            } else {
                Log.d(TAG, "Not retrying failed operation");
            }
        }
    }
}
