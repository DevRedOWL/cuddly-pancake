package p007at.nineyards.anyline.core;

import android.util.Log;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p007at.nineyards.anyline.util.NumUtil;

/* renamed from: at.nineyards.anyline.core.Variable */
public class Variable {

    /* renamed from: b */
    private static final String f465b = Variable.class.getSimpleName();

    /* renamed from: a */
    private transient long f466a;
    protected transient boolean swigCMemOwn;

    public Variable(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f466a = j;
    }

    public static long getCPtr(Variable variable) {
        if (variable == null) {
            return 0;
        }
        return variable.f466a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f466a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Variable(this.f466a);
            }
            this.f466a = 0;
        }
    }

    public Object getObject() throws AnylineException {
        int type = type();
        if (variable_type.DOUBLE.swigValue() == type) {
            return Double.valueOf(getDoubleValue());
        }
        if (variable_type.INT.swigValue() == type) {
            return Integer.valueOf(getIntValue());
        }
        if (variable_type.STRING.swigValue() == type) {
            return getStringValue();
        }
        if (variable_type.MAT.swigValue() == type) {
            Mat mat = new Mat();
            getValue(mat);
            return new AnylineImage(mat);
        } else if (variable_type.RECT.swigValue() == type) {
            return getRectValue();
        } else {
            if (variable_type.SCALAR.swigValue() == type) {
                return getScalarValue();
            }
            if (variable_type.RESULT.swigValue() == type) {
                CoreResult coreResult = new CoreResult();
                getValue(coreResult);
                return new AnylineRawResult(coreResult);
            } else if (variable_type.SQUARE.swigValue() == type) {
                Square square = new Square();
                getValue(square);
                return square;
            } else if (variable_type.POLYGON.swigValue() == type) {
                Polygon polygon = new Polygon();
                getValue(polygon);
                return polygon;
            } else if (variable_type.CONTOURS.swigValue() == type) {
                Vector_Contour vector_Contour = new Vector_Contour();
                getValue(vector_Contour);
                return vector_Contour;
            } else if (variable_type.SEVEN_SEGMENT_CONTOURS.swigValue() == type) {
                Vector_SevenSegmentContour vector_SevenSegmentContour = new Vector_SevenSegmentContour();
                getValue(vector_SevenSegmentContour);
                return vector_SevenSegmentContour;
            } else {
                String str = f465b;
                Log.w(str, "Variable type has no java representation: " + typeAsString());
                return null;
            }
        }
    }

    public static Variable getVariableFromObject(Object obj) throws ArgumentException {
        String str;
        if ((obj instanceof Double) || (obj instanceof Float)) {
            return new Variable(NumUtil.asDouble(obj).doubleValue());
        }
        if (obj instanceof Integer) {
            return new Variable(NumUtil.asInteger(obj).intValue());
        }
        if (obj instanceof String) {
            return new Variable((String) obj);
        }
        if (obj instanceof Mat) {
            return new Variable((Mat) obj);
        }
        if (obj instanceof AnylineImage) {
            return new Variable(((AnylineImage) obj).getCvMat());
        }
        if (obj instanceof Rect) {
            return new Variable((Rect) obj);
        }
        if (obj instanceof Scalar) {
            return new Variable((Scalar) obj);
        }
        if (obj instanceof Square) {
            return new Variable((Square) obj);
        }
        if (obj instanceof Polygon) {
            return new Variable((Polygon) obj);
        }
        if (obj instanceof Vector_Contour) {
            return new Variable((Vector_Contour) obj);
        }
        if (obj instanceof Vector_SevenSegmentContour) {
            return new Variable((Vector_SevenSegmentContour) obj);
        }
        StringBuilder sb = new StringBuilder("Only Integer, Float, Double, Mat, AnylineImage, Rect, Scalar, Square, Polygon are supported. Given type: ");
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getSimpleName();
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Variable interpretedVariable(String str) {
        long Variable_interpretedVariable = anyline_coreJNI.Variable_interpretedVariable(str);
        if (Variable_interpretedVariable == 0) {
            return null;
        }
        return new Variable(Variable_interpretedVariable, true);
    }

    public Variable() {
        this(anyline_coreJNI.new_Variable__SWIG_0(), true);
    }

    public Variable(int i) {
        this(anyline_coreJNI.new_Variable__SWIG_1(i), true);
    }

    public Variable(double d) {
        this(anyline_coreJNI.new_Variable__SWIG_2(d), true);
    }

    public Variable(Mat mat) {
        this(anyline_coreJNI.new_Variable__SWIG_3(mat.getNativeObjAddr()), true);
    }

    public Variable(Scalar scalar) {
        this(anyline_coreJNI.new_Variable__SWIG_4(scalar), true);
    }

    public Variable(Rect rect) {
        this(anyline_coreJNI.new_Variable__SWIG_5(rect), true);
    }

    public Variable(Vector_Contour vector_Contour) {
        this(anyline_coreJNI.new_Variable__SWIG_6(Vector_Contour.getCPtr(vector_Contour), vector_Contour), true);
    }

    public Variable(String str) {
        this(anyline_coreJNI.new_Variable__SWIG_7(str), true);
    }

    public Variable(CoreResult coreResult) {
        this(anyline_coreJNI.new_Variable__SWIG_8(CoreResult.getCPtr(coreResult), coreResult), true);
    }

    public Variable(String str, boolean z) throws ArgumentException {
        this(anyline_coreJNI.new_Variable__SWIG_9(str, z), true);
    }

    public Variable(Square square) {
        this(anyline_coreJNI.new_Variable__SWIG_10(Square.getCPtr(square), square), true);
    }

    public Variable(Polygon polygon) {
        this(anyline_coreJNI.new_Variable__SWIG_11(Polygon.getCPtr(polygon), polygon), true);
    }

    public Variable(Vector_SevenSegmentContour vector_SevenSegmentContour) {
        this(anyline_coreJNI.new_Variable__SWIG_12(Vector_SevenSegmentContour.getCPtr(vector_SevenSegmentContour), vector_SevenSegmentContour), true);
    }

    public int type() {
        return anyline_coreJNI.Variable_type(this.f466a, this);
    }

    public String typeAsString() {
        return anyline_coreJNI.Variable_typeAsString(this.f466a, this);
    }

    public void getValue(int i) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_0(this.f466a, this, i);
    }

    public void getValue(double d) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_1(this.f466a, this, d);
    }

    public void getValue(Mat mat) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_2(this.f466a, this, mat.getNativeObjAddr());
    }

    public void getValue(Scalar scalar) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_3(this.f466a, this, scalar);
    }

    public void getValue(Rect rect) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_4(this.f466a, this, rect);
    }

    public void getValue(Vector_Contour vector_Contour) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_5(this.f466a, this, Vector_Contour.getCPtr(vector_Contour), vector_Contour);
    }

    public void getValue(String str) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_6(this.f466a, this, str);
    }

    public void getValue(CoreResult coreResult) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_7(this.f466a, this, CoreResult.getCPtr(coreResult), coreResult);
    }

    public void getValue(Square square) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_8(this.f466a, this, Square.getCPtr(square), square);
    }

    public void getValue(Polygon polygon) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_9(this.f466a, this, Polygon.getCPtr(polygon), polygon);
    }

    public void getValue(Vector_SevenSegmentContour vector_SevenSegmentContour) throws AnylineException {
        anyline_coreJNI.Variable_getValue__SWIG_10(this.f466a, this, Vector_SevenSegmentContour.getCPtr(vector_SevenSegmentContour), vector_SevenSegmentContour);
    }

    public int getIntValue() throws AnylineException {
        return anyline_coreJNI.Variable_getIntValue(this.f466a, this);
    }

    public double getDoubleValue() throws AnylineException {
        return anyline_coreJNI.Variable_getDoubleValue(this.f466a, this);
    }

    public String getStringValue() throws AnylineException {
        return anyline_coreJNI.Variable_getStringValue(this.f466a, this);
    }

    public Rect getRectValue() throws AnylineException {
        return anyline_coreJNI.Variable_getRectValue(this.f466a, this);
    }

    public Scalar getScalarValue() throws AnylineException {
        return anyline_coreJNI.Variable_getScalarValue(this.f466a, this);
    }

    public Vector_Contour getContoursValue() throws AnylineException {
        return new Vector_Contour(anyline_coreJNI.Variable_getContoursValue(this.f466a, this), true);
    }

    public Vector_SevenSegmentContour getSevenSegmentContoursValue() throws AnylineException {
        return new Vector_SevenSegmentContour(anyline_coreJNI.Variable_getSevenSegmentContoursValue(this.f466a, this), true);
    }
}
