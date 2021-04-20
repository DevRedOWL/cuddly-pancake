package p007at.nineyards.anyline;

import android.graphics.Bitmap;
import org.opencv.core.Mat;
import p007at.nineyards.anyline.models.AnylineImage;

/* renamed from: at.nineyards.anyline.SimpleImageProvider */
public class SimpleImageProvider implements ImageProvider {

    /* renamed from: a */
    private final Object f149a = new Object();

    /* renamed from: b */
    private AnylineImage f150b;

    /* renamed from: c */
    private boolean f151c = false;

    public boolean hasNewImage() {
        boolean z;
        synchronized (this.f149a) {
            z = this.f151c;
        }
        return z;
    }

    public AnylineImage getNewImage() {
        synchronized (this.f149a) {
            if (!this.f151c) {
                return null;
            }
            this.f151c = false;
            AnylineImage anylineImage = this.f150b;
            return anylineImage;
        }
    }

    public void setNewImage(AnylineImage anylineImage) {
        synchronized (this.f149a) {
            if (this.f150b != null) {
                this.f150b.release();
                this.f150b = null;
            }
            this.f150b = anylineImage;
            this.f151c = true;
        }
    }

    public void setNewImage(Bitmap bitmap) {
        setNewImage(new AnylineImage(bitmap));
    }

    public void setNewImage(Mat mat) {
        setNewImage(new AnylineImage(mat));
    }
}
