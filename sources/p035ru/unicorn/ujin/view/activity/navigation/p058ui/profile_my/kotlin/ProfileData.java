package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4781x6803e980;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileData;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "profile", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "(Ljava/lang/Integer;Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfile", "()Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "setProfile", "(Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;)V", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData */
/* compiled from: ProfileData.kt */
public class ProfileData extends RealmObject implements Diffable<ProfileData>, C4781x6803e980 {
    @PrimaryKey

    /* renamed from: id */
    private Integer f6847id;
    private UserProfile profile;

    public ProfileData() {
        this((Integer) null, (UserProfile) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Integer realmGet$id() {
        return this.f6847id;
    }

    public UserProfile realmGet$profile() {
        return this.profile;
    }

    public void realmSet$id(Integer num) {
        this.f6847id = num;
    }

    public void realmSet$profile(UserProfile userProfile) {
        this.profile = userProfile;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileData(Integer num, UserProfile userProfile, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userProfile);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final Integer getId() {
        return realmGet$id();
    }

    public final void setId(Integer num) {
        realmSet$id(num);
    }

    public final UserProfile getProfile() {
        return realmGet$profile();
    }

    public final void setProfile(UserProfile userProfile) {
        realmSet$profile(userProfile);
    }

    public ProfileData(Integer num, UserProfile userProfile) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(num);
        realmSet$profile(userProfile);
    }

    public boolean areItemsTheSame(ProfileData profileData) {
        Integer realmGet$id = realmGet$id();
        Intrinsics.checkNotNull(realmGet$id);
        Intrinsics.checkNotNull(profileData);
        return realmGet$id.equals(profileData.realmGet$id());
    }

    public boolean areContentsTheSame(ProfileData profileData) {
        throw new NotImplementedError("An operation is not implemented: " + "not implemented");
    }
}
