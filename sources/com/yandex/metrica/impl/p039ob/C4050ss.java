package com.yandex.metrica.impl.p039ob;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ss */
public class C4050ss {

    /* renamed from: a */
    private final Map<String, String> f4806a = new HashMap();

    public C4050ss() {
        this.f4806a.put("android_id", "a");
        this.f4806a.put("background_location_collection", "blc");
        this.f4806a.put("background_lbs_collection", "blbc");
        this.f4806a.put("easy_collecting", "ec");
        this.f4806a.put("access_point", "ap");
        this.f4806a.put("cells_around", "ca");
        this.f4806a.put("google_aid", "g");
        this.f4806a.put("own_macs", "om");
        this.f4806a.put("sim_imei", "sm");
        this.f4806a.put("sim_info", "si");
        this.f4806a.put("wifi_around", "wa");
        this.f4806a.put("wifi_connected", "wc");
        this.f4806a.put("features_collecting", "fc");
        this.f4806a.put("foreground_location_collection", "flc");
        this.f4806a.put("foreground_lbs_collection", "flbc");
        this.f4806a.put("package_info", "pi");
        this.f4806a.put("permissions_collecting", "pc");
        this.f4806a.put("sdk_list", "sl");
        this.f4806a.put("socket", "s");
        this.f4806a.put("telephony_restricted_to_location_tracking", "trtlt");
        this.f4806a.put("identity_light_collecting", "ilc");
        this.f4806a.put("ble_collecting", "bc");
    }

    /* renamed from: a */
    public String mo41331a(String str) {
        return this.f4806a.containsKey(str) ? this.f4806a.get(str) : str;
    }
}
