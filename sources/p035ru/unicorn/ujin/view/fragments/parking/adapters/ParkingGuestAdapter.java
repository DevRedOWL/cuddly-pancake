package p035ru.unicorn.ujin.view.fragments.parking.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.fragments.parking.response.Guest;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/adapters/ParkingGuestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/parking/adapters/ParkingGuestAdapter$ViewHolder;", "guestList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "Lkotlin/collections/ArrayList;", "onClickListener", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getGuestList", "()Ljava/util/ArrayList;", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.ParkingGuestAdapter */
/* compiled from: ParkingGuestAdapter.kt */
public final class ParkingGuestAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final ArrayList<Guest> guestList;
    private final Function1<Guest, Unit> onClickListener;

    public final ArrayList<Guest> getGuestList() {
        return this.guestList;
    }

    public final Function1<Guest, Unit> getOnClickListener() {
        return this.onClickListener;
    }

    public ParkingGuestAdapter(ArrayList<Guest> arrayList, Function1<? super Guest, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "guestList");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.guestList = arrayList;
        this.onClickListener = function1;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_parking_available_guest, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ble_guest, parent, false)");
        return new ViewHolder(inflate);
    }

    public int getItemCount() {
        return this.guestList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.itemView.setOnClickListener(new ParkingGuestAdapter$onBindViewHolder$1(this, i));
        Guest guest = this.guestList.get(i);
        Intrinsics.checkNotNullExpressionValue(guest, "guestList[position]");
        viewHolder.bind(guest);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/adapters/ParkingGuestAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "info", "Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.ParkingGuestAdapter$ViewHolder */
    /* compiled from: ParkingGuestAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(Guest guest) {
            Intrinsics.checkNotNullParameter(guest, "info");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            textView.setText(guest.getFullname());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvBrand);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvBrand");
            textView2.setText(guest.getBrand());
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvCarLicencePlate);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvCarLicencePlate");
            textView3.setText(guest.getLicencePlate());
        }
    }
}
