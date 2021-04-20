package p046io.realm;

import p035ru.unicorn.ujin.data.realm.IntercomVal;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface {
    Boolean realmGet$enabled();

    Integer realmGet$gotophone();

    RealmList<IntercomVal> realmGet$intercom();

    Integer realmGet$onlyout();

    void realmSet$enabled(Boolean bool);

    void realmSet$gotophone(Integer num);

    void realmSet$intercom(RealmList<IntercomVal> realmList);

    void realmSet$onlyout(Integer num);
}
