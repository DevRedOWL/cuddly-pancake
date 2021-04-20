package com.horcrux.svg;

import com.facebook.react.uimanager.ReactShadowNode;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

public class TextLayoutAlgorithm {

    class CharacterInformation {
        boolean addressable = true;
        double advance;
        boolean anchoredChunk = false;
        char character;
        TextShadowNode element;
        boolean firstCharacterInResolvedDescendant = false;
        boolean hidden = false;
        int index;
        boolean middle = false;
        boolean resolved = false;
        double rotate = Utils.DOUBLE_EPSILON;
        boolean rotateSpecified = false;

        /* renamed from: x */
        double f2282x = Utils.DOUBLE_EPSILON;
        boolean xSpecified = false;

        /* renamed from: y */
        double f2283y = Utils.DOUBLE_EPSILON;
        boolean ySpecified = false;

        CharacterInformation(int i, char c) {
            this.index = i;
            this.character = c;
        }
    }

    class LayoutInput {
        boolean horizontal;
        TextShadowNode text;

        LayoutInput() {
        }
    }

    private void getSubTreeTypographicCharacterPositions(ArrayList<TextPathShadowNode> arrayList, ArrayList<TextShadowNode> arrayList2, StringBuilder sb, ReactShadowNode reactShadowNode, TextPathShadowNode textPathShadowNode) {
        int i = 0;
        if (reactShadowNode instanceof TSpanShadowNode) {
            TSpanShadowNode tSpanShadowNode = (TSpanShadowNode) reactShadowNode;
            String str = tSpanShadowNode.mContent;
            if (str == null) {
                while (i < reactShadowNode.getChildCount()) {
                    getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, reactShadowNode.getChildAt(i), textPathShadowNode);
                    i++;
                }
                return;
            }
            while (i < str.length()) {
                arrayList2.add(tSpanShadowNode);
                arrayList.add(textPathShadowNode);
                i++;
            }
            sb.append(str);
            return;
        }
        if (reactShadowNode instanceof TextPathShadowNode) {
            textPathShadowNode = (TextPathShadowNode) reactShadowNode;
        }
        while (i < reactShadowNode.getChildCount()) {
            getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, reactShadowNode.getChildAt(i), textPathShadowNode);
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019a, code lost:
        if (r18 == Double.POSITIVE_INFINITY) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a1, code lost:
        if (r4 == (r10 - 1)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a3, code lost:
        r12 = com.horcrux.svg.TextAnchor.start;
        r13 = com.horcrux.svg.Direction.ltr;
        r14 = r10 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a9, code lost:
        if (r4 != r14) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ab, code lost:
        r16 = r0;
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01af, code lost:
        r2 = r11[r8].f2282x;
        r12 = com.horcrux.svg.TextLayoutAlgorithm.C26831.$SwitchMap$com$horcrux$svg$TextAnchor[r12.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01bc, code lost:
        if (r12 == 1) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bf, code lost:
        if (r12 == 2) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c2, code lost:
        if (r12 == 3) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c7, code lost:
        if (r13 != com.horcrux.svg.Direction.ltr) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ca, code lost:
        r12 = com.horcrux.svg.Direction.ltr;
        r2 = r2 - ((r18 + r16) / 2.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d4, code lost:
        if (r13 != com.horcrux.svg.Direction.ltr) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d6, code lost:
        r2 = r2 - r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d9, code lost:
        r2 = r2 - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01db, code lost:
        if (r4 != r14) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dd, code lost:
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01df, code lost:
        r12 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e1, code lost:
        if (r8 > r12) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e3, code lost:
        r11[r8].f2282x += r2;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ed, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ee, code lost:
        r20 = r16;
        r16 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x032d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.horcrux.svg.TextLayoutAlgorithm.CharacterInformation[] layoutText(com.horcrux.svg.TextLayoutAlgorithm.LayoutInput r27) {
        /*
            r26 = this;
            r7 = r26
            r0 = r27
            com.horcrux.svg.TextShadowNode r8 = r0.text
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r5 = 0
            r0 = r26
            r1 = r9
            r3 = r6
            r4 = r8
            r0.getSubTreeTypographicCharacterPositions(r1, r2, r3, r4, r5)
            java.lang.String r0 = r6.toString()
            char[] r0 = r0.toCharArray()
            int r10 = r0.length
            com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation[] r11 = new com.horcrux.svg.TextLayoutAlgorithm.CharacterInformation[r10]
            r12 = 0
            r1 = 0
        L_0x002b:
            if (r1 >= r10) goto L_0x0039
            com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation r2 = new com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation
            char r3 = r0[r1]
            r2.<init>(r1, r3)
            r11[r1] = r2
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0039:
            if (r10 != 0) goto L_0x003c
            return r11
        L_0x003c:
            android.graphics.PointF[] r13 = new android.graphics.PointF[r10]
            r0 = 0
        L_0x003f:
            r14 = 0
            if (r0 >= r10) goto L_0x004c
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r14, r14)
            r13[r0] = r1
            int r0 = r0 + 1
            goto L_0x003f
        L_0x004c:
            r0 = 0
        L_0x004d:
            r15 = 1
            if (r0 >= r10) goto L_0x0080
            r1 = r11[r0]
            r1.addressable = r15
            r1 = r11[r0]
            r1.middle = r12
            r1 = r11[r0]
            if (r0 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r15 = 0
        L_0x005e:
            r1.anchoredChunk = r15
            r1 = r11[r0]
            boolean r1 = r1.addressable
            if (r1 == 0) goto L_0x0072
            r1 = r11[r0]
            boolean r1 = r1.middle
            if (r1 != 0) goto L_0x0072
            r1 = r13[r0]
            r1.set(r14, r14)
            goto L_0x007d
        L_0x0072:
            if (r0 <= 0) goto L_0x007d
            r1 = r13[r0]
            int r2 = r0 + -1
            r2 = r13[r2]
            r1.set(r2)
        L_0x007d:
            int r0 = r0 + 1
            goto L_0x004d
        L_0x0080:
            java.lang.String[] r6 = new java.lang.String[r10]
            java.lang.String[] r5 = new java.lang.String[r10]
            java.lang.String[] r4 = new java.lang.String[r10]
            java.lang.String[] r3 = new java.lang.String[r10]
            com.horcrux.svg.TextLayoutAlgorithm$1CharacterPositioningResolver r0 = new com.horcrux.svg.TextLayoutAlgorithm$1CharacterPositioningResolver
            r1 = r26
            r2 = r11
            r16 = r3
            r3 = r6
            r17 = r4
            r4 = r5
            r18 = r5
            r5 = r17
            r17 = r6
            r6 = r16
            r0.<init>(r2, r3, r4, r5, r6)
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r14, r14)
            r1 = 0
        L_0x00a4:
            if (r1 >= r10) goto L_0x00ef
            r2 = r17[r1]
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            java.lang.String r4 = "0"
            if (r2 == 0) goto L_0x00b4
            r17[r1] = r4
        L_0x00b4:
            r2 = r18[r1]
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00be
            r18[r1] = r4
        L_0x00be:
            float r2 = r0.x
            r3 = r17[r1]
            float r3 = java.lang.Float.parseFloat(r3)
            float r2 = r2 + r3
            r0.x = r2
            float r2 = r0.y
            r3 = r18[r1]
            float r3 = java.lang.Float.parseFloat(r3)
            float r2 = r2 + r3
            r0.y = r2
            r2 = r11[r1]
            r3 = r13[r1]
            float r3 = r3.x
            float r4 = r0.x
            float r3 = r3 + r4
            double r3 = (double) r3
            r2.f2282x = r3
            r2 = r11[r1]
            r3 = r13[r1]
            float r3 = r3.y
            float r4 = r0.y
            float r3 = r3 + r4
            double r3 = (double) r3
            r2.f2283y = r3
            int r1 = r1 + 1
            goto L_0x00a4
        L_0x00ef:
            com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver r1 = new com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver
            r1.<init>(r11)
            r1.resolveTextLength(r8)
            r0.set(r14, r14)
            r1 = 1
        L_0x00fb:
            if (r1 >= r10) goto L_0x014e
            r2 = r17[r1]
            if (r2 == 0) goto L_0x010f
            r2 = r17[r1]
            double r2 = java.lang.Double.parseDouble(r2)
            r4 = r11[r1]
            double r4 = r4.f2282x
            double r2 = r2 - r4
            float r2 = (float) r2
            r0.x = r2
        L_0x010f:
            r2 = r18[r1]
            if (r2 == 0) goto L_0x0121
            r2 = r18[r1]
            double r2 = java.lang.Double.parseDouble(r2)
            r4 = r11[r1]
            double r4 = r4.f2283y
            double r2 = r2 - r4
            float r2 = (float) r2
            r0.y = r2
        L_0x0121:
            r2 = r11[r1]
            double r3 = r2.f2282x
            float r5 = r0.x
            double r5 = (double) r5
            double r3 = r3 + r5
            r2.f2282x = r3
            r2 = r11[r1]
            double r3 = r2.f2283y
            float r5 = r0.y
            double r5 = (double) r5
            double r3 = r3 + r5
            r2.f2283y = r3
            r2 = r11[r1]
            boolean r2 = r2.middle
            if (r2 == 0) goto L_0x0145
            r2 = r11[r1]
            boolean r2 = r2.anchoredChunk
            if (r2 == 0) goto L_0x0145
            r2 = r11[r1]
            r2.anchoredChunk = r12
        L_0x0145:
            int r1 = r1 + 1
            if (r1 >= r10) goto L_0x00fb
            r2 = r11[r1]
            r2.anchoredChunk = r15
            goto L_0x00fb
        L_0x014e:
            r4 = 0
            r5 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r8 = 0
            r16 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r18 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r20 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L_0x0158:
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r4 >= r10) goto L_0x01f9
            r1 = r11[r4]
            boolean r1 = r1.addressable
            if (r1 != 0) goto L_0x0164
            goto L_0x01f2
        L_0x0164:
            r1 = r11[r4]
            boolean r1 = r1.anchoredChunk
            if (r1 == 0) goto L_0x0171
            r18 = r5
            r5 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r12 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            goto L_0x0175
        L_0x0171:
            r12 = r16
            r16 = r20
        L_0x0175:
            r1 = r11[r4]
            double r0 = r1.f2282x
            r14 = r11[r4]
            double r2 = r14.advance
            double r2 = r2 + r0
            double r14 = java.lang.Math.min(r0, r2)
            double r5 = java.lang.Math.min(r5, r14)
            double r0 = java.lang.Math.max(r0, r2)
            double r0 = java.lang.Math.max(r12, r0)
            if (r4 <= 0) goto L_0x019d
            r2 = r11[r4]
            boolean r2 = r2.anchoredChunk
            if (r2 == 0) goto L_0x019d
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r12 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x01a3
            goto L_0x019f
        L_0x019d:
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
        L_0x019f:
            int r12 = r10 + -1
            if (r4 != r12) goto L_0x01ee
        L_0x01a3:
            com.horcrux.svg.TextAnchor r12 = com.horcrux.svg.TextAnchor.start
            com.horcrux.svg.Direction r13 = com.horcrux.svg.Direction.ltr
            int r14 = r10 + -1
            if (r4 != r14) goto L_0x01af
            r16 = r0
            r18 = r5
        L_0x01af:
            r15 = r11[r8]
            double r2 = r15.f2282x
            int[] r15 = com.horcrux.svg.TextLayoutAlgorithm.C26831.$SwitchMap$com$horcrux$svg$TextAnchor
            int r12 = r12.ordinal()
            r12 = r15[r12]
            r15 = 1
            if (r12 == r15) goto L_0x01d2
            r15 = 2
            if (r12 == r15) goto L_0x01ca
            r15 = 3
            if (r12 == r15) goto L_0x01c5
            goto L_0x01db
        L_0x01c5:
            com.horcrux.svg.Direction r12 = com.horcrux.svg.Direction.ltr
            if (r13 != r12) goto L_0x01d6
            goto L_0x01d9
        L_0x01ca:
            com.horcrux.svg.Direction r12 = com.horcrux.svg.Direction.ltr
            double r12 = r18 + r16
            double r12 = r12 / r22
            double r2 = r2 - r12
            goto L_0x01db
        L_0x01d2:
            com.horcrux.svg.Direction r12 = com.horcrux.svg.Direction.ltr
            if (r13 != r12) goto L_0x01d9
        L_0x01d6:
            double r2 = r2 - r18
            goto L_0x01db
        L_0x01d9:
            double r2 = r2 - r16
        L_0x01db:
            if (r4 != r14) goto L_0x01df
            r12 = r4
            goto L_0x01e1
        L_0x01df:
            int r12 = r4 + -1
        L_0x01e1:
            if (r8 > r12) goto L_0x01ed
            r13 = r11[r8]
            double r14 = r13.f2282x
            double r14 = r14 + r2
            r13.f2282x = r14
            int r8 = r8 + 1
            goto L_0x01e1
        L_0x01ed:
            r8 = r4
        L_0x01ee:
            r20 = r16
            r16 = r0
        L_0x01f2:
            int r4 = r4 + 1
            r12 = 0
            r14 = 0
            r15 = 1
            goto L_0x0158
        L_0x01f9:
            android.graphics.PointF r0 = new android.graphics.PointF
            r2 = 0
            r0.<init>(r2, r2)
            android.graphics.PathMeasure r2 = new android.graphics.PathMeasure
            r2.<init>()
            r4 = 0
            r5 = 0
            r6 = 0
            r15 = 0
        L_0x0208:
            if (r4 >= r10) goto L_0x03bb
            java.lang.Object r12 = r9.get(r4)
            com.horcrux.svg.TextPathShadowNode r12 = (com.horcrux.svg.TextPathShadowNode) r12
            if (r12 == 0) goto L_0x0356
            r13 = r11[r4]
            boolean r13 = r13.addressable
            if (r13 == 0) goto L_0x0356
            android.graphics.Path r5 = r12.getPath()
            r6 = r11[r4]
            boolean r6 = r6.middle
            if (r6 != 0) goto L_0x0330
            r12.getSide()
            com.horcrux.svg.TextPathSide r6 = com.horcrux.svg.TextPathSide.right
            r6 = 0
            r2.setPath(r5, r6)
            float r6 = r2.getLength()
            double r13 = (double) r6
            java.lang.String r6 = r12.getStartOffset()
            double r16 = java.lang.Double.parseDouble(r6)
            r6 = r11[r4]
            r18 = r2
            double r1 = r6.advance
            r6 = r11[r4]
            r19 = r5
            double r5 = r6.f2282x
            r3 = r11[r4]
            r24 = r9
            r25 = r10
            double r9 = r3.f2283y
            r3 = r11[r4]
            double r9 = r3.rotate
            double r1 = r1 / r22
            double r5 = r5 + r1
            double r5 = r5 + r16
            boolean r1 = r18.isClosed()
            r2 = 0
            if (r1 != 0) goto L_0x026a
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0265
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x026a
        L_0x0265:
            r1 = r11[r4]
            r9 = 1
            r1.hidden = r9
        L_0x026a:
            boolean r1 = r18.isClosed()
            if (r1 == 0) goto L_0x02e9
            com.horcrux.svg.TextAnchor r1 = com.horcrux.svg.TextAnchor.start
            com.horcrux.svg.Direction r9 = com.horcrux.svg.Direction.ltr
            r10 = r11[r8]
            double r2 = r10.f2282x
            int[] r2 = com.horcrux.svg.TextLayoutAlgorithm.C26831.$SwitchMap$com$horcrux$svg$TextAnchor
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x02c3
            r2 = 2
            if (r1 == r2) goto L_0x02af
            r2 = 3
            if (r1 == r2) goto L_0x028a
            goto L_0x02ea
        L_0x028a:
            com.horcrux.svg.Direction r1 = com.horcrux.svg.Direction.ltr
            if (r9 != r1) goto L_0x029f
            double r9 = -r13
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x0299
            r9 = 0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ea
        L_0x0299:
            r1 = r11[r4]
            r3 = 1
            r1.hidden = r3
            goto L_0x02eb
        L_0x029f:
            r3 = 1
            r9 = 0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x02aa
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x02eb
        L_0x02aa:
            r1 = r11[r4]
            r1.hidden = r3
            goto L_0x02eb
        L_0x02af:
            r2 = 3
            double r9 = -r13
            double r9 = r9 / r22
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x02bd
            double r9 = r13 / r22
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ea
        L_0x02bd:
            r1 = r11[r4]
            r3 = 1
            r1.hidden = r3
            goto L_0x02eb
        L_0x02c3:
            r2 = 3
            com.horcrux.svg.Direction r1 = com.horcrux.svg.Direction.ltr
            if (r9 != r1) goto L_0x02d8
            r9 = 0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x02d2
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ea
        L_0x02d2:
            r1 = r11[r4]
            r3 = 1
            r1.hidden = r3
            goto L_0x02eb
        L_0x02d8:
            r3 = 1
            double r9 = -r13
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x02e4
            r9 = 0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x02eb
        L_0x02e4:
            r1 = r11[r4]
            r1.hidden = r3
            goto L_0x02eb
        L_0x02e9:
            r2 = 3
        L_0x02ea:
            r3 = 1
        L_0x02eb:
            double r5 = r5 % r13
            r1 = r11[r4]
            boolean r1 = r1.hidden
            if (r1 != 0) goto L_0x032d
            r1 = 2
            float[] r9 = new float[r1]
            float[] r10 = new float[r1]
            float r1 = (float) r5
            r13 = r18
            r13.getPosTan(r1, r9, r10)
            r1 = r10[r3]
            double r5 = (double) r1
            r1 = 0
            r3 = r10[r1]
            double r9 = (double) r3
            double r5 = java.lang.Math.atan2(r5, r9)
            r9 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r5 = r5 * r9
            r9 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r9 = r9 + r5
            r3 = 2
            double[] r14 = new double[r3]
            double r16 = java.lang.Math.cos(r9)
            r14[r1] = r16
            double r9 = java.lang.Math.sin(r9)
            r1 = 1
            r14[r1] = r9
            r1 = r11[r4]
            double r9 = r1.rotate
            double r9 = r9 + r5
            r1.rotate = r9
            goto L_0x0352
        L_0x032d:
            r13 = r18
            goto L_0x0352
        L_0x0330:
            r13 = r2
            r19 = r5
            r24 = r9
            r25 = r10
            r2 = 3
            r1 = r11[r4]
            int r3 = r4 + -1
            r5 = r11[r3]
            double r5 = r5.f2282x
            r1.f2282x = r5
            r1 = r11[r4]
            r5 = r11[r3]
            double r5 = r5.f2283y
            r1.f2283y = r5
            r1 = r11[r4]
            r3 = r11[r3]
            double r5 = r3.rotate
            r1.rotate = r5
        L_0x0352:
            r5 = r19
            r6 = 1
            goto L_0x035c
        L_0x0356:
            r13 = r2
            r24 = r9
            r25 = r10
            r2 = 3
        L_0x035c:
            if (r12 != 0) goto L_0x03ac
            r1 = r11[r4]
            boolean r1 = r1.addressable
            if (r1 == 0) goto L_0x03ac
            r1 = 0
            if (r6 == 0) goto L_0x0380
            r13.setPath(r5, r1)
            r3 = 2
            float[] r6 = new float[r3]
            float r9 = r13.getLength()
            r10 = 0
            r13.getPosTan(r9, r6, r10)
            r9 = r6[r1]
            r12 = 1
            r6 = r6[r12]
            r0.set(r9, r6)
            r6 = 0
            r15 = 1
            goto L_0x0383
        L_0x0380:
            r3 = 2
            r10 = 0
            r12 = 1
        L_0x0383:
            if (r15 == 0) goto L_0x03a8
            r9 = r11[r4]
            boolean r9 = r9.anchoredChunk
            if (r9 == 0) goto L_0x0390
            r9 = r11
            r18 = r13
            r15 = 0
            goto L_0x03b0
        L_0x0390:
            r9 = r11[r4]
            double r1 = r9.f2282x
            float r14 = r0.x
            r18 = r13
            double r12 = (double) r14
            double r1 = r1 + r12
            r9.f2282x = r1
            r1 = r11[r4]
            double r12 = r1.f2283y
            float r2 = r0.y
            r9 = r11
            double r10 = (double) r2
            double r12 = r12 + r10
            r1.f2283y = r12
            goto L_0x03b0
        L_0x03a8:
            r9 = r11
            r18 = r13
            goto L_0x03b0
        L_0x03ac:
            r9 = r11
            r18 = r13
            r3 = 2
        L_0x03b0:
            int r4 = r4 + 1
            r11 = r9
            r2 = r18
            r9 = r24
            r10 = r25
            goto L_0x0208
        L_0x03bb:
            r9 = r11
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TextLayoutAlgorithm.layoutText(com.horcrux.svg.TextLayoutAlgorithm$LayoutInput):com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation[]");
    }

    /* renamed from: com.horcrux.svg.TextLayoutAlgorithm$1 */
    static /* synthetic */ class C26831 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextAnchor = new int[TextAnchor.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.horcrux.svg.TextAnchor[] r0 = com.horcrux.svg.TextAnchor.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$horcrux$svg$TextAnchor = r0
                int[] r0 = $SwitchMap$com$horcrux$svg$TextAnchor     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.horcrux.svg.TextAnchor r1 = com.horcrux.svg.TextAnchor.start     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$horcrux$svg$TextAnchor     // Catch:{ NoSuchFieldError -> 0x001f }
                com.horcrux.svg.TextAnchor r1 = com.horcrux.svg.TextAnchor.middle     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$horcrux$svg$TextAnchor     // Catch:{ NoSuchFieldError -> 0x002a }
                com.horcrux.svg.TextAnchor r1 = com.horcrux.svg.TextAnchor.end     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TextLayoutAlgorithm.C26831.<clinit>():void");
        }
    }
}
