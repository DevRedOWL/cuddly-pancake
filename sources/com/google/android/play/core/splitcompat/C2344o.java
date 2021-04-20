package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.o */
final class C2344o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Set f2037a;

    /* renamed from: b */
    final /* synthetic */ SplitCompat f2038b;

    C2344o(SplitCompat splitCompat, Set set) {
        this.f2038b = splitCompat;
        this.f2037a = set;
    }

    public final void run() {
        try {
            for (String n : this.f2037a) {
                this.f2038b.f2011b.mo33959n(n);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
