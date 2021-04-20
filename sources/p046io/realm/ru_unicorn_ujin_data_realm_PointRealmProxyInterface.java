package p046io.realm;

import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.MyBeacon;
import p035ru.unicorn.ujin.data.realm.Wifi;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_PointRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_PointRealmProxyInterface {
    BeaconAction realmGet$beaconAction();

    RealmList<MyBeacon> realmGet$beacons();

    Camera realmGet$camera();

    int realmGet$hide();

    String realmGet$id();

    Integer realmGet$isBeaconEnable();

    Boolean realmGet$isGPSEnable();

    Boolean realmGet$isWIFIEnable();

    Double realmGet$latitude();

    Double realmGet$longitude();

    String realmGet$name();

    String realmGet$radius();

    Boolean realmGet$remove();

    RealmList<Wifi> realmGet$wifi();

    void realmSet$beaconAction(BeaconAction beaconAction);

    void realmSet$beacons(RealmList<MyBeacon> realmList);

    void realmSet$camera(Camera camera);

    void realmSet$hide(int i);

    void realmSet$id(String str);

    void realmSet$isBeaconEnable(Integer num);

    void realmSet$isGPSEnable(Boolean bool);

    void realmSet$isWIFIEnable(Boolean bool);

    void realmSet$latitude(Double d);

    void realmSet$longitude(Double d);

    void realmSet$name(String str);

    void realmSet$radius(String str);

    void realmSet$remove(Boolean bool);

    void realmSet$wifi(RealmList<Wifi> realmList);
}
