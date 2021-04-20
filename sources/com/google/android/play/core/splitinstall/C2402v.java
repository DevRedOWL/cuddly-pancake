package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.v */
final class C2402v implements SplitInstallManager {

    /* renamed from: a */
    private final C2368au f2185a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2389s f2186b;

    /* renamed from: c */
    private final C2386p f2187c;

    /* renamed from: d */
    private final C2369av f2188d;

    /* renamed from: e */
    private final Handler f2189e = new Handler(Looper.getMainLooper());

    C2402v(C2368au auVar, C2389s sVar, C2386p pVar, C2369av avVar) {
        this.f2185a = auVar;
        this.f2186b = sVar;
        this.f2187c = pVar;
        this.f2188d = avVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static List<String> m1589e(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale next : list) {
            if (Build.VERSION.SDK_INT >= 21) {
                arrayList.add(next.toLanguageTag());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo33973a(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f2186b.mo34036c(splitInstallStateUpdatedListener);
    }

    /* renamed from: b */
    public final synchronized void mo33974b(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f2186b.mo34037d(splitInstallStateUpdatedListener);
    }

    public final Task<Void> cancelInstall(int i) {
        return this.f2185a.mo34017h(i);
    }

    public final Task<Void> deferredInstall(List<String> list) {
        return this.f2185a.mo34012c(list);
    }

    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return Build.VERSION.SDK_INT < 21 ? Tasks.m1600b(new SplitInstallException(-5)) : this.f2185a.mo34013d(m1589e(list));
    }

    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return Build.VERSION.SDK_INT < 21 ? Tasks.m1600b(new SplitInstallException(-5)) : this.f2185a.mo34014e(m1589e(list));
    }

    public final Task<Void> deferredUninstall(List<String> list) {
        this.f2188d.mo34019b(list);
        return this.f2185a.mo34011b(list);
    }

    public final Set<String> getInstalledLanguages() {
        Set<String> b = this.f2187c.mo34033b();
        return b == null ? Collections.emptySet() : b;
    }

    public final Set<String> getInstalledModules() {
        return this.f2187c.mo34032a();
    }

    public final Task<SplitInstallSessionState> getSessionState(int i) {
        return this.f2185a.mo34015f(i);
    }

    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        return this.f2185a.mo34016g();
    }

    public final synchronized void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f2186b.mo33918f(splitInstallStateUpdatedListener);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) throws IntentSender.SendIntentException {
        return startConfirmationDialogForResult(splitInstallSessionState, (IntentSenderForResultStarter) new C2401u(activity), i);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i) throws IntentSender.SendIntentException {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        intentSenderForResultStarter.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r2.containsAll(r3) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.getLanguages()
            boolean r0 = r0.isEmpty()
            r1 = 21
            if (r0 != 0) goto L_0x001c
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x0011
            goto L_0x001c
        L_0x0011:
            com.google.android.play.core.splitinstall.SplitInstallException r6 = new com.google.android.play.core.splitinstall.SplitInstallException
            r0 = -5
            r6.<init>(r0)
            com.google.android.play.core.tasks.Task r6 = com.google.android.play.core.tasks.Tasks.m1600b(r6)
            return r6
        L_0x001c:
            java.util.List r0 = r6.getLanguages()
            com.google.android.play.core.splitinstall.p r2 = r5.f2187c
            java.util.Set r2 = r2.mo34033b()
            if (r2 != 0) goto L_0x0029
            goto L_0x004c
        L_0x0029:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r0.next()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r4 = r4.getLanguage()
            r3.add(r4)
            goto L_0x0032
        L_0x0046:
            boolean r0 = r2.containsAll(r3)
            if (r0 == 0) goto L_0x0082
        L_0x004c:
            java.util.List r0 = r6.getModuleNames()
            java.util.Set r2 = r5.getInstalledModules()
            boolean r0 = r2.containsAll(r0)
            if (r0 == 0) goto L_0x0082
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x006e
            java.util.List r0 = r6.getModuleNames()
            com.google.android.play.core.splitinstall.av r1 = r5.f2188d
            java.util.Set r1 = r1.mo34018a()
            boolean r0 = java.util.Collections.disjoint(r0, r1)
            if (r0 == 0) goto L_0x0082
        L_0x006e:
            android.os.Handler r0 = r5.f2189e
            com.google.android.play.core.splitinstall.t r1 = new com.google.android.play.core.splitinstall.t
            r1.<init>(r5, r6)
            r0.post(r1)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.play.core.tasks.Task r6 = com.google.android.play.core.tasks.Tasks.m1599a(r6)
            return r6
        L_0x0082:
            com.google.android.play.core.splitinstall.au r0 = r5.f2185a
            java.util.List r1 = r6.getModuleNames()
            java.util.List r6 = r6.getLanguages()
            java.util.List r6 = m1589e(r6)
            com.google.android.play.core.tasks.Task r6 = r0.mo34010a(r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.C2402v.startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest):com.google.android.play.core.tasks.Task");
    }

    public final synchronized void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f2186b.mo33919g(splitInstallStateUpdatedListener);
    }
}
