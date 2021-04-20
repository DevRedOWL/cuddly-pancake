package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4763x6ae73d8c;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent */
public class TypeRent extends RealmObject implements C4763x6ae73d8c {
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("name")
    @Expose
    private String name;

    public String realmGet$displayName() {
        return this.displayName;
    }

    public String realmGet$name() {
        return this.name;
    }

    public void realmSet$displayName(String str) {
        this.displayName = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public TypeRent() {
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

    public String getDisplayName() {
        return realmGet$displayName();
    }

    public void setDisplayName(String str) {
        realmSet$displayName(str);
    }
}
