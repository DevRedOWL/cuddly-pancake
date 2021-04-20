package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.Permissions */
public class Permissions {
    @SerializedName("permissions")
    private List<String> permissionKey;

    public Permissions(List<String> list) {
        this.permissionKey = list;
    }

    public List<String> getPermissionKey() {
        return this.permissionKey;
    }

    public void setPermissionKey(List<String> list) {
        this.permissionKey = list;
    }
}
