package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.WindowManager;
import java.util.List;
import p007at.nineyards.anyline.camera.CameraFeatures;

/* renamed from: at.nineyards.anyline.camera.CameraUtil */
public class CameraUtil {

    /* renamed from: a */
    private static final String f352a = CameraUtil.class.getSimpleName();

    public static boolean hasCamera(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    public static void setCameraDisplayOrientation(Context context, int i, Camera camera) {
        camera.setDisplayOrientation(getCameraDisplayRotation(context, i));
    }

    public static int getCameraDisplayRotation(Context context, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int displayRotationDegrees = getDisplayRotationDegrees(context);
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + displayRotationDegrees) % 360)) % 360;
        }
        return ((cameraInfo.orientation - displayRotationDegrees) + 360) % 360;
    }

    public static int getCameraRotation(Context context, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int i2 = context.getResources().getConfiguration().orientation;
        if (i2 == -1) {
            return 0;
        }
        int i3 = ((i2 + 45) / 90) * 90;
        if (cameraInfo.facing == 1) {
            return ((cameraInfo.orientation - i3) + 360) % 360;
        }
        return (cameraInfo.orientation + i3) % 360;
    }

    public static int getCameraDisplayRotation(Context context, CameraCharacteristics cameraCharacteristics) {
        int displayRotationDegrees = getDisplayRotationDegrees(context);
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return (intValue + displayRotationDegrees) % 360;
        }
        return ((intValue - displayRotationDegrees) + 360) % 360;
    }

    public static int getDisplayRotationDegrees(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public static CameraSize getBiggestFittingPreviewSize(List<CameraSize> list, int i, int i2) {
        int i3 = i > i2 ? i : i2;
        if (i > i2) {
            i = i2;
        }
        int i4 = 0;
        CameraSize cameraSize = null;
        int i5 = 0;
        for (CameraSize next : list) {
            int longer = next.getLonger();
            int shorter = next.getShorter();
            if (longer <= i3 && shorter <= i && longer >= i4 && shorter >= i5) {
                cameraSize = next;
                i4 = longer;
                i5 = shorter;
            }
        }
        return cameraSize;
    }

    public static CameraFeatures.FpsRange getBiggestFittingPreviewFps(CameraFeatures.FpsRange[] fpsRangeArr, int i, int i2) {
        CameraFeatures.FpsRange fpsRange = null;
        int i3 = 0;
        int i4 = 0;
        for (CameraFeatures.FpsRange fpsRange2 : fpsRangeArr) {
            int lower = fpsRange2.getLower();
            int upper = fpsRange2.getUpper();
            if (lower <= i && upper <= i2 && lower >= i3 && upper >= i4) {
                fpsRange = fpsRange2;
                i3 = lower;
                i4 = upper;
            }
        }
        return fpsRange;
    }

    public static CameraSize getBestFittingPictureSize(List<CameraSize> list, int i, int i2, List<AspectRatio> list2) {
        CameraSize cameraSize;
        if (i == 0 || i2 == 0) {
            cameraSize = list2 != null ? m112a(list, 0, 0, (AspectRatio[]) list2.toArray(new AspectRatio[list2.size()])) : null;
        } else {
            if (list2 != null) {
                cameraSize = m112a(list, i, i2, (AspectRatio[]) list2.toArray(new AspectRatio[list2.size()]));
            } else {
                cameraSize = m112a(list, i, i2, new AspectRatio[0]);
            }
            if (cameraSize == null) {
                if (list2 != null) {
                    cameraSize = m112a(list, 0, 0, (AspectRatio[]) list2.toArray(new AspectRatio[list2.size()]));
                } else {
                    cameraSize = m112a(list, 0, 0, AspectRatio.RATIO_16_9, AspectRatio.RATIO_5_3, AspectRatio.RATIO_16_10);
                }
            }
        }
        return cameraSize == null ? m112a(list, 0, 0, new AspectRatio[0]) : cameraSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r15 != false) goto L_0x0079;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p007at.nineyards.anyline.camera.CameraSize m112a(java.util.List<p007at.nineyards.anyline.camera.CameraSize> r19, int r20, int r21, p007at.nineyards.anyline.camera.CameraUtil.AspectRatio... r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            if (r0 == 0) goto L_0x0013
            if (r1 != 0) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0015
        L_0x0013:
            r3 = 0
            r5 = 0
        L_0x0015:
            if (r0 <= r1) goto L_0x0019
            r6 = r0
            goto L_0x001a
        L_0x0019:
            r6 = r1
        L_0x001a:
            if (r0 <= r1) goto L_0x001d
            r0 = r1
        L_0x001d:
            java.util.Iterator r1 = r19.iterator()
            r7 = 0
        L_0x0022:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0094
            java.lang.Object r8 = r1.next()
            at.nineyards.anyline.camera.CameraSize r8 = (p007at.nineyards.anyline.camera.CameraSize) r8
            int r9 = r8.getLonger()
            int r10 = r8.getShorter()
            if (r2 == 0) goto L_0x0077
            int r11 = r2.length
            if (r11 == 0) goto L_0x0077
            int r11 = r2.length
            r12 = 1
            if (r11 != r12) goto L_0x0049
            r11 = r2[r4]
            at.nineyards.anyline.camera.CameraUtil$AspectRatio r13 = p007at.nineyards.anyline.camera.CameraUtil.AspectRatio.RATIO_ANY
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x0077
        L_0x0049:
            double r13 = (double) r9
            r19 = r5
            double r4 = (double) r10
            double r13 = r13 / r4
            int r4 = r2.length
            r5 = 0
            r15 = 0
        L_0x0051:
            if (r5 >= r4) goto L_0x0071
            r11 = r2[r5]
            at.nineyards.anyline.camera.CameraUtil$AspectRatio r12 = p007at.nineyards.anyline.camera.CameraUtil.AspectRatio.RATIO_ANY
            if (r11 == r12) goto L_0x006d
            double r11 = r11.f354a
            double r11 = r13 - r11
            double r11 = java.lang.Math.abs(r11)
            r16 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x006d
            r15 = 1
        L_0x006d:
            int r5 = r5 + 1
            r12 = 1
            goto L_0x0051
        L_0x0071:
            if (r15 == 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r5 = r19
            goto L_0x0092
        L_0x0077:
            r19 = r5
        L_0x0079:
            if (r9 < r6) goto L_0x0074
            if (r10 < r0) goto L_0x0074
            if (r6 == 0) goto L_0x0089
            if (r0 != 0) goto L_0x0082
            goto L_0x0089
        L_0x0082:
            if (r9 > r3) goto L_0x0074
            r5 = r19
            if (r10 > r5) goto L_0x0092
            goto L_0x008f
        L_0x0089:
            r5 = r19
            if (r3 > r9) goto L_0x0092
            if (r5 > r10) goto L_0x0092
        L_0x008f:
            r7 = r8
            r3 = r9
            r5 = r10
        L_0x0092:
            r4 = 0
            goto L_0x0022
        L_0x0094:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraUtil.m112a(java.util.List, int, int, at.nineyards.anyline.camera.CameraUtil$AspectRatio[]):at.nineyards.anyline.camera.CameraSize");
    }

    /* renamed from: a */
    static MeteringRectangle m111a(Rect rect, int i, RectF rectF, float f, float f2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f3;
        int i8;
        int i9;
        int i10;
        float f4;
        float width = ((float) rect.width()) / f;
        float height = ((float) rect.height()) / f2;
        if (i == 90 || i == 270) {
            width = ((float) rect.height()) / f;
            height = ((float) rect.width()) / f2;
        }
        if (i == 0) {
            i8 = (int) (rectF.left * width);
            i9 = (int) (width * rectF.right);
            i10 = (int) (rectF.top * height);
            f3 = height * rectF.bottom;
        } else if (i != 90) {
            if (i == 180) {
                i5 = (int) (((float) rect.width()) - (rectF.right * width));
                i3 = (int) (((float) rect.width()) - (width * rectF.left));
                i2 = (int) (((float) rect.height()) - (rectF.bottom * height));
                f4 = ((float) rect.height()) - (height * rectF.top);
            } else if (i == 270) {
                i5 = (int) (((float) rect.width()) - (rectF.bottom * height));
                i3 = (int) (((float) rect.width()) - (height * rectF.top));
                i2 = (int) (rectF.left * width);
                f4 = width * rectF.right;
            } else {
                throw new IllegalStateException("Unknown camera orientation while updating focus area!");
            }
            i4 = (int) f4;
            i6 = i5 + rect.left;
            int i11 = i2 + rect.top;
            i7 = i3 + rect.left;
            int i12 = i4 + rect.top;
            if (i6 >= i7 && i11 < i12) {
                return new MeteringRectangle(i6, i11, i7 - i6, i12 - i11, 100);
            }
            throw new IllegalStateException("Focus area smaller or equal to zero!");
        } else {
            i8 = (int) (rectF.top * height);
            i9 = (int) (height * rectF.bottom);
            i10 = (int) (((float) rect.height()) - (rectF.right * width));
            f3 = ((float) rect.height()) - (width * rectF.left);
        }
        i4 = (int) f3;
        i6 = i5 + rect.left;
        int i112 = i2 + rect.top;
        i7 = i3 + rect.left;
        int i122 = i4 + rect.top;
        if (i6 >= i7) {
        }
        throw new IllegalStateException("Focus area smaller or equal to zero!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (android.os.Build.MODEL.contains("GT-S7580") != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ae, code lost:
        if (android.os.Build.MODEL.contains("GT-S7580") != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b0, code lost:
        r0 = -r4;
        r4 = -r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Rect m110a(int r3, android.graphics.RectF r4, float r5, float r6) {
        /*
            r0 = 1157234688(0x44fa0000, float:2000.0)
            float r5 = r0 / r5
            float r0 = r0 / r6
            java.lang.String r6 = "GT-S7580"
            if (r3 == 0) goto L_0x008c
            r1 = 90
            r2 = 1148846080(0x447a0000, float:1000.0)
            if (r3 == r1) goto L_0x0062
            r1 = 180(0xb4, float:2.52E-43)
            if (r3 == r1) goto L_0x003e
            r6 = 270(0x10e, float:3.78E-43)
            if (r3 != r6) goto L_0x0036
            float r3 = r4.bottom
            float r3 = r3 * r0
            float r3 = r2 - r3
            int r3 = (int) r3
            float r6 = r4.top
            float r0 = r0 * r6
            float r2 = r2 - r0
            int r6 = (int) r2
            float r0 = r4.left
            float r0 = r0 * r5
            int r0 = (int) r0
            int r0 = r0 + -1000
            float r4 = r4.right
            float r5 = r5 * r4
            int r4 = (int) r5
            int r4 = r4 + -1000
            r5 = r6
        L_0x0033:
            r1 = r0
            goto L_0x00b3
        L_0x0036:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unknown camera orientation while updating focus area!"
            r3.<init>(r4)
            throw r3
        L_0x003e:
            float r3 = r4.right
            float r3 = r3 * r5
            float r3 = r2 - r3
            int r3 = (int) r3
            float r1 = r4.left
            float r5 = r5 * r1
            float r5 = r2 - r5
            int r5 = (int) r5
            float r1 = r4.bottom
            float r1 = r1 * r0
            float r1 = r2 - r1
            int r1 = (int) r1
            float r4 = r4.top
            float r0 = r0 * r4
            float r2 = r2 - r0
            int r4 = (int) r2
            java.lang.String r0 = android.os.Build.MODEL
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x00b3
            goto L_0x00b0
        L_0x0062:
            float r3 = r4.top
            float r3 = r3 * r0
            int r3 = (int) r3
            int r3 = r3 + -1000
            float r1 = r4.bottom
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = r0 + -1000
            float r1 = r4.right
            float r1 = r1 * r5
            float r1 = r2 - r1
            int r1 = (int) r1
            float r4 = r4.left
            float r5 = r5 * r4
            float r2 = r2 - r5
            int r4 = (int) r2
            java.lang.String r5 = android.os.Build.MODEL
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x008a
            int r5 = -r0
            int r6 = -r3
            r3 = r5
            r5 = r6
            goto L_0x00b3
        L_0x008a:
            r5 = r0
            goto L_0x00b3
        L_0x008c:
            float r3 = r4.left
            float r3 = r3 * r5
            int r3 = (int) r3
            int r3 = r3 + -1000
            float r1 = r4.right
            float r5 = r5 * r1
            int r5 = (int) r5
            int r5 = r5 + -1000
            float r1 = r4.top
            float r1 = r1 * r0
            int r1 = (int) r1
            int r1 = r1 + -1000
            float r4 = r4.bottom
            float r0 = r0 * r4
            int r4 = (int) r0
            int r4 = r4 + -1000
            java.lang.String r0 = android.os.Build.MODEL
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x00b3
        L_0x00b0:
            int r0 = -r4
            int r4 = -r1
            goto L_0x0033
        L_0x00b3:
            r6 = -930(0xfffffffffffffc5e, float:NaN)
            int r3 = java.lang.Math.max(r3, r6)
            int r6 = java.lang.Math.max(r1, r6)
            r0 = 930(0x3a2, float:1.303E-42)
            int r5 = java.lang.Math.min(r5, r0)
            int r4 = java.lang.Math.min(r4, r0)
            if (r3 >= r5) goto L_0x00d1
            if (r6 >= r4) goto L_0x00d1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r3, r6, r5, r4)
            return r0
        L_0x00d1:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Focus area smaller or equal to zero!"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.CameraUtil.m110a(int, android.graphics.RectF, float, float):android.graphics.Rect");
    }

    /* renamed from: at.nineyards.anyline.camera.CameraUtil$AspectRatio */
    public enum AspectRatio {
        RATIO_16_9(1.7777777777777777d),
        RATIO_5_3(1.6666666666666667d),
        RATIO_16_10(1.6d),
        RATIO_4_3(1.3333333333333333d),
        RATIO_ANY(1.0d);
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final double f354a;

        private AspectRatio(double d) {
            this.f354a = d;
        }

        public static AspectRatio fromString(String str) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.equals("16:9")) {
                return RATIO_16_9;
            }
            if (lowerCase.equals("5:3")) {
                return RATIO_5_3;
            }
            if (lowerCase.equals("16:10")) {
                return RATIO_16_10;
            }
            if (lowerCase.equals("4:3")) {
                return RATIO_4_3;
            }
            return RATIO_ANY;
        }

        public static AspectRatio fromRatio(double d) {
            if (d > 1.3d && d < 1.4d) {
                return RATIO_4_3;
            }
            if (d > 1.5d && d < 1.63d) {
                return RATIO_16_10;
            }
            if (d >= 1.63d && d < 1.7d) {
                return RATIO_5_3;
            }
            if (d < 1.7d || d >= 1.8d) {
                return RATIO_ANY;
            }
            return RATIO_16_9;
        }
    }
}
