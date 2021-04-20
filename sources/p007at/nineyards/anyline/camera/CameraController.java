package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineYuvImage;

/* renamed from: at.nineyards.anyline.camera.CameraController */
public abstract class CameraController {

    /* renamed from: b */
    private static final String f248b = CameraController.class.getSimpleName();

    /* renamed from: a */
    C0733b f249a;
    protected C0732a autoFocusTimer;
    protected CameraConfig cameraConfig;
    protected CameraFeatures cameraFeatures;
    protected CameraOpenListener cameraListener;
    protected HighResolutionImageListener highResolutionImageListener;
    protected ImageListener imageListener;
    protected boolean isUseMaxFpsRange = false;
    protected CameraConfig preferredCameraConfig = new CameraConfig();
    protected int preferredMaxPreviewFps;
    protected int preferredMinPreviewFps;
    protected View previewView;

    /* renamed from: at.nineyards.anyline.camera.CameraController$b */
    interface C0733b {
        /* renamed from: a */
        void mo11936a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo12053a(Context context, RectF rectF, float f, float f2);

    public abstract void callAutoFocus();

    public abstract AnylineImage getLastImageWithFullSize();

    public abstract ImageReceiver getLastImageWithFullSizeReceiver();

    @Deprecated
    public abstract AnylineYuvImage getNewImage();

    public abstract AnylineYuvImage getNewImage(int i, int i2, int i3, int i4, boolean z);

    public abstract boolean hasNewImage();

    public abstract void openCameraInBackground();

    public abstract void openCameraReportError();

    public abstract void releaseCamera();

    public abstract void releaseCameraInBackground();

    public abstract void setFlashOn(boolean z);

    public abstract void takeHighResolutionImage();

    public CameraConfig getPreferredCameraConfig() {
        return this.preferredCameraConfig;
    }

    public void setPreferredCameraConfig(CameraConfig cameraConfig2) {
        this.preferredCameraConfig = cameraConfig2;
    }

    public CameraConfig getCameraConfig() {
        return this.cameraConfig;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12054a(boolean z) {
        this.isUseMaxFpsRange = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12052a(int i, int i2) {
        this.preferredMinPreviewFps = i;
        this.preferredMaxPreviewFps = i2;
    }

    public void setHighResolutionImageListener(HighResolutionImageListener highResolutionImageListener2) {
        this.highResolutionImageListener = highResolutionImageListener2;
    }

    public void setCameraOpenListener(CameraOpenListener cameraOpenListener) {
        this.cameraListener = cameraOpenListener;
    }

    public void setImageListener(ImageListener imageListener2) {
        this.imageListener = imageListener2;
    }

    public void resetAutoFocusTimer() {
        C0732a aVar = this.autoFocusTimer;
        if (aVar != null) {
            aVar.mo12084a();
        }
    }

    /* access modifiers changed from: protected */
    public void initAutoFocusTimer() {
        if (this.cameraConfig.getAutoFocusInterval() > 0 && this.cameraConfig.isFocusModeAuto()) {
            C0732a aVar = this.autoFocusTimer;
            if (aVar == null) {
                this.autoFocusTimer = new C0732a(this.cameraConfig.getAutoFocusInterval());
                this.autoFocusTimer.start();
                return;
            }
            aVar.mo12085a(this.cameraConfig.getAutoFocusInterval());
            this.autoFocusTimer.mo12084a();
        } else if (this.autoFocusTimer != null) {
            stopAutoFocusTimer();
        }
    }

    /* access modifiers changed from: protected */
    public void stopAutoFocusTimer() {
        C0732a aVar = this.autoFocusTimer;
        if (aVar != null) {
            aVar.interrupt();
            this.autoFocusTimer = null;
        }
    }

    public View getPreviewView() {
        return this.previewView;
    }

    public int getFrameWidth() {
        CameraConfig cameraConfig2 = this.cameraConfig;
        if (cameraConfig2 == null) {
            return 0;
        }
        return cameraConfig2.getFrameWidth();
    }

    public int getFrameHeight() {
        CameraConfig cameraConfig2 = this.cameraConfig;
        if (cameraConfig2 == null) {
            return 0;
        }
        return cameraConfig2.getFrameHeight();
    }

    public float getFrameToViewScale() {
        CameraConfig cameraConfig2 = this.cameraConfig;
        if (cameraConfig2 == null) {
            return 0.0f;
        }
        return cameraConfig2.getFrameToViewScale();
    }

    public CameraFeatures getCameraFeatures() {
        return this.cameraFeatures;
    }

    /* access modifiers changed from: protected */
    public void reportCameraError(final Exception exc) {
        if (this.cameraListener != null) {
            this.previewView.post(new Runnable() {
                public final void run() {
                    CameraController.this.cameraListener.onCameraError(exc);
                }
            });
            return;
        }
        throw new RuntimeException(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12055a(MotionEvent motionEvent) {
        CameraConfig cameraConfig2 = this.cameraConfig;
        if (cameraConfig2 == null || !cameraConfig2.isFocusOnTouchEnabled() || !this.cameraConfig.isFocusModeAuto()) {
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return true;
        }
        resetAutoFocusTimer();
        callAutoFocus();
        resetAutoFocusTimer();
        return true;
    }

    /* renamed from: at.nineyards.anyline.camera.CameraController$a */
    class C0732a extends Thread {

        /* renamed from: b */
        private long f253b = System.currentTimeMillis();

        /* renamed from: c */
        private int f254c;

        C0732a(int i) {
            this.f254c = i;
        }

        public final void run() {
            while (!interrupted()) {
                try {
                    Thread.sleep(500);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f253b > ((long) this.f254c)) {
                        CameraController.this.callAutoFocus();
                        this.f253b = currentTimeMillis;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized void mo12085a(int i) {
            this.f254c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized void mo12084a() {
            this.f253b = System.currentTimeMillis();
        }
    }
}
