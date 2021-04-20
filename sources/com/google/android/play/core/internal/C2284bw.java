package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.bw */
final class C2284bw extends C2281bt {

    /* renamed from: a */
    private final C2283bv f1961a = new C2283bv();

    C2284bw() {
    }

    /* renamed from: a */
    public final void mo33865a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f1961a.mo33868a(th).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
