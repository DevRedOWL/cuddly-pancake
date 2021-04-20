package p035ru.unicorn.ujin.data.profile.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.login.LoginResponse;
import p035ru.unicorn.ujin.data.login.LoginResponseData;
import p035ru.unicorn.ujin.data.profile.event.LoginEvent;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/login/LoginResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$requestUser$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$requestUser$1<T> implements Consumer<LoginResponse> {
    final /* synthetic */ boolean $isCommerce;
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$requestUser$1(ProfileRemoteRepository profileRemoteRepository, boolean z) {
        this.this$0 = profileRemoteRepository;
        this.$isCommerce = z;
    }

    public final void accept(LoginResponse loginResponse) {
        User user;
        ProfileRemoteRepository profileRemoteRepository = this.this$0;
        Intrinsics.checkNotNullExpressionValue(loginResponse, "response");
        LoginResponseData data = loginResponse.getData();
        boolean z = true;
        if (data == null || (user = data.getUser()) == null) {
            user = null;
        } else {
            RealmList<Apartment> commerceList = user.getCommerceList();
            if (commerceList != null) {
                Iterable<Apartment> iterable = commerceList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (Apartment showBottomNavigation : iterable) {
                    showBottomNavigation.setShowBottomNavigation(true);
                    arrayList.add(Unit.INSTANCE);
                }
                List list = (List) arrayList;
            }
            user.setUserLoggenIn(true);
        }
        if (!this.$isCommerce || loginResponse.getError() != 0) {
            PublishSubject<LoginEvent> loginSubject = profileRemoteRepository.getLoginSubject();
            if (loginResponse.getError() != 0) {
                z = false;
            }
            String message = loginResponse.getMessage();
            Intrinsics.checkNotNullExpressionValue(message, "response.message");
            loginSubject.onNext(new LoginEvent(z, message, user));
            return;
        }
        PublishSubject<LoginEvent> commerceLoginSubject = profileRemoteRepository.getCommerceLoginSubject();
        if (loginResponse.getError() != 0) {
            z = false;
        }
        String message2 = loginResponse.getMessage();
        Intrinsics.checkNotNullExpressionValue(message2, "response.message");
        commerceLoginSubject.onNext(new LoginEvent(z, message2, user));
    }
}
