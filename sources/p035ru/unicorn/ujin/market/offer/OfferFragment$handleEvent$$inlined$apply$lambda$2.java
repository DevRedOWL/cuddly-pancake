package p035ru.unicorn.ujin.market.offer;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.market.order.OrderFormFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/offer/OfferFragment$handleEvent$3$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferFragment$handleEvent$$inlined$apply$lambda$2 */
/* compiled from: OfferFragment.kt */
final class OfferFragment$handleEvent$$inlined$apply$lambda$2 implements View.OnClickListener {
    final /* synthetic */ OfferFragment this$0;

    OfferFragment$handleEvent$$inlined$apply$lambda$2(OfferFragment offerFragment) {
        this.this$0 = offerFragment;
    }

    public final void onClick(View view) {
        OfferFragment offerFragment = this.this$0;
        offerFragment.showOrderFormFragment(offerFragment.offerId, OrderFormFragment.OFFER_TYPE);
    }
}
