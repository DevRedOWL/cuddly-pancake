package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p046io.realm.C4793xd4e0c70d;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactData;", "Lio/realm/RealmObject;", "employee", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "(Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;)V", "getEmployee", "()Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "setEmployee", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactData */
/* compiled from: ContactData.kt */
public class ContactData extends RealmObject implements C4793xd4e0c70d {
    private UserProfile employee;

    public ContactData() {
        this((UserProfile) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public UserProfile realmGet$employee() {
        return this.employee;
    }

    public void realmSet$employee(UserProfile userProfile) {
        this.employee = userProfile;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactData(UserProfile userProfile, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userProfile);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final UserProfile getEmployee() {
        return realmGet$employee();
    }

    public final void setEmployee(UserProfile userProfile) {
        realmSet$employee(userProfile);
    }

    public ContactData(UserProfile userProfile) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$employee(userProfile);
    }
}
