package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "realm", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileLocalRepository$updateUserData$1 */
/* compiled from: MyProfileLocalRepository.kt */
final class MyProfileLocalRepository$updateUserData$1 implements Realm.Transaction {
    public static final MyProfileLocalRepository$updateUserData$1 INSTANCE = new MyProfileLocalRepository$updateUserData$1();

    MyProfileLocalRepository$updateUserData$1() {
    }

    public final void execute(Realm realm) {
        UserProfile profile;
        String str;
        String str2;
        String str3;
        String str4;
        ProfileData profileData = (ProfileData) realm.where(ProfileData.class).findFirst();
        if (profileData != null && (profile = profileData.getProfile()) != null) {
            UserProfile userProfile = (UserProfile) realm.copyFromRealm(profile);
            User user = (User) realm.where(User.class).findFirst();
            if (user != null) {
                UserData userdata = userProfile.getUserdata();
                if (userdata == null || (str = userdata.getName()) == null) {
                    str = "";
                }
                user.setName(str);
                UserData userdata2 = userProfile.getUserdata();
                if (userdata2 == null || (str2 = userdata2.getSurname()) == null) {
                    str2 = "";
                }
                user.setSurname(str2);
                UserData userdata3 = userProfile.getUserdata();
                if (userdata3 == null || (str3 = userdata3.getPatronymic()) == null) {
                    str3 = "";
                }
                user.setPatronymic(str3);
                UserData userdata4 = userProfile.getUserdata();
                if (userdata4 == null || (str4 = userdata4.getFullname()) == null) {
                    str4 = "";
                }
                user.setFullName(str4);
                realm.insertOrUpdate((RealmModel) user);
            }
        }
    }
}
