package p033co.infinum.goldeneye.config.camera2;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.FlashMode;
import p033co.infinum.goldeneye.sessions.SessionsManager;
import p033co.infinum.goldeneye.utils.CameraUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera2/ConfigUpdateHandler;", "", "sessionsManager", "Lco/infinum/goldeneye/sessions/SessionsManager;", "config", "Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "(Lco/infinum/goldeneye/sessions/SessionsManager;Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;)V", "onPropertyUpdated", "", "property", "Lco/infinum/goldeneye/models/CameraProperty;", "updateFlashMode", "requestBuilder", "Landroid/hardware/camera2/CaptureRequest$Builder;", "flashMode", "Lco/infinum/goldeneye/models/FlashMode;", "updateVideoStabilization", "updateZoom", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.ConfigUpdateHandler */
/* compiled from: ConfigUpdateHandler.kt */
public final class ConfigUpdateHandler {
    /* access modifiers changed from: private */
    public final Camera2ConfigImpl config;
    private final SessionsManager sessionsManager;

    public ConfigUpdateHandler(SessionsManager sessionsManager2, Camera2ConfigImpl camera2ConfigImpl) {
        Intrinsics.checkParameterIsNotNull(sessionsManager2, "sessionsManager");
        Intrinsics.checkParameterIsNotNull(camera2ConfigImpl, "config");
        this.sessionsManager = sessionsManager2;
        this.config = camera2ConfigImpl;
    }

    public final void onPropertyUpdated(CameraProperty cameraProperty) {
        Intrinsics.checkParameterIsNotNull(cameraProperty, "property");
        switch (cameraProperty) {
            case FOCUS:
                this.sessionsManager.updateSession(new ConfigUpdateHandler$onPropertyUpdated$1(this));
                return;
            case FLASH:
                this.sessionsManager.resetFlashMode();
                this.sessionsManager.updateSession(new ConfigUpdateHandler$onPropertyUpdated$2(this));
                return;
            case COLOR_EFFECT:
                this.sessionsManager.updateSession(new ConfigUpdateHandler$onPropertyUpdated$3(this));
                return;
            case ANTIBANDING:
                this.sessionsManager.updateSession(new ConfigUpdateHandler$onPropertyUpdated$4(this));
                return;
            case WHITE_BALANCE:
                this.sessionsManager.updateSession(new ConfigUpdateHandler$onPropertyUpdated$5(this));
                return;
            case PICTURE_SIZE:
                this.sessionsManager.restartSession();
                return;
            case PREVIEW_SIZE:
                this.sessionsManager.restartSession();
                return;
            case ZOOM:
                this.sessionsManager.updateSession(new ConfigUpdateHandler$onPropertyUpdated$6(this));
                return;
            case VIDEO_STABILIZATION:
                updateVideoStabilization();
                return;
            case PREVIEW_SCALE:
                this.sessionsManager.restartSession();
                return;
            default:
                return;
        }
    }

    private final void updateVideoStabilization() {
        this.sessionsManager.updateSession(new ConfigUpdateHandler$updateVideoStabilization$1(this));
    }

    /* access modifiers changed from: private */
    public final void updateZoom(CaptureRequest.Builder builder) {
        Rect calculateCamera2ZoomRect = CameraUtils.INSTANCE.calculateCamera2ZoomRect(this.config);
        if (calculateCamera2ZoomRect != null) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, calculateCamera2ZoomRect);
        }
    }

    /* access modifiers changed from: private */
    public final void updateFlashMode(CaptureRequest.Builder builder, FlashMode flashMode) {
        if (flashMode == FlashMode.TORCH) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(FlashMode.TORCH.toCamera2()));
            return;
        }
        builder.set(CaptureRequest.FLASH_MODE, 0);
        builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(flashMode.toCamera2()));
    }
}
