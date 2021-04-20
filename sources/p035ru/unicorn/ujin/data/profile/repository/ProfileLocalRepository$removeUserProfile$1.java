package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.realm.Realm;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$removeUserProfile$1 */
/* compiled from: ProfileLocalRepository.kt */
final class ProfileLocalRepository$removeUserProfile$1 implements Realm.Transaction {
    public static final ProfileLocalRepository$removeUserProfile$1 INSTANCE = new ProfileLocalRepository$removeUserProfile$1();

    ProfileLocalRepository$removeUserProfile$1() {
    }

    public final void execute(Realm realm) {
        Realm realm2 = realm;
        realm2.where(User.class).findAll().deleteAllFromRealm();
        realm2.insert((RealmModel) new User(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, 0, 0, (RealmList) null, (RealmList) null, (RealmList) null, (String) null, (String) null, false, false, (String) null, 134217727, (DefaultConstructorMarker) null));
    }
}
