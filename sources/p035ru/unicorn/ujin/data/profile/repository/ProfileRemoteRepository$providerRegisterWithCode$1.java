package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.authorization.RegisterWithCodeDataResponse;
import p035ru.unicorn.ujin.data.api.response.authorization.RegisterWithCodeResponse;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.viewModel.events.profile.RegisterProviderEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/authorization/RegisterWithCodeResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$providerRegisterWithCode$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$providerRegisterWithCode$1<T> implements Consumer<RegisterWithCodeResponse> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$providerRegisterWithCode$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final void accept(final RegisterWithCodeResponse registerWithCodeResponse) {
        this.this$0.getRealm().executeTransaction(new Realm.Transaction(this) {
            final /* synthetic */ ProfileRemoteRepository$providerRegisterWithCode$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void execute(Realm realm) {
                realm.where(User.class).findAll().deleteAllFromRealm();
                Realm access$getRealm$p = this.this$0.this$0.getRealm();
                Class<User> cls = User.class;
                RegisterWithCodeDataResponse data = registerWithCodeResponse.getData();
                User user = (User) access$getRealm$p.createObject(cls, data != null ? data.getToken() : null);
                user.setUserLoggenIn(true);
                user.setStage(3);
                realm.insertOrUpdate((RealmModel) user);
            }
        });
        PublishSubject<RegisterProviderEvent> registerProviderSubject = this.this$0.getRegisterProviderSubject();
        boolean z = registerWithCodeResponse.getError() == 0;
        String message = registerWithCodeResponse.getMessage();
        RegisterWithCodeDataResponse data = registerWithCodeResponse.getData();
        registerProviderSubject.onNext(new RegisterProviderEvent(z, message, data != null ? data.getToken() : null));
    }
}
