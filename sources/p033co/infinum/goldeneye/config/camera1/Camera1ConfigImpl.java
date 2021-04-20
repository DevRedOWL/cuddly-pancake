package p033co.infinum.goldeneye.config.camera1;

import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.BaseAdvancedFeatureConfig;
import p033co.infinum.goldeneye.config.BaseBasicFeatureConfig;
import p033co.infinum.goldeneye.config.BaseSizeConfig;
import p033co.infinum.goldeneye.config.BaseVideoConfig;
import p033co.infinum.goldeneye.config.BaseZoomConfig;
import p033co.infinum.goldeneye.config.CameraConfigImpl;
import p033co.infinum.goldeneye.config.CameraInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0007\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\t\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u000b\u0012\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\r\u0012\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u000f¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera1/Camera1ConfigImpl;", "Lco/infinum/goldeneye/config/CameraConfigImpl;", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "cameraInfo", "Lco/infinum/goldeneye/config/CameraInfo;", "videoConfig", "Lco/infinum/goldeneye/config/BaseVideoConfig;", "basicFeatureConfig", "Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;", "sizeConfig", "Lco/infinum/goldeneye/config/BaseSizeConfig;", "zoomConfig", "Lco/infinum/goldeneye/config/BaseZoomConfig;", "advancedFeatureConfig", "Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;", "(Lco/infinum/goldeneye/config/CameraInfo;Lco/infinum/goldeneye/config/BaseVideoConfig;Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;Lco/infinum/goldeneye/config/BaseSizeConfig;Lco/infinum/goldeneye/config/BaseZoomConfig;Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.Camera1ConfigImpl */
/* compiled from: Camera1ConfigImpl.kt */
public final class Camera1ConfigImpl extends CameraConfigImpl<Camera.Parameters> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Camera1ConfigImpl(CameraInfo cameraInfo, BaseVideoConfig<Camera.Parameters> baseVideoConfig, BaseBasicFeatureConfig<Camera.Parameters> baseBasicFeatureConfig, BaseSizeConfig<Camera.Parameters> baseSizeConfig, BaseZoomConfig<Camera.Parameters> baseZoomConfig, BaseAdvancedFeatureConfig<Camera.Parameters> baseAdvancedFeatureConfig) {
        super(cameraInfo, baseVideoConfig, baseBasicFeatureConfig, baseAdvancedFeatureConfig, baseSizeConfig, baseZoomConfig);
        Intrinsics.checkParameterIsNotNull(cameraInfo, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(baseVideoConfig, "videoConfig");
        Intrinsics.checkParameterIsNotNull(baseBasicFeatureConfig, "basicFeatureConfig");
        Intrinsics.checkParameterIsNotNull(baseSizeConfig, "sizeConfig");
        Intrinsics.checkParameterIsNotNull(baseZoomConfig, "zoomConfig");
        Intrinsics.checkParameterIsNotNull(baseAdvancedFeatureConfig, "advancedFeatureConfig");
    }
}
