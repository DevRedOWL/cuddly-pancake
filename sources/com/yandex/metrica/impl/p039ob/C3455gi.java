package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3373eg;
import com.yandex.metrica.impl.p039ob.C4039sn;
import com.yandex.metrica.impl.p039ob.C4047sq;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gi */
public class C3455gi extends C4047sq {

    /* renamed from: a */
    private List<String> f3305a;

    /* renamed from: b */
    private String f3306b;

    /* renamed from: c */
    private Boolean f3307c;

    /* renamed from: a */
    public List<String> mo40139a() {
        return this.f3305a;
    }

    /* renamed from: a */
    public void mo40142a(List<String> list) {
        this.f3305a = list;
    }

    /* renamed from: b */
    public String mo40143b() {
        return this.f3306b;
    }

    /* renamed from: a */
    public void mo40141a(String str) {
        this.f3306b = str;
    }

    /* renamed from: c */
    public Boolean mo40144c() {
        return this.f3307c;
    }

    /* renamed from: a */
    public void mo40140a(Boolean bool) {
        this.f3307c = bool;
    }

    public String toString() {
        return "DiagnosticRequestConfig{mDiagnosticHosts=" + this.f3305a + ", mApiKey='" + this.f3306b + '\'' + ", statisticsSending=" + this.f3307c + '}';
    }

    /* renamed from: com.yandex.metrica.impl.ob.gi$a */
    public static final class C3456a extends C4039sn.C4040a<C3373eg.C3374a, C3456a> {

        /* renamed from: a */
        public final String f3308a;

        /* renamed from: b */
        public final boolean f3309b;

        public C3456a(String str, String str2, String str3, String str4, Boolean bool) {
            super(str, str2, str3);
            this.f3308a = str4;
            this.f3309b = C4232wk.m6040a(bool, true);
        }

        public C3456a(C3373eg.C3374a aVar) {
            this(aVar.f3107a, aVar.f3108b, aVar.f3109c, aVar.f3110d, aVar.f3119m);
        }

        /* renamed from: a */
        public C3456a mo39973b(C3373eg.C3374a aVar) {
            return new C3456a((String) C4232wk.m6038a(aVar.f3107a, this.f4778c), (String) C4232wk.m6038a(aVar.f3108b, this.f4779d), (String) C4232wk.m6038a(aVar.f3109c, this.f4780e), C4232wk.m6042b(aVar.f3110d, this.f3308a), (Boolean) C4232wk.m6038a(aVar.f3119m, Boolean.valueOf(this.f3309b)));
        }

        /* renamed from: b */
        public boolean mo39972a(C3373eg.C3374a aVar) {
            if (aVar.f3107a != null && !aVar.f3107a.equals(this.f4778c)) {
                return false;
            }
            if (aVar.f3108b != null && !aVar.f3108b.equals(this.f4779d)) {
                return false;
            }
            if (aVar.f3109c != null && !aVar.f3109c.equals(this.f4780e)) {
                return false;
            }
            if (aVar.f3110d == null || aVar.f3110d.equals(this.f3308a)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gi$b */
    public static class C3457b extends C4047sq.C4048a<C3455gi, C3456a> {
        public C3457b(Context context, String str) {
            super(context, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C3455gi mo40151b() {
            return new C3455gi();
        }

        /* renamed from: a */
        public C3455gi mo40153c(C4039sn.C4042c<C3456a> cVar) {
            C3455gi giVar = (C3455gi) super.mo40153c(cVar);
            giVar.mo40142a(cVar.f4783a.f5098l);
            giVar.mo40141a(((C3456a) cVar.f4784b).f3308a);
            giVar.mo40140a(Boolean.valueOf(((C3456a) cVar.f4784b).f3309b));
            return giVar;
        }
    }
}
