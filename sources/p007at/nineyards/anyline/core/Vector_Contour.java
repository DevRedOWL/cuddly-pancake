package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Vector_Contour */
public class Vector_Contour {

    /* renamed from: a */
    private transient long f467a;
    protected transient boolean swigCMemOwn;

    protected Vector_Contour(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f467a = j;
    }

    protected static long getCPtr(Vector_Contour vector_Contour) {
        if (vector_Contour == null) {
            return 0;
        }
        return vector_Contour.f467a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f467a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Vector_Contour(this.f467a);
            }
            this.f467a = 0;
        }
    }

    public Vector_Contour() {
        this(anyline_coreJNI.new_Vector_Contour__SWIG_0(), true);
    }

    public Vector_Contour(long j) {
        this(anyline_coreJNI.new_Vector_Contour__SWIG_1(j), true);
    }

    public long size() {
        return anyline_coreJNI.Vector_Contour_size(this.f467a, this);
    }

    public long capacity() {
        return anyline_coreJNI.Vector_Contour_capacity(this.f467a, this);
    }

    public void reserve(long j) {
        anyline_coreJNI.Vector_Contour_reserve(this.f467a, this, j);
    }

    public boolean isEmpty() {
        return anyline_coreJNI.Vector_Contour_isEmpty(this.f467a, this);
    }

    public void clear() {
        anyline_coreJNI.Vector_Contour_clear(this.f467a, this);
    }

    public void add(Contour contour) {
        anyline_coreJNI.Vector_Contour_add(this.f467a, this, Contour.getCPtr(contour), contour);
    }

    public Contour get(int i) {
        long Vector_Contour_get = anyline_coreJNI.Vector_Contour_get(this.f467a, this, i);
        if (Vector_Contour_get == 0) {
            return null;
        }
        return new Contour(Vector_Contour_get, true);
    }

    public void set(int i, Contour contour) {
        anyline_coreJNI.Vector_Contour_set(this.f467a, this, i, Contour.getCPtr(contour), contour);
    }
}
