package p035ru.unicorn.ujin.market.offer;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/offer/ProductViewHolder$bind$7$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.ProductViewHolder$bind$$inlined$apply$lambda$3 */
/* compiled from: ProductViewHolder.kt */
final class ProductViewHolder$bind$$inlined$apply$lambda$3 implements View.OnClickListener {
    final /* synthetic */ Offer $offer$inlined;
    final /* synthetic */ ProductViewHolder this$0;

    ProductViewHolder$bind$$inlined$apply$lambda$3(ProductViewHolder productViewHolder, Offer offer) {
        this.this$0 = productViewHolder;
        this.$offer$inlined = offer;
    }

    public final void onClick(View view) {
        this.this$0.getOnOfferClickListener$app_kortrosRelease().onOrderClicked(this.$offer$inlined.getId());
    }
}
