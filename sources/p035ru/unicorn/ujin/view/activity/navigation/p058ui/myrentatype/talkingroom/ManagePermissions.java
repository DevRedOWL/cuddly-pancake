package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4765x8eba244a;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions */
public class ManagePermissions extends RealmObject implements C4765x8eba244a {
    @SerializedName("can_manage")
    private boolean canManage;

    public boolean realmGet$canManage() {
        return this.canManage;
    }

    public void realmSet$canManage(boolean z) {
        this.canManage = z;
    }

    public ManagePermissions() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean isCanManage() {
        return realmGet$canManage();
    }

    public void setCanManage(boolean z) {
        realmSet$canManage(z);
    }
}
