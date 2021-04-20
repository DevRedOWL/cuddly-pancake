package p033co.infinum.goldeneye.config.camera2;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.BaseAdvancedFeatureConfig;
import p033co.infinum.goldeneye.config.BaseBasicFeatureConfig;
import p033co.infinum.goldeneye.config.BaseSizeConfig;
import p033co.infinum.goldeneye.config.BaseVideoConfig;
import p033co.infinum.goldeneye.config.BaseZoomConfig;
import p033co.infinum.goldeneye.config.CameraConfigImpl;
import p033co.infinum.goldeneye.config.CameraInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0013\u001a\u00020\u0011¨\u0006\u0014"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera2/Camera2ConfigImpl;", "Lco/infinum/goldeneye/config/CameraConfigImpl;", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraInfo", "Lco/infinum/goldeneye/config/CameraInfo;", "videoConfig", "Lco/infinum/goldeneye/config/BaseVideoConfig;", "basicFeatureConfig", "Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;", "advancedFeatureConfig", "Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;", "sizeConfig", "Lco/infinum/goldeneye/config/BaseSizeConfig;", "zoomConfig", "Lco/infinum/goldeneye/config/BaseZoomConfig;", "(Lco/infinum/goldeneye/config/CameraInfo;Lco/infinum/goldeneye/config/BaseVideoConfig;Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;Lco/infinum/goldeneye/config/BaseSizeConfig;Lco/infinum/goldeneye/config/BaseZoomConfig;)V", "isHardwareAtLeastFull", "", "isHardwareAtLeastLevel3", "isHardwareAtLeastLimited", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.Camera2ConfigImpl */
/* compiled from: Camera2ConfigImpl.kt */
public final class Camera2ConfigImpl extends CameraConfigImpl<CameraCharacteristics> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Camera2ConfigImpl(CameraInfo cameraInfo, BaseVideoConfig<CameraCharacteristics> baseVideoConfig, BaseBasicFeatureConfig<CameraCharacteristics> baseBasicFeatureConfig, BaseAdvancedFeatureConfig<CameraCharacteristics> baseAdvancedFeatureConfig, BaseSizeConfig<CameraCharacteristics> baseSizeConfig, BaseZoomConfig<CameraCharacteristics> baseZoomConfig) {
        super(cameraInfo, baseVideoConfig, baseBasicFeatureConfig, baseAdvancedFeatureConfig, baseSizeConfig, baseZoomConfig);
        Intrinsics.checkParameterIsNotNull(cameraInfo, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(baseVideoConfig, "videoConfig");
        Intrinsics.checkParameterIsNotNull(baseBasicFeatureConfig, "basicFeatureConfig");
        Intrinsics.checkParameterIsNotNull(baseAdvancedFeatureConfig, "advancedFeatureConfig");
        Intrinsics.checkParameterIsNotNull(baseSizeConfig, "sizeConfig");
        Intrinsics.checkParameterIsNotNull(baseZoomConfig, "zoomConfig");
    }

    public final boolean isHardwareAtLeastLimited() {
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) getCharacteristics();
        Integer num = cameraCharacteristics != null ? (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) : null;
        return (num != null && num.intValue() == 0) || isHardwareAtLeastFull() || isHardwareAtLeastLevel3();
    }

    private final boolean isHardwareAtLeastFull() {
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) getCharacteristics();
        Integer num = cameraCharacteristics != null ? (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) : null;
        if ((num != null && num.intValue() == 1) || isHardwareAtLeastLevel3()) {
            return true;
        }
        return false;
    }

    private final boolean isHardwareAtLeastLevel3() {
        if (Build.VERSION.SDK_INT >= 24) {
            CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) getCharacteristics();
            Integer num = cameraCharacteristics != null ? (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) : null;
            if (num != null && num.intValue() == 3) {
                return true;
            }
        }
        return false;
    }
}
