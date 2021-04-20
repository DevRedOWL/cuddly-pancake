package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Base64;
import androidx.core.p004os.EnvironmentCompat;
import com.yandex.metrica.impl.p039ob.C3121ad;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

/* renamed from: com.yandex.metrica.impl.ob.ar */
public final class C3144ar {

    /* renamed from: a */
    private final JSONObject f2590a;

    /* renamed from: b */
    private final C4281yc f2591b;

    /* renamed from: c */
    private final Context f2592c;

    /* renamed from: d */
    private final C3121ad f2593d;

    public C3144ar(Context context) {
        this(context, new C3121ad(context), new C4281yc());
    }

    public C3144ar(Context context, C3121ad adVar, C4281yc ycVar) {
        this.f2590a = new JSONObject();
        this.f2592c = context;
        this.f2593d = adVar;
        this.f2591b = ycVar;
    }

    /* renamed from: a */
    public C3144ar mo39516a() {
        try {
            mo39522f();
            mo39520d();
        } catch (Throwable unused) {
        }
        mo39518b();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3144ar mo39518b() {
        try {
            Object obj = Class.forName("kotlin.KotlinVersion").getDeclaredField("CURRENT").get((Object) null);
            int intValue = ((Integer) obj.getClass().getDeclaredMethod("getMajor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int intValue2 = ((Integer) obj.getClass().getDeclaredMethod("getMinor", new Class[0]).invoke(obj, new Object[0])).intValue();
            ((JSONObject) m2046a(this.f2590a, "dfid", new JSONObject())).put("kotlin_runtime", new JSONObject().put("major", intValue).put("minor", intValue2).put("patch", ((Integer) obj.getClass().getDeclaredMethod("getPatch", new Class[0]).invoke(obj, new Object[0])).intValue()));
        } catch (Throwable unused) {
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3144ar mo39519c() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) m2046a(this.f2590a, "dfid", new JSONObject());
        if (C3306cx.m2857a(21)) {
            jSONArray = m2049h();
        } else {
            jSONArray = m2050i();
        }
        jSONObject.put("cpu_abis", jSONArray);
        return this;
    }

    /* renamed from: h */
    private JSONArray m2049h() throws JSONException {
        return new JSONArray(Build.SUPPORTED_ABIS);
    }

    /* renamed from: i */
    private JSONArray m2050i() {
        ArrayList arrayList = new ArrayList();
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(Build.CPU_ABI)) {
            arrayList.add(Build.CPU_ABI);
        }
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(Build.CPU_ABI2)) {
            arrayList.add(Build.CPU_ABI2);
        }
        return new JSONArray(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3144ar mo39520d() throws JSONException {
        ((JSONObject) m2046a(this.f2590a, "dfid", new JSONObject())).put("boot_time", C4229wi.m6028a() / 1000);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3144ar mo39517a(boolean z) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject = (JSONObject) m2046a((JSONObject) m2046a(this.f2590a, "dfid", new JSONObject()), "au", new JSONObject());
        JSONArray jSONArray = (JSONArray) m2046a(jSONObject, "aun", new JSONArray());
        JSONArray jSONArray2 = (JSONArray) m2046a(jSONObject, "ausf", new JSONArray());
        JSONArray jSONArray3 = (JSONArray) m2046a(jSONObject, "audf", new JSONArray());
        JSONArray jSONArray4 = (JSONArray) m2046a(jSONObject, "aulu", new JSONArray());
        JSONArray jSONArray5 = new JSONArray();
        if (z) {
            m2046a(jSONObject, "aufi", jSONArray5);
        }
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : C3306cx.m2848a(this.f2592c, new String(Base64.decode("YW5kcm9pZC5pbnRlbnQuYWN0aW9uLk1BSU4=", 0), "UTF-8"), new String(Base64.decode("YW5kcm9pZC5pbnRlbnQuY2F0ZWdvcnkuTEFVTkNIRVI=", 0), "UTF-8"))) {
            ApplicationInfo applicationInfo = resolveInfo.activityInfo.applicationInfo;
            if (hashSet.add(applicationInfo.packageName)) {
                jSONArray.put(applicationInfo.packageName);
                boolean z2 = (applicationInfo.flags & 1) == 1;
                jSONArray2.put(z2);
                jSONArray4.put(new File(applicationInfo.sourceDir).lastModified());
                jSONArray3.put(true ^ applicationInfo.enabled);
                if (z) {
                    if (z2) {
                        jSONArray5.put(0);
                    } else {
                        PackageInfo a = this.f2591b.mo41859a(this.f2592c, applicationInfo.packageName);
                        if (a == null) {
                            jSONArray5.put(0);
                        } else {
                            jSONArray5.put(a.firstInstallTime / 1000);
                        }
                    }
                }
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3144ar mo39521e() throws JSONException {
        JSONObject jSONObject = (JSONObject) m2046a((JSONObject) m2046a(this.f2590a, "dfid", new JSONObject()), "apps", new JSONObject());
        JSONArray jSONArray = (JSONArray) m2046a(jSONObject, "names", new JSONArray());
        JSONArray jSONArray2 = (JSONArray) m2046a(jSONObject, "system_flags", new JSONArray());
        JSONArray jSONArray3 = (JSONArray) m2046a(jSONObject, "disabled_flags", new JSONArray());
        JSONArray jSONArray4 = (JSONArray) m2046a(jSONObject, "first_install_time", new JSONArray());
        JSONArray jSONArray5 = (JSONArray) m2046a(jSONObject, "last_update_time", new JSONArray());
        jSONObject.put(ClientCookie.VERSION_ATTR, 0);
        for (PackageInfo next : C3306cx.m2847a(this.f2592c)) {
            jSONArray.put(next.packageName);
            jSONArray2.put((next.applicationInfo.flags & 1) == 1);
            jSONArray3.put(!next.applicationInfo.enabled);
            m2047a(jSONArray4, next);
            m2048b(jSONArray5, next);
        }
        return this;
    }

    /* renamed from: a */
    private void m2047a(JSONArray jSONArray, PackageInfo packageInfo) {
        jSONArray.put(packageInfo.firstInstallTime / 1000);
    }

    /* renamed from: b */
    private void m2048b(JSONArray jSONArray, PackageInfo packageInfo) {
        jSONArray.put(packageInfo.lastUpdateTime / 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C3144ar mo39522f() throws JSONException {
        JSONObject jSONObject = (JSONObject) m2046a(this.f2590a, "dfid", new JSONObject());
        C3121ad.C3122a a = this.f2593d.mo39458a();
        jSONObject.put("tds", a.f2491a);
        jSONObject.put("fds", a.f2492b);
        return this;
    }

    /* renamed from: a */
    static <T> T m2046a(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, t);
        }
        return jSONObject.get(str);
    }

    public String toString() {
        return this.f2590a.toString();
    }

    /* renamed from: g */
    public String mo39523g() {
        return this.f2590a.toString();
    }
}
