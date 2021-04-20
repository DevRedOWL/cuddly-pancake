package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4683x72c120dc;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress */
/* compiled from: ProfileAdress.kt */
public class ProfileAdress extends RealmObject implements Diffable<ProfileAdress>, C4683x72c120dc {
    private String address;
    @PrimaryKey

    /* renamed from: id */
    private int f6757id;

    public String realmGet$address() {
        return this.address;
    }

    public int realmGet$id() {
        return this.f6757id;
    }

    public void realmSet$address(String str) {
        this.address = str;
    }

    public void realmSet$id(int i) {
        this.f6757id = i;
    }

    public ProfileAdress() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$address("dasdasd");
    }

    public final int getId() {
        return realmGet$id();
    }

    public final void setId(int i) {
        realmSet$id(i);
    }

    public final String getAddress() {
        return realmGet$address();
    }

    public final void setAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$address(str);
    }

    public boolean areItemsTheSame(ProfileAdress profileAdress) {
        int realmGet$id = realmGet$id();
        Integer valueOf = profileAdress != null ? Integer.valueOf(profileAdress.realmGet$id()) : null;
        Intrinsics.checkNotNull(valueOf);
        return realmGet$id == valueOf.intValue();
    }

    public boolean areContentsTheSame(ProfileAdress profileAdress) {
        return realmGet$address().equals(profileAdress != null ? profileAdress.realmGet$address() : null);
    }
}
