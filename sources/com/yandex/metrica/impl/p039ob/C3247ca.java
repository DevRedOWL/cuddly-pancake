package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.yandex.metrica.C3091d;
import com.yandex.metrica.C3093f;
import com.yandex.metrica.C4297j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ca */
class C3247ca {

    /* renamed from: a */
    private Context f2826a;

    /* renamed from: b */
    private C3370ee f2827b;

    /* renamed from: c */
    private C3251cd f2828c;

    /* renamed from: d */
    private Handler f2829d;

    /* renamed from: e */
    private C4135uf f2830e;

    /* renamed from: f */
    private Map<String, C3091d> f2831f = new HashMap();

    /* renamed from: g */
    private final C4289yk<String> f2832g = new C4285yg(new C4291ym(this.f2831f));

    /* renamed from: h */
    private final List<String> f2833h = Arrays.asList(new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});

    public C3247ca(Context context, C3370ee eeVar, C3251cd cdVar, Handler handler, C4135uf ufVar) {
        this.f2826a = context;
        this.f2827b = eeVar;
        this.f2828c = cdVar;
        this.f2829d = handler;
        this.f2830e = ufVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3152ax mo39756a(C4297j jVar, boolean z) {
        this.f2832g.mo40671a(jVar.apiKey);
        C3152ax axVar = new C3152ax(this.f2826a, this.f2827b, jVar, this.f2828c, this.f2830e, new C3248cb(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C3248cb(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"));
        m2533a((C3723n) axVar);
        axVar.mo39534a(jVar, z);
        axVar.mo40654a();
        this.f2828c.mo39766a(axVar);
        this.f2831f.put(jVar.apiKey, axVar);
        return axVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo39757a(C3093f fVar) {
        if (this.f2831f.containsKey(fVar.apiKey)) {
            C4216vz a = C4206vr.m5906a(fVar.apiKey);
            if (a.mo41688c()) {
                a.mo41685b("Reporter with apiKey=%s already exists.", fVar.apiKey);
            }
        } else {
            mo39758b(fVar);
            Log.i("AppMetrica", "Activate reporter with APIKey " + C3306cx.m2866b(fVar.apiKey));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C3091d mo39758b(C3093f fVar) {
        C3155ay ayVar;
        C3091d dVar = this.f2831f.get(fVar.apiKey);
        ayVar = dVar;
        if (dVar == null) {
            if (!this.f2833h.contains(fVar.apiKey)) {
                this.f2830e.mo41549c();
            }
            C3155ay ayVar2 = new C3155ay(this.f2826a, this.f2827b, fVar, this.f2828c);
            m2533a((C3723n) ayVar2);
            ayVar2.mo40654a();
            this.f2831f.put(fVar.apiKey, ayVar2);
            ayVar = ayVar2;
        }
        return ayVar;
    }

    /* renamed from: a */
    private void m2533a(C3723n nVar) {
        nVar.mo40656a(new C3147at(this.f2829d, nVar));
        nVar.mo40657a((C4139ug) this.f2830e);
    }
}
