package p035ru.unicorn.ujin.view.adapters.marketplace;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.SearchItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0014\u0010\u001d\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/SearchItem;", "onResultClickListener", "Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter$OnResultClickListener;", "(Ljava/util/List;Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter$OnResultClickListener;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getOnResultClickListener$app_kortrosRelease", "()Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter$OnResultClickListener;", "setOnResultClickListener$app_kortrosRelease", "(Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter$OnResultClickListener;)V", "addItem", "", "item", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "OnResultClickListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.marketplace.SearchResultsAdapter */
/* compiled from: SearchResultsAdapter.kt */
public final class SearchResultsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<SearchItem> data;
    private OnResultClickListener onResultClickListener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter$OnResultClickListener;", "", "onResultClicked", "", "item", "Lru/unicorn/ujin/data/realm/marketplace/SearchItem;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.marketplace.SearchResultsAdapter$OnResultClickListener */
    /* compiled from: SearchResultsAdapter.kt */
    public interface OnResultClickListener {
        void onResultClicked(SearchItem searchItem);
    }

    public final List<SearchItem> getData() {
        return this.data;
    }

    public final void setData(List<SearchItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public SearchResultsAdapter(List<SearchItem> list, OnResultClickListener onResultClickListener2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(onResultClickListener2, "onResultClickListener");
        this.data = list;
        this.onResultClickListener = onResultClickListener2;
    }

    public final OnResultClickListener getOnResultClickListener$app_kortrosRelease() {
        return this.onResultClickListener;
    }

    public final void setOnResultClickListener$app_kortrosRelease(OnResultClickListener onResultClickListener2) {
        Intrinsics.checkNotNullParameter(onResultClickListener2, "<set-?>");
        this.onResultClickListener = onResultClickListener2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_result, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ch_result, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(this.data.get(i));
    }

    public final void setItems(List<SearchItem> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(SearchItem searchItem) {
        Intrinsics.checkNotNullParameter(searchItem, "item");
        this.data.add(searchItem);
        notifyItemInserted(getItemCount() - 1);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/adapters/marketplace/SearchResultsAdapter;Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/data/realm/marketplace/SearchItem;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.marketplace.SearchResultsAdapter$ViewHolder */
    /* compiled from: SearchResultsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ SearchResultsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SearchResultsAdapter searchResultsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = searchResultsAdapter;
        }

        public final void bind(SearchItem searchItem) {
            Intrinsics.checkNotNullParameter(searchItem, "item");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            textView.setText(searchItem.getTitle());
            this.itemView.setOnClickListener(new SearchResultsAdapter$ViewHolder$bind$1(this, searchItem));
        }
    }
}
