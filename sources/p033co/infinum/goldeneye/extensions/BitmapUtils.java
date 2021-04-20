package p033co.infinum.goldeneye.extensions;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\nH\u0001\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u000bH\u0000¨\u0006\f"}, mo51343d2 = {"applyMatrix", "Landroid/graphics/Bitmap;", "configure", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "", "Lkotlin/ExtensionFunctionType;", "safeRecycle", "newBitmap", "toBitmap", "Landroid/media/Image;", "", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.BitmapUtils */
/* compiled from: Bitmap.kt */
public final class BitmapUtils {
    public static final Bitmap applyMatrix(Bitmap bitmap, Function1<? super Matrix, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(bitmap, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "configure");
        p033co.infinum.goldeneye.utils.Intrinsics.INSTANCE.checkMainThread();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        function1.invoke(matrix);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "newBitmap");
        safeRecycle(bitmap, createBitmap);
        return createBitmap;
    }

    public static final void safeRecycle(Bitmap bitmap, Bitmap bitmap2) {
        Intrinsics.checkParameterIsNotNull(bitmap, "receiver$0");
        Intrinsics.checkParameterIsNotNull(bitmap2, "newBitmap");
        if (!Intrinsics.areEqual((Object) bitmap, (Object) bitmap2)) {
            bitmap.recycle();
        }
    }

    public static final Bitmap toBitmap(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "receiver$0");
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Bitmap toBitmap(Image image) {
        Intrinsics.checkParameterIsNotNull(image, "receiver$0");
        Image.Plane plane = image.getPlanes()[0];
        Intrinsics.checkExpressionValueIsNotNull(plane, "planes[0]");
        ByteBuffer buffer = plane.getBuffer();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        return toBitmap(bArr);
    }
}
