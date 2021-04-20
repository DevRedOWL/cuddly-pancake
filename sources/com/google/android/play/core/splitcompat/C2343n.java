package com.google.android.play.core.splitcompat;

import android.util.Log;

/* renamed from: com.google.android.play.core.splitcompat.n */
final class C2343n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplitCompat f2036a;

    C2343n(SplitCompat splitCompat) {
        this.f2036a = splitCompat;
    }

    public final void run() {
        try {
            this.f2036a.f2011b.mo33946a();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
