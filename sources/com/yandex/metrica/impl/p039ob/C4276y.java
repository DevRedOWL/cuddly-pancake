package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import com.yandex.metrica.impl.p039ob.C3512i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.y */
public final class C4276y {

    /* renamed from: a */
    private Context f5337a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ContentValues f5338b;

    /* renamed from: c */
    private C4051st f5339c;

    public C4276y(Context context) {
        this.f5337a = context;
    }

    /* renamed from: a */
    public C4276y mo41853a(ContentValues contentValues) {
        this.f5338b = contentValues;
        return this;
    }

    /* renamed from: a */
    public C4276y mo41854a(C4051st stVar) {
        this.f5339c = stVar;
        return this;
    }

    /* renamed from: a */
    public void mo41855a() {
        m6169c();
    }

    /* renamed from: c */
    private void m6169c() {
        JSONObject jSONObject = new JSONObject();
        try {
            m6166a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f5338b.put("report_request_parameters", jSONObject.toString());
    }

    /* renamed from: a */
    private void m6166a(JSONObject jSONObject) throws JSONException {
        jSONObject.putOpt("dId", this.f5339c.mo41308r()).putOpt("uId", this.f5339c.mo41310t()).putOpt("appVer", this.f5339c.mo41307q()).putOpt("appBuild", this.f5339c.mo41306p()).putOpt("analyticsSdkVersionName", this.f5339c.mo41296i()).putOpt("kitBuildNumber", this.f5339c.mo41298j()).putOpt("kitBuildType", this.f5339c.mo41300k()).putOpt("osVer", this.f5339c.mo41304n()).putOpt("osApiLev", Integer.valueOf(this.f5339c.mo41305o())).putOpt("lang", this.f5339c.mo41277A()).putOpt("root", this.f5339c.mo41311u()).putOpt("app_debuggable", this.f5339c.mo41329E()).putOpt("app_framework", this.f5339c.mo41312v()).putOpt("attribution_id", Integer.valueOf(this.f5339c.mo41348V()));
    }

    /* renamed from: a */
    private void m6167a(JSONObject jSONObject, C3317cz czVar) throws JSONException {
        C4204vq.m5890a(jSONObject, czVar);
    }

    /* renamed from: d */
    private void m6170d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ViewProps.ENABLED, this.f5339c.mo41340N());
            C3317cz b = mo41858b();
            if (b != null) {
                m6167a(jSONObject, b);
            }
            this.f5338b.put("location_info", jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3317cz mo41858b() {
        Location location;
        C3317cz czVar = null;
        if (this.f5339c.mo41340N()) {
            location = this.f5339c.mo41341O();
            if (location == null) {
                location = C3785oo.m4363a(this.f5337a).mo40773a();
                if (location == null) {
                    location = C3785oo.m4363a(this.f5337a).mo40777b();
                }
            } else {
                czVar = C3317cz.m2912a(location);
            }
        } else {
            location = null;
        }
        return (czVar != null || location == null) ? czVar : C3317cz.m2913b(location);
    }

    /* renamed from: b */
    private void m6168b(C3307cy cyVar) {
        this.f5338b.put("wifi_network_info", cyVar.mo39867a().toString());
    }

    /* renamed from: a */
    private void m6165a(C4154ut utVar) {
        utVar.mo41616a((C4161uv) new C4161uv() {
            /* renamed from: a */
            public void mo40761a(C4155uu[] uuVarArr) {
                C4276y.this.f5338b.put("cell_info", C4204vq.m5887a(uuVarArr).toString());
            }
        });
    }

    /* renamed from: a */
    private void m6164a(C3512i.C3513a aVar) {
        this.f5338b.put("app_environment", aVar.f3369a);
        this.f5338b.put("app_environment_revision", Long.valueOf(aVar.f3370b));
    }

    /* renamed from: e */
    private void m6171e() {
        C4191vd k = C3136al.m1993a().mo39496k();
        k.mo41617a((C4194vg) new C4194vg() {
            /* renamed from: a */
            public void mo39414a(C4193vf vfVar) {
                C4155uu b = vfVar.mo41675b();
                if (b != null) {
                    C4276y.this.f5338b.put("cellular_connection_type", b.mo41626g());
                }
            }
        });
        m6165a((C4154ut) k);
    }

    /* renamed from: a */
    public void mo41857a(C4244ww wwVar, C3512i.C3513a aVar) {
        C4217w wVar = wwVar.f5288a;
        this.f5338b.put("name", wVar.mo41731d());
        this.f5338b.put("value", wVar.mo41734e());
        this.f5338b.put("type", Integer.valueOf(wVar.mo41736g()));
        this.f5338b.put("custom_type", Integer.valueOf(wVar.mo41737h()));
        this.f5338b.put("error_environment", wVar.mo41739j());
        this.f5338b.put("user_info", wVar.mo41741l());
        this.f5338b.put("truncated", Integer.valueOf(wVar.mo41744o()));
        this.f5338b.put("connection_type", Integer.valueOf(C3213bt.m2401e(this.f5337a)));
        this.f5338b.put("profile_id", wVar.mo41745p());
        this.f5338b.put("encrypting_mode", Integer.valueOf(wwVar.f5289b.mo41795a()));
        this.f5338b.put("first_occurrence_status", Integer.valueOf(wwVar.f5288a.mo41746q().f2564d));
        m6164a(aVar);
        m6170d();
        m6172f();
    }

    /* renamed from: f */
    private void m6172f() {
        m6171e();
        C3307cy a = C3307cy.m2873a(this.f5337a);
        m6168b(a);
        mo41856a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41856a(C3307cy cyVar) {
        String b = cyVar.mo39870b(this.f5337a);
        if (!TextUtils.isEmpty(b)) {
            int c = cyVar.mo39872c(this.f5337a);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ssid", b);
                jSONObject.put("state", c);
                this.f5338b.put("wifi_access_point", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
    }
}
