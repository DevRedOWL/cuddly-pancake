package com.kyleduo.switchbutton;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;

public class SwitchButton extends CompoundButton {
    private static int[] CHECKED_PRESSED_STATE = {16842912, 16842910, 16842919};
    public static final int DEFAULT_ANIMATION_DURATION = 250;
    public static final int DEFAULT_THUMB_MARGIN_DP = 2;
    public static final float DEFAULT_THUMB_RANGE_RATIO = 1.8f;
    public static final int DEFAULT_THUMB_SIZE_DP = 20;
    public static final int DEFAULT_TINT_COLOR = 3309506;
    private static int[] UNCHECKED_PRESSED_STATE = {-16842912, 16842910, 16842919};
    private long mAnimationDuration;
    private ColorStateList mBackColor;
    private Drawable mBackDrawable;
    private int mBackHeight;
    private float mBackRadius;
    private RectF mBackRectF;
    private int mBackWidth;
    private boolean mCatch = false;
    private CompoundButton.OnCheckedChangeListener mChildOnCheckedChangeListener;
    private int mClickTimeout;
    private int mCurrBackColor;
    private int mCurrThumbColor;
    private Drawable mCurrentBackDrawable;
    private boolean mDrawDebugRect = false;
    private boolean mFadeBack;
    private boolean mIsBackUseDrawable;
    private boolean mIsThumbUseDrawable;
    private float mLastX;
    private int mNextBackColor;
    private Drawable mNextBackDrawable;
    private Layout mOffLayout;
    private int mOffTextColor;
    private Layout mOnLayout;
    private int mOnTextColor;
    private Paint mPaint;
    private RectF mPresentThumbRectF;
    private float mProgress;
    private ObjectAnimator mProgressAnimator;
    private boolean mReady = false;
    private Paint mRectPaint;
    private boolean mRestoring = false;
    private RectF mSafeRectF;
    private float mStartX;
    private float mStartY;
    private int mTextAdjust;
    private int mTextExtra;
    private float mTextHeight;
    private CharSequence mTextOff;
    private RectF mTextOffRectF;
    private CharSequence mTextOn;
    private RectF mTextOnRectF;
    private TextPaint mTextPaint;
    private int mTextThumbInset;
    private float mTextWidth;
    private ColorStateList mThumbColor;
    private Drawable mThumbDrawable;
    private int mThumbHeight;
    private RectF mThumbMargin;
    private float mThumbRadius;
    private float mThumbRangeRatio;
    private RectF mThumbRectF;
    private int mThumbWidth;
    private int mTintColor;
    private int mTouchSlop;

    public SwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public SwitchButton(Context context) {
        super(context);
        init((AttributeSet) null);
    }

    private void init(AttributeSet attributeSet) {
        boolean z;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        ColorStateList colorStateList;
        Drawable drawable;
        ColorStateList colorStateList2;
        Drawable drawable2;
        float f8;
        float f9;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        String str2;
        float f10;
        TypedArray typedArray;
        ColorStateList colorStateList3;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mClickTimeout = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.mPaint = new Paint(1);
        this.mRectPaint = new Paint(1);
        this.mRectPaint.setStyle(Paint.Style.STROKE);
        this.mRectPaint.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.mTextPaint = getPaint();
        this.mThumbRectF = new RectF();
        this.mBackRectF = new RectF();
        this.mSafeRectF = new RectF();
        this.mThumbMargin = new RectF();
        this.mTextOnRectF = new RectF();
        this.mTextOffRectF = new RectF();
        this.mProgressAnimator = ObjectAnimator.ofFloat(this, "progress", new float[]{0.0f, 0.0f}).setDuration(250);
        this.mProgressAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mPresentThumbRectF = new RectF();
        float f11 = getResources().getDisplayMetrics().density * 2.0f;
        TypedArray obtainStyledAttributes = attributeSet2 == null ? null : getContext().obtainStyledAttributes(attributeSet2, C2768R.styleable.SwitchButton);
        if (obtainStyledAttributes != null) {
            drawable = obtainStyledAttributes.getDrawable(C2768R.styleable.SwitchButton_kswThumbDrawable);
            colorStateList = obtainStyledAttributes.getColorStateList(C2768R.styleable.SwitchButton_kswThumbColor);
            float dimension = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswThumbMargin, f11);
            float dimension2 = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswThumbMarginLeft, dimension);
            f6 = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswThumbMarginRight, dimension);
            float dimension3 = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswThumbMarginTop, dimension);
            float dimension4 = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswThumbMarginBottom, dimension);
            float dimension5 = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswThumbWidth, 0.0f);
            f8 = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswThumbHeight, 0.0f);
            float dimension6 = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswThumbRadius, -1.0f);
            float dimension7 = obtainStyledAttributes.getDimension(C2768R.styleable.SwitchButton_kswBackRadius, -1.0f);
            Drawable drawable3 = obtainStyledAttributes.getDrawable(C2768R.styleable.SwitchButton_kswBackDrawable);
            colorStateList2 = obtainStyledAttributes.getColorStateList(C2768R.styleable.SwitchButton_kswBackColor);
            float f12 = dimension4;
            float f13 = obtainStyledAttributes.getFloat(C2768R.styleable.SwitchButton_kswThumbRangeRatio, 1.8f);
            Drawable drawable4 = drawable3;
            int integer = obtainStyledAttributes.getInteger(C2768R.styleable.SwitchButton_kswAnimationDuration, 250);
            boolean z3 = obtainStyledAttributes.getBoolean(C2768R.styleable.SwitchButton_kswFadeBack, true);
            int color = obtainStyledAttributes.getColor(C2768R.styleable.SwitchButton_kswTintColor, 0);
            String string = obtainStyledAttributes.getString(C2768R.styleable.SwitchButton_kswTextOn);
            int i6 = color;
            String string2 = obtainStyledAttributes.getString(C2768R.styleable.SwitchButton_kswTextOff);
            String str3 = string;
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2768R.styleable.SwitchButton_kswTextThumbInset, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C2768R.styleable.SwitchButton_kswTextExtra, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(C2768R.styleable.SwitchButton_kswTextAdjust, 0);
            obtainStyledAttributes.recycle();
            i3 = dimensionPixelSize3;
            f = dimension7;
            f2 = dimension6;
            f3 = f13;
            i = integer;
            drawable2 = drawable4;
            z = z3;
            i2 = i6;
            str = string2;
            str2 = str3;
            f9 = dimension5;
            f5 = dimension2;
            f7 = f12;
            i5 = dimensionPixelSize;
            f4 = dimension3;
            i4 = dimensionPixelSize2;
        } else {
            str2 = null;
            str = null;
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            f9 = 0.0f;
            f8 = 0.0f;
            drawable2 = null;
            colorStateList2 = null;
            drawable = null;
            colorStateList = null;
            f7 = 0.0f;
            f6 = 0.0f;
            f5 = 0.0f;
            f4 = 0.0f;
            f3 = 1.8f;
            f2 = -1.0f;
            f = -1.0f;
            i = 250;
            z = true;
        }
        float f14 = f7;
        if (attributeSet2 == null) {
            f10 = f6;
            typedArray = null;
        } else {
            f10 = f6;
            typedArray = getContext().obtainStyledAttributes(attributeSet2, new int[]{16842970, 16842981});
        }
        if (typedArray != null) {
            colorStateList3 = colorStateList2;
            boolean z4 = typedArray.getBoolean(0, true);
            boolean z5 = typedArray.getBoolean(1, z4);
            setFocusable(z4);
            setClickable(z5);
            typedArray.recycle();
        } else {
            colorStateList3 = colorStateList2;
            setFocusable(true);
            setClickable(true);
        }
        this.mTextOn = str2;
        this.mTextOff = str;
        this.mTextThumbInset = i5;
        this.mTextExtra = i4;
        this.mTextAdjust = i3;
        this.mThumbDrawable = drawable;
        this.mThumbColor = colorStateList;
        this.mIsThumbUseDrawable = this.mThumbDrawable != null;
        this.mTintColor = i2;
        if (this.mTintColor == 0) {
            TypedValue typedValue = new TypedValue();
            z2 = true;
            if (getContext().getTheme().resolveAttribute(C2768R.attr.colorAccent, typedValue, true)) {
                this.mTintColor = typedValue.data;
            } else {
                this.mTintColor = DEFAULT_TINT_COLOR;
            }
        } else {
            z2 = true;
        }
        if (!this.mIsThumbUseDrawable && this.mThumbColor == null) {
            this.mThumbColor = ColorUtils.generateThumbColorWithTintColor(this.mTintColor);
            this.mCurrThumbColor = this.mThumbColor.getDefaultColor();
        }
        this.mThumbWidth = ceil((double) f9);
        this.mThumbHeight = ceil((double) f8);
        this.mBackDrawable = drawable2;
        this.mBackColor = colorStateList3;
        if (this.mBackDrawable == null) {
            z2 = false;
        }
        this.mIsBackUseDrawable = z2;
        if (!this.mIsBackUseDrawable && this.mBackColor == null) {
            this.mBackColor = ColorUtils.generateBackColorWithTintColor(this.mTintColor);
            this.mCurrBackColor = this.mBackColor.getDefaultColor();
            this.mNextBackColor = this.mBackColor.getColorForState(CHECKED_PRESSED_STATE, this.mCurrBackColor);
        }
        this.mThumbMargin.set(f5, f4, f10, f14);
        float f15 = f3;
        if (this.mThumbMargin.width() >= 0.0f) {
            f15 = Math.max(f15, 1.0f);
        }
        this.mThumbRangeRatio = f15;
        this.mThumbRadius = f2;
        this.mBackRadius = f;
        this.mAnimationDuration = (long) i;
        this.mFadeBack = z;
        this.mProgressAnimator.setDuration(this.mAnimationDuration);
        if (isChecked()) {
            setProgress(1.0f);
        }
    }

    private Layout makeLayout(CharSequence charSequence) {
        TextPaint textPaint = this.mTextPaint;
        return new StaticLayout(charSequence, textPaint, (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOnLayout == null && !TextUtils.isEmpty(this.mTextOn)) {
            this.mOnLayout = makeLayout(this.mTextOn);
        }
        if (this.mOffLayout == null && !TextUtils.isEmpty(this.mTextOff)) {
            this.mOffLayout = makeLayout(this.mTextOff);
        }
        Layout layout = this.mOnLayout;
        float width = layout != null ? (float) layout.getWidth() : 0.0f;
        Layout layout2 = this.mOffLayout;
        float width2 = layout2 != null ? (float) layout2.getWidth() : 0.0f;
        if (width == 0.0f && width2 == 0.0f) {
            this.mTextWidth = 0.0f;
        } else {
            this.mTextWidth = Math.max(width, width2);
        }
        Layout layout3 = this.mOnLayout;
        float height = layout3 != null ? (float) layout3.getHeight() : 0.0f;
        Layout layout4 = this.mOffLayout;
        float height2 = layout4 != null ? (float) layout4.getHeight() : 0.0f;
        if (height == 0.0f && height2 == 0.0f) {
            this.mTextHeight = 0.0f;
        } else {
            this.mTextHeight = Math.max(height, height2);
        }
        setMeasuredDimension(measureWidth(i), measureHeight(i2));
    }

    private int measureWidth(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.mThumbWidth == 0 && this.mIsThumbUseDrawable) {
            this.mThumbWidth = this.mThumbDrawable.getIntrinsicWidth();
        }
        int ceil = ceil((double) this.mTextWidth);
        if (this.mThumbRangeRatio == 0.0f) {
            this.mThumbRangeRatio = 1.8f;
        }
        if (mode == 1073741824) {
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i2 = this.mThumbWidth;
            if (i2 != 0) {
                int ceil2 = ceil((double) (((float) i2) * this.mThumbRangeRatio));
                int ceil3 = (this.mTextExtra + ceil) - ((ceil2 - this.mThumbWidth) + ceil((double) Math.max(this.mThumbMargin.left, this.mThumbMargin.right)));
                float f = (float) ceil2;
                this.mBackWidth = ceil((double) (this.mThumbMargin.left + f + this.mThumbMargin.right + ((float) Math.max(ceil3, 0))));
                if (this.mBackWidth < 0) {
                    this.mThumbWidth = 0;
                }
                if (f + Math.max(this.mThumbMargin.left, 0.0f) + Math.max(this.mThumbMargin.right, 0.0f) + ((float) Math.max(ceil3, 0)) > ((float) paddingLeft)) {
                    this.mThumbWidth = 0;
                }
            }
            if (this.mThumbWidth != 0) {
                return size;
            }
            int ceil4 = ceil((double) ((((float) ((size - getPaddingLeft()) - getPaddingRight())) - Math.max(this.mThumbMargin.left, 0.0f)) - Math.max(this.mThumbMargin.right, 0.0f)));
            if (ceil4 < 0) {
                this.mThumbWidth = 0;
                this.mBackWidth = 0;
                return size;
            }
            float f2 = (float) ceil4;
            this.mThumbWidth = ceil((double) (f2 / this.mThumbRangeRatio));
            this.mBackWidth = ceil((double) (f2 + this.mThumbMargin.left + this.mThumbMargin.right));
            if (this.mBackWidth < 0) {
                this.mThumbWidth = 0;
                this.mBackWidth = 0;
                return size;
            }
            int ceil5 = (ceil + this.mTextExtra) - ((ceil4 - this.mThumbWidth) + ceil((double) Math.max(this.mThumbMargin.left, this.mThumbMargin.right)));
            if (ceil5 > 0) {
                this.mThumbWidth -= ceil5;
            }
            if (this.mThumbWidth >= 0) {
                return size;
            }
            this.mThumbWidth = 0;
            this.mBackWidth = 0;
            return size;
        }
        if (this.mThumbWidth == 0) {
            this.mThumbWidth = ceil((double) (getResources().getDisplayMetrics().density * 20.0f));
        }
        if (this.mThumbRangeRatio == 0.0f) {
            this.mThumbRangeRatio = 1.8f;
        }
        int ceil6 = ceil((double) (((float) this.mThumbWidth) * this.mThumbRangeRatio));
        int ceil7 = ceil((double) (((float) (ceil + this.mTextExtra)) - ((((float) (ceil6 - this.mThumbWidth)) + Math.max(this.mThumbMargin.left, this.mThumbMargin.right)) + ((float) this.mTextThumbInset))));
        float f3 = (float) ceil6;
        this.mBackWidth = ceil((double) (this.mThumbMargin.left + f3 + this.mThumbMargin.right + ((float) Math.max(0, ceil7))));
        if (this.mBackWidth < 0) {
            this.mThumbWidth = 0;
            this.mBackWidth = 0;
            return size;
        }
        int ceil8 = ceil((double) (f3 + Math.max(0.0f, this.mThumbMargin.left) + Math.max(0.0f, this.mThumbMargin.right) + ((float) Math.max(0, ceil7))));
        return Math.max(ceil8, getPaddingLeft() + ceil8 + getPaddingRight());
    }

    private int measureHeight(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.mThumbHeight == 0 && this.mIsThumbUseDrawable) {
            this.mThumbHeight = this.mThumbDrawable.getIntrinsicHeight();
        }
        if (mode == 1073741824) {
            int i2 = this.mThumbHeight;
            if (i2 != 0) {
                this.mBackHeight = ceil((double) (((float) i2) + this.mThumbMargin.top + this.mThumbMargin.bottom));
                this.mBackHeight = ceil((double) Math.max((float) this.mBackHeight, this.mTextHeight));
                if ((((float) ((this.mBackHeight + getPaddingTop()) + getPaddingBottom())) - Math.min(0.0f, this.mThumbMargin.top)) - Math.min(0.0f, this.mThumbMargin.bottom) > ((float) size)) {
                    this.mThumbHeight = 0;
                }
            }
            if (this.mThumbHeight == 0) {
                this.mBackHeight = ceil((double) (((float) ((size - getPaddingTop()) - getPaddingBottom())) + Math.min(0.0f, this.mThumbMargin.top) + Math.min(0.0f, this.mThumbMargin.bottom)));
                int i3 = this.mBackHeight;
                if (i3 < 0) {
                    this.mBackHeight = 0;
                    this.mThumbHeight = 0;
                    return size;
                }
                this.mThumbHeight = ceil((double) ((((float) i3) - this.mThumbMargin.top) - this.mThumbMargin.bottom));
            }
            if (this.mThumbHeight >= 0) {
                return size;
            }
            this.mBackHeight = 0;
            this.mThumbHeight = 0;
            return size;
        }
        if (this.mThumbHeight == 0) {
            this.mThumbHeight = ceil((double) (getResources().getDisplayMetrics().density * 20.0f));
        }
        this.mBackHeight = ceil((double) (((float) this.mThumbHeight) + this.mThumbMargin.top + this.mThumbMargin.bottom));
        int i4 = this.mBackHeight;
        if (i4 < 0) {
            this.mBackHeight = 0;
            this.mThumbHeight = 0;
            return size;
        }
        int ceil = ceil((double) (this.mTextHeight - ((float) i4)));
        if (ceil > 0) {
            this.mBackHeight += ceil;
            this.mThumbHeight += ceil;
        }
        int max = Math.max(this.mThumbHeight, this.mBackHeight);
        return Math.max(Math.max(max, getPaddingTop() + max + getPaddingBottom()), getSuggestedMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            setup();
        }
    }

    private int ceil(double d) {
        return (int) Math.ceil(d);
    }

    private void setup() {
        int i;
        float f;
        float f2;
        int i2 = this.mThumbWidth;
        if (i2 != 0 && (i = this.mThumbHeight) != 0 && this.mBackWidth != 0 && this.mBackHeight != 0) {
            if (this.mThumbRadius == -1.0f) {
                this.mThumbRadius = (float) (Math.min(i2, i) / 2);
            }
            if (this.mBackRadius == -1.0f) {
                this.mBackRadius = (float) (Math.min(this.mBackWidth, this.mBackHeight) / 2);
            }
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int ceil = ceil((double) ((((float) this.mBackWidth) - Math.min(0.0f, this.mThumbMargin.left)) - Math.min(0.0f, this.mThumbMargin.right)));
            int ceil2 = ceil((double) ((((float) this.mBackHeight) - Math.min(0.0f, this.mThumbMargin.top)) - Math.min(0.0f, this.mThumbMargin.bottom)));
            if (measuredHeight <= ceil2) {
                f = ((float) getPaddingTop()) + Math.max(0.0f, this.mThumbMargin.top);
            } else {
                f = ((float) (((measuredHeight - ceil2) + 1) / 2)) + ((float) getPaddingTop()) + Math.max(0.0f, this.mThumbMargin.top);
            }
            if (measuredWidth <= this.mBackWidth) {
                f2 = ((float) getPaddingLeft()) + Math.max(0.0f, this.mThumbMargin.left);
            } else {
                f2 = ((float) (((measuredWidth - ceil) + 1) / 2)) + ((float) getPaddingLeft()) + Math.max(0.0f, this.mThumbMargin.left);
            }
            this.mThumbRectF.set(f2, f, ((float) this.mThumbWidth) + f2, ((float) this.mThumbHeight) + f);
            float f3 = this.mThumbRectF.left - this.mThumbMargin.left;
            this.mBackRectF.set(f3, this.mThumbRectF.top - this.mThumbMargin.top, ((float) this.mBackWidth) + f3, (this.mThumbRectF.top - this.mThumbMargin.top) + ((float) this.mBackHeight));
            this.mSafeRectF.set(this.mThumbRectF.left, 0.0f, (this.mBackRectF.right - this.mThumbMargin.right) - this.mThumbRectF.width(), 0.0f);
            this.mBackRadius = Math.min(Math.min(this.mBackRectF.width(), this.mBackRectF.height()) / 2.0f, this.mBackRadius);
            Drawable drawable = this.mBackDrawable;
            if (drawable != null) {
                drawable.setBounds((int) this.mBackRectF.left, (int) this.mBackRectF.top, ceil((double) this.mBackRectF.right), ceil((double) this.mBackRectF.bottom));
            }
            if (this.mOnLayout != null) {
                float width = (this.mBackRectF.left + (((((this.mBackRectF.width() + ((float) this.mTextThumbInset)) - ((float) this.mThumbWidth)) - this.mThumbMargin.right) - ((float) this.mOnLayout.getWidth())) / 2.0f)) - ((float) this.mTextAdjust);
                float height = this.mBackRectF.top + ((this.mBackRectF.height() - ((float) this.mOnLayout.getHeight())) / 2.0f);
                this.mTextOnRectF.set(width, height, ((float) this.mOnLayout.getWidth()) + width, ((float) this.mOnLayout.getHeight()) + height);
            }
            if (this.mOffLayout != null) {
                float width2 = ((this.mBackRectF.right - (((((this.mBackRectF.width() + ((float) this.mTextThumbInset)) - ((float) this.mThumbWidth)) - this.mThumbMargin.left) - ((float) this.mOffLayout.getWidth())) / 2.0f)) - ((float) this.mOffLayout.getWidth())) + ((float) this.mTextAdjust);
                float height2 = this.mBackRectF.top + ((this.mBackRectF.height() - ((float) this.mOffLayout.getHeight())) / 2.0f);
                this.mTextOffRectF.set(width2, height2, ((float) this.mOffLayout.getWidth()) + width2, ((float) this.mOffLayout.getHeight()) + height2);
            }
            this.mReady = true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            super.onDraw(r14)
            boolean r0 = r13.mReady
            if (r0 != 0) goto L_0x000a
            r13.setup()
        L_0x000a:
            boolean r0 = r13.mReady
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            boolean r0 = r13.mIsBackUseDrawable
            r1 = 1132396544(0x437f0000, float:255.0)
            r2 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x005c
            boolean r0 = r13.mFadeBack
            if (r0 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r0 = r13.mCurrentBackDrawable
            if (r0 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r0 = r13.mNextBackDrawable
            if (r0 == 0) goto L_0x0050
            boolean r0 = r13.isChecked()
            if (r0 == 0) goto L_0x002c
            android.graphics.drawable.Drawable r0 = r13.mCurrentBackDrawable
            goto L_0x002e
        L_0x002c:
            android.graphics.drawable.Drawable r0 = r13.mNextBackDrawable
        L_0x002e:
            boolean r3 = r13.isChecked()
            if (r3 == 0) goto L_0x0037
            android.graphics.drawable.Drawable r3 = r13.mNextBackDrawable
            goto L_0x0039
        L_0x0037:
            android.graphics.drawable.Drawable r3 = r13.mCurrentBackDrawable
        L_0x0039:
            float r4 = r13.getProgress()
            float r4 = r4 * r1
            int r4 = (int) r4
            r0.setAlpha(r4)
            r0.draw(r14)
            int r0 = 255 - r4
            r3.setAlpha(r0)
            r3.draw(r14)
            goto L_0x00d7
        L_0x0050:
            android.graphics.drawable.Drawable r0 = r13.mBackDrawable
            r0.setAlpha(r2)
            android.graphics.drawable.Drawable r0 = r13.mBackDrawable
            r0.draw(r14)
            goto L_0x00d7
        L_0x005c:
            boolean r0 = r13.mFadeBack
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r13.isChecked()
            if (r0 == 0) goto L_0x0069
            int r0 = r13.mCurrBackColor
            goto L_0x006b
        L_0x0069:
            int r0 = r13.mNextBackColor
        L_0x006b:
            boolean r3 = r13.isChecked()
            if (r3 == 0) goto L_0x0074
            int r3 = r13.mNextBackColor
            goto L_0x0076
        L_0x0074:
            int r3 = r13.mCurrBackColor
        L_0x0076:
            float r4 = r13.getProgress()
            float r4 = r4 * r1
            int r4 = (int) r4
            int r5 = android.graphics.Color.alpha(r0)
            int r5 = r5 * r4
            int r5 = r5 / r2
            android.graphics.Paint r6 = r13.mPaint
            int r7 = android.graphics.Color.red(r0)
            int r8 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.blue(r0)
            r6.setARGB(r5, r7, r8, r0)
            android.graphics.RectF r0 = r13.mBackRectF
            float r5 = r13.mBackRadius
            android.graphics.Paint r6 = r13.mPaint
            r14.drawRoundRect(r0, r5, r5, r6)
            int r0 = 255 - r4
            int r4 = android.graphics.Color.alpha(r3)
            int r4 = r4 * r0
            int r4 = r4 / r2
            android.graphics.Paint r0 = r13.mPaint
            int r5 = android.graphics.Color.red(r3)
            int r6 = android.graphics.Color.green(r3)
            int r3 = android.graphics.Color.blue(r3)
            r0.setARGB(r4, r5, r6, r3)
            android.graphics.RectF r0 = r13.mBackRectF
            float r3 = r13.mBackRadius
            android.graphics.Paint r4 = r13.mPaint
            r14.drawRoundRect(r0, r3, r3, r4)
            android.graphics.Paint r0 = r13.mPaint
            r0.setAlpha(r2)
            goto L_0x00d7
        L_0x00c7:
            android.graphics.Paint r0 = r13.mPaint
            int r3 = r13.mCurrBackColor
            r0.setColor(r3)
            android.graphics.RectF r0 = r13.mBackRectF
            float r3 = r13.mBackRadius
            android.graphics.Paint r4 = r13.mPaint
            r14.drawRoundRect(r0, r3, r3, r4)
        L_0x00d7:
            float r0 = r13.getProgress()
            double r3 = (double) r0
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e5
            android.text.Layout r0 = r13.mOnLayout
            goto L_0x00e7
        L_0x00e5:
            android.text.Layout r0 = r13.mOffLayout
        L_0x00e7:
            float r3 = r13.getProgress()
            double r3 = (double) r3
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f3
            android.graphics.RectF r3 = r13.mTextOnRectF
            goto L_0x00f5
        L_0x00f3:
            android.graphics.RectF r3 = r13.mTextOffRectF
        L_0x00f5:
            r4 = 0
            if (r0 == 0) goto L_0x015d
            if (r3 == 0) goto L_0x015d
            float r7 = r13.getProgress()
            double r7 = (double) r7
            r9 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            r11 = 1082130432(0x40800000, float:4.0)
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            float r7 = r13.getProgress()
            if (r12 < 0) goto L_0x0111
            float r7 = r7 * r11
            r8 = 1077936128(0x40400000, float:3.0)
        L_0x010f:
            float r7 = r7 - r8
            goto L_0x0122
        L_0x0111:
            double r7 = (double) r7
            r9 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x0121
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r13.getProgress()
            float r8 = r8 * r11
            goto L_0x010f
        L_0x0121:
            r7 = 0
        L_0x0122:
            float r7 = r7 * r1
            int r1 = (int) r7
            float r7 = r13.getProgress()
            double r7 = (double) r7
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0131
            int r7 = r13.mOnTextColor
            goto L_0x0133
        L_0x0131:
            int r7 = r13.mOffTextColor
        L_0x0133:
            int r8 = android.graphics.Color.alpha(r7)
            int r8 = r8 * r1
            int r8 = r8 / r2
            android.text.TextPaint r1 = r0.getPaint()
            int r2 = android.graphics.Color.red(r7)
            int r9 = android.graphics.Color.green(r7)
            int r7 = android.graphics.Color.blue(r7)
            r1.setARGB(r8, r2, r9, r7)
            r14.save()
            float r1 = r3.left
            float r2 = r3.top
            r14.translate(r1, r2)
            r0.draw(r14)
            r14.restore()
        L_0x015d:
            android.graphics.RectF r0 = r13.mPresentThumbRectF
            android.graphics.RectF r1 = r13.mThumbRectF
            r0.set(r1)
            android.graphics.RectF r0 = r13.mPresentThumbRectF
            float r1 = r13.mProgress
            android.graphics.RectF r2 = r13.mSafeRectF
            float r2 = r2.width()
            float r1 = r1 * r2
            r0.offset(r1, r4)
            boolean r0 = r13.mIsThumbUseDrawable
            if (r0 == 0) goto L_0x019e
            android.graphics.drawable.Drawable r0 = r13.mThumbDrawable
            android.graphics.RectF r1 = r13.mPresentThumbRectF
            float r1 = r1.left
            int r1 = (int) r1
            android.graphics.RectF r2 = r13.mPresentThumbRectF
            float r2 = r2.top
            int r2 = (int) r2
            android.graphics.RectF r3 = r13.mPresentThumbRectF
            float r3 = r3.right
            double r3 = (double) r3
            int r3 = r13.ceil(r3)
            android.graphics.RectF r4 = r13.mPresentThumbRectF
            float r4 = r4.bottom
            double r7 = (double) r4
            int r4 = r13.ceil(r7)
            r0.setBounds(r1, r2, r3, r4)
            android.graphics.drawable.Drawable r0 = r13.mThumbDrawable
            r0.draw(r14)
            goto L_0x01ae
        L_0x019e:
            android.graphics.Paint r0 = r13.mPaint
            int r1 = r13.mCurrThumbColor
            r0.setColor(r1)
            android.graphics.RectF r0 = r13.mPresentThumbRectF
            float r1 = r13.mThumbRadius
            android.graphics.Paint r2 = r13.mPaint
            r14.drawRoundRect(r0, r1, r1, r2)
        L_0x01ae:
            boolean r0 = r13.mDrawDebugRect
            if (r0 == 0) goto L_0x0215
            android.graphics.Paint r0 = r13.mRectPaint
            java.lang.String r1 = "#AA0000"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            android.graphics.RectF r0 = r13.mBackRectF
            android.graphics.Paint r1 = r13.mRectPaint
            r14.drawRect(r0, r1)
            android.graphics.Paint r0 = r13.mRectPaint
            java.lang.String r1 = "#0000FF"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            android.graphics.RectF r0 = r13.mPresentThumbRectF
            android.graphics.Paint r1 = r13.mRectPaint
            r14.drawRect(r0, r1)
            android.graphics.Paint r0 = r13.mRectPaint
            java.lang.String r1 = "#000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            android.graphics.RectF r0 = r13.mSafeRectF
            float r8 = r0.left
            android.graphics.RectF r0 = r13.mThumbRectF
            float r9 = r0.top
            android.graphics.RectF r0 = r13.mSafeRectF
            float r10 = r0.right
            android.graphics.RectF r0 = r13.mThumbRectF
            float r11 = r0.top
            android.graphics.Paint r12 = r13.mRectPaint
            r7 = r14
            r7.drawLine(r8, r9, r10, r11, r12)
            android.graphics.Paint r0 = r13.mRectPaint
            java.lang.String r1 = "#00CC00"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            float r0 = r13.getProgress()
            double r0 = (double) r0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x020e
            android.graphics.RectF r0 = r13.mTextOnRectF
            goto L_0x0210
        L_0x020e:
            android.graphics.RectF r0 = r13.mTextOffRectF
        L_0x0210:
            android.graphics.Paint r1 = r13.mRectPaint
            r14.drawRect(r0, r1)
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kyleduo.switchbutton.SwitchButton.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.mIsThumbUseDrawable || (colorStateList2 = this.mThumbColor) == null) {
            setDrawableState(this.mThumbDrawable);
        } else {
            this.mCurrThumbColor = colorStateList2.getColorForState(getDrawableState(), this.mCurrThumbColor);
        }
        int[] iArr = isChecked() ? UNCHECKED_PRESSED_STATE : CHECKED_PRESSED_STATE;
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.mOnTextColor = textColors.getColorForState(CHECKED_PRESSED_STATE, defaultColor);
            this.mOffTextColor = textColors.getColorForState(UNCHECKED_PRESSED_STATE, defaultColor);
        }
        if (this.mIsBackUseDrawable || (colorStateList = this.mBackColor) == null) {
            Drawable drawable = this.mBackDrawable;
            if (!(drawable instanceof StateListDrawable) || !this.mFadeBack) {
                this.mNextBackDrawable = null;
            } else {
                drawable.setState(iArr);
                this.mNextBackDrawable = this.mBackDrawable.getCurrent().mutate();
            }
            setDrawableState(this.mBackDrawable);
            Drawable drawable2 = this.mBackDrawable;
            if (drawable2 != null) {
                this.mCurrentBackDrawable = drawable2.getCurrent().mutate();
                return;
            }
            return;
        }
        this.mCurrBackColor = colorStateList.getColorForState(getDrawableState(), this.mCurrBackColor);
        this.mNextBackColor = this.mBackColor.getColorForState(iArr, this.mCurrBackColor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0 != 3) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r9.isClickable()
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r9.isFocusable()
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r9.mReady
            if (r0 != 0) goto L_0x0019
            goto L_0x00e9
        L_0x0019:
            int r0 = r10.getAction()
            float r2 = r10.getX()
            float r3 = r9.mStartX
            float r2 = r2 - r3
            float r3 = r10.getY()
            float r4 = r9.mStartY
            float r3 = r3 - r4
            r4 = 1
            if (r0 == 0) goto L_0x00d5
            if (r0 == r4) goto L_0x0090
            r5 = 2
            if (r0 == r5) goto L_0x0038
            r5 = 3
            if (r0 == r5) goto L_0x0090
            goto L_0x00e8
        L_0x0038:
            float r10 = r10.getX()
            float r0 = r9.getProgress()
            float r6 = r9.mLastX
            float r6 = r10 - r6
            android.graphics.RectF r7 = r9.mSafeRectF
            float r7 = r7.width()
            float r6 = r6 / r7
            float r0 = r0 + r6
            r9.setProgress(r0)
            boolean r0 = r9.mCatch
            if (r0 != 0) goto L_0x008d
            float r0 = java.lang.Math.abs(r2)
            int r6 = r9.mTouchSlop
            int r6 = r6 / r5
            float r6 = (float) r6
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            float r0 = java.lang.Math.abs(r3)
            int r6 = r9.mTouchSlop
            int r6 = r6 / r5
            float r5 = (float) r6
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
        L_0x006b:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
            float r0 = java.lang.Math.abs(r2)
            float r5 = java.lang.Math.abs(r3)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            goto L_0x008a
        L_0x007d:
            float r0 = java.lang.Math.abs(r3)
            float r2 = java.lang.Math.abs(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            return r1
        L_0x008a:
            r9.catchView()
        L_0x008d:
            r9.mLastX = r10
            goto L_0x00e8
        L_0x0090:
            r9.mCatch = r1
            r9.setPressed(r1)
            long r5 = r10.getEventTime()
            long r7 = r10.getDownTime()
            long r5 = r5 - r7
            float r10 = (float) r5
            float r0 = java.lang.Math.abs(r2)
            int r2 = r9.mTouchSlop
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            float r0 = java.lang.Math.abs(r3)
            int r2 = r9.mTouchSlop
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            int r0 = r9.mClickTimeout
            float r0 = (float) r0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c0
            r9.performClick()
            goto L_0x00e8
        L_0x00c0:
            boolean r10 = r9.getStatusBasedOnPos()
            boolean r0 = r9.isChecked()
            if (r10 == r0) goto L_0x00d1
            r9.playSoundEffect(r1)
            r9.setChecked(r10)
            goto L_0x00e8
        L_0x00d1:
            r9.animateToState(r10)
            goto L_0x00e8
        L_0x00d5:
            float r0 = r10.getX()
            r9.mStartX = r0
            float r10 = r10.getY()
            r9.mStartY = r10
            float r10 = r9.mStartX
            r9.mLastX = r10
            r9.setPressed(r4)
        L_0x00e8:
            return r4
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kyleduo.switchbutton.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean getStatusBasedOnPos() {
        return getProgress() > 0.5f;
    }

    private float getProgress() {
        return this.mProgress;
    }

    private void setProgress(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.mProgress = f;
        invalidate();
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: protected */
    public void animateToState(boolean z) {
        ObjectAnimator objectAnimator = this.mProgressAnimator;
        if (objectAnimator != null) {
            if (objectAnimator.isRunning()) {
                this.mProgressAnimator.cancel();
            }
            this.mProgressAnimator.setDuration(this.mAnimationDuration);
            if (z) {
                this.mProgressAnimator.setFloatValues(new float[]{this.mProgress, 1.0f});
            } else {
                this.mProgressAnimator.setFloatValues(new float[]{this.mProgress, 0.0f});
            }
            this.mProgressAnimator.start();
        }
    }

    private void catchView() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.mCatch = true;
    }

    public void setChecked(boolean z) {
        if (isChecked() != z) {
            animateToState(z);
        }
        if (this.mRestoring) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.mChildOnCheckedChangeListener == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        if (this.mChildOnCheckedChangeListener == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void toggleNoEvent() {
        if (this.mChildOnCheckedChangeListener == null) {
            toggle();
            return;
        }
        super.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        toggle();
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void toggleImmediatelyNoEvent() {
        if (this.mChildOnCheckedChangeListener == null) {
            toggleImmediately();
            return;
        }
        super.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        toggleImmediately();
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.mChildOnCheckedChangeListener = onCheckedChangeListener;
    }

    public void setCheckedImmediately(boolean z) {
        super.setChecked(z);
        ObjectAnimator objectAnimator = this.mProgressAnimator;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.mProgressAnimator.cancel();
        }
        setProgress(z ? 1.0f : 0.0f);
        invalidate();
    }

    public void toggleImmediately() {
        setCheckedImmediately(!isChecked());
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    public boolean isDrawDebugRect() {
        return this.mDrawDebugRect;
    }

    public void setDrawDebugRect(boolean z) {
        this.mDrawDebugRect = z;
        invalidate();
    }

    public long getAnimationDuration() {
        return this.mAnimationDuration;
    }

    public void setAnimationDuration(long j) {
        this.mAnimationDuration = j;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.mThumbDrawable = drawable;
        this.mIsThumbUseDrawable = this.mThumbDrawable != null;
        refreshDrawableState();
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int i) {
        setThumbDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public Drawable getBackDrawable() {
        return this.mBackDrawable;
    }

    public void setBackDrawable(Drawable drawable) {
        this.mBackDrawable = drawable;
        this.mIsBackUseDrawable = this.mBackDrawable != null;
        refreshDrawableState();
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int i) {
        setBackDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public ColorStateList getBackColor() {
        return this.mBackColor;
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.mBackColor = colorStateList;
        if (this.mBackColor != null) {
            setBackDrawable((Drawable) null);
        }
        invalidate();
    }

    public void setBackColorRes(int i) {
        setBackColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public ColorStateList getThumbColor() {
        return this.mThumbColor;
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.mThumbColor = colorStateList;
        if (this.mThumbColor != null) {
            setThumbDrawable((Drawable) null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i) {
        setThumbColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public float getThumbRangeRatio() {
        return this.mThumbRangeRatio;
    }

    public void setThumbRangeRatio(float f) {
        this.mThumbRangeRatio = f;
        this.mReady = false;
        requestLayout();
    }

    public RectF getThumbMargin() {
        return this.mThumbMargin;
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            setThumbMargin(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            setThumbMargin(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbMargin(float f, float f2, float f3, float f4) {
        this.mThumbMargin.set(f, f2, f3, f4);
        this.mReady = false;
        requestLayout();
    }

    public void setThumbSize(int i, int i2) {
        this.mThumbWidth = i;
        this.mThumbHeight = i2;
        this.mReady = false;
        requestLayout();
    }

    public float getThumbWidth() {
        return (float) this.mThumbWidth;
    }

    public float getThumbHeight() {
        return (float) this.mThumbHeight;
    }

    public float getThumbRadius() {
        return this.mThumbRadius;
    }

    public void setThumbRadius(float f) {
        this.mThumbRadius = f;
        if (!this.mIsThumbUseDrawable) {
            invalidate();
        }
    }

    public PointF getBackSizeF() {
        return new PointF(this.mBackRectF.width(), this.mBackRectF.height());
    }

    public float getBackRadius() {
        return this.mBackRadius;
    }

    public void setBackRadius(float f) {
        this.mBackRadius = f;
        if (!this.mIsBackUseDrawable) {
            invalidate();
        }
    }

    public boolean isFadeBack() {
        return this.mFadeBack;
    }

    public void setFadeBack(boolean z) {
        this.mFadeBack = z;
    }

    public int getTintColor() {
        return this.mTintColor;
    }

    public void setTintColor(int i) {
        this.mTintColor = i;
        this.mThumbColor = ColorUtils.generateThumbColorWithTintColor(this.mTintColor);
        this.mBackColor = ColorUtils.generateBackColorWithTintColor(this.mTintColor);
        this.mIsBackUseDrawable = false;
        this.mIsThumbUseDrawable = false;
        refreshDrawableState();
        invalidate();
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        this.mTextOn = charSequence;
        this.mTextOff = charSequence2;
        this.mOnLayout = null;
        this.mOffLayout = null;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public void setTextThumbInset(int i) {
        this.mTextThumbInset = i;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i) {
        this.mTextExtra = i;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setTextAdjust(int i) {
        this.mTextAdjust = i;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.onText = this.mTextOn;
        savedState.offText = this.mTextOff;
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        setText(savedState.onText, savedState.offText);
        this.mRestoring = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mRestoring = false;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        CharSequence offText;
        CharSequence onText;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.onText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.offText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.onText, parcel, i);
            TextUtils.writeToParcel(this.offText, parcel, i);
        }
    }
}
