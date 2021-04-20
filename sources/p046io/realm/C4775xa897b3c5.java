package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxyInterface */
public interface C4775xa897b3c5 {
    String realmGet$adress();

    int realmGet$id();

    RealmList<TalkingPhotos> realmGet$image();

    boolean realmGet$parentIsBusy();

    RealmList<RentAttributes> realmGet$rentAttributes();

    RealmList<RentChildren> realmGet$rentChildre();

    RealmList<Renters> realmGet$renters();

    TalkingPhotosFile realmGet$schemaPhoto();

    StateRenta realmGet$stateRenta();

    String realmGet$title();

    void realmSet$adress(String str);

    void realmSet$id(int i);

    void realmSet$image(RealmList<TalkingPhotos> realmList);

    void realmSet$parentIsBusy(boolean z);

    void realmSet$rentAttributes(RealmList<RentAttributes> realmList);

    void realmSet$rentChildre(RealmList<RentChildren> realmList);

    void realmSet$renters(RealmList<Renters> realmList);

    void realmSet$schemaPhoto(TalkingPhotosFile talkingPhotosFile);

    void realmSet$stateRenta(StateRenta stateRenta);

    void realmSet$title(String str);
}
