package p046io.realm;

import p035ru.unicorn.ujin.data.realm.Action;
import p035ru.unicorn.ujin.data.realm.Mortrage;
import p035ru.unicorn.ujin.data.realm.Price;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface {
    Action realmGet$action();

    Double realmGet$buildProgress();

    String realmGet$dateEnd();

    String realmGet$deliveryDate();

    String realmGet$demoFlatUid();

    String realmGet$description();

    String realmGet$descriptionMore();

    String realmGet$id();

    RealmList<String> realmGet$imageList();

    RealmList<byte[]> realmGet$imageListBytes();

    RealmList<Mortrage> realmGet$mortrageList();

    String realmGet$presentationLink();

    RealmList<Price> realmGet$priceList();

    String realmGet$schemaLink();

    Boolean realmGet$showDemo();

    String realmGet$site();

    String realmGet$title();

    String realmGet$uid();

    void realmSet$action(Action action);

    void realmSet$buildProgress(Double d);

    void realmSet$dateEnd(String str);

    void realmSet$deliveryDate(String str);

    void realmSet$demoFlatUid(String str);

    void realmSet$description(String str);

    void realmSet$descriptionMore(String str);

    void realmSet$id(String str);

    void realmSet$imageList(RealmList<String> realmList);

    void realmSet$imageListBytes(RealmList<byte[]> realmList);

    void realmSet$mortrageList(RealmList<Mortrage> realmList);

    void realmSet$presentationLink(String str);

    void realmSet$priceList(RealmList<Price> realmList);

    void realmSet$schemaLink(String str);

    void realmSet$showDemo(Boolean bool);

    void realmSet$site(String str);

    void realmSet$title(String str);

    void realmSet$uid(String str);
}
