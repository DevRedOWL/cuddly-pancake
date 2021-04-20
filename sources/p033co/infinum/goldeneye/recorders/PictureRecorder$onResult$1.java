package p033co.infinum.goldeneye.recorders;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.PictureCallback;
import p033co.infinum.goldeneye.PictureConversionException;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.PictureRecorder$onResult$1 */
/* compiled from: PictureRecorder.kt */
final class PictureRecorder$onResult$1 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ PictureRecorder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PictureRecorder$onResult$1(PictureRecorder pictureRecorder) {
        super(1);
        this.this$0 = pictureRecorder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Bitmap bitmap) {
        if (bitmap != null) {
            PictureCallback access$getPictureCallback$p = this.this$0.pictureCallback;
            if (access$getPictureCallback$p != null) {
                access$getPictureCallback$p.onPictureTaken(bitmap);
                return;
            }
            return;
        }
        PictureCallback access$getPictureCallback$p2 = this.this$0.pictureCallback;
        if (access$getPictureCallback$p2 != null) {
            access$getPictureCallback$p2.onError(PictureConversionException.INSTANCE);
        }
    }
}
