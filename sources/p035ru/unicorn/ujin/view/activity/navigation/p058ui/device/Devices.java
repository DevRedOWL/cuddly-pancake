package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4685x713f1f6e;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.Devices */
public class Devices extends RealmObject implements C4685x713f1f6e {
    @SerializedName("device_token")
    @Expose
    private String deviceToken;
    @SerializedName("serialnumber")
    @PrimaryKey
    @Expose
    private String serialNumber;

    public String realmGet$deviceToken() {
        return this.deviceToken;
    }

    public String realmGet$serialNumber() {
        return this.serialNumber;
    }

    public void realmSet$deviceToken(String str) {
        this.deviceToken = str;
    }

    public void realmSet$serialNumber(String str) {
        this.serialNumber = str;
    }

    public Devices() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getSerialNumber() {
        return realmGet$serialNumber();
    }

    public void setSerialNumber(String str) {
        realmSet$serialNumber(str);
    }

    public String getDeviceToken() {
        return realmGet$deviceToken();
    }

    public void setDeviceToken(String str) {
        realmSet$deviceToken(str);
    }
}
