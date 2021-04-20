package p035ru.unicorn.ujin.view.activity.navigation.adapter;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.DiffCallback */
public class DiffCallback<T extends Diffable<T>> extends DiffUtil.Callback {
    private final List<T> newList;
    private final List<T> oldList;

    public DiffCallback(List<T> list, List<T> list2) {
        this.oldList = list;
        this.newList = list2;
    }

    public int getOldListSize() {
        List<T> list = this.oldList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getNewListSize() {
        List<T> list = this.newList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public boolean areItemsTheSame(int i, int i2) {
        return ((Diffable) this.oldList.get(i)).areItemsTheSame((Diffable) this.newList.get(i2));
    }

    public boolean areContentsTheSame(int i, int i2) {
        return ((Diffable) this.oldList.get(i)).areContentsTheSame((Diffable) this.newList.get(i2));
    }

    public Object getChangePayload(int i, int i2) {
        return super.getChangePayload(i, i2);
    }
}
