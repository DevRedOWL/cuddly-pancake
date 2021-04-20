package p046io.realm;

import p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData;

/* renamed from: io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeResponseRealmProxyInterface */
public interface C4594xeaad0bd1 {
    String realmGet$command();

    RentConfirmCodeData realmGet$data();

    Integer realmGet$error();

    String realmGet$fromdomain();

    String realmGet$message();

    String realmGet$token();

    String realmGet$worktime();

    void realmSet$command(String str);

    void realmSet$data(RentConfirmCodeData rentConfirmCodeData);

    void realmSet$error(Integer num);

    void realmSet$fromdomain(String str);

    void realmSet$message(String str);

    void realmSet$token(String str);

    void realmSet$worktime(String str);
}
