package com.andrognito.pinlockview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

public class ResourceUtils {
    private ResourceUtils() {
        throw new AssertionError();
    }

    public static int getColor(Context context, int i) {
        return ContextCompat.getColor(context, i);
    }

    public static float getDimensionInPx(Context context, int i) {
        return context.getResources().getDimension(i);
    }

    public static Drawable getDrawable(Context context, int i) {
        return ContextCompat.getDrawable(context, i);
    }
}
