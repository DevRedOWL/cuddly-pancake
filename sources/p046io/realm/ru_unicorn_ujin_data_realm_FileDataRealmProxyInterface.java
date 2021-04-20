package p046io.realm;

import p035ru.unicorn.ujin.data.realm.FileMeta;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface {
    String realmGet$bytes();

    String realmGet$id();

    FileMeta realmGet$meta();

    String realmGet$mimeType();

    String realmGet$name();

    String realmGet$url();

    void realmSet$bytes(String str);

    void realmSet$id(String str);

    void realmSet$meta(FileMeta fileMeta);

    void realmSet$mimeType(String str);

    void realmSet$name(String str);

    void realmSet$url(String str);
}
