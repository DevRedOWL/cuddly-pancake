package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.yandex.metrica.impl.p039ob.C3807p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ux */
class C4170ux extends C4154ut implements C3807p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TelephonyManager f5181a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public PhoneStateListener f5182b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f5183c;

    /* renamed from: d */
    private C4143uk f5184d;

    /* renamed from: e */
    private final C3807p.C3808a<C4193vf> f5185e;

    /* renamed from: f */
    private final C3807p.C3808a<C4155uu[]> f5186f;

    /* renamed from: g */
    private final C4257xh f5187g;

    /* renamed from: h */
    private final Context f5188h;

    /* renamed from: i */
    private final C4162uw f5189i;

    /* renamed from: j */
    private final C4186vc f5190j;

    /* renamed from: k */
    private final C4176uz f5191k;

    /* renamed from: l */
    private final C3838px f5192l;

    /* renamed from: m */
    private C3832pr f5193m;

    protected C4170ux(Context context, C4257xh xhVar) {
        this(context, new C3838px(), xhVar);
    }

    protected C4170ux(Context context, C3838px pxVar, C4257xh xhVar) {
        this(context, pxVar, new C3832pr(pxVar.mo40869a()), xhVar);
    }

    protected C4170ux(Context context, C3838px pxVar, C3832pr prVar, C4257xh xhVar) {
        TelephonyManager telephonyManager;
        this.f5183c = false;
        this.f5185e = new C3807p.C3808a<>();
        this.f5186f = new C3807p.C3808a<>();
        this.f5188h = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.f5181a = telephonyManager;
        this.f5187g = xhVar;
        this.f5187g.mo41808a((Runnable) new Runnable() {
            public void run() {
                C4170ux uxVar = C4170ux.this;
                PhoneStateListener unused = uxVar.f5182b = new C4174a();
            }
        });
        this.f5189i = new C4162uw(this, prVar);
        this.f5190j = new C4186vc(this, prVar);
        this.f5191k = new C4176uz(this, prVar);
        this.f5192l = pxVar;
        this.f5193m = prVar;
    }

    /* renamed from: a */
    public synchronized void mo41644a() {
        this.f5187g.mo41808a((Runnable) new Runnable() {
            public void run() {
                if (!C4170ux.this.f5183c) {
                    boolean unused = C4170ux.this.f5183c = true;
                    if (C4170ux.this.f5182b != null && C4170ux.this.f5181a != null) {
                        try {
                            C4170ux.this.f5181a.listen(C4170ux.this.f5182b, 256);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public synchronized void mo41645b() {
        this.f5187g.mo41808a((Runnable) new Runnable() {
            public void run() {
                if (C4170ux.this.f5183c) {
                    boolean unused = C4170ux.this.f5183c = false;
                    C3350dr.m3043a().mo39929a((Object) C4170ux.this);
                    if (C4170ux.this.f5182b != null && C4170ux.this.f5181a != null) {
                        try {
                            C4170ux.this.f5181a.listen(C4170ux.this.f5182b, 0);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo41617a(C4194vg vgVar) {
        if (vgVar != null) {
            vgVar.mo39414a(mo41648e());
        }
    }

    /* renamed from: a */
    public synchronized void mo41616a(C4161uv uvVar) {
        if (uvVar != null) {
            uvVar.mo40761a(m5764j());
        }
    }

    /* renamed from: c */
    public TelephonyManager mo41646c() {
        return this.f5181a;
    }

    /* renamed from: d */
    public Context mo41647d() {
        return this.f5188h;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ux$a */
    private class C4174a extends PhoneStateListener {
        private C4174a() {
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            C4170ux.this.m5763c(signalStrength);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized C4193vf mo41648e() {
        C4193vf vfVar;
        C4155uu b;
        if (!this.f5185e.mo40826b()) {
            if (!this.f5185e.mo40827c()) {
                vfVar = this.f5185e.mo40823a();
            }
        }
        vfVar = new C4193vf(this.f5189i, this.f5190j, this.f5191k);
        C4155uu b2 = vfVar.mo41675b();
        if (b2 != null && b2.mo41619a() == null && !this.f5185e.mo40826b() && (b = this.f5185e.mo40823a().mo41675b()) != null) {
            vfVar.mo41675b().mo41620a(b.mo41619a());
        }
        this.f5185e.mo40824a(vfVar);
        return vfVar;
    }

    /* renamed from: j */
    private synchronized C4155uu[] m5764j() {
        C4155uu[] uuVarArr;
        if (!this.f5186f.mo40826b()) {
            if (!this.f5186f.mo40827c()) {
                uuVarArr = this.f5186f.mo40823a();
            }
        }
        uuVarArr = mo41649f();
        this.f5186f.mo40824a(uuVarArr);
        return uuVarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C4155uu[] mo41649f() {
        ArrayList arrayList = new ArrayList();
        if (C3306cx.m2857a(17) && this.f5193m.mo40853a(this.f5188h)) {
            try {
                List<CellInfo> allCellInfo = this.f5181a.getAllCellInfo();
                if (!C3306cx.m2861a((Collection) allCellInfo)) {
                    for (int i = 0; i < allCellInfo.size(); i++) {
                        C4155uu a = m5756a(allCellInfo.get(i));
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (arrayList.size() >= 1) {
            return (C4155uu[]) arrayList.toArray(new C4155uu[arrayList.size()]);
        }
        C4155uu b = mo41648e().mo41675b();
        if (b == null) {
            return new C4155uu[0];
        }
        return new C4155uu[]{b};
    }

    /* renamed from: a */
    private C4155uu m5756a(CellInfo cellInfo) {
        return C4155uu.m5709a(cellInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m5763c(SignalStrength signalStrength) {
        C4155uu b;
        if (!this.f5185e.mo40826b() && !this.f5185e.mo40827c() && (b = this.f5185e.mo40823a().mo41675b()) != null) {
            b.mo41620a(Integer.valueOf(m5754a(signalStrength)));
        }
    }

    /* renamed from: a */
    static int m5754a(SignalStrength signalStrength) {
        if (signalStrength.isGsm()) {
            return m5760b(signalStrength);
        }
        int cdmaDbm = signalStrength.getCdmaDbm();
        int evdoDbm = signalStrength.getEvdoDbm();
        if (-120 == evdoDbm) {
            return cdmaDbm;
        }
        return -120 == cdmaDbm ? evdoDbm : Math.min(cdmaDbm, evdoDbm);
    }

    /* renamed from: b */
    static int m5760b(SignalStrength signalStrength) {
        int gsmSignalStrength = signalStrength.getGsmSignalStrength();
        if (99 == gsmSignalStrength) {
            return -1;
        }
        return (gsmSignalStrength * 2) - 113;
    }

    /* renamed from: k */
    private synchronized boolean m5765k() {
        return this.f5184d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized boolean mo41650g() {
        return m5765k() && this.f5184d.f5101o.f5008o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized boolean mo41651h() {
        return m5765k() && this.f5184d.f5101o.f5007n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean mo41652i() {
        return m5765k() && this.f5184d.f5101o.f5006m;
    }

    /* renamed from: a */
    public void mo41615a(C4143uk ukVar) {
        this.f5184d = ukVar;
        this.f5192l.mo40870a(ukVar);
        this.f5193m.mo40852a(this.f5192l.mo40869a());
    }

    /* renamed from: a */
    public void mo41618a(boolean z) {
        this.f5192l.mo40871a(z);
        this.f5193m.mo40852a(this.f5192l.mo40869a());
    }
}
