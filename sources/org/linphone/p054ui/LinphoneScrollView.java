package org.linphone.p054ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: org.linphone.ui.LinphoneScrollView */
public class LinphoneScrollView extends ScrollView {
    private ScrollViewListener scrollViewListener = null;

    public LinphoneScrollView(Context context) {
        super(context);
    }

    public LinphoneScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LinphoneScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener2) {
        this.scrollViewListener = scrollViewListener2;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        ScrollViewListener scrollViewListener2;
        super.onScrollChanged(i, i2, i3, i4);
        if ((i2 < getMeasuredHeight() || this.scrollViewListener == null) && i2 == 0 && (scrollViewListener2 = this.scrollViewListener) != null) {
            scrollViewListener2.OnScrollToTop(getMeasuredHeight());
        }
    }
}
