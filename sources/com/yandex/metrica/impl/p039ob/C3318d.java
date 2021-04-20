package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.d */
public class C3318d extends IOException {
    public C3318d(String str) {
        super(str);
    }

    /* renamed from: a */
    static C3318d m2915a() {
        return new C3318d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C3318d m2916b() {
        return new C3318d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C3318d m2917c() {
        return new C3318d("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C3318d m2918d() {
        return new C3318d("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static C3318d m2919e() {
        return new C3318d("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static C3318d m2920f() {
        return new C3318d("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static C3318d m2921g() {
        return new C3318d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
