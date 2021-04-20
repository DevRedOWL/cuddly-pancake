package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

/* renamed from: ru.unicorn.ujin.view.customViews.LockableScrollView */
public class LockableScrollView extends NestedScrollView {
    private boolean mScrollable = true;

    public LockableScrollView(Context context) {
        super(context);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setScrollingEnabled(boolean z) {
        this.mScrollable = z;
    }

    public boolean isScrollable() {
        return this.mScrollable;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = this.mScrollable;
        return z ? super.onTouchEvent(motionEvent) : z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollable) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
