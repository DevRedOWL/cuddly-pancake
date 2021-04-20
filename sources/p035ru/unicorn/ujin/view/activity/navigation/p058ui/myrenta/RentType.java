package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4755x2c8d850c;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType */
public class RentType extends RealmObject implements Diffable<RentType>, C4755x2c8d850c {
    @SerializedName("attributes")
    @Expose
    private RealmList<RentTypeAttr> attributes;
    @SerializedName("title")
    @Expose
    private String displayName;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private int f6815id;
    @SerializedName("name")
    @Expose
    private String name;

    public RealmList realmGet$attributes() {
        return this.attributes;
    }

    public String realmGet$displayName() {
        return this.displayName;
    }

    public int realmGet$id() {
        return this.f6815id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public void realmSet$attributes(RealmList realmList) {
        this.attributes = realmList;
    }

    public void realmSet$displayName(String str) {
        this.displayName = str;
    }

    public void realmSet$id(int i) {
        this.f6815id = i;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public RentType() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$attributes((RealmList) null);
    }

    public boolean areItemsTheSame(RentType rentType) {
        return realmGet$id() == rentType.realmGet$id();
    }

    public boolean areContentsTheSame(RentType rentType) {
        return realmGet$name().equals(rentType.realmGet$name());
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
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

    public List<RentTypeAttr> getAttributes() {
        return realmGet$attributes();
    }

    public void setAttributes(RealmList<RentTypeAttr> realmList) {
        realmSet$attributes(realmList);
    }
}
