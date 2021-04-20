package p033co.infinum.goldeneye;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.extensions.BitmapUtils;
import p033co.infinum.goldeneye.utils.LogDelegate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, mo51343d2 = {"Lco/infinum/goldeneye/PictureTransformation;", "", "transform", "Landroid/graphics/Bitmap;", "picture", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "orientationDifference", "", "Default", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.PictureTransformation */
/* compiled from: PictureTransformation.kt */
public interface PictureTransformation {
    Bitmap transform(Bitmap bitmap, CameraConfig cameraConfig, float f);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo51343d2 = {"Lco/infinum/goldeneye/PictureTransformation$Default;", "Lco/infinum/goldeneye/PictureTransformation;", "()V", "transform", "Landroid/graphics/Bitmap;", "picture", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "orientationDifference", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.PictureTransformation$Default */
    /* compiled from: PictureTransformation.kt */
    public static final class Default implements PictureTransformation {
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        public Bitmap transform(Bitmap bitmap, CameraConfig cameraConfig, float f) {
            Intrinsics.checkParameterIsNotNull(bitmap, "picture");
            Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
            try {
                return BitmapUtils.applyMatrix(bitmap, new PictureTransformation$Default$transform$1(bitmap, cameraConfig, f));
            } catch (Throwable th) {
                LogDelegate.INSTANCE.log("Failed to transform picture. Returning raw picture.", th);
                return bitmap;
            }
        }
    }
}
