package p007at.nineyards.anyline.camera;

import android.graphics.Rect;
import android.media.Image;
import android.os.Build;
import p007at.nineyards.anyline.models.AnylineYuvImage;

/* renamed from: at.nineyards.anyline.camera.ImageReceiver */
public class ImageReceiver {

    /* renamed from: a */
    private AnylineYuvImage f388a;

    /* renamed from: b */
    private C0764b f389b;

    /* renamed from: c */
    private int f390c;

    ImageReceiver() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12222a(C0764b bVar, int i) {
        this.f389b = bVar;
        this.f390c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12223a(AnylineYuvImage anylineYuvImage) {
        this.f388a = anylineYuvImage;
    }

    public AnylineYuvImage getYuvImage(boolean z) {
        C0764b bVar;
        int i;
        int i2;
        AnylineYuvImage anylineYuvImage;
        AnylineYuvImage anylineYuvImage2 = this.f388a;
        if (anylineYuvImage2 != null) {
            return anylineYuvImage2.crop(0, 0, anylineYuvImage2.getTargetWidth(), this.f388a.getTargetHeight(), z);
        }
        if (Build.VERSION.SDK_INT < 19 || (bVar = this.f389b) == null) {
            throw new IllegalStateException("No yuv image set!");
        }
        synchronized (bVar) {
            Image a = this.f389b.mo12249a();
            int width = a.getWidth();
            int height = a.getHeight();
            int i3 = this.f390c;
            if (i3 == 90 || i3 == 270) {
                i = a.getWidth();
                i2 = height;
            } else {
                i2 = width;
                i = height;
            }
            anylineYuvImage = new AnylineYuvImage(a, this.f390c, 0, 0, i2, i, z);
        }
        return anylineYuvImage;
    }

    public AnylineYuvImage getYuvImage(Rect rect, boolean z) {
        C0764b bVar;
        AnylineYuvImage anylineYuvImage;
        AnylineYuvImage anylineYuvImage2 = this.f388a;
        if (anylineYuvImage2 != null) {
            return anylineYuvImage2.crop(rect.left, rect.top, rect.width(), rect.height(), z);
        }
        if (Build.VERSION.SDK_INT < 19 || (bVar = this.f389b) == null) {
            throw new IllegalStateException("No yuv image set!");
        }
        synchronized (bVar) {
            anylineYuvImage = new AnylineYuvImage(this.f389b.mo12249a(), this.f390c, rect.left, rect.top, rect.width(), rect.height(), z);
        }
        return anylineYuvImage;
    }
}
