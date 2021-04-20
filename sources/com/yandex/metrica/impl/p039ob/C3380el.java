package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3430fp;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.impl.ob.el */
public class C3380el<CU extends C3430fp> {

    /* renamed from: a */
    private final List<CU> f3142a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo40000a(CU cu) {
        this.f3142a.add(cu);
    }

    /* renamed from: b */
    public void mo40001b(CU cu) {
        this.f3142a.remove(cu);
    }

    /* renamed from: a */
    public List<CU> mo39999a() {
        return this.f3142a;
    }
}
