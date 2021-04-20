package p033co.infinum.goldeneye.config;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.models.FlashMode;
import p033co.infinum.goldeneye.models.FocusMode;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bR\u001c\u0010\t\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00168V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u001c@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\"8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020(@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, mo51343d2 = {"Lco/infinum/goldeneye/config/BaseBasicFeatureConfig;", "T", "", "Lco/infinum/goldeneye/config/BasicFeatureConfig;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "(Lkotlin/jvm/functions/Function1;)V", "characteristics", "getCharacteristics", "()Ljava/lang/Object;", "setCharacteristics", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "Lco/infinum/goldeneye/models/FlashMode;", "flashMode", "getFlashMode", "()Lco/infinum/goldeneye/models/FlashMode;", "setFlashMode", "(Lco/infinum/goldeneye/models/FlashMode;)V", "Lco/infinum/goldeneye/models/FocusMode;", "focusMode", "getFocusMode", "()Lco/infinum/goldeneye/models/FocusMode;", "setFocusMode", "(Lco/infinum/goldeneye/models/FocusMode;)V", "", "pictureQuality", "getPictureQuality", "()I", "setPictureQuality", "(I)V", "", "tapToFocusEnabled", "getTapToFocusEnabled", "()Z", "setTapToFocusEnabled", "(Z)V", "", "tapToFocusResetDelay", "getTapToFocusResetDelay", "()J", "setTapToFocusResetDelay", "(J)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.BaseBasicFeatureConfig */
/* compiled from: BasicFeatureConfig.kt */
public abstract class BaseBasicFeatureConfig<T> implements BasicFeatureConfig {
    public T characteristics;
    private FlashMode flashMode = FlashMode.UNKNOWN;
    private FocusMode focusMode = FocusMode.UNKNOWN;
    private final Function1<CameraProperty, Unit> onUpdateCallback;
    private int pictureQuality = 100;
    private boolean tapToFocusEnabled = true;
    private long tapToFocusResetDelay = 7500;

    public BaseBasicFeatureConfig(Function1<? super CameraProperty, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
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

    public boolean getTapToFocusEnabled() {
        return this.tapToFocusEnabled && isTapToFocusSupported();
    }

    public void setTapToFocusEnabled(boolean z) {
        if (isTapToFocusSupported()) {
            this.tapToFocusEnabled = z;
        } else {
            LogDelegate.INSTANCE.log("Unsupported Tap to focus.");
        }
    }

    public long getTapToFocusResetDelay() {
        return this.tapToFocusResetDelay;
    }

    public void setTapToFocusResetDelay(long j) {
        if (j > 0) {
            this.tapToFocusResetDelay = j;
        } else {
            LogDelegate.INSTANCE.log("Reset focus delay must be bigger than 0.");
        }
    }

    public int getPictureQuality() {
        return this.pictureQuality;
    }

    public void setPictureQuality(int i) {
        this.pictureQuality = RangesKt.coerceIn(i, 1, 100);
    }

    public FlashMode getFlashMode() {
        if (this.flashMode != FlashMode.UNKNOWN) {
            return this.flashMode;
        }
        if (getSupportedFlashModes().contains(FlashMode.AUTO)) {
            return FlashMode.AUTO;
        }
        if (getSupportedFlashModes().contains(FlashMode.OFF)) {
            return FlashMode.OFF;
        }
        return FlashMode.UNKNOWN;
    }

    public void setFlashMode(FlashMode flashMode2) {
        Intrinsics.checkParameterIsNotNull(flashMode2, "value");
        if (getSupportedFlashModes().contains(flashMode2)) {
            this.flashMode = flashMode2;
            this.onUpdateCallback.invoke(CameraProperty.FLASH);
            return;
        }
        LogDelegate logDelegate = LogDelegate.INSTANCE;
        logDelegate.log("Unsupported FlashMode [" + flashMode2 + ']');
    }

    public FocusMode getFocusMode() {
        if (this.focusMode != FocusMode.UNKNOWN) {
            return this.focusMode;
        }
        if (getSupportedFocusModes().contains(FocusMode.CONTINUOUS_PICTURE)) {
            return FocusMode.CONTINUOUS_PICTURE;
        }
        if (getSupportedFocusModes().contains(FocusMode.AUTO)) {
            return FocusMode.AUTO;
        }
        return FocusMode.UNKNOWN;
    }

    public void setFocusMode(FocusMode focusMode2) {
        Intrinsics.checkParameterIsNotNull(focusMode2, "value");
        if (getSupportedFocusModes().contains(focusMode2)) {
            this.focusMode = focusMode2;
            this.onUpdateCallback.invoke(CameraProperty.FOCUS);
            return;
        }
        LogDelegate logDelegate = LogDelegate.INSTANCE;
        logDelegate.log("Unsupported FocusMode [" + focusMode2 + ']');
    }
}
