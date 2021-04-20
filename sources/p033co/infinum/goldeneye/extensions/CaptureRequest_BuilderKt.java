package p033co.infinum.goldeneye.extensions;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import kotlin.Metadata;
import p033co.infinum.goldeneye.config.camera2.Camera2ConfigImpl;
import p033co.infinum.goldeneye.models.FlashMode;
import p033co.infinum.goldeneye.utils.CameraUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0001¨\u0006\u0007"}, mo51343d2 = {"applyConfig", "", "Landroid/hardware/camera2/CaptureRequest$Builder;", "config", "Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "copyParamsFrom", "other", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.CaptureRequest_BuilderKt */
/* compiled from: CaptureRequest.Builder.kt */
public final class CaptureRequest_BuilderKt {
    public static final void copyParamsFrom(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
        if (builder2 != null && builder != null) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, builder2.get(CaptureRequest.CONTROL_AF_MODE));
            builder.set(CaptureRequest.CONTROL_EFFECT_MODE, builder2.get(CaptureRequest.CONTROL_EFFECT_MODE));
            builder.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, builder2.get(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE));
            builder.set(CaptureRequest.CONTROL_AWB_MODE, builder2.get(CaptureRequest.CONTROL_AWB_MODE));
            builder.set(CaptureRequest.SCALER_CROP_REGION, builder2.get(CaptureRequest.SCALER_CROP_REGION));
            builder.set(CaptureRequest.CONTROL_AE_MODE, builder2.get(CaptureRequest.CONTROL_AE_MODE));
            builder.set(CaptureRequest.FLASH_MODE, builder2.get(CaptureRequest.FLASH_MODE));
        }
    }

    public static final void applyConfig(CaptureRequest.Builder builder, Camera2ConfigImpl camera2ConfigImpl) {
        if (builder != null && camera2ConfigImpl != null) {
            if (camera2ConfigImpl.getSupportedFocusModes().contains(camera2ConfigImpl.getFocusMode())) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(camera2ConfigImpl.getFocusMode().toCamera2()));
            }
            if (camera2ConfigImpl.getSupportedColorEffectModes().contains(camera2ConfigImpl.getColorEffectMode())) {
                builder.set(CaptureRequest.CONTROL_EFFECT_MODE, Integer.valueOf(camera2ConfigImpl.getColorEffectMode().toCamera2()));
            }
            if (camera2ConfigImpl.getSupportedAntibandingModes().contains(camera2ConfigImpl.getAntibandingMode())) {
                builder.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, Integer.valueOf(camera2ConfigImpl.getAntibandingMode().toCamera2()));
            }
            if (camera2ConfigImpl.getSupportedWhiteBalanceModes().contains(camera2ConfigImpl.getWhiteBalanceMode())) {
                builder.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(camera2ConfigImpl.getWhiteBalanceMode().toCamera2()));
            }
            if (camera2ConfigImpl.getZoom() > 100) {
                Rect calculateCamera2ZoomRect = CameraUtils.INSTANCE.calculateCamera2ZoomRect(camera2ConfigImpl);
                if (calculateCamera2ZoomRect != null) {
                    builder.set(CaptureRequest.SCALER_CROP_REGION, calculateCamera2ZoomRect);
                }
            } else {
                builder.set(CaptureRequest.SCALER_CROP_REGION, (Object) null);
            }
            if (camera2ConfigImpl.getVideoStabilizationEnabled()) {
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(camera2ConfigImpl.getVideoStabilizationEnabled() ? 1 : 0));
            }
            if (!camera2ConfigImpl.getSupportedFlashModes().contains(camera2ConfigImpl.getFlashMode())) {
                return;
            }
            if (camera2ConfigImpl.getFlashMode() == FlashMode.TORCH) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(FlashMode.TORCH.toCamera2()));
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(camera2ConfigImpl.getFlashMode().toCamera2()));
            builder.set(CaptureRequest.FLASH_MODE, 0);
        }
    }
}
