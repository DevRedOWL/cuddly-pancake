package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.AnylineCore */
public class AnylineCore {

    /* renamed from: a */
    private transient long f440a;
    protected transient boolean swigCMemOwn;

    protected AnylineCore(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f440a = j;
    }

    protected static long getCPtr(AnylineCore anylineCore) {
        if (anylineCore == null) {
            return 0;
        }
        return anylineCore.f440a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f440a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_AnylineCore(this.f440a);
            }
            this.f440a = 0;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnylineCore(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, p007at.nineyards.anyline.core.AnylineCoreDelegate r16) throws p007at.nineyards.anyline.core.ArgumentException, p007at.nineyards.anyline.core.LicenseException {
        /*
            r9 = this;
            long r6 = p007at.nineyards.anyline.core.AnylineCoreDelegate.getCPtr(r16)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r8 = r16
            long r0 = p007at.nineyards.anyline.core.anyline_coreJNI.new_AnylineCore(r0, r1, r2, r3, r4, r5, r6, r8)
            r2 = 1
            r3 = r9
            r9.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.core.AnylineCore.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, at.nineyards.anyline.core.AnylineCoreDelegate):void");
    }

    public void loadScript(String str, String str2, String str3) throws ArgumentException, SyntaxException {
        anyline_coreJNI.AnylineCore_loadScript__SWIG_0(this.f440a, this, str, str2, str3);
    }

    public void loadScript(String str, String str2) throws ArgumentException, SyntaxException {
        anyline_coreJNI.AnylineCore_loadScript__SWIG_1(this.f440a, this, str, str2);
    }

    public void loadCmdFile(String str, String str2) throws ArgumentException, SyntaxException {
        anyline_coreJNI.AnylineCore_loadCmdFile(this.f440a, this, str, str2);
    }

    public void process(Variable variable, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable) throws SyntaxException, RunFailure, LicenseException {
        anyline_coreJNI.AnylineCore_process(this.f440a, this, Variable.getCPtr(variable), variable, Map_String_Shared_ptr_Variable.getCPtr(map_String_Shared_ptr_Variable), map_String_Shared_ptr_Variable);
    }

    public void reportIncludeValues(String str) {
        anyline_coreJNI.AnylineCore_reportIncludeValues(this.f440a, this, str);
    }

    public void reportTriggerScanningCanceled() {
        anyline_coreJNI.AnylineCore_reportTriggerScanningCanceled(this.f440a, this);
    }

    public void enableOptOutDebugReporting(boolean z) {
        anyline_coreJNI.AnylineCore_enableOptOutDebugReporting(this.f440a, this, z);
    }

    public Vector_LineDuration lineDurations() {
        return new Vector_LineDuration(anyline_coreJNI.AnylineCore_lineDurations(this.f440a, this), true);
    }
}
