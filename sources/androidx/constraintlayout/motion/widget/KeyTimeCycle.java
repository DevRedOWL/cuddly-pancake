package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0185R;
import java.util.HashMap;
import java.util.HashSet;

public class KeyTimeCycle extends Key {
    public static final int KEY_TYPE = 3;
    static final String NAME = "KeyTimeCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final String TAG = "KeyTimeCycle";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_SHAPE = "waveShape";
    /* access modifiers changed from: private */
    public float mAlpha = Float.NaN;
    /* access modifiers changed from: private */
    public int mCurveFit = -1;
    /* access modifiers changed from: private */
    public String mCustomWaveShpe = null;
    /* access modifiers changed from: private */
    public float mElevation = Float.NaN;
    /* access modifiers changed from: private */
    public float mProgress = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotation = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotationX = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotationY = Float.NaN;
    /* access modifiers changed from: private */
    public float mScaleX = Float.NaN;
    /* access modifiers changed from: private */
    public float mScaleY = Float.NaN;
    /* access modifiers changed from: private */
    public String mTransitionEasing;
    /* access modifiers changed from: private */
    public float mTransitionPathRotate = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationX = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationY = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationZ = Float.NaN;
    /* access modifiers changed from: private */
    public float mWaveOffset = 0.0f;
    /* access modifiers changed from: private */
    public float mWavePeriod = Float.NaN;
    /* access modifiers changed from: private */
    public int mWaveShape = 0;

    public KeyTimeCycle() {
        this.mType = 3;
        this.mCustomConstraints = new HashMap();
    }

    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, C0185R.styleable.KeyTimeCycle));
    }

    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add(Key.ALPHA);
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add(Key.ROTATION_X);
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add(Key.ROTATION_Y);
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add(Key.TRANSLATION_X);
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add(Key.TRANSLATION_Y);
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add(Key.TRANSLATION_Z);
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add(Key.TRANSITION_PATH_ROTATE);
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mProgress)) {
            hashSet.add("progress");
        }
        if (this.mCustomConstraints.size() > 0) {
            for (String str : this.mCustomConstraints.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void setInterpolation(HashMap<String, Integer> hashMap) {
        if (this.mCurveFit != -1) {
            if (!Float.isNaN(this.mAlpha)) {
                hashMap.put(Key.ALPHA, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mElevation)) {
                hashMap.put("elevation", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotation)) {
                hashMap.put("rotation", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationX)) {
                hashMap.put(Key.ROTATION_X, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationY)) {
                hashMap.put(Key.ROTATION_Y, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationX)) {
                hashMap.put(Key.TRANSLATION_X, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationY)) {
                hashMap.put(Key.TRANSLATION_Y, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationZ)) {
                hashMap.put(Key.TRANSLATION_Z, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTransitionPathRotate)) {
                hashMap.put(Key.TRANSITION_PATH_ROTATE, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleX)) {
                hashMap.put("scaleX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleX)) {
                hashMap.put("scaleY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mProgress)) {
                hashMap.put("progress", Integer.valueOf(this.mCurveFit));
            }
            if (this.mCustomConstraints.size() > 0) {
                for (String str : this.mCustomConstraints.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.mCurveFit));
                }
            }
        }
    }

    public void addValues(HashMap<String, SplineSet> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0208
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r3 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap r2 = r10.mCustomConstraints
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$CustomSet r4 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet.CustomSet) r4
            int r5 = r10.mFramePosition
            float r7 = r10.mWavePeriod
            int r8 = r10.mWaveShape
            float r9 = r10.mWaveOffset
            r4.setPoint((int) r5, (androidx.constraintlayout.widget.ConstraintAttribute) r6, (float) r7, (int) r8, (float) r9)
            goto L_0x0008
        L_0x0042:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00c8;
                case -1249320805: goto L_0x00bd;
                case -1225497657: goto L_0x00b1;
                case -1225497656: goto L_0x00a5;
                case -1225497655: goto L_0x0099;
                case -1001078227: goto L_0x008d;
                case -908189618: goto L_0x0082;
                case -908189617: goto L_0x0078;
                case -40300674: goto L_0x006d;
                case -4379043: goto L_0x0063;
                case 37232917: goto L_0x0057;
                case 92909918: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x00d3
        L_0x004c:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 0
            goto L_0x00d4
        L_0x0057:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 5
            goto L_0x00d4
        L_0x0063:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 1
            goto L_0x00d4
        L_0x006d:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 2
            goto L_0x00d4
        L_0x0078:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x0082:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 6
            goto L_0x00d4
        L_0x008d:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 11
            goto L_0x00d4
        L_0x0099:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 10
            goto L_0x00d4
        L_0x00a5:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 9
            goto L_0x00d4
        L_0x00b1:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 8
            goto L_0x00d4
        L_0x00bd:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 4
            goto L_0x00d4
        L_0x00c8:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00d3
            r4 = 3
            goto L_0x00d4
        L_0x00d3:
            r4 = -1
        L_0x00d4:
            switch(r4) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01da;
                case 2: goto L_0x01c3;
                case 3: goto L_0x01ac;
                case 4: goto L_0x0195;
                case 5: goto L_0x017e;
                case 6: goto L_0x0167;
                case 7: goto L_0x0150;
                case 8: goto L_0x0139;
                case 9: goto L_0x0122;
                case 10: goto L_0x010b;
                case 11: goto L_0x00f4;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00f4:
            float r1 = r10.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mProgress
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x010b:
            float r1 = r10.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationZ
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0122:
            float r1 = r10.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0139:
            float r1 = r10.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0150:
            float r1 = r10.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0167:
            float r1 = r10.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x017e:
            float r1 = r10.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mTransitionPathRotate
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0195:
            float r1 = r10.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01ac:
            float r1 = r10.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01c3:
            float r1 = r10.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mRotation
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01da:
            float r1 = r10.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mElevation
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01f1:
            float r1 = r10.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mAlpha
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTimeCycle.addTimeValues(java.util.HashMap):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setValue(java.lang.String r3, java.lang.Object r4) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 7
            switch(r0) {
                case -1913008125: goto L_0x00c7;
                case -1812823328: goto L_0x00bb;
                case -1249320806: goto L_0x00b0;
                case -1249320805: goto L_0x00a5;
                case -1225497657: goto L_0x0099;
                case -1225497656: goto L_0x008d;
                case -1225497655: goto L_0x0081;
                case -908189618: goto L_0x0076;
                case -908189617: goto L_0x006a;
                case -40300674: goto L_0x005f;
                case -4379043: goto L_0x0054;
                case 37232917: goto L_0x0047;
                case 92909918: goto L_0x003c;
                case 156108012: goto L_0x002f;
                case 184161818: goto L_0x0022;
                case 579057826: goto L_0x0017;
                case 1532805160: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x00d1
        L_0x000a:
            java.lang.String r0 = "waveShape"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 16
            goto L_0x00d2
        L_0x0017:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 1
            goto L_0x00d2
        L_0x0022:
            java.lang.String r0 = "wavePeriod"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 14
            goto L_0x00d2
        L_0x002f:
            java.lang.String r0 = "waveOffset"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 15
            goto L_0x00d2
        L_0x003c:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 0
            goto L_0x00d2
        L_0x0047:
            java.lang.String r0 = "transitionPathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 10
            goto L_0x00d2
        L_0x0054:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 2
            goto L_0x00d2
        L_0x005f:
            java.lang.String r0 = "rotation"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 4
            goto L_0x00d2
        L_0x006a:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 8
            goto L_0x00d2
        L_0x0076:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 7
            goto L_0x00d2
        L_0x0081:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 13
            goto L_0x00d2
        L_0x008d:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 12
            goto L_0x00d2
        L_0x0099:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 11
            goto L_0x00d2
        L_0x00a5:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 6
            goto L_0x00d2
        L_0x00b0:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 5
            goto L_0x00d2
        L_0x00bb:
            java.lang.String r0 = "transitionEasing"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 9
            goto L_0x00d2
        L_0x00c7:
            java.lang.String r0 = "motionProgress"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00d1
            r3 = 3
            goto L_0x00d2
        L_0x00d1:
            r3 = -1
        L_0x00d2:
            switch(r3) {
                case 0: goto L_0x0157;
                case 1: goto L_0x0150;
                case 2: goto L_0x0149;
                case 3: goto L_0x0142;
                case 4: goto L_0x013b;
                case 5: goto L_0x0134;
                case 6: goto L_0x012d;
                case 7: goto L_0x0126;
                case 8: goto L_0x011f;
                case 9: goto L_0x0118;
                case 10: goto L_0x0111;
                case 11: goto L_0x010a;
                case 12: goto L_0x0103;
                case 13: goto L_0x00fc;
                case 14: goto L_0x00f5;
                case 15: goto L_0x00ed;
                case 16: goto L_0x00d7;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x015d
        L_0x00d7:
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x00e3
            int r3 = r2.toInt(r4)
            r2.mWaveShape = r3
            goto L_0x015d
        L_0x00e3:
            r2.mWaveShape = r1
            java.lang.String r3 = r4.toString()
            r2.mCustomWaveShpe = r3
            goto L_0x015d
        L_0x00ed:
            float r3 = r2.toFloat(r4)
            r2.mWaveOffset = r3
            goto L_0x015d
        L_0x00f5:
            float r3 = r2.toFloat(r4)
            r2.mWavePeriod = r3
            goto L_0x015d
        L_0x00fc:
            float r3 = r2.toFloat(r4)
            r2.mTranslationZ = r3
            goto L_0x015d
        L_0x0103:
            float r3 = r2.toFloat(r4)
            r2.mTranslationY = r3
            goto L_0x015d
        L_0x010a:
            float r3 = r2.toFloat(r4)
            r2.mTranslationX = r3
            goto L_0x015d
        L_0x0111:
            float r3 = r2.toFloat(r4)
            r2.mTransitionPathRotate = r3
            goto L_0x015d
        L_0x0118:
            java.lang.String r3 = r4.toString()
            r2.mTransitionEasing = r3
            goto L_0x015d
        L_0x011f:
            float r3 = r2.toFloat(r4)
            r2.mScaleY = r3
            goto L_0x015d
        L_0x0126:
            float r3 = r2.toFloat(r4)
            r2.mScaleX = r3
            goto L_0x015d
        L_0x012d:
            float r3 = r2.toFloat(r4)
            r2.mRotationY = r3
            goto L_0x015d
        L_0x0134:
            float r3 = r2.toFloat(r4)
            r2.mRotationX = r3
            goto L_0x015d
        L_0x013b:
            float r3 = r2.toFloat(r4)
            r2.mRotation = r3
            goto L_0x015d
        L_0x0142:
            float r3 = r2.toFloat(r4)
            r2.mProgress = r3
            goto L_0x015d
        L_0x0149:
            float r3 = r2.toFloat(r4)
            r2.mElevation = r3
            goto L_0x015d
        L_0x0150:
            int r3 = r2.toInt(r4)
            r2.mCurveFit = r3
            goto L_0x015d
        L_0x0157:
            float r3 = r2.toFloat(r4)
            r2.mAlpha = r3
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTimeCycle.setValue(java.lang.String, java.lang.Object):void");
    }

    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static SparseIntArray mAttrMap = new SparseIntArray();

        private Loader() {
        }

        static {
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_alpha, 1);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_elevation, 2);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_rotation, 4);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_rotationX, 5);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_rotationY, 6);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_scaleX, 7);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_transitionEasing, 9);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_motionTarget, 10);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_framePosition, 12);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_curveFit, 13);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_scaleY, 14);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_translationX, 15);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_translationY, 16);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_android_translationZ, 17);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_motionProgress, 18);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_wavePeriod, 20);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_waveOffset, 21);
            mAttrMap.append(C0185R.styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void read(KeyTimeCycle keyTimeCycle, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        float unused = keyTimeCycle.mAlpha = typedArray.getFloat(index, keyTimeCycle.mAlpha);
                        break;
                    case 2:
                        float unused2 = keyTimeCycle.mElevation = typedArray.getDimension(index, keyTimeCycle.mElevation);
                        break;
                    case 4:
                        float unused3 = keyTimeCycle.mRotation = typedArray.getFloat(index, keyTimeCycle.mRotation);
                        break;
                    case 5:
                        float unused4 = keyTimeCycle.mRotationX = typedArray.getFloat(index, keyTimeCycle.mRotationX);
                        break;
                    case 6:
                        float unused5 = keyTimeCycle.mRotationY = typedArray.getFloat(index, keyTimeCycle.mRotationY);
                        break;
                    case 7:
                        float unused6 = keyTimeCycle.mScaleX = typedArray.getFloat(index, keyTimeCycle.mScaleX);
                        break;
                    case 8:
                        float unused7 = keyTimeCycle.mTransitionPathRotate = typedArray.getFloat(index, keyTimeCycle.mTransitionPathRotate);
                        break;
                    case 9:
                        String unused8 = keyTimeCycle.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type != 3) {
                                keyTimeCycle.mTargetId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                                break;
                            } else {
                                keyTimeCycle.mTargetString = typedArray.getString(index);
                                break;
                            }
                        } else {
                            keyTimeCycle.mTargetId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                            if (keyTimeCycle.mTargetId != -1) {
                                break;
                            } else {
                                keyTimeCycle.mTargetString = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        keyTimeCycle.mFramePosition = typedArray.getInt(index, keyTimeCycle.mFramePosition);
                        break;
                    case 13:
                        int unused9 = keyTimeCycle.mCurveFit = typedArray.getInteger(index, keyTimeCycle.mCurveFit);
                        break;
                    case 14:
                        float unused10 = keyTimeCycle.mScaleY = typedArray.getFloat(index, keyTimeCycle.mScaleY);
                        break;
                    case 15:
                        float unused11 = keyTimeCycle.mTranslationX = typedArray.getDimension(index, keyTimeCycle.mTranslationX);
                        break;
                    case 16:
                        float unused12 = keyTimeCycle.mTranslationY = typedArray.getDimension(index, keyTimeCycle.mTranslationY);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = keyTimeCycle.mTranslationZ = typedArray.getDimension(index, keyTimeCycle.mTranslationZ);
                            break;
                        }
                    case 18:
                        float unused14 = keyTimeCycle.mProgress = typedArray.getFloat(index, keyTimeCycle.mProgress);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused15 = keyTimeCycle.mWaveShape = typedArray.getInt(index, keyTimeCycle.mWaveShape);
                            break;
                        } else {
                            String unused16 = keyTimeCycle.mCustomWaveShpe = typedArray.getString(index);
                            int unused17 = keyTimeCycle.mWaveShape = 7;
                            break;
                        }
                    case 20:
                        float unused18 = keyTimeCycle.mWavePeriod = typedArray.getFloat(index, keyTimeCycle.mWavePeriod);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused19 = keyTimeCycle.mWaveOffset = typedArray.getFloat(index, keyTimeCycle.mWaveOffset);
                            break;
                        } else {
                            float unused20 = keyTimeCycle.mWaveOffset = typedArray.getDimension(index, keyTimeCycle.mWaveOffset);
                            break;
                        }
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                }
            }
        }
    }

    public Key copy(Key key) {
        super.copy(key);
        KeyTimeCycle keyTimeCycle = (KeyTimeCycle) key;
        this.mTransitionEasing = keyTimeCycle.mTransitionEasing;
        this.mCurveFit = keyTimeCycle.mCurveFit;
        this.mWaveShape = keyTimeCycle.mWaveShape;
        this.mWavePeriod = keyTimeCycle.mWavePeriod;
        this.mWaveOffset = keyTimeCycle.mWaveOffset;
        this.mProgress = keyTimeCycle.mProgress;
        this.mAlpha = keyTimeCycle.mAlpha;
        this.mElevation = keyTimeCycle.mElevation;
        this.mRotation = keyTimeCycle.mRotation;
        this.mTransitionPathRotate = keyTimeCycle.mTransitionPathRotate;
        this.mRotationX = keyTimeCycle.mRotationX;
        this.mRotationY = keyTimeCycle.mRotationY;
        this.mScaleX = keyTimeCycle.mScaleX;
        this.mScaleY = keyTimeCycle.mScaleY;
        this.mTranslationX = keyTimeCycle.mTranslationX;
        this.mTranslationY = keyTimeCycle.mTranslationY;
        this.mTranslationZ = keyTimeCycle.mTranslationZ;
        return this;
    }

    public Key clone() {
        return new KeyTimeCycle().copy(this);
    }
}
