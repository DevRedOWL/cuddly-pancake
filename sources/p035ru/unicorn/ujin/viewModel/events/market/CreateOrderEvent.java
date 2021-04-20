package p035ru.unicorn.ujin.viewModel.events.market;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/market/CreateOrderEvent;", "", "success", "", "message", "", "paymentForm", "(ZLjava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPaymentForm", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.market.CreateOrderEvent */
/* compiled from: CreateOrderEvent.kt */
public final class CreateOrderEvent {
    private final String message;
    private final String paymentForm;
    private final boolean success;

    public CreateOrderEvent(boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.paymentForm = str2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPaymentForm() {
        return this.paymentForm;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
