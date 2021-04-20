package p035ru.unicorn.ujin.data.profile.repository;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.ListMyPassIn;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.api.request.RemoveNotificationsRequest;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.api.response.SplashscreenResponse;
import p035ru.unicorn.ujin.data.api.response.SubAccountsResponseData;
import p035ru.unicorn.ujin.data.api.response.SubAccountsStatusesResponseData;
import p035ru.unicorn.ujin.data.api.response.authorization.Register2coreResponseData;
import p035ru.unicorn.ujin.data.api.response.notification.NotificationListResponse;
import p035ru.unicorn.ujin.data.api.response.profile.GetBuildingResponse;
import p035ru.unicorn.ujin.data.api.response.profile.RentObjectListResponse;
import p035ru.unicorn.ujin.data.profile.event.LoginEvent;
import p035ru.unicorn.ujin.data.profile.event.RegisterEvent;
import p035ru.unicorn.ujin.data.profile.event.RentAuthorizeEvent;
import p035ru.unicorn.ujin.data.profile.event.RentConfirmCodeEvent;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.AuthProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.CitiesProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.RegisterProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.SendCodeProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.UpdateUserProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.ValidateSmsProviderEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.Single;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.Realm;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00101\u001a\u000202J\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020605042\u0006\u00107\u001a\u000208J\u0018\u00109\u001a\u0002022\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u000208J\u0012\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?050>J\u001a\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A05042\u0006\u0010B\u001a\u00020CJ\u001a\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E05042\u0006\u0010F\u001a\u00020CJ\u0006\u0010G\u001a\u000202J*\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A05042\u0006\u0010I\u001a\u0002082\u0006\u0010J\u001a\u0002082\u0006\u0010B\u001a\u00020CJ\u001a\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L05042\u0006\u0010<\u001a\u000208J\f\u0010M\u001a\b\u0012\u0004\u0012\u00020N04J\u001c\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;05042\b\u0010<\u001a\u0004\u0018\u000108J \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020805042\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002080RJ\u001e\u0010S\u001a\u0002022\u0006\u0010T\u001a\u0002082\u0006\u0010U\u001a\u0002082\u0006\u0010V\u001a\u000208J\u000e\u0010W\u001a\u0002022\u0006\u0010X\u001a\u000208J\u001e\u0010Y\u001a\u0002022\u0006\u0010Z\u001a\u0002082\u0006\u0010[\u001a\u0002082\u0006\u0010\\\u001a\u000208J\u0016\u0010]\u001a\u0002022\u0006\u0010^\u001a\u0002082\u0006\u0010U\u001a\u000208J\u0016\u0010_\u001a\u0002022\u0006\u0010X\u001a\u0002082\u0006\u0010`\u001a\u000208J \u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020805042\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002080RJ\u0016\u0010b\u001a\u0002022\u0006\u0010T\u001a\u0002082\u0006\u0010U\u001a\u000208J\u0016\u0010c\u001a\u0002022\u0006\u0010X\u001a\u0002082\u0006\u0010`\u001a\u000208J\u001e\u0010d\u001a\u0002022\u0006\u0010e\u001a\u0002082\u0006\u0010X\u001a\u0002082\u0006\u0010`\u001a\u000208J\u0016\u0010f\u001a\u0002022\u0006\u0010X\u001a\u0002082\u0006\u0010g\u001a\u000208J\u001e\u0010h\u001a\u0002022\u0006\u0010e\u001a\u0002082\u0006\u0010X\u001a\u0002082\u0006\u0010g\u001a\u000208J<\u0010i\u001a\b\u0012\u0004\u0012\u00020j042\u0006\u0010e\u001a\u0002082\u0006\u0010X\u001a\u0002082\u0006\u0010k\u001a\u0002082\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u0002080mj\b\u0012\u0004\u0012\u000208`nJ\u0016\u0010o\u001a\u0002022\u0006\u0010p\u001a\u0002082\u0006\u0010q\u001a\u000208J\u0014\u0010r\u001a\b\u0012\u0004\u0012\u00020j042\u0006\u0010X\u001a\u000208J\u0016\u0010s\u001a\u0002022\u0006\u0010T\u001a\u0002082\u0006\u0010U\u001a\u000208J\u001a\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020805042\u0006\u0010T\u001a\u000208J*\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020v05042\u0006\u0010e\u001a\u0002082\u0006\u0010X\u001a\u0002082\u0006\u0010`\u001a\u000208J \u0010w\u001a\u0002022\u0006\u0010T\u001a\u0002082\u0006\u0010x\u001a\u00020C2\b\u0010`\u001a\u0004\u0018\u000108J\u0012\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0504J\u0012\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0504J\u0014\u0010}\u001a\b\u0012\u0004\u0012\u00020j042\u0006\u0010~\u001a\u00020CJI\u0010\u001a\b\u0012\u0004\u0012\u00020j042\u0006\u0010Z\u001a\u0002082\u0006\u0010e\u001a\u0002082\u0007\u0010\u0001\u001a\u0002082\u0006\u0010X\u001a\u0002082\u0006\u0010^\u001a\u0002082\u0007\u0010\u0001\u001a\u0002082\t\u0010\u0001\u001a\u0004\u0018\u000108J\u0010\u0010\u0001\u001a\u0002022\u0007\u0010\u0001\u001a\u00020NJ\u0018\u0010\u0001\u001a\u0002022\u0006\u0010<\u001a\u0002082\u0007\u0010\u0001\u001a\u00020NR5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR5\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR5\u0010\u000f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR5\u0010\u0011\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR5\u0010\u0014\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R5\u0010\u001c\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001d0\u001d \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR5\u0010\u001f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010 0  \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010 0 \u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR5\u0010\"\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010#0# \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010#0#\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR5\u0010%\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010&0& \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010&0&\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\bR5\u0010(\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010)0) \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010)0)\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR5\u0010+\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010,0, \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010,0,\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\bR5\u0010.\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010/0/ \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010/0/\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\b¨\u0006\u0001"}, mo51343d2 = {"Lru/unicorn/ujin/data/profile/repository/ProfileRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "authProviderSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/viewModel/events/profile/AuthProviderEvent;", "kotlin.jvm.PlatformType", "getAuthProviderSubject", "()Lio/reactivex/subjects/PublishSubject;", "citiesProviderSubject", "Lru/unicorn/ujin/viewModel/events/profile/CitiesProviderEvent;", "getCitiesProviderSubject", "commerceLoginSubject", "Lru/unicorn/ujin/data/profile/event/LoginEvent;", "getCommerceLoginSubject", "loginSubject", "getLoginSubject", "passwordRestoreProviderSubject", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getPasswordRestoreProviderSubject", "passwordUpdateProviderSubject", "getPasswordUpdateProviderSubject", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "realm$delegate", "Lkotlin/Lazy;", "registerProviderSubject", "Lru/unicorn/ujin/viewModel/events/profile/RegisterProviderEvent;", "getRegisterProviderSubject", "rentAuthorizeSubject", "Lru/unicorn/ujin/data/profile/event/RentAuthorizeEvent;", "getRentAuthorizeSubject", "rentConfirmCodeSubject", "Lru/unicorn/ujin/data/profile/event/RentConfirmCodeEvent;", "getRentConfirmCodeSubject", "rentRegisterByPhoneSubject", "Lru/unicorn/ujin/data/profile/event/RegisterEvent;", "getRentRegisterByPhoneSubject", "sendCodeProviderSubject", "Lru/unicorn/ujin/viewModel/events/profile/SendCodeProviderEvent;", "getSendCodeProviderSubject", "updateUserProviderSubject", "Lru/unicorn/ujin/viewModel/events/profile/UpdateUserProviderEvent;", "getUpdateUserProviderSubject", "validateSmsProviderSubject", "Lru/unicorn/ujin/viewModel/events/profile/ValidateSmsProviderEvent;", "getValidateSmsProviderSubject", "appOpened", "", "getBuilding", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/profile/GetBuildingResponse;", "buildingId", "", "getCompanyListForProfile", "user", "Lru/unicorn/ujin/data/realm/profile/User;", "token", "getMyPass", "Lio/reactivex/Single;", "Lru/unicorn/ujin/data/ListMyPassIn;", "getMyRentObjectList", "Lru/unicorn/ujin/data/api/response/profile/RentObjectListResponse;", "page", "", "getNotificationList", "Lru/unicorn/ujin/data/api/response/notification/NotificationListResponse;", "onlyRead", "getProviderCityList", "getRentObjectList", "startDate", "endDate", "getSplashscreen", "Lru/unicorn/ujin/data/api/response/SplashscreenResponse;", "getUpdatePoints", "", "getUserFlowable", "markNotificationsAsRead", "notifications", "", "providerAuthorize", "login", "password", "regionId", "providerGetNewCode", "phone", "providerRegisterWithCode", "surname", "apartmentCode", "onetimeCode", "providerUpdateUserWithCode", "email", "providerValidateSms", "code", "removeNotifications", "rentAuthorizeCorona", "rentConfirmCode", "rentConfirmCodeCorona", "name", "rentRegisterByPhone", "utc", "rentRegisterByPhoneCorona", "requestAddSubAccount", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "rules", "statuses", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "requestChangePassword", "oldPass", "newPass", "requestDeleteSubAccount", "requestLogin", "requestRegister1core", "requestRegister2core", "Lru/unicorn/ujin/data/api/response/authorization/Register2coreResponseData;", "requestRestorePassword", "step", "requestSubAccountList", "Lru/unicorn/ujin/data/api/response/SubAccountsResponseData;", "requestSubAccountStatuses", "Lru/unicorn/ujin/data/api/response/SubAccountsStatusesResponseData;", "requestUpdatePrivacy", "hideMyAccount", "requestUpdateProfile", "patronymic", "base64", "birthday", "requestUser", "isCommerce", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository */
/* compiled from: ProfileRemoteRepository.kt */
public final class ProfileRemoteRepository extends BaseRemoteRepository {
    private final PublishSubject<AuthProviderEvent> authProviderSubject = PublishSubject.create();
    private final PublishSubject<CitiesProviderEvent> citiesProviderSubject = PublishSubject.create();
    private final PublishSubject<LoginEvent> commerceLoginSubject = PublishSubject.create();
    private final PublishSubject<LoginEvent> loginSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> passwordRestoreProviderSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> passwordUpdateProviderSubject = PublishSubject.create();
    private final Lazy realm$delegate = LazyKt.lazy(ProfileRemoteRepository$realm$2.INSTANCE);
    private final PublishSubject<RegisterProviderEvent> registerProviderSubject = PublishSubject.create();
    private final PublishSubject<RentAuthorizeEvent> rentAuthorizeSubject = PublishSubject.create();
    private final PublishSubject<RentConfirmCodeEvent> rentConfirmCodeSubject = PublishSubject.create();
    private final PublishSubject<RegisterEvent> rentRegisterByPhoneSubject = PublishSubject.create();
    private final PublishSubject<SendCodeProviderEvent> sendCodeProviderSubject = PublishSubject.create();
    private final PublishSubject<UpdateUserProviderEvent> updateUserProviderSubject = PublishSubject.create();
    private final PublishSubject<ValidateSmsProviderEvent> validateSmsProviderSubject = PublishSubject.create();

    /* access modifiers changed from: private */
    public final Realm getRealm() {
        return (Realm) this.realm$delegate.getValue();
    }

    public final PublishSubject<LoginEvent> getLoginSubject() {
        return this.loginSubject;
    }

    public final PublishSubject<AuthProviderEvent> getAuthProviderSubject() {
        return this.authProviderSubject;
    }

    public final PublishSubject<RegisterProviderEvent> getRegisterProviderSubject() {
        return this.registerProviderSubject;
    }

    public final PublishSubject<UpdateUserProviderEvent> getUpdateUserProviderSubject() {
        return this.updateUserProviderSubject;
    }

    public final PublishSubject<SendCodeProviderEvent> getSendCodeProviderSubject() {
        return this.sendCodeProviderSubject;
    }

    public final PublishSubject<ValidateSmsProviderEvent> getValidateSmsProviderSubject() {
        return this.validateSmsProviderSubject;
    }

    public final PublishSubject<CitiesProviderEvent> getCitiesProviderSubject() {
        return this.citiesProviderSubject;
    }

    public final PublishSubject<UpdateEvent> getPasswordUpdateProviderSubject() {
        return this.passwordUpdateProviderSubject;
    }

    public final PublishSubject<UpdateEvent> getPasswordRestoreProviderSubject() {
        return this.passwordRestoreProviderSubject;
    }

    public final PublishSubject<RegisterEvent> getRentRegisterByPhoneSubject() {
        return this.rentRegisterByPhoneSubject;
    }

    public final PublishSubject<RentConfirmCodeEvent> getRentConfirmCodeSubject() {
        return this.rentConfirmCodeSubject;
    }

    public final PublishSubject<RentAuthorizeEvent> getRentAuthorizeSubject() {
        return this.rentAuthorizeSubject;
    }

    public final PublishSubject<LoginEvent> getCommerceLoginSubject() {
        return this.commerceLoginSubject;
    }

    public final void requestLogin(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        Intrinsics.checkNotNullParameter(str2, "password");
        getApi().login(getAppName(), str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$requestLogin$1(this), new ProfileRemoteRepository$requestLogin$2(this));
    }

    public final void requestUser(boolean z) {
        requestUser(getToken(), z);
    }

    public final void requestUser(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api api = getApi();
        String appName = getAppName();
        if (str.length() == 0) {
            str = getToken();
        }
        api.getUser(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$requestUser$1(this, z), new ProfileRemoteRepository$requestUser$2(this));
    }

    public final void getCompanyListForProfile(User user, String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        getApi().getCompanyListForProfile(getToken(), 0).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$getCompanyListForProfile$1(this, user, str), new ProfileRemoteRepository$getCompanyListForProfile$2(this));
    }

    public final Flowable<Resource<String>> requestRegister1core(String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        Flowable<R> subscribeOn = getApi().register1core(getAppName(), str).map(ProfileRemoteRepository$requestRegister1core$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$requestRegister1core$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.register1core(appNam…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Register2coreResponseData>> requestRegister2core(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "code");
        Flowable<R> subscribeOn = getApi().register2core(getAppName(), str2, str, str3).map(ProfileRemoteRepository$requestRegister2core$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$requestRegister2core$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.register2core(appNam…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void providerAuthorize(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(str3, "regionId");
        getApi().providerAuthorize(getAppName(), str, str2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$providerAuthorize$1(this), new ProfileRemoteRepository$providerAuthorize$2(this));
    }

    public final void providerRegisterWithCode(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "surname");
        Intrinsics.checkNotNullParameter(str2, "apartmentCode");
        Intrinsics.checkNotNullParameter(str3, "onetimeCode");
        getApi().providerRegisterWithCode(getAppName(), str, str2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$providerRegisterWithCode$1(this), new ProfileRemoteRepository$providerRegisterWithCode$2(this));
    }

    public final void providerUpdateUserWithCode(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "password");
        getApi().providerUpdateUserWithCode(getAppName(), str, str2, getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$providerUpdateUserWithCode$1(this), new ProfileRemoteRepository$providerUpdateUserWithCode$2(this));
    }

    public final void providerGetNewCode(String str) {
        Intrinsics.checkNotNullParameter(str, "phone");
        getApi().providerGetNewCode(getAppName(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$providerGetNewCode$1(this), new ProfileRemoteRepository$providerGetNewCode$2(this));
    }

    public final void providerValidateSms(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "phone");
        Intrinsics.checkNotNullParameter(str2, "code");
        getApi().providerValidateSms(getAppName(), str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$providerValidateSms$1(this), new ProfileRemoteRepository$providerValidateSms$2(this));
    }

    public final void getProviderCityList() {
        getApi().getProviderCityList(getAppName()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$getProviderCityList$1(this), new ProfileRemoteRepository$getProviderCityList$2(this));
    }

    public final void requestChangePassword(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "oldPass");
        Intrinsics.checkNotNullParameter(str2, "newPass");
        getApi().updatePassword(getAppName(), getToken(), str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$requestChangePassword$1(this), new ProfileRemoteRepository$requestChangePassword$2(this));
    }

    public final void requestRestorePassword(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        getApi().restorePassword(getAppName(), str, i, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$requestRestorePassword$1(this), new ProfileRemoteRepository$requestRestorePassword$2(this));
    }

    public final Flowable<Boolean> getUpdatePoints() {
        Flowable<R> observeOn = getApi().getAlertPoints(getAppName(), getToken()).filter(ProfileRemoteRepository$getUpdatePoints$1.INSTANCE).map(ProfileRemoteRepository$getUpdatePoints$2.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observeOn, "api.getAlertPoints(appNa…dSchedulers.mainThread())");
        return observeOn;
    }

    public final Flowable<Resource<SubAccountsResponseData>> requestSubAccountList() {
        Flowable<R> subscribeOn = getApi().getSubAccounts(getAppName(), getToken()).map(ProfileRemoteRepository$requestSubAccountList$1.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getSubAccounts(appNa…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<SimpleResponse> requestDeleteSubAccount(String str) {
        Intrinsics.checkNotNullParameter(str, "phone");
        Flowable<SimpleResponse> subscribeOn = getApi().deleteSubAccount(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.deleteSubAccount(app…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<SimpleResponse> requestAddSubAccount(String str, String str2, String str3, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "rules");
        Intrinsics.checkNotNullParameter(arrayList, "statuses");
        Flowable<SimpleResponse> subscribeOn = getApi().addSubAccount(getAppName(), getToken(), str, str2, str3, arrayList).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.addSubAccount(appNam…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<SimpleResponse> requestUpdateProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "surname");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "patronymic");
        Intrinsics.checkNotNullParameter(str4, "phone");
        String str8 = str5;
        Intrinsics.checkNotNullParameter(str8, "email");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, "base64");
        Flowable<SimpleResponse> subscribeOn = getApi().updateProfile(getAppName(), getToken(), str, str2, str3, str4, str8, str9, str7).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.updateProfile(appNam…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<SimpleResponse> requestUpdatePrivacy(int i) {
        Flowable<SimpleResponse> subscribeOn = getApi().updatePrivacy(getAppName(), getToken(), i).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.updatePrivacy(appNam…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void rentRegisterByPhone(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "phone");
        Intrinsics.checkNotNullParameter(str2, "utc");
        getApi().rentRegisterByPhone(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$rentRegisterByPhone$1(this), new ProfileRemoteRepository$rentRegisterByPhone$2(this));
    }

    public final void rentConfirmCode(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "phone");
        Intrinsics.checkNotNullParameter(str2, "code");
        getApi().rentConfirmCode(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$rentConfirmCode$1(this), new ProfileRemoteRepository$rentConfirmCode$2(this));
    }

    public final void rentRegisterByPhoneCorona(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "utc");
        getApi().rentRegisterByPhoneCorona(str, str2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$rentRegisterByPhoneCorona$1(this), new ProfileRemoteRepository$rentRegisterByPhoneCorona$2(this));
    }

    public final void rentConfirmCodeCorona(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "code");
        getApi().rentConfirmCodeCorona(str, str2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$rentConfirmCodeCorona$1(this), new ProfileRemoteRepository$rentConfirmCodeCorona$2(this));
    }

    public final void rentAuthorizeCorona(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        Intrinsics.checkNotNullParameter(str2, "password");
        getApi().rentAuthorizeCorona(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileRemoteRepository$rentAuthorizeCorona$1(this), new ProfileRemoteRepository$rentAuthorizeCorona$2(this));
    }

    public final Flowable<Resource<RentObjectListResponse>> getRentObjectList(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        Flowable<R> subscribeOn = getApi().getRentObjectList(getToken(), str, str2, i).map(ProfileRemoteRepository$getRentObjectList$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$getRentObjectList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getRentObjectList(ge…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<RentObjectListResponse>> getMyRentObjectList(int i) {
        Flowable<R> subscribeOn = getApi().getMyRentObjectList(getToken(), i).map(ProfileRemoteRepository$getMyRentObjectList$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$getMyRentObjectList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getMyRentObjectList(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void appOpened() {
        getApi().appOpened(getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(ProfileRemoteRepository$appOpened$1.INSTANCE, ProfileRemoteRepository$appOpened$2.INSTANCE);
    }

    public final Flowable<Resource<SplashscreenResponse>> getSplashscreen(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Flowable<R> subscribeOn = getApi().getSplashscreen(str).map(new ProfileRemoteRepository$getSplashscreen$1(this)).onErrorReturn(ProfileRemoteRepository$getSplashscreen$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getSplashscreen(toke…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Single<Resource<ListMyPassIn>> getMyPass() {
        Single<Resource<ListMyPassIn>> subscribeOn = getApi().getMyPass(getToken()).doOnSuccess(ProfileRemoteRepository$getMyPass$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$getMyPass$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getMyPass(getToken()…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<User>> getUserFlowable(String str) {
        if (str == null) {
            str = getToken();
        }
        Flowable<R> subscribeOn = getApi().getUserFlowable(getAppName(), str).map(ProfileRemoteRepository$getUserFlowable$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$getUserFlowable$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getUserFlowable(appN…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<GetBuildingResponse>> getBuilding(String str) {
        Intrinsics.checkNotNullParameter(str, "buildingId");
        Flowable<R> subscribeOn = getApi().getBuilding(getToken(), str).map(ProfileRemoteRepository$getBuilding$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$getBuilding$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getBuilding(getToken…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<NotificationListResponse>> getNotificationList(int i) {
        Flowable<R> subscribeOn = getApi().getNotificationList(getToken(), i).map(ProfileRemoteRepository$getNotificationList$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$getNotificationList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getNotificationList(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<String>> markNotificationsAsRead(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "notifications");
        Flowable<R> subscribeOn = getApi().markNotificationsAsRead(getToken(), new RemoveNotificationsRequest(list)).map(ProfileRemoteRepository$markNotificationsAsRead$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$markNotificationsAsRead$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.markNotificationsAsR…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<String>> removeNotifications(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "notifications");
        Flowable<R> subscribeOn = getApi().removeNotifications(getToken(), new RemoveNotificationsRequest(list)).map(ProfileRemoteRepository$removeNotifications$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$removeNotifications$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.removeNotifications(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<SubAccountsStatusesResponseData>> requestSubAccountStatuses() {
        Flowable<R> subscribeOn = getApi().getSubAccountStatuses(getToken()).map(ProfileRemoteRepository$requestSubAccountStatuses$1.INSTANCE).onErrorReturn(ProfileRemoteRepository$requestSubAccountStatuses$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getSubAccountStatuse…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
