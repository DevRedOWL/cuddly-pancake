package com.yandex.metrica.impl.p039ob;

import android.os.FileObserver;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ku */
public class C3614ku {

    /* renamed from: a */
    private final FileObserver f3569a;

    /* renamed from: b */
    private final File f3570b;

    /* renamed from: c */
    private final C4234wm<File> f3571c;

    /* renamed from: d */
    private final C4257xh f3572d;

    public C3614ku(File file, C4234wm<File> wmVar) {
        this(file, wmVar, C3136al.m1993a().mo39495j().mo41837i());
    }

    private C3614ku(File file, C4234wm<File> wmVar, C4257xh xhVar) {
        this(new C3594kb(file, wmVar), file, wmVar, xhVar, new C3595kc());
    }

    C3614ku(FileObserver fileObserver, File file, C4234wm<File> wmVar, C4257xh xhVar, C3595kc kcVar) {
        this.f3569a = fileObserver;
        this.f3570b = file;
        this.f3571c = wmVar;
        this.f3572d = xhVar;
        kcVar.mo40344a(file);
    }

    /* renamed from: a */
    public void mo40368a() {
        this.f3572d.mo41808a((Runnable) new C3598kf(this.f3570b, this.f3571c));
        this.f3569a.startWatching();
    }

    /* renamed from: b */
    public void mo40369b() {
        this.f3569a.stopWatching();
    }
}
