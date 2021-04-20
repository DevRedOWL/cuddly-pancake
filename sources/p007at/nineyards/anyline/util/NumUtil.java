package p007at.nineyards.anyline.util;

/* renamed from: at.nineyards.anyline.util.NumUtil */
public class NumUtil {
    public static Double asDouble(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        throw new IllegalArgumentException("Given parameter is not a Float, Double or Integer");
    }

    public static Float asFloat(Object obj) {
        if (obj instanceof Double) {
            return Float.valueOf(((Double) obj).floatValue());
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Integer) {
            return Float.valueOf(((Integer) obj).floatValue());
        }
        throw new IllegalArgumentException("Given parameter is not a Float, Double or Integer");
    }

    public static Integer asInteger(Object obj) {
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj instanceof Float) {
            return Integer.valueOf(((Float) obj).intValue());
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        throw new IllegalArgumentException("Given parameter is not a Float, Double or Integer");
    }
}
