package p035ru.unicorn.ujin.viewModel.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/ProfileSubAccountUpdateEvent;", "", "success", "", "message", "", "subAccountList", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/api/response/SubAccount;", "(ZLjava/lang/String;Lio/realm/RealmList;)V", "getMessage", "()Ljava/lang/String;", "getSubAccountList", "()Lio/realm/RealmList;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.ProfileSubAccountUpdateEvent */
/* compiled from: ProfileSubAccountUpdateEvent.kt */
public final class ProfileSubAccountUpdateEvent {
    private final String message;
    private final RealmList<SubAccount> subAccountList;
    private final boolean success;

    public ProfileSubAccountUpdateEvent(boolean z, String str, RealmList<SubAccount> realmList) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(realmList, "subAccountList");
        this.success = z;
        this.message = str;
        this.subAccountList = realmList;
    }

    public final String getMessage() {
        return this.message;
    }

    public final RealmList<SubAccount> getSubAccountList() {
        return this.subAccountList;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
