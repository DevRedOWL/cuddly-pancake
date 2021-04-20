package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.C2214a;
import com.google.android.play.core.tasks.C2416j;

public class AssetPackException extends C2416j {

    /* renamed from: a */
    private final int f1494a;

    AssetPackException(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i), C2214a.m1086a(i)}));
        if (i != 0) {
            this.f1494a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    public int getErrorCode() {
        return this.f1494a;
    }
}
