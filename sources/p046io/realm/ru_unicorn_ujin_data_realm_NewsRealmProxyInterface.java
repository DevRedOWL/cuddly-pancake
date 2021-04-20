package p046io.realm;

import p035ru.unicorn.ujin.data.realm.ImageData;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_NewsRealmProxyInterface {
    String realmGet$dateText();

    String realmGet$id();

    ImageData realmGet$imageData();

    RealmList<ImageData> realmGet$imageList();

    String realmGet$text();

    String realmGet$title();

    void realmSet$dateText(String str);

    void realmSet$id(String str);

    void realmSet$imageData(ImageData imageData);

    void realmSet$imageList(RealmList<ImageData> realmList);

    void realmSet$text(String str);

    void realmSet$title(String str);
}
