package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.CardAdress */
public class CardAdress extends RealmObject implements ru_unicorn_ujin_data_realm_CardAdressRealmProxyInterface {
    @SerializedName("building")
    @Expose
    private String building;
    @SerializedName("building_id")
    @Expose
    private String buildingId;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("full_address")
    @Expose
    private String fullAddress;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f6636id;
    @SerializedName("street")
    @Expose
    private String street;

    public String realmGet$building() {
        return this.building;
    }

    public String realmGet$buildingId() {
        return this.buildingId;
    }

    public String realmGet$city() {
        return this.city;
    }

    public String realmGet$fullAddress() {
        return this.fullAddress;
    }

    public String realmGet$id() {
        return this.f6636id;
    }

    public String realmGet$street() {
        return this.street;
    }

    public void realmSet$building(String str) {
        this.building = str;
    }

    public void realmSet$buildingId(String str) {
        this.buildingId = str;
    }

    public void realmSet$city(String str) {
        this.city = str;
    }

    public void realmSet$fullAddress(String str) {
        this.fullAddress = str;
    }

    public void realmSet$id(String str) {
        this.f6636id = str;
    }

    public void realmSet$street(String str) {
        this.street = str;
    }

    public CardAdress() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getCity() {
        return realmGet$city();
    }

    public void setCity(String str) {
        realmSet$city(str);
    }

    public String getStreet() {
        return realmGet$street();
    }

    public void setStreet(String str) {
        realmSet$street(str);
    }

    public String getBuilding() {
        return realmGet$building();
    }

    public void setBuilding(String str) {
        realmSet$building(str);
    }

    public String getFullAddress() {
        return realmGet$fullAddress();
    }

    public void setFullAddress(String str) {
        realmSet$fullAddress(str);
    }

    public String getBuildingId() {
        return realmGet$buildingId();
    }

    public void setBuildingId(String str) {
        realmSet$buildingId(str);
    }
}
