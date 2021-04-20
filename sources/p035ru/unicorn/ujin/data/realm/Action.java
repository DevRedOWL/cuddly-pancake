package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.StringUtils;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Action */
public class Action extends RealmObject implements ru_unicorn_ujin_data_realm_ActionRealmProxyInterface {
    @SerializedName("number")
    private String actionNumber;
    @SerializedName("title")
    private String actionTitle;
    @SerializedName("type")
    private String actionType;

    public String realmGet$actionNumber() {
        return this.actionNumber;
    }

    public String realmGet$actionTitle() {
        return this.actionTitle;
    }

    public String realmGet$actionType() {
        return this.actionType;
    }

    public void realmSet$actionNumber(String str) {
        this.actionNumber = str;
    }

    public void realmSet$actionTitle(String str) {
        this.actionTitle = str;
    }

    public void realmSet$actionType(String str) {
        this.actionType = str;
    }

    public Action() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$actionNumber("");
        realmSet$actionType("");
        realmSet$actionTitle("");
    }

    public String getActionType() {
        return (String) StringUtils.defaultIfEmpty(realmGet$actionType(), "");
    }

    public void setActionType(String str) {
        realmSet$actionType(str);
    }

    public String getActionTitle() {
        return (String) StringUtils.defaultIfEmpty(realmGet$actionTitle(), "");
    }

    public void setActionTitle(String str) {
        realmSet$actionTitle(str);
    }

    public String getActionNumber() {
        return (String) StringUtils.defaultIfEmpty(realmGet$actionNumber(), "");
    }

    public void setActionNumber(String str) {
        realmSet$actionNumber(str);
    }
}
