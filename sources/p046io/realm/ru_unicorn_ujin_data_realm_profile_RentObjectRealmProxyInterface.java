package p046io.realm;

import p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface {
    String realmGet$area();

    RentObjectBuilding realmGet$building();

    String realmGet$floor();

    long realmGet$id();

    String realmGet$lastDateRent();

    String realmGet$rentAvailable();

    String realmGet$rentCost();

    String realmGet$title();

    void realmSet$area(String str);

    void realmSet$building(RentObjectBuilding rentObjectBuilding);

    void realmSet$floor(String str);

    void realmSet$id(long j);

    void realmSet$lastDateRent(String str);

    void realmSet$rentAvailable(String str);

    void realmSet$rentCost(String str);

    void realmSet$title(String str);
}
