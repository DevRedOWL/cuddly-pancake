package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Vector_SymbolConfidence */
public class Vector_SymbolConfidence {

    /* renamed from: a */
    private transient long f472a;
    protected transient boolean swigCMemOwn;

    protected Vector_SymbolConfidence(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f472a = j;
    }

    protected static long getCPtr(Vector_SymbolConfidence vector_SymbolConfidence) {
        if (vector_SymbolConfidence == null) {
            return 0;
        }
        return vector_SymbolConfidence.f472a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f472a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Vector_SymbolConfidence(this.f472a);
            }
            this.f472a = 0;
        }
    }

    public Vector_SymbolConfidence() {
        this(anyline_coreJNI.new_Vector_SymbolConfidence__SWIG_0(), true);
    }

    public Vector_SymbolConfidence(long j) {
        this(anyline_coreJNI.new_Vector_SymbolConfidence__SWIG_1(j), true);
    }

    public long size() {
        return anyline_coreJNI.Vector_SymbolConfidence_size(this.f472a, this);
    }

    public long capacity() {
        return anyline_coreJNI.Vector_SymbolConfidence_capacity(this.f472a, this);
    }

    public void reserve(long j) {
        anyline_coreJNI.Vector_SymbolConfidence_reserve(this.f472a, this, j);
    }

    public boolean isEmpty() {
        return anyline_coreJNI.Vector_SymbolConfidence_isEmpty(this.f472a, this);
    }

    public void clear() {
        anyline_coreJNI.Vector_SymbolConfidence_clear(this.f472a, this);
    }

    public void add(SymbolConfidence symbolConfidence) {
        anyline_coreJNI.Vector_SymbolConfidence_add(this.f472a, this, SymbolConfidence.getCPtr(symbolConfidence), symbolConfidence);
    }

    public SymbolConfidence get(int i) {
        return new SymbolConfidence(anyline_coreJNI.Vector_SymbolConfidence_get(this.f472a, this, i), false);
    }

    public void set(int i, SymbolConfidence symbolConfidence) {
        anyline_coreJNI.Vector_SymbolConfidence_set(this.f472a, this, i, SymbolConfidence.getCPtr(symbolConfidence), symbolConfidence);
    }
}
