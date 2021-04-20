package p035ru.unicorn.ujin.market.order;

import android.content.Context;
import android.os.Handler;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
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
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003&'(B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0014J,\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0014J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0014J\u0014\u0010 \u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"J\u0014\u0010#\u001a\u00020\u001b*\u00020$2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010%\u001a\u00020\u001b*\u00020$2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006¨\u0006)"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderedOfferListAdapter;", "Lru/unicorn/ujin/view/activity/navigation/adapter/BaseAdapter;", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "Lru/unicorn/ujin/market/order/OrderedOfferListAdapter$ViewHolder;", "onOfferSelectedListener", "Lru/unicorn/ujin/market/order/OrderedOfferListAdapter$OnOfferSelectedListener;", "(Lru/unicorn/ujin/market/order/OrderedOfferListAdapter$OnOfferSelectedListener;)V", "context", "Landroid/content/Context;", "getOnOfferSelectedListener$app_kortrosRelease", "()Lru/unicorn/ujin/market/order/OrderedOfferListAdapter$OnOfferSelectedListener;", "setOnOfferSelectedListener$app_kortrosRelease", "getFullCaption", "Landroid/text/SpannableStringBuilder;", "kotlin.jvm.PlatformType", "caption", "", "getItemById", "id", "getItemCount", "", "getViewHolder", "parent", "Landroid/view/View;", "type", "viewType", "onBindViewHolder", "", "holder", "val", "position", "removeItem", "setItems", "items", "", "setCaption", "Landroid/widget/TextView;", "setExpandableText", "Companion", "OnOfferSelectedListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderedOfferListAdapter */
/* compiled from: OrderedOfferListAdapter.kt */
public final class OrderedOfferListAdapter extends BaseAdapter<CartOffer, ViewHolder> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DEFAULT_LINES = 2;
    public static final int MAX_LINES = 100;
    public static final long MIN_DELAY_MS = 500;
    /* access modifiers changed from: private */
    public Context context;
    private OnOfferSelectedListener onOfferSelectedListener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderedOfferListAdapter$OnOfferSelectedListener;", "", "onOfferSelected", "", "position", "", "count", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.OrderedOfferListAdapter$OnOfferSelectedListener */
    /* compiled from: OrderedOfferListAdapter.kt */
    public interface OnOfferSelectedListener {
        void onOfferSelected(int i, int i2);
    }

    public CartOffer getItemById(String str) {
        return null;
    }

    public static final /* synthetic */ Context access$getContext$p(OrderedOfferListAdapter orderedOfferListAdapter) {
        Context context2 = orderedOfferListAdapter.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context2;
    }

    public OrderedOfferListAdapter(OnOfferSelectedListener onOfferSelectedListener2) {
        Intrinsics.checkNotNullParameter(onOfferSelectedListener2, "onOfferSelectedListener");
        this.onOfferSelectedListener = onOfferSelectedListener2;
    }

    public final OnOfferSelectedListener getOnOfferSelectedListener$app_kortrosRelease() {
        return this.onOfferSelectedListener;
    }

    public final void setOnOfferSelectedListener$app_kortrosRelease(OnOfferSelectedListener onOfferSelectedListener2) {
        Intrinsics.checkNotNullParameter(onOfferSelectedListener2, "<set-?>");
        this.onOfferSelectedListener = onOfferSelectedListener2;
    }

    /* access modifiers changed from: protected */
    public ViewHolder getViewHolder(View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, CategoryItem.Fields.parent);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_order_offer, (ViewGroup) view, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…rent as ViewGroup, false)");
        return new ViewHolder(this, inflate);
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(ViewHolder viewHolder, CartOffer cartOffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Intrinsics.checkNotNullParameter(cartOffer, "val");
        viewHolder.bind(i2);
    }

    public int getItemCount() {
        return getData().size();
    }

    public final void setItems(List<CartOffer> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        setData(list);
        notifyDataSetChanged();
    }

    public final void removeItem(int i) {
        getData().remove(i);
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, getData().size());
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderedOfferListAdapter$ViewHolder;", "Lru/unicorn/ujin/view/activity/navigation/adapter/BaseHolder;", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/market/order/OrderedOfferListAdapter;Landroid/view/View;)V", "lastClickTime", "", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.OrderedOfferListAdapter$ViewHolder */
    /* compiled from: OrderedOfferListAdapter.kt */
    public final class ViewHolder extends BaseHolder<CartOffer> {
        /* access modifiers changed from: private */
        public long lastClickTime;
        final /* synthetic */ OrderedOfferListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(OrderedOfferListAdapter orderedOfferListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = orderedOfferListAdapter;
        }

        public final void bind(int i) {
            CartOffer cartOffer = (CartOffer) this.this$0.getData().get(i);
            boolean z = false;
            if (i == 0) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                View findViewById = view.findViewById(C5619R.C5622id.divider);
                Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.divider");
                findViewById.setVisibility(0);
            } else {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                View findViewById2 = view2.findViewById(C5619R.C5622id.divider);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.divider");
                findViewById2.setVisibility(8);
            }
            String title = cartOffer.getTitle();
            if (title != null) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                TextView textView = (TextView) view3.findViewById(C5619R.C5622id.tvTitle);
                Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
                textView.setText(Html.fromHtml(title));
            }
            String summary = cartOffer.getSummary();
            if (summary == null) {
                summary = "";
            }
            String obj = Html.fromHtml(summary).toString();
            if (!StringsKt.isBlank(obj)) {
                OrderedOfferListAdapter orderedOfferListAdapter = this.this$0;
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                TextView textView2 = (TextView) view4.findViewById(C5619R.C5622id.tvSummary);
                Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvSummary");
                orderedOfferListAdapter.setExpandableText(textView2, obj);
            }
            CharSequence price = cartOffer.getPrice();
            if (!(price == null || StringsKt.isBlank(price))) {
                BigDecimal scale = new BigDecimal(cartOffer.getPrice()).setScale(2, 4);
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                TextView textView3 = (TextView) view5.findViewById(C5619R.C5622id.tvPrice);
                Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvPrice");
                textView3.setText(TextUtils.formatAmount(scale, OrderedOfferListAdapter.access$getContext$p(this.this$0)));
            }
            CharSequence oldPrice = cartOffer.getOldPrice();
            if (oldPrice == null || StringsKt.isBlank(oldPrice)) {
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                TextView textView4 = (TextView) view6.findViewById(C5619R.C5622id.tvOldPrice);
                Intrinsics.checkNotNullExpressionValue(textView4, "itemView.tvOldPrice");
                textView4.setVisibility(8);
            } else {
                BigDecimal scale2 = new BigDecimal(cartOffer.getOldPrice()).setScale(2, 4);
                if (scale2.compareTo(BigDecimal.ZERO) > 0) {
                    View view7 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                    TextView textView5 = (TextView) view7.findViewById(C5619R.C5622id.tvOldPrice);
                    textView5.setVisibility(0);
                    View view8 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                    TextView textView6 = (TextView) view8.findViewById(C5619R.C5622id.tvOldPrice);
                    Intrinsics.checkNotNullExpressionValue(textView6, "itemView.tvOldPrice");
                    textView5.setPaintFlags(textView6.getPaintFlags() | 16);
                    textView5.setText(TextUtils.formatAmount(scale2, textView5.getContext()));
                } else {
                    View view9 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                    TextView textView7 = (TextView) view9.findViewById(C5619R.C5622id.tvOldPrice);
                    Intrinsics.checkNotNullExpressionValue(textView7, "itemView.tvOldPrice");
                    textView7.setVisibility(8);
                }
            }
            FileData image = cartOffer.getImage();
            String str = null;
            CharSequence url = image != null ? image.getUrl() : null;
            if (url == null || StringsKt.isBlank(url)) {
                z = true;
            }
            if (!z) {
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                GlideRequests with = GlideApp.with(view10.getContext());
                FileData image2 = cartOffer.getImage();
                if (image2 != null) {
                    str = image2.getUrl();
                }
                GlideRequest listener = with.load(str).listener((RequestListener) new OrderedOfferListAdapter$ViewHolder$bind$3());
                View view11 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                Intrinsics.checkNotNullExpressionValue(listener.into((ImageView) (AppCompatImageView) view11.findViewById(C5619R.C5622id.imageView)), "GlideApp.with(itemView.c….into(itemView.imageView)");
            }
            View view12 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view12, "itemView");
            TextView textView8 = (TextView) view12.findViewById(C5619R.C5622id.tvCount);
            Intrinsics.checkNotNullExpressionValue(textView8, "itemView.tvCount");
            textView8.setText(String.valueOf(cartOffer.getQuantity()));
            View view13 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view13, "itemView");
            ((AppCompatImageButton) view13.findViewById(C5619R.C5622id.btnSubtract)).setOnClickListener(new OrderedOfferListAdapter$ViewHolder$bind$4(this, i));
            View view14 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view14, "itemView");
            ((AppCompatImageButton) view14.findViewById(C5619R.C5622id.btnAdd)).setOnClickListener(new OrderedOfferListAdapter$ViewHolder$bind$5(this, i));
        }
    }

    /* access modifiers changed from: private */
    public final void setCaption(TextView textView, String str) {
        textView.setText(getFullCaption(str));
        if (textView.getLineCount() > 2) {
            int lineVisibleEnd = textView.getLayout().getLineVisibleEnd(1);
            textView.setMaxLines(2);
            String string = textView.getContext().getString(R.string.read_more);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.read_more)");
            String str2 = ' ' + string;
            String str3 = textView.getContext().getString(R.string.more_dots) + str2;
            StringBuilder sb = new StringBuilder();
            int length = (lineVisibleEnd - str3.length()) - 3;
            if (str != null) {
                String substring = str.substring(0, length);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append(str3);
                SpannableString spannableString = new SpannableString(sb.toString());
                spannableString.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.marketEnabledOfferColor)), (lineVisibleEnd - str2.length()) - 3, lineVisibleEnd - 3, 33);
                textView.setText(spannableString);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* access modifiers changed from: private */
    public final void setExpandableText(TextView textView, String str) {
        new Handler().post(new OrderedOfferListAdapter$setExpandableText$1(this, textView, str));
    }

    /* access modifiers changed from: private */
    public final SpannableStringBuilder getFullCaption(String str) {
        return new SpannableStringBuilder().append(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderedOfferListAdapter$Companion;", "", "()V", "DEFAULT_LINES", "", "MAX_LINES", "MIN_DELAY_MS", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.OrderedOfferListAdapter$Companion */
    /* compiled from: OrderedOfferListAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
