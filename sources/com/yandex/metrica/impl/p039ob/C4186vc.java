package com.yandex.metrica.impl.p039ob;

import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vc */
public class C4186vc implements C4192ve<List<C4185vb>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4170ux f5228a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3832pr f5229b;

    C4186vc(C4170ux uxVar, C3832pr prVar) {
        this.f5228a = uxVar;
        this.f5229b = prVar;
    }

    /* renamed from: a */
    public List<C4185vb> mo41637d() {
        ArrayList arrayList = new ArrayList();
        if (this.f5228a.mo41651h()) {
            if (C3306cx.m2857a(23)) {
                arrayList.addAll(m5818g());
                if (arrayList.size() == 0) {
                    arrayList.add(m5814b());
                }
            } else {
                arrayList.add(m5814b());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private C4185vb m5814b() {
        return new C4185vb(m5815c(), m5816e(), m5819h(), m5817f(), (String) null);
    }

    /* renamed from: c */
    private Integer m5815c() {
        return (Integer) C3306cx.m2841a(new C4236wo<TelephonyManager, Integer>() {
            /* renamed from: a */
            public Integer mo39698a(TelephonyManager telephonyManager) throws Throwable {
                String simOperator = telephonyManager.getSimOperator();
                String substring = !TextUtils.isEmpty(simOperator) ? simOperator.substring(0, 3) : null;
                if (TextUtils.isEmpty(substring)) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(substring));
            }
        }, this.f5228a.mo41646c(), "getting SimMcc", "TelephonyManager");
    }

    /* renamed from: e */
    private Integer m5816e() {
        return (Integer) C3306cx.m2841a(new C4236wo<TelephonyManager, Integer>() {
            /* renamed from: a */
            public Integer mo39698a(TelephonyManager telephonyManager) throws Throwable {
                String simOperator = telephonyManager.getSimOperator();
                String substring = !TextUtils.isEmpty(simOperator) ? simOperator.substring(3) : null;
                if (TextUtils.isEmpty(substring)) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(substring));
            }
        }, this.f5228a.mo41646c(), "getting SimMnc", "TelephonyManager");
    }

    /* renamed from: f */
    private String m5817f() {
        return (String) C3306cx.m2841a(new C4236wo<TelephonyManager, String>() {
            /* renamed from: a */
            public String mo39698a(TelephonyManager telephonyManager) throws Throwable {
                return telephonyManager.getSimOperatorName();
            }
        }, this.f5228a.mo41646c(), "getting SimOperatorName", "TelephonyManager");
    }

    /* renamed from: g */
    private List<C4185vb> m5818g() {
        ArrayList arrayList = new ArrayList();
        if (this.f5229b.mo40857d(this.f5228a.mo41647d())) {
            try {
                List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(this.f5228a.mo41647d()).getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null) {
                    for (SubscriptionInfo vbVar : activeSubscriptionInfoList) {
                        arrayList.add(new C4185vb(vbVar));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private boolean m5819h() {
        return ((Boolean) C3306cx.m2842a(new C4236wo<TelephonyManager, Boolean>() {
            /* renamed from: a */
            public Boolean mo39698a(TelephonyManager telephonyManager) throws Throwable {
                if (C4186vc.this.f5229b.mo40857d(C4186vc.this.f5228a.mo41647d())) {
                    return Boolean.valueOf(telephonyManager.isNetworkRoaming());
                }
                return null;
            }
        }, this.f5228a.mo41646c(), "getting NetworkRoaming", "TelephonyManager", false)).booleanValue();
    }
}
