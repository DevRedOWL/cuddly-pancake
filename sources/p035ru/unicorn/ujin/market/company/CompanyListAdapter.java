package p035ru.unicorn.ujin.market.company;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u000f2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0014\u0010\u001f\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R0\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/market/company/CompanyListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/market/company/CompanyListAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "onItemClick", "Lkotlin/Function2;", "", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function2;", "setOnItemClick", "(Lkotlin/jvm/functions/Function2;)V", "addItem", "item", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.company.CompanyListAdapter */
/* compiled from: CompanyListAdapter.kt */
public final class CompanyListAdapter extends RecyclerView.Adapter<ViewHolder> {
    /* access modifiers changed from: private */
    public Context context;
    private List<Company> data;
    private Function2<? super String, ? super String, Unit> onItemClick = CompanyListAdapter$onItemClick$1.INSTANCE;

    public CompanyListAdapter(List<Company> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    public static final /* synthetic */ Context access$getContext$p(CompanyListAdapter companyListAdapter) {
        Context context2 = companyListAdapter.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context2;
    }

    public final List<Company> getData() {
        return this.data;
    }

    public final void setData(List<Company> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final Function2<String, String, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final void setOnItemClick(Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onItemClick = function2;
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
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_market_company, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…t_company, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(this.data.get(i));
        if (i == getItemCount() - 1) {
            View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((RecyclerView.LayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<Company> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(Company company) {
        Intrinsics.checkNotNullParameter(company, "item");
        this.data.add(company);
        notifyItemInserted(getItemCount() - 1);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/company/CompanyListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/market/company/CompanyListAdapter;Landroid/view/View;)V", "bind", "", "company", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.company.CompanyListAdapter$ViewHolder */
    /* compiled from: CompanyListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ CompanyListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CompanyListAdapter companyListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = companyListAdapter;
        }

        public final void bind(Company company) {
            String url;
            String url2;
            Intrinsics.checkNotNullParameter(company, "company");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            textView.setText(company.getTitle());
            RealmList<String> highlights = company.getHighlights();
            if (highlights != null) {
                if (highlights.size() > 0) {
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvDescription1);
                    Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvDescription1");
                    textView2.setText(highlights.get(0));
                }
                if (highlights.size() > 1) {
                    View view3 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                    TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvDescription2);
                    Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvDescription2");
                    textView3.setText(highlights.get(1));
                }
            }
            this.itemView.setOnClickListener(new CompanyListAdapter$ViewHolder$bind$2(this, company));
            FileData logo = company.getLogo();
            CharSequence url3 = logo != null ? logo.getUrl() : null;
            if (url3 == null || StringsKt.isBlank(url3)) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                CardView cardView = (CardView) view4.findViewById(C5619R.C5622id.imageCardView);
                Intrinsics.checkNotNullExpressionValue(cardView, "itemView.imageCardView");
                cardView.setVisibility(4);
            } else {
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                CardView cardView2 = (CardView) view5.findViewById(C5619R.C5622id.imageCardView);
                Intrinsics.checkNotNullExpressionValue(cardView2, "itemView.imageCardView");
                cardView2.setVisibility(0);
            }
            FileData logo2 = company.getLogo();
            if (!(logo2 == null || (url2 = logo2.getUrl()) == null)) {
                GlideRequest override = GlideApp.with(CompanyListAdapter.access$getContext$p(this.this$0)).load(url2).diskCacheStrategy(DiskCacheStrategy.ALL).override(200, 200);
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                override.into((ImageView) (AppCompatImageView) view6.findViewById(C5619R.C5622id.ivLogo));
            }
            FileData background = company.getBackground();
            if (background != null && (url = background.getUrl()) != null) {
                GlideRequest diskCacheStrategy = GlideApp.with(CompanyListAdapter.access$getContext$p(this.this$0)).load(url).diskCacheStrategy(DiskCacheStrategy.ALL);
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                diskCacheStrategy.into((ImageView) view7.findViewById(C5619R.C5622id.ivCompanyBackground));
                if (Build.VERSION.SDK_INT >= 21) {
                    View view8 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                    ImageView imageView = (ImageView) view8.findViewById(C5619R.C5622id.ivCompanyBackground);
                    Intrinsics.checkNotNullExpressionValue(imageView, "itemView.ivCompanyBackground");
                    imageView.setClipToOutline(true);
                }
            }
        }
    }
}
