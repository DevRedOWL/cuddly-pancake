package p035ru.unicorn.ujin.market.order;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p035ru.unicorn.ujin.util.GlideRequests;
import p035ru.unicorn.ujin.util.TextUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/FormOfferListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/market/order/FormOfferListAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "getItem", "position", "", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.FormOfferListAdapter */
/* compiled from: FormOfferListAdapter.kt */
public final class FormOfferListAdapter extends RecyclerView.Adapter<ViewHolder> {
    /* access modifiers changed from: private */
    public Context context;
    private List<CartOffer> data;

    public FormOfferListAdapter(List<CartOffer> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    public static final /* synthetic */ Context access$getContext$p(FormOfferListAdapter formOfferListAdapter) {
        Context context2 = formOfferListAdapter.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context2;
    }

    public final List<CartOffer> getData() {
        return this.data;
    }

    public final void setData(List<CartOffer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
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
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_ordered_offer, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…red_offer, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<CartOffer> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final CartOffer getItem(int i) {
        return this.data.get(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/FormOfferListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/market/order/FormOfferListAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.FormOfferListAdapter$ViewHolder */
    /* compiled from: FormOfferListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ FormOfferListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(FormOfferListAdapter formOfferListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = formOfferListAdapter;
        }

        public final void bind(int i) {
            CartOffer cartOffer = this.this$0.getData().get(i);
            CharSequence title = cartOffer.getTitle();
            boolean z = false;
            if (!(title == null || StringsKt.isBlank(title))) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
                Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
                textView.setText(Html.fromHtml(cartOffer.getTitle()));
            }
            String price = cartOffer.getPrice();
            if (price != null) {
                BigDecimal scale = new BigDecimal(price).setScale(2, 4);
                if (scale.compareTo(BigDecimal.ZERO) > 0) {
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvOfferPrice);
                    Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvOfferPrice");
                    textView2.setText(TextUtils.formatAmount(scale, FormOfferListAdapter.access$getContext$p(this.this$0)));
                }
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvOfferCount);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvOfferCount");
            StringBuilder sb = new StringBuilder();
            sb.append(cartOffer.getQuantity());
            sb.append(' ');
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            Context context = view4.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            sb.append(context.getResources().getString(R.string.offer_unit));
            textView3.setText(sb.toString());
            FileData image = cartOffer.getImage();
            String str = null;
            CharSequence url = image != null ? image.getUrl() : null;
            if (url == null || StringsKt.isBlank(url)) {
                z = true;
            }
            if (!z) {
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                GlideRequests with = GlideApp.with(view5.getContext());
                FileData image2 = cartOffer.getImage();
                if (image2 != null) {
                    str = image2.getUrl();
                }
                GlideRequest listener = with.load(str).listener((RequestListener) new FormOfferListAdapter$ViewHolder$bind$2());
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                Intrinsics.checkNotNullExpressionValue(listener.into((ImageView) (AppCompatImageView) view6.findViewById(C5619R.C5622id.imageView)), "GlideApp.with(itemView.c….into(itemView.imageView)");
            }
        }
    }
}
