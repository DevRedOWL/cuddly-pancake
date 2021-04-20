package p007at.nineyards.anyline.util;

import android.graphics.Color;

/* renamed from: at.nineyards.anyline.util.ColorUtil */
public class ColorUtil {
    public static int adjustAlpha(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }
}
