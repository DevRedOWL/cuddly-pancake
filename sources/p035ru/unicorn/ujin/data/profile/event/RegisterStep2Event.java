package p035ru.unicorn.ujin.data.profile.event;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.authorization.RegisterStep2ResponseData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/profile/event/RegisterStep2Event;", "", "success", "", "message", "", "responseData", "Lru/unicorn/ujin/data/api/response/authorization/RegisterStep2ResponseData;", "(ZLjava/lang/String;Lru/unicorn/ujin/data/api/response/authorization/RegisterStep2ResponseData;)V", "getMessage", "()Ljava/lang/String;", "getResponseData", "()Lru/unicorn/ujin/data/api/response/authorization/RegisterStep2ResponseData;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.event.RegisterStep2Event */
/* compiled from: RegisterStep2Event.kt */
public final class RegisterStep2Event {
    private final String message;
    private final RegisterStep2ResponseData responseData;
    private final boolean success;

    public RegisterStep2Event(boolean z, String str, RegisterStep2ResponseData registerStep2ResponseData) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.responseData = registerStep2ResponseData;
    }

    public final String getMessage() {
        return this.message;
    }

    public final RegisterStep2ResponseData getResponseData() {
        return this.responseData;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
