package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.variable_type */
public final class variable_type {
    public static final variable_type CONTOURS = new variable_type("CONTOURS", anyline_coreJNI.CONTOURS_get());
    public static final variable_type DOUBLE = new variable_type("DOUBLE", anyline_coreJNI.DOUBLE_get());
    public static final variable_type INT = new variable_type("INT", anyline_coreJNI.INT_get());
    public static final variable_type MAT = new variable_type("MAT", anyline_coreJNI.MAT_get());
    public static final variable_type POLYGON = new variable_type("POLYGON", anyline_coreJNI.POLYGON_get());
    public static final variable_type RECT = new variable_type("RECT", anyline_coreJNI.RECT_get());
    public static final variable_type RESULT = new variable_type("RESULT", anyline_coreJNI.RESULT_get());
    public static final variable_type SCALAR = new variable_type("SCALAR", anyline_coreJNI.SCALAR_get());
    public static final variable_type SEVEN_SEGMENT_CONTOURS = new variable_type("SEVEN_SEGMENT_CONTOURS", anyline_coreJNI.SEVEN_SEGMENT_CONTOURS_get());
    public static final variable_type SQUARE = new variable_type("SQUARE", anyline_coreJNI.SQUARE_get());
    public static final variable_type STRING = new variable_type("STRING", anyline_coreJNI.STRING_get());
    public static final variable_type UNDEFINED = new variable_type("UNDEFINED", anyline_coreJNI.UNDEFINED_get());

    /* renamed from: a */
    private static variable_type[] f477a = {UNDEFINED, INT, DOUBLE, MAT, SCALAR, CONTOURS, STRING, RECT, RESULT, SQUARE, SEVEN_SEGMENT_CONTOURS, POLYGON};

    /* renamed from: b */
    private static int f478b = 0;

    /* renamed from: c */
    private final int f479c;

    /* renamed from: d */
    private final String f480d;

    public final int swigValue() {
        return this.f479c;
    }

    public final String toString() {
        return this.f480d;
    }

    public static variable_type swigToEnum(int i) {
        variable_type[] variable_typeArr = f477a;
        if (i < variable_typeArr.length && i >= 0 && variable_typeArr[i].f479c == i) {
            return variable_typeArr[i];
        }
        int i2 = 0;
        while (true) {
            variable_type[] variable_typeArr2 = f477a;
            if (i2 >= variable_typeArr2.length) {
                throw new IllegalArgumentException("No enum " + variable_type.class + " with value " + i);
            } else if (variable_typeArr2[i2].f479c == i) {
                return variable_typeArr2[i2];
            } else {
                i2++;
            }
        }
    }

    private variable_type(String str, int i) {
        this.f480d = str;
        this.f479c = i;
        f478b = i + 1;
    }
}
