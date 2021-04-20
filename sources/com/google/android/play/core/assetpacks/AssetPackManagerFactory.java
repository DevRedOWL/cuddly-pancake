package com.google.android.play.core.assetpacks;

import android.content.Context;

public class AssetPackManagerFactory {
    public static synchronized AssetPackManager getInstance(Context context) {
        AssetPackManager a;
        synchronized (AssetPackManagerFactory.class) {
            a = C2183ck.m1022j(context).mo33597a();
        }
        return a;
    }
}
