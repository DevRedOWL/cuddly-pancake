package p046io.realm;

import p035ru.unicorn.ujin.data.realm.Coordinates;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_CityRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_CityRealmProxyInterface {
    Coordinates realmGet$center();

    String realmGet$id();

    String realmGet$title();

    Integer realmGet$zoom();

    void realmSet$center(Coordinates coordinates);

    void realmSet$id(String str);

    void realmSet$title(String str);

    void realmSet$zoom(Integer num);
}
