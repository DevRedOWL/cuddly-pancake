package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4771x6b36afb1;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentState */
public class RentState extends RealmObject implements C4771x6b36afb1 {
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private Integer f6826id;
    @SerializedName("name")
    @Expose
    private String name;

    public String realmGet$displayName() {
        return this.displayName;
    }

    public Integer realmGet$id() {
        return this.f6826id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public void realmSet$displayName(String str) {
        this.displayName = str;
    }

    public void realmSet$id(Integer num) {
        this.f6826id = num;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public RentState() {
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
}
