package p046io.realm;

import p035ru.unicorn.ujin.data.realm.marketplace.CouponImage;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface {
    String realmGet$buttonTitle();

    String realmGet$description();

    String realmGet$group();

    Integer realmGet$id();

    CouponImage realmGet$image();

    String realmGet$longDescription();

    RedeemedCode realmGet$redeemedCode();

    String realmGet$termsOfObtaining();

    String realmGet$title();

    void realmSet$buttonTitle(String str);

    void realmSet$description(String str);

    void realmSet$group(String str);

    void realmSet$id(Integer num);

    void realmSet$image(CouponImage couponImage);

    void realmSet$longDescription(String str);

    void realmSet$redeemedCode(RedeemedCode redeemedCode);

    void realmSet$termsOfObtaining(String str);

    void realmSet$title(String str);
}
