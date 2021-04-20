package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.tasks.C2415i;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

/* renamed from: com.google.android.play.core.appupdate.d */
final class C2098d implements AppUpdateManager {

    /* renamed from: a */
    private final C2109o f1422a;

    /* renamed from: b */
    private final C2095a f1423b;

    /* renamed from: c */
    private final Context f1424c;

    /* renamed from: d */
    private final Handler f1425d = new Handler(Looper.getMainLooper());

    C2098d(C2109o oVar, C2095a aVar, Context context) {
        this.f1422a = oVar;
        this.f1423b = aVar;
        this.f1424c = context;
    }

    public final Task<Void> completeUpdate() {
        return this.f1422a.mo33533b(this.f1424c.getPackageName());
    }

    public final Task<AppUpdateInfo> getAppUpdateInfo() {
        return this.f1422a.mo33532a(this.f1424c.getPackageName());
    }

    public final synchronized void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f1423b.mo33918f(installStateUpdatedListener);
    }

    public final Task<Integer> startUpdateFlow(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        PlayCoreDialogWrapperActivity.m1114a(this.f1424c);
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions)) {
            return Tasks.m1600b(new InstallException(-6));
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", appUpdateInfo.mo33500h(appUpdateOptions));
        C2415i iVar = new C2415i();
        intent.putExtra("result_receiver", new C2096b(this.f1425d, iVar));
        activity.startActivity(intent);
        return iVar.mo34074c();
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        return startUpdateFlowForResult(appUpdateInfo, (IntentSenderForResultStarter) new C2097c(activity), AppUpdateOptions.defaultOptions(i), i2);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int i, IntentSenderForResultStarter intentSenderForResultStarter, int i2) throws IntentSender.SendIntentException {
        return startUpdateFlowForResult(appUpdateInfo, intentSenderForResultStarter, AppUpdateOptions.defaultOptions(i), i2);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException {
        return startUpdateFlowForResult(appUpdateInfo, (IntentSenderForResultStarter) new C2097c(activity), appUpdateOptions, i);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException {
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions)) {
            return false;
        }
        intentSenderForResultStarter.startIntentSenderForResult(appUpdateInfo.mo33500h(appUpdateOptions).getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }

    public final synchronized void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f1423b.mo33919g(installStateUpdatedListener);
    }
}
