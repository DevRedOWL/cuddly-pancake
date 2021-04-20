package p046io.realm;

import p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface {
    Integer realmGet$acceptingEnabled();

    ApartmentRequest realmGet$apartmentRequest();

    String realmGet$buildingId();

    String realmGet$complexId();

    Integer realmGet$id();

    Boolean realmGet$isCommerceThingsAvailable();

    Boolean realmGet$rentAvailable();

    Boolean realmGet$showBottomNavigation();

    Integer realmGet$stage();

    String realmGet$title();

    String realmGet$uid();

    String realmGet$userToken();

    void realmSet$acceptingEnabled(Integer num);

    void realmSet$apartmentRequest(ApartmentRequest apartmentRequest);

    void realmSet$buildingId(String str);

    void realmSet$complexId(String str);

    void realmSet$id(Integer num);

    void realmSet$isCommerceThingsAvailable(Boolean bool);

    void realmSet$rentAvailable(Boolean bool);

    void realmSet$showBottomNavigation(Boolean bool);

    void realmSet$stage(Integer num);

    void realmSet$title(String str);

    void realmSet$uid(String str);

    void realmSet$userToken(String str);
}
