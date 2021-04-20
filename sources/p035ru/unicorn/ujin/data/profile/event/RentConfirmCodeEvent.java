package p035ru.unicorn.ujin.data.profile.event;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/data/profile/event/RentConfirmCodeEvent;", "", "success", "", "message", "", "codeConfirmed", "(ZLjava/lang/String;Z)V", "getCodeConfirmed", "()Z", "getMessage", "()Ljava/lang/String;", "getSuccess", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.event.RentConfirmCodeEvent */
/* compiled from: RentConfirmCodeEvent.kt */
public final class RentConfirmCodeEvent {
    private final boolean codeConfirmed;
    private final String message;
    private final boolean success;

    public RentConfirmCodeEvent(boolean z, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.codeConfirmed = z2;
    }

    public final boolean getCodeConfirmed() {
        return this.codeConfirmed;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
