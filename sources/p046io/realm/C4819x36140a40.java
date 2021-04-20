package p046io.realm;

import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Status;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxyInterface */
public interface C4819x36140a40 {
    RealmList<FileData> realmGet$attachments();

    String realmGet$date();

    String realmGet$description();

    Integer realmGet$id();

    String realmGet$registeredName();

    Status realmGet$status();

    String realmGet$timeEnd();

    String realmGet$timeStart();

    String realmGet$title();

    ToUser realmGet$toUser();

    Integer realmGet$toUserId();

    FromUser realmGet$user();

    void realmSet$attachments(RealmList<FileData> realmList);

    void realmSet$date(String str);

    void realmSet$description(String str);

    void realmSet$id(Integer num);

    void realmSet$registeredName(String str);

    void realmSet$status(Status status);

    void realmSet$timeEnd(String str);

    void realmSet$timeStart(String str);

    void realmSet$title(String str);

    void realmSet$toUser(ToUser toUser);

    void realmSet$toUserId(Integer num);

    void realmSet$user(FromUser fromUser);
}
