package p007at.nineyards.anyline.core;

import org.opencv.core.Rect;

/* renamed from: at.nineyards.anyline.core.Polygon */
public class Polygon {

    /* renamed from: a */
    private transient long f456a;
    protected transient boolean swigCMemOwn;

    protected Polygon(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f456a = j;
    }

    protected static long getCPtr(Polygon polygon) {
        if (polygon == null) {
            return 0;
        }
        return polygon.f456a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f456a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Polygon(this.f456a);
            }
            this.f456a = 0;
        }
    }

    public Polygon() {
        this(anyline_coreJNI.new_Polygon__SWIG_0(), true);
    }

    public Polygon(Polygon polygon) {
        this(anyline_coreJNI.new_Polygon__SWIG_1(getCPtr(polygon), polygon), true);
    }

    public Polygon(Rect rect) {
        this(anyline_coreJNI.new_Polygon__SWIG_2(rect), true);
    }

    public Polygon(Square square) {
        this(anyline_coreJNI.new_Polygon__SWIG_3(Square.getCPtr(square), square), true);
    }

    public Polygon(Vector_Point vector_Point) {
        this(anyline_coreJNI.new_Polygon__SWIG_4(Vector_Point.getCPtr(vector_Point), vector_Point), true);
    }

    public Vector_Point points() {
        return new Vector_Point(anyline_coreJNI.Polygon_points(this.f456a, this), false);
    }

    public void setPoints(Vector_Point vector_Point) {
        anyline_coreJNI.Polygon_setPoints(this.f456a, this, Vector_Point.getCPtr(vector_Point), vector_Point);
    }

    public double area() {
        return anyline_coreJNI.Polygon_area(this.f456a, this);
    }

    public double boundingX() {
        return anyline_coreJNI.Polygon_boundingX(this.f456a, this);
    }

    public double boundingY() {
        return anyline_coreJNI.Polygon_boundingY(this.f456a, this);
    }

    public double boundingWidth() {
        return anyline_coreJNI.Polygon_boundingWidth(this.f456a, this);
    }

    public double boundingHeight() {
        return anyline_coreJNI.Polygon_boundingHeight(this.f456a, this);
    }

    public Rect boundingRect() {
        return anyline_coreJNI.Polygon_boundingRect(this.f456a, this);
    }

    public double boundingRatio() {
        return anyline_coreJNI.Polygon_boundingRatio(this.f456a, this);
    }

    public int length() {
        return anyline_coreJNI.Polygon_length(this.f456a, this);
    }

    public boolean isConvex() {
        return anyline_coreJNI.Polygon_isConvex(this.f456a, this);
    }
}
