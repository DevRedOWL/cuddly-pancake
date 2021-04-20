package com.yandex.metrica.impl.p039ob;

import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.uz */
public class C4176uz implements C4192ve<List<String>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4170ux f5198a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3832pr f5199b;

    C4176uz(C4170ux uxVar, C3832pr prVar) {
        this.f5198a = uxVar;
        this.f5199b = prVar;
    }

    /* renamed from: a */
    public List<String> mo41637d() {
        ArrayList arrayList = new ArrayList();
        if (this.f5198a.mo41650g()) {
            if (C3306cx.m2857a(23)) {
                arrayList.addAll(m5788c());
            } else {
                arrayList.add(m5787b());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private String m5787b() {
        return (String) C3306cx.m2841a(new C4236wo<TelephonyManager, String>() {
            /* renamed from: a */
            public String mo39698a(TelephonyManager telephonyManager) throws Throwable {
                if (C4176uz.this.f5199b.mo40857d(C4176uz.this.f5198a.mo41647d())) {
                    return telephonyManager.getDeviceId();
                }
                return null;
            }
        }, this.f5198a.mo41646c(), "getting imei", "TelephonyManager");
    }

    /* renamed from: c */
    private List<String> m5788c() {
        return (List) C3306cx.m2842a(new C4236wo<TelephonyManager, List<String>>() {
            /* renamed from: a */
            public List<String> mo39698a(TelephonyManager telephonyManager) throws Throwable {
                HashSet hashSet = new HashSet();
                if (C4176uz.this.f5199b.mo40857d(C4176uz.this.f5198a.mo41647d())) {
                    for (int i = 0; i < 10; i++) {
                        String deviceId = telephonyManager.getDeviceId(i);
                        if (deviceId != null) {
                            hashSet.add(deviceId);
                        }
                    }
                }
                return new ArrayList(hashSet);
            }
        }, this.f5198a.mo41646c(), "getting all imeis", "TelephonyManager", new ArrayList());
    }
}
