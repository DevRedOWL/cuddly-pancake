package com.google.android.play.core.install;

/* renamed from: com.google.android.play.core.install.a */
final class C2232a extends InstallState {

    /* renamed from: a */
    private final int f1900a;

    /* renamed from: b */
    private final long f1901b;

    /* renamed from: c */
    private final long f1902c;

    /* renamed from: d */
    private final int f1903d;

    /* renamed from: e */
    private final String f1904e;

    C2232a(int i, long j, long j2, int i2, String str) {
        this.f1900a = i;
        this.f1901b = j;
        this.f1902c = j2;
        this.f1903d = i2;
        if (str != null) {
            this.f1904e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final long bytesDownloaded() {
        return this.f1901b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f1900a == installState.installStatus() && this.f1901b == installState.bytesDownloaded() && this.f1902c == installState.totalBytesToDownload() && this.f1903d == installState.installErrorCode() && this.f1904e.equals(installState.packageName());
        }
    }

    public final int hashCode() {
        int i = this.f1900a;
        long j = this.f1901b;
        long j2 = this.f1902c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f1903d) * 1000003) ^ this.f1904e.hashCode();
    }

    public final int installErrorCode() {
        return this.f1903d;
    }

    public final int installStatus() {
        return this.f1900a;
    }

    public final String packageName() {
        return this.f1904e;
    }

    public final String toString() {
        int i = this.f1900a;
        long j = this.f1901b;
        long j2 = this.f1902c;
        int i2 = this.f1903d;
        String str = this.f1904e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final long totalBytesToDownload() {
        return this.f1902c;
    }
}
