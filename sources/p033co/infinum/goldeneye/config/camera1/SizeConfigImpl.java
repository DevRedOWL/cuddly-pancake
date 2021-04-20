package p033co.infinum.goldeneye.config.camera1;

import android.hardware.Camera;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p033co.infinum.goldeneye.config.BaseSizeConfig;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.config.VideoConfig;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.Size;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera1/SizeConfigImpl;", "Lco/infinum/goldeneye/config/BaseSizeConfig;", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "cameraInfo", "Lco/infinum/goldeneye/config/CameraInfo;", "videoConfig", "Lco/infinum/goldeneye/config/VideoConfig;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(Lco/infinum/goldeneye/config/CameraInfo;Lco/infinum/goldeneye/config/VideoConfig;Lkotlin/jvm/functions/Function1;)V", "supportedPictureSizes", "", "Lco/infinum/goldeneye/models/Size;", "getSupportedPictureSizes", "()Ljava/util/List;", "supportedPictureSizes$delegate", "Lkotlin/Lazy;", "supportedPreviewSizes", "getSupportedPreviewSizes", "supportedPreviewSizes$delegate", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.SizeConfigImpl */
/* compiled from: SizeConfigImpl.kt */
public final class SizeConfigImpl extends BaseSizeConfig<Camera.Parameters> {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final Lazy supportedPictureSizes$delegate = LazyKt.lazy(new SizeConfigImpl$supportedPictureSizes$2(this));
    private final Lazy supportedPreviewSizes$delegate = LazyKt.lazy(new SizeConfigImpl$supportedPreviewSizes$2(this));

    static {
        Class<SizeConfigImpl> cls = SizeConfigImpl.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "supportedPreviewSizes", "getSupportedPreviewSizes()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "supportedPictureSizes", "getSupportedPictureSizes()Ljava/util/List;"))};
    }

    public List<Size> getSupportedPictureSizes() {
        Lazy lazy = this.supportedPictureSizes$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (List) lazy.getValue();
    }

    public List<Size> getSupportedPreviewSizes() {
        Lazy lazy = this.supportedPreviewSizes$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (List) lazy.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeConfigImpl(CameraInfo cameraInfo, VideoConfig videoConfig, Function1<? super CameraProperty, Unit> function1) {
        super(cameraInfo, videoConfig, function1);
        Intrinsics.checkParameterIsNotNull(cameraInfo, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(videoConfig, "videoConfig");
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
    }
}
