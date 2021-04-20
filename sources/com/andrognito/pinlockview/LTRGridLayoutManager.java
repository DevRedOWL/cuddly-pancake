package com.andrognito.pinlockview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

public class LTRGridLayoutManager extends GridLayoutManager {
    /* access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        return false;
    }

    public LTRGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public LTRGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public LTRGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }
}
