package p035ru.unicorn.ujin.view.activity.navigation.entity.intellect;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4651x913c9502;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect */
public class Intellect extends RealmObject implements C4651x913c9502 {
    @PrimaryKey

    /* renamed from: id */
    private Integer f6724id;
    @SerializedName("intellect")
    @Expose
    private Integer intellect;

    public Integer realmGet$id() {
        return this.f6724id;
    }

    public Integer realmGet$intellect() {
        return this.intellect;
    }

    public void realmSet$id(Integer num) {
        this.f6724id = num;
    }

    public void realmSet$intellect(Integer num) {
        this.intellect = num;
    }

    public Intellect() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(1);
    }

    public Intellect(Integer num, Integer num2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(1);
        realmSet$id(num);
        realmSet$intellect(num2);
    }

    public Integer getIntellect() {
        return realmGet$intellect();
    }

    public void setIntellect(Integer num) {
        realmSet$intellect(num);
    }
}
