package p033co.infinum.goldeneye.gesture;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p033co.infinum.goldeneye.config.CameraConfig;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo51343d2 = {"Lco/infinum/goldeneye/gesture/ZoomHandlerImpl;", "Lco/infinum/goldeneye/gesture/ZoomHandler;", "activity", "Landroid/app/Activity;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "(Landroid/app/Activity;Lco/infinum/goldeneye/config/CameraConfig;)V", "pinchDelta", "", "zoomPinchDelta", "", "onPinchEnded", "", "onPinchStarted", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.gesture.ZoomHandlerImpl */
/* compiled from: ZoomHandlerImpl.kt */
public final class ZoomHandlerImpl implements ZoomHandler {
    private final CameraConfig config;
    private float pinchDelta;
    private final int zoomPinchDelta;

    public ZoomHandlerImpl(Activity activity, CameraConfig cameraConfig) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        this.config = cameraConfig;
        Resources resources = activity.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "activity.resources");
        this.zoomPinchDelta = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
    }

    public void onPinchStarted(float f) {
        if (this.config.getPinchToZoomEnabled()) {
            this.pinchDelta += f;
            int pinchToZoomFriction = (int) (this.pinchDelta / (((float) this.zoomPinchDelta) * this.config.getPinchToZoomFriction()));
            if (pinchToZoomFriction != 0) {
                CameraConfig cameraConfig = this.config;
                cameraConfig.setZoom(RangesKt.coerceIn(cameraConfig.getZoom() + pinchToZoomFriction, 100, this.config.getMaxZoom()));
            }
            this.pinchDelta %= (float) this.zoomPinchDelta;
        }
    }

    public void onPinchEnded() {
        this.pinchDelta = 0.0f;
    }
}
