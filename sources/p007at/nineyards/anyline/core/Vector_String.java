package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Vector_String */
public class Vector_String {

    /* renamed from: a */
    private transient long f471a;
    protected transient boolean swigCMemOwn;

    protected Vector_String(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f471a = j;
    }

    protected static long getCPtr(Vector_String vector_String) {
        if (vector_String == null) {
            return 0;
        }
        return vector_String.f471a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f471a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Vector_String(this.f471a);
            }
            this.f471a = 0;
        }
    }

    public Vector_String() {
        this(anyline_coreJNI.new_Vector_String__SWIG_0(), true);
    }

    public Vector_String(long j) {
        this(anyline_coreJNI.new_Vector_String__SWIG_1(j), true);
    }

    public long size() {
        return anyline_coreJNI.Vector_String_size(this.f471a, this);
    }

    public long capacity() {
        return anyline_coreJNI.Vector_String_capacity(this.f471a, this);
    }

    public void reserve(long j) {
        anyline_coreJNI.Vector_String_reserve(this.f471a, this, j);
    }

    public boolean isEmpty() {
        return anyline_coreJNI.Vector_String_isEmpty(this.f471a, this);
    }

    public void clear() {
        anyline_coreJNI.Vector_String_clear(this.f471a, this);
    }

    public void add(String str) {
        anyline_coreJNI.Vector_String_add(this.f471a, this, str);
    }

    public String get(int i) {
        return anyline_coreJNI.Vector_String_get(this.f471a, this, i);
    }

    public void set(int i, String str) {
        anyline_coreJNI.Vector_String_set(this.f471a, this, i, str);
    }
}
