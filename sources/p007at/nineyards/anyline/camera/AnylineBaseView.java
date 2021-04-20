package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.camera.CameraController;
import p007at.nineyards.anyline.camera.FlashControl;
import p007at.nineyards.anyline.core.ArgumentException;
import p007at.nineyards.anyline.core.CheckLicense;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineYuvImage;
import p007at.nineyards.anyline.modules.barcode.NativeBarcodeResultListener;
import p007at.nineyards.anyline.reporter.ReportingService;
import p007at.nineyards.anyline.util.DimensUtil;

/* renamed from: at.nineyards.anyline.camera.AnylineBaseView */
public class AnylineBaseView extends CameraView {

    /* renamed from: a */
    private static final String f185a = AnylineBaseView.class.getSimpleName();

    /* renamed from: b */
    private final CutoutView f186b;

    /* renamed from: c */
    private AnylineViewConfig f187c;

    /* renamed from: d */
    private C0762a f188d;

    /* renamed from: e */
    private Rect f189e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final View f190f;
    protected SimpleFlashView flashControl;

    /* renamed from: g */
    private String f191g;

    /* renamed from: h */
    private CutoutUpdateListener f192h;

    /* renamed from: i */
    private boolean f193i;

    /* renamed from: j */
    private boolean f194j;

    /* renamed from: k */
    private NativeBarcodeResultListener f195k;

    /* renamed from: l */
    private C0765c f196l;

    /* renamed from: m */
    private boolean f197m;

    public void findViewsWithText(ArrayList<View> arrayList, CharSequence charSequence, int i) {
    }

    public int getChildCount() {
        return 1;
    }

    public void removeAllViews() {
    }

    public void removeAllViewsInLayout() {
    }

    public void removeView(View view) {
    }

    public void removeViewAt(int i) {
    }

    public void removeViewInLayout(View view) {
    }

    public void removeViews(int i, int i2) {
    }

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("anylineCore");
    }

    public AnylineBaseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AnylineBaseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnylineBaseView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f189e = null;
        this.f193i = false;
        this.f194j = false;
        this.f197m = false;
        this.f186b = new CutoutView(context);
        addView(this.f186b);
        this.f190f = new View(getContext());
        this.f190f.setVisibility(4);
        this.f190f.setBackgroundColor(-1);
        addView(this.f190f);
        if (!isInEditMode()) {
            this.f187c = new AnylineViewConfig();
            this.f188d = new C0762a(this.f187c);
            this.cameraController.f249a = new CameraController.C0733b() {
                /* renamed from: a */
                public final void mo11936a() {
                    if (ReportingService.getInstance(context).isCameraFeatureReportingRequired()) {
                        if (AnylineBaseView.this.cameraController instanceof CameraController2) {
                            try {
                                ReportingService.getInstance(context).reportCameraFeatures((CameraFeatures[]) CameraFeatures2.getForAllCameras(context));
                            } catch (Exception unused) {
                            }
                        }
                        ReportingService.getInstance(context).reportCameraFeatures(AnylineBaseView.this.cameraController.getCameraFeatures());
                    }
                    if (AnylineBaseView.this.flashControl != null) {
                        AnylineBaseView.this.flashControl.setCameraController(AnylineBaseView.this.cameraController);
                    }
                    AnylineBaseView.this.updateCutoutView();
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.flashControl != null) {
            int pixFromDp = DimensUtil.getPixFromDp(getContext(), this.f187c.getFlashPaddingInDp()) * 2;
            this.flashControl.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - pixFromDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - pixFromDp, Integer.MIN_VALUE));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f186b.layout(this.layoutLeft, this.layoutTop, this.layoutRight, this.layoutBottom);
        if (this.flashControl != null) {
            int pixFromDp = DimensUtil.getPixFromDp(getContext(), this.f187c.getFlashPaddingInDp());
            int measuredWidth = this.flashControl.getMeasuredWidth();
            int measuredHeight = this.flashControl.getMeasuredHeight();
            int pixFromDp2 = DimensUtil.getPixFromDp(getContext(), this.f187c.getFlashOffsetXInDp());
            int pixFromDp3 = DimensUtil.getPixFromDp(getContext(), this.f187c.getFlashOffsetYInDp());
            switch (this.f187c.getFlashAlignment()) {
                case TOP_LEFT:
                    this.flashControl.layout(pixFromDp + pixFromDp2, pixFromDp + pixFromDp3, measuredWidth + pixFromDp + pixFromDp2, pixFromDp + measuredHeight + pixFromDp3);
                    break;
                case TOP_RIGHT:
                    int i5 = i3 - pixFromDp;
                    this.flashControl.layout((i5 - measuredWidth) + pixFromDp2, pixFromDp + pixFromDp3, i5 + pixFromDp2, pixFromDp + measuredHeight + pixFromDp3);
                    break;
                case BOTTOM_LEFT:
                    int i6 = i4 - pixFromDp;
                    this.flashControl.layout(pixFromDp + pixFromDp2, (i6 - measuredHeight) + pixFromDp3, pixFromDp + measuredWidth + pixFromDp2, i6 + pixFromDp3);
                    break;
                case BOTTOM_RIGHT:
                    int i7 = i3 - pixFromDp;
                    int i8 = i4 - pixFromDp;
                    this.flashControl.layout((i7 - measuredWidth) + pixFromDp2, (i8 - measuredHeight) + pixFromDp3, i7 + pixFromDp2, i8 + pixFromDp3);
                    break;
                case BOTTOM:
                    int i9 = (i + ((i3 - i) / 2)) - (measuredWidth / 2);
                    int i10 = i4 - pixFromDp;
                    this.flashControl.layout(i9 + pixFromDp2, (i10 - measuredHeight) + pixFromDp3, i9 + measuredWidth + pixFromDp2, i10 + pixFromDp3);
                    break;
                case TOP:
                    int i11 = (i + ((i3 - i) / 2)) - (measuredWidth / 2);
                    this.flashControl.layout(i11 + pixFromDp2, pixFromDp + pixFromDp3, i11 + measuredWidth + pixFromDp2, pixFromDp + measuredHeight + pixFromDp3);
                    break;
            }
        }
        this.f190f.layout(this.layoutLeft, this.layoutTop, this.layoutRight, this.layoutBottom);
        View childAt = super.getChildAt(super.getChildCount() - 1);
        if (childAt instanceof C0767d) {
            childAt.layout(this.layoutLeft, this.layoutTop, this.layoutRight, this.layoutBottom);
        }
    }

    public void setConfigFromAsset(String str) {
        setConfig(new AnylineViewConfig(getContext(), str));
    }

    public void setConfigFromJsonString(String str) {
        try {
            setConfig(new AnylineViewConfig(getContext(), new JSONObject(str)));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void setConfig(AnylineViewConfig anylineViewConfig) {
        this.f187c = anylineViewConfig;
        this.f188d = new C0762a(anylineViewConfig);
        CameraConfig preferredCameraConfig = getPreferredCameraConfig();
        preferredCameraConfig.setPreviewSize(new CameraSize(anylineViewConfig.getPreferredPreviewWidth(), anylineViewConfig.getPreferredPreviewHeight()));
        preferredCameraConfig.setHighResolutionPictureSize(new CameraSize(anylineViewConfig.getPreferredPictureWidth(), anylineViewConfig.getPreferredPictureHeight()));
        preferredCameraConfig.setLensFacing(anylineViewConfig.getDefaultLensFacing());
        preferredCameraConfig.setFallbackLensFacings(anylineViewConfig.getFallbackLensFacings());
        setPreferredPreviewFps(anylineViewConfig.getPreferredMinPreviewFps(), anylineViewConfig.getPreferredMaxPreviewFps());
        int i = C07304.f203b[anylineViewConfig.getCutoutAlignment().ordinal()];
        boolean z = false;
        if (i == 1) {
            setPreviewCropGravity(1);
        } else if (i == 2 || i == 3 || i == 4) {
            setPreviewCropGravity(0);
        } else if (i == 5) {
            setPreviewCropGravity(2);
        }
        if (anylineViewConfig.getFlashMode() != AnylineViewConfig.FlashMode.NONE) {
            if (this.flashControl == null) {
                this.flashControl = new SimpleFlashView(getContext());
                this.flashControl.setVisibility(4);
                addView(this.flashControl, 3);
            }
            SimpleFlashView simpleFlashView = this.flashControl;
            if (anylineViewConfig.getFlashMode() == AnylineViewConfig.FlashMode.AUTO) {
                z = true;
            }
            simpleFlashView.setAutoModeEnabled(z);
            if (anylineViewConfig.getFlashImageOnId() != 0 && anylineViewConfig.getFlashImageOffId() != 0) {
                this.flashControl.setFlashResources(anylineViewConfig.getFlashImageOnId(), anylineViewConfig.getFlashImageOffId(), anylineViewConfig.getFlashImageAutoId());
                return;
            }
            return;
        }
        SimpleFlashView simpleFlashView2 = this.flashControl;
        if (simpleFlashView2 != null) {
            removeView(simpleFlashView2);
            this.flashControl = null;
        }
    }

    /* renamed from: at.nineyards.anyline.camera.AnylineBaseView$4 */
    static /* synthetic */ class C07304 {

        /* renamed from: b */
        static final /* synthetic */ int[] f203b = new int[AnylineViewConfig.CutoutAlignment.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        static {
            /*
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment[] r0 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f203b = r0
                r0 = 1
                int[] r1 = f203b     // Catch:{ NoSuchFieldError -> 0x0014 }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r2 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f203b     // Catch:{ NoSuchFieldError -> 0x001f }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r3 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.TOP_HALF     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f203b     // Catch:{ NoSuchFieldError -> 0x002a }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r4 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f203b     // Catch:{ NoSuchFieldError -> 0x0035 }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r5 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.BOTTOM_HALF     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f203b     // Catch:{ NoSuchFieldError -> 0x0040 }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r6 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                at.nineyards.anyline.camera.AnylineViewConfig$FlashAlignment[] r5 = p007at.nineyards.anyline.camera.AnylineViewConfig.FlashAlignment.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f202a = r5
                int[] r5 = f202a     // Catch:{ NoSuchFieldError -> 0x0053 }
                at.nineyards.anyline.camera.AnylineViewConfig$FlashAlignment r6 = p007at.nineyards.anyline.camera.AnylineViewConfig.FlashAlignment.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f202a     // Catch:{ NoSuchFieldError -> 0x005d }
                at.nineyards.anyline.camera.AnylineViewConfig$FlashAlignment r5 = p007at.nineyards.anyline.camera.AnylineViewConfig.FlashAlignment.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = f202a     // Catch:{ NoSuchFieldError -> 0x0067 }
                at.nineyards.anyline.camera.AnylineViewConfig$FlashAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.FlashAlignment.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f202a     // Catch:{ NoSuchFieldError -> 0x0071 }
                at.nineyards.anyline.camera.AnylineViewConfig$FlashAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.FlashAlignment.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f202a     // Catch:{ NoSuchFieldError -> 0x007b }
                at.nineyards.anyline.camera.AnylineViewConfig$FlashAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.FlashAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f202a     // Catch:{ NoSuchFieldError -> 0x0086 }
                at.nineyards.anyline.camera.AnylineViewConfig$FlashAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.FlashAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.AnylineBaseView.C07304.<clinit>():void");
        }
    }

    public AnylineViewConfig getConfig() {
        return this.f187c;
    }

    public void setCutoutUpdateListener(CutoutUpdateListener cutoutUpdateListener) {
        this.f192h = cutoutUpdateListener;
    }

    public void setFlashOn(boolean z) {
        SimpleFlashView simpleFlashView = this.flashControl;
        if (simpleFlashView != null) {
            simpleFlashView.setMode(z ? FlashControl.Mode.ON : FlashControl.Mode.OFF);
        } else {
            super.setFlashOn(z);
        }
    }

    public void enableBarcodeDetection(boolean z, NativeBarcodeResultListener nativeBarcodeResultListener) {
        this.f193i = true;
        this.f194j = z;
        this.f195k = nativeBarcodeResultListener;
        C0765c cVar = this.f196l;
        if (cVar != null) {
            cVar.mo12255b();
        }
        this.f196l = new C0765c(getContext(), nativeBarcodeResultListener);
        if (!this.f196l.mo12254a()) {
            Log.e(f185a, "Barcode Detector not operational on the Device.\nMake sure the dependencies are added in your gradle:\n<meta-data android:name=\"com.google.android.gms.vision.DEPENDENCIES\"\n    android:value=\"barcode\"/> \nThe barcode reader is (not yet) available. See also https://developers.google.com/vision/multi-tracker-tutorial#querying_the_detector_operational_status");
            return;
        }
        this.f197m = true;
        this.f196l.start();
    }

    public void disableBarcodeDetection() {
        this.f193i = false;
        C0765c cVar = this.f196l;
        if (cVar != null) {
            cVar.mo12255b();
        }
    }

    public boolean isBarcodeDetectionEnabled() {
        return this.f193i;
    }

    public boolean isBarcodeDetectionOperational() {
        return this.f197m;
    }

    public void openCameraReportError() {
        super.openCameraReportError();
        m43a();
    }

    /* renamed from: a */
    private void m43a() {
        C0765c cVar = this.f196l;
        if (cVar != null && this.f197m) {
            cVar.mo12255b();
            Log.d(f185a, "starting new barcode runnable after in background");
            this.f196l = new C0765c(getContext(), this.f195k);
            this.f196l.start();
        }
    }

    public void openCameraInBackground() {
        super.openCameraInBackground();
        m43a();
    }

    public void releaseCameraInBackground() {
        m44b();
        super.releaseCameraInBackground();
    }

    public void releaseCamera() {
        m44b();
        super.releaseCamera();
    }

    /* renamed from: b */
    private void m44b() {
        SimpleFlashView simpleFlashView = this.flashControl;
        if (simpleFlashView != null) {
            simpleFlashView.setFlashOnIfAuto(false);
        }
        C0765c cVar = this.f196l;
        if (cVar != null) {
            cVar.mo12255b();
        }
    }

    public AnylineImage getNewImage() {
        AnylineYuvImage anylineYuvImage;
        C0765c cVar;
        AnylineImage newImage = super.getNewImage();
        if (newImage != null && this.f193i) {
            if (this.f194j) {
                anylineYuvImage = getLastImageWithFullSize().getAlYuvImage();
            } else {
                anylineYuvImage = newImage.getAlYuvImage();
            }
            if (!(anylineYuvImage == null || (cVar = this.f196l) == null)) {
                cVar.mo12253a(anylineYuvImage.getData(), anylineYuvImage.getOriginalWidth(), anylineYuvImage.getOriginalHeight(), anylineYuvImage.getFormat());
            }
        }
        return newImage;
    }

    public void updateCutoutView() {
        calcCutOutAndImageCropBounds();
        post(new Runnable() {
            public final void run() {
                AnylineBaseView.this.updateCutoutViewToPreCalculatedRect();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void updateCutoutViewToPreCalculatedRect() {
        if (this.f188d.f416a != null) {
            this.f186b.setBackgroundColor(this.f187c.getCutoutOuterColor());
            m45c();
            if (this.f187c.getCutoutStyle() == AnylineViewConfig.CutoutStyle.RECT) {
                this.f186b.setRect(this.f188d.f416a, this.f187c.getCutoutStrokeColor(), this.f187c.getCutoutStrokeWidthInDp(), this.f187c.getCutoutCornerRadiusInDp());
            } else if (this.f187c.getCutoutDrawable() != null) {
                this.f186b.setDrawable(this.f187c.getCutoutDrawable(), this.f188d.f416a);
            }
            this.f186b.invalidate();
            CutoutUpdateListener cutoutUpdateListener = this.f192h;
            if (cutoutUpdateListener != null) {
                cutoutUpdateListener.onCutoutUpdate(this.f188d.f417b, this.f189e);
            }
        }
    }

    /* renamed from: c */
    private void m45c() {
        if (this.f191g == null || !CheckLicense.getInstance().wasChecked() || CheckLicense.getInstance().showWatermark()) {
            if (this.f188d.f416a != null && super.getChildCount() > 0) {
                View childAt = super.getChildAt(super.getChildCount() - 1);
                if (!(childAt instanceof C0767d)) {
                    childAt = new C0767d(getContext());
                    addView(childAt);
                }
                C0767d dVar = (C0767d) childAt;
                dVar.mo12259a(this.f188d.f416a);
                this.f189e = getViewRectFromFrameRect(dVar.mo12258a());
            }
        } else if (CheckLicense.getInstance().wasChecked() && !CheckLicense.getInstance().showWatermark() && super.getChildCount() > 0) {
            View childAt2 = super.getChildAt(super.getChildCount() - 1);
            if (childAt2 instanceof C0767d) {
                super.removeView(childAt2);
            }
            this.f189e = null;
        }
    }

    public Rect getCutoutRect() {
        return this.f188d.f417b;
    }

    public int getCutoutCropOffsetOnViewX() {
        return this.f188d.f421f;
    }

    public int getCutoutCropOffsetOnViewY() {
        return this.f188d.f422g;
    }

    public Rect getWatermarkRect() {
        return this.f189e;
    }

    /* access modifiers changed from: protected */
    public void calcCutOutAndImageCropBounds() {
        this.f188d.mo12248a(getFrameWidth(), getFrameHeight(), getWidth(), getHeight(), getScale());
        setImageCropBounds(this.f188d.f418c.left, this.f188d.f418c.top, this.f188d.f418c.width(), this.f188d.f418c.height(), false);
        this.cameraController.mo12053a(getContext(), this.f188d.f416a, ((float) getFrameWidth()) * getScale(), ((float) getFrameHeight()) * getScale());
    }

    public Rect getViewRectFromFrameRect(Rect rect) {
        if (rect == null) {
            return null;
        }
        float scale = getScale();
        Rect rect2 = new Rect();
        rect2.left = rect.left - Math.round(((float) this.f188d.f419d) * scale);
        rect2.top = rect.top - Math.round(((float) this.f188d.f420e) * scale);
        rect2.right = rect.right - Math.round(((float) this.f188d.f419d) * scale);
        rect2.bottom = rect.bottom - Math.round(((float) this.f188d.f420e) * scale);
        return rect2;
    }

    public Rect getFrameRectFromViewRect(Rect rect) {
        if (rect == null) {
            return null;
        }
        float scale = getScale();
        Rect rect2 = new Rect();
        rect2.left = this.f188d.f419d + Math.round(((float) rect.left) / scale);
        rect2.top = this.f188d.f420e + Math.round(((float) rect.top) / scale);
        rect2.right = this.f188d.f419d + Math.round(((float) rect.right) / scale);
        rect2.bottom = this.f188d.f420e + Math.round(((float) rect.bottom) / scale);
        return rect2;
    }

    /* access modifiers changed from: protected */
    public void colorCutoutStrokeForFeedback() {
        if (this.f187c.getCutoutFeedbackStrokeColor() != -1) {
            this.f186b.setRect(this.f188d.f416a, this.f187c.getCutoutFeedbackStrokeColor(), this.f187c.getCutoutStrokeWidthInDp(), this.f187c.getCutoutCornerRadiusInDp());
            this.f186b.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void resetColorCutoutStrokeForFeedback() {
        if (this.f187c.getCutoutFeedbackStrokeColor() != -1) {
            this.f186b.setRect(this.f188d.f416a, this.f187c.getCutoutStrokeColor(), this.f187c.getCutoutStrokeWidthInDp(), this.f187c.getCutoutCornerRadiusInDp());
            this.f186b.invalidate();
        }
    }

    public void startBlinkAnimation() {
        this.f190f.setVisibility(0);
        this.f190f.post(new Runnable() {
            public final void run() {
                AnylineBaseView.this.f190f.setVisibility(4);
            }
        });
    }

    public void setLicenseKey(String str) {
        this.f191g = str;
        try {
            CheckLicense.getInstance().checkLicense(str);
        } catch (ArgumentException e) {
            e.printStackTrace();
        }
        m45c();
    }

    public String getLicenseKey() {
        return this.f191g;
    }

    public View getChildAt(int i) {
        return this.cameraController.getPreviewView();
    }
}
