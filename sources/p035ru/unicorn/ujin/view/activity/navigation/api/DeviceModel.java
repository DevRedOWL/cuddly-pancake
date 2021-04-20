package p035ru.unicorn.ujin.view.activity.navigation.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4638x2c6434ff;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.api.DeviceModel */
public class DeviceModel extends RealmObject implements Diffable<DeviceModel>, C4638x2c6434ff {
    @SerializedName("class-name")
    @Expose
    private String className;
    @SerializedName("class-title")
    @Expose
    private String classTitle;
    @SerializedName("enabled")
    @Expose
    private String enabled;
    @SerializedName("fwalfa")
    @Expose
    private String fwalfa;
    @SerializedName("fwbeta")
    @Expose
    private String fwbeta;
    @SerializedName("fwstable")
    @Expose
    private String fwstable;
    public boolean isCheck;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("title")
    @Expose
    private String title;

    public boolean areContentsTheSame(DeviceModel deviceModel) {
        return false;
    }

    public boolean areItemsTheSame(DeviceModel deviceModel) {
        return false;
    }

    public boolean isCheck() {
        return true;
    }

    public String realmGet$className() {
        return this.className;
    }

    public String realmGet$classTitle() {
        return this.classTitle;
    }

    public String realmGet$enabled() {
        return this.enabled;
    }

    public String realmGet$fwalfa() {
        return this.fwalfa;
    }

    public String realmGet$fwbeta() {
        return this.fwbeta;
    }

    public String realmGet$fwstable() {
        return this.fwstable;
    }

    public boolean realmGet$isCheck() {
        return this.isCheck;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$className(String str) {
        this.className = str;
    }

    public void realmSet$classTitle(String str) {
        this.classTitle = str;
    }

    public void realmSet$enabled(String str) {
        this.enabled = str;
    }

    public void realmSet$fwalfa(String str) {
        this.fwalfa = str;
    }

    public void realmSet$fwbeta(String str) {
        this.fwbeta = str;
    }

    public void realmSet$fwstable(String str) {
        this.fwstable = str;
    }

    public void realmSet$isCheck(boolean z) {
        this.isCheck = z;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public DeviceModel() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getClassName() {
        return realmGet$className();
    }

    public void setClassName(String str) {
        realmSet$className(str);
    }

    public String getClassTitle() {
        return realmGet$classTitle();
    }

    public void setClassTitle(String str) {
        realmSet$classTitle(str);
    }

    public String getEnabled() {
        return realmGet$enabled();
    }

    public void setEnabled(String str) {
        realmSet$enabled(str);
    }

    public String getFwstable() {
        return realmGet$fwstable();
    }

    public void setFwstable(String str) {
        realmSet$fwstable(str);
    }

    public String getFwalfa() {
        return realmGet$fwalfa();
    }

    public void setFwalfa(String str) {
        realmSet$fwalfa(str);
    }

    public String getFwbeta() {
        return realmGet$fwbeta();
    }

    public void setFwbeta(String str) {
        realmSet$fwbeta(str);
    }

    public void setCheck(boolean z) {
        realmSet$isCheck(z);
    }
}
