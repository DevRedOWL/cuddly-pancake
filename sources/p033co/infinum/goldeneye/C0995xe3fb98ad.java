package p033co.infinum.goldeneye;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraConfig;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye$Builder$setPictureTransformation$1$1", "Lco/infinum/goldeneye/PictureTransformation;", "transform", "Landroid/graphics/Bitmap;", "picture", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "orientationDifference", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye$Builder$setPictureTransformation$$inlined$apply$lambda$1 */
/* compiled from: GoldenEye.kt */
public final class C0995xe3fb98ad implements PictureTransformation {
    final /* synthetic */ Function3 $transform$inlined;

    C0995xe3fb98ad(Function3 function3) {
        this.$transform$inlined = function3;
    }

    public Bitmap transform(Bitmap bitmap, CameraConfig cameraConfig, float f) {
        Intrinsics.checkParameterIsNotNull(bitmap, "picture");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        return (Bitmap) this.$transform$inlined.invoke(bitmap, cameraConfig, Float.valueOf(f));
    }
}
