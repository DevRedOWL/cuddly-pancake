package p051me.relex.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: me.relex.circleindicator.BaseCircleIndicator */
class BaseCircleIndicator extends LinearLayout {
    private static final int DEFAULT_INDICATOR_WIDTH = 5;
    protected Animator mAnimatorIn;
    protected Animator mAnimatorOut;
    protected Animator mImmediateAnimatorIn;
    protected Animator mImmediateAnimatorOut;
    protected int mIndicatorBackgroundResId;
    private IndicatorCreatedListener mIndicatorCreatedListener;
    protected int mIndicatorHeight = -1;
    protected int mIndicatorMargin = -1;
    protected int mIndicatorUnselectedBackgroundResId;
    protected int mIndicatorWidth = -1;
    protected int mLastPosition = -1;

    /* renamed from: me.relex.circleindicator.BaseCircleIndicator$IndicatorCreatedListener */
    public interface IndicatorCreatedListener {
        void onIndicatorCreated(View view, int i);
    }

    public BaseCircleIndicator(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        initialize(handleTypedArray(context, attributeSet));
    }

    private Config handleTypedArray(Context context, AttributeSet attributeSet) {
        Config config = new Config();
        if (attributeSet == null) {
            return config;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5070R.styleable.BaseCircleIndicator);
        config.width = obtainStyledAttributes.getDimensionPixelSize(C5070R.styleable.BaseCircleIndicator_ci_width, -1);
        config.height = obtainStyledAttributes.getDimensionPixelSize(C5070R.styleable.BaseCircleIndicator_ci_height, -1);
        config.margin = obtainStyledAttributes.getDimensionPixelSize(C5070R.styleable.BaseCircleIndicator_ci_margin, -1);
        config.animatorResId = obtainStyledAttributes.getResourceId(C5070R.styleable.BaseCircleIndicator_ci_animator, C5070R.animator.scale_with_alpha);
        config.animatorReverseResId = obtainStyledAttributes.getResourceId(C5070R.styleable.BaseCircleIndicator_ci_animator_reverse, 0);
        config.backgroundResId = obtainStyledAttributes.getResourceId(C5070R.styleable.BaseCircleIndicator_ci_drawable, C5070R.C5071drawable.white_radius);
        config.unselectedBackgroundId = obtainStyledAttributes.getResourceId(C5070R.styleable.BaseCircleIndicator_ci_drawable_unselected, config.backgroundResId);
        config.orientation = obtainStyledAttributes.getInt(C5070R.styleable.BaseCircleIndicator_ci_orientation, -1);
        config.gravity = obtainStyledAttributes.getInt(C5070R.styleable.BaseCircleIndicator_ci_gravity, -1);
        obtainStyledAttributes.recycle();
        return config;
    }

    public void initialize(Config config) {
        int i = 1;
        int applyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        this.mIndicatorWidth = config.width < 0 ? applyDimension : config.width;
        this.mIndicatorHeight = config.height < 0 ? applyDimension : config.height;
        if (config.margin >= 0) {
            applyDimension = config.margin;
        }
        this.mIndicatorMargin = applyDimension;
        this.mAnimatorOut = createAnimatorOut(config);
        this.mImmediateAnimatorOut = createAnimatorOut(config);
        this.mImmediateAnimatorOut.setDuration(0);
        this.mAnimatorIn = createAnimatorIn(config);
        this.mImmediateAnimatorIn = createAnimatorIn(config);
        this.mImmediateAnimatorIn.setDuration(0);
        this.mIndicatorBackgroundResId = config.backgroundResId == 0 ? C5070R.C5071drawable.white_radius : config.backgroundResId;
        this.mIndicatorUnselectedBackgroundResId = config.unselectedBackgroundId == 0 ? config.backgroundResId : config.unselectedBackgroundId;
        if (config.orientation != 1) {
            i = 0;
        }
        setOrientation(i);
        setGravity(config.gravity >= 0 ? config.gravity : 17);
    }

    public void setIndicatorCreatedListener(IndicatorCreatedListener indicatorCreatedListener) {
        this.mIndicatorCreatedListener = indicatorCreatedListener;
    }

    /* access modifiers changed from: protected */
    public Animator createAnimatorOut(Config config) {
        return AnimatorInflater.loadAnimator(getContext(), config.animatorResId);
    }

    /* access modifiers changed from: protected */
    public Animator createAnimatorIn(Config config) {
        if (config.animatorReverseResId != 0) {
            return AnimatorInflater.loadAnimator(getContext(), config.animatorReverseResId);
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), config.animatorResId);
        loadAnimator.setInterpolator(new ReverseInterpolator());
        return loadAnimator;
    }

    public void createIndicators(int i, int i2) {
        if (this.mImmediateAnimatorOut.isRunning()) {
            this.mImmediateAnimatorOut.end();
            this.mImmediateAnimatorOut.cancel();
        }
        if (this.mImmediateAnimatorIn.isRunning()) {
            this.mImmediateAnimatorIn.end();
            this.mImmediateAnimatorIn.cancel();
        }
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int i3 = i - childCount;
            int orientation = getOrientation();
            for (int i4 = 0; i4 < i3; i4++) {
                addIndicator(orientation);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            View childAt = getChildAt(i5);
            if (i2 == i5) {
                childAt.setBackgroundResource(this.mIndicatorBackgroundResId);
                this.mImmediateAnimatorOut.setTarget(childAt);
                this.mImmediateAnimatorOut.start();
                this.mImmediateAnimatorOut.end();
            } else {
                childAt.setBackgroundResource(this.mIndicatorUnselectedBackgroundResId);
                this.mImmediateAnimatorIn.setTarget(childAt);
                this.mImmediateAnimatorIn.start();
                this.mImmediateAnimatorIn.end();
            }
            IndicatorCreatedListener indicatorCreatedListener = this.mIndicatorCreatedListener;
            if (indicatorCreatedListener != null) {
                indicatorCreatedListener.onIndicatorCreated(childAt, i5);
            }
        }
        this.mLastPosition = i2;
    }

    /* access modifiers changed from: protected */
    public void addIndicator(int i) {
        View view = new View(getContext());
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = this.mIndicatorWidth;
        generateDefaultLayoutParams.height = this.mIndicatorHeight;
        if (i == 0) {
            int i2 = this.mIndicatorMargin;
            generateDefaultLayoutParams.leftMargin = i2;
            generateDefaultLayoutParams.rightMargin = i2;
        } else {
            int i3 = this.mIndicatorMargin;
            generateDefaultLayoutParams.topMargin = i3;
            generateDefaultLayoutParams.bottomMargin = i3;
        }
        addView(view, generateDefaultLayoutParams);
    }

    public void animatePageSelected(int i) {
        View childAt;
        if (this.mLastPosition != i) {
            if (this.mAnimatorIn.isRunning()) {
                this.mAnimatorIn.end();
                this.mAnimatorIn.cancel();
            }
            if (this.mAnimatorOut.isRunning()) {
                this.mAnimatorOut.end();
                this.mAnimatorOut.cancel();
            }
            int i2 = this.mLastPosition;
            if (i2 >= 0 && (childAt = getChildAt(i2)) != null) {
                childAt.setBackgroundResource(this.mIndicatorUnselectedBackgroundResId);
                this.mAnimatorIn.setTarget(childAt);
                this.mAnimatorIn.start();
            }
            View childAt2 = getChildAt(i);
            if (childAt2 != null) {
                childAt2.setBackgroundResource(this.mIndicatorBackgroundResId);
                this.mAnimatorOut.setTarget(childAt2);
                this.mAnimatorOut.start();
            }
            this.mLastPosition = i;
        }
    }

    /* renamed from: me.relex.circleindicator.BaseCircleIndicator$ReverseInterpolator */
    protected class ReverseInterpolator implements Interpolator {
        protected ReverseInterpolator() {
        }

        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }
}
