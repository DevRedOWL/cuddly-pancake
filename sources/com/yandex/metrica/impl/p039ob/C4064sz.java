package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p038ac.C3098a;

/* renamed from: com.yandex.metrica.impl.ob.sz */
public class C4064sz extends C4063sy<C4051st> {

    /* renamed from: a */
    private C4049sr f4863a;

    /* renamed from: b */
    private int f4864b;

    /* renamed from: a */
    public void mo41418a(C4049sr srVar) {
        this.f4863a = srVar;
    }

    /* renamed from: a */
    public void mo41416a(int i) {
        this.f4864b = i;
    }

    /* renamed from: a */
    public void mo41413a(Uri.Builder builder, C4051st stVar) {
        super.mo41413a(builder, stVar);
        builder.path("report");
        m5409b(builder, stVar);
        m5410c(builder, stVar);
        builder.appendQueryParameter("request_id", String.valueOf(this.f4864b));
    }

    /* renamed from: b */
    private void m5409b(Uri.Builder builder, C4051st stVar) {
        C4049sr srVar = this.f4863a;
        if (srVar != null) {
            m5408a(builder, "deviceid", srVar.f4791a, stVar.mo41308r());
            m5408a(builder, "uuid", this.f4863a.f4792b, stVar.mo41310t());
            m5407a(builder, "analytics_sdk_version", this.f4863a.f4793c);
            m5407a(builder, "analytics_sdk_version_name", this.f4863a.f4794d);
            m5408a(builder, "app_version_name", this.f4863a.f4797g, stVar.mo41307q());
            m5408a(builder, "app_build_number", this.f4863a.f4799i, stVar.mo41306p());
            m5408a(builder, "os_version", this.f4863a.f4800j, stVar.mo41304n());
            m5407a(builder, "os_api_level", this.f4863a.f4801k);
            m5407a(builder, "analytics_sdk_build_number", this.f4863a.f4795e);
            m5407a(builder, "analytics_sdk_build_type", this.f4863a.f4796f);
            m5407a(builder, "app_debuggable", this.f4863a.f4798h);
            m5408a(builder, "locale", this.f4863a.f4802l, stVar.mo41277A());
            m5408a(builder, "is_rooted", this.f4863a.f4803m, stVar.mo41311u());
            m5408a(builder, "app_framework", this.f4863a.f4804n, stVar.mo41312v());
            m5407a(builder, "attribution_id", this.f4863a.f4805o);
        }
    }

    /* renamed from: c */
    private void m5410c(Uri.Builder builder, C4051st stVar) {
        String str;
        builder.appendQueryParameter("api_key_128", stVar.mo41366c());
        builder.appendQueryParameter("app_id", stVar.mo41286d());
        builder.appendQueryParameter("app_platform", stVar.mo41302l());
        builder.appendQueryParameter("model", stVar.mo41303m());
        builder.appendQueryParameter("manufacturer", stVar.mo41292g());
        builder.appendQueryParameter("screen_width", String.valueOf(stVar.mo41313w()));
        builder.appendQueryParameter("screen_height", String.valueOf(stVar.mo41314x()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(stVar.mo41315y()));
        builder.appendQueryParameter("scalefactor", String.valueOf(stVar.mo41316z()));
        builder.appendQueryParameter("device_type", stVar.mo41279C());
        builder.appendQueryParameter("android_id", stVar.mo41278B());
        m5407a(builder, "clids_set", stVar.mo41353a());
        C3098a.C3104c D = stVar.mo41280D();
        String str2 = "";
        if (D == null) {
            str = str2;
        } else {
            str = D.f2454a;
        }
        if (str == null) {
            str = str2;
        }
        builder.appendQueryParameter("adv_id", str);
        if (D != null) {
            str2 = mo41414a(D.f2455b);
        }
        builder.appendQueryParameter("limit_ad_tracking", str2);
    }

    /* renamed from: a */
    private void m5408a(Uri.Builder builder, String str, String str2, String str3) {
        builder.appendQueryParameter(str, C3303cu.m2828c(str2, str3));
    }

    /* renamed from: a */
    private void m5407a(Uri.Builder builder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }
}
