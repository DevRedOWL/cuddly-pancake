package p035ru.unicorn.ujin.view.dialogs.flatChoose;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB-\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\u0013\u001a\u00020\tH\u0016J\u001c\u0010\u0014\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/flatChoose/FlatChooseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/dialogs/flatChoose/FlatChooseAdapter$ViewHolder;", "flatList", "", "Lru/unicorn/ujin/data/realm/profile/Apartment;", "clickListener", "Lkotlin/Function2;", "", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "getClickListener", "()Lkotlin/jvm/functions/Function2;", "getFlatList", "()Ljava/util/List;", "paramsList", "", "[Ljava/lang/String;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.flatChoose.FlatChooseAdapter */
/* compiled from: FlatChooseAdapter.kt */
public final class FlatChooseAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final Function2<String, Integer, Unit> clickListener;
    private final List<Apartment> flatList;
    private String[] paramsList;

    public FlatChooseAdapter(List<? extends Apartment> list, Function2<? super String, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(list, "flatList");
        Intrinsics.checkNotNullParameter(function2, "clickListener");
        this.flatList = list;
        this.clickListener = function2;
        int size = this.flatList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = "";
        }
        this.paramsList = strArr;
    }

    public final Function2<String, Integer, Unit> getClickListener() {
        return this.clickListener;
    }

    public final List<Apartment> getFlatList() {
        return this.flatList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_flat_button, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…at_button, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.flatList.size();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/flatChoose/FlatChooseAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/dialogs/flatChoose/FlatChooseAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.flatChoose.FlatChooseAdapter$ViewHolder */
    /* compiled from: FlatChooseAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ FlatChooseAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(FlatChooseAdapter flatChooseAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = flatChooseAdapter;
        }

        public final void bind(int i) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) view.findViewById(C5619R.C5622id.button);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "itemView.button");
            dynamicBackgroundButton.setText(this.this$0.getFlatList().get(i).getTitle());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ((DynamicBackgroundButton) view2.findViewById(C5619R.C5622id.button)).setOnClickListener(new FlatChooseAdapter$ViewHolder$bind$1(this, i));
        }
    }
}
