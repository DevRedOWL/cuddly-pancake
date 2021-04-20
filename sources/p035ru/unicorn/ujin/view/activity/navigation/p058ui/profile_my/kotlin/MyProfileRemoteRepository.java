package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u0004J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004J\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0010JD\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010J$\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0005\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/MyProfileRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "destroyContact", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactData;", "id", "", "getContact", "getContactList", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactDataList;", "getProfile", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileData;", "inviteContact", "phone", "", "tel", "pos", "companyId", "name", "surname", "patronymic", "removeUser", "Lru/unicorn/ujin/view/activity/navigation/entity/KolyaSuccesModel;", "userId", "updateProfile", "profile", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileRemoteRepository */
/* compiled from: MyProfileRemoteRepository.kt */
public final class MyProfileRemoteRepository extends BaseRemoteRepository {
    public final Flowable<Resource<ContactData>> inviteContact(String str) {
        Intrinsics.checkNotNullParameter(str, "phone");
        Flowable<R> subscribeOn = getApi().inviteContact(getToken(), str).map(MyProfileRemoteRepository$inviteContact$1.INSTANCE).onErrorReturn(MyProfileRemoteRepository$inviteContact$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.inviteContact(getTok…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<ContactData>> destroyContact(int i) {
        Flowable<R> subscribeOn = getApi().destroyContact(getToken(), i).map(MyProfileRemoteRepository$destroyContact$1.INSTANCE).onErrorReturn(MyProfileRemoteRepository$destroyContact$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.destroyContact(getTo…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<ContactData>> getContact(int i) {
        Flowable<R> subscribeOn = getApi().getContact(getToken(), i).map(MyProfileRemoteRepository$getContact$1.INSTANCE).onErrorReturn(MyProfileRemoteRepository$getContact$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getContact(getToken(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<ContactDataList>> getContactList() {
        Flowable<R> subscribeOn = getApi().getContactList(getToken()).map(MyProfileRemoteRepository$getContactList$1.INSTANCE).onErrorReturn(MyProfileRemoteRepository$getContactList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getContactList(getTo…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<ProfileData>> getProfile() {
        Flowable<R> subscribeOn = getApi().getProfile(getToken()).map(MyProfileRemoteRepository$getProfile$1.INSTANCE).onErrorReturn(MyProfileRemoteRepository$getProfile$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getProfile(getToken(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<ProfileData>> updateProfile(UserProfile userProfile) {
        Flowable<R> subscribeOn = getApi().updateProfile(getToken(), userProfile).map(MyProfileRemoteRepository$updateProfile$1.INSTANCE).onErrorReturn(MyProfileRemoteRepository$updateProfile$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.updateProfile(getTok…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<ContactData>> inviteContact(String str, String str2, int i, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "tel");
        Intrinsics.checkNotNullParameter(str2, "pos");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "surname");
        Intrinsics.checkNotNullParameter(str5, "patronymic");
        return getApi().inviteEmployers(getToken(), str, str2, String.valueOf(i), str3, str4, str5).map(MyProfileRemoteRepository$inviteContact$3.INSTANCE).onErrorReturn(MyProfileRemoteRepository$inviteContact$4.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public final Flowable<Resource<KolyaSuccesModel>> removeUser(int i, int i2) {
        return getApi().removeEmployers(getToken(), String.valueOf(i2), String.valueOf(i)).map(MyProfileRemoteRepository$removeUser$1.INSTANCE).onErrorReturn(MyProfileRemoteRepository$removeUser$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }
}
