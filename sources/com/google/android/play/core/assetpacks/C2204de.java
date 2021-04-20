package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.de */
final class C2204de {

    /* renamed from: a */
    private final String f1821a;

    /* renamed from: b */
    private final long f1822b;

    /* renamed from: c */
    private final int f1823c;

    /* renamed from: d */
    private final boolean f1824d;

    /* renamed from: e */
    private final boolean f1825e;

    /* renamed from: f */
    private final byte[] f1826f;

    C2204de() {
    }

    C2204de(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f1821a = str;
        this.f1822b = j;
        this.f1823c = i;
        this.f1824d = z;
        this.f1825e = z2;
        this.f1826f = bArr;
    }

    /* renamed from: a */
    static C2204de m1063a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C2204de(str, j, i, z, z2, bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo33766b() {
        if (mo33768d() == null) {
            return false;
        }
        return mo33768d().endsWith("/");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo33767c() {
        return mo33771f() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo33768d() {
        return this.f1821a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo33769e() {
        return this.f1822b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2204de) {
            C2204de deVar = (C2204de) obj;
            String str = this.f1821a;
            if (str != null ? str.equals(deVar.mo33768d()) : deVar.mo33768d() == null) {
                if (this.f1822b == deVar.mo33769e() && this.f1823c == deVar.mo33771f() && this.f1824d == deVar.mo33772g() && this.f1825e == deVar.mo33773h()) {
                    if (Arrays.equals(this.f1826f, deVar instanceof C2204de ? deVar.f1826f : deVar.mo33775i())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo33771f() {
        return this.f1823c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo33772g() {
        return this.f1824d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo33773h() {
        return this.f1825e;
    }

    public int hashCode() {
        String str = this.f1821a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f1822b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f1823c) * 1000003) ^ (true != this.f1824d ? 1237 : 1231)) * 1000003;
        if (true == this.f1825e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f1826f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public byte[] mo33775i() {
        return this.f1826f;
    }

    public String toString() {
        String str = this.f1821a;
        long j = this.f1822b;
        int i = this.f1823c;
        boolean z = this.f1824d;
        boolean z2 = this.f1825e;
        String arrays = Arrays.toString(this.f1826f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
