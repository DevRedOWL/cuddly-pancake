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
import p033co.infinum.goldeneye.config.BaseBasicFeatureConfig;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.FlashMode;
import p033co.infinum.goldeneye.models.FocusMode;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bR\u001b\u0010\t\u001a\u00020\n8VX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8VX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera1/BasicFeatureConfigImpl;", "Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(Lkotlin/jvm/functions/Function1;)V", "isTapToFocusSupported", "", "()Z", "isTapToFocusSupported$delegate", "Lkotlin/Lazy;", "supportedFlashModes", "", "Lco/infinum/goldeneye/models/FlashMode;", "getSupportedFlashModes", "()Ljava/util/List;", "supportedFlashModes$delegate", "supportedFocusModes", "Lco/infinum/goldeneye/models/FocusMode;", "getSupportedFocusModes", "supportedFocusModes$delegate", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.BasicFeatureConfigImpl */
/* compiled from: BasicFeatureConfigImpl.kt */
public final class BasicFeatureConfigImpl extends BaseBasicFeatureConfig<Camera.Parameters> {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final Lazy isTapToFocusSupported$delegate = LazyKt.lazy(new BasicFeatureConfigImpl$isTapToFocusSupported$2(this));
    private final Lazy supportedFlashModes$delegate = LazyKt.lazy(new BasicFeatureConfigImpl$supportedFlashModes$2(this));
    private final Lazy supportedFocusModes$delegate = LazyKt.lazy(new BasicFeatureConfigImpl$supportedFocusModes$2(this));

    static {
        Class<BasicFeatureConfigImpl> cls = BasicFeatureConfigImpl.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "isTapToFocusSupported", "isTapToFocusSupported()Z")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "supportedFlashModes", "getSupportedFlashModes()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "supportedFocusModes", "getSupportedFocusModes()Ljava/util/List;"))};
    }

    public List<FlashMode> getSupportedFlashModes() {
        Lazy lazy = this.supportedFlashModes$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (List) lazy.getValue();
    }

    public List<FocusMode> getSupportedFocusModes() {
        Lazy lazy = this.supportedFocusModes$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (List) lazy.getValue();
    }

    public boolean isTapToFocusSupported() {
        Lazy lazy = this.isTapToFocusSupported$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicFeatureConfigImpl(Function1<? super CameraProperty, Unit> function1) {
        super(function1);
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
    }
}
