package p035ru.unicorn.ujin.view.adapters.marketplace;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u001c\u0010\u0019\u001a\u00020\u000f2\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0014\u0010\u001f\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/marketplace/CategoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/adapters/marketplace/CategoriesAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "showCategory", "Lkotlin/Function1;", "", "", "getShowCategory", "()Lkotlin/jvm/functions/Function1;", "setShowCategory", "(Lkotlin/jvm/functions/Function1;)V", "addItem", "item", "getItem", "position", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.marketplace.CategoriesAdapter */
/* compiled from: CategoriesAdapter.kt */
public final class CategoriesAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<Category> data;
    private Function1<? super Integer, Unit> showCategory = CategoriesAdapter$showCategory$1.INSTANCE;

    public CategoriesAdapter(List<Category> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    public final List<Category> getData() {
        return this.data;
    }

    public final void setData(List<Category> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final Function1<Integer, Unit> getShowCategory() {
        return this.showCategory;
    }

    public final void setShowCategory(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.showCategory = function1;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_market_category, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…_category, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<Category> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(Category category) {
        Intrinsics.checkNotNullParameter(category, "item");
        this.data.add(category);
        notifyItemInserted(getItemCount() - 1);
    }

    public final Category getItem(int i) {
        return this.data.get(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/marketplace/CategoriesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/adapters/marketplace/CategoriesAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.marketplace.CategoriesAdapter$ViewHolder */
    /* compiled from: CategoriesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ CategoriesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CategoriesAdapter categoriesAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = categoriesAdapter;
        }

        public final void bind(int i) {
            String url;
            Category category = this.this$0.getData().get(i);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.categoryTitleTextView);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.categoryTitleTextView");
            textView.setText(category.getTitle());
            this.itemView.setOnClickListener(new CategoriesAdapter$ViewHolder$bind$1(this, i));
            FileData icon = category.getIcon();
            if (icon != null && (url = icon.getUrl()) != null) {
                if (StringsKt.contains((CharSequence) url, (CharSequence) ".png", false)) {
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    GlideRequest load = GlideApp.with((View) (AppCompatImageView) view2.findViewById(C5619R.C5622id.categoryImageView)).load(url);
                    View view3 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                    load.into((ImageView) (AppCompatImageView) view3.findViewById(C5619R.C5622id.categoryImageView));
                    return;
                }
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                ((AppCompatImageView) view4.findViewById(C5619R.C5622id.categoryImageView)).setLayerType(1, (Paint) null);
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                AppCompatImageView appCompatImageView = (AppCompatImageView) view6.findViewById(C5619R.C5622id.categoryImageView);
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "itemView.categoryImageView");
                ((AppCompatImageView) view5.findViewById(C5619R.C5622id.categoryImageView)).setColorFilter(appCompatImageView.getResources().getColor(R.color.marketIconColor), PorterDuff.Mode.SRC_IN);
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) view7.findViewById(C5619R.C5622id.categoryImageView);
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "itemView.categoryImageView");
                RequestBuilder<Drawable> apply = Glide.with(appCompatImageView2.getContext()).load(url).apply((BaseRequestOptions<?>) ((RequestOptions) new RequestOptions().centerInside()).override(160, 160));
                View view8 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                apply.into((ImageView) (AppCompatImageView) view8.findViewById(C5619R.C5622id.categoryImageView));
            }
        }
    }
}
