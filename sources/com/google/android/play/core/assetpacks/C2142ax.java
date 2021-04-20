package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.ax */
final class C2142ax extends AssetPackLocation {

    /* renamed from: a */
    private final int f1573a;

    /* renamed from: b */
    private final String f1574b;

    /* renamed from: c */
    private final String f1575c;

    C2142ax(int i, String str, String str2) {
        this.f1573a = i;
        this.f1574b = str;
        this.f1575c = str2;
    }

    public final String assetsPath() {
        return this.f1575c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackLocation) {
            AssetPackLocation assetPackLocation = (AssetPackLocation) obj;
            if (this.f1573a == assetPackLocation.packStorageMethod() && ((str = this.f1574b) != null ? str.equals(assetPackLocation.path()) : assetPackLocation.path() == null)) {
                String str2 = this.f1575c;
                String assetsPath = assetPackLocation.assetsPath();
                if (str2 != null ? str2.equals(assetsPath) : assetsPath == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f1573a ^ 1000003) * 1000003;
        String str = this.f1574b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1575c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final int packStorageMethod() {
        return this.f1573a;
    }

    public final String path() {
        return this.f1574b;
    }

    public final String toString() {
        int i = this.f1573a;
        String str = this.f1574b;
        String str2 = this.f1575c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
