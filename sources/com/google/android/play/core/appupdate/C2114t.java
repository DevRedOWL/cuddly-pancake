package com.google.android.play.core.appupdate;

/* renamed from: com.google.android.play.core.appupdate.t */
final class C2114t extends AppUpdateOptions {

    /* renamed from: a */
    private final int f1470a;

    /* renamed from: b */
    private final boolean f1471b;

    /* synthetic */ C2114t(int i, boolean z) {
        this.f1470a = i;
        this.f1471b = z;
    }

    public final boolean allowAssetPackDeletion() {
        return this.f1471b;
    }

    public final int appUpdateType() {
        return this.f1470a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateOptions) {
            AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
            return this.f1470a == appUpdateOptions.appUpdateType() && this.f1471b == appUpdateOptions.allowAssetPackDeletion();
        }
    }

    public final int hashCode() {
        return ((this.f1470a ^ 1000003) * 1000003) ^ (true != this.f1471b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f1470a;
        boolean z = this.f1471b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
