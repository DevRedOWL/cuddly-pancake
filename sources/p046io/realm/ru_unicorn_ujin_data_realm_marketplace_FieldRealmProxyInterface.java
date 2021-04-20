package p046io.realm;

import p035ru.unicorn.ujin.data.realm.marketplace.SelectValue;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface {
    RealmList<SelectValue> realmGet$content();

    String realmGet$inputType();

    String realmGet$label();

    String realmGet$name();

    String realmGet$order();

    String realmGet$placeholder();

    Boolean realmGet$required();

    String realmGet$type();

    void realmSet$content(RealmList<SelectValue> realmList);

    void realmSet$inputType(String str);

    void realmSet$label(String str);

    void realmSet$name(String str);

    void realmSet$order(String str);

    void realmSet$placeholder(String str);

    void realmSet$required(Boolean bool);

    void realmSet$type(String str);
}
