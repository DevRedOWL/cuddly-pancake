package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.CheckLicense */
public class CheckLicense {

    /* renamed from: a */
    private transient long f446a;
    protected transient boolean swigCMemOwn;

    protected CheckLicense(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f446a = j;
    }

    protected static long getCPtr(CheckLicense checkLicense) {
        if (checkLicense == null) {
            return 0;
        }
        return checkLicense.f446a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f446a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_CheckLicense(this.f446a);
            }
            this.f446a = 0;
        }
    }

    public static CheckLicense getInstance() {
        return new CheckLicense(anyline_coreJNI.CheckLicense_getInstance(), false);
    }

    public boolean checkLicense(String str) throws ArgumentException {
        return anyline_coreJNI.CheckLicense_checkLicense(this.f446a, this, str);
    }

    public boolean wasChecked() {
        return anyline_coreJNI.CheckLicense_wasChecked(this.f446a, this);
    }

    public boolean showWatermark() {
        return anyline_coreJNI.CheckLicense_showWatermark(this.f446a, this);
    }

    public boolean showPopUp() {
        return anyline_coreJNI.CheckLicense_showPopUp(this.f446a, this);
    }
}
