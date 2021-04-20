package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.SevenSegmentContour */
public class SevenSegmentContour extends Contour {
    public static final int kFullDigit = anyline_coreJNI.SevenSegmentContour_kFullDigit_get();
    public static final int kHalfDigit = anyline_coreJNI.SevenSegmentContour_kHalfDigit_get();
    public static final int kHorizontalSingle = anyline_coreJNI.SevenSegmentContour_kHorizontalSingle_get();
    public static final int kInvalid = anyline_coreJNI.SevenSegmentContour_kInvalid_get();
    public static final int kVerticalSingle = anyline_coreJNI.SevenSegmentContour_kVerticalSingle_get();

    /* renamed from: a */
    private transient long f458a;

    /* renamed from: b */
    private transient boolean f459b;

    protected SevenSegmentContour(long j, boolean z) {
        super(anyline_coreJNI.SevenSegmentContour_SWIGSmartPtrUpcast(j), true);
        this.f459b = z;
        this.f458a = j;
    }

    protected static long getCPtr(SevenSegmentContour sevenSegmentContour) {
        if (sevenSegmentContour == null) {
            return 0;
        }
        return sevenSegmentContour.f458a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f458a != 0) {
            if (this.f459b) {
                this.f459b = false;
                anyline_coreJNI.delete_SevenSegmentContour(this.f458a);
            }
            this.f458a = 0;
        }
        super.delete();
    }

    public SevenSegmentContour(Contour contour, int i) {
        this(anyline_coreJNI.new_SevenSegmentContour(Contour.getCPtr(contour), contour, i), true);
    }

    public int type() {
        return anyline_coreJNI.SevenSegmentContour_type(this.f458a, this);
    }

    public void setType(int i) {
        anyline_coreJNI.SevenSegmentContour_setType(this.f458a, this, i);
    }
}
