package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AssetPackExtractionService extends Service {

    /* renamed from: a */
    C2145b f1495a;

    public final IBinder onBind(Intent intent) {
        return this.f1495a;
    }

    public final void onCreate() {
        super.onCreate();
        C2183ck.m1022j(getApplicationContext()).mo33598b(this);
    }
}
