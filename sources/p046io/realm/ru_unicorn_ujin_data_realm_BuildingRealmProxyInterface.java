package p046io.realm;

import p035ru.unicorn.ujin.data.realm.Address;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface {
    Address realmGet$address();

    Integer realmGet$apartmentCount();

    String realmGet$endWorkTime();

    Integer realmGet$entranceCount();

    String realmGet$fias();

    String realmGet$floor();

    String realmGet$id();

    Boolean realmGet$rentAvailable();

    String realmGet$securityNumber();

    RealmList<String> realmGet$sellEmails();

    Boolean realmGet$sellEnabled();

    String realmGet$startWorkTime();

    String realmGet$title();

    void realmSet$address(Address address);

    void realmSet$apartmentCount(Integer num);

    void realmSet$endWorkTime(String str);

    void realmSet$entranceCount(Integer num);

    void realmSet$fias(String str);

    void realmSet$floor(String str);

    void realmSet$id(String str);

    void realmSet$rentAvailable(Boolean bool);

    void realmSet$securityNumber(String str);

    void realmSet$sellEmails(RealmList<String> realmList);

    void realmSet$sellEnabled(Boolean bool);

    void realmSet$startWorkTime(String str);

    void realmSet$title(String str);
}
