package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3125af;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.nu */
public class C3757nu implements C3758nv, C3759nw {

    /* renamed from: a */
    private final Set<Integer> f3891a = new HashSet();

    /* renamed from: b */
    private AtomicLong f3892b;

    public C3757nu(C3621kz kzVar) {
        this.f3891a.add(Integer.valueOf(C3125af.C3126a.EVENT_TYPE_FIRST_ACTIVATION.mo39462a()));
        this.f3891a.add(Integer.valueOf(C3125af.C3126a.EVENT_TYPE_APP_UPDATE.mo39462a()));
        this.f3891a.add(Integer.valueOf(C3125af.C3126a.EVENT_TYPE_INIT.mo39462a()));
        this.f3891a.add(Integer.valueOf(C3125af.C3126a.EVENT_TYPE_IDENTITY.mo39462a()));
        this.f3891a.add(Integer.valueOf(C3125af.C3126a.EVENT_TYPE_SEND_REFERRER.mo39462a()));
        kzVar.mo40405a((C3759nw) this);
        this.f3892b = new AtomicLong(kzVar.mo40398a(this.f3891a));
    }

    /* renamed from: a */
    public boolean mo40727a() {
        return this.f3892b.get() > 0;
    }

    /* renamed from: a */
    public void mo40726a(List<Integer> list) {
        int i = 0;
        for (Integer intValue : list) {
            if (this.f3891a.contains(Integer.valueOf(intValue.intValue()))) {
                i++;
            }
        }
        this.f3892b.addAndGet((long) i);
    }

    /* renamed from: b */
    public void mo40728b(List<Integer> list) {
        int i = 0;
        for (Integer intValue : list) {
            if (this.f3891a.contains(Integer.valueOf(intValue.intValue()))) {
                i++;
            }
        }
        this.f3892b.addAndGet((long) (-i));
    }
}
