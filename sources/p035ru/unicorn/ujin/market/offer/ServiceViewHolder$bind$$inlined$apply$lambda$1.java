package p035ru.unicorn.ujin.market.offer;

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

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/offer/ServiceViewHolder$bind$7$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.ServiceViewHolder$bind$$inlined$apply$lambda$1 */
/* compiled from: ServiceViewHolder.kt */
final class ServiceViewHolder$bind$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ Offer $offer$inlined;
    final /* synthetic */ DynamicBackgroundButton $this_apply;
    final /* synthetic */ ServiceViewHolder this$0;

    ServiceViewHolder$bind$$inlined$apply$lambda$1(DynamicBackgroundButton dynamicBackgroundButton, ServiceViewHolder serviceViewHolder, Offer offer) {
        this.$this_apply = dynamicBackgroundButton;
        this.this$0 = serviceViewHolder;
        this.$offer$inlined = offer;
    }

    public final void onClick(View view) {
        MetricsFacade.Companion companion = MetricsFacade.Companion;
        String value = MetricsKeys.market.getValue();
        HashMap hashMap = new HashMap();
        String value2 = MetricsKeys.toShop.getValue();
        String title = this.$offer$inlined.getTitle();
        if (title == null) {
            title = MetricsKeys.error.getValue();
        }
        hashMap.put(value2, title);
        Unit unit = Unit.INSTANCE;
        companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        this.$this_apply.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.$offer$inlined.getImportOfferLink())));
    }
}
