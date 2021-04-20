package com.yandex.metrica.impl.p039ob;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.te */
public class C4076te {

    /* renamed from: a */
    public final List<C4079th> f4903a;

    /* renamed from: b */
    public final String f4904b;

    /* renamed from: c */
    public final long f4905c;

    /* renamed from: d */
    public final boolean f4906d;

    /* renamed from: e */
    public final boolean f4907e;

    public C4076te(List<C4079th> list, String str, long j, boolean z, boolean z2) {
        this.f4903a = Collections.unmodifiableList(list);
        this.f4904b = str;
        this.f4905c = j;
        this.f4906d = z;
        this.f4907e = z2;
    }

    public String toString() {
        return "SdkFingerprintingState{sdkItemList=" + this.f4903a + ", etag='" + this.f4904b + '\'' + ", lastAttemptTime=" + this.f4905c + ", hasFirstCollectionOccurred=" + this.f4906d + ", shouldRetry=" + this.f4907e + '}';
    }
}
