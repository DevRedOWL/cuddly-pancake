package p046io.realm;

import p035ru.unicorn.ujin.data.realm.FileData;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface {
    String realmGet$accentColor();

    String realmGet$companyId();

    String realmGet$description();

    String realmGet$id();

    FileData realmGet$image();

    RealmList<FileData> realmGet$images();

    String realmGet$importOfferLink();

    Boolean realmGet$isPaymentEnabled();

    Boolean realmGet$isPriceRange();

    String realmGet$oldPrice();

    String realmGet$price();

    String realmGet$summary();

    RealmList<Integer> realmGet$tags();

    String realmGet$title();

    String realmGet$type();

    String realmGet$units();

    void realmSet$accentColor(String str);

    void realmSet$companyId(String str);

    void realmSet$description(String str);

    void realmSet$id(String str);

    void realmSet$image(FileData fileData);

    void realmSet$images(RealmList<FileData> realmList);

    void realmSet$importOfferLink(String str);

    void realmSet$isPaymentEnabled(Boolean bool);

    void realmSet$isPriceRange(Boolean bool);

    void realmSet$oldPrice(String str);

    void realmSet$price(String str);

    void realmSet$summary(String str);

    void realmSet$tags(RealmList<Integer> realmList);

    void realmSet$title(String str);

    void realmSet$type(String str);

    void realmSet$units(String str);
}
