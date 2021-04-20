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
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$requestLogin$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$requestLogin$1<T> implements Consumer<LoginResponse> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$requestLogin$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final void accept(LoginResponse loginResponse) {
        User user;
        PublishSubject<LoginEvent> loginSubject = this.this$0.getLoginSubject();
        Intrinsics.checkNotNullExpressionValue(loginResponse, "response");
        boolean z = loginResponse.getError() == 0;
        String message = loginResponse.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "response.message");
        LoginResponseData data = loginResponse.getData();
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
            Unit unit = Unit.INSTANCE;
        }
        loginSubject.onNext(new LoginEvent(z, message, user));
    }
}
