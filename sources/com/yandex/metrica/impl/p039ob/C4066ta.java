package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p038ac.C3098a;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ta */
public class C4066ta implements C4061sw<C4056su> {

    /* renamed from: a */
    private final C4050ss f4867a;

    public C4066ta(C4050ss ssVar) {
        this.f4867a = ssVar;
    }

    /* renamed from: a */
    public void mo41421a(Uri.Builder builder, C4056su suVar) {
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f4867a.mo41331a("deviceid"), suVar.mo41308r());
        builder.appendQueryParameter(this.f4867a.mo41331a("deviceid2"), suVar.mo41309s());
        mo41420a(builder, C3136al.m1993a().mo39493h(), suVar);
        builder.appendQueryParameter(this.f4867a.mo41331a("app_platform"), suVar.mo41302l());
        builder.appendQueryParameter(this.f4867a.mo41331a("protocol_version"), suVar.mo41294h());
        builder.appendQueryParameter(this.f4867a.mo41331a("analytics_sdk_version_name"), suVar.mo41296i());
        builder.appendQueryParameter(this.f4867a.mo41331a("model"), suVar.mo41303m());
        builder.appendQueryParameter(this.f4867a.mo41331a("manufacturer"), suVar.mo41292g());
        builder.appendQueryParameter(this.f4867a.mo41331a("os_version"), suVar.mo41304n());
        builder.appendQueryParameter(this.f4867a.mo41331a("screen_width"), String.valueOf(suVar.mo41313w()));
        builder.appendQueryParameter(this.f4867a.mo41331a("screen_height"), String.valueOf(suVar.mo41314x()));
        builder.appendQueryParameter(this.f4867a.mo41331a("screen_dpi"), String.valueOf(suVar.mo41315y()));
        builder.appendQueryParameter(this.f4867a.mo41331a("scalefactor"), String.valueOf(suVar.mo41316z()));
        builder.appendQueryParameter(this.f4867a.mo41331a("locale"), suVar.mo41277A());
        builder.appendQueryParameter(this.f4867a.mo41331a("device_type"), suVar.mo41279C());
        builder.appendQueryParameter(this.f4867a.mo41331a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("query_hosts"), String.valueOf(2));
        builder.appendQueryParameter(this.f4867a.mo41331a("features"), C3303cu.m2827b(this.f4867a.mo41331a("easy_collecting"), this.f4867a.mo41331a("package_info"), this.f4867a.mo41331a("socket"), this.f4867a.mo41331a("permissions_collecting"), this.f4867a.mo41331a("features_collecting"), this.f4867a.mo41331a("foreground_location_collection"), this.f4867a.mo41331a("background_location_collection"), this.f4867a.mo41331a("foreground_lbs_collection"), this.f4867a.mo41331a("background_lbs_collection"), this.f4867a.mo41331a("telephony_restricted_to_location_tracking"), this.f4867a.mo41331a("android_id"), this.f4867a.mo41331a("google_aid"), this.f4867a.mo41331a("wifi_around"), this.f4867a.mo41331a("wifi_connected"), this.f4867a.mo41331a("own_macs"), this.f4867a.mo41331a("cells_around"), this.f4867a.mo41331a("sim_info"), this.f4867a.mo41331a("sim_imei"), this.f4867a.mo41331a("access_point"), this.f4867a.mo41331a("sdk_list"), this.f4867a.mo41331a("identity_light_collecting"), this.f4867a.mo41331a("ble_collecting")));
        builder.appendQueryParameter(this.f4867a.mo41331a("socket"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("app_id"), suVar.mo41286d());
        builder.appendQueryParameter(this.f4867a.mo41331a("foreground_location_collection"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("app_debuggable"), suVar.mo41329E());
        builder.appendQueryParameter(this.f4867a.mo41331a("sdk_list"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("background_location_collection"), String.valueOf(1));
        if (suVar.mo41401b()) {
            String K = suVar.mo41391K();
            if (!TextUtils.isEmpty(K)) {
                builder.appendQueryParameter(this.f4867a.mo41331a("country_init"), K);
            }
        } else {
            builder.appendQueryParameter(this.f4867a.mo41331a("detect_locale"), String.valueOf(1));
        }
        Map<String, String> G = suVar.mo41387G();
        String H = suVar.mo41388H();
        if (!C3306cx.m2862a((Map) G)) {
            builder.appendQueryParameter(this.f4867a.mo41331a("distribution_customization"), String.valueOf(1));
            m5416a(builder, "clids_set", C4225we.m6008a(G));
            if (!TextUtils.isEmpty(H)) {
                builder.appendQueryParameter(this.f4867a.mo41331a("install_referrer"), H);
            }
        }
        m5416a(builder, "uuid", suVar.mo41310t());
        builder.appendQueryParameter(this.f4867a.mo41331a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("requests"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("permissions"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("identity_light_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f4867a.mo41331a("ble_collecting"), String.valueOf(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41420a(Uri.Builder builder, C3299cs csVar, C4056su suVar) {
        C3098a.C3104c D = suVar.mo41280D();
        if (csVar.mo39855a()) {
            builder.appendQueryParameter(this.f4867a.mo41331a("adv_id"), "");
        } else if (D == null || TextUtils.isEmpty(D.f2454a)) {
            builder.appendQueryParameter(this.f4867a.mo41331a("adv_id"), "");
        } else {
            builder.appendQueryParameter(this.f4867a.mo41331a("adv_id"), D.f2454a);
        }
    }

    /* renamed from: a */
    private void m5416a(Uri.Builder builder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(this.f4867a.mo41331a(str), str2);
        }
    }
}
