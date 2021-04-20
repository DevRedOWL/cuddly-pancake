package p007at.nineyards.anyline.models;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.Registry;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.opencv.android.Utils;
import org.opencv.core.Mat;

/* renamed from: at.nineyards.anyline.models.AnylineImage */
public class AnylineImage implements Cloneable {

    /* renamed from: a */
    private static final String f481a = AnylineImage.class.getSimpleName();

    /* renamed from: b */
    private Mat f482b;

    /* renamed from: c */
    private Bitmap f483c;

    /* renamed from: d */
    private AnylineYuvImage f484d;

    public AnylineImage(Mat mat) {
        this.f482b = mat;
    }

    public AnylineImage(Bitmap bitmap) {
        this.f483c = bitmap;
    }

    public AnylineImage(AnylineYuvImage anylineYuvImage) {
        this.f484d = anylineYuvImage;
    }

    public synchronized void release() {
        if (this.f482b != null) {
            this.f482b.release();
            this.f482b = null;
        }
        if (this.f483c != null) {
            this.f483c.recycle();
            this.f483c = null;
        }
        this.f484d = null;
    }

    public synchronized Bitmap getBitmap() {
        if (this.f483c == null || this.f483c.isRecycled()) {
            if (this.f484d != null) {
                this.f483c = this.f484d.getAsBitmap();
                this.f484d = null;
            } else if (this.f482b == null || this.f482b.empty()) {
                throw new IllegalStateException("No valid image is set. " + toString());
            } else {
                this.f483c = Bitmap.createBitmap(this.f482b.cols(), this.f482b.rows(), Bitmap.Config.ARGB_8888);
                Utils.matToBitmap(this.f482b, this.f483c);
                this.f482b.release();
                this.f482b = null;
            }
            return this.f483c;
        }
        return this.f483c;
    }

    public synchronized Mat getCvMat() {
        if (this.f482b == null || this.f482b.empty()) {
            if (this.f484d != null) {
                this.f482b = this.f484d.getAsCvMat();
                this.f484d = null;
            } else if (this.f483c == null || this.f483c.isRecycled()) {
                throw new IllegalStateException("No valid image is set. " + toString());
            } else {
                this.f482b = new Mat();
                Utils.bitmapToMat(this.f483c, this.f482b, false);
                this.f483c.recycle();
                this.f483c = null;
            }
            return this.f482b;
        }
        return this.f482b;
    }

    public synchronized int getWidth() {
        if (this.f482b != null && !this.f482b.empty()) {
            return this.f482b.width();
        } else if (this.f483c != null && !this.f483c.isRecycled()) {
            return this.f483c.getWidth();
        } else if (this.f484d == null) {
            return 0;
        } else {
            return this.f484d.getTargetWidth();
        }
    }

    public synchronized int getHeight() {
        if (this.f482b != null && !this.f482b.empty()) {
            return this.f482b.height();
        } else if (this.f483c != null && !this.f483c.isRecycled()) {
            return this.f483c.getHeight();
        } else if (this.f484d == null) {
            return 0;
        } else {
            return this.f484d.getTargetHeight();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.opencv.core.Mat getGreyCvMat(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.getCvMat()     // Catch:{ all -> 0x0042 }
            org.opencv.core.Mat r0 = r3.f482b     // Catch:{ all -> 0x0042 }
            int r0 = r0.type()     // Catch:{ all -> 0x0042 }
            int r1 = org.opencv.core.CvType.CV_8UC1     // Catch:{ all -> 0x0042 }
            if (r0 == r1) goto L_0x0034
            if (r4 == 0) goto L_0x001e
            org.opencv.core.Mat r4 = new org.opencv.core.Mat     // Catch:{ all -> 0x0042 }
            org.opencv.core.Mat r1 = r3.f482b     // Catch:{ all -> 0x0042 }
            org.opencv.core.Size r1 = r1.size()     // Catch:{ all -> 0x0042 }
            int r2 = org.opencv.core.CvType.CV_8UC1     // Catch:{ all -> 0x0042 }
            r4.<init>((org.opencv.core.Size) r1, (int) r2)     // Catch:{ all -> 0x0042 }
            goto L_0x0020
        L_0x001e:
            org.opencv.core.Mat r4 = r3.f482b     // Catch:{ all -> 0x0042 }
        L_0x0020:
            int r1 = org.opencv.core.CvType.CV_8UC4     // Catch:{ all -> 0x0042 }
            if (r0 != r1) goto L_0x002c
            org.opencv.core.Mat r0 = r3.f482b     // Catch:{ all -> 0x0042 }
            r1 = 11
            org.opencv.imgproc.Imgproc.cvtColor(r0, r4, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0032
        L_0x002c:
            org.opencv.core.Mat r0 = r3.f482b     // Catch:{ all -> 0x0042 }
            r1 = 7
            org.opencv.imgproc.Imgproc.cvtColor(r0, r4, r1)     // Catch:{ all -> 0x0042 }
        L_0x0032:
            monitor-exit(r3)
            return r4
        L_0x0034:
            if (r4 == 0) goto L_0x003e
            org.opencv.core.Mat r4 = r3.f482b     // Catch:{ all -> 0x0042 }
            org.opencv.core.Mat r4 = r4.clone()     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return r4
        L_0x003e:
            org.opencv.core.Mat r4 = r3.f482b     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return r4
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.models.AnylineImage.getGreyCvMat(boolean):org.opencv.core.Mat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.opencv.core.Mat getRgbCvMat(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.getCvMat()     // Catch:{ all -> 0x0042 }
            org.opencv.core.Mat r0 = r3.f482b     // Catch:{ all -> 0x0042 }
            int r0 = r0.type()     // Catch:{ all -> 0x0042 }
            int r1 = org.opencv.core.CvType.CV_8UC3     // Catch:{ all -> 0x0042 }
            if (r0 == r1) goto L_0x0034
            if (r4 == 0) goto L_0x001e
            org.opencv.core.Mat r4 = new org.opencv.core.Mat     // Catch:{ all -> 0x0042 }
            org.opencv.core.Mat r1 = r3.f482b     // Catch:{ all -> 0x0042 }
            org.opencv.core.Size r1 = r1.size()     // Catch:{ all -> 0x0042 }
            int r2 = org.opencv.core.CvType.CV_8UC4     // Catch:{ all -> 0x0042 }
            r4.<init>((org.opencv.core.Size) r1, (int) r2)     // Catch:{ all -> 0x0042 }
            goto L_0x0020
        L_0x001e:
            org.opencv.core.Mat r4 = r3.f482b     // Catch:{ all -> 0x0042 }
        L_0x0020:
            int r1 = org.opencv.core.CvType.CV_8UC4     // Catch:{ all -> 0x0042 }
            if (r0 != r1) goto L_0x002b
            org.opencv.core.Mat r0 = r3.f482b     // Catch:{ all -> 0x0042 }
            r1 = 1
            org.opencv.imgproc.Imgproc.cvtColor(r0, r4, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0032
        L_0x002b:
            org.opencv.core.Mat r0 = r3.f482b     // Catch:{ all -> 0x0042 }
            r1 = 8
            org.opencv.imgproc.Imgproc.cvtColor(r0, r4, r1)     // Catch:{ all -> 0x0042 }
        L_0x0032:
            monitor-exit(r3)
            return r4
        L_0x0034:
            if (r4 == 0) goto L_0x003e
            org.opencv.core.Mat r4 = r3.f482b     // Catch:{ all -> 0x0042 }
            org.opencv.core.Mat r4 = r4.clone()     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return r4
        L_0x003e:
            org.opencv.core.Mat r4 = r3.f482b     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return r4
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.models.AnylineImage.getRgbCvMat(boolean):org.opencv.core.Mat");
    }

    public AnylineYuvImage getAlYuvImage() {
        return this.f484d;
    }

    public void save(File file, int i) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (file != null) {
            String name = file.getName();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            if (name.toLowerCase().equals("png")) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else if (i < 0 || i > 100) {
                throw new IllegalArgumentException("Quality must be between 0 and 100");
            }
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            boolean compress = getBitmap().compress(compressFormat, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            String str = f481a;
            Log.d(str, "Image saved in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            if (!compress) {
                throw new IOException("Bitmap could not be saved to " + file.getAbsolutePath());
            }
            return;
        }
        throw new IllegalArgumentException("File must not be NULL.");
    }

    public synchronized AnylineImage clone() {
        if (this.f482b != null && !this.f482b.empty()) {
            return new AnylineImage(this.f482b.clone());
        } else if (this.f483c != null && !this.f483c.isRecycled()) {
            return new AnylineImage(this.f483c.copy(this.f483c.getConfig(), this.f483c.isMutable()));
        } else if (this.f484d != null) {
            return new AnylineImage(this.f484d.clone());
        } else {
            throw new IllegalStateException("No valid image is set. " + toString());
        }
    }

    public synchronized String toString() {
        if (this.f482b == null && this.f483c == null && this.f484d == null) {
            return "No Image set, or release has been called.";
        }
        String str = "Mat";
        if (this.f483c != null) {
            str = Registry.BUCKET_BITMAP;
        } else if (this.f484d != null) {
            str = "YuvImage";
        }
        return String.format("%s: h: %d w: %d", new Object[]{str, Integer.valueOf(getWidth()), Integer.valueOf(getHeight())});
    }
}
