package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4743x1ad96c42;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta */
public class PropertyRenta extends RealmObject implements C4743x1ad96c42 {
    @SerializedName("attributes")
    @Expose
    private AttrRenta attributes;
    @SerializedName("building_id")
    @Expose
    private String buildingId;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Integer f6812id;
    @SerializedName("rent_cost")
    @Expose
    private String rentCost;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private TypeRent typeRent;

    public AttrRenta realmGet$attributes() {
        return this.attributes;
    }

    public String realmGet$buildingId() {
        return this.buildingId;
    }

    public Integer realmGet$id() {
        return this.f6812id;
    }

    public String realmGet$rentCost() {
        return this.rentCost;
    }

    public String realmGet$title() {
        return this.title;
    }

    public TypeRent realmGet$typeRent() {
        return this.typeRent;
    }

    public void realmSet$attributes(AttrRenta attrRenta) {
        this.attributes = attrRenta;
    }

    public void realmSet$buildingId(String str) {
        this.buildingId = str;
    }

    public void realmSet$id(Integer num) {
        this.f6812id = num;
    }

    public void realmSet$rentCost(String str) {
        this.rentCost = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$typeRent(TypeRent typeRent2) {
        this.typeRent = typeRent2;
    }

    public PropertyRenta() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public TypeRent getTypeRent() {
        return realmGet$typeRent();
    }

    public void setTypeRent(TypeRent typeRent2) {
        realmSet$typeRent(typeRent2);
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

    public String getBuildingId() {
        return realmGet$buildingId();
    }

    public void setBuildingId(String str) {
        realmSet$buildingId(str);
    }

    public AttrRenta getAttributes() {
        return realmGet$attributes();
    }

    public void setAttributes(AttrRenta attrRenta) {
        realmSet$attributes(attrRenta);
    }

    public String toString() {
        return "PropertyRenta{id=" + realmGet$id() + ", title='" + realmGet$title() + '\'' + ", buildingId=" + realmGet$buildingId() + ", attributes=" + realmGet$attributes() + '}';
    }

    public String getRentCost() {
        return realmGet$rentCost();
    }

    public void setRentCost(String str) {
        realmSet$rentCost(str);
    }
}
