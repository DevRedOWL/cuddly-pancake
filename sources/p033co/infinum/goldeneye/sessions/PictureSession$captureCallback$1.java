package p033co.infinum.goldeneye.sessions;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageReader;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.PictureCallback;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.extensions.CaptureRequest_BuilderKt;
import p033co.infinum.goldeneye.extensions.CaptureResultKt;
import p033co.infinum.goldeneye.utils.AsyncUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0002J&\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\fH\u0002¨\u0006\r"}, mo51343d2 = {"co/infinum/goldeneye/sessions/PictureSession$captureCallback$1", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "capture", "", "onCaptureCompleted", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "request", "Landroid/hardware/camera2/CaptureRequest;", "result", "Landroid/hardware/camera2/TotalCaptureResult;", "process", "Landroid/hardware/camera2/CaptureResult;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.sessions.PictureSession$captureCallback$1 */
/* compiled from: PictureSession.kt */
public final class PictureSession$captureCallback$1 extends CameraCaptureSession.CaptureCallback {
    final /* synthetic */ CameraDevice $cameraDevice;
    final /* synthetic */ Camera2ConfigImpl $config;
    final /* synthetic */ PictureSession this$0;

    PictureSession$captureCallback$1(PictureSession pictureSession, CameraDevice cameraDevice, Camera2ConfigImpl camera2ConfigImpl) {
        this.this$0 = pictureSession;
        this.$cameraDevice = cameraDevice;
        this.$config = camera2ConfigImpl;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        if (totalCaptureResult != null) {
            process(totalCaptureResult);
        }
    }

    private final void process(CaptureResult captureResult) {
        try {
            if (!this.this$0.locked) {
                if (!CaptureResultKt.isLocked(captureResult)) {
                    if (this.this$0.captureTimes <= 15) {
                        PictureSession pictureSession = this.this$0;
                        pictureSession.captureTimes = pictureSession.captureTimes + 1;
                        CameraCaptureSession session = this.this$0.getSession();
                        if (session != null) {
                            CaptureRequest.Builder sessionBuilder = this.this$0.getSessionBuilder();
                            CaptureRequest build = sessionBuilder != null ? sessionBuilder.build() : null;
                            if (build == null) {
                                Intrinsics.throwNpe();
                            }
                            session.capture(build, this, AsyncUtils.INSTANCE.getBackgroundHandler());
                            return;
                        }
                        return;
                    }
                }
                this.this$0.locked = true;
                capture();
            }
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to take picture.", th);
            PictureCallback access$getPictureCallback$p = this.this$0.pictureCallback;
            if (access$getPictureCallback$p != null) {
                access$getPictureCallback$p.onError(th);
            }
        }
    }

    private final void capture() {
        CaptureRequest.Builder createCaptureRequest = this.$cameraDevice.createCaptureRequest(2);
        CaptureRequest_BuilderKt.copyParamsFrom(createCaptureRequest, this.this$0.getSessionBuilder());
        createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf((byte) this.$config.getPictureQuality()));
        ImageReader access$getImageReader$p = this.this$0.imageReader;
        Surface surface = access$getImageReader$p != null ? access$getImageReader$p.getSurface() : null;
        if (surface == null) {
            Intrinsics.throwNpe();
        }
        createCaptureRequest.addTarget(surface);
        CameraCaptureSession session = this.this$0.getSession();
        if (session != null) {
            session.stopRepeating();
            session.capture(createCaptureRequest.build(), (CameraCaptureSession.CaptureCallback) null, AsyncUtils.INSTANCE.getBackgroundHandler());
        }
    }
}
