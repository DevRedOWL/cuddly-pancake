package p033co.infinum.goldeneye.recorders;

import android.app.Activity;
import android.graphics.Bitmap;
import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.PictureCallback;
import p033co.infinum.goldeneye.PictureTransformation;
import p033co.infinum.goldeneye.config.CameraConfig;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo51343d2 = {"Lco/infinum/goldeneye/recorders/PictureRecorder;", "", "activity", "Landroid/app/Activity;", "camera", "Landroid/hardware/Camera;", "config", "Lco/infinum/goldeneye/config/CameraConfig;", "pictureTransformation", "Lco/infinum/goldeneye/PictureTransformation;", "(Landroid/app/Activity;Landroid/hardware/Camera;Lco/infinum/goldeneye/config/CameraConfig;Lco/infinum/goldeneye/PictureTransformation;)V", "onResult", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "onShutter", "Lkotlin/Function0;", "pictureCallback", "Lco/infinum/goldeneye/PictureCallback;", "transformBitmapTask", "", "release", "takePicture", "callback", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.PictureRecorder */
/* compiled from: PictureRecorder.kt */
public final class PictureRecorder {
    /* access modifiers changed from: private */
    public final Activity activity;
    private final Camera camera;
    /* access modifiers changed from: private */
    public final CameraConfig config;
    /* access modifiers changed from: private */
    public final Function1<Bitmap, Unit> onResult = new PictureRecorder$onResult$1(this);
    /* access modifiers changed from: private */
    public final Function0<Unit> onShutter = new PictureRecorder$onShutter$1(this);
    /* access modifiers changed from: private */
    public PictureCallback pictureCallback;
    /* access modifiers changed from: private */
    public final PictureTransformation pictureTransformation;
    /* access modifiers changed from: private */
    public final Function1<byte[], Bitmap> transformBitmapTask = new PictureRecorder$transformBitmapTask$1(this);

    public PictureRecorder(Activity activity2, Camera camera2, CameraConfig cameraConfig, PictureTransformation pictureTransformation2) {
        Intrinsics.checkParameterIsNotNull(activity2, "activity");
        Intrinsics.checkParameterIsNotNull(camera2, "camera");
        Intrinsics.checkParameterIsNotNull(cameraConfig, "config");
        this.activity = activity2;
        this.camera = camera2;
        this.config = cameraConfig;
        this.pictureTransformation = pictureTransformation2;
    }

    public final void takePicture(PictureCallback pictureCallback2) {
        Intrinsics.checkParameterIsNotNull(pictureCallback2, "callback");
        this.pictureCallback = pictureCallback2;
        try {
            this.camera.takePicture(new PictureRecorder$takePicture$cameraShutterCallback$1(this), (Camera.PictureCallback) null, new PictureRecorder$takePicture$cameraPictureCallback$1(this));
        } catch (Throwable th) {
            pictureCallback2.onError(th);
        }
    }

    public final void release() {
        this.pictureCallback = null;
    }
}
