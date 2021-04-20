package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.yandex.metrica.impl.p039ob.C3807p;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.cy */
public class C3307cy implements C3807p {

    /* renamed from: f */
    private static volatile C3307cy f2984f;

    /* renamed from: g */
    private static final Object f2985g = new Object();

    /* renamed from: a */
    private final Context f2986a;

    /* renamed from: b */
    private final WifiManager f2987b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3832pr f2988c;

    /* renamed from: d */
    private C3838px f2989d;

    /* renamed from: e */
    private C4226wf f2990e;

    /* renamed from: h */
    private C3807p.C3808a<JSONArray> f2991h;

    /* renamed from: i */
    private C3807p.C3808a<List<C3316a>> f2992i;

    /* renamed from: j */
    private C4143uk f2993j;

    /* renamed from: k */
    private final C3833ps f2994k;

    private C3307cy(Context context) {
        this(context, (WifiManager) context.getApplicationContext().getSystemService("wifi"), new C3838px());
    }

    private C3307cy(Context context, WifiManager wifiManager, C3838px pxVar) {
        this(context, wifiManager, pxVar, new C3832pr(pxVar.mo40869a()), new C4226wf());
    }

    /* renamed from: a */
    public static C3307cy m2873a(Context context) {
        if (f2984f == null) {
            synchronized (f2985g) {
                if (f2984f == null) {
                    f2984f = new C3307cy(context.getApplicationContext());
                }
            }
        }
        return f2984f;
    }

    /* renamed from: a */
    public void mo39868a(C4143uk ukVar) {
        this.f2993j = ukVar;
        this.f2989d.mo40870a(ukVar);
        this.f2988c.mo40852a(this.f2989d.mo40869a());
    }

    /* renamed from: a */
    public synchronized JSONArray mo39867a() {
        if (!m2886f()) {
            return new JSONArray();
        }
        if (this.f2991h.mo40826b() || this.f2991h.mo40827c()) {
            this.f2991h.mo40824a(m2885e());
        }
        return this.f2991h.mo40823a();
    }

    /* renamed from: a */
    private String m2875a(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US).replace(":", "");
    }

    /* renamed from: c */
    private List<ScanResult> m2883c() {
        return (List) C3306cx.m2841a(new C4236wo<WifiManager, List<ScanResult>>() {
            /* renamed from: a */
            public List<ScanResult> mo39698a(WifiManager wifiManager) throws Throwable {
                return wifiManager.getScanResults();
            }
        }, this.f2987b, "getting scan results", "WifiManager");
    }

    /* renamed from: d */
    private WifiInfo m2884d() {
        return (WifiInfo) C3306cx.m2841a(new C4236wo<WifiManager, WifiInfo>() {
            /* renamed from: a */
            public WifiInfo mo39698a(WifiManager wifiManager) throws Throwable {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo == null) {
                    return connectionInfo;
                }
                if ("00:00:00:00:00:00".equals(connectionInfo.getBSSID()) || "02:00:00:00:00:00".equals(connectionInfo.getBSSID()) || connectionInfo.getIpAddress() == 0) {
                    return null;
                }
                return connectionInfo;
            }
        }, this.f2987b, "getting connection info", "WifiManager");
    }

    /* renamed from: e */
    private JSONArray m2885e() {
        String str;
        JSONObject a;
        String str2 = null;
        List<ScanResult> c = (!m2890j() || !this.f2994k.mo39878a(this.f2986a)) ? null : m2883c();
        WifiInfo d = (!m2889i() || !this.f2988c.mo40858e(this.f2986a)) ? null : m2884d();
        if (d == null) {
            str = null;
        } else {
            str = d.getBSSID();
        }
        JSONArray jSONArray = new JSONArray();
        if (c != null) {
            for (ScanResult next : c) {
                if (!(next == null || "02:00:00:00:00:00".equals(next.BSSID) || (a = m2876a(str, next)) == null)) {
                    jSONArray.put(a);
                }
            }
        } else if (d != null) {
            String a2 = m2875a(str);
            String ssid = d.getSSID();
            if (ssid != null) {
                str2 = m2882b(ssid);
            }
            JSONObject a3 = m2877a(a2, str2, true, d.getRssi(), 0L);
            if (a3 != null) {
                jSONArray.put(a3);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private JSONObject m2876a(String str, ScanResult scanResult) {
        String str2 = null;
        boolean z = false;
        try {
            String str3 = scanResult.BSSID;
            if (str3 != null) {
                z = str3.equals(str);
                str2 = m2875a(str3);
            }
        } catch (NoSuchFieldError unused) {
        }
        return m2877a(str2, scanResult.SSID, z, scanResult.level, m2874a(scanResult));
    }

    /* renamed from: a */
    private Long m2874a(ScanResult scanResult) {
        if (Build.VERSION.SDK_INT >= 17) {
            return m2881b(scanResult);
        }
        return null;
    }

    /* renamed from: b */
    private Long m2881b(ScanResult scanResult) {
        return Long.valueOf(this.f2990e.mo41763a(scanResult.timestamp, TimeUnit.MICROSECONDS));
    }

    /* renamed from: b */
    private String m2882b(String str) {
        return str.replace("\"", "");
    }

    /* renamed from: a */
    private JSONObject m2877a(String str, String str2, boolean z, int i, Long l) {
        try {
            return new JSONObject().put("mac", str).put("ssid", str2).put("signal_strength", i).put("is_connected", z).put("last_visible_offset_seconds", l);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private boolean m2886f() {
        return ((Boolean) C3306cx.m2842a(new C4236wo<WifiManager, Boolean>() {
            /* renamed from: a */
            public Boolean mo39698a(WifiManager wifiManager) throws Throwable {
                return Boolean.valueOf(wifiManager.isWifiEnabled());
            }
        }, this.f2987b, "getting wifi enabled state", "WifiManager", false)).booleanValue();
    }

    /* renamed from: b */
    public List<C3316a> mo39871b() {
        if (this.f2992i.mo40826b() || this.f2992i.mo40827c()) {
            ArrayList arrayList = new ArrayList();
            m2878a((List<C3316a>) arrayList);
            this.f2992i.mo40824a(arrayList);
        }
        return this.f2992i.mo40823a();
    }

    /* renamed from: a */
    private void m2878a(List<C3316a> list) {
        if (m2888h()) {
            StringBuilder sb = new StringBuilder();
            try {
                Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while (it.hasNext()) {
                    NetworkInterface networkInterface = (NetworkInterface) it.next();
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress != null) {
                        for (byte valueOf : hardwareAddress) {
                            sb.append(String.format(Locale.US, "%02X:", new Object[]{Byte.valueOf(valueOf)}));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                            list.add(new C3316a(networkInterface.getName(), sb.toString()));
                            sb.setLength(0);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public String mo39870b(final Context context) {
        return (String) C3306cx.m2841a(new C4236wo<WifiManager, String>() {
            /* renamed from: a */
            public String mo39698a(WifiManager wifiManager) throws Throwable {
                WifiConfiguration wifiConfiguration;
                if (!C3307cy.this.m2887g() || !C3307cy.this.f2988c.mo40858e(context) || (wifiConfiguration = (WifiConfiguration) wifiManager.getClass().getMethod("getWifiApConfiguration", new Class[0]).invoke(wifiManager, new Object[0])) == null) {
                    return null;
                }
                return wifiConfiguration.SSID;
            }
        }, this.f2987b, "getting wifi access point name", "WifiManager");
    }

    /* renamed from: c */
    public int mo39872c(final Context context) {
        return ((Integer) C3306cx.m2842a(new C4236wo<WifiManager, Integer>() {
            /* renamed from: a */
            public Integer mo39698a(WifiManager wifiManager) throws Throwable {
                if (!C3307cy.this.m2887g() || !C3307cy.this.f2988c.mo40858e(context)) {
                    return null;
                }
                int intValue = ((Integer) wifiManager.getClass().getMethod("getWifiApState", new Class[0]).invoke(wifiManager, new Object[0])).intValue();
                if (intValue > 10) {
                    intValue -= 10;
                }
                return Integer.valueOf(intValue);
            }
        }, this.f2987b, "getting access point state", "WifiManager", -1)).intValue();
    }

    /* renamed from: com.yandex.metrica.impl.ob.cy$a */
    public static final class C3316a {

        /* renamed from: a */
        public final String f3005a;

        /* renamed from: b */
        public final String f3006b;

        public C3316a(String str, String str2) {
            this.f3005a = str;
            this.f3006b = str2;
        }
    }

    /* renamed from: a */
    public void mo39869a(boolean z) {
        this.f2989d.mo40871a(z);
        this.f2988c.mo40852a(this.f2989d.mo40869a());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public synchronized boolean m2887g() {
        return m2891k() && this.f2993j.f5101o.f5005l;
    }

    /* renamed from: h */
    private synchronized boolean m2888h() {
        return m2891k() && this.f2993j.f5101o.f5004k;
    }

    /* renamed from: i */
    private synchronized boolean m2889i() {
        return m2891k() && this.f2993j.f5101o.f5003j;
    }

    /* renamed from: j */
    private synchronized boolean m2890j() {
        return m2891k() && this.f2993j.f5101o.f5002i;
    }

    /* renamed from: k */
    private synchronized boolean m2891k() {
        return this.f2993j != null;
    }

    C3307cy(Context context, WifiManager wifiManager, C3838px pxVar, C3832pr prVar, C4226wf wfVar) {
        this.f2989d = new C3838px();
        this.f2991h = new C3807p.C3808a<>();
        this.f2992i = new C3807p.C3808a<>();
        this.f2986a = context;
        this.f2987b = wifiManager;
        this.f2989d = pxVar;
        this.f2988c = prVar;
        this.f2994k = m2892l();
        this.f2990e = wfVar;
    }

    /* renamed from: l */
    private C3833ps m2892l() {
        if (C3306cx.m2857a(28)) {
            return new C3833ps() {
                /* renamed from: a */
                public boolean mo39878a(Context context) {
                    return C3307cy.this.f2988c.mo40856c(context) && C3307cy.this.f2988c.mo40858e(context);
                }
            };
        }
        if (C3306cx.m2857a(26)) {
            return new C3833ps() {
                /* renamed from: a */
                public boolean mo39878a(Context context) {
                    return C3307cy.this.f2988c.mo40856c(context) || C3307cy.this.f2988c.mo40859f(context);
                }
            };
        }
        return new C3833ps() {
            /* renamed from: a */
            public boolean mo39878a(Context context) {
                return C3307cy.this.f2988c.mo40856c(context);
            }
        };
    }
}
