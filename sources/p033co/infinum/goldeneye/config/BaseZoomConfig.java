package p033co.infinum.goldeneye.config;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.OnZoomChangedCallback;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001c@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, mo51343d2 = {"Lco/infinum/goldeneye/config/BaseZoomConfig;", "T", "", "Lco/infinum/goldeneye/config/ZoomConfig;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "onZoomChangedCallback", "Lco/infinum/goldeneye/OnZoomChangedCallback;", "(Lkotlin/jvm/functions/Function1;Lco/infinum/goldeneye/OnZoomChangedCallback;)V", "characteristics", "getCharacteristics", "()Ljava/lang/Object;", "setCharacteristics", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getOnUpdateCallback", "()Lkotlin/jvm/functions/Function1;", "getOnZoomChangedCallback", "()Lco/infinum/goldeneye/OnZoomChangedCallback;", "value", "", "pinchToZoomEnabled", "getPinchToZoomEnabled", "()Z", "setPinchToZoomEnabled", "(Z)V", "", "pinchToZoomFriction", "getPinchToZoomFriction", "()F", "setPinchToZoomFriction", "(F)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.BaseZoomConfig */
/* compiled from: ZoomConfig.kt */
public abstract class BaseZoomConfig<T> implements ZoomConfig {
    public T characteristics;
    private final Function1<CameraProperty, Unit> onUpdateCallback;
    private final OnZoomChangedCallback onZoomChangedCallback;
    private boolean pinchToZoomEnabled = true;
    private float pinchToZoomFriction = 1.0f;

    public BaseZoomConfig(Function1<? super CameraProperty, Unit> function1, OnZoomChangedCallback onZoomChangedCallback2) {
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
        this.onUpdateCallback = function1;
        this.onZoomChangedCallback = onZoomChangedCallback2;
    }

    /* access modifiers changed from: protected */
    public final Function1<CameraProperty, Unit> getOnUpdateCallback() {
        return this.onUpdateCallback;
    }

    /* access modifiers changed from: protected */
    public final OnZoomChangedCallback getOnZoomChangedCallback() {
        return this.onZoomChangedCallback;
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

    public boolean getPinchToZoomEnabled() {
        return this.pinchToZoomEnabled && isZoomSupported();
    }

    public void setPinchToZoomEnabled(boolean z) {
        this.pinchToZoomEnabled = isZoomSupported() && z;
    }

    public float getPinchToZoomFriction() {
        return this.pinchToZoomFriction;
    }

    public void setPinchToZoomFriction(float f) {
        if (f > ((float) 0)) {
            this.pinchToZoomFriction = f;
        } else {
            LogDelegate.INSTANCE.log("Pinch to zoom friction must be bigger than 0.");
        }
    }
}
