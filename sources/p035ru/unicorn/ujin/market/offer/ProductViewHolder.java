package p035ru.unicorn.ujin.market.offer;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p035ru.unicorn.ujin.market.offer.BaseOfferViewHolder;
import p035ru.unicorn.ujin.market.order.OrderFormFragment;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p035ru.unicorn.ujin.util.GlideRequests;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/ProductViewHolder;", "Lru/unicorn/ujin/market/offer/BaseOfferViewHolder;", "itemView", "Landroid/view/View;", "tagList", "", "Lru/unicorn/ujin/data/realm/marketplace/Tag;", "onOfferClickListener", "Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;", "(Landroid/view/View;Ljava/util/List;Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;)V", "clickCount", "", "lastClickTime", "", "bind", "", "offer", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.ProductViewHolder */
/* compiled from: ProductViewHolder.kt */
public final class ProductViewHolder extends BaseOfferViewHolder {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long MIN_DELAY_MS = 500;
    /* access modifiers changed from: private */
    public int clickCount;
    /* access modifiers changed from: private */
    public long lastClickTime;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductViewHolder(View view, List<? extends Tag> list, BaseOfferViewHolder.OnOfferClickListener onOfferClickListener) {
        super(view, list, onOfferClickListener);
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(list, "tagList");
        Intrinsics.checkNotNullParameter(onOfferClickListener, "onOfferClickListener");
    }

    public void bind(Offer offer) {
        RealmList<Integer> tags;
        Object obj;
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(offer, OrderFormFragment.OFFER_TYPE);
        CharSequence title = offer.getTitle();
        boolean z = true;
        if (!(title == null || StringsKt.isBlank(title))) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            textView.setText(Html.fromHtml(offer.getTitle()));
        }
        CharSequence summary = offer.getSummary();
        if (!(summary == null || StringsKt.isBlank(summary))) {
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvDescription);
            textView2.setText(Html.fromHtml(offer.getSummary()));
            textView2.setVisibility(0);
        } else {
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvDescription);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvDescription");
            textView3.setVisibility(8);
        }
        CharSequence price = offer.getPrice();
        if (!(price == null || StringsKt.isBlank(price))) {
            BigDecimal scale = new BigDecimal(offer.getPrice()).setScale(2, 4);
            if (scale.compareTo(BigDecimal.ZERO) > 0) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                TextView textView4 = (TextView) view4.findViewById(C5619R.C5622id.tvPrice);
                textView4.setVisibility(0);
                if (Intrinsics.areEqual((Object) offer.isPriceRange(), (Object) true)) {
                    View view5 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                    Context context = view5.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    String string = context.getResources().getString(R.string.range_min_price, new Object[]{TextUtils.formatDecimal(scale)});
                    View view6 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                    charSequence = TextUtils.formatAmount(string, view6.getContext());
                } else {
                    View view7 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                    charSequence = TextUtils.formatAmount(scale, view7.getContext());
                }
                textView4.setText(charSequence);
            }
        } else {
            View view8 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "itemView");
            TextView textView5 = (TextView) view8.findViewById(C5619R.C5622id.tvPrice);
            Intrinsics.checkNotNullExpressionValue(textView5, "itemView.tvPrice");
            textView5.setVisibility(4);
        }
        if (offer.getOldPrice() != null) {
            BigDecimal scale2 = new BigDecimal(offer.getOldPrice()).setScale(2, 4);
            if (scale2.compareTo(BigDecimal.ZERO) > 0) {
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                TextView textView6 = (TextView) view9.findViewById(C5619R.C5622id.tvOldPrice);
                textView6.setVisibility(0);
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                TextView textView7 = (TextView) view10.findViewById(C5619R.C5622id.tvOldPrice);
                Intrinsics.checkNotNullExpressionValue(textView7, "itemView.tvOldPrice");
                textView6.setPaintFlags(textView7.getPaintFlags() | 16);
                View view11 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                textView6.setText(TextUtils.formatAmount(scale2, view11.getContext()));
            }
        } else {
            View view12 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view12, "itemView");
            TextView textView8 = (TextView) view12.findViewById(C5619R.C5622id.tvOldPrice);
            Intrinsics.checkNotNullExpressionValue(textView8, "itemView.tvOldPrice");
            textView8.setVisibility(4);
        }
        FileData image = offer.getImage();
        CharSequence url = image != null ? image.getUrl() : null;
        if (!(url == null || StringsKt.isBlank(url))) {
            View view13 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view13, "itemView");
            GlideRequests with = GlideApp.with(view13.getContext());
            FileData image2 = offer.getImage();
            GlideRequest override = with.load(image2 != null ? image2.getUrl() : null).diskCacheStrategy(DiskCacheStrategy.ALL).override(200, 200);
            View view14 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view14, "itemView");
            Intrinsics.checkNotNullExpressionValue(override.into((ImageView) view14.findViewById(C5619R.C5622id.imageView)), "GlideApp.with(itemView.c….into(itemView.imageView)");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            View view15 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view15, "itemView");
            ImageView imageView = (ImageView) view15.findViewById(C5619R.C5622id.imageView);
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.imageView");
            imageView.setClipToOutline(true);
        }
        View view16 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view16, "itemView");
        ((ConstraintLayout) view16.findViewById(C5619R.C5622id.offerLayout)).setOnClickListener(new ProductViewHolder$bind$5(this, offer));
        View view17 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view17, "itemView");
        ((DynamicBackgroundButton) view17.findViewById(C5619R.C5622id.btnDescription)).setOnClickListener(new ProductViewHolder$bind$6(this, offer));
        View view18 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view18, "itemView");
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) view18.findViewById(C5619R.C5622id.btnOrder);
        CharSequence importOfferLink = offer.getImportOfferLink();
        if (!(importOfferLink == null || importOfferLink.length() == 0)) {
            dynamicBackgroundButton.setText(dynamicBackgroundButton.getResources().getString(R.string.to_shop));
            dynamicBackgroundButton.setOnClickListener(new ProductViewHolder$bind$$inlined$apply$lambda$1(dynamicBackgroundButton, this, offer));
        } else if (Intrinsics.areEqual((Object) offer.isPaymentEnabled(), (Object) true)) {
            dynamicBackgroundButton.setText(dynamicBackgroundButton.getResources().getString(R.string.to_cart));
            dynamicBackgroundButton.setOnClickListener(new ProductViewHolder$bind$$inlined$apply$lambda$2(this, offer));
        } else {
            dynamicBackgroundButton.setText(dynamicBackgroundButton.getResources().getString(R.string.order));
            dynamicBackgroundButton.setOnClickListener(new ProductViewHolder$bind$$inlined$apply$lambda$3(this, offer));
        }
        Collection tags2 = offer.getTags();
        if (!(tags2 == null || tags2.isEmpty()) && (tags = offer.getTags()) != null) {
            View view19 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view19, "itemView");
            ((TagListLayout) view19.findViewById(C5619R.C5622id.tagListLayout)).removeAllViews();
            Iterator<Integer> it = tags.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                Iterator it2 = getTagList$app_kortrosRelease().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.areEqual((Object) ((Tag) obj).getId(), (Object) next)) {
                        break;
                    }
                }
                Tag tag = (Tag) obj;
                if (tag != null) {
                    View view20 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view20, "itemView");
                    View inflate = LayoutInflater.from(view20.getContext()).inflate(R.layout.offer_tag_layout, (ViewGroup) null, false);
                    Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(item…_tag_layout, null, false)");
                    TextView textView9 = (TextView) inflate.findViewById(C5619R.C5622id.tvTagValue);
                    Intrinsics.checkNotNullExpressionValue(textView9, "tagView.tvTagValue");
                    textView9.setText(tag.getTitle());
                    ((CardView) inflate.findViewById(C5619R.C5622id.cvTagLayout)).setCardBackgroundColor(Color.parseColor(tag.getColor()));
                    View view21 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view21, "itemView");
                    ((TagListLayout) view21.findViewById(C5619R.C5622id.tagListLayout)).addView(inflate);
                }
            }
            View view22 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view22, "itemView");
            ((TagListLayout) view22.findViewById(C5619R.C5622id.tagListLayout)).setPadding(0, 0, 0, 0);
        }
        Collection tags3 = offer.getTags();
        if (tags3 != null && !tags3.isEmpty()) {
            z = false;
        }
        if (z) {
            View view23 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view23, "itemView");
            ((TagListLayout) view23.findViewById(C5619R.C5622id.tagListLayout)).removeAllViews();
            View view24 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view24, "itemView");
            ((TagListLayout) view24.findViewById(C5619R.C5622id.tagListLayout)).setPadding(0, 0, 0, 60);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/ProductViewHolder$Companion;", "", "()V", "MIN_DELAY_MS", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.ProductViewHolder$Companion */
    /* compiled from: ProductViewHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
