package p007at.nineyards.anyline.models;

import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.media.Image;
import java.nio.ByteBuffer;
import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/* renamed from: at.nineyards.anyline.models.AnylineYuvImage */
public class AnylineYuvImage implements Cloneable {

    /* renamed from: a */
    private static final String f494a = AnylineYuvImage.class.getSimpleName();

    /* renamed from: b */
    private final Object f495b;

    /* renamed from: c */
    private final int f496c;

    /* renamed from: d */
    private final int f497d;

    /* renamed from: e */
    private final int f498e;

    /* renamed from: f */
    private final int f499f;

    /* renamed from: g */
    private final byte[] f500g;

    /* renamed from: h */
    private final boolean f501h;

    /* renamed from: i */
    private final int f502i;

    /* renamed from: j */
    private int f503j;

    @Deprecated
    public AnylineYuvImage(int i, int i2, int i3, int i4) {
        this(i, i2, i3, new byte[(((i2 * i3) * ImageFormat.getBitsPerPixel(i)) / 8)], i4, false);
    }

    public AnylineYuvImage(int i, int i2, int i3, byte[] bArr, int i4, boolean z) {
        this(i, i2, i3, bArr, i4, z, Math.max(i2, i3), Math.min(i2, i3));
    }

    private AnylineYuvImage(int i, int i2, int i3, byte[] bArr, int i4, boolean z, int i5, int i6) {
        this.f495b = new Object();
        this.f503j = i;
        this.f496c = i2;
        this.f497d = i3;
        this.f498e = i5;
        this.f499f = i6;
        this.f500g = bArr;
        this.f502i = i4;
        this.f501h = z;
    }

    public AnylineYuvImage(Image image, int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8;
        int i9;
        AnylineYuvImage anylineYuvImage = this;
        int i10 = i;
        int i11 = i4;
        int i12 = i5;
        boolean z2 = z;
        anylineYuvImage.f495b = new Object();
        if (image.getFormat() != 35) {
            throw new IllegalArgumentException("Only images of format YUV_420_888 are supported.");
        } else if (z2 || ((i9 = i2 % 2) == 0 && i9 == 0 && i11 % 2 == 0 && i12 % 2 == 0)) {
            long currentTimeMillis = System.currentTimeMillis();
            anylineYuvImage.f496c = i11;
            anylineYuvImage.f497d = i12;
            anylineYuvImage.f503j = 35;
            anylineYuvImage.f502i = i10;
            anylineYuvImage.f501h = z2;
            int width = image.getWidth();
            int height = image.getHeight();
            if (i10 != 90) {
                if (i10 == 180) {
                    i7 = (width - i11) - i2;
                    i6 = (height - i12) - i3;
                } else if (i10 != 270) {
                    i7 = i2;
                    i6 = i3;
                } else {
                    i7 = (width - i12) - i3;
                    i6 = i2;
                }
                anylineYuvImage.f498e = i11;
                anylineYuvImage.f499f = i12;
                if (i7 >= 0 || i7 + i11 <= width || i6 < 0 || (i8 = i6 + i12) > height) {
                    throw new IndexOutOfBoundsException(String.format("Crop is outside of the image's bounds. Image w: %d, h: %d vs Crop x: %d, y: %d, w: %d, h: %d (in landscape).", new Object[]{Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(i7), Integer.valueOf(i6), Integer.valueOf(i11), Integer.valueOf(i12)}));
                }
                int i13 = i12 * i11;
                anylineYuvImage.f500g = new byte[(!z2 ? (int) (((double) i13) * 1.5d) : i13)];
                Image.Plane[] planes = image.getPlanes();
                ByteBuffer buffer = planes[0].getBuffer();
                buffer.rewind();
                int i14 = i6 * width;
                int i15 = i8 * width;
                int i16 = i14;
                int i17 = 0;
                while (i16 < i15) {
                    buffer.position(i16 + i7);
                    buffer.get(anylineYuvImage.f500g, i17, i11);
                    i16 += width;
                    i17 += i11;
                }
                if (z2) {
                    new StringBuilder("Constructed grey only AnylineYuvImage in: ").append(System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                Image.Plane plane = planes[1];
                Image.Plane plane2 = planes[2];
                ByteBuffer buffer2 = plane.getBuffer();
                buffer2.rewind();
                ByteBuffer buffer3 = plane2.getBuffer();
                buffer3.rewind();
                if (plane.getPixelStride() == 1) {
                    int i18 = i14 / 4;
                    int i19 = i15 / 4;
                    int i20 = i18;
                    int i21 = 0;
                    while (i20 < i19) {
                        buffer2.position((i7 / 2) + i20);
                        int i22 = i11 / 2;
                        buffer2.get(anylineYuvImage.f500g, i13 + i21, i22);
                        i20 += width / 2;
                        i21 += i22;
                    }
                    int i23 = i13 + (i13 / 4);
                    int i24 = 0;
                    while (i18 < i19) {
                        buffer3.position((i7 / 2) + i18);
                        int i25 = i11 / 2;
                        buffer3.get(anylineYuvImage.f500g, i23 + i24, i25);
                        i18 += width / 2;
                        i24 += i25;
                    }
                    new StringBuilder("Constructed YUV420 AnylineYuvImage in: ").append(System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                anylineYuvImage.f503j = 17;
                int i26 = i14 / 2;
                int i27 = i15 / 2;
                int i28 = 0;
                while (i26 < i27) {
                    int i29 = i26 + i7;
                    buffer3.position(i29);
                    int i30 = i13 + i28;
                    buffer3.get(anylineYuvImage.f500g, i30, i11 - 1);
                    int i31 = 0;
                    while (i31 < i11) {
                        anylineYuvImage.f500g[i30 + i31 + 1] = buffer2.get(i29 + i31);
                        i31 += 2;
                        anylineYuvImage = this;
                    }
                    i26 += width;
                    i28 += i11;
                    anylineYuvImage = this;
                }
                new StringBuilder("Constructed NV21 AnylineYuvImage in: ").append(System.currentTimeMillis() - currentTimeMillis);
                return;
            }
            i6 = (height - i11) - i2;
            i7 = i3;
            int i32 = i12;
            i12 = i11;
            i11 = i32;
            anylineYuvImage.f498e = i11;
            anylineYuvImage.f499f = i12;
            if (i7 >= 0 && i7 + i11 <= width) {
            }
            throw new IndexOutOfBoundsException(String.format("Crop is outside of the image's bounds. Image w: %d, h: %d vs Crop x: %d, y: %d, w: %d, h: %d (in landscape).", new Object[]{Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(i7), Integer.valueOf(i6), Integer.valueOf(i11), Integer.valueOf(i12)}));
        } else {
            throw new IllegalArgumentException("Yuv crop on color image is only possible with EVEN x,y,w and h. Because every U and V value is used for 4 pixels.");
        }
    }

    public void setTo(byte[] bArr) {
        if (bArr.length == this.f500g.length) {
            synchronized (this.f495b) {
                System.arraycopy(bArr, 0, this.f500g, 0, bArr.length);
            }
            return;
        }
        throw new IllegalArgumentException("Can not set to data of different length. This length: " + this.f500g.length + ". New data length: " + bArr.length);
    }

    public int getTargetOrientation() {
        return this.f502i;
    }

    public byte[] getData() {
        return this.f500g;
    }

    public int getFormat() {
        return this.f503j;
    }

    public int getTargetWidth() {
        return this.f496c;
    }

    public int getTargetHeight() {
        return this.f497d;
    }

    public int getOriginalWidth() {
        return this.f498e;
    }

    public int getOriginalHeight() {
        return this.f499f;
    }

    public boolean isGreyOnly() {
        return this.f501h;
    }

    public Mat getAsCvMat() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f502i;
        boolean z = i == 90 || i == 270;
        int i2 = z ? this.f496c : this.f497d;
        int i3 = z ? this.f497d : this.f496c;
        if (this.f501h) {
            synchronized (this.f495b) {
                Mat mat = new Mat(i2, i3, CvType.CV_8UC1);
                mat.put(0, 0, this.f500g);
                if (!z) {
                    new StringBuilder("Time to convert to mat: ").append(System.currentTimeMillis() - currentTimeMillis);
                    return mat;
                }
                Mat a = m130a(mat);
                new StringBuilder("Time to convert to mat ant rotate: ").append(System.currentTimeMillis() - currentTimeMillis);
                return a;
            }
        }
        Mat mat2 = new Mat(i2, i3, CvType.CV_8UC3);
        synchronized (this.f495b) {
            if (this.f503j == 35) {
                Mat mat3 = new Mat(i2 + (i2 / 2), i3, CvType.CV_8UC1);
                mat3.put(0, 0, this.f500g);
                Imgproc.cvtColor(mat3, mat2, 100, 3);
                mat3.release();
            } else {
                Mat mat4 = new Mat(i2 + (i2 / 2), i3, CvType.CV_8UC1);
                mat4.put(0, 0, this.f500g);
                Imgproc.cvtColor(mat4, mat2, 92, 3);
                mat4.release();
            }
        }
        Mat a2 = m130a(mat2);
        new StringBuilder("Time to convert to rgb and rotate: ").append(System.currentTimeMillis() - currentTimeMillis);
        return a2;
    }

    public Bitmap getAsBitmap() {
        long currentTimeMillis = System.currentTimeMillis();
        Mat asCvMat = getAsCvMat();
        Bitmap createBitmap = Bitmap.createBitmap(asCvMat.cols(), asCvMat.rows(), Bitmap.Config.ARGB_8888);
        Utils.matToBitmap(asCvMat, createBitmap);
        asCvMat.release();
        new StringBuilder("Time to convert to bitmap (including Mat conversion): ").append(System.currentTimeMillis() - currentTimeMillis);
        return createBitmap;
    }

    public AnylineYuvImage crop(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.f501h && !z) {
            throw new IllegalArgumentException("Cannot crop color image from grey only source.");
        } else if (z || (i % 2 == 0 && i2 % 2 == 0 && i3 % 2 == 0 && i4 % 2 == 0)) {
            int i10 = this.f497d;
            int i11 = this.f496c;
            int i12 = this.f502i;
            if (i12 != 90) {
                if (i12 == 180) {
                    i8 = (i11 - i3) - i;
                    i7 = (i10 - i4) - i2;
                } else if (i12 != 270) {
                    i8 = i;
                    i7 = i2;
                } else {
                    i8 = (i10 - i4) - i2;
                    i7 = i;
                    i5 = i3;
                    i6 = i4;
                }
                i6 = i3;
                i5 = i4;
                int i13 = i11;
                i11 = i10;
                i10 = i13;
            } else {
                i5 = i3;
                i6 = i4;
                i7 = (i11 - i3) - i;
                i8 = i2;
            }
            int i14 = 0;
            if (i8 < 0 || i8 + i6 > i10 || i7 < 0 || (i9 = i7 + i5) > i11) {
                throw new IndexOutOfBoundsException(String.format("Crop is outside of the image's bounds. Image w: %d, h: %d vs Crop x: %d, y: %d, w: %d, h: %d (in landscape).", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i8), Integer.valueOf(i7), Integer.valueOf(i6), Integer.valueOf(i5)}));
            }
            int i15 = i10 * i7;
            int i16 = i10 * i9;
            int i17 = i6 * i5;
            byte[] bArr = new byte[(!z ? (int) (((double) i17) * 1.5d) : i17)];
            while (i15 < i16) {
                System.arraycopy(this.f500g, i15 + i8, bArr, i14, i6);
                i15 += i10;
                i14 += i6;
            }
            if (z) {
                return new AnylineYuvImage(this.f503j, i3, i4, bArr, this.f502i, true, i6, i5);
            }
            int i18 = i11 * i10;
            int i19 = i10 / 2;
            int i20 = (i7 * i19) + i18;
            int i21 = i18 + (i19 * i9);
            while (i20 < i21) {
                System.arraycopy(this.f500g, i20 + i8, bArr, i17, i6);
                i20 += i10;
                i17 += i6;
            }
            return new AnylineYuvImage(this.f503j, i3, i4, bArr, this.f502i, false, i6, i5);
        } else {
            throw new IllegalArgumentException("Yuv crop on color image is only possible with EVEN x,y,w and h. Because every U and V value is used for 4 pixels.");
        }
    }

    /* renamed from: a */
    private Mat m130a(Mat mat) {
        int i = this.f502i;
        if (i == 90) {
            Mat t = mat.mo60242t();
            Core.flip(t, t, 1);
            mat.release();
            return t;
        } else if (i == 180) {
            Core.flip(mat, mat, -1);
            return mat;
        } else if (i != 270) {
            return mat;
        } else {
            Mat t2 = mat.mo60242t();
            Core.flip(t2, t2, 0);
            mat.release();
            return t2;
        }
    }

    public AnylineYuvImage clone() {
        byte[] bArr = this.f500g;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return new AnylineYuvImage(this.f503j, this.f496c, this.f497d, bArr2, this.f502i, this.f501h);
    }
}
