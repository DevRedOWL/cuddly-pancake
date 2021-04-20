package p046io.realm;

import p035ru.unicorn.ujin.data.realm.marketplace.CartCompany;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.CartTotal;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxyInterface */
public interface C4604x82066130 {
    CartCompany realmGet$company();

    RealmList<CartOffer> realmGet$offers();

    CartTotal realmGet$total();

    void realmSet$company(CartCompany cartCompany);

    void realmSet$offers(RealmList<CartOffer> realmList);

    void realmSet$total(CartTotal cartTotal);
}
