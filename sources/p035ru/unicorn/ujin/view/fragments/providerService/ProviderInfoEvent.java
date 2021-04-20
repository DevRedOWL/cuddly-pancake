package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ProviderInfoEvent;", "", "success", "", "message", "", "unavailable", "Lru/unicorn/ujin/view/fragments/providerService/Unavailable;", "available", "Lru/unicorn/ujin/view/fragments/providerService/Available;", "(ZLjava/lang/String;Lru/unicorn/ujin/view/fragments/providerService/Unavailable;Lru/unicorn/ujin/view/fragments/providerService/Available;)V", "getAvailable", "()Lru/unicorn/ujin/view/fragments/providerService/Available;", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "getUnavailable", "()Lru/unicorn/ujin/view/fragments/providerService/Unavailable;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderInfoEvent */
/* compiled from: ProviderInfoEvent.kt */
public final class ProviderInfoEvent {
    private final Available available;
    private final String message;
    private final boolean success;
    private final Unavailable unavailable;

    public ProviderInfoEvent(boolean z, String str, Unavailable unavailable2, Available available2) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.unavailable = unavailable2;
        this.available = available2;
    }

    public final Available getAvailable() {
        return this.available;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final Unavailable getUnavailable() {
        return this.unavailable;
    }
}
