package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4679xe6b35b9a;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassDevice */
public class ClassDevice extends RealmObject implements Diffable<ClassDevice>, C4679xe6b35b9a {
    @SerializedName("enabled")
    @Expose
    private String enabled;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("title")
    @Expose
    private String title;

    public String realmGet$enabled() {
        return this.enabled;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$enabled(String str) {
        this.enabled = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public ClassDevice() {
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

    public String getEnabled() {
        return realmGet$enabled();
    }

    public void setEnabled(String str) {
        realmSet$enabled(str);
    }

    public boolean areItemsTheSame(ClassDevice classDevice) {
        return realmGet$name().equals(classDevice.getName());
    }

    public boolean areContentsTheSame(ClassDevice classDevice) {
        return realmGet$name().equals(classDevice.getName());
    }
}
