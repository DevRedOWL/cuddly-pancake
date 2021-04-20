package p035ru.unicorn.ujin.market.offer;

import android.os.Handler;
import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/offer/OfferFragment$handleEvent$4$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferFragment$handleEvent$$inlined$apply$lambda$3 */
/* compiled from: OfferFragment.kt */
final class OfferFragment$handleEvent$$inlined$apply$lambda$3 implements View.OnClickListener {
    final /* synthetic */ OfferFragment this$0;

    OfferFragment$handleEvent$$inlined$apply$lambda$3(OfferFragment offerFragment) {
        this.this$0 = offerFragment;
    }

    public final void onClick(View view) {
        this.this$0.lastClickTime = System.currentTimeMillis();
        OfferFragment offerFragment = this.this$0;
        offerFragment.clickCount = offerFragment.clickCount + 1;
        new Handler().postDelayed(new Runnable(this) {
            final /* synthetic */ OfferFragment$handleEvent$$inlined$apply$lambda$3 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                if (System.currentTimeMillis() - this.this$0.this$0.lastClickTime >= 500) {
                    this.this$0.this$0.addToCart();
                    this.this$0.this$0.clickCount = 0;
                }
            }
        }, 500);
    }
}
