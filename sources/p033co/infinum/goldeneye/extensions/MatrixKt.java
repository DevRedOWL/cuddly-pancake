package p033co.infinum.goldeneye.extensions;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a$\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, mo51343d2 = {"mirror", "Landroid/graphics/Matrix;", "rotate", "degrees", "", "cx", "cy", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.MatrixKt */
/* compiled from: Matrix.kt */
public final class MatrixKt {
    public static final Matrix rotate(Matrix matrix, float f, float f2, float f3) {
        Intrinsics.checkParameterIsNotNull(matrix, "receiver$0");
        matrix.postRotate(f, f2, f3);
        return matrix;
    }

    public static final Matrix mirror(Matrix matrix) {
        Intrinsics.checkParameterIsNotNull(matrix, "receiver$0");
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }
}
