package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.SymbolConfidence */
public class SymbolConfidence {

    /* renamed from: a */
    private transient long f461a;
    protected transient boolean swigCMemOwn;

    protected SymbolConfidence(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f461a = j;
    }

    protected static long getCPtr(SymbolConfidence symbolConfidence) {
        if (symbolConfidence == null) {
            return 0;
        }
        return symbolConfidence.f461a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f461a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_SymbolConfidence(this.f461a);
            }
            this.f461a = 0;
        }
    }

    public void setSymbol(char c) {
        anyline_coreJNI.SymbolConfidence_symbol_set(this.f461a, this, c);
    }

    public char getSymbol() {
        return anyline_coreJNI.SymbolConfidence_symbol_get(this.f461a, this);
    }

    public void setConfidence(float f) {
        anyline_coreJNI.SymbolConfidence_confidence_set(this.f461a, this, f);
    }

    public float getConfidence() {
        return anyline_coreJNI.SymbolConfidence_confidence_get(this.f461a, this);
    }

    public SymbolConfidence() {
        this(anyline_coreJNI.new_SymbolConfidence(), true);
    }
}
