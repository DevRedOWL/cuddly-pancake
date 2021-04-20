package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3744np;
import com.yandex.metrica.impl.p039ob.C3822pj;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.tc */
public class C4069tc {

    /* renamed from: a */
    private C4257xh f4873a;

    /* renamed from: b */
    private final C3700mf<C4076te> f4874b;

    /* renamed from: c */
    private C4071a f4875c;

    /* renamed from: d */
    private C3711mp f4876d;

    /* renamed from: e */
    private final C4072b f4877e;

    /* renamed from: f */
    private final C4227wg f4878f;

    /* renamed from: g */
    private final C3821pi f4879g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f4880h;

    /* renamed from: com.yandex.metrica.impl.ob.tc$a */
    public static class C4071a {

        /* renamed from: a */
        private final C4080ti f4883a;

        public C4071a() {
            this(new C4080ti());
        }

        C4071a(C4080ti tiVar) {
            this.f4883a = tiVar;
        }

        /* renamed from: a */
        public List<C4079th> mo41430a(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (C3306cx.m2863a(bArr)) {
                return arrayList;
            }
            try {
                return this.f4883a.mo41442a(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.tc$b */
    static class C4072b {
        C4072b() {
        }

        /* renamed from: a */
        public HttpURLConnection mo41431a(String str, String str2) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                if (!TextUtils.isEmpty(str)) {
                    httpURLConnection.setRequestProperty("If-None-Match", str);
                }
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(C3822pj.C3823a.f4072a);
                httpURLConnection.setReadTimeout(C3822pj.C3823a.f4072a);
                httpURLConnection.connect();
                return httpURLConnection;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public C4069tc(Context context, String str, C4257xh xhVar) {
        this(str, C3744np.C3746a.m4268a(C4076te.class).mo40705a(context), new C4071a(), new C4072b(), xhVar, new C3711mp(), new C4227wg(), new C3821pi(context));
    }

    C4069tc(String str, C3700mf mfVar, C4071a aVar, C4072b bVar, C4257xh xhVar, C3711mp mpVar, C4227wg wgVar, C3821pi piVar) {
        this.f4880h = str;
        this.f4874b = mfVar;
        this.f4875c = aVar;
        this.f4877e = bVar;
        this.f4873a = xhVar;
        this.f4876d = mpVar;
        this.f4878f = wgVar;
        this.f4879g = piVar;
    }

    /* renamed from: a */
    public void mo41426a(final C4067tb tbVar) {
        this.f4873a.mo41808a((Runnable) new Runnable() {
            public void run() {
                C4069tc tcVar = C4069tc.this;
                tcVar.m5423a(tbVar, tcVar.f4880h);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5423a(C4067tb tbVar, String str) {
        C4076te a = this.f4874b.mo40624a();
        C4076te teVar = null;
        if (this.f4879g.mo40839a() && str != null) {
            try {
                HttpURLConnection a2 = this.f4877e.mo41431a(a.f4904b, str);
                if (a2 != null) {
                    teVar = mo41425a(a2, a);
                }
            } catch (Throwable unused) {
            }
        }
        if (teVar != null) {
            tbVar.mo41423a(teVar);
        } else {
            tbVar.mo41422a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4076te mo41425a(HttpURLConnection httpURLConnection, C4076te teVar) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            try {
                return new C4076te(this.f4875c.mo41430a(this.f4876d.mo40638a(C3137am.m2025b(httpURLConnection.getInputStream()), "af9202nao18gswqp")), C3303cu.m2820a(httpURLConnection.getHeaderField("ETag")), this.f4878f.mo41768a(), true, false);
            } catch (IOException unused) {
            }
        } else if (responseCode == 304) {
            return new C4076te(teVar.f4903a, teVar.f4904b, this.f4878f.mo41768a(), true, false);
        }
        return null;
    }

    /* renamed from: a */
    public void mo41427a(C4143uk ukVar) {
        if (ukVar != null) {
            this.f4880h = ukVar.f5094h;
        }
    }

    /* renamed from: b */
    public boolean mo41428b(C4143uk ukVar) {
        String str = this.f4880h;
        if (str != null) {
            return !str.equals(ukVar.f5094h);
        }
        if (ukVar.f5094h != null) {
            return true;
        }
        return false;
    }
}
