package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p046io.realm.Realm;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$applyFlat$1 */
/* compiled from: ProfileLocalRepository.kt */
final class ProfileLocalRepository$applyFlat$1 implements Realm.Transaction {
    final /* synthetic */ String $flatUserToken;
    final /* synthetic */ int $stage;

    ProfileLocalRepository$applyFlat$1(String str, int i) {
        this.$flatUserToken = str;
        this.$stage = i;
    }

    public final void execute(Realm realm) {
        Realm realm2 = realm;
        User user = (User) realm2.where(User.class).findFirst();
        if (user == null) {
            user = new User(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, 0, 0, (RealmList) null, (RealmList) null, (RealmList) null, (String) null, (String) null, false, false, (String) null, 134217727, (DefaultConstructorMarker) null);
        }
        Intrinsics.checkNotNullExpressionValue(user, "it.where(User::class.java).findFirst() ?: User()");
        user.setToken(this.$flatUserToken);
        user.setStage(this.$stage);
        realm2.insertOrUpdate((RealmModel) user);
        realm2.delete(Schema.class);
    }
}
