package p046io.realm;

import p035ru.unicorn.ujin.data.realm.FlatButtons;
import p035ru.unicorn.ujin.data.realm.FlatInfo;
import p035ru.unicorn.ujin.data.realm.ImageSize;
import p035ru.unicorn.ujin.data.realm.Pamyatka;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_FlatRealmProxyInterface {
    String realmGet$address();

    FlatButtons realmGet$buttonTexts();

    String realmGet$complexId();

    String realmGet$complexTitle();

    String realmGet$dateEnd();

    String realmGet$descriptionSmall();

    Integer realmGet$favorites();

    String realmGet$flatId();

    RealmList<FlatInfo> realmGet$flatInfoList();

    Integer realmGet$floor();

    String realmGet$floorTotal();

    String realmGet$id();

    ImageSize realmGet$imageSize();

    String realmGet$imgBig();

    byte[] realmGet$imgBigBytes();

    String realmGet$imgSmall();

    byte[] realmGet$imgSmallBytes();

    Boolean realmGet$isAction();

    Pamyatka realmGet$pamyatka();

    String realmGet$phoneNumber();

    String realmGet$price();

    String realmGet$priceOld();

    Boolean realmGet$rentEnabled();

    String realmGet$rooms();

    Boolean realmGet$sellEnabled();

    Double realmGet$square();

    String realmGet$url();

    void realmSet$address(String str);

    void realmSet$buttonTexts(FlatButtons flatButtons);

    void realmSet$complexId(String str);

    void realmSet$complexTitle(String str);

    void realmSet$dateEnd(String str);

    void realmSet$descriptionSmall(String str);

    void realmSet$favorites(Integer num);

    void realmSet$flatId(String str);

    void realmSet$flatInfoList(RealmList<FlatInfo> realmList);

    void realmSet$floor(Integer num);

    void realmSet$floorTotal(String str);

    void realmSet$id(String str);

    void realmSet$imageSize(ImageSize imageSize);

    void realmSet$imgBig(String str);

    void realmSet$imgBigBytes(byte[] bArr);

    void realmSet$imgSmall(String str);

    void realmSet$imgSmallBytes(byte[] bArr);

    void realmSet$isAction(Boolean bool);

    void realmSet$pamyatka(Pamyatka pamyatka);

    void realmSet$phoneNumber(String str);

    void realmSet$price(String str);

    void realmSet$priceOld(String str);

    void realmSet$rentEnabled(Boolean bool);

    void realmSet$rooms(String str);

    void realmSet$sellEnabled(Boolean bool);

    void realmSet$square(Double d);

    void realmSet$url(String str);
}
