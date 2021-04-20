package p035ru.unicorn.ujin.data.api.response.authorization;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.realm.C4592x64a679c8;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/authorization/RentConfirmCodeData;", "Lio/realm/RealmObject;", "codeConfirmed", "", "token", "", "user", "Lru/unicorn/ujin/data/realm/profile/User;", "(ZLjava/lang/String;Lru/unicorn/ujin/data/realm/profile/User;)V", "getCodeConfirmed", "()Z", "setCodeConfirmed", "(Z)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "getUser", "()Lru/unicorn/ujin/data/realm/profile/User;", "setUser", "(Lru/unicorn/ujin/data/realm/profile/User;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData */
/* compiled from: RentConfirmCodeResponse.kt */
public class RentConfirmCodeData extends RealmObject implements C4592x64a679c8 {
    @SerializedName("code_confirmed")
    private boolean codeConfirmed;
    private String token;
    private User user;

    public RentConfirmCodeData() {
        this(false, (String) null, (User) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean realmGet$codeConfirmed() {
        return this.codeConfirmed;
    }

    public String realmGet$token() {
        return this.token;
    }

    public User realmGet$user() {
        return this.user;
    }

    public void realmSet$codeConfirmed(boolean z) {
        this.codeConfirmed = z;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public void realmSet$user(User user2) {
        this.user = user2;
    }

    public final boolean getCodeConfirmed() {
        return realmGet$codeConfirmed();
    }

    public final void setCodeConfirmed(boolean z) {
        realmSet$codeConfirmed(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RentConfirmCodeData(boolean z, String str, User user2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : user2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getToken() {
        return realmGet$token();
    }

    public final void setToken(String str) {
        realmSet$token(str);
    }

    public final User getUser() {
        return realmGet$user();
    }

    public final void setUser(User user2) {
        realmSet$user(user2);
    }

    public RentConfirmCodeData(boolean z, String str, User user2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$codeConfirmed(z);
        realmSet$token(str);
        realmSet$user(user2);
    }
}
