package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final class zai extends Drawable.ConstantState {
    int zaa;
    int zab;

    zai(zai zai) {
        if (zai != null) {
            this.zaa = zai.zaa;
            this.zab = zai.zab;
        }
    }

    public final Drawable newDrawable() {
        return new zaf(this);
    }

    public final int getChangingConfigurations() {
        return this.zaa;
    }
}
