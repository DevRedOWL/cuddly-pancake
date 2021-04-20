package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.BeaconAction */
public class BeaconAction extends RealmObject implements ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface {
    @SerializedName("in")
    private BeaconActionDescription beaconActionDescriptionIn;
    @SerializedName("out")
    private BeaconActionDescription beaconActionDescriptionOut;

    public BeaconActionDescription realmGet$beaconActionDescriptionIn() {
        return this.beaconActionDescriptionIn;
    }

    public BeaconActionDescription realmGet$beaconActionDescriptionOut() {
        return this.beaconActionDescriptionOut;
    }

    public void realmSet$beaconActionDescriptionIn(BeaconActionDescription beaconActionDescription) {
        this.beaconActionDescriptionIn = beaconActionDescription;
    }

    public void realmSet$beaconActionDescriptionOut(BeaconActionDescription beaconActionDescription) {
        this.beaconActionDescriptionOut = beaconActionDescription;
    }

    public BeaconAction() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public BeaconActionDescription getBeaconActionDescriptionIn() {
        return realmGet$beaconActionDescriptionIn();
    }

    public void setBeaconActionDescriptionIn(BeaconActionDescription beaconActionDescription) {
        realmSet$beaconActionDescriptionIn(beaconActionDescription);
    }

    public BeaconActionDescription getBeaconActionDescriptionOut() {
        return realmGet$beaconActionDescriptionOut();
    }

    public void setBeaconActionDescriptionOut(BeaconActionDescription beaconActionDescription) {
        realmSet$beaconActionDescriptionOut(beaconActionDescription);
    }
}
