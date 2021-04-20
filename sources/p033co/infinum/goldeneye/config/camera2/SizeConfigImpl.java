package p033co.infinum.goldeneye.config.camera2;

import android.hardware.camera2.CameraCharacteristics;
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

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera2/SizeConfigImpl;", "Lco/infinum/goldeneye/config/BaseSizeConfig;", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraInfo", "Lco/infinum/goldeneye/config/CameraInfo;", "videoConfig", "Lco/infinum/goldeneye/config/VideoConfig;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(Lco/infinum/goldeneye/config/CameraInfo;Lco/infinum/goldeneye/config/VideoConfig;Lkotlin/jvm/functions/Function1;)V", "supportedPictureSizes", "", "Lco/infinum/goldeneye/models/Size;", "getSupportedPictureSizes", "()Ljava/util/List;", "supportedPictureSizes$delegate", "Lkotlin/Lazy;", "supportedPreviewSizes", "getSupportedPreviewSizes", "supportedPreviewSizes$delegate", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.SizeConfigImpl */
/* compiled from: SizeConfigImpl.kt */
public final class SizeConfigImpl extends BaseSizeConfig<CameraCharacteristics> {
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
