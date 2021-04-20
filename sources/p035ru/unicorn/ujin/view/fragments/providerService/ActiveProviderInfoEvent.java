package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoEvent;", "", "success", "", "message", "", "service", "Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderService;", "(ZLjava/lang/String;Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderService;)V", "getMessage", "()Ljava/lang/String;", "getService", "()Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderService;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ActiveProviderInfoEvent */
/* compiled from: ActiveProviderInfoEvent.kt */
public final class ActiveProviderInfoEvent {
    private final String message;
    private final ActiveProviderService service;
    private final boolean success;

    public ActiveProviderInfoEvent(boolean z, String str, ActiveProviderService activeProviderService) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.service = activeProviderService;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ActiveProviderService getService() {
        return this.service;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
