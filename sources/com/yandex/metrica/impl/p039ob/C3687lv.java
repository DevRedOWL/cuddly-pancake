package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.lv */
public class C3687lv extends C3689lx {

    /* renamed from: a */
    static final C3853qk f3705a = new C3853qk("UUID");

    /* renamed from: b */
    static final C3853qk f3706b = new C3853qk("DEVICE_ID_POSSIBLE");

    /* renamed from: c */
    static final C3853qk f3707c = new C3853qk("DEVICE_ID");

    /* renamed from: d */
    static final C3853qk f3708d = new C3853qk("DEVICE_ID_HASH");

    /* renamed from: e */
    static final C3853qk f3709e = new C3853qk("AD_URL_GET");

    /* renamed from: f */
    static final C3853qk f3710f = new C3853qk("AD_URL_REPORT");

    /* renamed from: g */
    static final C3853qk f3711g = new C3853qk("CUSTOM_HOSTS");

    /* renamed from: h */
    static final C3853qk f3712h = new C3853qk("SERVER_TIME_OFFSET");

    /* renamed from: i */
    static final C3853qk f3713i = new C3853qk("STARTUP_REQUEST_TIME");

    /* renamed from: j */
    static final C3853qk f3714j = new C3853qk("CLIDS");

    /* renamed from: k */
    static final C3853qk f3715k = new C3853qk("CLIENT_CLIDS");

    /* renamed from: l */
    static final C3853qk f3716l = new C3853qk("REFERRER");

    /* renamed from: m */
    static final C3853qk f3717m = new C3853qk("DEFERRED_DEEP_LINK_WAS_CHECKED");

    /* renamed from: n */
    static final C3853qk f3718n = new C3853qk("REFERRER_FROM_PLAY_SERVICES_WAS_CHECKED");

    /* renamed from: o */
    static final C3853qk f3719o = new C3853qk("DEPRECATED_NATIVE_CRASHES_CHECKED");

    /* renamed from: p */
    static final C3853qk f3720p = new C3853qk("API_LEVEL");

    public C3687lv(C3630lf lfVar) {
        super(lfVar);
    }

    /* renamed from: a */
    public String mo40492a(String str) {
        return mo40564c(f3705a.mo40947b(), str);
    }

    /* renamed from: b */
    public String mo40494b(String str) {
        return mo40564c(f3707c.mo40947b(), str);
    }

    /* renamed from: c */
    public String mo40498c(String str) {
        return mo40564c(f3708d.mo40947b(), str);
    }

    /* renamed from: a */
    public String mo40491a() {
        return mo40564c(f3706b.mo40947b(), "");
    }

    /* renamed from: d */
    public String mo40500d(String str) {
        return mo40564c(f3709e.mo40947b(), str);
    }

    /* renamed from: e */
    public String mo40503e(String str) {
        return mo40564c(f3710f.mo40947b(), str);
    }

    /* renamed from: b */
    public List<String> mo40495b() {
        String c = mo40564c(f3711g.mo40947b(), (String) null);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        return C4204vq.m5897c(c);
    }

    /* renamed from: a */
    public long mo40489a(long j) {
        return mo40559b(f3712h.mo40945a(), j);
    }

    /* renamed from: b */
    public long mo40493b(long j) {
        return mo40559b(f3713i.mo40947b(), j);
    }

    /* renamed from: f */
    public String mo40507f(String str) {
        return mo40564c(f3714j.mo40947b(), str);
    }

    /* renamed from: c */
    public long mo40496c(long j) {
        return mo40559b(f3720p.mo40947b(), j);
    }

    /* renamed from: c */
    public String mo40497c() {
        return mo40564c(f3716l.mo40947b(), (String) null);
    }

    /* renamed from: d */
    public boolean mo40501d() {
        return mo40562b(f3717m.mo40947b(), false);
    }

    /* renamed from: e */
    public boolean mo40504e() {
        return mo40562b(f3718n.mo40947b(), false);
    }

    /* renamed from: g */
    public C3687lv mo40509g(String str) {
        return (C3687lv) mo40560b(f3705a.mo40947b(), str);
    }

    /* renamed from: h */
    public C3687lv mo40510h(String str) {
        return (C3687lv) mo40560b(f3707c.mo40947b(), str);
    }

    /* renamed from: i */
    public C3687lv mo40511i(String str) {
        return (C3687lv) mo40560b(f3708d.mo40947b(), str);
    }

    /* renamed from: j */
    public C3687lv mo40512j(String str) {
        return (C3687lv) mo40560b(f3709e.mo40947b(), str);
    }

    /* renamed from: a */
    public C3687lv mo40490a(List<String> list) {
        return (C3687lv) mo40560b(f3711g.mo40947b(), C4204vq.m5882a(list));
    }

    /* renamed from: k */
    public C3687lv mo40513k(String str) {
        return (C3687lv) mo40560b(f3710f.mo40947b(), str);
    }

    /* renamed from: d */
    public C3687lv mo40499d(long j) {
        return (C3687lv) mo40554a(f3712h.mo40947b(), j);
    }

    /* renamed from: e */
    public C3687lv mo40502e(long j) {
        return (C3687lv) mo40554a(f3713i.mo40947b(), j);
    }

    /* renamed from: l */
    public C3687lv mo40514l(String str) {
        return (C3687lv) mo40560b(f3714j.mo40947b(), str);
    }

    /* renamed from: f */
    public C3687lv mo40506f(long j) {
        return (C3687lv) mo40554a(f3720p.mo40947b(), j);
    }

    /* renamed from: m */
    public C3687lv mo40515m(String str) {
        return (C3687lv) mo40560b(f3706b.mo40947b(), str);
    }

    /* renamed from: n */
    public C3687lv mo40516n(String str) {
        return (C3687lv) mo40560b(f3716l.mo40947b(), str);
    }

    /* renamed from: f */
    public C3687lv mo40505f() {
        return (C3687lv) mo40556a(f3717m.mo40947b(), true);
    }

    /* renamed from: g */
    public C3687lv mo40508g() {
        return (C3687lv) mo40556a(f3718n.mo40947b(), true);
    }

    /* renamed from: o */
    public C3687lv mo40517o(String str) {
        return (C3687lv) mo40560b(f3715k.mo40947b(), str);
    }

    /* renamed from: p */
    public String mo40518p(String str) {
        return mo40564c(f3715k.mo40947b(), str);
    }
}
