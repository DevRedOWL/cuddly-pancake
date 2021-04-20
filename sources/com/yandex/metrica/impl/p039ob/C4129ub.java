package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ub */
public class C4129ub {

    /* renamed from: a */
    public final long f5047a;

    /* renamed from: b */
    public final String f5048b;

    /* renamed from: c */
    public final List<Integer> f5049c;

    /* renamed from: d */
    public final long f5050d;

    /* renamed from: e */
    public final int f5051e;

    public C4129ub(long j, String str, List<Integer> list, long j2, int i) {
        this.f5047a = j;
        this.f5048b = str;
        this.f5049c = Collections.unmodifiableList(list);
        this.f5050d = j2;
        this.f5051e = i;
    }

    /* renamed from: a */
    public static C4129ub m5558a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C4129ub(jSONObject.getLong("seconds_to_live"), jSONObject.getString("token"), m5559a(jSONObject.getJSONArray("ports")), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static ArrayList<Integer> m5559a(JSONArray jSONArray) throws JSONException {
        ArrayList<Integer> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4129ub ubVar = (C4129ub) obj;
        if (this.f5047a != ubVar.f5047a || this.f5050d != ubVar.f5050d || this.f5051e != ubVar.f5051e) {
            return false;
        }
        String str = this.f5048b;
        if (str == null ? ubVar.f5048b != null : !str.equals(ubVar.f5048b)) {
            return false;
        }
        List<Integer> list = this.f5049c;
        List<Integer> list2 = ubVar.f5049c;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5047a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f5048b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<Integer> list = this.f5049c;
        if (list != null) {
            i2 = list.hashCode();
        }
        long j2 = this.f5050d;
        return ((((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f5051e;
    }

    public String toString() {
        return "SocketConfig{secondsToLive=" + this.f5047a + ", token='" + this.f5048b + '\'' + ", ports=" + this.f5049c + ", firstDelaySeconds=" + this.f5050d + ", launchDelaySeconds=" + this.f5051e + '}';
    }
}
