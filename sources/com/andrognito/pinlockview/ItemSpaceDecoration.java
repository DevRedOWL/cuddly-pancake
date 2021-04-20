package com.andrognito.pinlockview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class ItemSpaceDecoration extends RecyclerView.ItemDecoration {
    private final int mHorizontalSpaceWidth;
    private final boolean mIncludeEdge;
    private final int mSpanCount;
    private final int mVerticalSpaceHeight;

    public ItemSpaceDecoration(int i, int i2, int i3, boolean z) {
        this.mHorizontalSpaceWidth = i;
        this.mVerticalSpaceHeight = i2;
        this.mSpanCount = i3;
        this.mIncludeEdge = z;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.mSpanCount;
        int i2 = childAdapterPosition % i;
        if (this.mIncludeEdge) {
            int i3 = this.mHorizontalSpaceWidth;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (childAdapterPosition < i) {
                rect.top = this.mVerticalSpaceHeight;
            }
            rect.bottom = this.mVerticalSpaceHeight;
            return;
        }
        int i4 = this.mHorizontalSpaceWidth;
        rect.left = (i2 * i4) / i;
        rect.right = i4 - (((i2 + 1) * i4) / i);
        if (childAdapterPosition >= i) {
            rect.top = this.mVerticalSpaceHeight;
        }
    }
}
