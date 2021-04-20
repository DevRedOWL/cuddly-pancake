package p035ru.unicorn.ujin.market.offer;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.viewModel.events.market.OfferEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/market/OfferEvent;", "kotlin.jvm.PlatformType", "onChanged", "ru/unicorn/ujin/market/offer/OfferFragment$onViewCreated$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferFragment$onViewCreated$$inlined$let$lambda$1 */
/* compiled from: OfferFragment.kt */
final class OfferFragment$onViewCreated$$inlined$let$lambda$1<T> implements Observer<OfferEvent> {
    final /* synthetic */ OfferFragment this$0;

    OfferFragment$onViewCreated$$inlined$let$lambda$1(OfferFragment offerFragment) {
        this.this$0 = offerFragment;
    }

    public final void onChanged(OfferEvent offerEvent) {
        OfferFragment offerFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(offerEvent, "event");
        offerFragment.handleEvent(offerEvent);
    }
}
