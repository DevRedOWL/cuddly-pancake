package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4597x60a4b2bb;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.data.realm.BeaconActionDescription */
public class BeaconActionDescription extends RealmObject implements C4597x60a4b2bb {
    @SerializedName("id")
    @PrimaryKey

    /* renamed from: id */
    private Integer f6633id;
    @SerializedName("title")
    private String title;

    public Integer realmGet$id() {
        return this.f6633id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$id(Integer num) {
        this.f6633id = num;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public BeaconActionDescription() {
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
}
