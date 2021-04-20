package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Reporter */
public class Reporter {

    /* renamed from: a */
    private transient long f457a;
    protected transient boolean swigCMemOwn;

    protected Reporter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f457a = j;
    }

    protected static long getCPtr(Reporter reporter) {
        if (reporter == null) {
            return 0;
        }
        return reporter.f457a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f457a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Reporter(this.f457a);
            }
            this.f457a = 0;
        }
    }

    public static Reporter getInstance() {
        return new Reporter(anyline_coreJNI.Reporter_getInstance(), false);
    }

    public void initReporter(String str, String str2) {
        anyline_coreJNI.Reporter_initReporter(this.f457a, this, str, str2);
    }

    public void reportCameraParameters(String str) {
        anyline_coreJNI.Reporter_reportCameraParameters(this.f457a, this, str);
    }
}
