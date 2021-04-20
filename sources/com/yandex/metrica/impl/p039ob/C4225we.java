package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.we */
public class C4225we {
    /* renamed from: a */
    public static String m6008a(Map<String, String> map) {
        if (C3306cx.m2862a((Map) map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                sb.append((String) next.getKey());
                sb.append(":");
                sb.append((String) next.getValue());
                sb.append(",");
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: a */
    public static Map<String, String> m6009a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int indexOf = str2.indexOf(":");
                if (indexOf != -1) {
                    String substring = str2.substring(0, indexOf);
                    if (!TextUtils.isEmpty(substring)) {
                        hashMap.put(substring, str2.substring(indexOf + 1));
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static boolean m6010b(String str) {
        return m6011b(m6009a(str));
    }

    /* renamed from: b */
    public static boolean m6011b(Map<String, String> map) {
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry value : map.entrySet()) {
            try {
                Integer.parseInt((String) value.getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static Map<String, String> m6012c(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (m6014d((String) next.getKey()) && m6013c((String) next.getValue())) {
                    hashMap.put(next.getKey(), next.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    private static boolean m6013c(String str) {
        return !TextUtils.isEmpty(str) && C4215vy.m5929a(str, -1) != -1;
    }

    /* renamed from: d */
    private static boolean m6014d(String str) {
        return !TextUtils.isEmpty(str) && !str.contains(":") && !str.contains(",") && !str.contains("&");
    }
}
