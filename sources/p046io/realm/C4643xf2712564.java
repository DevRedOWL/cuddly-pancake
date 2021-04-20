package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxyInterface */
public interface C4643xf2712564 {
    Integer realmGet$channelType();

    String realmGet$description();

    String realmGet$deviceClassId();

    String realmGet$deviceClassName();

    String realmGet$deviceClassTitle();

    String realmGet$deviceModelId();

    String realmGet$deviceModelName();

    String realmGet$deviceModelTitle();

    String realmGet$deviceTitle();

    String realmGet$getSettingsWindowUrl();

    Integer realmGet$groupSignal();

    String realmGet$guid();

    Integer realmGet$hardwareId();

    Integer realmGet$height();

    String realmGet$id();

    String realmGet$img();

    String realmGet$imgApp();

    Integer realmGet$istext();

    Integer realmGet$management();

    ManagementType realmGet$managementType();

    String realmGet$manual();

    String realmGet$name();

    Integer realmGet$online();

    RoomInfo realmGet$roomInfo();

    String realmGet$scenAvailable();

    RealmList<HardwareSignal> realmGet$signals();

    Integer realmGet$state();

    String realmGet$stateText();

    String realmGet$textsuffix();

    String realmGet$title();

    String realmGet$token();

    String realmGet$typeName();

    Integer realmGet$width();

    void realmSet$channelType(Integer num);

    void realmSet$description(String str);

    void realmSet$deviceClassId(String str);

    void realmSet$deviceClassName(String str);

    void realmSet$deviceClassTitle(String str);

    void realmSet$deviceModelId(String str);

    void realmSet$deviceModelName(String str);

    void realmSet$deviceModelTitle(String str);

    void realmSet$deviceTitle(String str);

    void realmSet$getSettingsWindowUrl(String str);

    void realmSet$groupSignal(Integer num);

    void realmSet$guid(String str);

    void realmSet$hardwareId(Integer num);

    void realmSet$height(Integer num);

    void realmSet$id(String str);

    void realmSet$img(String str);

    void realmSet$imgApp(String str);

    void realmSet$istext(Integer num);

    void realmSet$management(Integer num);

    void realmSet$managementType(ManagementType managementType);

    void realmSet$manual(String str);

    void realmSet$name(String str);

    void realmSet$online(Integer num);

    void realmSet$roomInfo(RoomInfo roomInfo);

    void realmSet$scenAvailable(String str);

    void realmSet$signals(RealmList<HardwareSignal> realmList);

    void realmSet$state(Integer num);

    void realmSet$stateText(String str);

    void realmSet$textsuffix(String str);

    void realmSet$title(String str);

    void realmSet$token(String str);

    void realmSet$typeName(String str);

    void realmSet$width(Integer num);
}
