package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Complex */
public class Complex extends RealmObject implements ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface {
    private String address;
    @SerializedName("building_id")
    private String buildingId;
    private Coordinates center;
    @SerializedName("city_id")
    private String cityId;
    @SerializedName("date_end")
    private String dateEnd;
    private String description;
    @PrimaryKey

    /* renamed from: id */
    private String f6642id;
    @SerializedName("img")
    private RealmList<String> imageList;
    private RealmList<byte[]> imges_bitmap;
    @SerializedName("is_finished")
    private Boolean isFinished;
    private String title;
    private String uid;

    public String realmGet$address() {
        return this.address;
    }

    public String realmGet$buildingId() {
        return this.buildingId;
    }

    public Coordinates realmGet$center() {
        return this.center;
    }

    public String realmGet$cityId() {
        return this.cityId;
    }

    public String realmGet$dateEnd() {
        return this.dateEnd;
    }

    public String realmGet$description() {
        return this.description;
    }

    public String realmGet$id() {
        return this.f6642id;
    }

    public RealmList realmGet$imageList() {
        return this.imageList;
    }

    public RealmList realmGet$imges_bitmap() {
        return this.imges_bitmap;
    }

    public Boolean realmGet$isFinished() {
        return this.isFinished;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$uid() {
        return this.uid;
    }

    public void realmSet$address(String str) {
        this.address = str;
    }

    public void realmSet$buildingId(String str) {
        this.buildingId = str;
    }

    public void realmSet$center(Coordinates coordinates) {
        this.center = coordinates;
    }

    public void realmSet$cityId(String str) {
        this.cityId = str;
    }

    public void realmSet$dateEnd(String str) {
        this.dateEnd = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$id(String str) {
        this.f6642id = str;
    }

    public void realmSet$imageList(RealmList realmList) {
        this.imageList = realmList;
    }

    public void realmSet$imges_bitmap(RealmList realmList) {
        this.imges_bitmap = realmList;
    }

    public void realmSet$isFinished(Boolean bool) {
        this.isFinished = bool;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$uid(String str) {
        this.uid = str;
    }

    public Complex() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$imageList(new RealmList());
        realmSet$imges_bitmap(new RealmList());
    }

    public String getBuildingId() {
        return realmGet$buildingId();
    }

    public void setBuildingId(String str) {
        realmSet$buildingId(str);
    }

    public String getUid() {
        return realmGet$uid();
    }

    public void setUid(String str) {
        realmSet$uid(str);
    }

    public Boolean getFinished() {
        return realmGet$isFinished();
    }

    public void setFinished(Boolean bool) {
        realmSet$isFinished(bool);
    }

    /* renamed from: ru.unicorn.ujin.data.realm.Complex$Fields */
    public class Fields {
        public static final String cityId = "cityId";

        /* renamed from: id */
        public static final String f6643id = "id";

        public Fields() {
        }
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getCityId() {
        return realmGet$cityId();
    }

    public void setCityId(String str) {
        realmSet$cityId(str);
    }

    public String getDescription() {
        return realmGet$description();
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public String getAddress() {
        return realmGet$address();
    }

    public void setAddress(String str) {
        realmSet$address(str);
    }

    public String getDateEnd() {
        return realmGet$dateEnd();
    }

    public void setDateEnd(String str) {
        realmSet$dateEnd(str);
    }

    public RealmList<String> getImgSliders() {
        return realmGet$imageList();
    }

    public void setImgSliders(RealmList<String> realmList) {
        realmSet$imageList(realmList);
    }

    public RealmList<byte[]> getImgesBitmap() {
        return realmGet$imges_bitmap();
    }

    public void setImgesBitmap(RealmList<byte[]> realmList) {
        realmSet$imges_bitmap(realmList);
    }

    public Coordinates getCenter() {
        return realmGet$center();
    }

    public void setCenter(Coordinates coordinates) {
        realmSet$center(coordinates);
    }
}
