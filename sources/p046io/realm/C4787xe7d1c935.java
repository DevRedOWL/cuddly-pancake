package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserProfileRealmProxyInterface */
public interface C4787xe7d1c935 {
    Boolean realmGet$isVerified();

    Boolean realmGet$me();

    RealmList<RentPermissions> realmGet$permissions();

    UserCompany realmGet$position();

    Integer realmGet$propertyId();

    UserData realmGet$userdata();

    RealmList<UserVehicle> realmGet$vehicles();

    void realmSet$isVerified(Boolean bool);

    void realmSet$me(Boolean bool);

    void realmSet$permissions(RealmList<RentPermissions> realmList);

    void realmSet$position(UserCompany userCompany);

    void realmSet$propertyId(Integer num);

    void realmSet$userdata(UserData userData);

    void realmSet$vehicles(RealmList<UserVehicle> realmList);
}
