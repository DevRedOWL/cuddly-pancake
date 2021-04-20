package com.google.android.play.core.splitinstall;

/* renamed from: com.google.android.play.core.splitinstall.r */
final class C2388r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplitInstallSessionState f2126a;

    /* renamed from: b */
    final /* synthetic */ int f2127b;

    /* renamed from: c */
    final /* synthetic */ int f2128c;

    /* renamed from: d */
    final /* synthetic */ C2389s f2129d;

    C2388r(C2389s sVar, SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.f2129d = sVar;
        this.f2126a = splitInstallSessionState;
        this.f2127b = i;
        this.f2128c = i2;
    }

    public final void run() {
        C2389s sVar = this.f2129d;
        SplitInstallSessionState splitInstallSessionState = this.f2126a;
        sVar.mo34038k(new C2347a(splitInstallSessionState.sessionId(), this.f2127b, this.f2128c, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.mo33995a(), splitInstallSessionState.mo33996b(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.mo33998c()));
    }
}
