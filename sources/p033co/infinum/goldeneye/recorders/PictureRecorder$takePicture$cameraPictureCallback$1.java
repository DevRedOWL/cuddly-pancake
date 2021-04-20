package p033co.infinum.goldeneye.recorders;

import android.graphics.Bitmap;
import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p033co.infinum.goldeneye.extensions.AnyKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/hardware/Camera;", "onPictureTaken"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.PictureRecorder$takePicture$cameraPictureCallback$1 */
/* compiled from: PictureRecorder.kt */
final class PictureRecorder$takePicture$cameraPictureCallback$1 implements Camera.PictureCallback {
    final /* synthetic */ PictureRecorder this$0;

    PictureRecorder$takePicture$cameraPictureCallback$1(PictureRecorder pictureRecorder) {
        this.this$0 = pictureRecorder;
    }

    public final void onPictureTaken(final byte[] bArr, Camera camera) {
        AnyKt.async(new Function0<Bitmap>(this) {
            final /* synthetic */ PictureRecorder$takePicture$cameraPictureCallback$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Bitmap invoke() {
                return (Bitmap) this.this$0.this$0.transformBitmapTask.invoke(bArr);
            }
        }, new Function1<Bitmap, Unit>(this) {
            final /* synthetic */ PictureRecorder$takePicture$cameraPictureCallback$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Bitmap) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Bitmap bitmap) {
                this.this$0.this$0.onResult.invoke(bitmap);
            }
        });
    }
}
