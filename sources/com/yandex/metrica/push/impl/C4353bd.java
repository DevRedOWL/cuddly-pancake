package com.yandex.metrica.push.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.bd */
public abstract class C4353bd implements C4345bb {

    /* renamed from: a */
    private final C4354a f5465a;

    /* renamed from: com.yandex.metrica.push.impl.bd$a */
    public enum C4354a {
        EVENT_PUSH_TOKEN(14, "Push token"),
        EVENT_NOTIFICATION(15, "Push notification");
        

        /* renamed from: c */
        private final int f5469c;

        /* renamed from: d */
        private final String f5470d;

        private C4354a(int i, String str) {
            this.f5469c = i;
            this.f5470d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo41982a() {
            return this.f5469c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo41983b() {
            return this.f5470d;
        }
    }

    protected C4353bd(C4354a aVar) {
        this.f5465a = aVar;
    }

    /* renamed from: a */
    public int mo41977a() {
        return this.f5465a.mo41982a();
    }

    /* renamed from: b */
    public String mo41978b() {
        return this.f5465a.mo41983b();
    }

    /* renamed from: d */
    public Map<String, String> mo41980d() {
        HashMap hashMap = new HashMap();
        hashMap.put("appmetrica_push_version", "23");
        hashMap.put("appmetrica_push_version_name", "1.5.1");
        hashMap.put("appmetrica_push_transport", "firebase");
        return hashMap;
    }
}
