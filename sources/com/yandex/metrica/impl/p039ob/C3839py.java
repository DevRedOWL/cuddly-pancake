package com.yandex.metrica.impl.p039ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.py */
public class C3839py implements C3830pp {

    /* renamed from: a */
    private Set<String> f4087a;

    public C3839py(List<C3835pu> list) {
        if (list == null) {
            this.f4087a = new HashSet();
            return;
        }
        this.f4087a = new HashSet(list.size());
        for (C3835pu next : list) {
            if (next.f4083b) {
                this.f4087a.add(next.f4082a);
            }
        }
    }

    /* renamed from: a */
    public boolean mo40843a(String str) {
        return this.f4087a.contains(str);
    }

    public String toString() {
        return "StartupBasedPermissionStrategy{mEnabledPermissions=" + this.f4087a + '}';
    }
}
