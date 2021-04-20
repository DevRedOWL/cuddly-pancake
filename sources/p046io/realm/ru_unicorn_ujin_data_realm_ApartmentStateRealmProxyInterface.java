package p046io.realm;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface {
    String realmGet$acceptanceDate();

    String realmGet$acceptanceInfo();

    String realmGet$contactPersonName();

    String realmGet$contactPersonPhone();

    String realmGet$state();

    String realmGet$stateTitle();

    String realmGet$windowId();

    RealmList<String> realmGet$windowList();

    void realmSet$acceptanceDate(String str);

    void realmSet$acceptanceInfo(String str);

    void realmSet$contactPersonName(String str);

    void realmSet$contactPersonPhone(String str);

    void realmSet$state(String str);

    void realmSet$stateTitle(String str);

    void realmSet$windowId(String str);

    void realmSet$windowList(RealmList<String> realmList);
}
