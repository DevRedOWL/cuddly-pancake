package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Services;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxyInterface */
public interface C4669x6b662644 {
    String realmGet$action();

    String realmGet$actionValue();

    String realmGet$alertMessage();

    String realmGet$description();

    RealmList<DialogButtons> realmGet$dialogButtons();

    String realmGet$domRuId();

    Guard realmGet$guard();

    String realmGet$iconUrl();

    Integer realmGet$id();

    Boolean realmGet$isActive();

    MinVersion realmGet$minVersion();

    String realmGet$productState();

    String realmGet$provider();

    String realmGet$providerIconUrl();

    SchemaCallback realmGet$schemaCallback();

    String realmGet$sectionId();

    String realmGet$sectionSlug();

    String realmGet$sectionTitle();

    Integer realmGet$serviceId();

    Services realmGet$services();

    String realmGet$title();

    String realmGet$url();

    void realmSet$action(String str);

    void realmSet$actionValue(String str);

    void realmSet$alertMessage(String str);

    void realmSet$description(String str);

    void realmSet$dialogButtons(RealmList<DialogButtons> realmList);

    void realmSet$domRuId(String str);

    void realmSet$guard(Guard guard);

    void realmSet$iconUrl(String str);

    void realmSet$id(Integer num);

    void realmSet$isActive(Boolean bool);

    void realmSet$minVersion(MinVersion minVersion);

    void realmSet$productState(String str);

    void realmSet$provider(String str);

    void realmSet$providerIconUrl(String str);

    void realmSet$schemaCallback(SchemaCallback schemaCallback);

    void realmSet$sectionId(String str);

    void realmSet$sectionSlug(String str);

    void realmSet$sectionTitle(String str);

    void realmSet$serviceId(Integer num);

    void realmSet$services(Services services);

    void realmSet$title(String str);

    void realmSet$url(String str);
}
