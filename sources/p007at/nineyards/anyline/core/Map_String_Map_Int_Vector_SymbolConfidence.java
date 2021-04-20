package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Map_String_Map_Int_Vector_SymbolConfidence */
public class Map_String_Map_Int_Vector_SymbolConfidence {

    /* renamed from: a */
    private transient long f453a;
    protected transient boolean swigCMemOwn;

    protected Map_String_Map_Int_Vector_SymbolConfidence(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f453a = j;
    }

    protected static long getCPtr(Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence) {
        if (map_String_Map_Int_Vector_SymbolConfidence == null) {
            return 0;
        }
        return map_String_Map_Int_Vector_SymbolConfidence.f453a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f453a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Map_String_Map_Int_Vector_SymbolConfidence(this.f453a);
            }
            this.f453a = 0;
        }
    }

    public Map_String_Map_Int_Vector_SymbolConfidence() {
        this(anyline_coreJNI.new_Map_String_Map_Int_Vector_SymbolConfidence__SWIG_0(), true);
    }

    public Map_String_Map_Int_Vector_SymbolConfidence(Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence) {
        this(anyline_coreJNI.new_Map_String_Map_Int_Vector_SymbolConfidence__SWIG_1(getCPtr(map_String_Map_Int_Vector_SymbolConfidence), map_String_Map_Int_Vector_SymbolConfidence), true);
    }

    public long size() {
        return anyline_coreJNI.Map_String_Map_Int_Vector_SymbolConfidence_size(this.f453a, this);
    }

    public boolean empty() {
        return anyline_coreJNI.Map_String_Map_Int_Vector_SymbolConfidence_empty(this.f453a, this);
    }

    public void clear() {
        anyline_coreJNI.Map_String_Map_Int_Vector_SymbolConfidence_clear(this.f453a, this);
    }

    public Map_Integer_Vector_SymbolConfidence get(String str) {
        return new Map_Integer_Vector_SymbolConfidence(anyline_coreJNI.Map_String_Map_Int_Vector_SymbolConfidence_get(this.f453a, this, str), false);
    }

    public void set(String str, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence) {
        anyline_coreJNI.Map_String_Map_Int_Vector_SymbolConfidence_set(this.f453a, this, str, Map_Integer_Vector_SymbolConfidence.getCPtr(map_Integer_Vector_SymbolConfidence), map_Integer_Vector_SymbolConfidence);
    }

    public void del(String str) {
        anyline_coreJNI.Map_String_Map_Int_Vector_SymbolConfidence_del(this.f453a, this, str);
    }

    public boolean has_key(String str) {
        return anyline_coreJNI.Map_String_Map_Int_Vector_SymbolConfidence_has_key(this.f453a, this, str);
    }
}
