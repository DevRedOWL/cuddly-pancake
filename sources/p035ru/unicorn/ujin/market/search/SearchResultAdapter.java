package p035ru.unicorn.ujin.market.search;

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
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\"#B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0014\u0010\u001f\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "data", "", "Lru/unicorn/ujin/market/search/SearchResultType;", "onItemClickListener", "Lru/unicorn/ujin/market/search/SearchResultAdapter$OnItemClickListener;", "(Ljava/util/List;Lru/unicorn/ujin/market/search/SearchResultAdapter$OnItemClickListener;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getOnItemClickListener", "()Lru/unicorn/ujin/market/search/SearchResultAdapter$OnItemClickListener;", "setOnItemClickListener", "(Lru/unicorn/ujin/market/search/SearchResultAdapter$OnItemClickListener;)V", "addItem", "", "item", "getItem", "position", "", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "CategoryViewHolder", "CompanyViewHolder", "OnItemClickListener", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.search.SearchResultAdapter */
/* compiled from: SearchResultAdapter.kt */
public final class SearchResultAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<SearchResultType> data;
    private OnItemClickListener onItemClickListener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchResultAdapter$OnItemClickListener;", "", "onCategoryClicked", "", "category", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "onCompanyClicked", "company", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.search.SearchResultAdapter$OnItemClickListener */
    /* compiled from: SearchResultAdapter.kt */
    public interface OnItemClickListener {
        void onCategoryClicked(Category category);

        void onCompanyClicked(Company company);
    }

    public final List<SearchResultType> getData() {
        return this.data;
    }

    public final void setData(List<SearchResultType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public SearchResultAdapter(List<SearchResultType> list, OnItemClickListener onItemClickListener2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(onItemClickListener2, "onItemClickListener");
        this.data = list;
        this.onItemClickListener = onItemClickListener2;
    }

    public final OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final void setOnItemClickListener(OnItemClickListener onItemClickListener2) {
        Intrinsics.checkNotNullParameter(onItemClickListener2, "<set-?>");
        this.onItemClickListener = onItemClickListener2;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        if (i != 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_result, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ch_result, parent, false)");
            return new CategoryViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_result, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "LayoutInflater.from(pare…ch_result, parent, false)");
        return new CompanyViewHolder(inflate2);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (viewHolder.getItemViewType() != 0) {
            CategoryViewHolder categoryViewHolder = (CategoryViewHolder) viewHolder;
            SearchResultType searchResultType = this.data.get(i);
            if (searchResultType != null) {
                categoryViewHolder.bind((Category) searchResultType);
                viewHolder.itemView.setOnClickListener(new SearchResultAdapter$onBindViewHolder$2(this, i));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.realm.marketplace.Category");
        }
        CompanyViewHolder companyViewHolder = (CompanyViewHolder) viewHolder;
        SearchResultType searchResultType2 = this.data.get(i);
        if (searchResultType2 != null) {
            companyViewHolder.bind((Company) searchResultType2);
            viewHolder.itemView.setOnClickListener(new SearchResultAdapter$onBindViewHolder$1(this, i));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.realm.marketplace.Company");
    }

    public int getItemViewType(int i) {
        return this.data.get(i).getType();
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<SearchResultType> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(SearchResultType searchResultType) {
        Intrinsics.checkNotNullParameter(searchResultType, "item");
        this.data.add(searchResultType);
        notifyItemInserted(getItemCount() - 1);
    }

    public final SearchResultType getItem(int i) {
        return this.data.get(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchResultAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.search.SearchResultAdapter$CategoryViewHolder */
    /* compiled from: SearchResultAdapter.kt */
    public static final class CategoryViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CategoryViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(Category category) {
            Intrinsics.checkNotNullParameter(category, "item");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            textView.setText(category.getTitle());
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchResultAdapter$CompanyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.search.SearchResultAdapter$CompanyViewHolder */
    /* compiled from: SearchResultAdapter.kt */
    public static final class CompanyViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CompanyViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(Company company) {
            Intrinsics.checkNotNullParameter(company, "item");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            textView.setText(company.getTitle());
        }
    }
}
