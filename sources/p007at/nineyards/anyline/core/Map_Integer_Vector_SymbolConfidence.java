package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Map_Integer_Vector_SymbolConfidence */
public class Map_Integer_Vector_SymbolConfidence {

    /* renamed from: a */
    private transient long f451a;
    protected transient boolean swigCMemOwn;

    protected Map_Integer_Vector_SymbolConfidence(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f451a = j;
    }

    protected static long getCPtr(Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence) {
        if (map_Integer_Vector_SymbolConfidence == null) {
            return 0;
        }
        return map_Integer_Vector_SymbolConfidence.f451a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f451a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Map_Integer_Vector_SymbolConfidence(this.f451a);
            }
            this.f451a = 0;
        }
    }

    public Map_Integer_Vector_SymbolConfidence() {
        this(anyline_coreJNI.new_Map_Integer_Vector_SymbolConfidence__SWIG_0(), true);
    }

    public Map_Integer_Vector_SymbolConfidence(Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence) {
        this(anyline_coreJNI.new_Map_Integer_Vector_SymbolConfidence__SWIG_1(getCPtr(map_Integer_Vector_SymbolConfidence), map_Integer_Vector_SymbolConfidence), true);
    }

    public long size() {
        return anyline_coreJNI.Map_Integer_Vector_SymbolConfidence_size(this.f451a, this);
    }

    public boolean empty() {
        return anyline_coreJNI.Map_Integer_Vector_SymbolConfidence_empty(this.f451a, this);
    }

    public void clear() {
        anyline_coreJNI.Map_Integer_Vector_SymbolConfidence_clear(this.f451a, this);
    }

    public Vector_SymbolConfidence get(int i) {
        return new Vector_SymbolConfidence(anyline_coreJNI.Map_Integer_Vector_SymbolConfidence_get(this.f451a, this, i), false);
    }

    public void set(int i, Vector_SymbolConfidence vector_SymbolConfidence) {
        anyline_coreJNI.Map_Integer_Vector_SymbolConfidence_set(this.f451a, this, i, Vector_SymbolConfidence.getCPtr(vector_SymbolConfidence), vector_SymbolConfidence);
    }

    public void del(int i) {
        anyline_coreJNI.Map_Integer_Vector_SymbolConfidence_del(this.f451a, this, i);
    }

    public boolean has_key(int i) {
        return anyline_coreJNI.Map_Integer_Vector_SymbolConfidence_has_key(this.f451a, this, i);
    }
}
