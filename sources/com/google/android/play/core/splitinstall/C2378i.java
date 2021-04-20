package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.internal.C2289ca;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import com.google.android.play.core.tasks.Task;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.i */
final class C2378i implements SplitInstallManager {

    /* renamed from: a */
    private final C2289ca<C2402v> f2107a;

    /* renamed from: b */
    private final C2289ca<FakeSplitInstallManager> f2108b;

    /* renamed from: c */
    private final C2289ca<File> f2109c;

    C2378i(C2289ca<C2402v> caVar, C2289ca<FakeSplitInstallManager> caVar2, C2289ca<File> caVar3) {
        this.f2107a = caVar;
        this.f2108b = caVar2;
        this.f2109c = caVar3;
    }

    /* renamed from: c */
    private final SplitInstallManager m1522c() {
        return (SplitInstallManager) (this.f2109c.mo33869a() == null ? this.f2107a : this.f2108b).mo33869a();
    }

    /* renamed from: a */
    public final void mo33973a(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        m1522c().mo33973a(splitInstallStateUpdatedListener);
    }

    /* renamed from: b */
    public final void mo33974b(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        m1522c().mo33974b(splitInstallStateUpdatedListener);
    }

    public final Task<Void> cancelInstall(int i) {
        return m1522c().cancelInstall(i);
    }

    public final Task<Void> deferredInstall(List<String> list) {
        return m1522c().deferredInstall(list);
    }

    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return m1522c().deferredLanguageInstall(list);
    }

    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return m1522c().deferredLanguageUninstall(list);
    }

    public final Task<Void> deferredUninstall(List<String> list) {
        return m1522c().deferredUninstall(list);
    }

    public final Set<String> getInstalledLanguages() {
        return m1522c().getInstalledLanguages();
    }

    public final Set<String> getInstalledModules() {
        return m1522c().getInstalledModules();
    }

    public final Task<SplitInstallSessionState> getSessionState(int i) {
        return m1522c().getSessionState(i);
    }

    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        return m1522c().getSessionStates();
    }

    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        m1522c().registerListener(splitInstallStateUpdatedListener);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) throws IntentSender.SendIntentException {
        return m1522c().startConfirmationDialogForResult(splitInstallSessionState, activity, i);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i) throws IntentSender.SendIntentException {
        return m1522c().startConfirmationDialogForResult(splitInstallSessionState, intentSenderForResultStarter, i);
    }

    public final Task<Integer> startInstall(SplitInstallRequest splitInstallRequest) {
        return m1522c().startInstall(splitInstallRequest);
    }

    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        m1522c().unregisterListener(splitInstallStateUpdatedListener);
    }
}
