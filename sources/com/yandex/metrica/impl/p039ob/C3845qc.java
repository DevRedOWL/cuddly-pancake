package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qc */
public class C3845qc extends C3846qd {

    /* renamed from: d */
    private final C3853qk f4098d = new C3853qk("init_event_pref_key", mo40901i());

    /* renamed from: e */
    private final C3853qk f4099e = new C3853qk("init_event_pref_key");

    /* renamed from: f */
    private final C3853qk f4100f = new C3853qk("first_event_pref_key", mo40901i());

    /* renamed from: g */
    private final C3853qk f4101g = new C3853qk("fitst_event_description_key", mo40901i());

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo40896f() {
        return "_initpreferences";
    }

    public C3845qc(Context context, String str) {
        super(context, str);
    }

    /* renamed from: a */
    public void mo40887a() {
        mo40898a(this.f4098d.mo40947b(), "DONE").mo40902j();
    }

    @Deprecated
    /* renamed from: a */
    public String mo40886a(String str) {
        return this.f4105c.getString(this.f4099e.mo40947b(), str);
    }

    /* renamed from: b */
    public String mo40888b(String str) {
        return this.f4105c.getString(this.f4098d.mo40947b(), str);
    }

    /* renamed from: c */
    public String mo40890c(String str) {
        return this.f4105c.getString(this.f4100f.mo40947b(), str);
    }

    @Deprecated
    /* renamed from: b */
    public void mo40889b() {
        m4553a(this.f4099e);
    }

    @Deprecated
    /* renamed from: d */
    public void mo40893d(String str) {
        m4553a(new C3853qk("init_event_pref_key", str));
    }

    /* renamed from: c */
    public void mo40891c() {
        m4553a(this.f4098d);
    }

    /* renamed from: d */
    public void mo40892d() {
        m4553a(this.f4100f);
    }

    /* renamed from: e */
    public String mo40894e(String str) {
        return this.f4105c.getString(this.f4101g.mo40947b(), str);
    }

    /* renamed from: e */
    public void mo40895e() {
        m4553a(this.f4101g);
    }

    /* renamed from: a */
    private void m4553a(C3853qk qkVar) {
        this.f4105c.edit().remove(qkVar.mo40947b()).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<String, ?> mo40897g() {
        return this.f4105c.getAll();
    }

    /* renamed from: f */
    static String m4554f(String str) {
        return new C3853qk("init_event_pref_key", str).mo40947b();
    }

    /* renamed from: g */
    static String m4555g(String str) {
        return str.replace("init_event_pref_key", "");
    }
}
