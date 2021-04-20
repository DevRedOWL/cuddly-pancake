package p046io.realm;

import p035ru.unicorn.ujin.data.realm.CardAdress;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface {
    CardAdress realmGet$address();

    String realmGet$brand();

    String realmGet$comment();

    long realmGet$dateEnd();

    long realmGet$dateStart();

    String realmGet$guestFullname();

    String realmGet$guestPhone();

    String realmGet$id();

    String realmGet$idNumber();

    String realmGet$type();

    void realmSet$address(CardAdress cardAdress);

    void realmSet$brand(String str);

    void realmSet$comment(String str);

    void realmSet$dateEnd(long j);

    void realmSet$dateStart(long j);

    void realmSet$guestFullname(String str);

    void realmSet$guestPhone(String str);

    void realmSet$id(String str);

    void realmSet$idNumber(String str);

    void realmSet$type(String str);
}
