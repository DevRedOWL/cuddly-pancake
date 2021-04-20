package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p046io.realm.C4791x5220dc0f;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactDataList;", "Lio/realm/RealmObject;", "items", "Lio/realm/RealmList;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "(Lio/realm/RealmList;)V", "getItems", "()Lio/realm/RealmList;", "setItems", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactDataList */
/* compiled from: ContactDataList.kt */
public class ContactDataList extends RealmObject implements C4791x5220dc0f {
    private RealmList<UserProfile> items;

    public ContactDataList() {
        this((RealmList) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList realmGet$items() {
        return this.items;
    }

    public void realmSet$items(RealmList realmList) {
        this.items = realmList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactDataList(RealmList realmList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new RealmList() : realmList);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final RealmList<UserProfile> getItems() {
        return realmGet$items();
    }

    public final void setItems(RealmList<UserProfile> realmList) {
        Intrinsics.checkNotNullParameter(realmList, "<set-?>");
        realmSet$items(realmList);
    }

    public ContactDataList(RealmList<UserProfile> realmList) {
        Intrinsics.checkNotNullParameter(realmList, FirebaseAnalytics.Param.ITEMS);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$items(realmList);
    }
}
