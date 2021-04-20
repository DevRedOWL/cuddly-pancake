package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.lu */
public class C3686lu extends C3689lx {

    /* renamed from: a */
    private final C3853qk f3701a = new C3853qk("init_event_pref_key");

    /* renamed from: b */
    private final C3853qk f3702b = new C3853qk("first_event_pref_key");

    /* renamed from: c */
    private final C3853qk f3703c = new C3853qk("first_event_description_key");

    /* renamed from: d */
    private final C3853qk f3704d = new C3853qk("preload_info_auto_tracking_enabled");

    public C3686lu(C3630lf lfVar) {
        super(lfVar);
    }

    /* renamed from: a */
    public void mo40479a() {
        mo40560b(this.f3701a.mo40947b(), "DONE").mo40567q();
    }

    /* renamed from: b */
    public void mo40482b() {
        mo40560b(this.f3702b.mo40947b(), "DONE").mo40567q();
    }

    /* renamed from: a */
    public String mo40478a(String str) {
        return mo40564c(this.f3701a.mo40947b(), str);
    }

    /* renamed from: b */
    public String mo40481b(String str) {
        return mo40564c(this.f3702b.mo40947b(), str);
    }

    /* renamed from: c */
    public boolean mo40485c() {
        return mo40478a((String) null) != null;
    }

    /* renamed from: d */
    public boolean mo40487d() {
        return mo40481b((String) null) != null;
    }

    /* renamed from: c */
    public void mo40484c(String str) {
        mo40560b(this.f3703c.mo40947b(), str).mo40567q();
    }

    /* renamed from: d */
    public String mo40486d(String str) {
        return mo40564c(this.f3703c.mo40947b(), str);
    }

    /* renamed from: e */
    public void mo40488e() {
        m3914a(this.f3703c);
    }

    /* renamed from: a */
    public void mo40480a(boolean z) {
        mo40556a(this.f3704d.mo40947b(), z).mo40567q();
    }

    /* renamed from: b */
    public boolean mo40483b(boolean z) {
        return mo40562b(this.f3704d.mo40947b(), z);
    }

    /* renamed from: a */
    private void m3914a(C3853qk qkVar) {
        mo40568r(qkVar.mo40947b()).mo40567q();
    }
}
