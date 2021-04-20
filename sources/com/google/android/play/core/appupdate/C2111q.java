package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.play.core.appupdate.q */
final class C2111q {

    /* renamed from: a */
    private final Context f1453a;

    C2111q(Context context) {
        this.f1453a = context;
    }

    /* renamed from: b */
    private static long m797b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File b : listFiles) {
                j += m797b(b);
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo33534a() {
        return m797b(new File(this.f1453a.getFilesDir(), "assetpacks"));
    }
}
