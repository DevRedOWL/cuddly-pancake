package com.yandex.metrica.push.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.push.impl.ca */
public class C4379ca implements C4377bz {

    /* renamed from: a */
    private static final C4379ca f5498a = new C4379ca();

    /* renamed from: b */
    private final List<C4377bz> f5499b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public static C4379ca m6456c() {
        return f5498a;
    }

    /* renamed from: a */
    public void mo42020a(C4377bz bzVar) {
        this.f5499b.add(bzVar);
    }

    /* renamed from: a */
    public void mo42014a() {
        for (C4377bz a : this.f5499b) {
            a.mo42014a();
        }
    }

    /* renamed from: b */
    public void mo42018b() {
        for (C4377bz b : this.f5499b) {
            b.mo42018b();
        }
    }

    /* renamed from: a */
    public void mo42015a(String str) {
        for (C4377bz a : this.f5499b) {
            a.mo42015a(str);
        }
    }

    /* renamed from: a */
    public void mo42017a(String str, Map<String, Object> map) {
        for (C4377bz a : this.f5499b) {
            a.mo42017a(str, map);
        }
    }

    /* renamed from: a */
    public void mo42016a(String str, Throwable th) {
        for (C4377bz a : this.f5499b) {
            a.mo42016a(str, th);
        }
    }
}
