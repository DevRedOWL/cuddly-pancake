package p051me.relex.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import p051me.relex.circleindicator.BaseCircleIndicator;

/* renamed from: me.relex.circleindicator.CircleIndicator */
public class CircleIndicator extends BaseCircleIndicator {
    private final DataSetObserver mInternalDataSetObserver = new DataSetObserver() {
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator.this.mViewpager != null) {
                PagerAdapter adapter = CircleIndicator.this.mViewpager.getAdapter();
                int count = adapter != null ? adapter.getCount() : 0;
                if (count != CircleIndicator.this.getChildCount()) {
                    if (CircleIndicator.this.mLastPosition < count) {
                        CircleIndicator circleIndicator = CircleIndicator.this;
                        circleIndicator.mLastPosition = circleIndicator.mViewpager.getCurrentItem();
                    } else {
                        CircleIndicator.this.mLastPosition = -1;
                    }
                    CircleIndicator.this.createIndicators();
                }
            }
        }
    };
    private final ViewPager.OnPageChangeListener mInternalPageChangeListener = new ViewPager.OnPageChangeListener() {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (CircleIndicator.this.mViewpager.getAdapter() != null && CircleIndicator.this.mViewpager.getAdapter().getCount() > 0) {
                CircleIndicator.this.animatePageSelected(i);
            }
        }
    };
    /* access modifiers changed from: private */
    public ViewPager mViewpager;

    public /* bridge */ /* synthetic */ void animatePageSelected(int i) {
        super.animatePageSelected(i);
    }

    public /* bridge */ /* synthetic */ void createIndicators(int i, int i2) {
        super.createIndicators(i, i2);
    }

    public /* bridge */ /* synthetic */ void initialize(Config config) {
        super.initialize(config);
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(BaseCircleIndicator.IndicatorCreatedListener indicatorCreatedListener) {
        super.setIndicatorCreatedListener(indicatorCreatedListener);
    }

    public CircleIndicator(Context context) {
        super(context);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setViewPager(ViewPager viewPager) {
        this.mViewpager = viewPager;
        ViewPager viewPager2 = this.mViewpager;
        if (viewPager2 != null && viewPager2.getAdapter() != null) {
            this.mLastPosition = -1;
            createIndicators();
            this.mViewpager.removeOnPageChangeListener(this.mInternalPageChangeListener);
            this.mViewpager.addOnPageChangeListener(this.mInternalPageChangeListener);
            this.mInternalPageChangeListener.onPageSelected(this.mViewpager.getCurrentItem());
        }
    }

    /* access modifiers changed from: private */
    public void createIndicators() {
        int i;
        PagerAdapter adapter = this.mViewpager.getAdapter();
        if (adapter == null) {
            i = 0;
        } else {
            i = adapter.getCount();
        }
        createIndicators(i, this.mViewpager.getCurrentItem());
    }

    public DataSetObserver getDataSetObserver() {
        return this.mInternalDataSetObserver;
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        ViewPager viewPager = this.mViewpager;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(onPageChangeListener);
            this.mViewpager.addOnPageChangeListener(onPageChangeListener);
            return;
        }
        throw new NullPointerException("can not find Viewpager , setViewPager first");
    }
}
