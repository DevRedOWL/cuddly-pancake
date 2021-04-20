package com.google.android.play.core.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.common.a */
public final class C2229a {

    /* renamed from: a */
    private final Map<String, Object> f1896a = new HashMap();

    /* renamed from: b */
    private final AtomicBoolean f1897b = new AtomicBoolean(false);

    /* renamed from: b */
    private final synchronized void m1117b() {
        this.f1896a.put("assetOnlyUpdates", false);
    }

    /* renamed from: a */
    public final synchronized boolean mo33792a() {
        if (!this.f1897b.get()) {
            m1117b();
        }
        Object obj = this.f1896a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
