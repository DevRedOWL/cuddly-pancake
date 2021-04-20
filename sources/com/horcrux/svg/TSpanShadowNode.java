package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.utils.Utils;
import javax.annotation.Nullable;

class TSpanShadowNode extends TextShadowNode {
    private static final String FONTS = "fonts/";
    private static final String OTF = ".otf";
    private static final String TTF = ".ttf";
    private static final double radToDeg = 57.29577951308232d;
    private static final double tau = 6.283185307179586d;
    private Path mCache;
    @Nullable
    String mContent;
    private TextPathShadowNode textPath;

    TSpanShadowNode() {
    }

    @ReactProp(name = "content")
    public void setContent(@Nullable String str) {
        this.mContent = str;
        markUpdated();
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        if (this.mContent != null) {
            drawPath(canvas, paint, f);
            return;
        }
        clip(canvas, paint);
        drawGroup(canvas, paint, f);
    }

    /* access modifiers changed from: protected */
    public void releaseCachedPath() {
        this.mCache = null;
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mCache;
        if (path != null) {
            return path;
        }
        if (this.mContent == null) {
            return getGroupPath(canvas, paint);
        }
        setupTextPath();
        pushGlyphContext();
        this.mCache = getLinePath(this.mContent, paint, canvas);
        popGlyphContext();
        return this.mCache;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01de, code lost:
        r0 = r0 * r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Path getLinePath(java.lang.String r70, android.graphics.Paint r71, android.graphics.Canvas r72) {
        /*
            r69 = this;
            r6 = r69
            r0 = r70
            r14 = r71
            int r15 = r70.length()
            android.graphics.Path r13 = new android.graphics.Path
            r13.<init>()
            if (r15 != 0) goto L_0x0012
            return r13
        L_0x0012:
            r1 = 0
            com.horcrux.svg.TextPathShadowNode r2 = r6.textPath
            r12 = 0
            if (r2 == 0) goto L_0x001b
            r16 = 1
            goto L_0x001d
        L_0x001b:
            r16 = 0
        L_0x001d:
            r17 = 0
            if (r16 == 0) goto L_0x003e
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            com.horcrux.svg.TextPathShadowNode r2 = r6.textPath
            android.graphics.Path r2 = r2.getPath()
            r1.<init>(r2, r12)
            float r2 = r1.getLength()
            double r2 = (double) r2
            boolean r4 = r1.isClosed()
            int r5 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r5 != 0) goto L_0x003a
            return r13
        L_0x003a:
            r8 = r1
            r9 = r2
            r7 = r4
            goto L_0x0042
        L_0x003e:
            r8 = r1
            r9 = r17
            r7 = 0
        L_0x0042:
            com.horcrux.svg.GlyphContext r4 = r69.getTextRootGlyphContext()
            com.horcrux.svg.FontData r1 = r4.getFont()
            r6.applyTextPropertiesToPaint(r14, r1)
            com.horcrux.svg.GlyphPathBag r5 = new com.horcrux.svg.GlyphPathBag
            r5.<init>(r14)
            boolean[] r2 = new boolean[r15]
            char[] r19 = r70.toCharArray()
            r20 = r13
            double r12 = r1.kerning
            r22 = r12
            double r12 = r1.wordSpacing
            r25 = r12
            double r11 = r1.letterSpacing
            boolean r3 = r1.manualKerning
            r13 = 1
            r27 = r3 ^ 1
            int r3 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x0075
            com.horcrux.svg.FontVariantLigatures r3 = r1.fontVariantLigatures
            com.horcrux.svg.FontVariantLigatures r13 = com.horcrux.svg.FontVariantLigatures.normal
            if (r3 != r13) goto L_0x0075
            r3 = 1
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            int r13 = android.os.Build.VERSION.SDK_INT
            r28 = r2
            r2 = 21
            if (r13 < r2) goto L_0x00c6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk',"
            r2.append(r13)
            java.lang.String r13 = "'kern', "
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            if (r3 == 0) goto L_0x00ad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "'hlig', 'cala', "
            r3.append(r2)
            java.lang.String r2 = r1.fontFeatureSettings
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r14.setFontFeatureSettings(r2)
            goto L_0x00c6
        L_0x00ad:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, "
            r3.append(r2)
            java.lang.String r2 = r1.fontFeatureSettings
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r14.setFontFeatureSettings(r2)
        L_0x00c6:
            com.facebook.react.bridge.ReadableMap r13 = r1.fontData
            float[] r2 = new float[r15]
            r14.getTextWidths(r0, r2)
            com.horcrux.svg.TextAnchor r3 = r1.textAnchor
            float r0 = r14.measureText(r0)
            double r0 = (double) r0
            double r29 = r6.getTextAnchorOffset(r3, r0)
            double r40 = r4.getFontSize()
            r42 = -1
            r43 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r16 == 0) goto L_0x0137
            r31 = r0
            com.horcrux.svg.TextPathShadowNode r0 = r6.textPath
            com.horcrux.svg.TextPathMidLine r0 = r0.getMidLine()
            com.horcrux.svg.TextPathMidLine r1 = com.horcrux.svg.TextPathMidLine.sharp
            if (r0 != r1) goto L_0x00f1
            r33 = 1
            goto L_0x00f3
        L_0x00f1:
            r33 = 0
        L_0x00f3:
            com.horcrux.svg.TextPathShadowNode r0 = r6.textPath
            com.horcrux.svg.TextPathSide r0 = r0.getSide()
            com.horcrux.svg.TextPathSide r1 = com.horcrux.svg.TextPathSide.right
            if (r0 != r1) goto L_0x0100
            r34 = -1
            goto L_0x0102
        L_0x0100:
            r34 = 1
        L_0x0102:
            com.horcrux.svg.TextPathShadowNode r0 = r6.textPath
            java.lang.String r1 = r0.getStartOffset()
            r45 = r31
            r0 = r69
            r47 = r2
            r48 = r8
            r8 = r3
            r2 = r9
            r49 = r4
            r50 = r5
            r4 = r40
            double r0 = r0.getAbsoluteStartOffset(r1, r2, r4)
            double r29 = r29 + r0
            if (r7 == 0) goto L_0x012f
            double r2 = r9 / r43
            com.horcrux.svg.TextAnchor r4 = com.horcrux.svg.TextAnchor.middle
            if (r8 != r4) goto L_0x0128
            double r2 = -r2
            goto L_0x012a
        L_0x0128:
            r2 = r17
        L_0x012a:
            double r0 = r0 + r2
            double r2 = r0 + r9
            r4 = r0
            goto L_0x0132
        L_0x012f:
            r2 = r9
            r4 = r17
        L_0x0132:
            r1 = r33
            r0 = r34
            goto L_0x0146
        L_0x0137:
            r45 = r0
            r47 = r2
            r49 = r4
            r50 = r5
            r48 = r8
            r2 = r9
            r4 = r17
            r0 = 1
            r1 = 0
        L_0x0146:
            java.lang.String r7 = r6.mTextLength
            if (r7 == 0) goto L_0x018d
            java.lang.String r7 = r6.mTextLength
            int r8 = r72.getWidth()
            r53 = r9
            double r8 = (double) r8
            r34 = 0
            float r10 = r6.mScale
            r55 = r4
            double r4 = (double) r10
            r31 = r7
            r32 = r8
            r36 = r4
            r38 = r40
            double r4 = com.horcrux.svg.PropHelper.fromRelative(r31, r32, r34, r36, r38)
            int r7 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r7 < 0) goto L_0x0185
            int[] r7 = com.horcrux.svg.TSpanShadowNode.C26821.$SwitchMap$com$horcrux$svg$TextLengthAdjust
            com.horcrux.svg.TextLengthAdjust r8 = r6.mLengthAdjust
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 2
            if (r7 == r8) goto L_0x017f
            double r4 = r4 - r45
            int r7 = r15 + -1
            double r7 = (double) r7
            double r4 = r4 / r7
            double r11 = r11 + r4
            goto L_0x0191
        L_0x017f:
            double r7 = r4 / r45
            r51 = r7
            r4 = r11
            goto L_0x0194
        L_0x0185:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Negative textLength value"
            r0.<init>(r1)
            throw r0
        L_0x018d:
            r55 = r4
            r53 = r9
        L_0x0191:
            r4 = r11
            r51 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0194:
            double r11 = (double) r0
            double r9 = r51 * r11
            android.graphics.Paint$FontMetrics r7 = r71.getFontMetrics()
            float r8 = r7.descent
            r45 = r9
            double r8 = (double) r8
            float r10 = r7.leading
            r57 = r0
            r58 = r1
            double r0 = (double) r10
            double r0 = r0 + r8
            float r10 = r7.ascent
            float r10 = -r10
            r59 = r2
            float r2 = r7.leading
            float r10 = r10 + r2
            double r2 = (double) r10
            float r7 = r7.top
            float r7 = -r7
            r61 = r11
            double r10 = (double) r7
            double r31 = r10 + r0
            java.lang.String r7 = r69.getBaselineShift()
            com.horcrux.svg.AlignmentBaseline r12 = r69.getAlignmentBaseline()
            if (r12 == 0) goto L_0x01fd
            int[] r33 = com.horcrux.svg.TSpanShadowNode.C26821.$SwitchMap$com$horcrux$svg$AlignmentBaseline
            int r34 = r12.ordinal()
            r33 = r33[r34]
            switch(r33) {
                case 2: goto L_0x01fa;
                case 3: goto L_0x01fa;
                case 4: goto L_0x01fa;
                case 5: goto L_0x01fd;
                case 6: goto L_0x01fa;
                case 7: goto L_0x01e6;
                case 8: goto L_0x01e1;
                case 9: goto L_0x01dc;
                case 10: goto L_0x01d6;
                case 11: goto L_0x01d4;
                case 12: goto L_0x01d4;
                case 13: goto L_0x01d4;
                case 14: goto L_0x01e4;
                case 15: goto L_0x01d1;
                case 16: goto L_0x01cf;
                default: goto L_0x01ce;
            }
        L_0x01ce:
            goto L_0x01fd
        L_0x01cf:
            r0 = r10
            goto L_0x01e4
        L_0x01d1:
            double r0 = r31 / r43
            goto L_0x01e4
        L_0x01d4:
            r0 = r2
            goto L_0x01e4
        L_0x01d6:
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            goto L_0x01de
        L_0x01dc:
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
        L_0x01de:
            double r0 = r0 * r2
            goto L_0x01e4
        L_0x01e1:
            double r2 = r2 - r8
            double r0 = r2 / r43
        L_0x01e4:
            r2 = 0
            goto L_0x0200
        L_0x01e6:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.String r1 = "x"
            r2 = 0
            r3 = 1
            r14.getTextBounds(r1, r2, r3, r0)
            int r0 = r0.height()
            r1 = 2
            int r0 = r0 / r1
            double r0 = (double) r0
            goto L_0x0200
        L_0x01fa:
            r2 = 0
            double r0 = -r8
            goto L_0x0200
        L_0x01fd:
            r2 = 0
            r0 = r17
        L_0x0200:
            if (r7 == 0) goto L_0x02dc
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L_0x02dc
            int[] r3 = com.horcrux.svg.TSpanShadowNode.C26821.$SwitchMap$com$horcrux$svg$AlignmentBaseline
            int r8 = r12.ordinal()
            r3 = r3[r8]
            r8 = 14
            if (r3 == r8) goto L_0x02dc
            r8 = 16
            if (r3 == r8) goto L_0x02dc
            int r3 = r7.hashCode()
            r8 = -1720785339(0xffffffff996ee645, float:-1.2350814E-23)
            if (r3 == r8) goto L_0x0240
            r8 = 114240(0x1be40, float:1.60084E-40)
            if (r3 == r8) goto L_0x0236
            r8 = 109801339(0x68b6f7b, float:5.2449795E-35)
            if (r3 == r8) goto L_0x022c
            goto L_0x024a
        L_0x022c:
            java.lang.String r3 = "super"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x024a
            r3 = 1
            goto L_0x024b
        L_0x0236:
            java.lang.String r3 = "sub"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x024a
            r3 = 0
            goto L_0x024b
        L_0x0240:
            java.lang.String r3 = "baseline"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x024a
            r3 = 2
            goto L_0x024b
        L_0x024a:
            r3 = -1
        L_0x024b:
            java.lang.String r8 = "os2"
            java.lang.String r9 = "unitsPerEm"
            java.lang.String r10 = "tables"
            if (r3 == 0) goto L_0x02a6
            r11 = 1
            if (r3 == r11) goto L_0x026f
            r11 = 2
            if (r3 == r11) goto L_0x02dc
            float r3 = r6.mScale
            double r8 = (double) r3
            double r32 = r8 * r40
            r34 = 0
            float r3 = r6.mScale
            double r8 = (double) r3
            r31 = r7
            r36 = r8
            r38 = r40
            double r7 = com.horcrux.svg.PropHelper.fromRelative(r31, r32, r34, r36, r38)
            double r0 = r0 - r7
            goto L_0x02dc
        L_0x026f:
            if (r13 == 0) goto L_0x02dc
            boolean r3 = r13.hasKey(r10)
            if (r3 == 0) goto L_0x02dc
            boolean r3 = r13.hasKey(r9)
            if (r3 == 0) goto L_0x02dc
            int r3 = r13.getInt(r9)
            com.facebook.react.bridge.ReadableMap r7 = r13.getMap(r10)
            boolean r9 = r7.hasKey(r8)
            if (r9 == 0) goto L_0x02dc
            com.facebook.react.bridge.ReadableMap r7 = r7.getMap(r8)
            java.lang.String r8 = "ySuperscriptYOffset"
            boolean r9 = r7.hasKey(r8)
            if (r9 == 0) goto L_0x02dc
            double r7 = r7.getDouble(r8)
            float r9 = r6.mScale
            double r9 = (double) r9
            double r9 = r9 * r40
            double r9 = r9 * r7
            double r7 = (double) r3
            double r9 = r9 / r7
            double r0 = r0 - r9
            goto L_0x02dc
        L_0x02a6:
            if (r13 == 0) goto L_0x02dc
            boolean r3 = r13.hasKey(r10)
            if (r3 == 0) goto L_0x02dc
            boolean r3 = r13.hasKey(r9)
            if (r3 == 0) goto L_0x02dc
            int r3 = r13.getInt(r9)
            com.facebook.react.bridge.ReadableMap r7 = r13.getMap(r10)
            boolean r9 = r7.hasKey(r8)
            if (r9 == 0) goto L_0x02dc
            com.facebook.react.bridge.ReadableMap r7 = r7.getMap(r8)
            java.lang.String r8 = "ySubscriptYOffset"
            boolean r9 = r7.hasKey(r8)
            if (r9 == 0) goto L_0x02dc
            double r7 = r7.getDouble(r8)
            float r9 = r6.mScale
            double r9 = (double) r9
            double r9 = r9 * r40
            double r9 = r9 * r7
            double r7 = (double) r3
            double r9 = r9 / r7
            double r0 = r0 + r9
        L_0x02dc:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            android.graphics.Matrix r13 = new android.graphics.Matrix
            r13.<init>()
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            r7 = 9
            float[] r11 = new float[r7]
            float[] r10 = new float[r7]
            r9 = 0
        L_0x02f2:
            if (r9 >= r15) goto L_0x0507
            char r7 = r19[r9]
            java.lang.String r8 = java.lang.String.valueOf(r7)
            boolean r21 = r28[r9]
            r2 = 0
            if (r21 == 0) goto L_0x0304
            java.lang.String r8 = ""
            r32 = 0
            goto L_0x0349
        L_0x0304:
            r63 = r8
            r8 = r9
            r24 = 1
            r32 = 0
        L_0x030b:
            int r8 = r8 + 1
            if (r8 >= r15) goto L_0x0345
            r33 = r47[r8]
            int r33 = (r33 > r2 ? 1 : (r33 == r2 ? 0 : -1))
            if (r33 <= 0) goto L_0x0316
            goto L_0x0345
        L_0x0316:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r6 = r63
            r2.append(r6)
            char r33 = r19[r8]
            r34 = r6
            java.lang.String r6 = java.lang.String.valueOf(r33)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            boolean r6 = com.horcrux.svg.PaintCompat.hasGlyph(r14, r2)
            if (r6 == 0) goto L_0x033d
            r6 = 1
            r28[r8] = r6
            r63 = r2
            r32 = 1
            goto L_0x033f
        L_0x033d:
            r63 = r34
        L_0x033f:
            r2 = 0
            r24 = 1
            r6 = r69
            goto L_0x030b
        L_0x0345:
            r34 = r63
            r8 = r34
        L_0x0349:
            float r2 = r14.measureText(r8)
            r6 = r15
            double r14 = (double) r2
            double r14 = r14 * r51
            if (r27 == 0) goto L_0x0360
            r2 = r47[r9]
            r34 = r8
            r33 = r9
            double r8 = (double) r2
            double r8 = r8 * r51
            double r8 = r8 - r14
            r22 = r8
            goto L_0x0364
        L_0x0360:
            r34 = r8
            r33 = r9
        L_0x0364:
            r2 = 32
            if (r7 != r2) goto L_0x036a
            r2 = 1
            goto L_0x036b
        L_0x036a:
            r2 = 0
        L_0x036b:
            if (r2 == 0) goto L_0x0370
            r8 = r25
            goto L_0x0372
        L_0x0370:
            r8 = r17
        L_0x0372:
            double r8 = r8 + r4
            double r8 = r8 + r14
            if (r21 == 0) goto L_0x037d
            r35 = r4
            r4 = r17
            r2 = r49
            goto L_0x0387
        L_0x037d:
            double r35 = r22 + r8
            r2 = r49
            r67 = r4
            r4 = r35
            r35 = r67
        L_0x0387:
            double r4 = r2.nextX(r4)
            r38 = r6
            r37 = r7
            double r6 = r2.nextY()
            double r39 = r2.nextDeltaX()
            double r41 = r2.nextDeltaY()
            r63 = r6
            double r6 = r2.nextRotation()
            if (r21 == 0) goto L_0x03c2
        L_0x03a3:
            r65 = r0
            r49 = r2
            r37 = r10
            r4 = r11
            r5 = r12
            r0 = r13
            r15 = r20
            r34 = r33
            r32 = r45
            r6 = r48
            r1 = r50
            r14 = r57
            r39 = r61
            r21 = 2
            r24 = 1
            r31 = 0
            goto L_0x04e7
        L_0x03c2:
            double r8 = r8 * r61
            double r14 = r14 * r61
            double r4 = r4 + r39
            double r4 = r4 * r61
            double r4 = r29 + r4
            double r4 = r4 - r8
            if (r16 == 0) goto L_0x046c
            double r8 = r4 + r14
            double r14 = r14 / r43
            r39 = r6
            double r6 = r4 + r14
            int r21 = (r6 > r59 ? 1 : (r6 == r59 ? 0 : -1))
            if (r21 <= 0) goto L_0x03dc
            goto L_0x03a3
        L_0x03dc:
            int r21 = (r6 > r55 ? 1 : (r6 == r55 ? 0 : -1))
            if (r21 >= 0) goto L_0x03e1
            goto L_0x03a3
        L_0x03e1:
            r49 = r2
            r2 = 3
            if (r58 == 0) goto L_0x03f1
            float r4 = (float) r6
            r5 = r48
            r5.getMatrix(r4, r13, r2)
            r65 = r0
            r6 = r53
            goto L_0x0453
        L_0x03f1:
            r2 = r48
            int r48 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r48 >= 0) goto L_0x0404
            r65 = r0
            r0 = 3
            r1 = 0
            r2.getMatrix(r1, r3, r0)
            float r0 = (float) r4
            r3.preTranslate(r0, r1)
            r1 = 1
            goto L_0x040b
        L_0x0404:
            r65 = r0
            float r0 = (float) r4
            r1 = 1
            r2.getMatrix(r0, r3, r1)
        L_0x040b:
            float r0 = (float) r6
            r2.getMatrix(r0, r13, r1)
            int r0 = (r8 > r53 ? 1 : (r8 == r53 ? 0 : -1))
            if (r0 <= 0) goto L_0x0421
            r6 = r53
            float r0 = (float) r6
            r4 = 3
            r2.getMatrix(r0, r12, r4)
            double r8 = r8 - r6
            float r0 = (float) r8
            r4 = 0
            r12.preTranslate(r0, r4)
            goto L_0x0427
        L_0x0421:
            r6 = r53
            float r0 = (float) r8
            r2.getMatrix(r0, r12, r1)
        L_0x0427:
            r3.getValues(r11)
            r12.getValues(r10)
            r0 = 2
            r4 = r11[r0]
            double r4 = (double) r4
            r8 = 5
            r9 = r11[r8]
            r48 = r2
            double r1 = (double) r9
            r9 = r10[r0]
            r53 = r1
            double r0 = (double) r9
            r2 = r10[r8]
            double r8 = (double) r2
            double r0 = r0 - r4
            double r8 = r8 - r53
            double r0 = java.lang.Math.atan2(r8, r0)
            r4 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r0 = r0 * r4
            double r0 = r0 * r61
            float r0 = (float) r0
            r13.preRotate(r0)
        L_0x0453:
            double r0 = -r14
            float r0 = (float) r0
            double r1 = r41 + r65
            float r1 = (float) r1
            r13.preTranslate(r0, r1)
            r0 = r45
            float r2 = (float) r0
            r14 = r57
            float r4 = (float) r14
            r13.preScale(r2, r4)
            r8 = r63
            float r2 = (float) r8
            r4 = 0
            r13.postTranslate(r4, r2)
            goto L_0x0483
        L_0x046c:
            r65 = r0
            r49 = r2
            r39 = r6
            r0 = r45
            r6 = r53
            r14 = r57
            r8 = r63
            float r2 = (float) r4
            double r4 = r8 + r41
            double r4 = r4 + r65
            float r4 = (float) r4
            r13.setTranslate(r2, r4)
        L_0x0483:
            r4 = r39
            float r2 = (float) r4
            r13.preRotate(r2)
            if (r32 == 0) goto L_0x04c0
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r9 = 0
            int r4 = r34.length()
            r5 = 0
            r15 = 0
            r39 = r6
            r7 = r71
            r6 = r48
            r21 = 2
            r8 = r34
            r34 = r33
            r32 = r0
            r0 = r39
            r37 = r10
            r10 = r4
            r4 = r11
            r39 = r61
            r24 = 1
            r11 = r5
            r5 = r12
            r31 = 0
            r12 = r15
            r53 = r0
            r0 = r13
            r15 = r20
            r13 = r2
            r7.getTextPath(r8, r9, r10, r11, r12, r13)
            r1 = r50
            goto L_0x04e1
        L_0x04c0:
            r53 = r6
            r4 = r11
            r5 = r12
            r15 = r20
            r8 = r34
            r2 = r37
            r6 = r48
            r39 = r61
            r21 = 2
            r24 = 1
            r31 = 0
            r37 = r10
            r34 = r33
            r32 = r0
            r0 = r13
            r1 = r50
            android.graphics.Path r2 = r1.getOrCreateAndCache(r2, r8)
        L_0x04e1:
            r2.transform(r0)
            r15.addPath(r2)
        L_0x04e7:
            int r9 = r34 + 1
            r13 = r0
            r50 = r1
            r11 = r4
            r12 = r5
            r48 = r6
            r57 = r14
            r20 = r15
            r45 = r32
            r4 = r35
            r10 = r37
            r15 = r38
            r61 = r39
            r0 = r65
            r2 = 0
            r6 = r69
            r14 = r71
            goto L_0x02f2
        L_0x0507:
            r15 = r20
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TSpanShadowNode.getLinePath(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    private double getAbsoluteStartOffset(String str, double d, double d2) {
        return PropHelper.fromRelative(str, d, Utils.DOUBLE_EPSILON, (double) this.mScale, d2);
    }

    /* renamed from: com.horcrux.svg.TSpanShadowNode$1 */
    static /* synthetic */ class C26821 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextAnchor = new int[TextAnchor.values().length];
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextLengthAdjust = new int[TextLengthAdjust.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|47|48|49|50|52) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00fc */
        static {
            /*
                com.horcrux.svg.TextAnchor[] r0 = com.horcrux.svg.TextAnchor.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$horcrux$svg$TextAnchor = r0
                r0 = 1
                int[] r1 = $SwitchMap$com$horcrux$svg$TextAnchor     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.horcrux.svg.TextAnchor r2 = com.horcrux.svg.TextAnchor.start     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$com$horcrux$svg$TextAnchor     // Catch:{ NoSuchFieldError -> 0x001f }
                com.horcrux.svg.TextAnchor r3 = com.horcrux.svg.TextAnchor.middle     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$com$horcrux$svg$TextAnchor     // Catch:{ NoSuchFieldError -> 0x002a }
                com.horcrux.svg.TextAnchor r4 = com.horcrux.svg.TextAnchor.end     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.horcrux.svg.AlignmentBaseline[] r3 = com.horcrux.svg.AlignmentBaseline.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$horcrux$svg$AlignmentBaseline = r3
                int[] r3 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x003d }
                com.horcrux.svg.AlignmentBaseline r4 = com.horcrux.svg.AlignmentBaseline.baseline     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r3 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.horcrux.svg.AlignmentBaseline r4 = com.horcrux.svg.AlignmentBaseline.textBottom     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r3 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.horcrux.svg.AlignmentBaseline r4 = com.horcrux.svg.AlignmentBaseline.afterEdge     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x005c }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.textAfterEdge     // Catch:{ NoSuchFieldError -> 0x005c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.alphabetic     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.ideographic     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x007d }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.middle     // Catch:{ NoSuchFieldError -> 0x007d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.central     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x0095 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.mathematical     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r4 = 9
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x00a1 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.hanging     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r4 = 10
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x00ad }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.textTop     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r4 = 11
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.beforeEdge     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r4 = 12
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x00c5 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.textBeforeEdge     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r4 = 13
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x00d1 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.bottom     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r4 = 14
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x00dd }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.center     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r4 = 15
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r2 = $SwitchMap$com$horcrux$svg$AlignmentBaseline     // Catch:{ NoSuchFieldError -> 0x00e9 }
                com.horcrux.svg.AlignmentBaseline r3 = com.horcrux.svg.AlignmentBaseline.top     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r4 = 16
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                com.horcrux.svg.TextLengthAdjust[] r2 = com.horcrux.svg.TextLengthAdjust.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$horcrux$svg$TextLengthAdjust = r2
                int[] r2 = $SwitchMap$com$horcrux$svg$TextLengthAdjust     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.horcrux.svg.TextLengthAdjust r3 = com.horcrux.svg.TextLengthAdjust.spacing     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = $SwitchMap$com$horcrux$svg$TextLengthAdjust     // Catch:{ NoSuchFieldError -> 0x0106 }
                com.horcrux.svg.TextLengthAdjust r2 = com.horcrux.svg.TextLengthAdjust.spacingAndGlyphs     // Catch:{ NoSuchFieldError -> 0x0106 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0106 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0106 }
            L_0x0106:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TSpanShadowNode.C26821.<clinit>():void");
        }
    }

    private double getTextAnchorOffset(TextAnchor textAnchor, double d) {
        int i = C26821.$SwitchMap$com$horcrux$svg$TextAnchor[textAnchor.ordinal()];
        if (i != 2) {
            return i != 3 ? Utils.DOUBLE_EPSILON : -d;
        }
        return (-d) / 2.0d;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4 = android.graphics.Typeface.createFromAsset(r1, FONTS + r12 + TTF);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4 = android.graphics.Typeface.create(r12, r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007d */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyTextPropertiesToPaint(android.graphics.Paint r11, com.horcrux.svg.FontData r12) {
        /*
            r10 = this;
            java.lang.String r0 = "fonts/"
            com.facebook.react.uimanager.ThemedReactContext r1 = r10.getThemedContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.AssetManager r1 = r1.getAssets()
            double r2 = r12.fontSize
            float r4 = r10.mScale
            double r4 = (double) r4
            double r2 = r2 * r4
            com.horcrux.svg.FontWeight r4 = r12.fontWeight
            com.horcrux.svg.FontWeight r5 = com.horcrux.svg.FontWeight.Bold
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            com.horcrux.svg.FontStyle r5 = r12.fontStyle
            com.horcrux.svg.FontStyle r8 = com.horcrux.svg.FontStyle.italic
            if (r5 != r8) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            com.horcrux.svg.TextDecoration r8 = r12.textDecoration
            com.horcrux.svg.TextDecoration r9 = com.horcrux.svg.TextDecoration.Underline
            if (r8 != r9) goto L_0x0031
            r8 = 1
            goto L_0x0039
        L_0x0031:
            com.horcrux.svg.TextDecoration r9 = com.horcrux.svg.TextDecoration.LineThrough
            if (r8 != r9) goto L_0x0038
            r8 = 0
            r9 = 1
            goto L_0x003a
        L_0x0038:
            r8 = 0
        L_0x0039:
            r9 = 0
        L_0x003a:
            if (r4 == 0) goto L_0x0040
            if (r5 == 0) goto L_0x0040
            r6 = 3
            goto L_0x0048
        L_0x0040:
            if (r4 == 0) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            if (r5 == 0) goto L_0x0047
            r6 = 2
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            r4 = 0
            java.lang.String r12 = r12.fontFamily
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064 }
            r5.<init>()     // Catch:{ Exception -> 0x0064 }
            r5.append(r0)     // Catch:{ Exception -> 0x0064 }
            r5.append(r12)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r7 = ".otf"
            r5.append(r7)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0064 }
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromAsset(r1, r5)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0081
        L_0x0064:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r5.<init>()     // Catch:{ Exception -> 0x007d }
            r5.append(r0)     // Catch:{ Exception -> 0x007d }
            r5.append(r12)     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = ".ttf"
            r5.append(r0)     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x007d }
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x007d }
            goto L_0x0081
        L_0x007d:
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r12, r6)     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            r11.setTypeface(r4)
            float r12 = (float) r2
            r11.setTextSize(r12)
            android.graphics.Paint$Align r12 = android.graphics.Paint.Align.LEFT
            r11.setTextAlign(r12)
            r11.setUnderlineText(r8)
            r11.setStrikeThruText(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TSpanShadowNode.applyTextPropertiesToPaint(android.graphics.Paint, com.horcrux.svg.FontData):void");
    }

    private void setupTextPath() {
        ReactShadowNode parent = getParent();
        while (parent != null) {
            if (parent.getClass() == TextPathShadowNode.class) {
                this.textPath = (TextPathShadowNode) parent;
                return;
            } else if (parent instanceof TextShadowNode) {
                parent = parent.getParent();
            } else {
                return;
            }
        }
    }

    public int hitTest(float[] fArr) {
        if (this.mContent == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            if (this.mRegion == null && this.mPath != null) {
                this.mRegion = getRegion(this.mPath);
            }
            if (this.mRegion != null && this.mRegion.contains(round, round2)) {
                Path clipPath = getClipPath();
                if (clipPath != null) {
                    if (this.mClipRegionPath != clipPath) {
                        this.mClipRegionPath = clipPath;
                        this.mClipRegion = getRegion(clipPath);
                    }
                    if (!this.mClipRegion.contains(round, round2)) {
                        return -1;
                    }
                }
                return getReactTag();
            }
        }
        return -1;
    }
}
