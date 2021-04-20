package p035ru.unicorn.ujin.market.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CreateOrderResponse;
import p035ru.unicorn.ujin.data.api.response.marketplace.CreateOrderResponseData;
import p035ru.unicorn.ujin.data.api.response.marketplace.PaymentData;
import p035ru.unicorn.ujin.data.realm.ErrorData;
import p035ru.unicorn.ujin.viewModel.events.market.CreateOrderEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/marketplace/CreateOrderResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$createOrder$1 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$createOrder$1<T> implements Consumer<CreateOrderResponse> {
    final /* synthetic */ MarketRemoteRepository this$0;

    MarketRemoteRepository$createOrder$1(MarketRemoteRepository marketRemoteRepository) {
        this.this$0 = marketRemoteRepository;
    }

    public final void accept(CreateOrderResponse createOrderResponse) {
        String str;
        PaymentData payment;
        PublishSubject<CreateOrderEvent> createOrderSubject = this.this$0.getCreateOrderSubject();
        boolean z = createOrderResponse.getService().getError() == null;
        ErrorData error = createOrderResponse.getService().getError();
        if (error == null || (str = error.getMessage()) == null) {
            str = "";
        }
        CreateOrderResponseData data = createOrderResponse.getData();
        createOrderSubject.onNext(new CreateOrderEvent(z, str, (data == null || (payment = data.getPayment()) == null) ? null : payment.getUrl()));
    }
}
