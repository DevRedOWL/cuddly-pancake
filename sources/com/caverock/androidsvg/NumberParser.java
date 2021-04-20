package com.caverock.androidsvg;

class NumberParser {
    private static final float[] negativePowersOf10 = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    private static final float[] positivePowersOf10 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    private int pos;

    NumberParser() {
    }

    /* access modifiers changed from: package-private */
    public int getEndPos() {
        return this.pos;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x008d A[EDGE_INSN: B:108:0x008d->B:39:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float parseNumber(java.lang.String r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r0.pos = r2
            int r2 = r0.pos
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r2 < r3) goto L_0x0011
            return r4
        L_0x0011:
            char r2 = r1.charAt(r2)
            r5 = 45
            r6 = 43
            r8 = 1
            if (r2 == r6) goto L_0x0022
            if (r2 == r5) goto L_0x0020
            r2 = 0
            goto L_0x0028
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            int r9 = r0.pos
            int r9 = r9 + r8
            r0.pos = r9
        L_0x0028:
            int r9 = r0.pos
            r10 = 0
            r17 = r10
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0034:
            int r7 = r0.pos
            r5 = 57
            r6 = 48
            r19 = 922337203685477580(0xccccccccccccccc, double:5.1488004017107686E-247)
            if (r7 >= r3) goto L_0x008d
            char r7 = r1.charAt(r7)
            if (r7 != r6) goto L_0x004f
            if (r12 != 0) goto L_0x004c
            int r14 = r14 + 1
            goto L_0x0083
        L_0x004c:
            int r13 = r13 + 1
            goto L_0x0083
        L_0x004f:
            r6 = 49
            if (r7 < r6) goto L_0x0076
            if (r7 > r5) goto L_0x0076
            int r12 = r12 + r13
        L_0x0056:
            r5 = 10
            if (r13 <= 0) goto L_0x0064
            int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x005f
            return r4
        L_0x005f:
            long r17 = r17 * r5
            int r13 = r13 + -1
            goto L_0x0056
        L_0x0064:
            int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x0069
            return r4
        L_0x0069:
            long r17 = r17 * r5
            int r7 = r7 + -48
            long r5 = (long) r7
            long r17 = r17 + r5
            int r12 = r12 + r8
            int r5 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0083
            return r4
        L_0x0076:
            r6 = 46
            if (r7 != r6) goto L_0x008d
            if (r15 == 0) goto L_0x007d
            goto L_0x008d
        L_0x007d:
            int r5 = r0.pos
            int r5 = r5 - r9
            r16 = r5
            r15 = 1
        L_0x0083:
            int r5 = r0.pos
            int r5 = r5 + r8
            r0.pos = r5
            r5 = 45
            r6 = 43
            goto L_0x0034
        L_0x008d:
            if (r15 == 0) goto L_0x0096
            int r6 = r0.pos
            int r7 = r16 + 1
            if (r6 != r7) goto L_0x0096
            return r4
        L_0x0096:
            if (r12 != 0) goto L_0x009c
            if (r14 != 0) goto L_0x009b
            return r4
        L_0x009b:
            r12 = 1
        L_0x009c:
            if (r15 == 0) goto L_0x00a2
            int r16 = r16 - r14
            int r13 = r16 - r12
        L_0x00a2:
            int r6 = r0.pos
            if (r6 >= r3) goto L_0x010e
            char r6 = r1.charAt(r6)
            r7 = 69
            if (r6 == r7) goto L_0x00b2
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L_0x010e
        L_0x00b2:
            int r6 = r0.pos
            int r6 = r6 + r8
            r0.pos = r6
            int r6 = r0.pos
            if (r6 != r3) goto L_0x00bc
            return r4
        L_0x00bc:
            char r6 = r1.charAt(r6)
            r7 = 43
            if (r6 == r7) goto L_0x00d7
            r7 = 45
            if (r6 == r7) goto L_0x00d5
            switch(r6) {
                case 48: goto L_0x00d3;
                case 49: goto L_0x00d3;
                case 50: goto L_0x00d3;
                case 51: goto L_0x00d3;
                case 52: goto L_0x00d3;
                case 53: goto L_0x00d3;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00d3;
                case 56: goto L_0x00d3;
                case 57: goto L_0x00d3;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            int r6 = r0.pos
            int r6 = r6 - r8
            r0.pos = r6
            r6 = 1
        L_0x00d1:
            r7 = 0
            goto L_0x00de
        L_0x00d3:
            r6 = 0
            goto L_0x00d1
        L_0x00d5:
            r7 = 1
            goto L_0x00d8
        L_0x00d7:
            r7 = 0
        L_0x00d8:
            int r6 = r0.pos
            int r6 = r6 + r8
            r0.pos = r6
            r6 = 0
        L_0x00de:
            if (r6 != 0) goto L_0x010e
            int r6 = r0.pos
            r9 = 0
        L_0x00e3:
            int r14 = r0.pos
            if (r14 >= r3) goto L_0x0104
            char r14 = r1.charAt(r14)
            r15 = 48
            if (r14 < r15) goto L_0x0104
            if (r14 > r5) goto L_0x0104
            long r10 = (long) r9
            int r16 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r16 <= 0) goto L_0x00f7
            return r4
        L_0x00f7:
            int r9 = r9 * 10
            int r14 = r14 + -48
            int r9 = r9 + r14
            int r10 = r0.pos
            int r10 = r10 + r8
            r0.pos = r10
            r10 = 0
            goto L_0x00e3
        L_0x0104:
            int r1 = r0.pos
            if (r1 != r6) goto L_0x0109
            return r4
        L_0x0109:
            if (r7 == 0) goto L_0x010d
            int r13 = r13 - r9
            goto L_0x010e
        L_0x010d:
            int r13 = r13 + r9
        L_0x010e:
            int r12 = r12 + r13
            r1 = 39
            if (r12 > r1) goto L_0x0145
            r1 = -44
            if (r12 >= r1) goto L_0x0118
            goto L_0x0145
        L_0x0118:
            r10 = r17
            float r1 = (float) r10
            r3 = 0
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0141
            if (r13 <= 0) goto L_0x012a
            float[] r3 = positivePowersOf10
            r3 = r3[r13]
        L_0x0127:
            float r1 = r1 * r3
            goto L_0x0141
        L_0x012a:
            if (r13 >= 0) goto L_0x0141
            r3 = -38
            if (r13 >= r3) goto L_0x013b
            double r3 = (double) r1
            r5 = 4307583784117748259(0x3bc79ca10c924223, double:1.0E-20)
            double r3 = r3 * r5
            float r1 = (float) r3
            int r13 = r13 + 20
        L_0x013b:
            float[] r3 = negativePowersOf10
            int r4 = -r13
            r3 = r3[r4]
            goto L_0x0127
        L_0x0141:
            if (r2 == 0) goto L_0x0144
            float r1 = -r1
        L_0x0144:
            return r1
        L_0x0145:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.NumberParser.parseNumber(java.lang.String, int, int):float");
    }
}
