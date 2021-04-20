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
import p033co.infinum.goldeneye.config.BaseAdvancedFeatureConfig;
import p033co.infinum.goldeneye.models.AntibandingMode;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.ColorEffectMode;
import p033co.infinum.goldeneye.models.WhiteBalanceMode;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f8VX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f8VX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001a"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera1/AdvancedFeatureConfigImpl;", "Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "advancedFeaturesEnabled", "", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(ZLkotlin/jvm/functions/Function1;)V", "supportedAntibandingModes", "", "Lco/infinum/goldeneye/models/AntibandingMode;", "getSupportedAntibandingModes", "()Ljava/util/List;", "supportedAntibandingModes$delegate", "Lkotlin/Lazy;", "supportedColorEffectModes", "Lco/infinum/goldeneye/models/ColorEffectMode;", "getSupportedColorEffectModes", "supportedColorEffectModes$delegate", "supportedWhiteBalanceModes", "Lco/infinum/goldeneye/models/WhiteBalanceMode;", "getSupportedWhiteBalanceModes", "supportedWhiteBalanceModes$delegate", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.AdvancedFeatureConfigImpl */
/* compiled from: AdvancedFeatureConfigImpl.kt */
public final class AdvancedFeatureConfigImpl extends BaseAdvancedFeatureConfig<Camera.Parameters> {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final Lazy supportedAntibandingModes$delegate = LazyKt.lazy(new AdvancedFeatureConfigImpl$supportedAntibandingModes$2(this));
    private final Lazy supportedColorEffectModes$delegate = LazyKt.lazy(new AdvancedFeatureConfigImpl$supportedColorEffectModes$2(this));
    private final Lazy supportedWhiteBalanceModes$delegate = LazyKt.lazy(new AdvancedFeatureConfigImpl$supportedWhiteBalanceModes$2(this));

    static {
        Class<AdvancedFeatureConfigImpl> cls = AdvancedFeatureConfigImpl.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "supportedWhiteBalanceModes", "getSupportedWhiteBalanceModes()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "supportedColorEffectModes", "getSupportedColorEffectModes()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "supportedAntibandingModes", "getSupportedAntibandingModes()Ljava/util/List;"))};
    }

    public List<AntibandingMode> getSupportedAntibandingModes() {
        Lazy lazy = this.supportedAntibandingModes$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (List) lazy.getValue();
    }

    public List<ColorEffectMode> getSupportedColorEffectModes() {
        Lazy lazy = this.supportedColorEffectModes$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (List) lazy.getValue();
    }

    public List<WhiteBalanceMode> getSupportedWhiteBalanceModes() {
        Lazy lazy = this.supportedWhiteBalanceModes$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (List) lazy.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdvancedFeatureConfigImpl(boolean z, Function1<? super CameraProperty, Unit> function1) {
        super(z, function1);
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
    }
}
