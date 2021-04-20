package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4693xe5fb01ba;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceStatus */
public class ServiceStatus extends RealmObject implements C4693xe5fb01ba {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("value")
    @Expose
    private String value;

    public String realmGet$message() {
        return this.message;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$message(String str) {
        this.message = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    public ServiceStatus() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getValue() {
        return realmGet$value();
    }

    public void setValue(String str) {
        realmSet$value(str);
    }

    public String getMessage() {
        return realmGet$message();
    }

    public void setMessage(String str) {
        realmSet$message(str);
    }
}
