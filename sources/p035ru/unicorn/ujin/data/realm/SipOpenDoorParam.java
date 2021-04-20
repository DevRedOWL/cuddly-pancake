package p035ru.unicorn.ujin.data.realm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.SipOpenDoorParam */
public class SipOpenDoorParam extends RealmObject implements Parcelable, ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface {
    @SerializedName("dtmf")
    @Expose
    private String dtmf;
    @SerializedName("url")
    @Expose
    private String openDoorUrl;

    public int describeContents() {
        return 0;
    }

    public String realmGet$dtmf() {
        return this.dtmf;
    }

    public String realmGet$openDoorUrl() {
        return this.openDoorUrl;
    }

    public void realmSet$dtmf(String str) {
        this.dtmf = str;
    }

    public void realmSet$openDoorUrl(String str) {
        this.openDoorUrl = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public SipOpenDoorParam() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getDtmf() {
        return realmGet$dtmf();
    }

    public void setDtmf(String str) {
        realmSet$dtmf(str);
    }

    public String getOpenDoorUrl() {
        return realmGet$openDoorUrl();
    }

    public void setOpenDoorUrl(String str) {
        realmSet$openDoorUrl(str);
    }

    public String toString() {
        return "SipOpenDoorParam{dtmf='" + realmGet$dtmf() + '\'' + ", openDoorUrl='" + realmGet$openDoorUrl() + '\'' + '}';
    }
}
