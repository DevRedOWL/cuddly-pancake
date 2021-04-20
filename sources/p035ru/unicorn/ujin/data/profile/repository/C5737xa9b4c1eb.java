package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.authorization.ValidateCodeDataResponse;
import p035ru.unicorn.ujin.data.api.response.authorization.ValidateCodeResponse;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/ujin/data/profile/repository/ProfileRemoteRepository$providerValidateSms$1$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$providerValidateSms$1$$special$$inlined$run$lambda$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class C5737xa9b4c1eb implements Realm.Transaction {
    final /* synthetic */ ValidateCodeResponse $response$inlined;
    final /* synthetic */ ProfileRemoteRepository $this_run;

    C5737xa9b4c1eb(ProfileRemoteRepository profileRemoteRepository, ValidateCodeResponse validateCodeResponse) {
        this.$this_run = profileRemoteRepository;
        this.$response$inlined = validateCodeResponse;
    }

    public final void execute(Realm realm) {
        realm.where(User.class).findAll().deleteAllFromRealm();
        Realm access$getRealm$p = this.$this_run.getRealm();
        Class<User> cls = User.class;
        ValidateCodeDataResponse data = this.$response$inlined.getData();
        User user = (User) access$getRealm$p.createObject(cls, data != null ? data.getToken() : null);
        user.setUserLoggenIn(true);
        user.setStage(3);
        realm.insertOrUpdate((RealmModel) user);
    }
}
