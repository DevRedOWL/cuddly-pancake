package com.yandex.metrica.impl.interact;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3320db;
import com.yandex.metrica.impl.p039ob.C4155uu;
import com.yandex.metrica.impl.p039ob.C4191vd;
import com.yandex.metrica.impl.p039ob.C4193vf;
import com.yandex.metrica.impl.p039ob.C4194vg;
import java.util.HashMap;
import java.util.Map;

public class CellularNetworkInfo {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f2461a = "";

    public CellularNetworkInfo(Context context) {
        new C4191vd(context, C3320db.m2960k().mo41803b()).mo41617a((C4194vg) new C4194vg() {
            /* renamed from: a */
            public void mo39414a(C4193vf vfVar) {
                C4155uu b = vfVar.mo41675b();
                if (b != null) {
                    String g = b.mo41626g();
                    String f = b.mo41625f();
                    Integer c = b.mo41622c();
                    Integer b2 = b.mo41621b();
                    Integer e = b.mo41624e();
                    Integer d = b.mo41623d();
                    Integer a = b.mo41619a();
                    HashMap hashMap = new HashMap();
                    hashMap.put("network_type", g);
                    hashMap.put("operator_name", f);
                    String str = null;
                    hashMap.put("country_code", b2 != null ? String.valueOf(b2) : null);
                    hashMap.put("operator_id", c != null ? String.valueOf(c) : null);
                    hashMap.put("cell_id", e != null ? String.valueOf(e) : null);
                    hashMap.put("lac", d != null ? String.valueOf(d) : null);
                    if (a != null) {
                        str = String.valueOf(a);
                    }
                    hashMap.put("signal_strength", str);
                    StringBuilder sb = new StringBuilder();
                    String str2 = "";
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str3 = (String) entry.getValue();
                        if (!TextUtils.isEmpty(str3)) {
                            sb.append(str2);
                            sb.append((String) entry.getKey());
                            sb.append("=");
                            sb.append(str3);
                            str2 = "&";
                        }
                    }
                    String unused = CellularNetworkInfo.this.f2461a = sb.toString();
                }
            }
        });
    }

    public String getCelluralInfo() {
        return this.f2461a;
    }
}
