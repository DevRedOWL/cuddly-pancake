package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3292cq;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.mobileid.access.key.EncryptedKey;

/* renamed from: com.yandex.metrica.impl.ob.cp */
public class C3291cp implements C3207bn {

    /* renamed from: a */
    private final C4146ul f2918a;

    /* renamed from: b */
    private final C4056su f2919b;

    /* renamed from: c */
    private final C3292cq f2920c;

    /* renamed from: d */
    private final C3711mp f2921d;

    public C3291cp(C4146ul ulVar, C4056su suVar) {
        this(ulVar, suVar, new C3292cq(), new C3711mp());
    }

    /* renamed from: a */
    public boolean mo39454a(int i, byte[] bArr, Map<String, List<String>> map) {
        if (200 != i) {
            return false;
        }
        List list = map.get("Content-Encoding");
        if (!C3306cx.m2861a((Collection) list) && EncryptedKey.DEFAULT_STORAGE_ID.equals(list.get(0))) {
            bArr = this.f2921d.mo40638a(bArr, "hBnBQbZrmjPXEWVJ");
        }
        if (bArr == null) {
            return false;
        }
        C3292cq.C3296b a = this.f2920c.mo39821a(bArr);
        if (C3292cq.C3296b.C3297a.OK != a.mo39836l()) {
            return false;
        }
        this.f2918a.mo41599a(a, this.f2919b, map);
        return true;
    }

    C3291cp(C4146ul ulVar, C4056su suVar, C3292cq cqVar, C3711mp mpVar) {
        this.f2918a = ulVar;
        this.f2919b = suVar;
        this.f2920c = cqVar;
        this.f2921d = mpVar;
    }
}
