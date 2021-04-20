package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.viewpager.widget.ViewPager;

/* renamed from: ru.unicorn.ujin.view.customViews.WrapContentHeightViewPager */
public class WrapContentHeightViewPager extends ViewPager {
    private int decorHeight = 0;
    private int height = 0;
    private int widthMeasuredSpec;

    public WrapContentHeightViewPager(Context context) {
        super(context);
    }

    public WrapContentHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            super.onMeasure(i, i2);
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i2);
    }

    private int measureViewHeight(View view) {
        view.measure(getChildMeasureSpec(this.widthMeasuredSpec, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }
}
