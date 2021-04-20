package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

public abstract class TimeCycleSplineSet {
    private static final int CURVE_OFFSET = 2;
    private static final int CURVE_PERIOD = 1;
    private static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    private static float VAL_2PI = 6.2831855f;
    private int count;
    float last_cycle = Float.NaN;
    long last_time;
    private float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected CurveFit mCurveFit;
    protected int[] mTimePoints = new int[10];
    private String mType;
    protected float[][] mValues = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));
    protected int mWaveShape = 0;

    public abstract boolean setProperty(View view, float f, long j, KeyCache keyCache);

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.count; i++) {
            str = str + "[" + this.mTimePoints[i] + " , " + decimalFormat.format(this.mValues[i]) + "] ";
        }
        return str;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public float get(float f, long j, View view, KeyCache keyCache) {
        long j2 = j;
        View view2 = view;
        KeyCache keyCache2 = keyCache;
        this.mCurveFit.getPos((double) f, this.mCache);
        float[] fArr = this.mCache;
        float f2 = fArr[1];
        boolean z = false;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            this.last_cycle = keyCache2.getFloatValue(view2, this.mType, 0);
            if (Float.isNaN(this.last_cycle)) {
                this.last_cycle = 0.0f;
            }
        }
        this.last_cycle = (float) ((((double) this.last_cycle) + ((((double) (j2 - this.last_time)) * 1.0E-9d) * ((double) f2))) % 1.0d);
        keyCache2.setFloatValue(view2, this.mType, 0, this.last_cycle);
        this.last_time = j2;
        float f3 = this.mCache[0];
        float calcWave = (calcWave(this.last_cycle) * f3) + this.mCache[2];
        if (!(f3 == 0.0f && i == 0)) {
            z = true;
        }
        this.mContinue = z;
        return calcWave;
    }

    /* access modifiers changed from: protected */
    public float calcWave(float f) {
        float abs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f * VAL_2PI);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * VAL_2PI));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * VAL_2PI));
        }
        return 1.0f - abs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    static TimeCycleSplineSet makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.TimeCycleSplineSet makeSpline(java.lang.String r1, long r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0086;
                case -1249320805: goto L_0x007b;
                case -1225497657: goto L_0x006f;
                case -1225497656: goto L_0x0063;
                case -1225497655: goto L_0x0057;
                case -1001078227: goto L_0x004b;
                case -908189618: goto L_0x0040;
                case -908189617: goto L_0x0035;
                case -40300674: goto L_0x002a;
                case -4379043: goto L_0x0020;
                case 37232917: goto L_0x0014;
                case 92909918: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0091
        L_0x0009:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 0
            goto L_0x0092
        L_0x0014:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 5
            goto L_0x0092
        L_0x0020:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 1
            goto L_0x0092
        L_0x002a:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 2
            goto L_0x0092
        L_0x0035:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 7
            goto L_0x0092
        L_0x0040:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 6
            goto L_0x0092
        L_0x004b:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 11
            goto L_0x0092
        L_0x0057:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 10
            goto L_0x0092
        L_0x0063:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 9
            goto L_0x0092
        L_0x006f:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 8
            goto L_0x0092
        L_0x007b:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 4
            goto L_0x0092
        L_0x0086:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 3
            goto L_0x0092
        L_0x0091:
            r1 = -1
        L_0x0092:
            switch(r1) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00d3;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00af;
                case 8: goto L_0x00a9;
                case 9: goto L_0x00a3;
                case 10: goto L_0x009d;
                case 11: goto L_0x0097;
                default: goto L_0x0095;
            }
        L_0x0095:
            r1 = 0
            return r1
        L_0x0097:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ProgressSet r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ProgressSet
            r1.<init>()
            goto L_0x00de
        L_0x009d:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationZset r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationZset
            r1.<init>()
            goto L_0x00de
        L_0x00a3:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationYset r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationYset
            r1.<init>()
            goto L_0x00de
        L_0x00a9:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationXset r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationXset
            r1.<init>()
            goto L_0x00de
        L_0x00af:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ScaleYset r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ScaleYset
            r1.<init>()
            goto L_0x00de
        L_0x00b5:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ScaleXset r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ScaleXset
            r1.<init>()
            goto L_0x00de
        L_0x00bb:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$PathRotate r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$PathRotate
            r1.<init>()
            goto L_0x00de
        L_0x00c1:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationYset r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationYset
            r1.<init>()
            goto L_0x00de
        L_0x00c7:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationXset r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationXset
            r1.<init>()
            goto L_0x00de
        L_0x00cd:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationSet r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationSet
            r1.<init>()
            goto L_0x00de
        L_0x00d3:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ElevationSet r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ElevationSet
            r1.<init>()
            goto L_0x00de
        L_0x00d9:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$AlphaSet r1 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$AlphaSet
            r1.<init>()
        L_0x00de:
            r1.setStartTime(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.TimeCycleSplineSet.makeSpline(java.lang.String, long):androidx.constraintlayout.motion.widget.TimeCycleSplineSet");
    }

    /* access modifiers changed from: protected */
    public void setStartTime(long j) {
        this.last_time = j;
    }

    public void setPoint(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.mTimePoints;
        int i3 = this.count;
        iArr[i3] = i;
        float[][] fArr = this.mValues;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.mWaveShape = Math.max(this.mWaveShape, i2);
        this.count++;
    }

    public void setup(int i) {
        int i2 = this.count;
        if (i2 == 0) {
            Log.e(TAG, "Error no points added to " + this.mType);
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{i4, 3});
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[][] fArr = this.mValues;
            dArr3[0] = (double) fArr[i6][0];
            dArr2[i5][1] = (double) fArr[i6][1];
            dArr2[i5][2] = (double) fArr[i6][2];
            i5++;
        }
        this.mCurveFit = CurveFit.get(i, dArr, dArr2);
    }

    static class ElevationSet extends TimeCycleSplineSet {
        ElevationSet() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(get(f, j, view, keyCache));
            }
            return this.mContinue;
        }
    }

    static class AlphaSet extends TimeCycleSplineSet {
        AlphaSet() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setAlpha(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class RotationSet extends TimeCycleSplineSet {
        RotationSet() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setRotation(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class RotationXset extends TimeCycleSplineSet {
        RotationXset() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setRotationX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class RotationYset extends TimeCycleSplineSet {
        RotationYset() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setRotationY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class PathRotate extends TimeCycleSplineSet {
        PathRotate() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            return this.mContinue;
        }

        public boolean setPathRotate(View view, KeyCache keyCache, float f, long j, double d, double d2) {
            view.setRotation(get(f, j, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.mContinue;
        }
    }

    static class ScaleXset extends TimeCycleSplineSet {
        ScaleXset() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setScaleX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class ScaleYset extends TimeCycleSplineSet {
        ScaleYset() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setScaleY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationXset extends TimeCycleSplineSet {
        TranslationXset() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setTranslationX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationYset extends TimeCycleSplineSet {
        TranslationYset() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setTranslationY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationZset extends TimeCycleSplineSet {
        TranslationZset() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(get(f, j, view, keyCache));
            }
            return this.mContinue;
        }
    }

    static class CustomSet extends TimeCycleSplineSet {
        String mAttributeName;
        float[] mCache;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int noOfInterpValues = this.mConstraintAttributeList.valueAt(0).noOfInterpValues();
            double[] dArr = new double[size];
            int i2 = noOfInterpValues + 2;
            this.mTempValues = new float[i2];
            this.mCache = new float[noOfInterpValues];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, i2});
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i3);
                float[] valueAt = this.mWaveProperties.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.mConstraintAttributeList.valueAt(i3).getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][noOfInterpValues] = (double) valueAt[0];
                dArr2[i3][noOfInterpValues + 1] = (double) valueAt[1];
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.mConstraintAttributeList.append(i, constraintAttribute);
            this.mWaveProperties.append(i, new float[]{f, f2});
            this.mWaveShape = Math.max(this.mWaveShape, i2);
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            View view2 = view;
            long j2 = j;
            this.mCurveFit.getPos((double) f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                this.last_cycle = keyCache.getFloatValue(view2, this.mAttributeName, 0);
                if (Float.isNaN(this.last_cycle)) {
                    this.last_cycle = 0.0f;
                }
            }
            this.last_cycle = (float) ((((double) this.last_cycle) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.last_time = j2;
            float calcWave = calcWave(this.last_cycle);
            this.mContinue = false;
            for (int i = 0; i < this.mCache.length; i++) {
                this.mContinue |= ((double) this.mTempValues[i]) != Utils.DOUBLE_EPSILON;
                this.mCache[i] = (this.mTempValues[i] * calcWave) + f3;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(view2, this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }

    static class ProgressSet extends TimeCycleSplineSet {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            View view2 = view;
            if (view2 instanceof MotionLayout) {
                ((MotionLayout) view2).setProgress(get(f, j, view, keyCache));
            } else if (this.mNoMethod) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, new Object[]{Float.valueOf(get(f, j, view, keyCache))});
                    } catch (IllegalAccessException e) {
                        Log.e(TimeCycleSplineSet.TAG, "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e(TimeCycleSplineSet.TAG, "unable to setProgress", e2);
                    }
                }
            }
            return this.mContinue;
        }
    }

    private static class Sort {
        private Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int partition = partition(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = partition - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = partition + 1;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }
}
