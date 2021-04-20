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
import com.bumptech.glide.request.RequestListener;
import java.math.BigDecimal;
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
import p035ru.unicorn.ujin.util.GlideRequests;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/ServiceViewHolder;", "Lru/unicorn/ujin/market/offer/BaseOfferViewHolder;", "itemView", "Landroid/view/View;", "tagList", "", "Lru/unicorn/ujin/data/realm/marketplace/Tag;", "onOfferClickListener", "Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;", "(Landroid/view/View;Ljava/util/List;Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;)V", "bind", "", "offer", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.ServiceViewHolder */
/* compiled from: ServiceViewHolder.kt */
public final class ServiceViewHolder extends BaseOfferViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceViewHolder(View view, List<? extends Tag> list, BaseOfferViewHolder.OnOfferClickListener onOfferClickListener) {
        super(view, list, onOfferClickListener);
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(list, "tagList");
        Intrinsics.checkNotNullParameter(onOfferClickListener, "onOfferClickListener");
    }

    public void bind(Offer offer) {
        Object obj;
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(offer, OrderFormFragment.OFFER_TYPE);
        CharSequence title = offer.getTitle();
        boolean z = false;
        if (!(title == null || StringsKt.isBlank(title))) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            textView.setText(Html.fromHtml(offer.getTitle()));
        }
        CharSequence price = offer.getPrice();
        if (!(price == null || StringsKt.isBlank(price))) {
            BigDecimal scale = new BigDecimal(offer.getPrice()).setScale(2, 4);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvPrice);
            textView2.setVisibility(0);
            if (Intrinsics.areEqual((Object) offer.isPriceRange(), (Object) true)) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                Context context = view3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                String string = context.getResources().getString(R.string.range_min_price, new Object[]{TextUtils.formatDecimal(scale)});
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                charSequence = TextUtils.formatAmount(string, view4.getContext());
            } else {
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                charSequence = TextUtils.formatAmount(scale, view5.getContext());
            }
            textView2.setText(charSequence);
        } else {
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            TextView textView3 = (TextView) view6.findViewById(C5619R.C5622id.tvPrice);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvPrice");
            textView3.setVisibility(4);
        }
        FileData image = offer.getImage();
        CharSequence url = image != null ? image.getUrl() : null;
        if (url == null || StringsKt.isBlank(url)) {
            View view7 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "itemView");
            CardView cardView = (CardView) view7.findViewById(C5619R.C5622id.cvImage);
            Intrinsics.checkNotNullExpressionValue(cardView, "itemView.cvImage");
            cardView.setVisibility(8);
        } else {
            View view8 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "itemView");
            GlideRequests with = GlideApp.with(view8.getContext());
            FileData image2 = offer.getImage();
            with.load(image2 != null ? image2.getUrl() : null).diskCacheStrategy(DiskCacheStrategy.ALL).listener((RequestListener) new ServiceViewHolder$bind$2(this)).submit();
            if (Build.VERSION.SDK_INT >= 21) {
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                ImageView imageView = (ImageView) view9.findViewById(C5619R.C5622id.ivIcon);
                Intrinsics.checkNotNullExpressionValue(imageView, "itemView.ivIcon");
                imageView.setClipToOutline(true);
            }
        }
        RealmList<Integer> tags = offer.getTags();
        if (tags != null) {
            View view10 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view10, "itemView");
            TagListLayout tagListLayout = (TagListLayout) view10.findViewById(C5619R.C5622id.tagListLayout);
            Intrinsics.checkNotNullExpressionValue(tagListLayout, "itemView.tagListLayout");
            tagListLayout.setVisibility(0);
            if (!tags.isEmpty()) {
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
                        View view11 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                        View inflate = LayoutInflater.from(view11.getContext()).inflate(R.layout.offer_tag_layout, (ViewGroup) null, false);
                        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(item…_tag_layout, null, false)");
                        TextView textView4 = (TextView) inflate.findViewById(C5619R.C5622id.tvTagValue);
                        Intrinsics.checkNotNullExpressionValue(textView4, "tagView.tvTagValue");
                        textView4.setText(tag.getTitle());
                        ((CardView) inflate.findViewById(C5619R.C5622id.cvTagLayout)).setCardBackgroundColor(Color.parseColor(tag.getColor()));
                        View view12 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view12, "itemView");
                        ((TagListLayout) view12.findViewById(C5619R.C5622id.tagListLayout)).addView(inflate);
                    }
                }
            }
        }
        View view13 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view13, "itemView");
        ((ImageView) view13.findViewById(C5619R.C5622id.ivIcon)).setOnClickListener(new ServiceViewHolder$bind$4(this, offer));
        View view14 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view14, "itemView");
        ((ConstraintLayout) view14.findViewById(C5619R.C5622id.serviceLayout)).setOnClickListener(new ServiceViewHolder$bind$5(this, offer));
        View view15 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view15, "itemView");
        ((DynamicBackgroundButton) view15.findViewById(C5619R.C5622id.btnDescription)).setOnClickListener(new ServiceViewHolder$bind$6(this, offer));
        View view16 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view16, "itemView");
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) view16.findViewById(C5619R.C5622id.btnOrder);
        CharSequence importOfferLink = offer.getImportOfferLink();
        if (importOfferLink == null || importOfferLink.length() == 0) {
            z = true;
        }
        if (!z) {
            dynamicBackgroundButton.setText(dynamicBackgroundButton.getResources().getString(R.string.to_shop));
            dynamicBackgroundButton.setOnClickListener(new ServiceViewHolder$bind$$inlined$apply$lambda$1(dynamicBackgroundButton, this, offer));
            return;
        }
        dynamicBackgroundButton.setText(dynamicBackgroundButton.getResources().getString(R.string.order));
        dynamicBackgroundButton.setOnClickListener(new ServiceViewHolder$bind$$inlined$apply$lambda$2(this, offer));
    }
}
