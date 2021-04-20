package p035ru.unicorn.ujin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ru.unicorn.ujin.view.WrapContentGridLayoutManager */
public class WrapContentGridLayoutManager extends GridLayoutManager {
    public WrapContentGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public WrapContentGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public WrapContentGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            Log.e("TAG", "meet a IOOBE in RecyclerView " + e.getMessage());
        }
    }
}
