package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.BaseSection */
public abstract class BaseSection<VH extends RecyclerView.ViewHolder> {
    private DataObservable dataObservable;
    private int offset = 0;
    private boolean show = true;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.BaseSection$Click */
    public enum Click {
        INSTANCE
    }

    /* access modifiers changed from: protected */
    public abstract void bindViewHolder(VH vh, int i, List<Object> list);

    /* access modifiers changed from: protected */
    public abstract VH createViewHolder(View view);

    public abstract int getLayoutId();

    public abstract int getSize();

    /* access modifiers changed from: protected */
    public final int getInternalSize() {
        if (this.show) {
            return getSize();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void registerObservable(DataObservable dataObservable2) {
        if (dataObservable2 != null) {
            this.dataObservable = dataObservable2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void notifyItemRangeInserted(int i, int i2) {
        DataObservable dataObservable2 = this.dataObservable;
        if (dataObservable2 != null) {
            dataObservable2.onItemRangeInserted(this.offset + i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void notifyItemRangeRemoved(int i, int i2) {
        DataObservable dataObservable2 = this.dataObservable;
        if (dataObservable2 != null) {
            dataObservable2.onItemRangeRemoved(this.offset + i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void notifyItemMoved(int i, int i2) {
        DataObservable dataObservable2 = this.dataObservable;
        if (dataObservable2 != null) {
            int i3 = this.offset;
            dataObservable2.onItemMoved(i + i3, i3 + i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        DataObservable dataObservable2 = this.dataObservable;
        if (dataObservable2 != null) {
            dataObservable2.onItemRangeChanged(this.offset + i, i2, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void notifyItemChanged(int i) {
        DataObservable dataObservable2 = this.dataObservable;
        if (dataObservable2 != null) {
            dataObservable2.onItemChanged(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void setOffset(int i) {
        this.offset = i;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getAdapterPositionForViewHolder(VH vh) {
        int adapterPosition = vh.getAdapterPosition();
        if (adapterPosition != -1) {
            return adapterPosition - this.offset;
        }
        return -1;
    }

    public final int getLayoutPositionForViewHolder(VH vh) {
        return vh.getLayoutPosition() - this.offset;
    }

    public final void show(boolean z) {
        show(z, false);
    }

    /* access modifiers changed from: protected */
    public final void show(boolean z, boolean z2) {
        boolean z3 = this.show;
        this.show = z;
        DataObservable dataObservable2 = this.dataObservable;
        if (dataObservable2 == null) {
            return;
        }
        if (z3 && !z) {
            dataObservable2.onItemRangeRemoved(this.offset, getSize());
        } else if (!z3 && z) {
            this.dataObservable.onItemRangeInserted(this.offset, getSize());
        } else if (z2) {
            this.dataObservable.onItemRangeChanged(this.offset, getSize(), (Object) null);
        }
    }

    public int getLonelyHeight() {
        return this.dataObservable.getLonelyHeight();
    }

    public boolean isShown() {
        return this.show;
    }
}
