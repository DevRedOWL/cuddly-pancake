package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4659x7b226fd6;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons */
public class DialogButtons extends RealmObject implements C4659x7b226fd6 {
    @SerializedName("action")
    private String action;
    @SerializedName("action_value")
    private String actionValue;
    @SerializedName("name")
    String name;

    public String realmGet$action() {
        return this.action;
    }

    public String realmGet$actionValue() {
        return this.actionValue;
    }

    public String realmGet$name() {
        return this.name;
    }

    public void realmSet$action(String str) {
        this.action = str;
    }

    public void realmSet$actionValue(String str) {
        this.actionValue = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public DialogButtons() {
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

    public String getAction() {
        return realmGet$action();
    }

    public void setAction(String str) {
        realmSet$action(str);
    }

    public String getActionValue() {
        return realmGet$actionValue();
    }

    public void setActionValue(String str) {
        realmSet$actionValue(str);
    }
}
