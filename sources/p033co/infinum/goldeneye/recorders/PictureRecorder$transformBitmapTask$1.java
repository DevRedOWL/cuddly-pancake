package p033co.infinum.goldeneye.recorders;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.PictureTransformation;
import p033co.infinum.goldeneye.extensions.BitmapUtils;
import p033co.infinum.goldeneye.utils.CameraUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "it", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.PictureRecorder$transformBitmapTask$1 */
/* compiled from: PictureRecorder.kt */
final class PictureRecorder$transformBitmapTask$1 extends Lambda implements Function1<byte[], Bitmap> {
    final /* synthetic */ PictureRecorder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PictureRecorder$transformBitmapTask$1(PictureRecorder pictureRecorder) {
        super(1);
        this.this$0 = pictureRecorder;
    }

    public final Bitmap invoke(byte[] bArr) {
        Bitmap bitmap;
        Bitmap transform;
        if (bArr != null) {
            try {
                bitmap = BitmapUtils.toBitmap(bArr);
            } catch (Throwable th) {
                LogDelegate.INSTANCE.log("Failed to get picture.", th);
                return null;
            }
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        float calculateDisplayOrientation = (float) CameraUtils.INSTANCE.calculateDisplayOrientation(this.this$0.activity, this.this$0.config);
        PictureTransformation access$getPictureTransformation$p = this.this$0.pictureTransformation;
        if (access$getPictureTransformation$p == null || (transform = access$getPictureTransformation$p.transform(bitmap, this.this$0.config, calculateDisplayOrientation)) == null) {
            return bitmap;
        }
        return transform;
    }
}
