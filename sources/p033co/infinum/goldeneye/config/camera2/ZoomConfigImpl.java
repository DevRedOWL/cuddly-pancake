package p033co.infinum.goldeneye.config.camera2;

import android.hardware.camera2.CameraCharacteristics;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import p033co.infinum.goldeneye.OnZoomChangedCallback;
import p033co.infinum.goldeneye.config.BaseZoomConfig;
import p033co.infinum.goldeneye.models.CameraProperty;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8VX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera2/ZoomConfigImpl;", "Lco/infinum/goldeneye/config/BaseZoomConfig;", "Landroid/hardware/camera2/CameraCharacteristics;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "onZoomChangedCallback", "Lco/infinum/goldeneye/OnZoomChangedCallback;", "(Lkotlin/jvm/functions/Function1;Lco/infinum/goldeneye/OnZoomChangedCallback;)V", "isZoomSupported", "", "()Z", "isZoomSupported$delegate", "Lkotlin/Lazy;", "maxZoom", "", "getMaxZoom", "()I", "maxZoom$delegate", "value", "zoom", "getZoom", "setZoom", "(I)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.ZoomConfigImpl */
/* compiled from: ZoomConfigImpl.kt */
public final class ZoomConfigImpl extends BaseZoomConfig<CameraCharacteristics> {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final Lazy isZoomSupported$delegate = LazyKt.lazy(new ZoomConfigImpl$isZoomSupported$2(this));
    private final Lazy maxZoom$delegate = LazyKt.lazy(new ZoomConfigImpl$maxZoom$2(this));
    private int zoom = 100;

    static {
        Class<ZoomConfigImpl> cls = ZoomConfigImpl.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "maxZoom", "getMaxZoom()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "isZoomSupported", "isZoomSupported()Z"))};
    }

    public int getMaxZoom() {
        Lazy lazy = this.maxZoom$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return ((Number) lazy.getValue()).intValue();
    }

    public boolean isZoomSupported() {
        Lazy lazy = this.isZoomSupported$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZoomConfigImpl(Function1<? super CameraProperty, Unit> function1, OnZoomChangedCallback onZoomChangedCallback) {
        super(function1, onZoomChangedCallback);
        Intrinsics.checkParameterIsNotNull(function1, "onUpdateCallback");
    }

    public int getZoom() {
        return this.zoom;
    }

    public void setZoom(int i) {
        if (isZoomSupported()) {
            this.zoom = RangesKt.coerceIn(i, 100, getMaxZoom());
            getOnUpdateCallback().invoke(CameraProperty.ZOOM);
            OnZoomChangedCallback onZoomChangedCallback = getOnZoomChangedCallback();
            if (onZoomChangedCallback != null) {
                onZoomChangedCallback.onZoomChanged(i);
                return;
            }
            return;
        }
        LogDelegate logDelegate = LogDelegate.INSTANCE;
        logDelegate.log("Unsupported ZoomLevel [" + i + ']');
    }
}
