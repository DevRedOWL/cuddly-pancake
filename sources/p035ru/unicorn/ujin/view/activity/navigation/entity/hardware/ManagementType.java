package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4647xa8a2558f;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType */
public class ManagementType extends RealmObject implements Diffable<ManagementType>, C4647xa8a2558f {
    @SerializedName("rules")
    @Expose
    private String rules;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;

    public boolean areContentsTheSame(ManagementType managementType) {
        return false;
    }

    public boolean areItemsTheSame(ManagementType managementType) {
        return false;
    }

    public String realmGet$rules() {
        return this.rules;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$type() {
        return this.type;
    }

    public void realmSet$rules(String str) {
        this.rules = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    public ManagementType() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getType() {
        return realmGet$type();
    }

    public void setType(String str) {
        realmSet$type(str);
    }

    public String getRules() {
        return realmGet$rules();
    }

    public void setRules(String str) {
        realmSet$rules(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }
}
