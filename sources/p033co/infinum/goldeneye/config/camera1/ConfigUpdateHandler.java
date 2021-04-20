package p033co.infinum.goldeneye.config.camera1;

import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.BaseGoldenEye;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.extensions.CameraKt;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.CameraState;
import p033co.infinum.goldeneye.models.PreviewScale;
import p033co.infinum.goldeneye.models.Size;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera1/ConfigUpdateHandler;", "", "camera", "Landroid/hardware/Camera;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "restartPreview", "Lkotlin/Function0;", "", "(Landroid/hardware/Camera;Lco/infinum/goldeneye/config/CameraConfig;Lkotlin/jvm/functions/Function0;)V", "onPropertyUpdated", "property", "Lco/infinum/goldeneye/models/CameraProperty;", "updatePictureSize", "pictureSize", "Lco/infinum/goldeneye/models/Size;", "previewSize", "updatePreviewSize", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.ConfigUpdateHandler */
/* compiled from: ConfigUpdateHandler.kt */
public final class ConfigUpdateHandler {
    private final Camera camera;
    /* access modifiers changed from: private */
    public final CameraConfig config;
    private final Function0<Unit> restartPreview;

    public ConfigUpdateHandler(Camera camera2, CameraConfig cameraConfig, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(camera2, "camera");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        Intrinsics.checkParameterIsNotNull(function0, "restartPreview");
        this.camera = camera2;
        this.config = cameraConfig;
        this.restartPreview = function0;
    }

    public final void onPropertyUpdated(CameraProperty cameraProperty) {
        Intrinsics.checkParameterIsNotNull(cameraProperty, "property");
        switch (cameraProperty) {
            case FOCUS:
                CameraKt.updateParams(this.camera, new ConfigUpdateHandler$onPropertyUpdated$1(this));
                return;
            case FLASH:
                CameraKt.updateParams(this.camera, new ConfigUpdateHandler$onPropertyUpdated$2(this));
                return;
            case COLOR_EFFECT:
                CameraKt.updateParams(this.camera, new ConfigUpdateHandler$onPropertyUpdated$3(this));
                return;
            case ANTIBANDING:
                CameraKt.updateParams(this.camera, new ConfigUpdateHandler$onPropertyUpdated$4(this));
                return;
            case WHITE_BALANCE:
                CameraKt.updateParams(this.camera, new ConfigUpdateHandler$onPropertyUpdated$5(this));
                return;
            case PICTURE_SIZE:
                updatePictureSize(this.config.getPictureSize(), this.config.getPreviewSize());
                return;
            case PREVIEW_SIZE:
                updatePreviewSize(this.config.getPreviewSize());
                return;
            case ZOOM:
                CameraKt.updateParams(this.camera, new ConfigUpdateHandler$onPropertyUpdated$6(this));
                return;
            case VIDEO_STABILIZATION:
                CameraKt.updateParams(this.camera, new ConfigUpdateHandler$onPropertyUpdated$7(this));
                return;
            case PREVIEW_SCALE:
                this.restartPreview.invoke();
                return;
            default:
                return;
        }
    }

    private final void updatePictureSize(Size size, Size size2) {
        CameraKt.updateParams(this.camera, new ConfigUpdateHandler$updatePictureSize$1(size));
        if ((this.config.getPreviewScale() == PreviewScale.AUTO_FILL || this.config.getPreviewScale() == PreviewScale.AUTO_FIT) && BaseGoldenEye.Companion.getState() != CameraState.RECORDING_VIDEO) {
            updatePreviewSize(size2);
        }
    }

    private final void updatePreviewSize(Size size) {
        CameraKt.updateParams(this.camera, new ConfigUpdateHandler$updatePreviewSize$1(size));
        this.restartPreview.invoke();
    }
}
