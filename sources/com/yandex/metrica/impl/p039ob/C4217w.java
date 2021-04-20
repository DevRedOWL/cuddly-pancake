package com.yandex.metrica.impl.p039ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.metrica.impl.p039ob.C3125af;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.w */
public class C4217w implements Parcelable {
    public static final Parcelable.Creator<C4217w> CREATOR = new Parcelable.Creator<C4217w>() {
        /* renamed from: a */
        public C4217w createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C4248x.class.getClassLoader());
            C4217w a = new C4217w().mo41723a(readBundle.getInt("CounterReport.Type", C3125af.C3126a.EVENT_TYPE_UNDEFINED.mo39462a())).mo41727b(readBundle.getInt("CounterReport.CustomType")).mo40970c(C3303cu.m2825b(readBundle.getString("CounterReport.Value"), "")).mo40966a(readBundle.getString("CounterReport.UserInfo")).mo41733e(readBundle.getString("CounterReport.Environment")).mo40969b(readBundle.getString("CounterReport.Event")).m5941a((Pair<String, String>) C4217w.m5955d(readBundle)).mo41730c(readBundle.getInt("CounterReport.TRUNCATED")).mo40971d(readBundle.getString("CounterReport.ProfileID")).mo41724a(readBundle.getLong("CounterReport.CreationElapsedRealtime")).mo41728b(readBundle.getLong("CounterReport.CreationTimestamp")).mo41725a(C3134aj.m1988a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus"))));
            C3141ap apVar = (C3141ap) readBundle.getParcelable("CounterReport.IdentifiersData");
            if (apVar != null) {
                a.mo41726a(apVar);
            }
            return a;
        }

        /* renamed from: a */
        public C4217w[] newArray(int i) {
            return new C4217w[i];
        }
    };

    /* renamed from: a */
    String f5255a;

    /* renamed from: b */
    String f5256b;

    /* renamed from: c */
    int f5257c;

    /* renamed from: d */
    int f5258d;

    /* renamed from: e */
    int f5259e;

    /* renamed from: f */
    private String f5260f;

    /* renamed from: g */
    private String f5261g;

    /* renamed from: h */
    private Pair<String, String> f5262h;

    /* renamed from: i */
    private String f5263i;

    /* renamed from: j */
    private long f5264j;

    /* renamed from: k */
    private long f5265k;

    /* renamed from: l */
    private C3134aj f5266l;

    /* renamed from: m */
    private C3141ap f5267m;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f5255a);
        bundle.putString("CounterReport.Value", this.f5256b);
        bundle.putInt("CounterReport.Type", this.f5257c);
        bundle.putInt("CounterReport.CustomType", this.f5258d);
        bundle.putInt("CounterReport.TRUNCATED", this.f5259e);
        bundle.putString("CounterReport.ProfileID", this.f5263i);
        bundle.putInt("CounterReport.UniquenessStatus", this.f5266l.f2564d);
        C3141ap apVar = this.f5267m;
        if (apVar != null) {
            bundle.putParcelable("CounterReport.IdentifiersData", apVar);
        }
        String str = this.f5261g;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.f5260f;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.f5262h;
        if (pair != null) {
            m5948a(bundle, pair);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f5264j);
        bundle.putLong("CounterReport.CreationTimestamp", this.f5265k);
        parcel.writeBundle(bundle);
    }

    public C4217w() {
        this("", 0);
    }

    public C4217w(C4217w wVar) {
        this.f5266l = C3134aj.UNKNOWN;
        if (wVar != null) {
            this.f5255a = wVar.mo41731d();
            this.f5256b = wVar.mo41734e();
            this.f5257c = wVar.mo41736g();
            this.f5258d = wVar.mo41737h();
            this.f5260f = wVar.mo41741l();
            this.f5261g = wVar.mo41739j();
            this.f5262h = wVar.mo41740k();
            this.f5259e = wVar.mo41744o();
            this.f5263i = wVar.f5263i;
            this.f5264j = wVar.mo41747r();
            this.f5265k = wVar.mo41748s();
            this.f5266l = wVar.f5266l;
            this.f5267m = wVar.f5267m;
        }
    }

    public C4217w(String str, int i) {
        this("", str, i);
    }

    public C4217w(String str, String str2, int i) {
        this(str, str2, i, new C4227wg());
    }

    public C4217w(String str, String str2, int i, C4227wg wgVar) {
        this.f5266l = C3134aj.UNKNOWN;
        this.f5255a = str2;
        this.f5257c = i;
        this.f5256b = str;
        this.f5264j = wgVar.mo41770c();
        this.f5265k = wgVar.mo41768a();
    }

    /* renamed from: d */
    public String mo41731d() {
        return this.f5255a;
    }

    /* renamed from: b */
    public C4217w mo40969b(String str) {
        this.f5255a = str;
        return this;
    }

    /* renamed from: e */
    public String mo41734e() {
        return this.f5256b;
    }

    /* renamed from: f */
    public byte[] mo41735f() {
        return Base64.decode(this.f5256b, 0);
    }

    /* renamed from: c */
    public C4217w mo40970c(String str) {
        this.f5256b = str;
        return this;
    }

    /* renamed from: a */
    public C4217w mo40967a(byte[] bArr) {
        this.f5256b = new String(Base64.encode(bArr, 0));
        return this;
    }

    /* renamed from: g */
    public int mo41736g() {
        return this.f5257c;
    }

    /* renamed from: a */
    public C4217w mo41723a(int i) {
        this.f5257c = i;
        return this;
    }

    /* renamed from: h */
    public int mo41737h() {
        return this.f5258d;
    }

    /* renamed from: b */
    public C4217w mo41727b(int i) {
        this.f5258d = i;
        return this;
    }

    /* renamed from: i */
    public C3141ap mo41738i() {
        return this.f5267m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo41739j() {
        return this.f5261g;
    }

    /* renamed from: k */
    public Pair<String, String> mo41740k() {
        return this.f5262h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C4217w mo41733e(String str) {
        this.f5261g = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4217w mo41729b(String str, String str2) {
        if (this.f5262h == null) {
            this.f5262h = new Pair<>(str, str2);
        }
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C4217w m5941a(Pair<String, String> pair) {
        this.f5262h = pair;
        return this;
    }

    /* renamed from: l */
    public String mo41741l() {
        return this.f5260f;
    }

    /* renamed from: a */
    public C4217w mo40966a(String str) {
        this.f5260f = str;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C4217w mo41730c(int i) {
        this.f5259e = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4217w mo41724a(long j) {
        this.f5264j = j;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C4217w mo41728b(long j) {
        this.f5265k = j;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4217w mo41726a(C3141ap apVar) {
        this.f5267m = apVar;
        return this;
    }

    /* renamed from: m */
    public boolean mo41742m() {
        return this.f5255a == null;
    }

    /* renamed from: n */
    public boolean mo41743n() {
        return C3125af.C3126a.EVENT_TYPE_UNDEFINED.mo39462a() == this.f5257c;
    }

    /* renamed from: o */
    public int mo41744o() {
        return this.f5259e;
    }

    /* renamed from: p */
    public String mo41745p() {
        return this.f5263i;
    }

    /* renamed from: d */
    public C4217w mo40971d(String str) {
        this.f5263i = str;
        return this;
    }

    /* renamed from: q */
    public C3134aj mo41746q() {
        return this.f5266l;
    }

    /* renamed from: a */
    public C4217w mo41725a(C3134aj ajVar) {
        this.f5266l = ajVar;
        return this;
    }

    /* renamed from: r */
    public long mo41747r() {
        return this.f5264j;
    }

    /* renamed from: s */
    public long mo41748s() {
        return this.f5265k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo41722a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public String toString() {
        return String.format(Locale.US, "[event: %s, type: %s, value: %s]", new Object[]{this.f5255a, C3125af.C3126a.m1967a(this.f5257c).mo39463b(), this.f5256b});
    }

    /* renamed from: a */
    private static void m5948a(Bundle bundle, Pair<String, String> pair) {
        bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
        bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Pair<String, String> m5955d(Bundle bundle) {
        if (!bundle.containsKey("CounterReport.AppEnvironmentDiffKey") || !bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return null;
        }
        return new Pair<>(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
    }

    /* renamed from: b */
    public static C4217w m5949b(Bundle bundle) {
        if (bundle != null) {
            try {
                C4217w wVar = (C4217w) bundle.getParcelable("CounterReport.Object");
                if (wVar != null) {
                    return wVar;
                }
            } catch (Throwable unused) {
                return new C4217w();
            }
        }
        return new C4217w();
    }

    /* renamed from: a */
    public static C4217w m5944a(C4217w wVar, C3125af.C3126a aVar) {
        C4217w a = m5942a(wVar);
        a.mo41723a(aVar.mo39462a());
        return a;
    }

    /* renamed from: a */
    public static C4217w m5942a(C4217w wVar) {
        C4217w wVar2 = new C4217w(wVar);
        wVar2.mo40969b("");
        wVar2.mo40970c("");
        return wVar2;
    }

    /* renamed from: b */
    public static C4217w m5950b(C4217w wVar) {
        return m5944a(wVar, C3125af.C3126a.EVENT_TYPE_ALIVE);
    }

    /* renamed from: c */
    public static C4217w m5953c(C4217w wVar) {
        return m5944a(wVar, C3125af.C3126a.EVENT_TYPE_START);
    }

    /* renamed from: d */
    public static C4217w m5956d(C4217w wVar) {
        return m5944a(wVar, C3125af.C3126a.EVENT_TYPE_INIT);
    }

    /* renamed from: a */
    public static C4217w m5940a(Context context) {
        Integer num;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (C3306cx.m2857a(21)) {
                num = m5951b(context);
                if (num == null) {
                    num = m5954c(context);
                }
            } else {
                num = m5954c(context);
            }
            if (num != null) {
                jSONObject2.put("battery", num);
            }
            jSONObject2.put("boot_time_seconds", C4229wi.m6031d());
            jSONObject.put("dfid", jSONObject2);
        } catch (Throwable unused) {
        }
        C4217w b = new C4217w().mo40969b("");
        b.mo41723a(C3125af.C3126a.EVENT_TYPE_IDENTITY_LIGHT.mo39462a()).mo40970c(jSONObject.toString());
        return b;
    }

    /* renamed from: b */
    private static Integer m5951b(Context context) {
        int intProperty;
        BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
        if (batteryManager == null || (intProperty = batteryManager.getIntProperty(4)) == 0) {
            return null;
        }
        return Integer.valueOf(intProperty);
    }

    /* renamed from: c */
    private static Integer m5954c(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                return Integer.valueOf((intExtra * 100) / intExtra2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C4217w m5945a(C4217w wVar, C3391en enVar) {
        C3144ar a = new C3144ar(enVar.mo40027k()).mo39516a();
        try {
            if (enVar.mo40039w()) {
                a.mo39521e();
            }
            if (enVar.mo40025i().mo41332F()) {
                a.mo39517a(enVar.mo40025i().mo41333G());
            }
            a.mo39519c();
        } catch (Throwable unused) {
        }
        C4217w a2 = m5942a(wVar);
        a2.mo41723a(C3125af.C3126a.EVENT_TYPE_IDENTITY.mo39462a()).mo40970c(a.mo39523g());
        return a2;
    }

    /* renamed from: a */
    public static C4217w m5947a(C4217w wVar, Collection<C3835pu> collection, C3623l lVar, C3543j jVar, List<String> list) {
        String str;
        C4217w a = m5942a(wVar);
        try {
            JSONArray jSONArray = new JSONArray();
            for (C3835pu next : collection) {
                jSONArray.put(new JSONObject().put("name", next.f4082a).put("granted", next.f4083b));
            }
            JSONObject jSONObject = new JSONObject();
            if (lVar != null) {
                jSONObject.put("background_restricted", lVar.f3614b);
                jSONObject.put("app_standby_bucket", jVar.mo40269a(lVar.f3613a));
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray(list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        return a.mo41723a(C3125af.C3126a.EVENT_TYPE_PERMISSIONS.mo39462a()).mo40970c(str);
    }

    /* renamed from: a */
    public static C4217w m5946a(C4217w wVar, String str) {
        return m5942a(wVar).mo41723a(C3125af.C3126a.EVENT_TYPE_APP_FEATURES.mo39462a()).mo40970c(str);
    }

    /* renamed from: e */
    public static C4217w m5957e(C4217w wVar) {
        return m5944a(wVar, C3125af.C3126a.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* renamed from: f */
    public static C4217w m5958f(C4217w wVar) {
        return m5944a(wVar, C3125af.C3126a.EVENT_TYPE_APP_UPDATE);
    }

    /* renamed from: t */
    public static C4217w m5959t() {
        return new C4217w().mo41723a(C3125af.C3126a.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.mo39462a());
    }
}
