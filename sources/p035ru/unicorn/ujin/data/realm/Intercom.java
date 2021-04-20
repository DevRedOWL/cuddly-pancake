package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Intercom */
public class Intercom extends RealmObject implements ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface {
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("gotophone")
    @Expose
    private Integer gotophone;
    @SerializedName("intercom")
    @Expose
    private RealmList<IntercomVal> intercom;
    @SerializedName("onlyout")
    @Expose
    private Integer onlyout;

    public Boolean realmGet$enabled() {
        return this.enabled;
    }

    public Integer realmGet$gotophone() {
        return this.gotophone;
    }

    public RealmList realmGet$intercom() {
        return this.intercom;
    }

    public Integer realmGet$onlyout() {
        return this.onlyout;
    }

    public void realmSet$enabled(Boolean bool) {
        this.enabled = bool;
    }

    public void realmSet$gotophone(Integer num) {
        this.gotophone = num;
    }

    public void realmSet$intercom(RealmList realmList) {
        this.intercom = realmList;
    }

    public void realmSet$onlyout(Integer num) {
        this.onlyout = num;
    }

    public Intercom() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$intercom((RealmList) null);
    }

    public List<IntercomVal> getIntercom() {
        return realmGet$intercom();
    }

    public void setIntercom(RealmList<IntercomVal> realmList) {
        realmSet$intercom(realmList);
    }

    public Integer getGotophone() {
        return realmGet$gotophone();
    }

    public void setGotophone(Integer num) {
        realmSet$gotophone(num);
    }

    public Integer getOnlyout() {
        return realmGet$onlyout();
    }

    public void setOnlyout(Integer num) {
        realmSet$onlyout(num);
    }

    public Boolean getEnabled() {
        return realmGet$enabled();
    }

    public void setEnabled(Boolean bool) {
        realmSet$enabled(bool);
    }
}
