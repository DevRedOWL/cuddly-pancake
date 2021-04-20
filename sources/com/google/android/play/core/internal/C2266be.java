package com.google.android.play.core.internal;

import android.util.Log;
import java.io.File;

/* renamed from: com.google.android.play.core.internal.be */
final class C2266be implements C2259ay {

    /* renamed from: a */
    private final /* synthetic */ int f1949a = 0;

    C2266be() {
    }

    C2266be(byte[] bArr) {
    }

    C2266be(char[] cArr) {
    }

    /* renamed from: a */
    public final boolean mo33832a(Object obj, File file, File file2) {
        int i = this.f1949a;
        if (i == 0) {
            try {
                return !((Boolean) C2269bh.m1216f(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
            } catch (ClassNotFoundException unused) {
                Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
                return false;
            }
        } else if (i != 1) {
            return true;
        } else {
            return new File((String) C2269bh.m1217g(obj.getClass(), String.class, File.class, file, File.class, file2)).exists();
        }
    }
}
