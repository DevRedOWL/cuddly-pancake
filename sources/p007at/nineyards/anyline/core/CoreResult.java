package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.CoreResult */
public class CoreResult {

    /* renamed from: a */
    private transient long f449a;
    protected transient boolean swigCMemOwn;

    protected CoreResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f449a = j;
    }

    protected static long getCPtr(CoreResult coreResult) {
        if (coreResult == null) {
            return 0;
        }
        return coreResult.f449a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f449a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_CoreResult(this.f449a);
            }
            this.f449a = 0;
        }
    }

    public CoreResult() {
        this(anyline_coreJNI.new_CoreResult(), true);
    }

    public Vector_String identifiers() {
        return new Vector_String(anyline_coreJNI.CoreResult_identifiers(this.f449a, this), true);
    }

    public String getResult(String str) {
        return anyline_coreJNI.CoreResult_getResult(this.f449a, this, str);
    }

    public int getWordConfidence(String str) {
        return anyline_coreJNI.CoreResult_getWordConfidence(this.f449a, this, str);
    }

    public Map_Integer_Vector_SymbolConfidence getSymbolConfidence(String str) {
        return new Map_Integer_Vector_SymbolConfidence(anyline_coreJNI.CoreResult_getSymbolConfidence(this.f449a, this, str), true);
    }

    public boolean hasResult(String str) {
        return anyline_coreJNI.CoreResult_hasResult(this.f449a, this, str);
    }

    public Map_String_String resultsByIdentifiers() {
        return new Map_String_String(anyline_coreJNI.CoreResult_resultsByIdentifiers(this.f449a, this), true);
    }

    public Map_String_Integer wordConfidenceByIdentifiers() {
        return new Map_String_Integer(anyline_coreJNI.CoreResult_wordConfidenceByIdentifiers(this.f449a, this), true);
    }

    public Map_String_Map_Int_Vector_SymbolConfidence symbolConfidenceVectorByIdentifiers() {
        return new Map_String_Map_Int_Vector_SymbolConfidence(anyline_coreJNI.CoreResult_symbolConfidenceVectorByIdentifiers(this.f449a, this), true);
    }

    public void add(String str, String str2) {
        anyline_coreJNI.CoreResult_add(this.f449a, this, str, str2);
    }

    public void put(String str, String str2) {
        anyline_coreJNI.CoreResult_put(this.f449a, this, str, str2);
    }

    public void remove(String str) {
        anyline_coreJNI.CoreResult_remove(this.f449a, this, str);
    }

    public void addWordConfidence(int i, String str) {
        anyline_coreJNI.CoreResult_addWordConfidence(this.f449a, this, i, str);
    }

    public void putWordConfidence(int i, String str) {
        anyline_coreJNI.CoreResult_putWordConfidence(this.f449a, this, i, str);
    }

    public void removeWordConfidence(String str) {
        anyline_coreJNI.CoreResult_removeWordConfidence(this.f449a, this, str);
    }

    public void addSymbolConfidenceVector(Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence, String str) {
        anyline_coreJNI.CoreResult_addSymbolConfidenceVector(this.f449a, this, Map_Integer_Vector_SymbolConfidence.getCPtr(map_Integer_Vector_SymbolConfidence), map_Integer_Vector_SymbolConfidence, str);
    }

    public void putSymbolConfidenceVector(Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence, String str) {
        anyline_coreJNI.CoreResult_putSymbolConfidenceVector(this.f449a, this, Map_Integer_Vector_SymbolConfidence.getCPtr(map_Integer_Vector_SymbolConfidence), map_Integer_Vector_SymbolConfidence, str);
    }

    public void removeSymbolConfidenceVector(String str) {
        anyline_coreJNI.CoreResult_removeSymbolConfidenceVector(this.f449a, this, str);
    }

    public boolean valid() {
        return anyline_coreJNI.CoreResult_valid(this.f449a, this);
    }

    public void setValid(boolean z) {
        anyline_coreJNI.CoreResult_setValid(this.f449a, this, z);
    }

    public int calculateWordConfidenceFromSymbols(String str) {
        return anyline_coreJNI.CoreResult_calculateWordConfidenceFromSymbols(this.f449a, this, str);
    }
}
