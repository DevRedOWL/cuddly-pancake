package com.jjoe64.graphview;

import java.text.NumberFormat;

public class DefaultLabelFormatter implements LabelFormatter {
    protected NumberFormat[] mNumberFormatter = new NumberFormat[2];
    protected Viewport mViewport;

    public DefaultLabelFormatter() {
    }

    public DefaultLabelFormatter(NumberFormat numberFormat, NumberFormat numberFormat2) {
        NumberFormat[] numberFormatArr = this.mNumberFormatter;
        numberFormatArr[0] = numberFormat2;
        numberFormatArr[1] = numberFormat;
    }

    public void setViewport(Viewport viewport) {
        this.mViewport = viewport;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String formatLabel(double r7, boolean r9) {
        /*
            r6 = this;
            java.text.NumberFormat[] r0 = r6.mNumberFormatter
            r1 = r0[r9]
            if (r1 != 0) goto L_0x006e
            java.text.NumberFormat r1 = java.text.NumberFormat.getNumberInstance()
            r0[r9] = r1
            r0 = 0
            com.jjoe64.graphview.Viewport r1 = r6.mViewport
            if (r9 == 0) goto L_0x0016
            double r1 = r1.getMaxX(r0)
            goto L_0x001a
        L_0x0016:
            double r1 = r1.getMaxY(r0)
        L_0x001a:
            com.jjoe64.graphview.Viewport r3 = r6.mViewport
            if (r9 == 0) goto L_0x0023
            double r3 = r3.getMinX(r0)
            goto L_0x0027
        L_0x0023:
            double r3 = r3.getMinY(r0)
        L_0x0027:
            double r1 = r1 - r3
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x003a
            java.text.NumberFormat[] r0 = r6.mNumberFormatter
            r0 = r0[r9]
            r1 = 6
            r0.setMaximumFractionDigits(r1)
            goto L_0x006e
        L_0x003a:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0049
            java.text.NumberFormat[] r0 = r6.mNumberFormatter
            r0 = r0[r9]
            r1 = 4
            r0.setMaximumFractionDigits(r1)
            goto L_0x006e
        L_0x0049:
            r3 = 4626322717216342016(0x4034000000000000, double:20.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0058
            java.text.NumberFormat[] r0 = r6.mNumberFormatter
            r0 = r0[r9]
            r1 = 3
            r0.setMaximumFractionDigits(r1)
            goto L_0x006e
        L_0x0058:
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0067
            java.text.NumberFormat[] r0 = r6.mNumberFormatter
            r0 = r0[r9]
            r1 = 1
            r0.setMaximumFractionDigits(r1)
            goto L_0x006e
        L_0x0067:
            java.text.NumberFormat[] r1 = r6.mNumberFormatter
            r1 = r1[r9]
            r1.setMaximumFractionDigits(r0)
        L_0x006e:
            java.text.NumberFormat[] r0 = r6.mNumberFormatter
            r9 = r0[r9]
            java.lang.String r7 = r9.format(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.DefaultLabelFormatter.formatLabel(double, boolean):java.lang.String");
    }
}
