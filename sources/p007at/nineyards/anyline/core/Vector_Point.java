package p007at.nineyards.anyline.core;

import org.opencv.core.Point;

/* renamed from: at.nineyards.anyline.core.Vector_Point */
public class Vector_Point {

    /* renamed from: a */
    private transient long f469a;
    protected transient boolean swigCMemOwn;

    protected Vector_Point(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f469a = j;
    }

    protected static long getCPtr(Vector_Point vector_Point) {
        if (vector_Point == null) {
            return 0;
        }
        return vector_Point.f469a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f469a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Vector_Point(this.f469a);
            }
            this.f469a = 0;
        }
    }

    public Vector_Point() {
        this(anyline_coreJNI.new_Vector_Point__SWIG_0(), true);
    }

    public Vector_Point(long j) {
        this(anyline_coreJNI.new_Vector_Point__SWIG_1(j), true);
    }

    public long size() {
        return anyline_coreJNI.Vector_Point_size(this.f469a, this);
    }

    public long capacity() {
        return anyline_coreJNI.Vector_Point_capacity(this.f469a, this);
    }

    public void reserve(long j) {
        anyline_coreJNI.Vector_Point_reserve(this.f469a, this, j);
    }

    public boolean isEmpty() {
        return anyline_coreJNI.Vector_Point_isEmpty(this.f469a, this);
    }

    public void clear() {
        anyline_coreJNI.Vector_Point_clear(this.f469a, this);
    }

    public void add(Point point) {
        anyline_coreJNI.Vector_Point_add(this.f469a, this, point);
    }

    public Point get(int i) {
        return anyline_coreJNI.Vector_Point_get(this.f469a, this, i);
    }

    public void set(int i, Point point) {
        anyline_coreJNI.Vector_Point_set(this.f469a, this, i, point);
    }
}
