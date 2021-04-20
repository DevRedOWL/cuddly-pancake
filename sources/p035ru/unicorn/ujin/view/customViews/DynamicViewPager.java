package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.viewpager.widget.ViewPager;

/* renamed from: ru.unicorn.ujin.view.customViews.DynamicViewPager */
public class DynamicViewPager extends ViewPager {
    private View currentView;

    public DynamicViewPager(Context context) {
        super(context);
    }

    public DynamicViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.currentView;
        if (view == null) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = 0;
        view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.currentView.getMeasuredHeight();
        if (measuredHeight > 0) {
            i3 = measuredHeight;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY));
    }

    public void measureCurrentView(View view) {
        this.currentView = view;
        requestLayout();
    }
}
