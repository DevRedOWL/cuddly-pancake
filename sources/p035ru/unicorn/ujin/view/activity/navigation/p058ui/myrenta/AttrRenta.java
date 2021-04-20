package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4741xce5ff9de;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta */
public class AttrRenta extends RealmObject implements C4741xce5ff9de {
    @SerializedName("area")
    @Expose
    private String area;
    @SerializedName("capacity")
    @Expose
    private String capacity;
    @SerializedName("floor")
    @Expose
    private String floor;

    public String realmGet$area() {
        return this.area;
    }

    public String realmGet$capacity() {
        return this.capacity;
    }

    public String realmGet$floor() {
        return this.floor;
    }

    public void realmSet$area(String str) {
        this.area = str;
    }

    public void realmSet$capacity(String str) {
        this.capacity = str;
    }

    public void realmSet$floor(String str) {
        this.floor = str;
    }

    public AttrRenta() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getArea() {
        return realmGet$area();
    }

    public void setArea(String str) {
        realmSet$area(str);
    }

    public String getFloor() {
        return realmGet$floor();
    }

    public void setFloor(String str) {
        realmSet$floor(str);
    }

    public String getCapacity() {
        return realmGet$capacity();
    }

    public void setCapacity(String str) {
        realmSet$capacity(str);
    }
}
