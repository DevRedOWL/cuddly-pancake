package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4697xf082b8b2;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceIndicator */
public class DomServiceIndicator extends RealmObject implements C4697xf082b8b2 {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("value")
    @Expose
    private Integer value;

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$unit() {
        return this.unit;
    }

    public Integer realmGet$value() {
        return this.value;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$unit(String str) {
        this.unit = str;
    }

    public void realmSet$value(Integer num) {
        this.value = num;
    }

    public DomServiceIndicator() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public Integer getValue() {
        return realmGet$value();
    }

    public void setValue(Integer num) {
        realmSet$value(num);
    }

    public String getUnit() {
        return realmGet$unit();
    }

    public void setUnit(String str) {
        realmSet$unit(str);
    }
}
