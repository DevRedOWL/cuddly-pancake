package com.google.android.play.core.assetpacks;

import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.az */
final class C2144az extends AssetPackStates {

    /* renamed from: a */
    private final long f1583a;

    /* renamed from: b */
    private final Map<String, AssetPackState> f1584b;

    C2144az(long j, Map<String, AssetPackState> map) {
        this.f1583a = j;
        this.f1584b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackStates) {
            AssetPackStates assetPackStates = (AssetPackStates) obj;
            return this.f1583a == assetPackStates.totalBytes() && this.f1584b.equals(assetPackStates.packStates());
        }
    }

    public final int hashCode() {
        long j = this.f1583a;
        return this.f1584b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final Map<String, AssetPackState> packStates() {
        return this.f1584b;
    }

    public final String toString() {
        long j = this.f1583a;
        String valueOf = String.valueOf(this.f1584b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final long totalBytes() {
        return this.f1583a;
    }
}
