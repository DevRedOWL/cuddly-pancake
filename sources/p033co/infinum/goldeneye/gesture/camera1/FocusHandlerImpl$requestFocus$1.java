package p033co.infinum.goldeneye.gesture.camera1;

import android.graphics.Point;
import android.graphics.PointF;
import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.models.FocusMode;
import p033co.infinum.goldeneye.utils.CameraUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.gesture.camera1.FocusHandlerImpl$requestFocus$1 */
/* compiled from: FocusHandlerImpl.kt */
final class FocusHandlerImpl$requestFocus$1 extends Lambda implements Function1<Camera.Parameters, Unit> {
    final /* synthetic */ PointF $point;
    final /* synthetic */ FocusHandlerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusHandlerImpl$requestFocus$1(FocusHandlerImpl focusHandlerImpl, PointF pointF) {
        super(1);
        this.this$0 = focusHandlerImpl;
        this.$point = pointF;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Camera.Parameters) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Camera.Parameters parameters) {
        Intrinsics.checkParameterIsNotNull(parameters, "receiver$0");
        parameters.setFocusMode(FocusMode.AUTO.toCamera1());
        parameters.setFocusAreas(CameraUtils.INSTANCE.calculateCamera1FocusArea(this.this$0.activity, this.this$0.textureView, this.this$0.config, this.$point.x, this.$point.y));
        this.this$0.onFocusChanged.invoke(new Point((int) this.$point.x, (int) this.$point.y));
    }
}
