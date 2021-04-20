package com.google.android.play.core.assetpacks;

import com.facebook.imageutils.JfifUtil;

/* renamed from: com.google.android.play.core.assetpacks.ay */
final class C2143ay extends AssetPackState {

    /* renamed from: a */
    private final String f1576a;

    /* renamed from: b */
    private final int f1577b;

    /* renamed from: c */
    private final int f1578c;

    /* renamed from: d */
    private final long f1579d;

    /* renamed from: e */
    private final long f1580e;

    /* renamed from: f */
    private final int f1581f;

    /* renamed from: g */
    private final int f1582g;

    C2143ay(String str, int i, int i2, long j, long j2, int i3, int i4) {
        if (str != null) {
            this.f1576a = str;
            this.f1577b = i;
            this.f1578c = i2;
            this.f1579d = j;
            this.f1580e = j2;
            this.f1581f = i3;
            this.f1582g = i4;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo33583a() {
        return this.f1582g;
    }

    public final long bytesDownloaded() {
        return this.f1579d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f1576a.equals(assetPackState.name()) && this.f1577b == assetPackState.status() && this.f1578c == assetPackState.errorCode() && this.f1579d == assetPackState.bytesDownloaded() && this.f1580e == assetPackState.totalBytesToDownload() && this.f1581f == assetPackState.transferProgressPercentage() && this.f1582g == assetPackState.mo33583a();
        }
    }

    public final int errorCode() {
        return this.f1578c;
    }

    public final int hashCode() {
        int hashCode = this.f1576a.hashCode();
        int i = this.f1577b;
        int i2 = this.f1578c;
        long j = this.f1579d;
        long j2 = this.f1580e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f1581f) * 1000003) ^ this.f1582g;
    }

    public final String name() {
        return this.f1576a;
    }

    public final int status() {
        return this.f1577b;
    }

    public final String toString() {
        String str = this.f1576a;
        int i = this.f1577b;
        int i2 = this.f1578c;
        long j = this.f1579d;
        long j2 = this.f1580e;
        int i3 = this.f1581f;
        int i4 = this.f1582g;
        StringBuilder sb = new StringBuilder(str.length() + JfifUtil.MARKER_EOI);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }

    public final long totalBytesToDownload() {
        return this.f1580e;
    }

    public final int transferProgressPercentage() {
        return this.f1581f;
    }
}
