package p033co.infinum.goldeneye.sessions;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.CameraConfigurationFailedException;
import p033co.infinum.goldeneye.InitCallback;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.extensions.CaptureRequest_BuilderKt;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, mo51343d2 = {"co/infinum/goldeneye/sessions/PictureSession$stateCallback$1", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "onConfigureFailed", "", "cameraCaptureSession", "Landroid/hardware/camera2/CameraCaptureSession;", "onConfigured", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.sessions.PictureSession$stateCallback$1 */
/* compiled from: PictureSession.kt */
public final class PictureSession$stateCallback$1 extends CameraCaptureSession.StateCallback {
    final /* synthetic */ CameraDevice $cameraDevice;
    final /* synthetic */ Camera2ConfigImpl $config;
    final /* synthetic */ PictureSession this$0;

    PictureSession$stateCallback$1(PictureSession pictureSession, CameraDevice cameraDevice, Camera2ConfigImpl camera2ConfigImpl) {
        this.this$0 = pictureSession;
        this.$cameraDevice = cameraDevice;
        this.$config = camera2ConfigImpl;
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Intrinsics.checkParameterIsNotNull(cameraCaptureSession, "cameraCaptureSession");
        this.this$0.setSession(cameraCaptureSession);
        try {
            PictureSession pictureSession = this.this$0;
            CaptureRequest.Builder createCaptureRequest = this.$cameraDevice.createCaptureRequest(1);
            CaptureRequest_BuilderKt.applyConfig(createCaptureRequest, this.$config);
            Surface surface = this.this$0.getSurface();
            if (surface == null) {
                Intrinsics.throwNpe();
            }
            createCaptureRequest.addTarget(surface);
            pictureSession.setSessionBuilder(createCaptureRequest);
            this.this$0.startSession();
            InitCallback access$getInitCallback$p = this.this$0.initCallback;
            if (access$getInitCallback$p != null) {
                access$getInitCallback$p.onActive();
            }
            this.this$0.initCallback = null;
        } catch (Throwable th) {
            LogDelegate.INSTANCE.log("Failed to open camera preview.", th);
            InitCallback access$getInitCallback$p2 = this.this$0.initCallback;
            if (access$getInitCallback$p2 != null) {
                access$getInitCallback$p2.onError(th);
            }
            this.this$0.initCallback = null;
        }
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Intrinsics.checkParameterIsNotNull(cameraCaptureSession, "cameraCaptureSession");
        LogDelegate.INSTANCE.log("Failed to configure camera.", CameraConfigurationFailedException.INSTANCE);
        InitCallback access$getInitCallback$p = this.this$0.initCallback;
        if (access$getInitCallback$p != null) {
            access$getInitCallback$p.onError(CameraConfigurationFailedException.INSTANCE);
        }
        this.this$0.initCallback = null;
    }
}
