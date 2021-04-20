package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4751xf0b2626a;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentPermissions */
public class RentPermissions extends RealmObject implements Diffable<RentPermissions>, C4751xf0b2626a {
    public static final String MANAGE_EMPLOYEES = "manage-employees";
    @SerializedName("key")
    private String permissionKey;
    @SerializedName("title")
    private String permissionTitle;
    @SerializedName("value")
    private boolean value;

    public String realmGet$permissionKey() {
        return this.permissionKey;
    }

    public String realmGet$permissionTitle() {
        return this.permissionTitle;
    }

    public boolean realmGet$value() {
        return this.value;
    }

    public void realmSet$permissionKey(String str) {
        this.permissionKey = str;
    }

    public void realmSet$permissionTitle(String str) {
        this.permissionTitle = str;
    }

    public void realmSet$value(boolean z) {
        this.value = z;
    }

    public RentPermissions() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getPermissionKey() {
        return realmGet$permissionKey();
    }

    public void setPermissionKey(String str) {
        realmSet$permissionKey(str);
    }

    public String getPermissionTitle() {
        return realmGet$permissionTitle();
    }

    public void setPermissionTitle(String str) {
        realmSet$permissionTitle(str);
    }

    public boolean isValue() {
        return realmGet$value();
    }

    public void setValue(boolean z) {
        realmSet$value(z);
    }

    public boolean areItemsTheSame(RentPermissions rentPermissions) {
        return realmGet$permissionKey().equals(rentPermissions.realmGet$permissionKey());
    }

    public boolean areContentsTheSame(RentPermissions rentPermissions) {
        return realmGet$value() == rentPermissions.realmGet$value();
    }
}
