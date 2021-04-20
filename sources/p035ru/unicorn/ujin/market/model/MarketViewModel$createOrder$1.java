package p035ru.unicorn.ujin.market.model;

import kotlin.Metadata;
import p035ru.unicorn.ujin.viewModel.events.market.CreateOrderEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/market/CreateOrderEvent;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel$createOrder$1 */
/* compiled from: MarketViewModel.kt */
final class MarketViewModel$createOrder$1<T> implements Consumer<CreateOrderEvent> {
    final /* synthetic */ MarketViewModel this$0;

    MarketViewModel$createOrder$1(MarketViewModel marketViewModel) {
        this.this$0 = marketViewModel;
    }

    public final void accept(CreateOrderEvent createOrderEvent) {
        this.this$0.getCreateOrderLiveData().setValue(createOrderEvent);
    }
}
