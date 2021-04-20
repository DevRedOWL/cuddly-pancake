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
import p033co.infinum.goldeneye.config.BaseVideoConfig;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.VideoQuality;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\rR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera1/VideoConfigImpl;", "Lco/infinum/goldeneye/config/BaseVideoConfig;", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "id", "", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "isVideoStabilizationSupported", "", "()Z", "isVideoStabilizationSupported$delegate", "Lkotlin/Lazy;", "supportedVideoQualities", "", "Lco/infinum/goldeneye/models/VideoQuality;", "getSupportedVideoQualities", "()Ljava/util/List;", "supportedVideoQualities$delegate", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.VideoConfigImpl */
/* compiled from: VideoConfigImpl.kt */
public final class VideoConfigImpl extends BaseVideoConfig<Camera.Parameters> {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    /* access modifiers changed from: private */

    /* renamed from: id */
    public final String f1133id;
    private final Lazy isVideoStabilizationSupported$delegate = LazyKt.lazy(new VideoConfigImpl$isVideoStabilizationSupported$2(this));
    private final Lazy supportedVideoQualities$delegate = LazyKt.lazy(new VideoConfigImpl$supportedVideoQualities$2(this));

    static {
        Class<VideoConfigImpl> cls = VideoConfigImpl.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "isVideoStabilizationSupported", "isVideoStabilizationSupported()Z")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "supportedVideoQualities", "getSupportedVideoQualities()Ljava/util/List;"))};
    }

    public List<VideoQuality> getSupportedVideoQualities() {
        Lazy lazy = this.supportedVideoQualities$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (List) lazy.getValue();
    }

    public boolean isVideoStabilizationSupported() {
        Lazy lazy = this.isVideoStabilizationSupported$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoConfigImpl(String str, Function1<? super CameraProperty, Unit> function1) {
        super(function1);
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
        this.f1133id = str;
    }
}
