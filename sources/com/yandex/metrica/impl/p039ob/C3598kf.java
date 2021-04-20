package com.yandex.metrica.impl.p039ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.kf */
public class C3598kf implements Runnable {

    /* renamed from: a */
    private final File f3539a;

    /* renamed from: b */
    private final C4234wm<File> f3540b;

    public C3598kf(File file, C4234wm<File> wmVar) {
        this.f3539a = file;
        this.f3540b = wmVar;
    }

    public void run() {
        File[] listFiles;
        if (this.f3539a.exists() && this.f3539a.isDirectory() && (listFiles = this.f3539a.listFiles()) != null) {
            for (File a : listFiles) {
                this.f3540b.mo39609a(a);
            }
        }
    }
}
