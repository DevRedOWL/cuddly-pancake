package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4757xc7c7d28;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta */
public class StateRenta extends RealmObject implements C4757xc7c7d28 {
    @SerializedName("created_at")
    @Expose
    private Long createdAt;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Integer f6821id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("updated_at")
    @Expose
    private Long updatedAt;

    public Long realmGet$createdAt() {
        return this.createdAt;
    }

    public String realmGet$displayName() {
        return this.displayName;
    }

    public Integer realmGet$id() {
        return this.f6821id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public Long realmGet$updatedAt() {
        return this.updatedAt;
    }

    public void realmSet$createdAt(Long l) {
        this.createdAt = l;
    }

    public void realmSet$displayName(String str) {
        this.displayName = str;
    }

    public void realmSet$id(Integer num) {
        this.f6821id = num;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$updatedAt(Long l) {
        this.updatedAt = l;
    }

    public StateRenta() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
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

    public Long getCreatedAt() {
        return realmGet$createdAt();
    }

    public void setCreatedAt(Long l) {
        realmSet$createdAt(l);
    }

    public Long getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public void setUpdatedAt(Long l) {
        realmSet$updatedAt(l);
    }
}
