package p007at.nineyards.anyline.util;

/* renamed from: at.nineyards.anyline.util.ArrayUtil */
public class ArrayUtil {
    public static <T> boolean contains(T[] tArr, T t) {
        for (T t2 : tArr) {
            if (t2 != null && t2.equals(t)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(float[] fArr, float f) {
        for (float f2 : fArr) {
            if (f2 == f) {
                return true;
            }
        }
        return false;
    }
}
