package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4695xc94f73b5;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceCategory */
public class DomServiceCategory extends RealmObject implements C4695xc94f73b5 {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("title")
    @Expose
    private String title;

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public DomServiceCategory() {
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
}
