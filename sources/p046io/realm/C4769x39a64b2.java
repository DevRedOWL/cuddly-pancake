package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxyInterface */
public interface C4769x39a64b2 {
    ManagePermissions realmGet$canManage();

    long realmGet$finishDate();

    String realmGet$finishDateHuman();

    String realmGet$id();

    Integer realmGet$ownerContractorId();

    Integer realmGet$propertyId();

    RealmList<Renters> realmGet$renters();

    long realmGet$startDate();

    String realmGet$startDateHuman();

    RentState realmGet$state();

    TalkingInfo realmGet$talkingInfo();

    String realmGet$timezone();

    void realmSet$canManage(ManagePermissions managePermissions);

    void realmSet$finishDate(long j);

    void realmSet$finishDateHuman(String str);

    void realmSet$id(String str);

    void realmSet$ownerContractorId(Integer num);

    void realmSet$propertyId(Integer num);

    void realmSet$renters(RealmList<Renters> realmList);

    void realmSet$startDate(long j);

    void realmSet$startDateHuman(String str);

    void realmSet$state(RentState rentState);

    void realmSet$talkingInfo(TalkingInfo talkingInfo);

    void realmSet$timezone(String str);
}
