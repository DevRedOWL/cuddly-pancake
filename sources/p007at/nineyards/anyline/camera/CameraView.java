package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p007at.nineyards.anyline.C0718R;
import p007at.nineyards.anyline.CombinedImageProvider;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineYuvImage;

/* renamed from: at.nineyards.anyline.camera.CameraView */
public class CameraView extends ViewGroup implements CombinedImageProvider {
    public static final int PREVIEW_CROP_GRAVITY_BOTTOM = 2;
    public static final int PREVIEW_CROP_GRAVITY_CENTER_VERTICALLY = 0;
    public static final int PREVIEW_CROP_GRAVITY_TOP = 1;

    /* renamed from: a */
    private static final String f355a = CameraView.class.getSimpleName();

    /* renamed from: b */
    private static boolean f356b = false;

    /* renamed from: c */
    private static final Object f357c = new Object();
    protected CameraController cameraController;

    /* renamed from: d */
    private int f358d;

    /* renamed from: e */
    private boolean f359e;

    /* renamed from: f */
    private int f360f;

    /* renamed from: g */
    private int f361g;

    /* renamed from: h */
    private int f362h;

    /* renamed from: i */
    private int f363i;

    /* renamed from: j */
    private boolean f364j;
    protected int layoutBottom;
    protected int layoutLeft;
    protected int layoutRight;
    protected int layoutTop;

    public CameraView(Context context) {
        this(context, f356b);
    }

    public CameraView(Context context, boolean z) {
        super(context);
        this.f358d = 0;
        this.f359e = false;
        this.f364j = false;
        if (!isInEditMode()) {
            m114a(context, z);
        }
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f358d = 0;
        this.f359e = false;
        this.f364j = false;
        if (!isInEditMode()) {
            m114a(context, f356b);
        }
    }

    public CameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f358d = 0;
        this.f359e = false;
        this.f364j = false;
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0718R.styleable.CameraView, i, 0);
            boolean z = obtainStyledAttributes.getBoolean(C0718R.styleable.CameraView_api_2_enabled, f356b);
            obtainStyledAttributes.recycle();
            m114a(context, z);
        }
    }

    public static void setApi2Enabled(boolean z) {
        f356b = z;
    }

    /* renamed from: a */
    private void m114a(Context context, boolean z) {
        if (!z || !CameraFeatures.allCamerasHaveApi2Support(context)) {
            Log.d(f355a, "Using camera 1 API.");
            this.cameraController = new CameraController1(context);
        } else {
            Log.d(f355a, "Using camera 2 API.");
            this.cameraController = new CameraController2(context);
        }
        addView(this.cameraController.getPreviewView());
    }

    @Deprecated
    public void setPreferredPreviewSize(int i, int i2) {
        this.cameraController.getPreferredCameraConfig().setPreviewSize(new CameraSize(i, i2));
    }

    @Deprecated
    public void setPreferredPictureSize(int i, int i2) {
        this.cameraController.getPreferredCameraConfig().setPictureSize(new CameraSize(i, i2));
    }

    @Deprecated
    public void setSceneMode(String str) {
        this.cameraController.getPreferredCameraConfig().setSceneMode(CameraFeatures.SceneMode.fromCamera1(str));
    }

    public void setUseMaxFpsRange(boolean z) {
        this.cameraController.mo12054a(z);
    }

    public void setPreferredPreviewFps(int i, int i2) {
        this.cameraController.mo12052a(i, i2);
    }

    @Deprecated
    public void setFocusConfig(FocusConfig focusConfig) {
        CameraConfig preferredCameraConfig = this.cameraController.getPreferredCameraConfig();
        preferredCameraConfig.setFocusMode(CameraFeatures.FocusMode.fromCamera1(focusConfig.f374a));
        preferredCameraConfig.setFocusRegionEnabled(focusConfig.f377d);
        preferredCameraConfig.setAutoExposureRegionEnabled(focusConfig.f378e);
        preferredCameraConfig.setFocusOnTouchEnabled(focusConfig.f379f);
        preferredCameraConfig.setAutoFocusInterval(focusConfig.f375b);
        preferredCameraConfig.setUpdateRegionsOnAutoFocusEnabled(focusConfig.f380g);
    }

    public CameraConfig getPreferredCameraConfig() {
        return this.cameraController.getPreferredCameraConfig();
    }

    public void setPreferredCameraConfig(CameraConfig cameraConfig) {
        this.cameraController.setPreferredCameraConfig(cameraConfig);
    }

    public CameraConfig getSettings() {
        return this.cameraController.getCameraConfig();
    }

    public void setCameraOpenListener(CameraOpenListener cameraOpenListener) {
        this.cameraController.setCameraOpenListener(cameraOpenListener);
    }

    public void setPreviewCropGravity(int i) {
        this.f358d = i;
        CameraController cameraController2 = this.cameraController;
        if (cameraController2 instanceof CameraController2) {
            ((CameraController2) cameraController2).mo12105a(i);
        }
    }

    public void setHighResolutionImageListener(HighResolutionImageListener highResolutionImageListener) {
        this.cameraController.setHighResolutionImageListener(highResolutionImageListener);
    }

    public float getScale() {
        return this.cameraController.getFrameToViewScale();
    }

    public int getFrameWidth() {
        return this.cameraController.getFrameWidth();
    }

    public int getFrameHeight() {
        return this.cameraController.getFrameHeight();
    }

    public CameraController getCameraController() {
        return this.cameraController;
    }

    public void callAutoFocus() {
        this.cameraController.callAutoFocus();
    }

    public void setFlashOn(boolean z) {
        this.cameraController.setFlashOn(z);
    }

    public void resetAutoFocusTimer() {
        this.cameraController.resetAutoFocusTimer();
    }

    public void setImageCropBounds(int i, int i2, int i3, int i4, boolean z) {
        this.f362h = i;
        this.f363i = i2;
        this.f361g = i3;
        this.f360f = i4;
        this.f359e = z;
        this.f364j = false;
    }

    public void setImageCropBoundsRelativeToCenter(int i, int i2, int i3, int i4, boolean z) {
        setImageCropBounds(i, i2, i3, i4, z);
        this.f364j = true;
    }

    public void setImageListener(ImageListener imageListener) {
        this.cameraController.setImageListener(imageListener);
    }

    public boolean hasNewImage() {
        return this.cameraController.hasNewImage();
    }

    public AnylineImage getNewImage() {
        AnylineYuvImage anylineYuvImage;
        synchronized (f357c) {
            if (this.f361g <= 0 || this.f360f <= 0) {
                anylineYuvImage = this.cameraController.getNewImage();
                if (anylineYuvImage != null) {
                    anylineYuvImage = anylineYuvImage.clone();
                }
            } else {
                int i = this.f362h;
                int i2 = this.f363i;
                if (this.f364j) {
                    i = (this.cameraController.getFrameWidth() / 2) + this.f362h;
                    i2 = (this.cameraController.getFrameHeight() / 2) + this.f363i;
                }
                if (!this.f359e && i == -1) {
                    i = (this.cameraController.getFrameWidth() / 2) - (this.f361g / 2);
                }
                int i3 = i;
                if (!this.f359e && i2 == -1) {
                    i2 = (this.cameraController.getFrameHeight() / 2) - (this.f360f / 2);
                }
                anylineYuvImage = this.cameraController.getNewImage(i3, i2, this.f361g, this.f360f, this.f359e);
            }
            if (anylineYuvImage == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder("getNewImage target size ");
            sb.append(anylineYuvImage.getTargetWidth());
            sb.append(" x ");
            sb.append(anylineYuvImage.getTargetHeight());
            AnylineImage anylineImage = new AnylineImage(anylineYuvImage);
            return anylineImage;
        }
    }

    public void takeHighResolutionImage() {
        this.cameraController.takeHighResolutionImage();
    }

    public AnylineImage getLastImageWithFullSize() {
        return this.cameraController.getLastImageWithFullSize();
    }

    public ImageReceiver getLastImageWithFullSizeReceiver() {
        return this.cameraController.getLastImageWithFullSizeReceiver();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View previewView = this.cameraController.getPreviewView();
        if (previewView != null) {
            int i6 = i3 - i;
            int i7 = i4 - i2;
            if (this.cameraController.getFrameWidth() == 0 || this.cameraController.getFrameHeight() == 0) {
                previewView.layout(0, 0, i6, i7);
                return;
            }
            int frameWidth = (int) (((float) this.cameraController.getFrameWidth()) * this.cameraController.getFrameToViewScale());
            int frameHeight = (int) (((float) this.cameraController.getFrameHeight()) * this.cameraController.getFrameToViewScale());
            int i8 = (i6 / 2) - (frameWidth / 2);
            int i9 = this.f358d;
            if (i9 != 0) {
                i5 = (i9 == 1 || i9 != 2) ? 0 : i7 - frameHeight;
            } else {
                i5 = (i7 / 2) - (frameHeight / 2);
            }
            this.layoutLeft = i8;
            this.layoutTop = i5;
            this.layoutRight = i8 + frameWidth;
            this.layoutBottom = i5 + frameHeight;
            StringBuilder sb = new StringBuilder("Layout surface: ");
            sb.append(this.layoutLeft);
            sb.append(", ");
            sb.append(this.layoutTop);
            sb.append(", ");
            sb.append(this.layoutRight);
            sb.append(", ");
            sb.append(this.layoutBottom);
            if (this.cameraController instanceof CameraController2) {
                previewView.layout(0, 0, i6, i7);
            } else {
                previewView.layout(this.layoutLeft, this.layoutTop, this.layoutRight, this.layoutBottom);
            }
        }
    }

    public void openCameraReportError() {
        this.cameraController.openCameraReportError();
    }

    public void openCameraInBackground() {
        this.cameraController.openCameraInBackground();
    }

    public void releaseCameraInBackground() {
        this.cameraController.releaseCameraInBackground();
    }

    public void releaseCamera() {
        this.cameraController.releaseCamera();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.cameraController.mo12055a(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void setEpsonConfig(String str, String str2, String str3, String str4, float f) {
        if (Build.MODEL.contains("bt2pro")) {
            CameraController cameraController2 = this.cameraController;
            if (cameraController2 instanceof CameraController1) {
                ((CameraController1) cameraController2).setEpsonConfig(str, str2, str3, str4, f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setEpsonExposureCompensation(String str) {
        if (Build.MODEL.contains("bt2pro")) {
            CameraController cameraController2 = this.cameraController;
            if (cameraController2 instanceof CameraController1) {
                ((CameraController1) cameraController2).mo12088a(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setEpsonWhitebalance(String str) {
        if (Build.MODEL.contains("bt2pro")) {
            CameraController cameraController2 = this.cameraController;
            if (cameraController2 instanceof CameraController1) {
                ((CameraController1) cameraController2).mo12090b(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setEpsonCameraSharpness(int i) {
        if (Build.MODEL.contains("bt2pro")) {
            CameraController cameraController2 = this.cameraController;
            if (cameraController2 instanceof CameraController1) {
                ((CameraController1) cameraController2).mo12087a(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setEpsonCameraContrast(int i) {
        if (Build.MODEL.contains("bt2pro")) {
            CameraController cameraController2 = this.cameraController;
            if (cameraController2 instanceof CameraController1) {
                ((CameraController1) cameraController2).mo12089b(i);
            }
        }
    }
}
