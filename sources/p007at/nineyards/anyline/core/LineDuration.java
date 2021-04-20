package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.LineDuration */
public class LineDuration {

    /* renamed from: a */
    private transient long f450a;
    protected transient boolean swigCMemOwn;

    protected LineDuration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f450a = j;
    }

    protected static long getCPtr(LineDuration lineDuration) {
        if (lineDuration == null) {
            return 0;
        }
        return lineDuration.f450a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f450a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_LineDuration(this.f450a);
            }
            this.f450a = 0;
        }
    }

    public void setLineNumber(int i) {
        anyline_coreJNI.LineDuration_lineNumber_set(this.f450a, this, i);
    }

    public int getLineNumber() {
        return anyline_coreJNI.LineDuration_lineNumber_get(this.f450a, this);
    }

    public void setDuration(int i) {
        anyline_coreJNI.LineDuration_duration_set(this.f450a, this, i);
    }

    public int getDuration() {
        return anyline_coreJNI.LineDuration_duration_get(this.f450a, this);
    }

    public void setLineText(String str) {
        anyline_coreJNI.LineDuration_lineText_set(this.f450a, this, str);
    }

    public String getLineText() {
        return anyline_coreJNI.LineDuration_lineText_get(this.f450a, this);
    }

    public LineDuration() {
        this(anyline_coreJNI.new_LineDuration(), true);
    }
}
