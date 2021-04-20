package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4649x8e034583;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo */
public class RoomInfo extends RealmObject implements C4649x8e034583 {
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Integer f6722id;
    @SerializedName("title")
    @Expose
    private String title;

    public Integer realmGet$id() {
        return this.f6722id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$id(Integer num) {
        this.f6722id = num;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public RoomInfo() {
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

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String toString() {
        return "RoomInfo{id=" + realmGet$id() + ", title='" + realmGet$title() + '\'' + '}';
    }
}
