package p035ru.unicorn.ujin.market.offer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/offer/OfferFragment$handleEvent$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferFragment$handleEvent$$inlined$apply$lambda$1 */
/* compiled from: OfferFragment.kt */
final class OfferFragment$handleEvent$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ DynamicBackgroundButton $this_apply;
    final /* synthetic */ OfferFragment this$0;

    OfferFragment$handleEvent$$inlined$apply$lambda$1(DynamicBackgroundButton dynamicBackgroundButton, OfferFragment offerFragment) {
        this.$this_apply = dynamicBackgroundButton;
        this.this$0 = offerFragment;
    }

    public final void onClick(View view) {
        String str;
        MetricsFacade.Companion companion = MetricsFacade.Companion;
        String value = MetricsKeys.market.getValue();
        HashMap hashMap = new HashMap();
        String value2 = MetricsKeys.toShop.getValue();
        Offer access$getOffer$p = this.this$0.offer;
        if (access$getOffer$p == null || (str = access$getOffer$p.getTitle()) == null) {
            str = MetricsKeys.error.getValue();
        }
        hashMap.put(value2, str);
        Unit unit = Unit.INSTANCE;
        companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        Context context = this.$this_apply.getContext();
        Offer access$getOffer$p2 = this.this$0.offer;
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(access$getOffer$p2 != null ? access$getOffer$p2.getImportOfferLink() : null)));
    }
}
