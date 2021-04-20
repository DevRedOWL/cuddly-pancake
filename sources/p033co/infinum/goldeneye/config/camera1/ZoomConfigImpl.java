package p033co.infinum.goldeneye.config.camera1;

import android.hardware.Camera;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p033co.infinum.goldeneye.OnZoomChangedCallback;
import p033co.infinum.goldeneye.config.BaseZoomConfig;
import p033co.infinum.goldeneye.models.CameraProperty;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, mo51343d2 = {"Lco/infinum/goldeneye/config/camera1/ZoomConfigImpl;", "Lco/infinum/goldeneye/config/BaseZoomConfig;", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "onUpdateCallback", "Lkotlin/Function1;", "Lco/infinum/goldeneye/models/CameraProperty;", "", "onZoomChangedCallback", "Lco/infinum/goldeneye/OnZoomChangedCallback;", "(Lkotlin/jvm/functions/Function1;Lco/infinum/goldeneye/OnZoomChangedCallback;)V", "isZoomSupported", "", "()Z", "isZoomSupported$delegate", "Lkotlin/Lazy;", "maxZoom", "", "getMaxZoom", "()I", "maxZoom$delegate", "value", "zoom", "getZoom", "setZoom", "(I)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.ZoomConfigImpl */
/* compiled from: ZoomConfigImpl.kt */
public final class ZoomConfigImpl extends BaseZoomConfig<Camera.Parameters> {
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setZoom(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.isZoomSupported()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r5.getCharacteristics()
            android.hardware.Camera$Parameters r0 = (android.hardware.Camera.Parameters) r0
            java.util.List r0 = r0.getZoomRatios()
            if (r0 == 0) goto L_0x0055
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0020
            r0 = 0
            goto L_0x004c
        L_0x0020:
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r2 - r6
            int r2 = java.lang.Math.abs(r2)
        L_0x0030:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = r4 - r6
            int r4 = java.lang.Math.abs(r4)
            if (r2 <= r4) goto L_0x0030
            r1 = r3
            r2 = r4
            goto L_0x0030
        L_0x004b:
            r0 = r1
        L_0x004c:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0055
            int r0 = r0.intValue()
            goto L_0x0057
        L_0x0055:
            r0 = 100
        L_0x0057:
            r5.zoom = r0
            kotlin.jvm.functions.Function1 r0 = r5.getOnUpdateCallback()
            co.infinum.goldeneye.models.CameraProperty r1 = p033co.infinum.goldeneye.models.CameraProperty.ZOOM
            r0.invoke(r1)
            co.infinum.goldeneye.OnZoomChangedCallback r0 = r5.getOnZoomChangedCallback()
            if (r0 == 0) goto L_0x0087
            r0.onZoomChanged(r6)
            goto L_0x0087
        L_0x006c:
            co.infinum.goldeneye.utils.LogDelegate r0 = p033co.infinum.goldeneye.utils.LogDelegate.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported ZoomLevel ["
            r1.append(r2)
            r1.append(r6)
            r6 = 93
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.log(r6)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033co.infinum.goldeneye.config.camera1.ZoomConfigImpl.setZoom(int):void");
    }
}
