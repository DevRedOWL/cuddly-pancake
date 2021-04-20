package p035ru.unicorn.ujin.view.activity.navigation.adapter;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.reactivex.subjects.PublishSubject;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter */
public abstract class BaseAdapter<T extends Diffable<T>, VH extends BaseHolder> extends RecyclerView.Adapter<VH> {
    private List<T> data;
    protected PublishSubject<Boolean> itemViewClickSubjectBoolean = PublishSubject.create();
    protected PublishSubject<Integer> itemViewClickSubjectInteger = PublishSubject.create();
    private boolean modeSelected = false;
    private int type = -1;

    public abstract T getItemById(String str);

    /* access modifiers changed from: protected */
    public abstract VH getViewHolder(View view, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void onBindViewHolder(VH vh, T t, int i, int i2);

    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return getViewHolder(viewGroup, getType(), i);
    }

    public void onBindViewHolder(VH vh, int i) {
        onBindViewHolder(vh, (Diffable) this.data.get(i), getType(), i);
    }

    public int getItemCount() {
        List<T> list = this.data;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.data.size();
    }

    public void setData(List<T> list) {
        Log.d("TAG", "setData xxx");
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffCallback(this.data, list));
        this.data = list;
        calculateDiff.dispatchUpdatesTo((RecyclerView.Adapter) this);
    }

    public List<T> getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public T getItem(int i) {
        return (Diffable) this.data.get(i);
    }

    public boolean isModeSelected() {
        return this.modeSelected;
    }

    public void setModeSelected(boolean z) {
        this.modeSelected = z;
    }

    public void onViewDetachedFromWindow(VH vh) {
        this.itemViewClickSubjectBoolean.onComplete();
        this.itemViewClickSubjectInteger.onComplete();
    }
}
