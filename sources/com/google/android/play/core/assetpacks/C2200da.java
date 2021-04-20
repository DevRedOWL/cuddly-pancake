package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.da */
final /* synthetic */ class C2200da implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f1813a = new C2200da();

    private C2200da() {
    }

    public final boolean accept(File file, String str) {
        return C2201db.f1814a.matcher(str).matches();
    }
}
