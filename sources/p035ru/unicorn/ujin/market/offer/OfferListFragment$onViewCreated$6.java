package p035ru.unicorn.ujin.market.offer;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "event", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferListFragment$onViewCreated$6 */
/* compiled from: OfferListFragment.kt */
final class OfferListFragment$onViewCreated$6<T> implements Observer<Boolean> {
    final /* synthetic */ OfferListFragment this$0;

    OfferListFragment$onViewCreated$6(OfferListFragment offerListFragment) {
        this.this$0 = offerListFragment;
    }

    public final void onChanged(Boolean bool) {
        OfferListFragment offerListFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(bool, "event");
        offerListFragment.toggleProgressVisibility(bool.booleanValue());
    }
}
