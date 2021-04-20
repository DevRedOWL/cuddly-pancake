package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0185R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

class TouchResponse {
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-7f;
    static final int FLAG_DISABLE_POST_SCROLL = 1;
    static final int FLAG_DISABLE_SCROLL = 2;
    private static final int SEC_TO_MILLISECONDS = 1000;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final String TAG = "TouchResponse";
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt = new float[2];
    private float mDragScale = 1.0f;
    private boolean mDragStarted = false;
    private float mDragThreshold = 10.0f;
    private int mFlags = 0;
    boolean mIsRotateMode = false;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo = -1;
    private float mMaxAcceleration = 1.2f;
    private float mMaxVelocity = 4.0f;
    private final MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop = true;
    private int mOnTouchUp = 0;
    float mRotateCenterX = 0.5f;
    float mRotateCenterY = 0.5f;
    private int mRotationCenterId = -1;
    private int mTouchAnchorId = -1;
    private int mTouchAnchorSide = 0;
    private float mTouchAnchorX = 0.5f;
    private float mTouchAnchorY = 0.5f;
    private float mTouchDirectionX = 0.0f;
    private float mTouchDirectionY = 1.0f;
    private int mTouchRegionId = -1;
    private int mTouchSide = 0;

    TouchResponse(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.mMotionLayout = motionLayout;
        fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
    }

    public void setRTL(boolean z) {
        if (z) {
            float[][] fArr = TOUCH_DIRECTION;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = TOUCH_SIDES;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = TOUCH_DIRECTION;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = TOUCH_SIDES;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = TOUCH_SIDES;
        int i = this.mTouchAnchorSide;
        this.mTouchAnchorX = fArr5[i][0];
        this.mTouchAnchorY = fArr5[i][1];
        int i2 = this.mTouchSide;
        float[][] fArr6 = TOUCH_DIRECTION;
        if (i2 < fArr6.length) {
            this.mTouchDirectionX = fArr6[i2][0];
            this.mTouchDirectionY = fArr6[i2][1];
        }
    }

    private void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0185R.styleable.OnSwipe);
        fill(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private void fill(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C0185R.styleable.OnSwipe_touchAnchorId) {
                this.mTouchAnchorId = typedArray.getResourceId(index, this.mTouchAnchorId);
            } else if (index == C0185R.styleable.OnSwipe_touchAnchorSide) {
                this.mTouchAnchorSide = typedArray.getInt(index, this.mTouchAnchorSide);
                float[][] fArr = TOUCH_SIDES;
                int i2 = this.mTouchAnchorSide;
                this.mTouchAnchorX = fArr[i2][0];
                this.mTouchAnchorY = fArr[i2][1];
            } else if (index == C0185R.styleable.OnSwipe_dragDirection) {
                this.mTouchSide = typedArray.getInt(index, this.mTouchSide);
                int i3 = this.mTouchSide;
                float[][] fArr2 = TOUCH_DIRECTION;
                if (i3 < fArr2.length) {
                    this.mTouchDirectionX = fArr2[i3][0];
                    this.mTouchDirectionY = fArr2[i3][1];
                } else {
                    this.mTouchDirectionY = Float.NaN;
                    this.mTouchDirectionX = Float.NaN;
                    this.mIsRotateMode = true;
                }
            } else if (index == C0185R.styleable.OnSwipe_maxVelocity) {
                this.mMaxVelocity = typedArray.getFloat(index, this.mMaxVelocity);
            } else if (index == C0185R.styleable.OnSwipe_maxAcceleration) {
                this.mMaxAcceleration = typedArray.getFloat(index, this.mMaxAcceleration);
            } else if (index == C0185R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.mMoveWhenScrollAtTop = typedArray.getBoolean(index, this.mMoveWhenScrollAtTop);
            } else if (index == C0185R.styleable.OnSwipe_dragScale) {
                this.mDragScale = typedArray.getFloat(index, this.mDragScale);
            } else if (index == C0185R.styleable.OnSwipe_dragThreshold) {
                this.mDragThreshold = typedArray.getFloat(index, this.mDragThreshold);
            } else if (index == C0185R.styleable.OnSwipe_touchRegionId) {
                this.mTouchRegionId = typedArray.getResourceId(index, this.mTouchRegionId);
            } else if (index == C0185R.styleable.OnSwipe_onTouchUp) {
                this.mOnTouchUp = typedArray.getInt(index, this.mOnTouchUp);
            } else if (index == C0185R.styleable.OnSwipe_nestedScrollFlags) {
                this.mFlags = typedArray.getInteger(index, 0);
            } else if (index == C0185R.styleable.OnSwipe_limitBoundsTo) {
                this.mLimitBoundsTo = typedArray.getResourceId(index, 0);
            } else if (index == C0185R.styleable.OnSwipe_rotationCenterId) {
                this.mRotationCenterId = typedArray.getResourceId(index, this.mRotationCenterId);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setUpTouchEvent(float f, float f2) {
        this.mLastTouchX = f;
        this.mLastTouchY = f2;
        this.mDragStarted = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0296  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processTouchRotateEvent(android.view.MotionEvent r22, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r23, int r24, androidx.constraintlayout.motion.widget.MotionScene r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r22
            r1.addMovement(r2)
            int r3 = r22.getAction()
            r4 = 0
            if (r3 == 0) goto L_0x02a7
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = -1
            r9 = 1
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r9) goto L_0x0189
            r4 = 2
            if (r3 == r4) goto L_0x001f
            goto L_0x02b5
        L_0x001f:
            r22.getRawY()
            float r3 = r0.mLastTouchY
            r22.getRawX()
            float r3 = r0.mLastTouchX
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r10
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r10
            int r11 = r0.mRotationCenterId
            if (r11 == r8) goto L_0x005f
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            android.view.View r3 = r3.findViewById(r11)
            int r4 = r3.getLeft()
            int r11 = r3.getRight()
            int r4 = r4 + r11
            float r4 = (float) r4
            float r4 = r4 / r10
            int r11 = r3.getTop()
            int r3 = r3.getBottom()
            int r11 = r11 + r3
            float r3 = (float) r11
            float r3 = r3 / r10
            r20 = r4
            r4 = r3
            r3 = r20
            goto L_0x0093
        L_0x005f:
            int r11 = r0.mTouchAnchorId
            if (r11 == r8) goto L_0x0093
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionController r11 = r12.getMotionController(r11)
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r0.mMotionLayout
            int r11 = r11.getAnimateRelativeTo()
            android.view.View r11 = r12.findViewById(r11)
            if (r11 != 0) goto L_0x007d
            java.lang.String r10 = "TouchResponse"
            java.lang.String r11 = "could not find view to animate to"
            android.util.Log.e(r10, r11)
            goto L_0x0093
        L_0x007d:
            int r3 = r11.getLeft()
            int r4 = r11.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r10
            int r4 = r11.getTop()
            int r11 = r11.getBottom()
            int r4 = r4 + r11
            float r4 = (float) r4
            float r4 = r4 / r10
        L_0x0093:
            float r10 = r22.getRawX()
            float r10 = r10 - r3
            float r11 = r22.getRawY()
            float r11 = r11 - r4
            float r12 = r22.getRawY()
            float r12 = r12 - r4
            double r12 = (double) r12
            float r14 = r22.getRawX()
            float r14 = r14 - r3
            double r14 = (double) r14
            double r12 = java.lang.Math.atan2(r12, r14)
            float r14 = r0.mLastTouchY
            float r14 = r14 - r4
            double r14 = (double) r14
            float r4 = r0.mLastTouchX
            float r4 = r4 - r3
            double r3 = (double) r4
            double r3 = java.lang.Math.atan2(r14, r3)
            double r3 = r12 - r3
            r14 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r3 = r3 * r14
            r14 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r3 = r3 / r14
            float r3 = (float) r3
            r4 = 1134886912(0x43a50000, float:330.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d1
            float r3 = r3 - r5
            goto L_0x00d8
        L_0x00d1:
            r4 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d8
            float r3 = r3 + r5
        L_0x00d8:
            float r4 = java.lang.Math.abs(r3)
            double r14 = (double) r4
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 > 0) goto L_0x00ea
            boolean r4 = r0.mDragStarted
            if (r4 == 0) goto L_0x02b5
        L_0x00ea:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            float r4 = r4.getProgress()
            boolean r14 = r0.mDragStarted
            if (r14 != 0) goto L_0x00fb
            r0.mDragStarted = r9
            androidx.constraintlayout.motion.widget.MotionLayout r14 = r0.mMotionLayout
            r14.setProgress(r4)
        L_0x00fb:
            int r15 = r0.mTouchAnchorId
            if (r15 == r8) goto L_0x011f
            androidx.constraintlayout.motion.widget.MotionLayout r14 = r0.mMotionLayout
            float r5 = r0.mTouchAnchorX
            float r8 = r0.mTouchAnchorY
            float[] r7 = r0.mAnchorDpDt
            r16 = r4
            r17 = r5
            r18 = r8
            r19 = r7
            r14.getAnchorDpDt(r15, r16, r17, r18, r19)
            float[] r5 = r0.mAnchorDpDt
            r7 = r5[r9]
            double r7 = (double) r7
            double r7 = java.lang.Math.toDegrees(r7)
            float r7 = (float) r7
            r5[r9] = r7
            goto L_0x0123
        L_0x011f:
            float[] r7 = r0.mAnchorDpDt
            r7[r9] = r5
        L_0x0123:
            float r5 = r0.mDragScale
            float r3 = r3 * r5
            float[] r5 = r0.mAnchorDpDt
            r5 = r5[r9]
            float r3 = r3 / r5
            float r4 = r4 + r3
            float r3 = java.lang.Math.min(r4, r6)
            r4 = 0
            float r3 = java.lang.Math.max(r3, r4)
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            float r4 = r4.getProgress()
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0176
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            r4.setProgress(r3)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            float r3 = r23.getXVelocity()
            float r1 = r23.getYVelocity()
            double r4 = (double) r1
            double r6 = (double) r3
            double r8 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r12
            double r3 = java.lang.Math.sin(r3)
            double r8 = r8 * r3
            double r3 = (double) r10
            double r5 = (double) r11
            double r3 = java.lang.Math.hypot(r3, r5)
            double r8 = r8 / r3
            float r1 = (float) r8
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.mLastVelocity = r1
            goto L_0x017b
        L_0x0176:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            r3 = 0
            r1.mLastVelocity = r3
        L_0x017b:
            float r1 = r22.getRawX()
            r0.mLastTouchX = r1
            float r1 = r22.getRawY()
            r0.mLastTouchY = r1
            goto L_0x02b5
        L_0x0189:
            r0.mDragStarted = r4
            r3 = 16
            r1.computeCurrentVelocity(r3)
            float r3 = r23.getXVelocity()
            float r1 = r23.getYVelocity()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            float r4 = r4.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r7 = r7 / r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r10
            int r12 = r0.mRotationCenterId
            if (r12 == r8) goto L_0x01cf
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            android.view.View r7 = r7.findViewById(r12)
            int r11 = r7.getLeft()
            int r12 = r7.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r10
            int r12 = r7.getTop()
            int r7 = r7.getBottom()
        L_0x01cb:
            int r12 = r12 + r7
            float r7 = (float) r12
            float r7 = r7 / r10
            goto L_0x01fc
        L_0x01cf:
            int r12 = r0.mTouchAnchorId
            if (r12 == r8) goto L_0x01f7
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionController r7 = r7.getMotionController(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r7 = r7.getAnimateRelativeTo()
            android.view.View r7 = r11.findViewById(r7)
            int r11 = r7.getLeft()
            int r12 = r7.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r10
            int r12 = r7.getTop()
            int r7 = r7.getBottom()
            goto L_0x01cb
        L_0x01f7:
            r20 = r11
            r11 = r7
            r7 = r20
        L_0x01fc:
            float r10 = r22.getRawX()
            float r10 = r10 - r11
            float r2 = r22.getRawY()
            float r2 = r2 - r7
            double r11 = (double) r2
            double r13 = (double) r10
            double r11 = java.lang.Math.atan2(r11, r13)
            double r17 = java.lang.Math.toDegrees(r11)
            int r12 = r0.mTouchAnchorId
            if (r12 == r8) goto L_0x022f
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            float r14 = r0.mTouchAnchorX
            float r15 = r0.mTouchAnchorY
            float[] r5 = r0.mAnchorDpDt
            r13 = r4
            r16 = r5
            r11.getAnchorDpDt(r12, r13, r14, r15, r16)
            float[] r5 = r0.mAnchorDpDt
            r7 = r5[r9]
            double r7 = (double) r7
            double r7 = java.lang.Math.toDegrees(r7)
            float r7 = (float) r7
            r5[r9] = r7
            goto L_0x0233
        L_0x022f:
            float[] r7 = r0.mAnchorDpDt
            r7[r9] = r5
        L_0x0233:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r3 = r3 + r10
            double r7 = (double) r3
            double r1 = java.lang.Math.atan2(r1, r7)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r17
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L_0x025b
            float r2 = r1 * r3
            float r5 = r0.mDragScale
            float r2 = r2 * r5
            float[] r5 = r0.mAnchorDpDt
            r5 = r5[r9]
            float r2 = r2 / r5
            float r2 = r2 + r4
            goto L_0x025c
        L_0x025b:
            r2 = r4
        L_0x025c:
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0296
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0296
            int r5 = r0.mOnTouchUp
            r7 = 3
            if (r5 == r7) goto L_0x0296
            float r7 = r0.mDragScale
            float r1 = r1 * r7
            float[] r7 = r0.mAnchorDpDt
            r7 = r7[r9]
            float r1 = r1 / r7
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            double r8 = (double) r2
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x027e
            r2 = 0
            goto L_0x0280
        L_0x027e:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0280:
            float r1 = r1 * r3
            r7.touchAnimateTo(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x028e
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x02b5
        L_0x028e:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x02b5
        L_0x0296:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x029f
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x02b5
        L_0x029f:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x02b5
        L_0x02a7:
            float r1 = r22.getRawX()
            r0.mLastTouchX = r1
            float r1 = r22.getRawY()
            r0.mLastTouchY = r1
            r0.mDragStarted = r4
        L_0x02b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.TouchResponse.processTouchRotateEvent(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker, int, androidx.constraintlayout.motion.widget.MotionScene):void");
    }

    /* access modifiers changed from: package-private */
    public void processTouchEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i, MotionScene motionScene) {
        float f;
        int i2;
        float f2;
        MotionLayout.MotionTracker motionTracker2 = motionTracker;
        if (this.mIsRotateMode) {
            processTouchRotateEvent(motionEvent, motionTracker, i, motionScene);
            return;
        }
        motionTracker2.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            this.mDragStarted = false;
        } else if (action == 1) {
            this.mDragStarted = false;
            motionTracker2.computeCurrentVelocity(1000);
            float xVelocity = motionTracker.getXVelocity();
            float yVelocity = motionTracker.getYVelocity();
            float progress = this.mMotionLayout.getProgress();
            int i3 = this.mTouchAnchorId;
            if (i3 != -1) {
                this.mMotionLayout.getAnchorDpDt(i3, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
            } else {
                float min = (float) Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                float[] fArr = this.mAnchorDpDt;
                fArr[1] = this.mTouchDirectionY * min;
                fArr[0] = min * this.mTouchDirectionX;
            }
            float f3 = this.mTouchDirectionX;
            float[] fArr2 = this.mAnchorDpDt;
            float f4 = fArr2[0];
            float f5 = this.mTouchDirectionY;
            float f6 = fArr2[1];
            if (f3 != 0.0f) {
                f = xVelocity / fArr2[0];
            } else {
                f = yVelocity / fArr2[1];
            }
            float f7 = !Float.isNaN(f) ? (f / 3.0f) + progress : progress;
            if (f7 != 0.0f && f7 != 1.0f && (i2 = this.mOnTouchUp) != 3) {
                this.mMotionLayout.touchAnimateTo(i2, ((double) f7) < 0.5d ? 0.0f : 1.0f, f);
                if (0.0f >= progress || 1.0f <= progress) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                }
            } else if (0.0f >= f7 || 1.0f <= f7) {
                this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.mLastTouchY;
            float rawX = motionEvent.getRawX() - this.mLastTouchX;
            if (Math.abs((this.mTouchDirectionX * rawX) + (this.mTouchDirectionY * rawY)) > this.mDragThreshold || this.mDragStarted) {
                float progress2 = this.mMotionLayout.getProgress();
                if (!this.mDragStarted) {
                    this.mDragStarted = true;
                    this.mMotionLayout.setProgress(progress2);
                }
                int i4 = this.mTouchAnchorId;
                if (i4 != -1) {
                    this.mMotionLayout.getAnchorDpDt(i4, progress2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                } else {
                    float min2 = (float) Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                    float[] fArr3 = this.mAnchorDpDt;
                    fArr3[1] = this.mTouchDirectionY * min2;
                    fArr3[0] = min2 * this.mTouchDirectionX;
                }
                float f8 = this.mTouchDirectionX;
                float[] fArr4 = this.mAnchorDpDt;
                if (((double) Math.abs(((f8 * fArr4[0]) + (this.mTouchDirectionY * fArr4[1])) * this.mDragScale)) < 0.01d) {
                    float[] fArr5 = this.mAnchorDpDt;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.mTouchDirectionX != 0.0f) {
                    f2 = rawX / this.mAnchorDpDt[0];
                } else {
                    f2 = rawY / this.mAnchorDpDt[1];
                }
                float max = Math.max(Math.min(progress2 + f2, 1.0f), 0.0f);
                if (max != this.mMotionLayout.getProgress()) {
                    this.mMotionLayout.setProgress(max);
                    motionTracker2.computeCurrentVelocity(1000);
                    this.mMotionLayout.mLastVelocity = this.mTouchDirectionX != 0.0f ? motionTracker.getXVelocity() / this.mAnchorDpDt[0] : motionTracker.getYVelocity() / this.mAnchorDpDt[1];
                } else {
                    this.mMotionLayout.mLastVelocity = 0.0f;
                }
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setDown(float f, float f2) {
        this.mLastTouchX = f;
        this.mLastTouchY = f2;
    }

    /* access modifiers changed from: package-private */
    public float getProgressDirection(float f, float f2) {
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, this.mMotionLayout.getProgress(), this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        if (this.mTouchDirectionX != 0.0f) {
            float[] fArr = this.mAnchorDpDt;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * this.mTouchDirectionX) / this.mAnchorDpDt[0];
        }
        float[] fArr2 = this.mAnchorDpDt;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.mTouchDirectionY) / this.mAnchorDpDt[1];
    }

    /* access modifiers changed from: package-private */
    public void scrollUp(float f, float f2) {
        float f3;
        boolean z = false;
        this.mDragStarted = false;
        float progress = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f4 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float f5 = fArr[0];
        float f6 = this.mTouchDirectionY;
        float f7 = fArr[1];
        if (f4 != 0.0f) {
            f3 = (f * f4) / fArr[0];
        } else {
            f3 = (f2 * f6) / fArr[1];
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            float f8 = 1.0f;
            boolean z2 = progress != 1.0f;
            if (this.mOnTouchUp != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.mMotionLayout;
                int i = this.mOnTouchUp;
                if (((double) progress) < 0.5d) {
                    f8 = 0.0f;
                }
                motionLayout.touchAnimateTo(i, f8, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void scrollMove(float f, float f2) {
        float f3;
        float f4 = this.mTouchDirectionX;
        float f5 = this.mTouchDirectionY;
        float progress = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(progress);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f6 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        if (((double) Math.abs((f6 * fArr[0]) + (this.mTouchDirectionY * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.mAnchorDpDt;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f7 = this.mTouchDirectionX;
        if (f7 != 0.0f) {
            f3 = (f * f7) / this.mAnchorDpDt[0];
        } else {
            f3 = (f2 * this.mTouchDirectionY) / this.mAnchorDpDt[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(max);
        }
    }

    /* access modifiers changed from: package-private */
    public void setupTouch() {
        View view;
        int i = this.mTouchAnchorId;
        if (i != -1) {
            view = this.mMotionLayout.findViewById(i);
            if (view == null) {
                Log.e(TAG, "cannot find TouchAnchorId @id/" + Debug.getName(this.mMotionLayout.getContext(), this.mTouchAnchorId));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
                public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                }
            });
        }
    }

    public void setAnchorId(int i) {
        this.mTouchAnchorId = i;
    }

    public int getAnchorId() {
        return this.mTouchAnchorId;
    }

    public void setTouchAnchorLocation(float f, float f2) {
        this.mTouchAnchorX = f;
        this.mTouchAnchorY = f2;
    }

    public void setMaxVelocity(float f) {
        this.mMaxVelocity = f;
    }

    public void setMaxAcceleration(float f) {
        this.mMaxAcceleration = f;
    }

    /* access modifiers changed from: package-private */
    public float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    /* access modifiers changed from: package-private */
    public boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    /* access modifiers changed from: package-private */
    public RectF getTouchRegion(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.mTouchRegionId;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    /* access modifiers changed from: package-private */
    public RectF getLimitBoundsTo(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.mLimitBoundsTo;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public int getLimitBoundsToId() {
        return this.mLimitBoundsTo;
    }

    /* access modifiers changed from: package-private */
    public float dot(float f, float f2) {
        return (f * this.mTouchDirectionX) + (f2 * this.mTouchDirectionY);
    }

    public String toString() {
        if (Float.isNaN(this.mTouchDirectionX)) {
            return "rotation";
        }
        return this.mTouchDirectionX + " , " + this.mTouchDirectionY;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public void setTouchUpMode(int i) {
        this.mOnTouchUp = i;
    }
}
