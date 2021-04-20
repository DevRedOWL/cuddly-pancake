package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Vector_LineDuration */
public class Vector_LineDuration {

    /* renamed from: a */
    private transient long f468a;
    protected transient boolean swigCMemOwn;

    protected Vector_LineDuration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f468a = j;
    }

    protected static long getCPtr(Vector_LineDuration vector_LineDuration) {
        if (vector_LineDuration == null) {
            return 0;
        }
        return vector_LineDuration.f468a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f468a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Vector_LineDuration(this.f468a);
            }
            this.f468a = 0;
        }
    }

    public Vector_LineDuration() {
        this(anyline_coreJNI.new_Vector_LineDuration__SWIG_0(), true);
    }

    public Vector_LineDuration(long j) {
        this(anyline_coreJNI.new_Vector_LineDuration__SWIG_1(j), true);
    }

    public long size() {
        return anyline_coreJNI.Vector_LineDuration_size(this.f468a, this);
    }

    public long capacity() {
        return anyline_coreJNI.Vector_LineDuration_capacity(this.f468a, this);
    }

    public void reserve(long j) {
        anyline_coreJNI.Vector_LineDuration_reserve(this.f468a, this, j);
    }

    public boolean isEmpty() {
        return anyline_coreJNI.Vector_LineDuration_isEmpty(this.f468a, this);
    }

    public void clear() {
        anyline_coreJNI.Vector_LineDuration_clear(this.f468a, this);
    }

    public void add(LineDuration lineDuration) {
        anyline_coreJNI.Vector_LineDuration_add(this.f468a, this, LineDuration.getCPtr(lineDuration), lineDuration);
    }

    public LineDuration get(int i) {
        return new LineDuration(anyline_coreJNI.Vector_LineDuration_get(this.f468a, this, i), false);
    }

    public void set(int i, LineDuration lineDuration) {
        anyline_coreJNI.Vector_LineDuration_set(this.f468a, this, i, LineDuration.getCPtr(lineDuration), lineDuration);
    }
}
