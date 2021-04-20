package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData;
import p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse;
import p035ru.unicorn.ujin.data.profile.event.RentConfirmCodeEvent;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/authorization/RentConfirmCodeResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$rentConfirmCodeCorona$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$rentConfirmCodeCorona$1<T> implements Consumer<RentConfirmCodeResponse> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$rentConfirmCodeCorona$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final void accept(RentConfirmCodeResponse rentConfirmCodeResponse) {
        User user;
        this.this$0.getRealm().executeTransaction(C57411.INSTANCE);
        RentConfirmCodeData data = rentConfirmCodeResponse.getData();
        boolean z = true;
        if (!(data == null || (user = data.getUser()) == null)) {
            user.setStage(3);
            user.setUserLoggenIn(true);
            this.this$0.getRealm().executeTransaction(new ProfileRemoteRepository$rentConfirmCodeCorona$1$2$1(user));
        }
        PublishSubject<RentConfirmCodeEvent> rentConfirmCodeSubject = this.this$0.getRentConfirmCodeSubject();
        Integer error = rentConfirmCodeResponse.getError();
        boolean z2 = false;
        if (error == null || error.intValue() != 0) {
            z = false;
        }
        String message = rentConfirmCodeResponse.getMessage();
        RentConfirmCodeData data2 = rentConfirmCodeResponse.getData();
        if (data2 != null) {
            z2 = data2.getCodeConfirmed();
        }
        rentConfirmCodeSubject.onNext(new RentConfirmCodeEvent(z, message, z2));
    }
}
