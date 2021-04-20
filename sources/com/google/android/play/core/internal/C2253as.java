package com.google.android.play.core.internal;

import android.util.Log;
import com.google.android.play.core.splitinstall.C2373d;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.as */
final class C2253as implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f1930a;

    /* renamed from: b */
    final /* synthetic */ C2373d f1931b;

    /* renamed from: c */
    final /* synthetic */ C2254at f1932c;

    C2253as(C2254at atVar, List list, C2373d dVar) {
        this.f1932c = atVar;
        this.f1930a = list;
        this.f1931b = dVar;
    }

    public final void run() {
        try {
            if (this.f1932c.f1935c.mo33829c(this.f1930a)) {
                C2254at.m1167c(this.f1932c, this.f1931b);
            } else {
                C2254at.m1168d(this.f1932c, this.f1930a, this.f1931b);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Error checking verified files.", e);
            this.f1931b.mo34026c(-11);
        }
    }
}
