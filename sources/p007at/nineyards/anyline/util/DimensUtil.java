package p007at.nineyards.anyline.util;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/* renamed from: at.nineyards.anyline.util.DimensUtil */
public class DimensUtil {
    public static int getPixFromDp(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getDpFromPix(Context context, int i) {
        return (int) ((((float) i) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getScreenOrientation(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        if (point.x == point.y) {
            return 3;
        }
        return point.x > point.y ? 2 : 1;
    }

    public static boolean isOrientationPortrait(Context context) {
        return getScreenOrientation(context) == 1;
    }
}
