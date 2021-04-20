package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3125af;
import com.yandex.metrica.impl.p039ob.C3459gk;
import com.yandex.metrica.impl.p039ob.C3884rh;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.gh */
public class C3452gh {

    /* renamed from: a */
    public static final Map<Integer, Integer> f3297a = Collections.unmodifiableMap(new HashMap<Integer, Integer>() {
        {
            put(Integer.valueOf(C3125af.C3126a.EVENT_TYPE_DIAGNOSTIC.mo39462a()), 22);
            put(Integer.valueOf(C3125af.C3126a.EVENT_TYPE_DIAGNOSTIC_STATBOX.mo39462a()), 23);
            put(Integer.valueOf(C3125af.C3126a.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.mo39462a()), 24);
        }
    });

    /* renamed from: b */
    private final C4217w f3298b;

    /* renamed from: c */
    private final C3455gi f3299c;

    /* renamed from: d */
    private final C3459gk f3300d;

    /* renamed from: e */
    private final C4274xy f3301e;

    /* renamed from: f */
    private final C4274xy f3302f;

    /* renamed from: g */
    private final C4228wh f3303g;

    /* renamed from: h */
    private final C3400er f3304h;

    /* renamed from: com.yandex.metrica.impl.ob.gh$a */
    public static class C3454a {
        /* renamed from: a */
        public C3452gh mo40138a(C4217w wVar, C3455gi giVar, C3459gk gkVar, C3688lw lwVar) {
            return new C3452gh(wVar, giVar, gkVar, lwVar);
        }
    }

    public C3452gh(C4217w wVar, C3455gi giVar, C3459gk gkVar, C3688lw lwVar) {
        this(wVar, giVar, gkVar, new C3400er(lwVar), new C4274xy(1024, "diagnostic event name"), new C4274xy(204800, "diagnostic event value"), new C4227wg());
    }

    public C3452gh(C4217w wVar, C3455gi giVar, C3459gk gkVar, C3400er erVar, C4274xy xyVar, C4274xy xyVar2, C4228wh whVar) {
        this.f3298b = wVar;
        this.f3299c = giVar;
        this.f3300d = gkVar;
        this.f3304h = erVar;
        this.f3302f = xyVar;
        this.f3301e = xyVar2;
        this.f3303g = whVar;
    }

    /* renamed from: a */
    public byte[] mo40137a() {
        C3884rh.C3889c cVar = new C3884rh.C3889c();
        C3884rh.C3889c.C3895e eVar = new C3884rh.C3889c.C3895e();
        int i = 0;
        cVar.f4279b = new C3884rh.C3889c.C3895e[]{eVar};
        C3459gk.C3460a a = this.f3300d.mo40154a();
        eVar.f4319b = a.f3313a;
        eVar.f4320c = new C3884rh.C3889c.C3895e.C3900b();
        eVar.f4320c.f4351d = 2;
        eVar.f4320c.f4349b = new C3884rh.C3889c.C3902g();
        eVar.f4320c.f4349b.f4358b = a.f3314b;
        eVar.f4320c.f4349b.f4359c = C4229wi.m6027a(a.f3314b);
        eVar.f4320c.f4350c = this.f3299c.mo41277A();
        C3884rh.C3889c.C3895e.C3896a aVar = new C3884rh.C3889c.C3895e.C3896a();
        eVar.f4321d = new C3884rh.C3889c.C3895e.C3896a[]{aVar};
        aVar.f4323b = (long) a.f3315c;
        aVar.f4338q = (long) this.f3304h.mo40069a(this.f3298b.mo41736g());
        aVar.f4324c = this.f3303g.mo41769b() - a.f3314b;
        aVar.f4325d = f3297a.get(Integer.valueOf(this.f3298b.mo41736g())).intValue();
        if (!TextUtils.isEmpty(this.f3298b.mo41731d())) {
            aVar.f4326e = this.f3302f.mo41840a(this.f3298b.mo41731d());
        }
        if (!TextUtils.isEmpty(this.f3298b.mo41734e())) {
            String e = this.f3298b.mo41734e();
            String a2 = this.f3301e.mo41840a(e);
            if (!TextUtils.isEmpty(a2)) {
                aVar.f4327f = a2.getBytes();
            }
            int length = e.getBytes().length;
            if (aVar.f4327f != null) {
                i = aVar.f4327f.length;
            }
            aVar.f4332k = length - i;
        }
        return C3365e.m3064a((C3365e) cVar);
    }
}
