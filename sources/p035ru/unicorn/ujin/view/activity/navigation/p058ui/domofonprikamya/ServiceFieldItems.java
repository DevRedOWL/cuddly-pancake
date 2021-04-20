package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4691x107e9946;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceFieldItems */
public class ServiceFieldItems extends RealmObject implements Diffable<ServiceFieldItems>, C4691x107e9946 {
    @SerializedName("id")

    /* renamed from: id */
    private int f6770id;
    @SerializedName("value")
    private String value;

    public boolean areContentsTheSame(ServiceFieldItems serviceFieldItems) {
        return false;
    }

    public boolean areItemsTheSame(ServiceFieldItems serviceFieldItems) {
        return false;
    }

    public int realmGet$id() {
        return this.f6770id;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$id(int i) {
        this.f6770id = i;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    public ServiceFieldItems() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
    }

    public String getValue() {
        return realmGet$value();
    }

    public void setValue(String str) {
        realmSet$value(str);
    }
}
