package com.yandex.metrica.impl.p039ob;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.kk */
public class C3604kk {

    /* renamed from: a */
    public final String f3549a;

    /* renamed from: b */
    public final int f3550b;

    /* renamed from: c */
    public final long f3551c;

    /* renamed from: d */
    public final String f3552d;

    /* renamed from: e */
    public final Integer f3553e;

    /* renamed from: f */
    public final List<StackTraceElement> f3554f;

    public C3604kk(String str, int i, long j, String str2, Integer num, List<StackTraceElement> list) {
        this.f3549a = str;
        this.f3550b = i;
        this.f3551c = j;
        this.f3552d = str2;
        this.f3553e = num;
        this.f3554f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
