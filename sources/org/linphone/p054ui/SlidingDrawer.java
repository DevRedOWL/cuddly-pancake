package org.linphone.p054ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import org.linphone.C5321R;

/* renamed from: org.linphone.ui.SlidingDrawer */
public class SlidingDrawer extends ViewGroup {
    private static final int ANIMATION_FRAME_DURATION = 16;
    private static final int COLLAPSED_FULL_CLOSED = -10002;
    private static final int EXPANDED_FULL_OPEN = -10001;
    public static final String LOG_TAG = "Sliding";
    private static final float MAXIMUM_ACCELERATION = 2000.0f;
    private static final float MAXIMUM_MAJOR_VELOCITY = 200.0f;
    private static final float MAXIMUM_MINOR_VELOCITY = 150.0f;
    private static final float MAXIMUM_TAP_VELOCITY = 100.0f;
    private static final int MSG_ANIMATE = 1000;
    public static final int ORIENTATION_BTT = 1;
    public static final int ORIENTATION_LTR = 2;
    public static final int ORIENTATION_RTL = 0;
    public static final int ORIENTATION_TTB = 3;
    private static final int TAP_THRESHOLD = 6;
    private static final int VELOCITY_UNITS = 1000;
    private boolean mAllowSingleTap;
    /* access modifiers changed from: private */
    public boolean mAnimateOnClick;
    private float mAnimatedAcceleration;
    private float mAnimatedVelocity;
    private boolean mAnimating;
    private long mAnimationLastTime;
    private float mAnimationPosition;
    private int mBottomOffset;
    private View mContent;
    private final int mContentId;
    private long mCurrentAnimationTime;
    private boolean mExpanded;
    private final Rect mFrame;
    private View mHandle;
    private int mHandleHeight;
    private final int mHandleId;
    private int mHandleWidth;
    private final Handler mHandler;
    private final Rect mInvalidate;
    private boolean mInvert;
    /* access modifiers changed from: private */
    public boolean mLocked;
    private int mMaximumAcceleration;
    private int mMaximumMajorVelocity;
    private int mMaximumMinorVelocity;
    private final int mMaximumTapVelocity;
    private OnDrawerCloseListener mOnDrawerCloseListener;
    private OnDrawerOpenListener mOnDrawerOpenListener;
    private OnDrawerScrollListener mOnDrawerScrollListener;
    private final int mTapThreshold;
    private int mTopOffset;
    private int mTouchDelta;
    private boolean mTracking;
    private VelocityTracker mVelocityTracker;
    private final int mVelocityUnits;
    private boolean mVertical;

    /* renamed from: org.linphone.ui.SlidingDrawer$OnDrawerCloseListener */
    public interface OnDrawerCloseListener {
        void onDrawerClosed();
    }

    /* renamed from: org.linphone.ui.SlidingDrawer$OnDrawerOpenListener */
    public interface OnDrawerOpenListener {
        void onDrawerOpened();
    }

    /* renamed from: org.linphone.ui.SlidingDrawer$OnDrawerScrollListener */
    public interface OnDrawerScrollListener {
        void onScrollEnded();

        void onScrollStarted();
    }

    public SlidingDrawer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFrame = new Rect();
        this.mInvalidate = new Rect();
        this.mHandler = new SlidingHandler();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5321R.styleable.SlidingDrawer, i, 0);
        this.mBottomOffset = 0;
        this.mTopOffset = 0;
        boolean z = true;
        this.mAllowSingleTap = true;
        this.mAnimateOnClick = true;
        int i2 = obtainStyledAttributes.getInt(C5321R.styleable.SlidingDrawer_direction, 1);
        this.mVertical = i2 == 1 || i2 == 3;
        if (!(i2 == 3 || i2 == 2)) {
            z = false;
        }
        this.mInvert = z;
        int resourceId = obtainStyledAttributes.getResourceId(C5321R.styleable.SlidingDrawer_handle, 0);
        if (resourceId != 0) {
            int resourceId2 = obtainStyledAttributes.getResourceId(C5321R.styleable.SlidingDrawer_content, 0);
            if (resourceId2 == 0) {
                throw new IllegalArgumentException("The content attribute is required and must refer to a valid child.");
            } else if (resourceId != resourceId2) {
                this.mHandleId = resourceId;
                this.mContentId = resourceId2;
                float f = getResources().getDisplayMetrics().density;
                this.mTapThreshold = (int) ((6.0f * f) + 0.5f);
                this.mMaximumTapVelocity = (int) ((MAXIMUM_TAP_VELOCITY * f) + 0.5f);
                this.mMaximumMinorVelocity = (int) ((MAXIMUM_MINOR_VELOCITY * f) + 0.5f);
                this.mMaximumMajorVelocity = (int) ((200.0f * f) + 0.5f);
                this.mMaximumAcceleration = (int) ((MAXIMUM_ACCELERATION * f) + 0.5f);
                this.mVelocityUnits = (int) ((f * 1000.0f) + 0.5f);
                if (this.mInvert) {
                    this.mMaximumAcceleration = -this.mMaximumAcceleration;
                    this.mMaximumMajorVelocity = -this.mMaximumMajorVelocity;
                    this.mMaximumMinorVelocity = -this.mMaximumMinorVelocity;
                }
                obtainStyledAttributes.recycle();
                setAlwaysDrawnWithCacheEnabled(false);
            } else {
                throw new IllegalArgumentException("The content and handle attributes must refer to different children.");
            }
        } else {
            throw new IllegalArgumentException("The handle attribute is required and must refer to a valid child.");
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        this.mHandle = findViewById(this.mHandleId);
        View view = this.mHandle;
        if (view != null) {
            view.setOnClickListener(new DrawerToggler());
            this.mContent = findViewById(this.mContentId);
            View view2 = this.mContent;
            if (view2 != null) {
                view2.setVisibility(8);
                return;
            }
            throw new IllegalArgumentException("The content attribute is must refer to an existing child.");
        }
        throw new IllegalArgumentException("The handle attribute is must refer to an existing child.");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 0 || mode2 == 0) {
            throw new RuntimeException("SlidingDrawer cannot have UNSPECIFIED dimensions");
        }
        View view = this.mHandle;
        measureChild(view, i, i2);
        if (this.mVertical) {
            this.mContent.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec((size2 - view.getMeasuredHeight()) - this.mTopOffset, Integer.MIN_VALUE));
        } else {
            this.mContent.measure(View.MeasureSpec.makeMeasureSpec((size - view.getMeasuredWidth()) - this.mTopOffset, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(size2, BasicMeasure.EXACTLY));
        }
        setMeasuredDimension(size, size2);
    }

    private int getCustomBottom() {
        return this.mContent.getBottom() + this.mHandleHeight;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        long drawingTime = getDrawingTime();
        View view = this.mHandle;
        boolean z = this.mVertical;
        drawChild(canvas, view, drawingTime);
        if (this.mTracking || this.mAnimating) {
            Bitmap drawingCache = this.mContent.getDrawingCache();
            float f3 = 0.0f;
            if (drawingCache == null) {
                canvas.save();
                if (this.mInvert) {
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        f2 = (float) ((view.getLeft() - this.mTopOffset) - this.mContent.getMeasuredWidth());
                    }
                    if (z) {
                        f3 = (float) ((view.getTop() - this.mTopOffset) - this.mContent.getMeasuredHeight());
                    }
                    canvas.translate(f2, f3);
                } else {
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = (float) (view.getLeft() - this.mTopOffset);
                    }
                    if (z) {
                        f3 = (float) (view.getTop() - this.mTopOffset);
                    }
                    canvas.translate(f, f3);
                }
                drawChild(canvas, this.mContent, drawingTime);
                canvas.restore();
            } else if (!z) {
                if (this.mInvert) {
                    i = view.getLeft() - drawingCache.getWidth();
                } else {
                    i = view.getRight();
                }
                canvas.drawBitmap(drawingCache, (float) i, 0.0f, (Paint) null);
            } else if (this.mInvert) {
                canvas.drawBitmap(drawingCache, 0.0f, (float) ((view.getTop() - (getCustomBottom() - getTop())) + this.mHandleHeight), (Paint) null);
            } else {
                canvas.drawBitmap(drawingCache, 0.0f, (float) view.getBottom(), (Paint) null);
            }
            invalidate();
        } else if (this.mExpanded) {
            drawChild(canvas, this.mContent, drawingTime);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.mTracking) {
            int i7 = i3 - i;
            int i8 = i4 - i2;
            View view = this.mHandle;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            View view2 = this.mContent;
            if (this.mVertical) {
                i6 = (i7 - measuredWidth) / 2;
                if (this.mInvert) {
                    i5 = this.mExpanded ? view2.getMeasuredHeight() - this.mBottomOffset : this.mTopOffset;
                    view2.layout(0, this.mTopOffset, view2.getMeasuredWidth(), this.mTopOffset + view2.getMeasuredHeight());
                } else {
                    i5 = this.mExpanded ? this.mTopOffset : (i8 - measuredHeight) + this.mBottomOffset;
                    view2.layout(0, this.mTopOffset + measuredHeight, view2.getMeasuredWidth(), this.mTopOffset + measuredHeight + view2.getMeasuredHeight());
                }
            } else {
                i5 = (i8 - measuredHeight) / 2;
                if (this.mInvert) {
                    i6 = this.mExpanded ? (i7 - this.mBottomOffset) - measuredWidth : this.mTopOffset;
                    int i9 = this.mTopOffset;
                    view2.layout(i9, 0, view2.getMeasuredWidth() + i9, view2.getMeasuredHeight());
                } else {
                    i6 = this.mExpanded ? this.mTopOffset : (i7 - measuredWidth) + this.mBottomOffset;
                    int i10 = this.mTopOffset;
                    view2.layout(i10 + measuredWidth, 0, i10 + measuredWidth + view2.getMeasuredWidth(), view2.getMeasuredHeight());
                }
            }
            view.layout(i6, i5, measuredWidth + i6, measuredHeight + i5);
            this.mHandleHeight = view.getHeight();
            this.mHandleWidth = view.getWidth();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mLocked) {
            return false;
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = this.mFrame;
        View view = this.mHandle;
        view.getHitRect(rect);
        if (!this.mTracking && !rect.contains((int) x, (int) y)) {
            return false;
        }
        if (action == 0) {
            this.mTracking = true;
            view.setPressed(true);
            prepareContent();
            OnDrawerScrollListener onDrawerScrollListener = this.mOnDrawerScrollListener;
            if (onDrawerScrollListener != null) {
                onDrawerScrollListener.onScrollStarted();
            }
            if (this.mVertical) {
                int top = this.mHandle.getTop();
                this.mTouchDelta = ((int) y) - top;
                prepareTracking(top);
            } else {
                int left = this.mHandle.getLeft();
                this.mTouchDelta = ((int) x) - left;
                prepareTracking(left);
            }
            this.mVelocityTracker.addMovement(motionEvent);
        }
        return onTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0159, code lost:
        if (r4 > ((((r10.mBottomOffset + getRight()) - getLeft()) - r10.mHandleWidth) - r10.mTapThreshold)) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 != 3) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0107, code lost:
        if (r4 > ((r10.mTopOffset + r10.mHandleWidth) + r10.mTapThreshold)) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.mLocked
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.mTracking
            if (r0 == 0) goto L_0x0199
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            r0.addMovement(r11)
            int r0 = r11.getAction()
            r2 = 1
            if (r0 == r2) goto L_0x0034
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r11 = 3
            if (r0 == r11) goto L_0x0034
            goto L_0x0199
        L_0x001e:
            boolean r0 = r10.mVertical
            if (r0 == 0) goto L_0x0027
            float r11 = r11.getY()
            goto L_0x002b
        L_0x0027:
            float r11 = r11.getX()
        L_0x002b:
            int r11 = (int) r11
            int r0 = r10.mTouchDelta
            int r11 = r11 - r0
            r10.moveHandle(r11)
            goto L_0x0199
        L_0x0034:
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            int r0 = r10.mVelocityUnits
            r11.computeCurrentVelocity(r0)
            float r0 = r11.getYVelocity()
            float r11 = r11.getXVelocity()
            boolean r3 = r10.mVertical
            r4 = 0
            if (r3 == 0) goto L_0x006e
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0054
            float r11 = -r11
        L_0x0054:
            boolean r4 = r10.mInvert
            if (r4 != 0) goto L_0x005f
            int r4 = r10.mMaximumMinorVelocity
            float r4 = (float) r4
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x006a
        L_0x005f:
            boolean r4 = r10.mInvert
            if (r4 == 0) goto L_0x0093
            int r4 = r10.mMaximumMinorVelocity
            float r4 = (float) r4
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0093
        L_0x006a:
            int r11 = r10.mMaximumMinorVelocity
            float r11 = (float) r11
            goto L_0x0093
        L_0x006e:
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x007a
            float r0 = -r0
        L_0x007a:
            boolean r4 = r10.mInvert
            if (r4 != 0) goto L_0x0085
            int r4 = r10.mMaximumMinorVelocity
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0090
        L_0x0085:
            boolean r4 = r10.mInvert
            if (r4 == 0) goto L_0x0093
            int r4 = r10.mMaximumMinorVelocity
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0093
        L_0x0090:
            int r0 = r10.mMaximumMinorVelocity
            float r0 = (float) r0
        L_0x0093:
            double r6 = (double) r11
            double r8 = (double) r0
            double r6 = java.lang.Math.hypot(r6, r8)
            float r11 = (float) r6
            if (r5 == 0) goto L_0x009d
            float r11 = -r11
        L_0x009d:
            android.view.View r0 = r10.mHandle
            int r0 = r0.getTop()
            android.view.View r4 = r10.mHandle
            int r4 = r4.getLeft()
            android.view.View r5 = r10.mHandle
            int r5 = r5.getBottom()
            android.view.View r6 = r10.mHandle
            int r6 = r6.getRight()
            float r7 = java.lang.Math.abs(r11)
            int r8 = r10.mMaximumTapVelocity
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0192
            boolean r7 = r10.mInvert
            if (r7 == 0) goto L_0x010c
            boolean r7 = r10.mExpanded
            if (r7 == 0) goto L_0x00d6
            int r7 = r10.getCustomBottom()
            int r7 = r7 - r5
            int r5 = r10.mTapThreshold
            int r8 = r10.mBottomOffset
            int r5 = r5 + r8
            if (r7 >= r5) goto L_0x00d6
            r5 = 1
            goto L_0x00d7
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            boolean r7 = r10.mExpanded
            if (r7 != 0) goto L_0x00e7
            int r7 = r10.mTopOffset
            int r8 = r10.mHandleHeight
            int r7 = r7 + r8
            int r8 = r10.mTapThreshold
            int r7 = r7 - r8
            if (r0 >= r7) goto L_0x00e7
            r7 = 1
            goto L_0x00e8
        L_0x00e7:
            r7 = 0
        L_0x00e8:
            boolean r8 = r10.mExpanded
            if (r8 == 0) goto L_0x00fa
            int r8 = r10.getRight()
            int r8 = r8 - r6
            int r6 = r10.mTapThreshold
            int r9 = r10.mBottomOffset
            int r6 = r6 + r9
            if (r8 >= r6) goto L_0x00fa
            r6 = 1
            goto L_0x00fb
        L_0x00fa:
            r6 = 0
        L_0x00fb:
            boolean r8 = r10.mExpanded
            if (r8 != 0) goto L_0x010a
            int r8 = r10.mTopOffset
            int r9 = r10.mHandleWidth
            int r8 = r8 + r9
            int r9 = r10.mTapThreshold
            int r8 = r8 + r9
            if (r4 <= r8) goto L_0x010a
            goto L_0x015b
        L_0x010a:
            r2 = 0
            goto L_0x015b
        L_0x010c:
            boolean r5 = r10.mExpanded
            if (r5 == 0) goto L_0x0119
            int r5 = r10.mTapThreshold
            int r6 = r10.mTopOffset
            int r5 = r5 + r6
            if (r0 >= r5) goto L_0x0119
            r5 = 1
            goto L_0x011a
        L_0x0119:
            r5 = 0
        L_0x011a:
            boolean r6 = r10.mExpanded
            if (r6 != 0) goto L_0x0134
            int r6 = r10.mBottomOffset
            int r7 = r10.getCustomBottom()
            int r6 = r6 + r7
            int r7 = r10.getTop()
            int r6 = r6 - r7
            int r7 = r10.mHandleHeight
            int r6 = r6 - r7
            int r7 = r10.mTapThreshold
            int r6 = r6 - r7
            if (r0 <= r6) goto L_0x0134
            r7 = 1
            goto L_0x0135
        L_0x0134:
            r7 = 0
        L_0x0135:
            boolean r6 = r10.mExpanded
            if (r6 == 0) goto L_0x0142
            int r6 = r10.mTapThreshold
            int r8 = r10.mTopOffset
            int r6 = r6 + r8
            if (r4 >= r6) goto L_0x0142
            r6 = 1
            goto L_0x0143
        L_0x0142:
            r6 = 0
        L_0x0143:
            boolean r8 = r10.mExpanded
            if (r8 != 0) goto L_0x010a
            int r8 = r10.mBottomOffset
            int r9 = r10.getRight()
            int r8 = r8 + r9
            int r9 = r10.getLeft()
            int r8 = r8 - r9
            int r9 = r10.mHandleWidth
            int r8 = r8 - r9
            int r9 = r10.mTapThreshold
            int r8 = r8 - r9
            if (r4 <= r8) goto L_0x010a
        L_0x015b:
            if (r3 == 0) goto L_0x0162
            if (r5 != 0) goto L_0x016f
            if (r7 == 0) goto L_0x0167
            goto L_0x016f
        L_0x0162:
            if (r6 != 0) goto L_0x016f
            if (r2 == 0) goto L_0x0167
            goto L_0x016f
        L_0x0167:
            if (r3 == 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r0 = r4
        L_0x016b:
            r10.performFling(r0, r11, r1)
            goto L_0x0199
        L_0x016f:
            boolean r2 = r10.mAllowSingleTap
            if (r2 == 0) goto L_0x018a
            r10.playSoundEffect(r1)
            boolean r11 = r10.mExpanded
            if (r11 == 0) goto L_0x0182
            if (r3 == 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r0 = r4
        L_0x017e:
            r10.animateClose(r0)
            goto L_0x0199
        L_0x0182:
            if (r3 == 0) goto L_0x0185
            goto L_0x0186
        L_0x0185:
            r0 = r4
        L_0x0186:
            r10.animateOpen(r0)
            goto L_0x0199
        L_0x018a:
            if (r3 == 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r0 = r4
        L_0x018e:
            r10.performFling(r0, r11, r1)
            goto L_0x0199
        L_0x0192:
            if (r3 == 0) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r0 = r4
        L_0x0196:
            r10.performFling(r0, r11, r1)
        L_0x0199:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.p054ui.SlidingDrawer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void animateClose(int i) {
        prepareTracking(i);
        performFling(i, (float) this.mMaximumAcceleration, true);
    }

    private void animateOpen(int i) {
        prepareTracking(i);
        performFling(i, (float) (-this.mMaximumAcceleration), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (((r0 - (r8 + r4)) + r7.mBottomOffset) > r4) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if (r8 > (r7.mTopOffset + (r7.mVertical ? r7.mHandleHeight : r7.mHandleWidth))) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d4, code lost:
        if (r8 < ((r7.mVertical ? getHeight() : getWidth()) / 2)) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e6, code lost:
        if (r8 > ((r7.mVertical ? getHeight() : getWidth()) / 2)) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ea, code lost:
        r8 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void performFling(int r8, float r9, boolean r10) {
        /*
            r7 = this;
            float r0 = (float) r8
            r7.mAnimationPosition = r0
            r7.mAnimatedVelocity = r9
            boolean r0 = r7.mExpanded
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r7.mVertical
            if (r0 == 0) goto L_0x0018
            int r0 = r7.getCustomBottom()
            int r4 = r7.mHandleHeight
            int r0 = r0 + r4
            goto L_0x001c
        L_0x0018:
            int r0 = r7.getRight()
        L_0x001c:
            boolean r4 = r7.mVertical
            if (r4 == 0) goto L_0x0023
            int r4 = r7.mHandleHeight
            goto L_0x0025
        L_0x0023:
            int r4 = r7.mHandleWidth
        L_0x0025:
            boolean r5 = r7.mInvert
            if (r5 == 0) goto L_0x0031
            int r5 = r7.mMaximumMajorVelocity
            float r5 = (float) r5
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x003a
            goto L_0x0038
        L_0x0031:
            int r5 = r7.mMaximumMajorVelocity
            float r5 = (float) r5
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x003a
        L_0x0038:
            r5 = 1
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            boolean r6 = r7.mInvert
            if (r6 == 0) goto L_0x004a
            int r8 = r8 + r4
            int r0 = r0 - r8
            int r8 = r7.mBottomOffset
            int r0 = r0 + r8
            if (r0 <= r4) goto L_0x0048
        L_0x0046:
            r8 = 1
            goto L_0x0059
        L_0x0048:
            r8 = 0
            goto L_0x0059
        L_0x004a:
            int r0 = r7.mTopOffset
            boolean r4 = r7.mVertical
            if (r4 == 0) goto L_0x0053
            int r4 = r7.mHandleHeight
            goto L_0x0055
        L_0x0053:
            int r4 = r7.mHandleWidth
        L_0x0055:
            int r0 = r0 + r4
            if (r8 <= r0) goto L_0x0048
            goto L_0x0046
        L_0x0059:
            boolean r0 = r7.mInvert
            if (r0 == 0) goto L_0x0066
            int r0 = r7.mMaximumMajorVelocity
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
            goto L_0x006e
        L_0x0066:
            int r0 = r7.mMaximumMajorVelocity
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
        L_0x006e:
            r1 = 1
        L_0x006f:
            if (r10 != 0) goto L_0x0092
            if (r5 != 0) goto L_0x0092
            if (r8 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            goto L_0x0092
        L_0x0078:
            int r8 = r7.mMaximumAcceleration
            int r8 = -r8
            float r8 = (float) r8
            r7.mAnimatedAcceleration = r8
            boolean r8 = r7.mInvert
            if (r8 == 0) goto L_0x008a
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0137
            r7.mAnimatedVelocity = r3
            goto L_0x0137
        L_0x008a:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0137
            r7.mAnimatedVelocity = r3
            goto L_0x0137
        L_0x0092:
            int r8 = r7.mMaximumAcceleration
            float r8 = (float) r8
            r7.mAnimatedAcceleration = r8
            boolean r8 = r7.mInvert
            if (r8 == 0) goto L_0x00a3
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0137
            r7.mAnimatedVelocity = r3
            goto L_0x0137
        L_0x00a3:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0137
            r7.mAnimatedVelocity = r3
            goto L_0x0137
        L_0x00ab:
            boolean r0 = r7.mInvert
            if (r0 == 0) goto L_0x00b7
            int r0 = r7.mMaximumMajorVelocity
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            goto L_0x00be
        L_0x00b7:
            int r0 = r7.mMaximumMajorVelocity
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c0
        L_0x00be:
            r0 = 1
            goto L_0x00c1
        L_0x00c0:
            r0 = 0
        L_0x00c1:
            boolean r4 = r7.mInvert
            if (r4 == 0) goto L_0x00d7
            boolean r4 = r7.mVertical
            if (r4 == 0) goto L_0x00ce
            int r4 = r7.getHeight()
            goto L_0x00d2
        L_0x00ce:
            int r4 = r7.getWidth()
        L_0x00d2:
            int r4 = r4 / 2
            if (r8 >= r4) goto L_0x00ea
            goto L_0x00e8
        L_0x00d7:
            boolean r4 = r7.mVertical
            if (r4 == 0) goto L_0x00e0
            int r4 = r7.getHeight()
            goto L_0x00e4
        L_0x00e0:
            int r4 = r7.getWidth()
        L_0x00e4:
            int r4 = r4 / 2
            if (r8 <= r4) goto L_0x00ea
        L_0x00e8:
            r8 = 1
            goto L_0x00eb
        L_0x00ea:
            r8 = 0
        L_0x00eb:
            boolean r4 = r7.mInvert
            if (r4 == 0) goto L_0x00f8
            int r4 = r7.mMaximumMajorVelocity
            int r4 = -r4
            float r4 = (float) r4
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0101
            goto L_0x0100
        L_0x00f8:
            int r4 = r7.mMaximumMajorVelocity
            int r4 = -r4
            float r4 = (float) r4
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0101
        L_0x0100:
            r1 = 1
        L_0x0101:
            if (r10 != 0) goto L_0x0120
            if (r0 != 0) goto L_0x0109
            if (r8 == 0) goto L_0x0120
            if (r1 == 0) goto L_0x0120
        L_0x0109:
            int r8 = r7.mMaximumAcceleration
            float r8 = (float) r8
            r7.mAnimatedAcceleration = r8
            boolean r8 = r7.mInvert
            if (r8 == 0) goto L_0x0119
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0137
            r7.mAnimatedVelocity = r3
            goto L_0x0137
        L_0x0119:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0137
            r7.mAnimatedVelocity = r3
            goto L_0x0137
        L_0x0120:
            int r8 = r7.mMaximumAcceleration
            int r8 = -r8
            float r8 = (float) r8
            r7.mAnimatedAcceleration = r8
            boolean r8 = r7.mInvert
            if (r8 == 0) goto L_0x0131
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0137
            r7.mAnimatedVelocity = r3
            goto L_0x0137
        L_0x0131:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0137
            r7.mAnimatedVelocity = r3
        L_0x0137:
            long r8 = android.os.SystemClock.uptimeMillis()
            r7.mAnimationLastTime = r8
            r0 = 16
            long r8 = r8 + r0
            r7.mCurrentAnimationTime = r8
            r7.mAnimating = r2
            android.os.Handler r8 = r7.mHandler
            r9 = 1000(0x3e8, float:1.401E-42)
            r8.removeMessages(r9)
            android.os.Handler r8 = r7.mHandler
            android.os.Message r9 = r8.obtainMessage(r9)
            long r0 = r7.mCurrentAnimationTime
            r8.sendMessageAtTime(r9, r0)
            r7.stopTracking()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.p054ui.SlidingDrawer.performFling(int, float, boolean):void");
    }

    private void prepareTracking(int i) {
        int i2;
        int i3;
        this.mTracking = true;
        this.mVelocityTracker = VelocityTracker.obtain();
        if (!this.mExpanded) {
            this.mAnimatedAcceleration = (float) this.mMaximumAcceleration;
            this.mAnimatedVelocity = (float) this.mMaximumMajorVelocity;
            if (this.mInvert) {
                this.mAnimationPosition = (float) this.mTopOffset;
            } else {
                int i4 = this.mBottomOffset;
                if (this.mVertical) {
                    i3 = getHeight();
                    i2 = this.mHandleHeight;
                } else {
                    i3 = getWidth();
                    i2 = this.mHandleWidth;
                }
                this.mAnimationPosition = (float) (i4 + (i3 - i2));
            }
            moveHandle((int) this.mAnimationPosition);
            this.mAnimating = true;
            this.mHandler.removeMessages(1000);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.mAnimationLastTime = uptimeMillis;
            this.mCurrentAnimationTime = uptimeMillis + 16;
            this.mAnimating = true;
            return;
        }
        if (this.mAnimating) {
            this.mAnimating = false;
            this.mHandler.removeMessages(1000);
        }
        moveHandle(i);
    }

    private void moveHandle(int i) {
        View view = this.mHandle;
        if (this.mVertical) {
            if (i == EXPANDED_FULL_OPEN) {
                if (this.mInvert) {
                    view.offsetTopAndBottom(((this.mBottomOffset + getCustomBottom()) - getTop()) - this.mHandleHeight);
                } else {
                    view.offsetTopAndBottom(this.mTopOffset - view.getTop());
                }
                invalidate();
            } else if (i == COLLAPSED_FULL_CLOSED) {
                if (this.mInvert) {
                    view.offsetTopAndBottom(this.mTopOffset - view.getTop());
                } else {
                    view.offsetTopAndBottom((((this.mBottomOffset + getCustomBottom()) - getTop()) - this.mHandleHeight) - view.getTop());
                }
                invalidate();
            } else {
                int top = view.getTop();
                int i2 = i - top;
                int i3 = this.mTopOffset;
                if (i < i3) {
                    i2 = i3 - top;
                } else if (i2 > (((this.mBottomOffset + getCustomBottom()) - getTop()) - this.mHandleHeight) - top) {
                    i2 = (((this.mBottomOffset + getCustomBottom()) - getTop()) - this.mHandleHeight) - top;
                }
                view.offsetTopAndBottom(i2);
                Rect rect = this.mFrame;
                Rect rect2 = this.mInvalidate;
                view.getHitRect(rect);
                rect2.set(rect);
                rect2.union(rect.left, rect.top - i2, rect.right, rect.bottom - i2);
                rect2.union(0, rect.bottom - i2, getWidth(), (rect.bottom - i2) + this.mContent.getHeight());
                invalidate(rect2);
            }
        } else if (i == EXPANDED_FULL_OPEN) {
            if (this.mInvert) {
                view.offsetLeftAndRight(((this.mBottomOffset + getRight()) - getLeft()) - this.mHandleWidth);
            } else {
                view.offsetLeftAndRight(this.mTopOffset - view.getLeft());
            }
            invalidate();
        } else if (i == COLLAPSED_FULL_CLOSED) {
            if (this.mInvert) {
                view.offsetLeftAndRight(this.mTopOffset - view.getLeft());
            } else {
                view.offsetLeftAndRight((((this.mBottomOffset + getRight()) - getLeft()) - this.mHandleWidth) - view.getLeft());
            }
            invalidate();
        } else {
            int left = view.getLeft();
            int i4 = i - left;
            int i5 = this.mTopOffset;
            if (i < i5) {
                i4 = i5 - left;
            } else if (i4 > (((this.mBottomOffset + getRight()) - getLeft()) - this.mHandleWidth) - left) {
                i4 = (((this.mBottomOffset + getRight()) - getLeft()) - this.mHandleWidth) - left;
            }
            view.offsetLeftAndRight(i4);
            Rect rect3 = this.mFrame;
            Rect rect4 = this.mInvalidate;
            view.getHitRect(rect3);
            rect4.set(rect3);
            rect4.union(rect3.left - i4, rect3.top, rect3.right - i4, rect3.bottom);
            rect4.union(rect3.right - i4, 0, (rect3.right - i4) + this.mContent.getWidth(), getHeight());
            invalidate(rect4);
        }
    }

    private void prepareContent() {
        if (!this.mAnimating) {
            View view = this.mContent;
            if (view.isLayoutRequested()) {
                if (this.mVertical) {
                    int i = this.mHandleHeight;
                    view.measure(View.MeasureSpec.makeMeasureSpec(getRight() - getLeft(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(((getBottom() - getTop()) - i) - this.mTopOffset, Integer.MIN_VALUE));
                    if (this.mInvert) {
                        view.layout(0, this.mTopOffset, view.getMeasuredWidth(), this.mTopOffset + view.getMeasuredHeight());
                    } else {
                        view.layout(0, this.mTopOffset + i, view.getMeasuredWidth(), this.mTopOffset + i + view.getMeasuredHeight());
                    }
                } else {
                    int width = this.mHandle.getWidth();
                    view.measure(View.MeasureSpec.makeMeasureSpec(((getRight() - getLeft()) - width) - this.mTopOffset, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(getBottom() - getTop(), BasicMeasure.EXACTLY));
                    if (this.mInvert) {
                        int i2 = this.mTopOffset;
                        view.layout(i2, 0, view.getMeasuredWidth() + i2, view.getMeasuredHeight());
                    } else {
                        int i3 = this.mTopOffset;
                        view.layout(width + i3, 0, i3 + width + view.getMeasuredWidth(), view.getMeasuredHeight());
                    }
                }
            }
            view.getViewTreeObserver().dispatchOnPreDraw();
            view.buildDrawingCache();
            view.setVisibility(8);
        }
    }

    private void stopTracking() {
        this.mHandle.setPressed(false);
        this.mTracking = false;
        OnDrawerScrollListener onDrawerScrollListener = this.mOnDrawerScrollListener;
        if (onDrawerScrollListener != null) {
            onDrawerScrollListener.onScrollEnded();
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* access modifiers changed from: private */
    public void doAnimation() {
        if (this.mAnimating) {
            incrementAnimation();
            if (this.mInvert) {
                float f = this.mAnimationPosition;
                int i = this.mTopOffset;
                if (f < ((float) i)) {
                    this.mAnimating = false;
                    closeDrawer();
                    return;
                }
                if (f >= ((float) ((i + (this.mVertical ? getHeight() : getWidth())) - 1))) {
                    this.mAnimating = false;
                    openDrawer();
                    return;
                }
                moveHandle((int) this.mAnimationPosition);
                this.mCurrentAnimationTime += 16;
                Handler handler = this.mHandler;
                handler.sendMessageAtTime(handler.obtainMessage(1000), this.mCurrentAnimationTime);
                return;
            }
            if (this.mAnimationPosition >= ((float) ((this.mBottomOffset + (this.mVertical ? getHeight() : getWidth())) - 1))) {
                this.mAnimating = false;
                closeDrawer();
                return;
            }
            float f2 = this.mAnimationPosition;
            if (f2 < ((float) this.mTopOffset)) {
                this.mAnimating = false;
                openDrawer();
                return;
            }
            moveHandle((int) f2);
            this.mCurrentAnimationTime += 16;
            Handler handler2 = this.mHandler;
            handler2.sendMessageAtTime(handler2.obtainMessage(1000), this.mCurrentAnimationTime);
        }
    }

    private void incrementAnimation() {
        long uptimeMillis = SystemClock.uptimeMillis();
        float f = ((float) (uptimeMillis - this.mAnimationLastTime)) / 1000.0f;
        float f2 = this.mAnimationPosition;
        float f3 = this.mAnimatedVelocity;
        boolean z = this.mInvert;
        float f4 = this.mAnimatedAcceleration;
        this.mAnimationPosition = f2 + (f3 * f) + (0.5f * f4 * f * f);
        this.mAnimatedVelocity = f3 + (f4 * f);
        this.mAnimationLastTime = uptimeMillis;
    }

    public void toggle() {
        if (!this.mExpanded) {
            openDrawer();
        } else {
            closeDrawer();
        }
        invalidate();
        requestLayout();
    }

    public void animateToggle() {
        if (!this.mExpanded) {
            animateOpen();
        } else {
            animateClose();
        }
    }

    public void open() {
        openDrawer();
        invalidate();
        requestLayout();
        sendAccessibilityEvent(32);
    }

    public void close() {
        closeDrawer();
        invalidate();
        requestLayout();
    }

    public void animateClose() {
        if (isOpened()) {
            prepareContent();
            OnDrawerScrollListener onDrawerScrollListener = this.mOnDrawerScrollListener;
            if (onDrawerScrollListener != null) {
                onDrawerScrollListener.onScrollStarted();
            }
            animateClose(this.mVertical ? this.mHandle.getTop() : this.mHandle.getLeft());
            if (onDrawerScrollListener != null) {
                onDrawerScrollListener.onScrollEnded();
            }
        }
    }

    public void animateOpen() {
        prepareContent();
        OnDrawerScrollListener onDrawerScrollListener = this.mOnDrawerScrollListener;
        if (onDrawerScrollListener != null) {
            onDrawerScrollListener.onScrollStarted();
        }
        animateOpen(this.mVertical ? this.mHandle.getTop() : this.mHandle.getLeft());
        sendAccessibilityEvent(32);
        if (onDrawerScrollListener != null) {
            onDrawerScrollListener.onScrollEnded();
        }
    }

    private void closeDrawer() {
        moveHandle(COLLAPSED_FULL_CLOSED);
        this.mContent.setVisibility(8);
        this.mContent.destroyDrawingCache();
        if (this.mExpanded) {
            this.mExpanded = false;
            OnDrawerCloseListener onDrawerCloseListener = this.mOnDrawerCloseListener;
            if (onDrawerCloseListener != null) {
                onDrawerCloseListener.onDrawerClosed();
            }
        }
    }

    private void openDrawer() {
        moveHandle(EXPANDED_FULL_OPEN);
        this.mContent.setVisibility(0);
        if (!this.mExpanded) {
            this.mExpanded = true;
            OnDrawerOpenListener onDrawerOpenListener = this.mOnDrawerOpenListener;
            if (onDrawerOpenListener != null) {
                onDrawerOpenListener.onDrawerOpened();
            }
        }
    }

    public void setOnDrawerOpenListener(OnDrawerOpenListener onDrawerOpenListener) {
        this.mOnDrawerOpenListener = onDrawerOpenListener;
    }

    public void setOnDrawerCloseListener(OnDrawerCloseListener onDrawerCloseListener) {
        this.mOnDrawerCloseListener = onDrawerCloseListener;
    }

    public void setOnDrawerScrollListener(OnDrawerScrollListener onDrawerScrollListener) {
        this.mOnDrawerScrollListener = onDrawerScrollListener;
    }

    public View getHandle() {
        return this.mHandle;
    }

    public View getContent() {
        return this.mContent;
    }

    public void unlock() {
        this.mLocked = false;
    }

    public void lock() {
        this.mLocked = true;
    }

    public boolean isOpened() {
        return this.mExpanded;
    }

    public boolean isMoving() {
        return this.mTracking || this.mAnimating;
    }

    /* renamed from: org.linphone.ui.SlidingDrawer$DrawerToggler */
    private class DrawerToggler implements View.OnClickListener {
        private DrawerToggler() {
        }

        public void onClick(View view) {
            if (!SlidingDrawer.this.mLocked) {
                if (SlidingDrawer.this.mAnimateOnClick) {
                    SlidingDrawer.this.animateToggle();
                } else {
                    SlidingDrawer.this.toggle();
                }
            }
        }
    }

    /* renamed from: org.linphone.ui.SlidingDrawer$SlidingHandler */
    private class SlidingHandler extends Handler {
        private SlidingHandler() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1000) {
                SlidingDrawer.this.doAnimation();
            }
        }
    }
}
