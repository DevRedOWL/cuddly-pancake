package com.yandex.metrica.impl.p039ob;

import android.util.Pair;
import com.yandex.metrica.impl.p039ob.C3292cq;
import com.yandex.metrica.impl.p039ob.C3929rr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nb */
public class C3728nb implements C3718mv<C3292cq.C3294a, C3929rr.C3930a.C3944h> {

    /* renamed from: a */
    private static final Map<Integer, C3292cq.C3294a.C3295a> f3839a = Collections.unmodifiableMap(new HashMap<Integer, C3292cq.C3294a.C3295a>() {
        {
            put(1, C3292cq.C3294a.C3295a.WIFI);
            put(2, C3292cq.C3294a.C3295a.CELL);
        }
    });

    /* renamed from: b */
    private static final Map<C3292cq.C3294a.C3295a, Integer> f3840b = Collections.unmodifiableMap(new HashMap<C3292cq.C3294a.C3295a, Integer>() {
        {
            put(C3292cq.C3294a.C3295a.WIFI, 1);
            put(C3292cq.C3294a.C3295a.CELL, 2);
        }
    });

    /* renamed from: a */
    public C3929rr.C3930a.C3944h mo40225b(C3292cq.C3294a aVar) {
        C3929rr.C3930a.C3944h hVar = new C3929rr.C3930a.C3944h();
        hVar.f4527b = aVar.f2924a;
        hVar.f4528c = aVar.f2925b;
        hVar.f4529d = aVar.f2926c;
        hVar.f4530e = m4204a(aVar.f2927d);
        hVar.f4531f = aVar.f2928e == null ? 0 : aVar.f2928e.longValue();
        hVar.f4532g = m4205b(aVar.f2929f);
        return hVar;
    }

    /* renamed from: a */
    public C3292cq.C3294a mo40224a(C3929rr.C3930a.C3944h hVar) {
        return new C3292cq.C3294a(hVar.f4527b, hVar.f4528c, hVar.f4529d, m4203a(hVar.f4530e), Long.valueOf(hVar.f4531f), m4202a(hVar.f4532g));
    }

    /* renamed from: a */
    private C3929rr.C3930a.C3944h.C3945a[] m4204a(List<Pair<String, String>> list) {
        C3929rr.C3930a.C3944h.C3945a[] aVarArr = new C3929rr.C3930a.C3944h.C3945a[list.size()];
        int i = 0;
        for (Pair next : list) {
            C3929rr.C3930a.C3944h.C3945a aVar = new C3929rr.C3930a.C3944h.C3945a();
            aVar.f4534b = (String) next.first;
            aVar.f4535c = (String) next.second;
            aVarArr[i] = aVar;
            i++;
        }
        return aVarArr;
    }

    /* renamed from: a */
    private List<Pair<String, String>> m4203a(C3929rr.C3930a.C3944h.C3945a[] aVarArr) {
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C3929rr.C3930a.C3944h.C3945a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.f4534b, aVar.f4535c));
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C3292cq.C3294a.C3295a> m4202a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(f3839a.get(Integer.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* renamed from: b */
    private int[] m4205b(List<C3292cq.C3294a.C3295a> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = f3840b.get(list.get(i)).intValue();
        }
        return iArr;
    }
}
