package p033co.infinum.goldeneye;

import android.graphics.Bitmap;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, mo51343d2 = {"Lco/infinum/goldeneye/PictureCallback;", "", "()V", "onError", "", "t", "", "onPictureTaken", "picture", "Landroid/graphics/Bitmap;", "onShutter", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.PictureCallback */
/* compiled from: Callbacks.kt */
public abstract class PictureCallback {
    public abstract void onError(Throwable th);

    public abstract void onPictureTaken(Bitmap bitmap);

    public void onShutter() {
    }
}
