package p046io.realm;

import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface {
    String realmGet$aid();

    RealmList<Apartment> realmGet$apartmentList();

    String realmGet$avatar();

    int realmGet$balance();

    String realmGet$birthday();

    RealmList<Apartment> realmGet$commerceList();

    int realmGet$demo();

    String realmGet$demoToken();

    String realmGet$email();

    String realmGet$fcmToken();

    boolean realmGet$firstTimeSinceLogin();

    String realmGet$fullName();

    int realmGet$gender();

    int realmGet$hideAccount();

    String realmGet$hideAccountFullText();

    String realmGet$hideAccountText();

    long realmGet$id();

    String realmGet$name();

    String realmGet$patronymic();

    String realmGet$phone();

    int realmGet$roleId();

    int realmGet$stage();

    int realmGet$status();

    RealmList<SubAccount> realmGet$subAccountList();

    String realmGet$surname();

    String realmGet$token();

    boolean realmGet$userLoggenIn();

    void realmSet$aid(String str);

    void realmSet$apartmentList(RealmList<Apartment> realmList);

    void realmSet$avatar(String str);

    void realmSet$balance(int i);

    void realmSet$birthday(String str);

    void realmSet$commerceList(RealmList<Apartment> realmList);

    void realmSet$demo(int i);

    void realmSet$demoToken(String str);

    void realmSet$email(String str);

    void realmSet$fcmToken(String str);

    void realmSet$firstTimeSinceLogin(boolean z);

    void realmSet$fullName(String str);

    void realmSet$gender(int i);

    void realmSet$hideAccount(int i);

    void realmSet$hideAccountFullText(String str);

    void realmSet$hideAccountText(String str);

    void realmSet$id(long j);

    void realmSet$name(String str);

    void realmSet$patronymic(String str);

    void realmSet$phone(String str);

    void realmSet$roleId(int i);

    void realmSet$stage(int i);

    void realmSet$status(int i);

    void realmSet$subAccountList(RealmList<SubAccount> realmList);

    void realmSet$surname(String str);

    void realmSet$token(String str);

    void realmSet$userLoggenIn(boolean z);
}
