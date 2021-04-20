package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3884rh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pf */
public class C3815pf {

    /* renamed from: a */
    private final C3633lh f4060a;

    /* renamed from: b */
    private final C3632lg f4061b;

    /* renamed from: c */
    private final C3812pc f4062c;

    /* renamed from: d */
    private final C3809pa f4063d;

    public C3815pf(Context context) {
        this(C3628ld.m3815a(context).mo40445g(), C3628ld.m3815a(context).mo40446h(), new C3773og(context), new C3810pb(), new C3806oz());
    }

    /* renamed from: a */
    public C3814pe mo40833a(int i) {
        Map<Long, String> b = this.f4060a.mo40386b(i);
        Map<Long, String> b2 = this.f4061b.mo40386b(i);
        C3884rh.C3886b bVar = new C3884rh.C3886b();
        bVar.f4258b = m4472a(b);
        bVar.f4259c = m4473b(b2);
        return new C3814pe(b.isEmpty() ? -1 : ((Long) Collections.max(b.keySet())).longValue(), b2.isEmpty() ? -1 : ((Long) Collections.max(b2.keySet())).longValue(), bVar);
    }

    /* renamed from: a */
    public void mo40834a(C3814pe peVar) {
        if (peVar.f4057a >= 0) {
            this.f4060a.mo40384b(peVar.f4057a);
        }
        if (peVar.f4058b >= 0) {
            this.f4061b.mo40384b(peVar.f4058b);
        }
    }

    /* renamed from: a */
    private C3884rh.C3886b.C3888b[] m4472a(Map<Long, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            C3884rh.C3886b.C3888b a = this.f4062c.mo40831a(((Long) next.getKey()).longValue(), (String) next.getValue());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (C3884rh.C3886b.C3888b[]) arrayList.toArray(new C3884rh.C3886b.C3888b[arrayList.size()]);
    }

    /* renamed from: b */
    private C3884rh.C3886b.C3887a[] m4473b(Map<Long, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            C3884rh.C3886b.C3887a a = this.f4063d.mo40829a(((Long) next.getKey()).longValue(), (String) next.getValue());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (C3884rh.C3886b.C3887a[]) arrayList.toArray(new C3884rh.C3886b.C3887a[arrayList.size()]);
    }

    C3815pf(C3633lh lhVar, C3632lg lgVar, C3773og ogVar, C3810pb pbVar, C3806oz ozVar) {
        this(lhVar, lgVar, new C3812pc(ogVar, pbVar), new C3809pa(ogVar, ozVar));
    }

    C3815pf(C3633lh lhVar, C3632lg lgVar, C3812pc pcVar, C3809pa paVar) {
        this.f4060a = lhVar;
        this.f4061b = lgVar;
        this.f4062c = pcVar;
        this.f4063d = paVar;
    }
}
