package p035ru.unicorn.ujin.data.realm.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/UserResponse;", "", "user", "Lru/unicorn/ujin/data/realm/profile/User;", "(Lru/unicorn/ujin/data/realm/profile/User;)V", "getUser", "()Lru/unicorn/ujin/data/realm/profile/User;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.profile.UserResponse */
/* compiled from: UserResponse.kt */
public final class UserResponse {
    private final User user;

    public static /* synthetic */ UserResponse copy$default(UserResponse userResponse, User user2, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = userResponse.user;
        }
        return userResponse.copy(user2);
    }

    public final User component1() {
        return this.user;
    }

    public final UserResponse copy(User user2) {
        return new UserResponse(user2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserResponse) && Intrinsics.areEqual((Object) this.user, (Object) ((UserResponse) obj).user);
        }
        return true;
    }

    public int hashCode() {
        User user2 = this.user;
        if (user2 != null) {
            return user2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "UserResponse(user=" + this.user + ")";
    }

    public UserResponse(User user2) {
        this.user = user2;
    }

    public final User getUser() {
        return this.user;
    }
}
