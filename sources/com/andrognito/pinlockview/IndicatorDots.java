package com.andrognito.pinlockview;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class IndicatorDots extends LinearLayout {
    private static final int DEFAULT_PIN_LENGTH = 4;
    private int mDotDiameter;
    private int mDotSpacing;
    private int mEmptyDrawable;
    private int mFillDrawable;
    private int mIndicatorType;
    private int mPinLength;
    private int mPreviousLength;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorType {
        public static final int FILL = 1;
        public static final int FILL_WITH_ANIMATION = 2;
        public static final int FIXED = 0;
    }

    public IndicatorDots(Context context) {
        this(context, (AttributeSet) null);
    }

    public IndicatorDots(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public IndicatorDots(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1071R.styleable.PinLockView);
        try {
            this.mDotDiameter = (int) obtainStyledAttributes.getDimension(C1071R.styleable.PinLockView_dotDiameter, ResourceUtils.getDimensionInPx(getContext(), C1071R.dimen.default_dot_diameter));
            this.mDotSpacing = (int) obtainStyledAttributes.getDimension(C1071R.styleable.PinLockView_dotSpacing, ResourceUtils.getDimensionInPx(getContext(), C1071R.dimen.default_dot_spacing));
            this.mFillDrawable = obtainStyledAttributes.getResourceId(C1071R.styleable.PinLockView_dotFilledBackground, C1071R.C1073drawable.dot_filled);
            this.mEmptyDrawable = obtainStyledAttributes.getResourceId(C1071R.styleable.PinLockView_dotEmptyBackground, C1071R.C1073drawable.dot_empty);
            this.mPinLength = obtainStyledAttributes.getInt(C1071R.styleable.PinLockView_pinLength, 4);
            this.mIndicatorType = obtainStyledAttributes.getInt(C1071R.styleable.PinLockView_indicatorType, 0);
            obtainStyledAttributes.recycle();
            initView(context);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void initView(Context context) {
        ViewCompat.setLayoutDirection(this, 0);
        int i = this.mIndicatorType;
        if (i == 0) {
            for (int i2 = 0; i2 < this.mPinLength; i2++) {
                View view = new View(context);
                emptyDot(view);
                int i3 = this.mDotDiameter;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
                int i4 = this.mDotSpacing;
                layoutParams.setMargins(i4, 0, i4, 0);
                view.setLayoutParams(layoutParams);
                addView(view);
            }
        } else if (i == 2) {
            setLayoutTransition(new LayoutTransition());
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mIndicatorType != 0) {
            getLayoutParams().height = this.mDotDiameter;
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateDot(int i) {
        if (this.mIndicatorType == 0) {
            if (i > 0) {
                if (i > this.mPreviousLength) {
                    fillDot(getChildAt(i - 1));
                } else {
                    emptyDot(getChildAt(i));
                }
                this.mPreviousLength = i;
                return;
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                emptyDot(getChildAt(i2));
            }
            this.mPreviousLength = 0;
        } else if (i > 0) {
            if (i > this.mPreviousLength) {
                View view = new View(getContext());
                fillDot(view);
                int i3 = this.mDotDiameter;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
                int i4 = this.mDotSpacing;
                layoutParams.setMargins(i4, 0, i4, 0);
                view.setLayoutParams(layoutParams);
                addView(view, i - 1);
            } else {
                removeViewAt(i);
            }
            this.mPreviousLength = i;
        } else {
            removeAllViews();
            this.mPreviousLength = 0;
        }
    }

    private void emptyDot(View view) {
        view.setBackgroundResource(this.mEmptyDrawable);
    }

    private void fillDot(View view) {
        view.setBackgroundResource(this.mFillDrawable);
    }

    public int getPinLength() {
        return this.mPinLength;
    }

    public void setPinLength(int i) {
        this.mPinLength = i;
        removeAllViews();
        initView(getContext());
    }

    public int getIndicatorType() {
        return this.mIndicatorType;
    }

    public void setIndicatorType(int i) {
        this.mIndicatorType = i;
        removeAllViews();
        initView(getContext());
    }
}
