package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3926rq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.nd */
public class C3732nd implements C3713mq<C4076te, C3926rq.C3927a> {
    /* renamed from: a */
    public C3926rq.C3927a mo40225b(C4076te teVar) {
        C3926rq.C3927a aVar = new C3926rq.C3927a();
        aVar.f4423b = new C3926rq.C3927a.C3928a[teVar.f4903a.size()];
        for (int i = 0; i < teVar.f4903a.size(); i++) {
            aVar.f4423b[i] = m4214a(teVar.f4903a.get(i));
        }
        aVar.f4424c = teVar.f4904b;
        aVar.f4425d = teVar.f4905c;
        aVar.f4426e = teVar.f4906d;
        aVar.f4427f = teVar.f4907e;
        return aVar;
    }

    /* renamed from: a */
    public C4076te mo40224a(C3926rq.C3927a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f4423b.length);
        for (C3926rq.C3927a.C3928a a : aVar.f4423b) {
            arrayList.add(m4215a(a));
        }
        return new C4076te(arrayList, aVar.f4424c, aVar.f4425d, aVar.f4426e, aVar.f4427f);
    }

    /* renamed from: a */
    private C3926rq.C3927a.C3928a m4214a(C4079th thVar) {
        C3926rq.C3927a.C3928a aVar = new C3926rq.C3927a.C3928a();
        aVar.f4429b = thVar.f4911a;
        List<String> list = thVar.f4912b;
        aVar.f4430c = new String[list.size()];
        int i = 0;
        for (String str : list) {
            aVar.f4430c[i] = str;
            i++;
        }
        return aVar;
    }

    /* renamed from: a */
    private C4079th m4215a(C3926rq.C3927a.C3928a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar.f4430c != null && aVar.f4430c.length > 0) {
            arrayList = new ArrayList(aVar.f4430c.length);
            for (String add : aVar.f4430c) {
                arrayList.add(add);
            }
        }
        return new C4079th(C3303cu.m2820a(aVar.f4429b), arrayList);
    }
}
