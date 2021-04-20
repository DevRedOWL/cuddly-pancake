package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4773x8b06469c;
import p046io.realm.RealmObject;
import p046io.realm.annotations.Ignore;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters */
public class Renters extends RealmObject implements Diffable<Renters>, C4773x8b06469c {
    @Ignore
    boolean addRole;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Integer f6827id;
    @SerializedName("rent_id")
    @Expose
    private Integer rentId;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;
    @SerializedName("userdata_id")
    @Expose
    private Integer userdataId;

    public Integer realmGet$id() {
        return this.f6827id;
    }

    public Integer realmGet$rentId() {
        return this.rentId;
    }

    public Integer realmGet$roleId() {
        return this.roleId;
    }

    public Integer realmGet$userdataId() {
        return this.userdataId;
    }

    public void realmSet$id(Integer num) {
        this.f6827id = num;
    }

    public void realmSet$rentId(Integer num) {
        this.rentId = num;
    }

    public void realmSet$roleId(Integer num) {
        this.roleId = num;
    }

    public void realmSet$userdataId(Integer num) {
        this.userdataId = num;
    }

    public Renters() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean isAddRole() {
        return this.addRole;
    }

    public void setAddRole(boolean z) {
        this.addRole = z;
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
    }

    public Integer getRentId() {
        return realmGet$rentId();
    }

    public void setRentId(Integer num) {
        realmSet$rentId(num);
    }

    public Integer getUserdataId() {
        return realmGet$userdataId();
    }

    public void setUserdataId(Integer num) {
        realmSet$userdataId(num);
    }

    public Integer getRoleId() {
        return realmGet$roleId();
    }

    public void setRoleId(Integer num) {
        realmSet$roleId(num);
    }

    public boolean areItemsTheSame(Renters renters) {
        return realmGet$id().equals(renters.realmGet$id());
    }

    public boolean areContentsTheSame(Renters renters) {
        return realmGet$roleId().equals(renters.realmGet$roleId());
    }

    public String toString() {
        return "Renters{id=" + realmGet$id() + ", rentId=" + realmGet$rentId() + ", userdataId=" + realmGet$userdataId() + ", roleId=" + realmGet$roleId() + '}';
    }
}
