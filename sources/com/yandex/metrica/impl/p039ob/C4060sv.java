package com.yandex.metrica.impl.p039ob;

import android.net.Uri;

/* renamed from: com.yandex.metrica.impl.ob.sv */
public class C4060sv implements C4061sw<C3455gi> {
    /* renamed from: a */
    public void mo41410a(Uri.Builder builder, C3455gi giVar) {
        builder.appendPath("diagnostic");
        builder.appendQueryParameter("deviceid", giVar.mo41308r());
        builder.appendQueryParameter("uuid", giVar.mo41310t());
        builder.appendQueryParameter("app_platform", giVar.mo41302l());
        builder.appendQueryParameter("analytics_sdk_version_name", giVar.mo41296i());
        builder.appendQueryParameter("analytics_sdk_build_number", giVar.mo41298j());
        builder.appendQueryParameter("analytics_sdk_build_type", giVar.mo41300k());
        builder.appendQueryParameter("app_version_name", giVar.mo41307q());
        builder.appendQueryParameter("app_build_number", giVar.mo41306p());
        builder.appendQueryParameter("model", giVar.mo41303m());
        builder.appendQueryParameter("manufacturer", giVar.mo41292g());
        builder.appendQueryParameter("os_version", giVar.mo41304n());
        builder.appendQueryParameter("os_api_level", String.valueOf(giVar.mo41305o()));
        builder.appendQueryParameter("screen_width", String.valueOf(giVar.mo41313w()));
        builder.appendQueryParameter("screen_height", String.valueOf(giVar.mo41314x()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(giVar.mo41315y()));
        builder.appendQueryParameter("scalefactor", String.valueOf(giVar.mo41316z()));
        builder.appendQueryParameter("locale", giVar.mo41277A());
        builder.appendQueryParameter("device_type", giVar.mo41279C());
        builder.appendQueryParameter("app_id", giVar.mo41286d());
        builder.appendQueryParameter("api_key_128", giVar.mo40143b());
        builder.appendQueryParameter("app_debuggable", giVar.mo41329E());
        builder.appendQueryParameter("is_rooted", giVar.mo41311u());
        builder.appendQueryParameter("app_framework", giVar.mo41312v());
    }
}
