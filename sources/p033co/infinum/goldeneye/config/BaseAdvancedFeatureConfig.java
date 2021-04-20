package p033co.infinum.goldeneye.config;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.models.AntibandingMode;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.ColorEffectMode;
import p033co.infinum.goldeneye.models.WhiteBalanceMode;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\b\u0010$\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00188V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001e8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, mo51343d2 = {"Lco/infinum/goldeneye/config/BaseAdvancedFeatureConfig;", "T", "", "Lco/infinum/goldeneye/config/AdvancedFeatureConfig;", "advancedFeaturesEnabled", "", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(ZLkotlin/jvm/functions/Function1;)V", "value", "Lco/infinum/goldeneye/models/AntibandingMode;", "antibandingMode", "getAntibandingMode", "()Lco/infinum/goldeneye/models/AntibandingMode;", "setAntibandingMode", "(Lco/infinum/goldeneye/models/AntibandingMode;)V", "characteristics", "getCharacteristics", "()Ljava/lang/Object;", "setCharacteristics", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "Lco/infinum/goldeneye/models/ColorEffectMode;", "colorEffectMode", "getColorEffectMode", "()Lco/infinum/goldeneye/models/ColorEffectMode;", "setColorEffectMode", "(Lco/infinum/goldeneye/models/ColorEffectMode;)V", "Lco/infinum/goldeneye/models/WhiteBalanceMode;", "whiteBalanceMode", "getWhiteBalanceMode", "()Lco/infinum/goldeneye/models/WhiteBalanceMode;", "setWhiteBalanceMode", "(Lco/infinum/goldeneye/models/WhiteBalanceMode;)V", "logAdvancedFeaturesDisabled", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.BaseAdvancedFeatureConfig */
/* compiled from: AdvancedFeatureConfig.kt */
public abstract class BaseAdvancedFeatureConfig<T> implements AdvancedFeatureConfig {
    private final boolean advancedFeaturesEnabled;
    private AntibandingMode antibandingMode = AntibandingMode.UNKNOWN;
    public T characteristics;
    private ColorEffectMode colorEffectMode = ColorEffectMode.UNKNOWN;
    private final Function1<CameraProperty, Unit> onUpdateCallback;
    private WhiteBalanceMode whiteBalanceMode = WhiteBalanceMode.UNKNOWN;

    public BaseAdvancedFeatureConfig(boolean z, Function1<? super CameraProperty, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
        this.advancedFeaturesEnabled = z;
        this.onUpdateCallback = function1;
    }

    public final T getCharacteristics() {
        T t = this.characteristics;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("characteristics");
        }
        return t;
    }

    public final void setCharacteristics(T t) {
        Intrinsics.checkParameterIsNotNull(t, "<set-?>");
        this.characteristics = t;
    }

    public WhiteBalanceMode getWhiteBalanceMode() {
        if (this.whiteBalanceMode != WhiteBalanceMode.UNKNOWN) {
            return this.whiteBalanceMode;
        }
        if (getSupportedWhiteBalanceModes().contains(WhiteBalanceMode.AUTO)) {
            return WhiteBalanceMode.AUTO;
        }
        return WhiteBalanceMode.UNKNOWN;
    }

    public void setWhiteBalanceMode(WhiteBalanceMode whiteBalanceMode2) {
        Intrinsics.checkParameterIsNotNull(whiteBalanceMode2, "value");
        if (!this.advancedFeaturesEnabled) {
            logAdvancedFeaturesDisabled();
        } else if (getSupportedWhiteBalanceModes().contains(whiteBalanceMode2)) {
            this.whiteBalanceMode = whiteBalanceMode2;
            this.onUpdateCallback.invoke(CameraProperty.WHITE_BALANCE);
        } else {
            LogDelegate logDelegate = LogDelegate.INSTANCE;
            logDelegate.log("Unsupported WhiteBalance [" + whiteBalanceMode2 + ']');
        }
    }

    public ColorEffectMode getColorEffectMode() {
        if (this.colorEffectMode != ColorEffectMode.UNKNOWN) {
            return this.colorEffectMode;
        }
        return ColorEffectMode.UNKNOWN;
    }

    public void setColorEffectMode(ColorEffectMode colorEffectMode2) {
        Intrinsics.checkParameterIsNotNull(colorEffectMode2, "value");
        if (!this.advancedFeaturesEnabled) {
            logAdvancedFeaturesDisabled();
        } else if (getSupportedColorEffectModes().contains(colorEffectMode2)) {
            this.colorEffectMode = colorEffectMode2;
            this.onUpdateCallback.invoke(CameraProperty.COLOR_EFFECT);
        } else {
            LogDelegate logDelegate = LogDelegate.INSTANCE;
            logDelegate.log("Unsupported ColorEffect [" + colorEffectMode2 + ']');
        }
    }

    public AntibandingMode getAntibandingMode() {
        if (this.antibandingMode != AntibandingMode.UNKNOWN) {
            return this.antibandingMode;
        }
        if (getSupportedAntibandingModes().contains(AntibandingMode.AUTO)) {
            return AntibandingMode.AUTO;
        }
        return AntibandingMode.UNKNOWN;
    }

    public void setAntibandingMode(AntibandingMode antibandingMode2) {
        Intrinsics.checkParameterIsNotNull(antibandingMode2, "value");
        if (!this.advancedFeaturesEnabled) {
            logAdvancedFeaturesDisabled();
        } else if (getSupportedAntibandingModes().contains(antibandingMode2)) {
            this.antibandingMode = antibandingMode2;
            this.onUpdateCallback.invoke(CameraProperty.ANTIBANDING);
        } else {
            LogDelegate logDelegate = LogDelegate.INSTANCE;
            logDelegate.log("Unsupported Antibanding [" + antibandingMode2 + ']');
        }
    }

    private final void logAdvancedFeaturesDisabled() {
        LogDelegate.INSTANCE.log("Advanced features disabled. Use GoldenEye#Builder.withAdvancedFeatures() method to activate them.");
    }
}
