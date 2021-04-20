package p046io.realm;

import p035ru.unicorn.ujin.data.entities.chats.Author;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_ChatRealmProxyInterface {
    String realmGet$count();

    String realmGet$id();

    String realmGet$lastAuthor();

    String realmGet$lastAuthorImg();

    String realmGet$lastDate();

    String realmGet$lastMessage();

    Integer realmGet$notRead();

    String realmGet$ownerId();

    int realmGet$participantsCount();

    int realmGet$readOnly();

    String realmGet$removeCaption();

    String realmGet$serviceType();

    Boolean realmGet$sound();

    String realmGet$title();

    RealmList<Author> realmGet$userList();

    void realmSet$count(String str);

    void realmSet$id(String str);

    void realmSet$lastAuthor(String str);

    void realmSet$lastAuthorImg(String str);

    void realmSet$lastDate(String str);

    void realmSet$lastMessage(String str);

    void realmSet$notRead(Integer num);

    void realmSet$ownerId(String str);

    void realmSet$participantsCount(int i);

    void realmSet$readOnly(int i);

    void realmSet$removeCaption(String str);

    void realmSet$serviceType(String str);

    void realmSet$sound(Boolean bool);

    void realmSet$title(String str);

    void realmSet$userList(RealmList<Author> realmList);
}
