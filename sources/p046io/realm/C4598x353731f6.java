package p046io.realm;

import p035ru.unicorn.ujin.data.realm.Chat;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxyInterface */
public interface C4598x353731f6 {
    RealmList<Chat> realmGet$chatList();

    int realmGet$notReadCount();

    String realmGet$userId();

    void realmSet$chatList(RealmList<Chat> realmList);

    void realmSet$notReadCount(int i);

    void realmSet$userId(String str);
}
