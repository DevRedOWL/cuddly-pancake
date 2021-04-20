package p035ru.unicorn.ujin.view.fragments.parking.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/adapters/ZoneSlotsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/parking/adapters/ZoneSlotsAdapter$ViewHolder;", "slotList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "slotClick", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "lastButton", "Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "getLastButton", "()Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "setLastButton", "(Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;)V", "getSlotClick", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setChoosen", "dynamicBackgroundButton", "setNotChoosen", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.ZoneSlotsAdapter */
/* compiled from: ZoneSlotsAdapter.kt */
public final class ZoneSlotsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private DynamicBackgroundButton lastButton;
    private final Function1<Zone, Unit> slotClick;
    /* access modifiers changed from: private */
    public final ArrayList<Zone> slotList;

    public ZoneSlotsAdapter(ArrayList<Zone> arrayList, Function1<? super Zone, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "slotList");
        Intrinsics.checkNotNullParameter(function1, "slotClick");
        this.slotList = arrayList;
        this.slotClick = function1;
    }

    public final Function1<Zone, Unit> getSlotClick() {
        return this.slotClick;
    }

    public final DynamicBackgroundButton getLastButton() {
        return this.lastButton;
    }

    public final void setLastButton(DynamicBackgroundButton dynamicBackgroundButton) {
        this.lastButton = dynamicBackgroundButton;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_slot, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…item_slot, parent, false)");
        return new ViewHolder(inflate);
    }

    public int getItemCount() {
        return this.slotList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Zone zone = this.slotList.get(i);
        Intrinsics.checkNotNullExpressionValue(zone, "slotList[position]");
        viewHolder.bind(zone);
        viewHolder.itemView.setOnClickListener(new ZoneSlotsAdapter$onBindViewHolder$1(this, i));
    }

    /* access modifiers changed from: private */
    public final void setNotChoosen(DynamicBackgroundButton dynamicBackgroundButton) {
        dynamicBackgroundButton.setCustomColors(ContextCompat.getColor(dynamicBackgroundButton.getContext(), R.color.buttonOutlined), ContextCompat.getColor(dynamicBackgroundButton.getContext(), R.color.buttonOutlinedPressed), ContextCompat.getColor(dynamicBackgroundButton.getContext(), R.color.buttonOutlinedDisabled), ContextCompat.getColor(dynamicBackgroundButton.getContext(), R.color.brandTextPrimary));
    }

    /* access modifiers changed from: private */
    public final void setChoosen(DynamicBackgroundButton dynamicBackgroundButton) {
        dynamicBackgroundButton.setType(DynamicBackgroundButton.Type.ACCENT);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/adapters/ZoneSlotsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.ZoneSlotsAdapter$ViewHolder */
    /* compiled from: ZoneSlotsAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(Zone zone) {
            Intrinsics.checkNotNullParameter(zone, "slot");
            View view = this.itemView;
            if (view != null) {
                DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) view;
                dynamicBackgroundButton.setCustomColors(ContextCompat.getColor(dynamicBackgroundButton.getContext(), R.color.buttonOutlined), ContextCompat.getColor(dynamicBackgroundButton.getContext(), R.color.buttonOutlinedPressed), ContextCompat.getColor(dynamicBackgroundButton.getContext(), R.color.buttonOutlinedDisabled), ContextCompat.getColor(dynamicBackgroundButton.getContext(), R.color.brandTextPrimary));
                dynamicBackgroundButton.setText(zone.getTitle());
                dynamicBackgroundButton.setTextSize(22.0f);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.customViews.DynamicBackgroundButton");
        }
    }
}
