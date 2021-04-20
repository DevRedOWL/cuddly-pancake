package com.google.android.play.core.assetpacks;

public abstract class AssetPackLocation {

    /* renamed from: a */
    private static final AssetPackLocation f1496a = new C2142ax(1, (String) null, (String) null);

    /* renamed from: a */
    static AssetPackLocation m813a() {
        return f1496a;
    }

    /* renamed from: b */
    static AssetPackLocation m814b(String str, String str2) {
        return new C2142ax(0, str, str2);
    }

    public abstract String assetsPath();

    public abstract int packStorageMethod();

    public abstract String path();
}
