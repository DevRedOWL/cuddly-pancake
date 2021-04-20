package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;

/* renamed from: com.google.android.play.core.appupdate.s */
final class C2113s extends AppUpdateOptions.Builder {

    /* renamed from: a */
    private Integer f1468a;

    /* renamed from: b */
    private Boolean f1469b;

    C2113s() {
    }

    public final AppUpdateOptions build() {
        String str = "";
        if (this.f1468a == null) {
            str = str.concat(" appUpdateType");
        }
        if (this.f1469b == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new C2114t(this.f1468a.intValue(), this.f1469b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public final AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean z) {
        this.f1469b = Boolean.valueOf(z);
        return this;
    }

    public final AppUpdateOptions.Builder setAppUpdateType(int i) {
        this.f1468a = Integer.valueOf(i);
        return this;
    }
}
