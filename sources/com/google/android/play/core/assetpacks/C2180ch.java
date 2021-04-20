package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.ch */
final /* synthetic */ class C2180ch implements FilenameFilter {

    /* renamed from: a */
    private final String f1734a;

    C2180ch(String str) {
        this.f1734a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f1734a).concat("-")) && str.endsWith(".apk");
    }
}
