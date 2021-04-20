package com.yandex.metrica.impl.p039ob;

import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.p004os.EnvironmentCompat;

/* renamed from: com.yandex.metrica.impl.ob.uw */
public class C4162uw implements C4192ve<C4155uu> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final SparseArray<String> f5172a = new SparseArray<String>() {
        {
            put(0, (Object) null);
            put(7, "1xRTT");
            put(4, "CDMA");
            put(2, "EDGE");
            put(14, "eHRPD");
            put(5, "EVDO rev.0");
            put(6, "EVDO rev.A");
            put(12, "EVDO rev.B");
            put(1, "GPRS");
            put(8, "HSDPA");
            put(10, "HSPA");
            put(15, "HSPA+");
            put(9, "HSUPA");
            put(11, "iDen");
            put(3, "UMTS");
            put(12, "EVDO rev.B");
            if (C3306cx.m2857a(11)) {
                put(14, "eHRPD");
                put(13, "LTE");
                if (C3306cx.m2857a(13)) {
                    put(15, "HSPA+");
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4170ux f5173b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3832pr f5174c;

    public C4162uw(C4170ux uxVar, C3832pr prVar) {
        this.f5173b = uxVar;
        this.f5174c = prVar;
    }

    /* renamed from: a */
    public C4155uu mo41637d() {
        if (this.f5173b.mo41652i()) {
            return new C4155uu(m5734f(), m5735g(), mo41636c(), mo41635b(), m5737i(), m5736h(), (Integer) null, true, 0, (Integer) null, (Long) null);
        }
        return null;
    }

    /* renamed from: f */
    private Integer m5734f() {
        return (Integer) C3306cx.m2841a(new C4236wo<TelephonyManager, Integer>() {
            /* renamed from: a */
            public Integer mo39698a(TelephonyManager telephonyManager) throws Throwable {
                String networkOperator = telephonyManager.getNetworkOperator();
                String substring = !TextUtils.isEmpty(networkOperator) ? networkOperator.substring(0, 3) : null;
                if (!TextUtils.isEmpty(substring)) {
                    return Integer.valueOf(Integer.parseInt(substring));
                }
                return null;
            }
        }, this.f5173b.mo41646c(), "getting phoneMcc", "TelephonyManager");
    }

    /* renamed from: g */
    private Integer m5735g() {
        return (Integer) C3306cx.m2841a(new C4236wo<TelephonyManager, Integer>() {
            /* renamed from: a */
            public Integer mo39698a(TelephonyManager telephonyManager) throws Throwable {
                String networkOperator = telephonyManager.getNetworkOperator();
                String substring = !TextUtils.isEmpty(networkOperator) ? networkOperator.substring(3) : null;
                if (!TextUtils.isEmpty(substring)) {
                    return Integer.valueOf(Integer.parseInt(substring));
                }
                return null;
            }
        }, this.f5173b.mo41646c(), "getting phoneMnc", "TelephonyManager");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Integer mo41635b() {
        return (Integer) C3306cx.m2841a(new C4236wo<TelephonyManager, Integer>() {
            /* renamed from: a */
            public Integer mo39698a(TelephonyManager telephonyManager) throws Throwable {
                if (!C4162uw.this.f5174c.mo40856c(C4162uw.this.f5173b.mo41647d())) {
                    return null;
                }
                GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                int cid = gsmCellLocation != null ? gsmCellLocation.getCid() : 1;
                if (1 != cid) {
                    return Integer.valueOf(cid);
                }
                return null;
            }
        }, this.f5173b.mo41646c(), "getting phoneCellId", "TelephonyManager");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Integer mo41636c() {
        return (Integer) C3306cx.m2841a(new C4236wo<TelephonyManager, Integer>() {
            /* renamed from: a */
            public Integer mo39698a(TelephonyManager telephonyManager) throws Throwable {
                CellLocation cellLocation;
                int lac;
                if (!C4162uw.this.f5174c.mo40856c(C4162uw.this.f5173b.mo41647d()) || (cellLocation = telephonyManager.getCellLocation()) == null || 1 == (lac = ((GsmCellLocation) cellLocation).getLac())) {
                    return null;
                }
                return Integer.valueOf(lac);
            }
        }, this.f5173b.mo41646c(), "getting phoneLac", "TelephonyManager");
    }

    /* renamed from: h */
    private String m5736h() {
        return (String) C3306cx.m2842a(new C4236wo<TelephonyManager, String>() {
            /* renamed from: a */
            public String mo39698a(TelephonyManager telephonyManager) throws Throwable {
                return (String) C4162uw.f5172a.get(telephonyManager.getNetworkType(), EnvironmentCompat.MEDIA_UNKNOWN);
            }
        }, this.f5173b.mo41646c(), "getting networkType", "TelephonyManager", EnvironmentCompat.MEDIA_UNKNOWN);
    }

    /* renamed from: i */
    private String m5737i() {
        return (String) C3306cx.m2841a(new C4236wo<TelephonyManager, String>() {
            /* renamed from: a */
            public String mo39698a(TelephonyManager telephonyManager) throws Throwable {
                return telephonyManager.getNetworkOperatorName();
            }
        }, this.f5173b.mo41646c(), "getting network operator name", "TelephonyManager");
    }
}
