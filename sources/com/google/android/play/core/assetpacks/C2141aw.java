package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.aw */
final class C2141aw extends AssetLocation {

    /* renamed from: a */
    private final String f1570a;

    /* renamed from: b */
    private final long f1571b;

    /* renamed from: c */
    private final long f1572c;

    C2141aw(String str, long j, long j2) {
        if (str != null) {
            this.f1570a = str;
            this.f1571b = j;
            this.f1572c = j2;
            return;
        }
        throw new NullPointerException("Null path");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetLocation) {
            AssetLocation assetLocation = (AssetLocation) obj;
            return this.f1570a.equals(assetLocation.path()) && this.f1571b == assetLocation.offset() && this.f1572c == assetLocation.size();
        }
    }

    public final int hashCode() {
        int hashCode = this.f1570a.hashCode();
        long j = this.f1571b;
        long j2 = this.f1572c;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final long offset() {
        return this.f1571b;
    }

    public final String path() {
        return this.f1570a;
    }

    public final long size() {
        return this.f1572c;
    }

    public final String toString() {
        String str = this.f1570a;
        long j = this.f1571b;
        long j2 = this.f1572c;
        StringBuilder sb = new StringBuilder(str.length() + 76);
        sb.append("AssetLocation{path=");
        sb.append(str);
        sb.append(", offset=");
        sb.append(j);
        sb.append(", size=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
