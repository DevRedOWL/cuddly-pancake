package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.p039ob.C3125af;
import com.yandex.metrica.impl.p039ob.C3908rl;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.metrica.profile.UserProfileUpdate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.n */
public abstract class C3723n implements C3139an {

    /* renamed from: f */
    private static final Collection<Integer> f3827f = new HashSet(Arrays.asList(new Integer[]{14, 15}));

    /* renamed from: g */
    private static final C4289yk<C3908rl.C3909a> f3828g = new C4289yk<C3908rl.C3909a>() {
        /* renamed from: a */
        public C4287yi mo40671a(C3908rl.C3909a aVar) {
            if (C3306cx.m2864a((T[]) aVar.f4383b)) {
                return C4287yi.m6198a(this, "attributes list is empty");
            }
            return C4287yi.m6197a(this);
        }
    };

    /* renamed from: h */
    private static final C4289yk<Revenue> f3829h = new C4293yo();

    /* renamed from: a */
    protected final Context f3830a;

    /* renamed from: b */
    protected final C3245bz f3831b;

    /* renamed from: c */
    protected C4216vz f3832c = C4206vr.m5906a(this.f3831b.mo39947h().mo39242e());

    /* renamed from: d */
    protected C4203vp f3833d;

    /* renamed from: e */
    protected final C3251cd f3834e;

    /* renamed from: i */
    private C3147at f3835i;

    /* renamed from: j */
    private final C3127ag f3836j;

    C3723n(Context context, C3251cd cdVar, C3245bz bzVar, C3127ag agVar) {
        this.f3830a = context.getApplicationContext();
        this.f3834e = cdVar;
        this.f3831b = bzVar;
        this.f3836j = agVar;
        this.f3831b.mo39747a(new C4273xx(this.f3832c, "Crash Environment"));
        this.f3832c = C4206vr.m5906a(this.f3831b.mo39947h().mo39242e());
        this.f3833d = C4206vr.m5908b(this.f3831b.mo39947h().mo39242e());
        if (C4196vi.m5861a(this.f3831b.mo39947h().mo39250j())) {
            this.f3832c.mo41677a();
            this.f3833d.mo41677a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40654a() {
        this.f3834e.mo39767a(this.f3831b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40657a(C4139ug ugVar) {
        this.f3831b.mo39751b(ugVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40656a(C3147at atVar) {
        this.f3835i = atVar;
    }

    /* renamed from: b */
    public void mo40662b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f3831b.mo39748a(str, str2);
        } else if (this.f3832c.mo41688c()) {
            this.f3832c.mo41685b("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    /* renamed from: a */
    public void mo40659a(Map<String, String> map) {
        if (!C3306cx.m2862a((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                mo40662b((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: b */
    public void mo40663b(Map<String, String> map) {
        if (!C3306cx.m2862a((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                mo40665c((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: c */
    public void mo40665c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f3834e.mo39780a(str, str2, this.f3831b);
        } else if (this.f3832c.mo41688c()) {
            this.f3832c.mo41685b("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    /* renamed from: b */
    public void mo40660b() {
        this.f3834e.mo39785b(this.f3831b);
    }

    public void resumeSession() {
        mo40658a((String) null);
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("Resume session");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40658a(String str) {
        this.f3834e.mo39771a(this);
        this.f3835i.mo39526b();
        this.f3834e.mo39775a(C3125af.m1959d(str, this.f3832c), this.f3831b);
        mo39449a(this.f3831b.mo39753d());
    }

    /* renamed from: a */
    private void mo39449a(boolean z) {
        if (z) {
            this.f3834e.mo39775a(C3125af.m1940a(C3125af.C3126a.EVENT_TYPE_PURGE_BUFFER, this.f3832c), this.f3831b);
        }
    }

    public void pauseSession() {
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("Pause session");
        }
        mo40661b((String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo40661b(String str) {
        if (!this.f3831b.mo39749a()) {
            this.f3834e.mo39786b(this);
            this.f3835i.mo39525a();
            this.f3831b.mo39752c();
            this.f3834e.mo39775a(C3125af.m1961e(str, this.f3832c), this.f3831b);
        }
    }

    public void reportEvent(String str) {
        if (this.f3832c.mo41688c()) {
            mo39538e(str);
        }
        m4157a(C3125af.m1956c(str, this.f3832c));
    }

    public void reportEvent(String str, String str2) {
        if (this.f3832c.mo41688c()) {
            m4164d(str, str2);
        }
        m4157a(C3125af.m1945a(str, str2, this.f3832c));
    }

    public void reportEvent(String str, Map<String, Object> map) {
        String str2;
        Map<String, Object> b = C3306cx.m2867b(map);
        this.f3834e.mo39765a(C3125af.m1956c(str, this.f3832c), mo40667d(), b);
        if (this.f3832c.mo41688c()) {
            if (b == null) {
                str2 = null;
            } else {
                str2 = b.toString();
            }
            m4164d(str, str2);
        }
    }

    /* renamed from: e */
    private void mo39538e(String str) {
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("Event received: " + mo40668d(str));
        }
    }

    /* renamed from: d */
    private void m4164d(String str, String str2) {
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("Event received: " + mo40668d(str) + ". With value: " + mo40668d(str2));
        }
    }

    /* renamed from: e */
    private void m4166e(String str, String str2) {
        if (this.f3832c.mo41688c()) {
            StringBuilder sb = new StringBuilder("Statbox event received ");
            sb.append(" with name: ");
            sb.append(mo40668d(str));
            sb.append(" with value: ");
            String d = mo40668d(str2);
            if (d.length() > 100) {
                sb.append(d.substring(0, 100));
                sb.append("...");
            } else {
                sb.append(d);
            }
            this.f3832c.mo41680a(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo40655a(int i, String str, String str2, Map<String, String> map) {
        HashMap hashMap;
        if (!m4160a(i)) {
            if (map == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(map);
            }
            m4157a(C3125af.m1939a(i, str, str2, (Map<String, Object>) hashMap, this.f3832c));
        }
    }

    /* renamed from: a */
    private boolean m4160a(int i) {
        return !f3827f.contains(Integer.valueOf(i)) && i >= 1 && i <= 99;
    }

    public void reportError(String str, Throwable th) {
        this.f3834e.mo39779a(str, new C3605kl(th, (C3599kg) null, this.f3836j.mo39464a(), this.f3836j.mo39465b()), this.f3831b);
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41681a("Error received: %s", mo40668d(str));
        }
    }

    public void sendEventsBuffer() {
        this.f3834e.mo39775a(C3125af.m1940a(C3125af.C3126a.EVENT_TYPE_PURGE_BUFFER, this.f3832c), this.f3831b);
    }

    /* renamed from: a */
    public void mo39350a(String str, String str2) {
        m4157a(C3125af.m1953b(str, str2, this.f3832c));
        m4166e(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo40666c() {
        boolean z = !mo40669f();
        if (z) {
            this.f3834e.mo39775a(C3125af.m1961e("", this.f3832c), this.f3831b);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3245bz mo40667d() {
        return this.f3831b;
    }

    /* renamed from: a */
    private void m4157a(C4217w wVar) {
        this.f3834e.mo39775a(wVar, this.f3831b);
    }

    /* renamed from: c */
    public void mo40664c(String str) {
        mo39539f(str);
    }

    /* renamed from: f */
    private void mo39539f(String str) {
        this.f3834e.mo39778a(C3137am.m2020b(str), this.f3831b);
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("Error received: native");
        }
    }

    public void reportUnhandledException(Throwable th) {
        m4162b(new C3605kl(th, (C3599kg) null, this.f3836j.mo39464a(), this.f3836j.mo39465b()));
    }

    /* renamed from: a */
    public void mo39499a(C3605kl klVar) {
        m4162b(klVar);
    }

    /* renamed from: b */
    private void m4162b(C3605kl klVar) {
        this.f3834e.mo39770a(klVar, this.f3831b);
        m4163c(klVar);
    }

    /* renamed from: c */
    private void m4163c(C3605kl klVar) {
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("Unhandled exception received: " + klVar.toString());
        }
    }

    public void reportRevenue(Revenue revenue) {
        m4156a(revenue);
    }

    /* renamed from: a */
    private void m4156a(Revenue revenue) {
        C4287yi a = f3829h.mo40671a(revenue);
        if (a.mo41869a()) {
            this.f3834e.mo39768a(new C3263cg(revenue, this.f3832c), this.f3831b);
            m4161b(revenue);
        } else if (this.f3832c.mo41688c()) {
            C4216vz vzVar = this.f3832c;
            vzVar.mo41684b("Passed revenue is not valid. Reason: " + a.mo41870b());
        }
    }

    /* renamed from: b */
    private void m4161b(Revenue revenue) {
        if (this.f3832c.mo41688c()) {
            StringBuilder sb = new StringBuilder("Revenue received ");
            sb.append("for productID: ");
            sb.append(mo40668d(revenue.productID));
            sb.append(" of quantity: ");
            if (revenue.quantity != null) {
                sb.append(revenue.quantity);
            } else {
                sb.append("<null>");
            }
            sb.append(" with price: ");
            sb.append(revenue.price);
            sb.append(" ");
            sb.append(revenue.currency);
            this.f3832c.mo41680a(sb.toString());
        }
    }

    public void reportUserProfile(UserProfile userProfile) {
        m4158a(userProfile);
    }

    /* renamed from: a */
    private void m4158a(UserProfile userProfile) {
        C3875re reVar = new C3875re();
        for (UserProfileUpdate<? extends C3876rf> userProfileUpdatePatcher : userProfile.getUserProfileUpdates()) {
            C3876rf userProfileUpdatePatcher2 = userProfileUpdatePatcher.getUserProfileUpdatePatcher();
            userProfileUpdatePatcher2.mo40960a(this.f3832c);
            userProfileUpdatePatcher2.mo40954a(reVar);
        }
        C3908rl.C3909a c = reVar.mo40976c();
        C4287yi a = f3828g.mo40671a(c);
        if (a.mo41869a()) {
            this.f3834e.mo39772a(c, this.f3831b);
            mo39540g();
        } else if (this.f3832c.mo41688c()) {
            C4216vz vzVar = this.f3832c;
            vzVar.mo41684b("UserInfo wasn't sent because " + a.mo41870b());
        }
    }

    /* renamed from: g */
    private void mo39540g() {
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a(new StringBuilder("User profile received").toString());
        }
    }

    public void setUserProfileID(String str) {
        this.f3834e.mo39788b(str, this.f3831b);
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("Set user profile ID: " + mo40668d(str));
        }
    }

    public void setStatisticsSending(boolean z) {
        this.f3831b.mo39947h().mo39247g(z);
    }

    /* renamed from: a */
    public void mo39498a(C3599kg kgVar) {
        this.f3834e.mo39769a(new C3600kh(kgVar, this.f3836j.mo39464a(), this.f3836j.mo39465b()), this.f3831b);
    }

    /* renamed from: e */
    public void mo39500e() {
        this.f3834e.mo39775a(C4217w.m5940a(this.f3830a), this.f3831b);
    }

    /* renamed from: f */
    public boolean mo40669f() {
        return this.f3831b.mo39749a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo40668d(String str) {
        if (str == null) {
            return "<null>";
        }
        return str.isEmpty() ? "<empty>" : str;
    }
}
