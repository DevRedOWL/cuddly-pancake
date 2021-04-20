package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.bx */
public class C3237bx {

    /* renamed from: a */
    private final boolean f2791a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3251cd f2792b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3687lv f2793c;

    /* renamed from: d */
    private String f2794d;

    /* renamed from: e */
    private Map<String, String> f2795e;

    /* renamed from: f */
    private DeferredDeeplinkParametersListener f2796f;

    public C3237bx(C3251cd cdVar, C3687lv lvVar, C4257xh xhVar) {
        this(cdVar, lvVar, new C4036sl(cdVar.mo39503b()), xhVar);
    }

    C3237bx(C3251cd cdVar, C3687lv lvVar, final C4036sl slVar, C4257xh xhVar) {
        this.f2792b = cdVar;
        this.f2793c = lvVar;
        this.f2794d = lvVar.mo40497c();
        this.f2791a = lvVar.mo40501d();
        if (this.f2791a) {
            this.f2793c.mo40516n((String) null);
            this.f2794d = null;
        } else {
            m2480e(mo39731b(this.f2794d));
        }
        if (!this.f2793c.mo40504e()) {
            xhVar.mo41808a((Runnable) new Runnable() {
                public void run() {
                    slVar.mo41275a(new C4035sk() {
                        /* renamed from: a */
                        public void mo39734a(C4034sj sjVar) {
                            C3237bx.this.f2792b.mo39773a(sjVar);
                            C3237bx.this.m2479d(sjVar.f4752a);
                            m2488a();
                        }

                        /* renamed from: a */
                        public void mo39735a(Throwable th) {
                            C3237bx.this.f2792b.mo39773a((C4034sj) null);
                            m2488a();
                        }

                        /* renamed from: a */
                        private void m2488a() {
                            C3237bx.this.f2793c.mo40508g();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public void mo39730a(String str) {
        this.f2792b.mo39777a(str);
        m2479d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m2479d(String str) {
        if (!(this.f2791a || TextUtils.isEmpty(str)) && TextUtils.isEmpty(this.f2794d)) {
            synchronized (this) {
                this.f2794d = str;
                this.f2793c.mo40516n(this.f2794d);
                m2480e(mo39731b(str));
                m2475a();
            }
        }
    }

    /* renamed from: e */
    private void m2480e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f2795e = mo39732c(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo39731b(String str) {
        return m2481f(str).get("appmetrica_deep_link");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<String, String> mo39732c(String str) {
        Map<String, String> f = m2481f(Uri.decode(str));
        HashMap hashMap = new HashMap(f.size());
        for (Map.Entry next : f.entrySet()) {
            hashMap.put(Uri.decode((String) next.getKey()), Uri.decode((String) next.getValue()));
        }
        return hashMap;
    }

    /* renamed from: f */
    private static Map<String, String> m2481f(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            String g = m2482g(str);
            if (m2483h(g)) {
                for (String str2 : g.split("&")) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf >= 0) {
                        hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } else {
                        hashMap.put(str2, "");
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: g */
    private static String m2482g(String str) {
        int lastIndexOf = str.lastIndexOf(63);
        return lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
    }

    /* renamed from: h */
    private static boolean m2483h(String str) {
        return str.contains("=");
    }

    /* renamed from: a */
    private void m2475a() {
        if (!C3306cx.m2862a((Map) this.f2795e)) {
            DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f2796f;
            if (deferredDeeplinkParametersListener != null) {
                deferredDeeplinkParametersListener.onParametersLoaded(this.f2795e);
                this.f2796f = null;
            }
        } else if (this.f2794d != null) {
            m2476a(DeferredDeeplinkParametersListener.Error.PARSE_ERROR);
        }
    }

    /* renamed from: a */
    private void m2476a(DeferredDeeplinkParametersListener.Error error) {
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f2796f;
        if (deferredDeeplinkParametersListener != null) {
            deferredDeeplinkParametersListener.onError(error, this.f2794d);
            this.f2796f = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo39729a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.f2796f = deferredDeeplinkParametersListener;
            if (this.f2791a) {
                m2476a(DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH);
            } else {
                m2475a();
            }
            this.f2793c.mo40505f();
        } catch (Throwable th) {
            this.f2793c.mo40505f();
            throw th;
        }
    }
}
