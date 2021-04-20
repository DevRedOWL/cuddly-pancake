package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.HSV */
public class HSV extends HorizontalScrollView {
    public HSV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public HSV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public HSV(Context context) {
        super(context);
        init(context);
    }

    /* access modifiers changed from: package-private */
    public void init(Context context) {
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
