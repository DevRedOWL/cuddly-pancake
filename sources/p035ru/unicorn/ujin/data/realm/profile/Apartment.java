package p035ru.unicorn.ujin.data.realm.profile;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.profile.Apartment */
public class Apartment extends RealmObject implements Diffable<Apartment>, ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface {
    @SerializedName("accept_enabled")
    Integer acceptingEnabled;
    @SerializedName("apartment_request")
    private ApartmentRequest apartmentRequest;
    @SerializedName("building_id")
    String buildingId;
    @SerializedName("complex_id")
    String complexId;
    @SerializedName("id")

    /* renamed from: id */
    Integer f6701id;
    private Boolean isCommerceThingsAvailable;
    @SerializedName("buildings_properties_rent_available")
    Boolean rentAvailable;
    @SerializedName("show_tabbar")
    private Boolean showBottomNavigation;
    @SerializedName("stage")
    Integer stage;
    @SerializedName("title")
    String title;
    @SerializedName("uid")
    String uid;
    @SerializedName("user_token")
    @PrimaryKey
    String userToken;

    public boolean areContentsTheSame(Apartment apartment) {
        return false;
    }

    public boolean areItemsTheSame(Apartment apartment) {
        return false;
    }

    public Integer realmGet$acceptingEnabled() {
        return this.acceptingEnabled;
    }

    public ApartmentRequest realmGet$apartmentRequest() {
        return this.apartmentRequest;
    }

    public String realmGet$buildingId() {
        return this.buildingId;
    }

    public String realmGet$complexId() {
        return this.complexId;
    }

    public Integer realmGet$id() {
        return this.f6701id;
    }

    public Boolean realmGet$isCommerceThingsAvailable() {
        return this.isCommerceThingsAvailable;
    }

    public Boolean realmGet$rentAvailable() {
        return this.rentAvailable;
    }

    public Boolean realmGet$showBottomNavigation() {
        return this.showBottomNavigation;
    }

    public Integer realmGet$stage() {
        return this.stage;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$uid() {
        return this.uid;
    }

    public String realmGet$userToken() {
        return this.userToken;
    }

    public void realmSet$acceptingEnabled(Integer num) {
        this.acceptingEnabled = num;
    }

    public void realmSet$apartmentRequest(ApartmentRequest apartmentRequest2) {
        this.apartmentRequest = apartmentRequest2;
    }

    public void realmSet$buildingId(String str) {
        this.buildingId = str;
    }

    public void realmSet$complexId(String str) {
        this.complexId = str;
    }

    public void realmSet$id(Integer num) {
        this.f6701id = num;
    }

    public void realmSet$isCommerceThingsAvailable(Boolean bool) {
        this.isCommerceThingsAvailable = bool;
    }

    public void realmSet$rentAvailable(Boolean bool) {
        this.rentAvailable = bool;
    }

    public void realmSet$showBottomNavigation(Boolean bool) {
        this.showBottomNavigation = bool;
    }

    public void realmSet$stage(Integer num) {
        this.stage = num;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$uid(String str) {
        this.uid = str;
    }

    public void realmSet$userToken(String str) {
        this.userToken = str;
    }

    public Apartment() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$isCommerceThingsAvailable(false);
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
    }

    public String getUid() {
        return realmGet$uid();
    }

    public void setUid(String str) {
        realmSet$uid(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getUserToken() {
        return realmGet$userToken();
    }

    public void setUserToken(String str) {
        realmSet$userToken(str);
    }

    public String getComplexId() {
        return realmGet$complexId();
    }

    public void setComplexId(String str) {
        realmSet$complexId(str);
    }

    public String getBuildingId() {
        return realmGet$buildingId();
    }

    public Integer getStage() {
        return realmGet$stage();
    }

    public void setStage(Integer num) {
        realmSet$stage(num);
    }

    public Integer getAcceptingEnabled() {
        return realmGet$acceptingEnabled();
    }

    public void setAcceptingEnabled(Integer num) {
        realmSet$acceptingEnabled(num);
    }

    public Boolean getRentAvailable() {
        return Boolean.valueOf(realmGet$rentAvailable() == null ? false : realmGet$rentAvailable().booleanValue());
    }

    public Boolean isBottomNavigationVisible() {
        return realmGet$showBottomNavigation();
    }

    public void setShowBottomNavigation(Boolean bool) {
        realmSet$showBottomNavigation(bool);
    }

    public Boolean getCommerceThingsAvailable() {
        return realmGet$isCommerceThingsAvailable();
    }

    public void setCommerceThingsAvailable(Boolean bool) {
        realmSet$isCommerceThingsAvailable(bool);
    }

    public ApartmentRequest getApartmentRequest() {
        return realmGet$apartmentRequest();
    }
}
