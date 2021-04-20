package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter */
public final class SectionedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements DataObservable {
    /* access modifiers changed from: private */
    public int initialHeight = -1;
    private final TreeMap<Integer, BaseSection> map = new TreeMap<>();
    private RecyclerView recyclerView;
    private final ArrayList<BaseSection> sections = new ArrayList<>();

    public void addSectionSafety(BaseSection baseSection) {
        if (!this.sections.contains(baseSection)) {
            baseSection.registerObservable(this);
            this.sections.add(baseSection);
            recalculateOffsets();
        }
    }

    public void addSection(BaseSection baseSection) {
        if (baseSection != null) {
            addSectionSafety(baseSection);
            return;
        }
        throw new NullPointerException("Section cannot be null");
    }

    public void onAttachedToRecyclerView(final RecyclerView recyclerView2) {
        super.onAttachedToRecyclerView(recyclerView2);
        this.recyclerView = recyclerView2;
        recyclerView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    recyclerView2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                int unused = SectionedAdapter.this.initialHeight = recyclerView2.getHeight();
            }
        });
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView2) {
        super.onDetachedFromRecyclerView(recyclerView2);
        this.recyclerView = null;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseSection baseSection = this.sections.get(i);
        Log.d("TAG", " XXX " + baseSection.getLayoutId());
        return baseSection.createViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(baseSection.getLayoutId(), viewGroup, false));
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Map.Entry<Integer, BaseSection> floorEntry = this.map.floorEntry(Integer.valueOf(i));
        floorEntry.getValue().bindViewHolder(viewHolder, i - floorEntry.getKey().intValue(), (List<Object>) null);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Map.Entry<Integer, BaseSection> floorEntry = this.map.floorEntry(Integer.valueOf(i));
        floorEntry.getValue().bindViewHolder(viewHolder, i - floorEntry.getKey().intValue(), list);
    }

    public int getItemViewType(int i) {
        return this.sections.indexOf(this.map.floorEntry(Integer.valueOf(i)).getValue());
    }

    public int getItemCount() {
        Map.Entry<Integer, BaseSection> lastEntry = this.map.lastEntry();
        if (lastEntry == null) {
            return 0;
        }
        return lastEntry.getValue().getInternalSize() + lastEntry.getKey().intValue();
    }

    @Nullable
    public BaseSection getSectionForPosition(int i) {
        Map.Entry<Integer, BaseSection> floorEntry = this.map.floorEntry(Integer.valueOf(i));
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    public void onItemRangeInserted(int i, int i2) {
        recalculateOffsets();
        notifyItemRangeInserted(i, i2);
    }

    public void onItemRangeRemoved(int i, int i2) {
        recalculateOffsets();
        notifyItemRangeRemoved(i, i2);
    }

    public void onItemMoved(int i, int i2) {
        notifyItemMoved(i, i2);
    }

    public void onItemChanged(int i) {
        notifyItemChanged(i);
    }

    public int getLonelyHeight() {
        return this.initialHeight - this.recyclerView.getTop();
    }

    private void recalculateOffsets() {
        this.map.clear();
        Iterator<BaseSection> it = this.sections.iterator();
        int i = 0;
        while (it.hasNext()) {
            BaseSection next = it.next();
            next.setOffset(i);
            this.map.put(Integer.valueOf(i), next);
            i += next.getInternalSize();
        }
    }

    public ArrayList<BaseSection> getSections() {
        return this.sections;
    }

    public Boolean contains(BaseSection baseSection) {
        return Boolean.valueOf(this.sections.contains(baseSection));
    }
}
