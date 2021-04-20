package p033co.infinum.goldeneye;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, mo51343d2 = {"co/infinum/goldeneye/BaseGoldenEye$takePicture$1", "Lco/infinum/goldeneye/PictureCallback;", "onError", "", "t", "", "onPictureTaken", "picture", "Landroid/graphics/Bitmap;", "onShutter", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.BaseGoldenEye$takePicture$1 */
/* compiled from: BaseGoldenEye.kt */
public final class BaseGoldenEye$takePicture$1 extends PictureCallback {
    final /* synthetic */ Function1 $onError;
    final /* synthetic */ Function1 $onPictureTaken;
    final /* synthetic */ Function0 $onShutter;

    BaseGoldenEye$takePicture$1(Function1 function1, Function1 function12, Function0 function0) {
        this.$onPictureTaken = function1;
        this.$onError = function12;
        this.$onShutter = function0;
    }

    public void onPictureTaken(Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(bitmap, "picture");
        this.$onPictureTaken.invoke(bitmap);
    }

    public void onError(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        this.$onError.invoke(th);
    }

    public void onShutter() {
        Function0 function0 = this.$onShutter;
        if (function0 != null) {
            Unit unit = (Unit) function0.invoke();
        }
    }
}
