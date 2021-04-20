package p035ru.unicorn.ujin.viewModel.events.profile;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.profile.User;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/profile/AuthProviderEvent;", "", "success", "", "message", "", "user", "Lru/unicorn/ujin/data/realm/profile/User;", "(ZLjava/lang/String;Lru/unicorn/ujin/data/realm/profile/User;)V", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "getUser", "()Lru/unicorn/ujin/data/realm/profile/User;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.profile.AuthProviderEvent */
/* compiled from: AuthProviderEvent.kt */
public final class AuthProviderEvent {
    private final String message;
    private final boolean success;
    private final User user;

    public AuthProviderEvent(boolean z, String str, User user2) {
        this.success = z;
        this.message = str;
        this.user = user2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final User getUser() {
        return this.user;
    }
}
