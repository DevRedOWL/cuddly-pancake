package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.C2095a;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

public class FakeAppUpdateManager implements AppUpdateManager {

    /* renamed from: a */
    private final C2095a f1472a;

    /* renamed from: b */
    private final Context f1473b;

    /* renamed from: c */
    private int f1474c = 0;

    /* renamed from: d */
    private int f1475d = 0;

    /* renamed from: e */
    private boolean f1476e = false;

    /* renamed from: f */
    private int f1477f = 0;

    /* renamed from: g */
    private Integer f1478g = null;

    /* renamed from: h */
    private int f1479h = 0;

    /* renamed from: i */
    private long f1480i = 0;

    /* renamed from: j */
    private long f1481j = 0;

    /* renamed from: k */
    private boolean f1482k = false;

    /* renamed from: l */
    private boolean f1483l = false;

    /* renamed from: m */
    private boolean f1484m = false;

    /* renamed from: n */
    private Integer f1485n;

    public FakeAppUpdateManager(Context context) {
        this.f1472a = new C2095a(context);
        this.f1473b = context;
    }

    /* renamed from: a */
    private final boolean m805a(AppUpdateInfo appUpdateInfo, AppUpdateOptions appUpdateOptions) {
        int i;
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions) && (!AppUpdateOptions.defaultOptions(appUpdateOptions.appUpdateType()).equals(appUpdateOptions) || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions.appUpdateType()))) {
            return false;
        }
        if (appUpdateOptions.appUpdateType() == 1) {
            this.f1483l = true;
            i = 1;
        } else {
            this.f1482k = true;
            i = 0;
        }
        this.f1485n = i;
        return true;
    }

    /* renamed from: b */
    private final int m806b() {
        if (!this.f1476e) {
            return 1;
        }
        int i = this.f1474c;
        return (i == 0 || i == 4 || i == 5 || i == 6) ? 2 : 3;
    }

    /* renamed from: c */
    private final void m807c() {
        this.f1472a.mo33921i(InstallState.m1123a(this.f1474c, this.f1480i, this.f1481j, this.f1475d, this.f1473b.getPackageName()));
    }

    public Task<Void> completeUpdate() {
        int i = this.f1475d;
        if (i != 0) {
            return Tasks.m1600b(new InstallException(i));
        }
        int i2 = this.f1474c;
        if (i2 != 11) {
            return i2 == 3 ? Tasks.m1600b(new InstallException(-8)) : Tasks.m1600b(new InstallException(-7));
        }
        this.f1474c = 3;
        this.f1484m = true;
        Integer num = 0;
        if (num.equals(this.f1485n)) {
            m807c();
        }
        return Tasks.m1599a(null);
    }

    public void downloadCompletes() {
        int i = this.f1474c;
        if (i == 2 || i == 1) {
            this.f1474c = 11;
            this.f1480i = 0;
            this.f1481j = 0;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
                return;
            }
            Integer num2 = 1;
            if (num2.equals(this.f1485n)) {
                completeUpdate();
            }
        }
    }

    public void downloadFails() {
        int i = this.f1474c;
        if (i == 1 || i == 2) {
            this.f1474c = 5;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
            }
            this.f1485n = null;
            this.f1483l = false;
            this.f1474c = 0;
        }
    }

    public void downloadStarts() {
        if (this.f1474c == 1) {
            this.f1474c = 2;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
            }
        }
    }

    public Task<AppUpdateInfo> getAppUpdateInfo() {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        PendingIntent pendingIntent4;
        int i = this.f1475d;
        if (i != 0) {
            return Tasks.m1600b(new InstallException(i));
        }
        if (m806b() == 2 && this.f1475d == 0) {
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f1473b, 0, new Intent(), 0);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(this.f1473b, 0, new Intent(), 0);
            PendingIntent broadcast3 = PendingIntent.getBroadcast(this.f1473b, 0, new Intent(), 0);
            pendingIntent3 = broadcast;
            pendingIntent4 = broadcast2;
            pendingIntent2 = PendingIntent.getBroadcast(this.f1473b, 0, new Intent(), 0);
            pendingIntent = broadcast3;
        } else {
            pendingIntent4 = null;
            pendingIntent3 = null;
            pendingIntent2 = null;
            pendingIntent = null;
        }
        return Tasks.m1599a(AppUpdateInfo.m763a(this.f1473b.getPackageName(), this.f1477f, m806b(), this.f1474c, this.f1478g, this.f1479h, this.f1480i, this.f1481j, 0, 0, pendingIntent4, pendingIntent3, pendingIntent2, pendingIntent));
    }

    public Integer getTypeForUpdateInProgress() {
        return this.f1485n;
    }

    public void installCompletes() {
        if (this.f1474c == 3) {
            this.f1474c = 4;
            this.f1476e = false;
            this.f1477f = 0;
            this.f1478g = null;
            this.f1479h = 0;
            this.f1480i = 0;
            this.f1481j = 0;
            this.f1483l = false;
            this.f1484m = false;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
            }
            this.f1485n = null;
            this.f1474c = 0;
        }
    }

    public void installFails() {
        if (this.f1474c == 3) {
            this.f1474c = 5;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
            }
            this.f1485n = null;
            this.f1484m = false;
            this.f1483l = false;
            this.f1474c = 0;
        }
    }

    public boolean isConfirmationDialogVisible() {
        return this.f1482k;
    }

    public boolean isImmediateFlowVisible() {
        return this.f1483l;
    }

    public boolean isInstallSplashScreenVisible() {
        return this.f1484m;
    }

    public void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f1472a.mo33918f(installStateUpdatedListener);
    }

    public void setBytesDownloaded(long j) {
        if (this.f1474c == 2 && j <= this.f1481j) {
            this.f1480i = j;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
            }
        }
    }

    public void setClientVersionStalenessDays(Integer num) {
        if (this.f1476e) {
            this.f1478g = num;
        }
    }

    public void setInstallErrorCode(int i) {
        this.f1475d = i;
    }

    public void setTotalBytesToDownload(long j) {
        if (this.f1474c == 2) {
            this.f1481j = j;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
            }
        }
    }

    public void setUpdateAvailable(int i) {
        this.f1476e = true;
        this.f1477f = i;
    }

    public void setUpdateNotAvailable() {
        this.f1476e = false;
        this.f1478g = null;
    }

    public void setUpdatePriority(int i) {
        if (this.f1476e) {
            this.f1479h = i;
        }
    }

    public final Task<Integer> startUpdateFlow(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        return m805a(appUpdateInfo, appUpdateOptions) ? Tasks.m1599a(-1) : Tasks.m1600b(new InstallException(-6));
    }

    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int i, Activity activity, int i2) {
        return m805a(appUpdateInfo, AppUpdateOptions.newBuilder(i).build());
    }

    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int i, IntentSenderForResultStarter intentSenderForResultStarter, int i2) {
        return m805a(appUpdateInfo, AppUpdateOptions.newBuilder(i).build());
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int i) {
        return m805a(appUpdateInfo, appUpdateOptions);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i) {
        return m805a(appUpdateInfo, appUpdateOptions);
    }

    public void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f1472a.mo33919g(installStateUpdatedListener);
    }

    public void userAcceptsUpdate() {
        if (this.f1482k || this.f1483l) {
            this.f1482k = false;
            this.f1474c = 1;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
            }
        }
    }

    public void userCancelsDownload() {
        int i = this.f1474c;
        if (i == 1 || i == 2) {
            this.f1474c = 6;
            Integer num = 0;
            if (num.equals(this.f1485n)) {
                m807c();
            }
            this.f1485n = null;
            this.f1483l = false;
            this.f1474c = 0;
        }
    }

    public void userRejectsUpdate() {
        if (this.f1482k || this.f1483l) {
            this.f1482k = false;
            this.f1483l = false;
            this.f1485n = null;
            this.f1474c = 0;
        }
    }
}
