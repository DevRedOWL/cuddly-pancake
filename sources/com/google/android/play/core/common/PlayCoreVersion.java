package com.google.android.play.core.common;

import android.os.Bundle;
import com.google.android.play.core.internal.C2241ag;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlayCoreVersion {

    /* renamed from: a */
    private static final Set<String> f1892a = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));

    /* renamed from: b */
    private static final Set<String> f1893b = new HashSet(Arrays.asList(new String[]{"native", "unity"}));

    /* renamed from: c */
    private static final Map<String, Map<String, Integer>> f1894c = new HashMap();

    /* renamed from: d */
    private static final C2241ag f1895d = new C2241ag("PlayCoreVersion");

    private PlayCoreVersion() {
    }

    /* renamed from: a */
    public static synchronized Map<String, Integer> m1115a(String str) {
        Map<String, Integer> map;
        synchronized (PlayCoreVersion.class) {
            if (!f1894c.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10901);
                f1894c.put(str, hashMap);
            }
            map = f1894c.get(str);
        }
        return map;
    }

    public static synchronized void addVersion(String str, String str2, int i) {
        synchronized (PlayCoreVersion.class) {
            if (!f1892a.contains(str)) {
                f1895d.mo33812e("Illegal module name: %s", str);
            } else if (!f1893b.contains(str2)) {
                f1895d.mo33812e("Illegal platform name: %s", str2);
            } else {
                m1115a(str).put(str2, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: b */
    public static Bundle m1116b(String str) {
        Bundle bundle = new Bundle();
        Map<String, Integer> a = m1115a(str);
        bundle.putInt("playcore_version_code", a.get("java").intValue());
        if (a.containsKey("native")) {
            bundle.putInt("playcore_native_version", a.get("native").intValue());
        }
        if (a.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", a.get("unity").intValue());
        }
        return bundle;
    }
}
