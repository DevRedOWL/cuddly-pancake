package p035ru.unicorn.ujin.view.customViews.citySearchView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001\u001fB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001e\u0010\u0017\u001a\u00020\u000e2\f\b\u0001\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/citySearchView/SearchViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/customViews/citySearchView/SearchViewAdapter$ViewHolder;", "Landroid/widget/Filterable;", "itemsList", "", "Lru/unicorn/ujin/view/customViews/citySearchView/SelectableItem;", "(Ljava/util/List;)V", "fullItemsList", "getItemsList", "()Ljava/util/List;", "setItemsList", "onItemSelected", "Lkotlin/Function1;", "", "getOnItemSelected", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function1;)V", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemSelected", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewAdapter */
/* compiled from: SearchViewAdapter.kt */
public final class SearchViewAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {
    /* access modifiers changed from: private */
    public List<SelectableItem> fullItemsList = new ArrayList();
    private List<SelectableItem> itemsList;
    private Function1<? super SelectableItem, Unit> onItemSelected = SearchViewAdapter$onItemSelected$1.INSTANCE;

    public final List<SelectableItem> getItemsList() {
        return this.itemsList;
    }

    public final void setItemsList(List<SelectableItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.itemsList = list;
    }

    public SearchViewAdapter(List<SelectableItem> list) {
        Intrinsics.checkNotNullParameter(list, "itemsList");
        this.itemsList = list;
        this.fullItemsList.addAll(this.itemsList);
    }

    public final Function1<SelectableItem, Unit> getOnItemSelected() {
        return this.onItemSelected;
    }

    public final void setOnItemSelected(Function1<? super SelectableItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onItemSelected = function1;
    }

    public Filter getFilter() {
        return new SearchViewAdapter$getFilter$1(this);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_combobox, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…           parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(this.itemsList.get(i));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/citySearchView/SearchViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/customViews/citySearchView/SearchViewAdapter;Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/customViews/citySearchView/SelectableItem;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewAdapter$ViewHolder */
    /* compiled from: SearchViewAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ SearchViewAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SearchViewAdapter searchViewAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = searchViewAdapter;
        }

        public final void bind(SelectableItem selectableItem) {
            Intrinsics.checkNotNullParameter(selectableItem, "item");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvName);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvName");
            textView.setText(selectableItem.getValue());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C5619R.C5622id.ivSelected);
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "itemView.ivSelected");
            appCompatImageView.setVisibility(selectableItem.isSelected() ? 0 : 8);
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            ((ConstraintLayout) view3.findViewById(C5619R.C5622id.itemLayout)).setOnClickListener(new SearchViewAdapter$ViewHolder$bind$1(this, selectableItem));
        }
    }

    public int getItemCount() {
        return this.itemsList.size();
    }

    public final void setItemSelected(int i) {
        SelectableItem selectableItem = this.itemsList.get(i);
        selectableItem.setSelected(true);
        this.onItemSelected.invoke(selectableItem);
    }
}
