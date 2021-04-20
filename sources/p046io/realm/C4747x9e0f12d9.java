package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoObjectRealmProxyInterface */
public interface C4747x9e0f12d9 {
    RealmList<Integer> realmGet$childrens();

    RealmList<RentAttributes> realmGet$desiredAttributes();

    Integer realmGet$enterpriseId();

    String realmGet$finishDate();

    String realmGet$startDate();

    void realmSet$childrens(RealmList<Integer> realmList);

    void realmSet$desiredAttributes(RealmList<RentAttributes> realmList);

    void realmSet$enterpriseId(Integer num);

    void realmSet$finishDate(String str);

    void realmSet$startDate(String str);
}
