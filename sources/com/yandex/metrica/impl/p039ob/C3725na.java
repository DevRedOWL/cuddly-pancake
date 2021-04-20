package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3213bt;
import com.yandex.metrica.impl.p039ob.C3922rp;
import com.yandex.metrica.impl.p039ob.C3949rs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.na */
public class C3725na implements C3718mv<C3949rs.C3954a, C3922rp.C3923a> {

    /* renamed from: a */
    private static final Map<Integer, C3213bt.C3220a> f3837a = Collections.unmodifiableMap(new HashMap<Integer, C3213bt.C3220a>() {
        {
            put(1, C3213bt.C3220a.WIFI);
            put(2, C3213bt.C3220a.CELL);
        }
    });

    /* renamed from: b */
    private static final Map<C3213bt.C3220a, Integer> f3838b = Collections.unmodifiableMap(new HashMap<C3213bt.C3220a, Integer>() {
        {
            put(C3213bt.C3220a.WIFI, 1);
            put(C3213bt.C3220a.CELL, 2);
        }
    });

    /* renamed from: a */
    public C3922rp.C3923a mo40225b(C3949rs.C3954a aVar) {
        C3922rp.C3923a aVar2 = new C3922rp.C3923a();
        Set<String> a = aVar.mo41108a();
        aVar2.f4412c = (String[]) a.toArray(new String[a.size()]);
        aVar2.f4411b = m4197b(aVar);
        return aVar2;
    }

    /* renamed from: a */
    public C3949rs.C3954a mo40224a(C3922rp.C3923a aVar) {
        return new C3949rs.C3954a(m4195b(aVar), Arrays.asList(aVar.f4412c));
    }

    /* renamed from: b */
    private List<C3949rs.C3954a.C3955a> m4195b(C3922rp.C3923a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C3922rp.C3923a.C3924a aVar2 : aVar.f4411b) {
            arrayList.add(new C3949rs.C3954a.C3955a(aVar2.f4414b, aVar2.f4415c, aVar2.f4416d, m4192a(aVar2.f4417e), aVar2.f4418f, m4193a(aVar2.f4419g)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C4237wp<String, String> m4192a(C3922rp.C3923a.C3924a.C3925a[] aVarArr) {
        C4237wp<String, String> wpVar = new C4237wp<>();
        for (C3922rp.C3923a.C3924a.C3925a aVar : aVarArr) {
            wpVar.mo41775a(aVar.f4421b, aVar.f4422c);
        }
        return wpVar;
    }

    /* renamed from: b */
    private C3922rp.C3923a.C3924a[] m4197b(C3949rs.C3954a aVar) {
        List<C3949rs.C3954a.C3955a> b = aVar.mo41110b();
        C3922rp.C3923a.C3924a[] aVarArr = new C3922rp.C3923a.C3924a[b.size()];
        for (int i = 0; i < b.size(); i++) {
            aVarArr[i] = m4191a(b.get(i));
        }
        return aVarArr;
    }

    /* renamed from: a */
    private C3922rp.C3923a.C3924a m4191a(C3949rs.C3954a.C3955a aVar) {
        C3922rp.C3923a.C3924a aVar2 = new C3922rp.C3923a.C3924a();
        aVar2.f4414b = aVar.f4563a;
        aVar2.f4415c = aVar.f4564b;
        aVar2.f4417e = m4196b(aVar);
        aVar2.f4416d = aVar.f4565c;
        aVar2.f4418f = aVar.f4567e;
        aVar2.f4419g = m4194a(aVar.f4568f);
        return aVar2;
    }

    /* renamed from: b */
    private C3922rp.C3923a.C3924a.C3925a[] m4196b(C3949rs.C3954a.C3955a aVar) {
        C3922rp.C3923a.C3924a.C3925a[] aVarArr = new C3922rp.C3923a.C3924a.C3925a[aVar.f4566d.mo41773a()];
        int i = 0;
        for (Map.Entry entry : aVar.f4566d.mo41778b()) {
            for (String str : (Collection) entry.getValue()) {
                C3922rp.C3923a.C3924a.C3925a aVar2 = new C3922rp.C3923a.C3924a.C3925a();
                aVar2.f4421b = (String) entry.getKey();
                aVar2.f4422c = str;
                aVarArr[i] = aVar2;
                i++;
            }
        }
        return aVarArr;
    }

    /* renamed from: a */
    private List<C3213bt.C3220a> m4193a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(f3837a.get(Integer.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private int[] m4194a(List<C3213bt.C3220a> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = f3838b.get(list.get(i)).intValue();
        }
        return iArr;
    }
}
