package p033co.infinum.goldeneye.sessions;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaRecorder;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.CameraConfigurationFailedException;
import p033co.infinum.goldeneye.VideoCallback;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.extensions.CaptureRequest_BuilderKt;
import p033co.infinum.goldeneye.utils.AsyncUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, mo51343d2 = {"co/infinum/goldeneye/sessions/VideoSession$stateCallback$1", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "onConfigureFailed", "", "cameraCaptureSession", "Landroid/hardware/camera2/CameraCaptureSession;", "onConfigured", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.sessions.VideoSession$stateCallback$1 */
/* compiled from: VideoSession.kt */
public final class VideoSession$stateCallback$1 extends CameraCaptureSession.StateCallback {
    final /* synthetic */ CameraDevice $cameraDevice;
    final /* synthetic */ Camera2ConfigImpl $config;
    final /* synthetic */ VideoSession this$0;

    VideoSession$stateCallback$1(VideoSession videoSession, CameraDevice cameraDevice, Camera2ConfigImpl camera2ConfigImpl) {
        this.this$0 = videoSession;
        this.$cameraDevice = cameraDevice;
        this.$config = camera2ConfigImpl;
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Intrinsics.checkParameterIsNotNull(cameraCaptureSession, "cameraCaptureSession");
        this.this$0.setSession(cameraCaptureSession);
        try {
            VideoSession videoSession = this.this$0;
            CaptureRequest.Builder createCaptureRequest = this.$cameraDevice.createCaptureRequest(3);
            CaptureRequest_BuilderKt.applyConfig(createCaptureRequest, this.$config);
            Surface surface = this.this$0.getSurface();
            if (surface == null) {
                Intrinsics.throwNpe();
            }
            createCaptureRequest.addTarget(surface);
            Surface access$getMediaSurface$p = this.this$0.mediaSurface;
            if (access$getMediaSurface$p == null) {
                Intrinsics.throwNpe();
            }
            createCaptureRequest.addTarget(access$getMediaSurface$p);
            videoSession.setSessionBuilder(createCaptureRequest);
            CameraCaptureSession session = this.this$0.getSession();
            if (session != null) {
                CaptureRequest.Builder sessionBuilder = this.this$0.getSessionBuilder();
                CaptureRequest build = sessionBuilder != null ? sessionBuilder.build() : null;
                if (build == null) {
                    Intrinsics.throwNpe();
                }
                session.setRepeatingRequest(build, (CameraCaptureSession.CaptureCallback) null, AsyncUtils.INSTANCE.getBackgroundHandler());
            }
            MediaRecorder access$getMediaRecorder$p = this.this$0.mediaRecorder;
            if (access$getMediaRecorder$p != null) {
                access$getMediaRecorder$p.start();
            }
        } catch (Throwable th) {
            VideoCallback access$getCallback$p = this.this$0.callback;
            if (access$getCallback$p != null) {
                access$getCallback$p.onError(th);
            }
        }
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Intrinsics.checkParameterIsNotNull(cameraCaptureSession, "cameraCaptureSession");
        VideoCallback access$getCallback$p = this.this$0.callback;
        if (access$getCallback$p != null) {
            access$getCallback$p.onError(CameraConfigurationFailedException.INSTANCE);
        }
    }
}
