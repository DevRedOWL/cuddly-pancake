package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C4039sn;
import com.yandex.metrica.impl.p039ob.C4047sq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.su */
public class C4056su extends C4047sq {

    /* renamed from: a */
    private List<String> f4848a;

    /* renamed from: b */
    private List<String> f4849b;

    /* renamed from: c */
    private String f4850c;

    /* renamed from: d */
    private Map<String, String> f4851d;

    /* renamed from: e */
    private List<String> f4852e;

    /* renamed from: f */
    private boolean f4853f;

    /* renamed from: g */
    private boolean f4854g;

    /* renamed from: h */
    private String f4855h;

    /* renamed from: i */
    private long f4856i;

    private C4056su() {
        this.f4856i = 0;
    }

    /* renamed from: a */
    public List<String> mo41392a() {
        ArrayList arrayList = new ArrayList();
        if (!C3306cx.m2861a((Collection) this.f4848a)) {
            arrayList.addAll(this.f4848a);
        }
        if (!C3306cx.m2861a((Collection) this.f4849b)) {
            arrayList.addAll(this.f4849b);
        }
        arrayList.add("https://startup.mobile.yandex.net/");
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo41401b() {
        return this.f4854g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41397a(boolean z) {
        this.f4854g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41393a(long j) {
        if (this.f4856i == 0) {
            this.f4856i = j;
        }
    }

    /* renamed from: c */
    public long mo41402c() {
        return this.f4856i;
    }

    /* renamed from: b */
    public long mo41398b(long j) {
        mo41393a(j);
        return mo41402c();
    }

    /* renamed from: F */
    public List<String> mo41386F() {
        return this.f4849b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41395a(List<String> list) {
        this.f4849b = list;
    }

    /* renamed from: G */
    public Map<String, String> mo41387G() {
        return this.f4851d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41396a(Map<String, String> map) {
        this.f4851d = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41399b(List<String> list) {
        this.f4848a = list;
    }

    /* renamed from: H */
    public String mo41388H() {
        return this.f4850c;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m5368m(String str) {
        this.f4850c = str;
    }

    /* renamed from: I */
    public List<String> mo41389I() {
        return this.f4852e;
    }

    /* renamed from: c */
    public void mo41403c(List<String> list) {
        this.f4852e = list;
    }

    /* renamed from: J */
    public boolean mo41390J() {
        return this.f4853f;
    }

    /* renamed from: b */
    public void mo41400b(boolean z) {
        this.f4853f = z;
    }

    /* renamed from: K */
    public String mo41391K() {
        return this.f4855h;
    }

    /* renamed from: a */
    public void mo41394a(String str) {
        this.f4855h = str;
    }

    public String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f4848a + ", mStartupHostsFromClient=" + this.f4849b + ", mDistributionReferrer='" + this.f4850c + '\'' + ", mClidsFromClient=" + this.f4851d + ", mNewCustomHosts=" + this.f4852e + ", mHasNewCustomHosts=" + this.f4853f + ", mSuccessfulStartup=" + this.f4854g + ", mCountryInit='" + this.f4855h + '\'' + ", mFirstStartupTime='" + this.f4856i + '\'' + '}';
    }

    /* renamed from: com.yandex.metrica.impl.ob.su$a */
    public static class C4058a extends C4039sn.C4040a<C4058a, C4058a> implements C4038sm<C4058a, C4058a> {

        /* renamed from: a */
        public final String f4857a;

        /* renamed from: b */
        public final Map<String, String> f4858b;

        /* renamed from: f */
        public final boolean f4859f;

        /* renamed from: g */
        public final List<String> f4860g;

        /* renamed from: d */
        public boolean mo39972a(C4058a aVar) {
            return false;
        }

        public C4058a(C3369ed edVar) {
            this(edVar.mo39947h().mo39237d(), edVar.mo39947h().mo39246g(), edVar.mo39947h().mo39248h(), edVar.mo39946g().mo39957d(), edVar.mo39946g().mo39956c(), edVar.mo39946g().mo39953a(), edVar.mo39946g().mo39954b());
        }

        public C4058a(String str, String str2, String str3, String str4, Map<String, String> map, boolean z, List<String> list) {
            super(str, str2, str3);
            this.f4857a = str4;
            this.f4858b = map;
            this.f4859f = z;
            this.f4860g = list;
        }

        public C4058a() {
            this((String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo41404a(C4058a aVar) {
            boolean z = aVar.f4859f;
            return z ? z : this.f4859f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<String> mo41405b(C4058a aVar) {
            return aVar.f4859f ? aVar.f4860g : this.f4860g;
        }

        /* renamed from: c */
        public C4058a mo39973b(C4058a aVar) {
            return new C4058a((String) C4232wk.m6038a(this.f4778c, aVar.f4778c), (String) C4232wk.m6038a(this.f4779d, aVar.f4779d), (String) C4232wk.m6038a(this.f4780e, aVar.f4780e), (String) C4232wk.m6038a(this.f4857a, aVar.f4857a), (Map) C4232wk.m6038a(this.f4858b, aVar.f4858b), mo41404a(aVar), mo41405b(aVar));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.su$b */
    public static class C4059b extends C4047sq.C4048a<C4056su, C4058a> {
        public C4059b(Context context, String str) {
            super(context, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C4056su mo40151b() {
            return new C4056su();
        }

        /* renamed from: a */
        public C4056su mo40153c(C4039sn.C4042c<C4058a> cVar) {
            C4056su suVar = (C4056su) super.mo40153c(cVar);
            mo41409a(suVar, cVar.f4783a);
            suVar.m5368m(C4232wk.m6042b(((C4058a) cVar.f4784b).f4857a, cVar.f4783a.f5105s));
            suVar.mo41396a(((C4058a) cVar.f4784b).f4858b);
            suVar.mo41400b(((C4058a) cVar.f4784b).f4859f);
            suVar.mo41403c(((C4058a) cVar.f4784b).f4860g);
            suVar.mo41397a(cVar.f4783a.f5107u);
            suVar.mo41394a(cVar.f4783a.f5110x);
            suVar.mo41393a(cVar.f4783a.f5084E);
            return suVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo41409a(C4056su suVar, C4143uk ukVar) {
            suVar.mo41399b(ukVar.f5096j);
            suVar.mo41395a(ukVar.f5097k);
        }
    }
}
