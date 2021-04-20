package p046io.realm;

import p035ru.unicorn.ujin.data.realm.Bank;
import p035ru.unicorn.ujin.data.realm.Feature;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface {
    String realmGet$background();

    Bank realmGet$bank();

    RealmList<Feature> realmGet$features();

    String realmGet$phone();

    String realmGet$title();

    void realmSet$background(String str);

    void realmSet$bank(Bank bank);

    void realmSet$features(RealmList<Feature> realmList);

    void realmSet$phone(String str);

    void realmSet$title(String str);
}
