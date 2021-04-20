package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection */
public abstract class MultiSection<T extends Diffable<T>, VH extends RecyclerView.ViewHolder> extends BaseSection<VH> implements ListUpdateCallback {
    private List<T> data;

    /* access modifiers changed from: protected */
    public abstract void bindViewHolder(VH vh, T t, int i, List<Object> list);

    public void setData(List<T> list) {
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffCallback(this.data, list));
        this.data = list;
        calculateDiff.dispatchUpdatesTo((ListUpdateCallback) this);
    }

    /* access modifiers changed from: protected */
    public final void bindViewHolder(VH vh, int i, List<Object> list) {
        bindViewHolder(vh, (Diffable) this.data.get(i), i, list);
    }

    public final int getSize() {
        List<T> list = this.data;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void onInserted(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    public void onRemoved(int i, int i2) {
        notifyItemRangeRemoved(i, i2);
    }

    public void onMoved(int i, int i2) {
        notifyItemMoved(i, i2);
    }

    public void onChanged(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    public void onItemChanged(int i) {
        notifyItemChanged(i);
    }

    public T getData(int i) {
        return (Diffable) this.data.get(i);
    }

    public List<T> getData() {
        return this.data;
    }
}
