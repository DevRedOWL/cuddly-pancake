package p033co.infinum.goldeneye.recorders;

import android.hardware.Camera;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "onShutter"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.PictureRecorder$takePicture$cameraShutterCallback$1 */
/* compiled from: PictureRecorder.kt */
final class PictureRecorder$takePicture$cameraShutterCallback$1 implements Camera.ShutterCallback {
    final /* synthetic */ PictureRecorder this$0;

    PictureRecorder$takePicture$cameraShutterCallback$1(PictureRecorder pictureRecorder) {
        this.this$0 = pictureRecorder;
    }

    public final void onShutter() {
        this.this$0.onShutter.invoke();
    }
}
