package p007at.nineyards.anyline.camera;

import android.graphics.Rect;
import android.graphics.RectF;
import p007at.nineyards.anyline.camera.AnylineViewConfig;

/* renamed from: at.nineyards.anyline.camera.a */
final class C0762a {

    /* renamed from: a */
    RectF f416a = null;

    /* renamed from: b */
    Rect f417b = null;

    /* renamed from: c */
    Rect f418c = null;

    /* renamed from: d */
    int f419d;

    /* renamed from: e */
    int f420e;

    /* renamed from: f */
    int f421f;

    /* renamed from: g */
    int f422g;

    /* renamed from: h */
    private AnylineViewConfig f423h;

    C0762a(AnylineViewConfig anylineViewConfig) {
        this.f423h = anylineViewConfig;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0177  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12248a(int r17, int r18, int r19, int r20, float r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            if (r1 == 0) goto L_0x01e8
            if (r2 == 0) goto L_0x01e8
            if (r3 == 0) goto L_0x01e8
            if (r4 == 0) goto L_0x01e8
            at.nineyards.anyline.camera.AnylineViewConfig r5 = r0.f423h
            if (r5 != 0) goto L_0x0018
            goto L_0x01e8
        L_0x0018:
            float r6 = (float) r1
            float r6 = r6 * r21
            float r7 = (float) r2
            float r7 = r7 * r21
            float r3 = (float) r3
            float r3 = r3 / r21
            int r3 = (int) r3
            float r4 = (float) r4
            float r4 = r4 / r21
            int r4 = (int) r4
            int r8 = r1 - r3
            r9 = 2
            int r8 = r8 / r9
            r0.f419d = r8
            int r8 = r2 - r4
            int r10 = r8 / 2
            r0.f420e = r10
            int r5 = r5.getCutoutWidth()
            at.nineyards.anyline.camera.AnylineViewConfig r10 = r0.f423h
            int r10 = r10.getCutoutMaxWidthPercent()
            float r11 = (float) r3
            float r10 = (float) r10
            r12 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r12
            float r11 = r11 * r10
            int r10 = (int) r11
            if (r5 == 0) goto L_0x004a
            if (r5 <= r10) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r10 = r5
        L_0x004a:
            float r5 = (float) r10
            at.nineyards.anyline.camera.AnylineViewConfig r11 = r0.f423h
            float r11 = r11.getCutoutRatio()
            float r5 = r5 / r11
            int r5 = java.lang.Math.round(r5)
            at.nineyards.anyline.camera.AnylineViewConfig r11 = r0.f423h
            int r11 = r11.getCutoutMaxHeightPercent()
            float r13 = (float) r4
            float r11 = (float) r11
            float r11 = r11 / r12
            float r13 = r13 * r11
            int r11 = (int) r13
            if (r5 <= r11) goto L_0x0072
            float r5 = (float) r11
            at.nineyards.anyline.camera.AnylineViewConfig r10 = r0.f423h
            float r10 = r10.getCutoutRatio()
            float r5 = r5 * r10
            int r10 = java.lang.Math.round(r5)
            goto L_0x0073
        L_0x0072:
            r11 = r5
        L_0x0073:
            at.nineyards.anyline.camera.AnylineViewConfig r5 = r0.f423h
            int r5 = r5.getCutoutCropPaddingX()
            int r5 = r5 * 2
            int r5 = r10 - r5
            int r12 = r1 - r10
            int r13 = r12 / 2
            at.nineyards.anyline.camera.AnylineViewConfig r14 = r0.f423h
            int r14 = r14.getCutoutOffsetX()
            int r13 = r13 + r14
            int r14 = r13 + r10
            int r15 = r0.f419d
            int r3 = r3 + r15
            if (r14 <= r3) goto L_0x0091
            int r13 = r12 - r15
        L_0x0091:
            int r3 = r0.f419d
            if (r13 >= r3) goto L_0x0096
            r13 = r3
        L_0x0096:
            at.nineyards.anyline.camera.AnylineViewConfig r3 = r0.f423h
            int r3 = r3.getCutoutCropPaddingX()
            int r3 = r3 + r13
            at.nineyards.anyline.camera.AnylineViewConfig r12 = r0.f423h
            int r12 = r12.getCutoutCropOffsetX()
            int r3 = r3 + r12
            at.nineyards.anyline.camera.AnylineViewConfig r12 = r0.f423h
            int r12 = r12.getCutoutCropPaddingY()
            int r12 = r12 * 2
            int r12 = r11 - r12
            int[] r14 = p007at.nineyards.anyline.camera.C0762a.C07631.f424a
            at.nineyards.anyline.camera.AnylineViewConfig r15 = r0.f423h
            at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r15 = r15.getCutoutAlignment()
            int r15 = r15.ordinal()
            r14 = r14[r15]
            r15 = 1
            if (r14 == r15) goto L_0x00f1
            r15 = 3
            if (r14 == r9) goto L_0x00e4
            if (r14 == r15) goto L_0x00dd
            r9 = 4
            if (r14 == r9) goto L_0x00d1
            r9 = 5
            if (r14 == r9) goto L_0x00cc
            r15 = 0
            goto L_0x00f4
        L_0x00cc:
            r0.f420e = r8
            int r15 = r2 - r11
            goto L_0x00ee
        L_0x00d1:
            int r8 = r4 - r11
            int r9 = r0.f420e
            int r14 = r9 * 2
            int r8 = r8 - r14
            int r8 = r8 / r15
            r14 = 2
            int r8 = r8 * 2
            goto L_0x00ec
        L_0x00dd:
            int r8 = r2 / 2
            int r9 = r11 / 2
            int r15 = r8 - r9
            goto L_0x00ee
        L_0x00e4:
            int r8 = r4 - r11
            int r9 = r0.f420e
            int r14 = r9 * 2
            int r8 = r8 - r14
            int r8 = r8 / r15
        L_0x00ec:
            int r15 = r8 + r9
        L_0x00ee:
            r8 = r15
            r15 = 0
            goto L_0x00f5
        L_0x00f1:
            r15 = 0
            r0.f420e = r15
        L_0x00f4:
            r8 = 0
        L_0x00f5:
            at.nineyards.anyline.camera.AnylineViewConfig r9 = r0.f423h
            int r9 = r9.getCutoutOffsetY()
            int r8 = r8 + r9
            int r9 = r8 + r11
            int r14 = r0.f420e
            int r15 = r14 + r4
            if (r9 <= r15) goto L_0x0107
            int r4 = r4 - r11
            int r8 = r4 + r14
        L_0x0107:
            int r4 = r0.f420e
            if (r8 >= r4) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r4 = r8
        L_0x010d:
            at.nineyards.anyline.camera.AnylineViewConfig r8 = r0.f423h
            int r8 = r8.getCutoutCropPaddingY()
            int r8 = r8 + r4
            at.nineyards.anyline.camera.AnylineViewConfig r9 = r0.f423h
            int r9 = r9.getCutoutCropOffsetY()
            int r8 = r8 + r9
            int r9 = r3 % 2
            if (r9 == 0) goto L_0x0121
            int r3 = r3 + 1
        L_0x0121:
            r15 = r3
            int r3 = r8 % 2
            if (r3 == 0) goto L_0x0128
            int r8 = r8 + 1
        L_0x0128:
            int r3 = r5 % 2
            if (r3 == 0) goto L_0x012e
            int r5 = r5 + 1
        L_0x012e:
            int r3 = r12 % 2
            if (r3 == 0) goto L_0x0134
            int r12 = r12 + 1
        L_0x0134:
            if (r5 <= r1) goto L_0x0137
            r5 = r1
        L_0x0137:
            if (r15 >= 0) goto L_0x013a
            r15 = 0
        L_0x013a:
            int r3 = r15 + r5
            if (r3 <= r1) goto L_0x0140
            int r15 = r1 - r5
        L_0x0140:
            if (r12 <= r2) goto L_0x0143
            r12 = r2
        L_0x0143:
            if (r8 >= 0) goto L_0x0146
            r8 = 0
        L_0x0146:
            int r1 = r8 + r12
            if (r1 <= r2) goto L_0x014c
            int r8 = r2 - r12
        L_0x014c:
            android.graphics.Rect r1 = new android.graphics.Rect
            int r5 = r5 + r15
            int r12 = r12 + r8
            r1.<init>(r15, r8, r5, r12)
            r0.f418c = r1
            float r1 = (float) r13
            float r1 = r1 * r21
            float r2 = (float) r4
            float r2 = r2 * r21
            float r3 = (float) r10
            float r3 = r3 * r21
            float r3 = r3 + r1
            float r4 = (float) r11
            float r4 = r4 * r21
            float r4 = r4 + r2
            r5 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0169
            r1 = 0
        L_0x0169:
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x016e
            r3 = r6
        L_0x016e:
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x0173
            r2 = 0
        L_0x0173:
            int r5 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0178
            r4 = r7
        L_0x0178:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r1, r2, r3, r4)
            r0.f416a = r5
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r0.f417b = r5
            android.graphics.Rect r5 = r0.f417b
            int r6 = r0.f419d
            float r6 = (float) r6
            float r6 = r6 * r21
            float r1 = r1 - r6
            int r1 = java.lang.Math.round(r1)
            r5.left = r1
            android.graphics.Rect r1 = r0.f417b
            int r5 = r0.f420e
            float r5 = (float) r5
            float r5 = r5 * r21
            float r2 = r2 - r5
            int r2 = java.lang.Math.round(r2)
            r1.top = r2
            android.graphics.Rect r1 = r0.f417b
            int r2 = r0.f419d
            float r2 = (float) r2
            float r2 = r2 * r21
            float r3 = r3 - r2
            int r2 = java.lang.Math.round(r3)
            r1.right = r2
            android.graphics.Rect r1 = r0.f417b
            int r2 = r0.f420e
            float r2 = (float) r2
            float r2 = r2 * r21
            float r4 = r4 - r2
            int r2 = java.lang.Math.round(r4)
            r1.bottom = r2
            android.graphics.Rect r1 = r0.f418c
            int r1 = r1.left
            int r2 = r0.f419d
            int r1 = r1 - r2
            float r1 = (float) r1
            float r1 = r1 * r21
            int r1 = java.lang.Math.round(r1)
            android.graphics.Rect r2 = r0.f417b
            int r2 = r2.left
            int r1 = r1 - r2
            r0.f421f = r1
            android.graphics.Rect r1 = r0.f418c
            int r1 = r1.top
            int r2 = r0.f420e
            int r1 = r1 - r2
            float r1 = (float) r1
            float r1 = r1 * r21
            int r1 = java.lang.Math.round(r1)
            android.graphics.Rect r2 = r0.f417b
            int r2 = r2.top
            int r1 = r1 - r2
            r0.f422g = r1
        L_0x01e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.C0762a.mo12248a(int, int, int, int, float):void");
    }

    /* renamed from: at.nineyards.anyline.camera.a$1 */
    static /* synthetic */ class C07631 {

        /* renamed from: a */
        static final /* synthetic */ int[] f424a = new int[AnylineViewConfig.CutoutAlignment.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment[] r0 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f424a = r0
                int[] r0 = f424a     // Catch:{ NoSuchFieldError -> 0x0014 }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f424a     // Catch:{ NoSuchFieldError -> 0x001f }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.TOP_HALF     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f424a     // Catch:{ NoSuchFieldError -> 0x002a }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f424a     // Catch:{ NoSuchFieldError -> 0x0035 }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.BOTTOM_HALF     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f424a     // Catch:{ NoSuchFieldError -> 0x0040 }
                at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment r1 = p007at.nineyards.anyline.camera.AnylineViewConfig.CutoutAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.C0762a.C07631.<clinit>():void");
        }
    }
}
