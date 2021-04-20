package com.yandex.metrica.impl.p039ob;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.kb */
public class C3594kb extends FileObserver {

    /* renamed from: a */
    private final C4234wm<File> f3531a;

    /* renamed from: b */
    private final File f3532b;

    public C3594kb(File file, C4234wm<File> wmVar) {
        super(file.getAbsolutePath(), 8);
        this.f3531a = wmVar;
        this.f3532b = file;
    }

    public void onEvent(int i, String str) {
        if (i == 8 && !TextUtils.isEmpty(str)) {
            this.f3531a.mo39609a(new File(this.f3532b, str));
        }
    }
}
