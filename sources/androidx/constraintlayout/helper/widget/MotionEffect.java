package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.C0185R;

public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private float fadeAlpha = 0.1f;
    private int fadeEnd = 50;
    private int fadeMove = -1;
    private boolean fadeMoveStrict = true;
    private int fadeStart = 49;
    private int fadeTranslationX = 0;
    private int fadeTranslationY = 0;
    private int viewTransitionId = -1;

    public boolean isDecorator() {
        return true;
    }

    public MotionEffect(Context context) {
        super(context);
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0185R.styleable.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0185R.styleable.MotionEffect_fadeMove_start) {
                    this.fadeStart = obtainStyledAttributes.getInt(index, this.fadeStart);
                    this.fadeStart = Math.max(Math.min(this.fadeStart, 99), 0);
                } else if (index == C0185R.styleable.MotionEffect_fadeMove_end) {
                    this.fadeEnd = obtainStyledAttributes.getInt(index, this.fadeEnd);
                    this.fadeEnd = Math.max(Math.min(this.fadeEnd, 99), 0);
                } else if (index == C0185R.styleable.MotionEffect_fadeMove_translationX) {
                    this.fadeTranslationX = obtainStyledAttributes.getDimensionPixelOffset(index, this.fadeTranslationX);
                } else if (index == C0185R.styleable.MotionEffect_fadeMove_translationY) {
                    this.fadeTranslationY = obtainStyledAttributes.getDimensionPixelOffset(index, this.fadeTranslationY);
                } else if (index == C0185R.styleable.MotionEffect_fadeMove_alpha) {
                    this.fadeAlpha = obtainStyledAttributes.getFloat(index, this.fadeAlpha);
                } else if (index == C0185R.styleable.MotionEffect_fadeMove_move) {
                    this.fadeMove = obtainStyledAttributes.getInt(index, this.fadeMove);
                } else if (index == C0185R.styleable.MotionEffect_fadeMove_strict) {
                    this.fadeMoveStrict = obtainStyledAttributes.getBoolean(index, this.fadeMoveStrict);
                } else if (index == C0185R.styleable.MotionEffect_fadeMove_viewTransition) {
                    this.viewTransitionId = obtainStyledAttributes.getResourceId(index, this.viewTransitionId);
                }
            }
            int i2 = this.fadeStart;
            int i3 = this.fadeEnd;
            if (i2 == i3) {
                if (i2 > 0) {
                    this.fadeStart = i2 - 1;
                } else {
                    this.fadeEnd = i3 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0188, code lost:
        if (r15 == 0.0f) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019b, code lost:
        if (r15 == 0.0f) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ab, code lost:
        if (r18 == 0.0f) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bb, code lost:
        if (r18 == 0.0f) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            android.view.ViewParent r2 = r22.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            android.view.View[] r2 = r0.getViews(r2)
            if (r2 != 0) goto L_0x002b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getLoc()
            r1.append(r2)
            java.lang.String r2 = " views = null"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FadeMove"
            android.util.Log.v(r2, r1)
            return
        L_0x002b:
            androidx.constraintlayout.motion.widget.KeyAttributes r3 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r3.<init>()
            androidx.constraintlayout.motion.widget.KeyAttributes r4 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r4.<init>()
            float r5 = r0.fadeAlpha
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "alpha"
            r3.setValue(r6, r5)
            float r5 = r0.fadeAlpha
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.setValue(r6, r5)
            int r5 = r0.fadeStart
            r3.setFramePosition(r5)
            int r5 = r0.fadeEnd
            r4.setFramePosition(r5)
            androidx.constraintlayout.motion.widget.KeyPosition r5 = new androidx.constraintlayout.motion.widget.KeyPosition
            r5.<init>()
            int r6 = r0.fadeStart
            r5.setFramePosition(r6)
            r6 = 0
            r5.setType(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "percentX"
            r5.setValue(r8, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "percentY"
            r5.setValue(r9, r7)
            androidx.constraintlayout.motion.widget.KeyPosition r7 = new androidx.constraintlayout.motion.widget.KeyPosition
            r7.<init>()
            int r10 = r0.fadeEnd
            r7.setFramePosition(r10)
            r7.setType(r6)
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.setValue(r8, r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.setValue(r9, r8)
            int r8 = r0.fadeTranslationX
            r9 = 0
            if (r8 <= 0) goto L_0x00bf
            androidx.constraintlayout.motion.widget.KeyAttributes r8 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r8.<init>()
            androidx.constraintlayout.motion.widget.KeyAttributes r11 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r11.<init>()
            int r12 = r0.fadeTranslationX
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "translationX"
            r8.setValue(r13, r12)
            int r12 = r0.fadeEnd
            r8.setFramePosition(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.setValue(r13, r12)
            int r12 = r0.fadeEnd
            int r12 = r12 - r10
            r11.setFramePosition(r12)
            goto L_0x00c1
        L_0x00bf:
            r8 = r9
            r11 = r8
        L_0x00c1:
            int r12 = r0.fadeTranslationY
            if (r12 <= 0) goto L_0x00ee
            androidx.constraintlayout.motion.widget.KeyAttributes r9 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r9.<init>()
            androidx.constraintlayout.motion.widget.KeyAttributes r12 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r12.<init>()
            int r13 = r0.fadeTranslationY
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "translationY"
            r9.setValue(r14, r13)
            int r13 = r0.fadeEnd
            r9.setFramePosition(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12.setValue(r14, r13)
            int r13 = r0.fadeEnd
            int r13 = r13 - r10
            r12.setFramePosition(r13)
            goto L_0x00ef
        L_0x00ee:
            r12 = r9
        L_0x00ef:
            int r13 = r0.fadeMove
            r15 = -1
            r17 = 0
            if (r13 != r15) goto L_0x015c
            r13 = 4
            int[] r15 = new int[r13]
            r13 = 0
        L_0x00fa:
            int r14 = r2.length
            if (r13 >= r14) goto L_0x0144
            r14 = r2[r13]
            java.lang.Object r14 = r1.get(r14)
            androidx.constraintlayout.motion.widget.MotionController r14 = (androidx.constraintlayout.motion.widget.MotionController) r14
            float r20 = r14.getFinalX()
            float r21 = r14.getStartX()
            float r20 = r20 - r21
            float r21 = r14.getFinalY()
            float r14 = r14.getStartY()
            float r21 = r21 - r14
            int r14 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0122
            r14 = r15[r10]
            int r14 = r14 + r10
            r15[r10] = r14
        L_0x0122:
            int r14 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x012b
            r14 = r15[r6]
            int r14 = r14 + r10
            r15[r6] = r14
        L_0x012b:
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x0136
            r14 = 3
            r19 = r15[r14]
            int r19 = r19 + 1
            r15[r14] = r19
        L_0x0136:
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0141
            r14 = 2
            r16 = r15[r14]
            int r16 = r16 + 1
            r15[r14] = r16
        L_0x0141:
            int r13 = r13 + 1
            goto L_0x00fa
        L_0x0144:
            r13 = r15[r6]
            r14 = r13
            r6 = 4
            r13 = 1
            r18 = 0
        L_0x014b:
            if (r13 >= r6) goto L_0x015a
            r6 = r15[r13]
            if (r14 >= r6) goto L_0x0156
            r6 = r15[r13]
            r14 = r6
            r18 = r13
        L_0x0156:
            int r13 = r13 + 1
            r6 = 4
            goto L_0x014b
        L_0x015a:
            r13 = r18
        L_0x015c:
            r6 = 0
        L_0x015d:
            int r14 = r2.length
            if (r6 >= r14) goto L_0x01f4
            r14 = r2[r6]
            java.lang.Object r14 = r1.get(r14)
            androidx.constraintlayout.motion.widget.MotionController r14 = (androidx.constraintlayout.motion.widget.MotionController) r14
            float r15 = r14.getFinalX()
            float r18 = r14.getStartX()
            float r15 = r15 - r18
            float r18 = r14.getFinalY()
            float r21 = r14.getStartY()
            float r18 = r18 - r21
            if (r13 != 0) goto L_0x018f
            int r18 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r18 <= 0) goto L_0x018d
            boolean r10 = r0.fadeMoveStrict
            if (r10 == 0) goto L_0x018a
            int r10 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r10 != 0) goto L_0x018d
        L_0x018a:
            r10 = 3
        L_0x018b:
            r15 = 0
            goto L_0x01bf
        L_0x018d:
            r10 = 3
            goto L_0x01be
        L_0x018f:
            if (r13 != r10) goto L_0x019e
            int r18 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r18 >= 0) goto L_0x018d
            boolean r10 = r0.fadeMoveStrict
            if (r10 == 0) goto L_0x018a
            int r10 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r10 != 0) goto L_0x018d
            goto L_0x018a
        L_0x019e:
            r10 = 2
            if (r13 != r10) goto L_0x01ae
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x018d
            boolean r15 = r0.fadeMoveStrict
            if (r15 == 0) goto L_0x018a
            int r15 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r15 != 0) goto L_0x018d
            goto L_0x018a
        L_0x01ae:
            r10 = 3
            if (r13 != r10) goto L_0x01be
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x01be
            boolean r15 = r0.fadeMoveStrict
            if (r15 == 0) goto L_0x018b
            int r15 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r15 != 0) goto L_0x01be
            goto L_0x018b
        L_0x01be:
            r15 = 1
        L_0x01bf:
            if (r15 == 0) goto L_0x01ed
            int r15 = r0.viewTransitionId
            r10 = -1
            if (r15 != r10) goto L_0x01e7
            r14.addKey(r3)
            r14.addKey(r4)
            r14.addKey(r5)
            r14.addKey(r7)
            int r15 = r0.fadeTranslationX
            if (r15 <= 0) goto L_0x01dc
            r14.addKey(r8)
            r14.addKey(r11)
        L_0x01dc:
            int r15 = r0.fadeTranslationY
            if (r15 <= 0) goto L_0x01ed
            r14.addKey(r9)
            r14.addKey(r12)
            goto L_0x01ed
        L_0x01e7:
            r10 = r23
            r10.applyViewTransition(r15, r14)
            goto L_0x01ef
        L_0x01ed:
            r10 = r23
        L_0x01ef:
            int r6 = r6 + 1
            r10 = 1
            goto L_0x015d
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }
}
