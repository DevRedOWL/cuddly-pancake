package p033co.infinum.goldeneye;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.extensions.MatrixKt;
import p033co.infinum.goldeneye.models.Facing;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Landroid/graphics/Matrix;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.PictureTransformation$Default$transform$1 */
/* compiled from: PictureTransformation.kt */
final class PictureTransformation$Default$transform$1 extends Lambda implements Function1<Matrix, Unit> {
    final /* synthetic */ CameraConfig $config;
    final /* synthetic */ float $orientationDifference;
    final /* synthetic */ Bitmap $picture;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PictureTransformation$Default$transform$1(Bitmap bitmap, CameraConfig cameraConfig, float f) {
        super(1);
        this.$picture = bitmap;
        this.$config = cameraConfig;
        this.$orientationDifference = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Matrix) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Matrix matrix) {
        Intrinsics.checkParameterIsNotNull(matrix, "receiver$0");
        MatrixKt.rotate(matrix, this.$config.getFacing() == Facing.FRONT ? -this.$orientationDifference : this.$orientationDifference, ((float) this.$picture.getWidth()) / 2.0f, ((float) this.$picture.getHeight()) / 2.0f);
        if (this.$config.getFacing() == Facing.FRONT) {
            MatrixKt.mirror(matrix);
        }
    }
}
