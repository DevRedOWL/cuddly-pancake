package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.metrica.impl.p038ac.C3098a;

/* renamed from: com.yandex.metrica.impl.ob.sx */
public class C4062sx extends C4063sy<C3817ph> {

    /* renamed from: a */
    private long f4861a;

    /* renamed from: a */
    public void mo41413a(Uri.Builder builder, C3817ph phVar) {
        String str;
        super.mo41413a(builder, phVar);
        builder.appendPath(FirebaseAnalytics.Param.LOCATION);
        builder.appendQueryParameter("deviceid", phVar.mo41308r());
        builder.appendQueryParameter("device_type", phVar.mo41279C());
        builder.appendQueryParameter("uuid", phVar.mo41310t());
        builder.appendQueryParameter("analytics_sdk_version_name", phVar.mo41296i());
        builder.appendQueryParameter("analytics_sdk_build_number", phVar.mo41298j());
        builder.appendQueryParameter("analytics_sdk_build_type", phVar.mo41300k());
        builder.appendQueryParameter("app_version_name", phVar.mo41307q());
        builder.appendQueryParameter("app_build_number", phVar.mo41306p());
        builder.appendQueryParameter("os_version", phVar.mo41304n());
        builder.appendQueryParameter("os_api_level", String.valueOf(phVar.mo41305o()));
        builder.appendQueryParameter("is_rooted", phVar.mo41311u());
        builder.appendQueryParameter("app_framework", phVar.mo41312v());
        builder.appendQueryParameter("app_id", phVar.mo41286d());
        builder.appendQueryParameter("app_platform", phVar.mo41302l());
        builder.appendQueryParameter("android_id", phVar.mo41278B());
        builder.appendQueryParameter("request_id", String.valueOf(this.f4861a));
        C3098a.C3104c D = phVar.mo41280D();
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
    public void mo41411a(long j) {
        this.f4861a = j;
    }
}
