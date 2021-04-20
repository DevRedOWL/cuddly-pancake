package p035ru.unicorn.ujin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ru.unicorn.ujin.view.WrapContentLinearLayoutManager */
public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context) {
        super(context);
    }

    public WrapContentLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            Log.e("TAG", "XXX meet a IOOBE in RecyclerView " + e.getMessage());
        } catch (NullPointerException e2) {
            Log.e("TAG", "XXX meet NPE a IOOBE in RecyclerView " + e2.getMessage());
        }
    }
}
