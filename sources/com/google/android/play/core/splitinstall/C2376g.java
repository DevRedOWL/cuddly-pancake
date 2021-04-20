package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.splitinstall.g */
public final class C2376g {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f2105a = new HashMap();

    /* renamed from: a */
    public final C2377h mo34028a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f2105a.entrySet()) {
            hashMap.put((String) next.getKey(), Collections.unmodifiableMap(new HashMap((Map) next.getValue())));
        }
        return new C2377h(Collections.unmodifiableMap(hashMap));
    }

    /* renamed from: b */
    public final void mo34029b(String str, String str2, String str3) {
        if (!this.f2105a.containsKey(str2)) {
            this.f2105a.put(str2, new HashMap());
        }
        this.f2105a.get(str2).put(str, str3);
    }
}
