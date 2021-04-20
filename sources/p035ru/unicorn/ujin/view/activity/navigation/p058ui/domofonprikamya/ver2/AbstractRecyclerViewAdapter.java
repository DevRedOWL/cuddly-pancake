package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ver2;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ver2.AbstractRecyclerViewAdapter */
public abstract class AbstractRecyclerViewAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private List<T> data;

    /* access modifiers changed from: protected */
    public abstract VH getViewHolder(View view);

    /* access modifiers changed from: protected */
    public abstract void onBindViewHolder(VH vh, T t);

    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return getViewHolder(viewGroup);
    }

    public void onBindViewHolder(VH vh, int i) {
        onBindViewHolder(vh, this.data.get(vh.getAdapterPosition()));
    }

    public int getItemCount() {
        List<T> list = this.data;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.data.size();
    }

    public void setData(List<T> list) {
        this.data = list;
        notifyDataSetChanged();
    }

    public List<T> getData() {
        return this.data;
    }

    public void add(T t, int i) {
        getData().add(i, t);
    }

    public void add(T t) {
        add(t, getItemCount());
    }

    public void changeItem(int i, T t) {
        getData().set(i, t);
        notifyItemChanged(i);
    }
}
