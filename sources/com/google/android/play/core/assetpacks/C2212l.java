package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.l */
final class C2212l {

    /* renamed from: a */
    private final Context f1857a;

    public C2212l(Context context) {
        this.f1857a = context;
    }

    /* renamed from: b */
    static String m1083b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo33787a() {
        return this.f1857a;
    }
}
