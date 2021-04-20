package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.x */
public final class C2404x {

    /* renamed from: a */
    private final Context f2194a;

    C2404x(Context context) {
        this.f2194a = context;
    }

    /* renamed from: c */
    static File m1593c(Context context) {
        String string;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                return null;
            }
            return new File(context.getExternalFilesDir((String) null), string);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2389s mo34050a() {
        return C2389s.m1548b(this.f2194a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Context mo34051b() {
        return this.f2194a;
    }
}
