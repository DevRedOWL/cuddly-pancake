package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SimpleDividerItemDecoration */
public class SimpleDividerItemDecoration extends RecyclerView.ItemDecoration {
    private final Rect mBounds = new Rect();
    private Drawable mDivider;

    public SimpleDividerItemDecoration(Context context) {
        this.mDivider = ContextCompat.getDrawable(context, R.drawable.line);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
        } else {
            i2 = recyclerView.getHeight();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (i3 == 0) {
                View childAt = recyclerView.getChildAt(i3);
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.mBounds);
                int round = this.mBounds.right + Math.round(childAt.getTranslationX());
                this.mDivider.setBounds(round - this.mDivider.getIntrinsicWidth(), i, round, i2);
                this.mDivider.draw(canvas);
            }
        }
        canvas.restore();
    }
}
