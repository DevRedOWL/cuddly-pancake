package p033co.infinum.goldeneye.gesture.camera1;

import android.hardware.Camera;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "success", "", "<anonymous parameter 1>", "Landroid/hardware/Camera;", "kotlin.jvm.PlatformType", "onAutoFocus"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.gesture.camera1.FocusHandlerImpl$requestFocus$2 */
/* compiled from: FocusHandlerImpl.kt */
final class FocusHandlerImpl$requestFocus$2 implements Camera.AutoFocusCallback {
    final /* synthetic */ FocusHandlerImpl this$0;

    FocusHandlerImpl$requestFocus$2(FocusHandlerImpl focusHandlerImpl) {
        this.this$0 = focusHandlerImpl;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        if (z) {
            this.this$0.camera.cancelAutoFocus();
            this.this$0.resetFocusWithDelay();
        }
    }
}
