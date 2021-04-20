package p033co.infinum.goldeneye.sessions;

import android.graphics.Bitmap;
import android.media.ImageReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p033co.infinum.goldeneye.PictureCallback;
import p033co.infinum.goldeneye.PictureConversionException;
import p033co.infinum.goldeneye.extensions.AnyKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "reader", "Landroid/media/ImageReader;", "kotlin.jvm.PlatformType", "onImageAvailable"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.sessions.PictureSession$initImageReader$1 */
/* compiled from: PictureSession.kt */
final class PictureSession$initImageReader$1 implements ImageReader.OnImageAvailableListener {
    final /* synthetic */ PictureSession this$0;

    PictureSession$initImageReader$1(PictureSession pictureSession) {
        this.this$0 = pictureSession;
    }

    public final void onImageAvailable(final ImageReader imageReader) {
        AnyKt.async(new Function0<Bitmap>(this) {
            final /* synthetic */ PictureSession$initImageReader$1 this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
                r0 = r2.transform(r1, r4.this$0.this$0.getConfig(), r0);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final android.graphics.Bitmap invoke() {
                /*
                    r4 = this;
                    android.media.ImageReader r0 = r2
                    android.media.Image r0 = r0.acquireLatestImage()
                    java.lang.String r1 = "image"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                    android.graphics.Bitmap r1 = p033co.infinum.goldeneye.extensions.BitmapUtils.toBitmap((android.media.Image) r0)
                    r0.close()
                    if (r1 == 0) goto L_0x0049
                    co.infinum.goldeneye.utils.CameraUtils r0 = p033co.infinum.goldeneye.utils.CameraUtils.INSTANCE
                    co.infinum.goldeneye.sessions.PictureSession$initImageReader$1 r2 = r4.this$0
                    co.infinum.goldeneye.sessions.PictureSession r2 = r2.this$0
                    android.app.Activity r2 = r2.getActivity()
                    co.infinum.goldeneye.sessions.PictureSession$initImageReader$1 r3 = r4.this$0
                    co.infinum.goldeneye.sessions.PictureSession r3 = r3.this$0
                    co.infinum.goldeneye.config.camera2.Camera2ConfigImpl r3 = r3.getConfig()
                    co.infinum.goldeneye.config.CameraInfo r3 = (p033co.infinum.goldeneye.config.CameraInfo) r3
                    int r0 = r0.calculateDisplayOrientation(r2, r3)
                    float r0 = (float) r0
                    co.infinum.goldeneye.sessions.PictureSession$initImageReader$1 r2 = r4.this$0
                    co.infinum.goldeneye.sessions.PictureSession r2 = r2.this$0
                    co.infinum.goldeneye.PictureTransformation r2 = r2.pictureTransformation
                    if (r2 == 0) goto L_0x004a
                    co.infinum.goldeneye.sessions.PictureSession$initImageReader$1 r3 = r4.this$0
                    co.infinum.goldeneye.sessions.PictureSession r3 = r3.this$0
                    co.infinum.goldeneye.config.camera2.Camera2ConfigImpl r3 = r3.getConfig()
                    co.infinum.goldeneye.config.CameraConfig r3 = (p033co.infinum.goldeneye.config.CameraConfig) r3
                    android.graphics.Bitmap r0 = r2.transform(r1, r3, r0)
                    if (r0 == 0) goto L_0x004a
                    r1 = r0
                    goto L_0x004a
                L_0x0049:
                    r1 = 0
                L_0x004a:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p033co.infinum.goldeneye.sessions.PictureSession$initImageReader$1.C10081.invoke():android.graphics.Bitmap");
            }
        }, new Function1<Bitmap, Unit>(this) {
            final /* synthetic */ PictureSession$initImageReader$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Bitmap) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Bitmap bitmap) {
                this.this$0.this$0.locked = false;
                this.this$0.this$0.unlockFocus(this.this$0.this$0.getConfig().getFocusMode());
                if (bitmap != null) {
                    PictureCallback access$getPictureCallback$p = this.this$0.this$0.pictureCallback;
                    if (access$getPictureCallback$p != null) {
                        access$getPictureCallback$p.onPictureTaken(bitmap);
                        return;
                    }
                    return;
                }
                PictureCallback access$getPictureCallback$p2 = this.this$0.this$0.pictureCallback;
                if (access$getPictureCallback$p2 != null) {
                    access$getPictureCallback$p2.onError(PictureConversionException.INSTANCE);
                }
            }
        });
    }
}
