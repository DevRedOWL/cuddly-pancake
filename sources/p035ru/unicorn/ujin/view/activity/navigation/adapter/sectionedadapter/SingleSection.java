package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection */
public abstract class SingleSection<T, VH extends RecyclerView.ViewHolder> extends BaseSection<VH> {
    private T data;

    /* access modifiers changed from: protected */
    public abstract void bindViewHolder(VH vh, T t, List<Object> list);

    /* access modifiers changed from: protected */
    public boolean isDataNullable() {
        return false;
    }

    public void setData(T t) {
        boolean z = this.data == null && t != null;
        T t2 = this.data;
        boolean z2 = t2 != null && !t2.equals(t);
        this.data = t;
        if (isDataNullable()) {
            notifyItemRangeChanged(0, 1, (Object) null);
        } else if (z) {
            notifyItemRangeInserted(0, 1);
        } else if (!z2) {
        } else {
            if (t == null) {
                notifyItemRangeRemoved(0, 1);
            } else {
                notifyItemRangeChanged(0, 1, (Object) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void bindViewHolder(VH vh, int i, List<Object> list) {
        bindViewHolder(vh, this.data, list);
    }

    public int getSize() {
        return (isDataNullable() || this.data != null) ? 1 : 0;
    }

    public T getData() {
        return this.data;
    }

    public void notifySectionChanged() {
        notifyItemRangeChanged(0, 1, (Object) null);
    }
}
