package com.google.android.play.core.splitcompat;

import java.io.File;

/* renamed from: com.google.android.play.core.splitcompat.q */
final class C2346q {

    /* renamed from: a */
    private final File f2040a;

    /* renamed from: b */
    private final String f2041b;

    C2346q() {
    }

    C2346q(File file, String str) {
        this();
        if (file != null) {
            this.f2040a = file;
            if (str != null) {
                this.f2041b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo33968a() {
        return this.f2040a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo33969b() {
        return this.f2041b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2346q) {
            C2346q qVar = (C2346q) obj;
            return this.f2040a.equals(qVar.mo33968a()) && this.f2041b.equals(qVar.mo33969b());
        }
    }

    public int hashCode() {
        return ((this.f2040a.hashCode() ^ 1000003) * 1000003) ^ this.f2041b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2040a);
        String str = this.f2041b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
