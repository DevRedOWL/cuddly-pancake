package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4783x2ecd5de1;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserCompany;", "Lio/realm/RealmObject;", "title", "", "isDirector", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setDirector", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany */
/* compiled from: UserProfile.kt */
public class UserCompany extends RealmObject implements C4783x2ecd5de1 {
    @SerializedName("is_director")
    private Boolean isDirector;
    private String title;

    public UserCompany() {
        this((String) null, (Boolean) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Boolean realmGet$isDirector() {
        return this.isDirector;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$isDirector(Boolean bool) {
        this.isDirector = bool;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserCompany(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : bool);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final Boolean isDirector() {
        return realmGet$isDirector();
    }

    public final void setDirector(Boolean bool) {
        realmSet$isDirector(bool);
    }

    public UserCompany(String str, Boolean bool) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$title(str);
        realmSet$isDirector(bool);
    }
}
