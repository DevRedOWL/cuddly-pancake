package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHuman;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxyInterface */
public interface C4749xc305b318 {
    Long realmGet$finishDate();

    String realmGet$finishDateHuman();

    Integer realmGet$id();

    PropertyRenta realmGet$propRenta();

    ManagePermissions realmGet$rentPermissions();

    Integer realmGet$rentersCount();

    Long realmGet$startDate();

    String realmGet$startDateHuman();

    String realmGet$stateDisplayName();

    String realmGet$stateName();

    StateRenta realmGet$stateRenta();

    TimeSlotHuman realmGet$timeSlotHuman();

    void realmSet$finishDate(Long l);

    void realmSet$finishDateHuman(String str);

    void realmSet$id(Integer num);

    void realmSet$propRenta(PropertyRenta propertyRenta);

    void realmSet$rentPermissions(ManagePermissions managePermissions);

    void realmSet$rentersCount(Integer num);

    void realmSet$startDate(Long l);

    void realmSet$startDateHuman(String str);

    void realmSet$stateDisplayName(String str);

    void realmSet$stateName(String str);

    void realmSet$stateRenta(StateRenta stateRenta);

    void realmSet$timeSlotHuman(TimeSlotHuman timeSlotHuman);
}
