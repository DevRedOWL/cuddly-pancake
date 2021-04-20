package p046io.realm;

import p035ru.unicorn.ujin.data.realm.Coordinates;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface {
    String realmGet$address();

    String realmGet$buildingId();

    Coordinates realmGet$center();

    String realmGet$cityId();

    String realmGet$dateEnd();

    String realmGet$description();

    String realmGet$id();

    RealmList<String> realmGet$imageList();

    RealmList<byte[]> realmGet$imges_bitmap();

    Boolean realmGet$isFinished();

    String realmGet$title();

    String realmGet$uid();

    void realmSet$address(String str);

    void realmSet$buildingId(String str);

    void realmSet$center(Coordinates coordinates);

    void realmSet$cityId(String str);

    void realmSet$dateEnd(String str);

    void realmSet$description(String str);

    void realmSet$id(String str);

    void realmSet$imageList(RealmList<String> realmList);

    void realmSet$imges_bitmap(RealmList<byte[]> realmList);

    void realmSet$isFinished(Boolean bool);

    void realmSet$title(String str);

    void realmSet$uid(String str);
}
