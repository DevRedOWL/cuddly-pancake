package p035ru.unicorn.ujin.viewModel.events.market;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/market/OfferActionEvent;", "", "success", "", "message", "", "(ZLjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.market.OfferActionEvent */
/* compiled from: OfferActionEvent.kt */
public final class OfferActionEvent {
    private final String message;
    private final boolean success;

    public OfferActionEvent(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
