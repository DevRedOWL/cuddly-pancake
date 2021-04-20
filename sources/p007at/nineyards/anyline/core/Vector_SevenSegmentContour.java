package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Vector_SevenSegmentContour */
public class Vector_SevenSegmentContour {

    /* renamed from: a */
    private transient long f470a;
    protected transient boolean swigCMemOwn;

    protected Vector_SevenSegmentContour(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f470a = j;
    }

    protected static long getCPtr(Vector_SevenSegmentContour vector_SevenSegmentContour) {
        if (vector_SevenSegmentContour == null) {
            return 0;
        }
        return vector_SevenSegmentContour.f470a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f470a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Vector_SevenSegmentContour(this.f470a);
            }
            this.f470a = 0;
        }
    }

    public Vector_SevenSegmentContour() {
        this(anyline_coreJNI.new_Vector_SevenSegmentContour__SWIG_0(), true);
    }

    public Vector_SevenSegmentContour(long j) {
        this(anyline_coreJNI.new_Vector_SevenSegmentContour__SWIG_1(j), true);
    }

    public long size() {
        return anyline_coreJNI.Vector_SevenSegmentContour_size(this.f470a, this);
    }

    public long capacity() {
        return anyline_coreJNI.Vector_SevenSegmentContour_capacity(this.f470a, this);
    }

    public void reserve(long j) {
        anyline_coreJNI.Vector_SevenSegmentContour_reserve(this.f470a, this, j);
    }

    public boolean isEmpty() {
        return anyline_coreJNI.Vector_SevenSegmentContour_isEmpty(this.f470a, this);
    }

    public void clear() {
        anyline_coreJNI.Vector_SevenSegmentContour_clear(this.f470a, this);
    }

    public void add(SevenSegmentContour sevenSegmentContour) {
        anyline_coreJNI.Vector_SevenSegmentContour_add(this.f470a, this, SevenSegmentContour.getCPtr(sevenSegmentContour), sevenSegmentContour);
    }

    public SevenSegmentContour get(int i) {
        long Vector_SevenSegmentContour_get = anyline_coreJNI.Vector_SevenSegmentContour_get(this.f470a, this, i);
        if (Vector_SevenSegmentContour_get == 0) {
            return null;
        }
        return new SevenSegmentContour(Vector_SevenSegmentContour_get, true);
    }

    public void set(int i, SevenSegmentContour sevenSegmentContour) {
        anyline_coreJNI.Vector_SevenSegmentContour_set(this.f470a, this, i, SevenSegmentContour.getCPtr(sevenSegmentContour), sevenSegmentContour);
    }
}
