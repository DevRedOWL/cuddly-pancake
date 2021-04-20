package org.mobileid.requester.background_requester;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C1770b;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p017d.p018a.C0910a;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 E2\u00020\u0001:\u0002EFB\u0007¢\u0006\u0004\bD\u0010&J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0005\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010&J)\u0010*\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010!2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u00103J\u0017\u00106\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u00103J'\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010&J\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010&R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020,8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, mo51343d2 = {"Lorg/mobileid/requester/background_requester/RequesterForegroundService;", "Landroid/app/Service;", "", "channel", "Landroid/app/PendingIntent;", "intent", "notificationText", "", "notificationIcon", "Landroid/app/Notification;", "buildNotification", "(Ljava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;I)Landroid/app/Notification;", "buildNotificationCompat", "", "createNotificationChannel", "(Ljava/lang/String;)V", "getAppLabel", "()Ljava/lang/String;", "Landroid/content/IntentFilter;", "getBluetoothTrackerIntentFilter", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "context", "Lorg/mobileid/access/AccessOptions;", "settings", "getProperNotificationIcon", "(Landroid/content/Context;Lorg/mobileid/access/AccessOptions;)I", "getProperNotificationText", "(Lorg/mobileid/access/AccessOptions;)Ljava/lang/String;", "", "isHandsFreeRunning", "()Z", "isScreenOnRunning", "Landroid/content/Intent;", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onCreate", "()V", "onDestroy", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Lorg/mobileid/requester/background_requester/BluetoothStateReceiver;", "registerBluetoothTracker", "(Landroid/content/Context;)Lorg/mobileid/requester/background_requester/BluetoothStateReceiver;", "setUpHF", "(Lorg/mobileid/access/AccessOptions;)V", "setUpScreenOn", "shouldStopHF", "(Lorg/mobileid/access/AccessOptions;)Z", "shouldStopScreenOn", "shouldUpdateHF", "shouldUpdateScreenOn", "id", "startForeground", "(ILjava/lang/String;I)V", "stopHF", "stopScreenOn", "LBackgroundRequester;", "backgroundRequester", "LBackgroundRequester;", "bluetoothReceiver", "Lorg/mobileid/requester/background_requester/BluetoothStateReceiver;", "LScreenOnReceiver;", "screenOnReceiver", "LScreenOnReceiver;", "<init>", "Companion", "ServiceState", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class RequesterForegroundService extends Service {

    /* renamed from: c */
    public static C5496b f6378c = C5496b.STOPPED;

    /* renamed from: d */
    public static final C5495a f6379d = new C5495a();

    /* renamed from: a */
    public C1769a f6380a;

    /* renamed from: b */
    public C1770b f6381b;

    /* renamed from: org.mobileid.requester.background_requester.RequesterForegroundService$a */
    public static final class C5495a {
        /* renamed from: a */
        public static final boolean m6910a(C5495a aVar, BluetoothAdapter bluetoothAdapter) {
            return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
        }

        /* renamed from: a */
        public final void mo60097a(Context context) {
            C5496b bVar;
            Intrinsics.checkNotNullParameter(context, "context");
            boolean z = false;
            C0837c a = C0837c.f761k.mo12907a(context, false);
            if (!(!a.f762a || (!a.f765d && !a.f763b))) {
                if (Build.VERSION.SDK_INT >= 26) {
                    z = true;
                }
                if (z) {
                    context.startForegroundService(new Intent(context, RequesterForegroundService.class));
                    bVar = C5496b.STARTED_REQUEST;
                } else {
                    context.startService(new Intent(context, RequesterForegroundService.class));
                    return;
                }
            } else if (RequesterForegroundService.f6378c == C5496b.STARTED_REQUEST) {
                bVar = C5496b.STOPPED_REQUEST;
            } else {
                context.stopService(new Intent(context, RequesterForegroundService.class));
                return;
            }
            RequesterForegroundService.f6378c = bVar;
        }
    }

    /* renamed from: org.mobileid.requester.background_requester.RequesterForegroundService$b */
    public enum C5496b {
        STARTED_REQUEST,
        STARTED,
        STOPPED_REQUEST,
        STOPPED
    }

    /* renamed from: a */
    public final int mo60091a(Context context, C0837c cVar) {
        int i = cVar.f770i;
        if (i == 0) {
            Context baseContext = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
            return baseContext.getApplicationInfo().icon;
        }
        try {
            String resourceTypeName = context.getResources().getResourceTypeName(cVar.f770i);
            if (!(!Intrinsics.areEqual((Object) resourceTypeName, (Object) "drawable"))) {
                return i;
            }
            if (!(!Intrinsics.areEqual((Object) resourceTypeName, (Object) "mipmap"))) {
                return i;
            }
            throw new Resources.NotFoundException("Notification icon is neither drawable, neither mipmap");
        } catch (Exception e) {
            e.printStackTrace();
            Context baseContext2 = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
            return baseContext2.getApplicationInfo().icon;
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        String str;
        super.onCreate();
        C0910a aVar = new C0910a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(aVar, intentFilter);
        C0837c.C0838a aVar2 = C0837c.f761k;
        Context baseContext = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        C0837c a = aVar2.mo12907a(baseContext, false);
        if (C5495a.m6910a(f6379d, BluetoothAdapter.getDefaultAdapter())) {
            str = a.f768g;
        } else {
            str = a.f769h;
        }
        Context baseContext2 = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
        mo60092a(1, str, mo60091a(baseContext2, a));
    }

    public void onDestroy() {
        super.onDestroy();
        C1769a aVar = this.f6380a;
        if (aVar != null) {
            aVar.mo23997a();
        }
        C1770b bVar = this.f6381b;
        if (bVar != null) {
            C1770b.C1771a aVar2 = C1770b.f1376b;
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(bVar, "receiver");
            unregisterReceiver(bVar);
        }
        stopSelf();
        stopForeground(true);
        f6378c = C5496b.STOPPED;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        f6378c = C5496b.STARTED;
        C0837c.C0838a aVar = C0837c.f761k;
        Context baseContext = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        boolean z = false;
        C0837c a = aVar.mo12907a(baseContext, false);
        if (C5495a.m6910a(f6379d, BluetoothAdapter.getDefaultAdapter())) {
            str = a.f768g;
        } else {
            str = a.f769h;
        }
        Context baseContext2 = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
        mo60092a(1, str, mo60091a(baseContext2, a));
        if (f6378c == C5496b.STOPPED_REQUEST) {
            stopSelf();
            return 2;
        }
        if ((this.f6380a != null) && a.f765d) {
            C1769a aVar2 = this.f6380a;
            if (aVar2 != null) {
                Intrinsics.checkNotNullParameter(a, SharedHelper.APP_PREFERENCES);
                aVar2.f1375e = a;
            }
        } else {
            if ((this.f6380a != null) && !a.f765d) {
                C1769a aVar3 = this.f6380a;
                if (aVar3 != null) {
                    aVar3.mo23997a();
                }
                this.f6380a = null;
            } else if (a.f765d) {
                this.f6380a = new C1769a(this, a);
            }
        }
        if ((this.f6381b != null) && a.f763b) {
            C1770b bVar = this.f6381b;
            if (bVar != null) {
                Intrinsics.checkNotNullParameter(a, "<set-?>");
                bVar.f1377a = a;
            }
        } else {
            if ((this.f6381b != null) && !a.f763b) {
                z = true;
            }
            if (z) {
                C1770b.C1771a aVar4 = C1770b.f1376b;
                C1770b bVar2 = this.f6381b;
                Intrinsics.checkNotNull(bVar2);
                Intrinsics.checkNotNullParameter(this, "context");
                Intrinsics.checkNotNullParameter(bVar2, "receiver");
                unregisterReceiver(bVar2);
                this.f6381b = null;
            } else if (a.f763b) {
                C1770b.C1771a aVar5 = C1770b.f1376b;
                Intrinsics.checkNotNullParameter(this, "context");
                Intrinsics.checkNotNullParameter(a, SharedHelper.APP_PREFERENCES);
                C1770b bVar3 = new C1770b(a);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.setPriority(1000);
                registerReceiver(bVar3, intentFilter);
                "Start on screen ON, receiver [" + aVar5.hashCode() + ']';
                this.f6381b = bVar3;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo60092a(int i, String str, int i2) {
        String str2;
        Context baseContext = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        int i3 = baseContext.getApplicationInfo().labelRes;
        if (i3 == 0) {
            Context baseContext2 = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
            str2 = baseContext2.getApplicationInfo().nonLocalizedLabel.toString();
        } else {
            str2 = getString(i3);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(labelResId)");
        }
        Context baseContext3 = getBaseContext();
        PackageManager packageManager = getPackageManager();
        Context baseContext4 = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext4, "baseContext");
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(baseContext4.getPackageName());
        PendingIntent activity = PendingIntent.getActivity(baseContext3, 0, launchIntentForPackage != null ? launchIntentForPackage.addFlags(67108864) : null, BasicMeasure.EXACTLY);
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = getBaseContext().getSystemService("notification");
            if (systemService != null) {
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (notificationManager.getNotificationChannel(str2) == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel(str2, str2, 1));
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }
        Notification build = new NotificationCompat.Builder(getBaseContext(), str2).setSmallIcon(i2).setColor(0).setContentText(str).setContentIntent(activity).setOngoing(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "NotificationCompat.Build…\n                .build()");
        startForeground(i, build);
    }
}
