package p035ru.unicorn.ujin.viewModel.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/RegisterGhostEvent;", "", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.RegisterGhostEvent */
/* compiled from: RegisterGhostEvent.kt */
public final class RegisterGhostEvent {
    private final String token;

    public RegisterGhostEvent(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.token = str;
    }

    public final String getToken() {
        return this.token;
    }
}
