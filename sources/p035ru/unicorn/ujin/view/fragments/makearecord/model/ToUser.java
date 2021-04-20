package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import kotlin.Metadata;
import p046io.realm.C4827x8d46ef6f;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/ToUser;", "Lio/realm/RealmObject;", "fullname", "", "(Ljava/lang/String;)V", "getFullname", "()Ljava/lang/String;", "setFullname", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.ToUser */
/* compiled from: Appointments.kt */
public class ToUser extends RealmObject implements C4827x8d46ef6f {
    private String fullname;

    public ToUser() {
        this((String) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$fullname() {
        return this.fullname;
    }

    public void realmSet$fullname(String str) {
        this.fullname = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToUser(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getFullname() {
        return realmGet$fullname();
    }

    public final void setFullname(String str) {
        realmSet$fullname(str);
    }

    public ToUser(String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$fullname(str);
    }
}
