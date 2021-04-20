package p033co.infinum.goldeneye.gesture.camera1;

import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.extensions.CameraKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.gesture.camera1.FocusHandlerImpl$resetFocusWithDelay$1 */
/* compiled from: FocusHandlerImpl.kt */
final class FocusHandlerImpl$resetFocusWithDelay$1 implements Runnable {
    final /* synthetic */ FocusHandlerImpl this$0;

    FocusHandlerImpl$resetFocusWithDelay$1(FocusHandlerImpl focusHandlerImpl) {
        this.this$0 = focusHandlerImpl;
    }

    public final void run() {
        CameraKt.updateParams(this.this$0.camera, new Function1<Camera.Parameters, Unit>(this) {
            final /* synthetic */ FocusHandlerImpl$resetFocusWithDelay$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Camera.Parameters) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Camera.Parameters parameters) {
                Intrinsics.checkParameterIsNotNull(parameters, "receiver$0");
                parameters.setFocusMode(this.this$0.this$0.config.getFocusMode().toCamera1());
            }
        });
    }
}
