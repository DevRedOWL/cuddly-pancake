package p007at.nineyards.anyline.core;

import org.opencv.core.Rect;

/* renamed from: at.nineyards.anyline.core.Contour */
public class Contour {

    /* renamed from: a */
    private transient long f447a;

    /* renamed from: b */
    private transient boolean f448b;

    protected Contour(long j, boolean z) {
        this.f448b = z;
        this.f447a = j;
    }

    protected static long getCPtr(Contour contour) {
        if (contour == null) {
            return 0;
        }
        return contour.f447a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f447a != 0) {
            if (this.f448b) {
                this.f448b = false;
                anyline_coreJNI.delete_Contour(this.f447a);
            }
            this.f447a = 0;
        }
    }

    public Contour() {
        this(anyline_coreJNI.new_Contour__SWIG_0(), true);
    }

    public Contour(Vector_Point vector_Point) {
        this(anyline_coreJNI.new_Contour__SWIG_1(Vector_Point.getCPtr(vector_Point), vector_Point), true);
    }

    public Contour(Vector_Point vector_Point, Rect rect) {
        this(anyline_coreJNI.new_Contour__SWIG_2(Vector_Point.getCPtr(vector_Point), vector_Point, rect), true);
    }

    public Contour(Contour contour) {
        this(anyline_coreJNI.new_Contour__SWIG_3(getCPtr(contour), contour), true);
    }

    public Rect boundingRect() {
        return anyline_coreJNI.Contour_boundingRect(this.f447a, this);
    }

    public void setBoundingRect(Rect rect) {
        anyline_coreJNI.Contour_setBoundingRect(this.f447a, this, rect);
    }

    public Vector_Point contour() {
        return new Vector_Point(anyline_coreJNI.Contour_contour(this.f447a, this), false);
    }
}
