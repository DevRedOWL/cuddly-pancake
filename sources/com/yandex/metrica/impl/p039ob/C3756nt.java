package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import com.yandex.metrica.impl.p039ob.C4179v;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.nt */
public class C3756nt {

    /* renamed from: a */
    private final String f3887a;

    /* renamed from: b */
    private final String f3888b;

    /* renamed from: c */
    private final String f3889c;

    /* renamed from: d */
    private final Point f3890d;

    public C3756nt(Context context, String str, C3832pr prVar) {
        this.f3887a = Build.MANUFACTURER;
        this.f3888b = Build.MODEL;
        this.f3889c = m4292a(context, str, prVar);
        C4179v.C4183b bVar = C4179v.m5795a(context).f5209f;
        this.f3890d = new Point(bVar.f5219a, bVar.f5220b);
    }

    /* renamed from: a */
    private String m4292a(Context context, String str, C3832pr prVar) {
        if (C3306cx.m2857a(28)) {
            if (prVar.mo40857d(context)) {
                try {
                    return Build.getSerial();
                } catch (Throwable unused) {
                }
            }
            return C4232wk.m6042b(str, "");
        } else if (C3306cx.m2857a(8)) {
            return Build.SERIAL;
        } else {
            return C4232wk.m6042b(str, "");
        }
    }

    /* renamed from: a */
    public String mo40721a() {
        return this.f3889c;
    }

    public C3756nt(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f3887a = jSONObject.getString("manufacturer");
        this.f3888b = jSONObject.getString("model");
        this.f3889c = jSONObject.getString("serial");
        this.f3890d = new Point(jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    /* renamed from: b */
    public JSONObject mo40722b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("manufacturer", this.f3887a);
        jSONObject.put("model", this.f3888b);
        jSONObject.put("serial", this.f3889c);
        jSONObject.put("width", this.f3890d.x);
        jSONObject.put("height", this.f3890d.y);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3756nt ntVar = (C3756nt) obj;
        String str = this.f3887a;
        if (str == null ? ntVar.f3887a != null : !str.equals(ntVar.f3887a)) {
            return false;
        }
        String str2 = this.f3888b;
        if (str2 == null ? ntVar.f3888b != null : !str2.equals(ntVar.f3888b)) {
            return false;
        }
        Point point = this.f3890d;
        Point point2 = ntVar.f3890d;
        if (point != null) {
            return point.equals(point2);
        }
        if (point2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3887a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3888b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Point point = this.f3890d;
        if (point != null) {
            i = point.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "DeviceSnapshot{mManufacturer='" + this.f3887a + '\'' + ", mModel='" + this.f3888b + '\'' + ", mSerial='" + this.f3889c + '\'' + ", mScreenSize=" + this.f3890d + '}';
    }
}
