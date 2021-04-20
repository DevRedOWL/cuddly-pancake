package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* renamed from: ru.unicorn.ujin.view.customViews.NonScrollableListView */
public class NonScrollableListView extends ListView {
    public NonScrollableListView(Context context) {
        super(context);
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }
}
