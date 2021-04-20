package devs.mulham.horizontalcalendar.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class Utils {
    public static int calculateRelativeCenterPosition(int i, int i2, int i3) {
        return i > i2 ? i + i3 : i < i2 ? i - i3 : i;
    }

    public static int calculateCellWidth(Context context, int i) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return -2;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x / i;
    }

    public static boolean isSameDate(Calendar calendar, Calendar calendar2) {
        return isSameMonth(calendar, calendar2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean isSameMonth(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(2);
        if (calendar.get(1) == calendar2.get(1) && i == calendar2.get(2)) {
            return true;
        }
        return false;
    }

    public static boolean isDateBefore(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(6);
        int i2 = calendar.get(1);
        if (i2 < calendar2.get(1)) {
            return true;
        }
        if (i2 != calendar2.get(1) || i >= calendar2.get(6)) {
            return false;
        }
        return true;
    }

    public static boolean isDateAfter(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(6);
        int i2 = calendar.get(1);
        if (i2 > calendar2.get(1)) {
            return true;
        }
        if (i2 != calendar2.get(1) || i <= calendar2.get(6)) {
            return false;
        }
        return true;
    }

    public static int daysBetween(Calendar calendar, Calendar calendar2) {
        zeroTime(calendar);
        zeroTime(calendar2);
        return (int) TimeUnit.MILLISECONDS.toDays(calendar2.getTimeInMillis() - calendar.getTimeInMillis());
    }

    public static int monthsBetween(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(2);
        return (calendar2.get(2) - i) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    public static void zeroTime(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
}
