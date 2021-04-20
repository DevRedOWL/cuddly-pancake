package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceIndicator;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceTariffRealmProxyInterface */
public interface C4699x47c0640f {
    Integer realmGet$connectedDt();

    String realmGet$description1();

    String realmGet$description2();

    String realmGet$image();

    RealmList<DomServiceIndicator> realmGet$indicators();

    Boolean realmGet$isAvailable();

    Boolean realmGet$isCurrent();

    Integer realmGet$price();

    String realmGet$tariffId();

    String realmGet$title();

    String realmGet$unit();

    String realmGet$url();

    String realmGet$urlFrame();

    void realmSet$connectedDt(Integer num);

    void realmSet$description1(String str);

    void realmSet$description2(String str);

    void realmSet$image(String str);

    void realmSet$indicators(RealmList<DomServiceIndicator> realmList);

    void realmSet$isAvailable(Boolean bool);

    void realmSet$isCurrent(Boolean bool);

    void realmSet$price(Integer num);

    void realmSet$tariffId(String str);

    void realmSet$title(String str);

    void realmSet$unit(String str);

    void realmSet$url(String str);

    void realmSet$urlFrame(String str);
}
