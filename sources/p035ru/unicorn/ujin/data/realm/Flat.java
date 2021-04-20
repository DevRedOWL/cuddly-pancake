package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Flat */
public class Flat extends RealmObject implements Diffable<Flat>, ru_unicorn_ujin_data_realm_FlatRealmProxyInterface {
    @SerializedName("address")
    private String address;
    @SerializedName("buttons")
    private FlatButtons buttonTexts;
    @SerializedName("complex_id")
    private String complexId;
    @SerializedName("complex_title")
    private String complexTitle;
    @SerializedName("date_end")
    private String dateEnd;
    @SerializedName("description_small")
    private String descriptionSmall;
    private Integer favorites;
    @SerializedName("flat_id")
    private String flatId;
    @SerializedName("room_info")
    private RealmList<FlatInfo> flatInfoList;
    private Integer floor;
    @SerializedName("floor_total")
    private String floorTotal;
    @SerializedName("uid")
    @PrimaryKey

    /* renamed from: id */
    private String f6654id;
    @SerializedName("img_size")
    private ImageSize imageSize;
    @SerializedName("img_big")
    private String imgBig;
    private byte[] imgBigBytes;
    @SerializedName("img_small")
    private String imgSmall;
    private byte[] imgSmallBytes;
    @SerializedName("is_action")
    private Boolean isAction;
    @SerializedName("pamyatka")
    private Pamyatka pamyatka;
    @SerializedName("number")
    private String phoneNumber;
    private String price;
    @SerializedName("old_price")
    private String priceOld;
    @SerializedName("rent_enabled")
    private Boolean rentEnabled;
    private String rooms;
    @SerializedName("sell_enabled")
    private Boolean sellEnabled;
    private Double square;
    @SerializedName("url")
    private String url;

    /* renamed from: ru.unicorn.ujin.data.realm.Flat$Fields */
    public static class Fields {

        /* renamed from: id */
        public static String f6655id = "id";
    }

    public boolean areContentsTheSame(Flat flat) {
        return false;
    }

    public boolean areItemsTheSame(Flat flat) {
        return false;
    }

    public String realmGet$address() {
        return this.address;
    }

    public FlatButtons realmGet$buttonTexts() {
        return this.buttonTexts;
    }

    public String realmGet$complexId() {
        return this.complexId;
    }

    public String realmGet$complexTitle() {
        return this.complexTitle;
    }

    public String realmGet$dateEnd() {
        return this.dateEnd;
    }

    public String realmGet$descriptionSmall() {
        return this.descriptionSmall;
    }

    public Integer realmGet$favorites() {
        return this.favorites;
    }

    public String realmGet$flatId() {
        return this.flatId;
    }

    public RealmList realmGet$flatInfoList() {
        return this.flatInfoList;
    }

    public Integer realmGet$floor() {
        return this.floor;
    }

    public String realmGet$floorTotal() {
        return this.floorTotal;
    }

    public String realmGet$id() {
        return this.f6654id;
    }

    public ImageSize realmGet$imageSize() {
        return this.imageSize;
    }

    public String realmGet$imgBig() {
        return this.imgBig;
    }

    public byte[] realmGet$imgBigBytes() {
        return this.imgBigBytes;
    }

    public String realmGet$imgSmall() {
        return this.imgSmall;
    }

    public byte[] realmGet$imgSmallBytes() {
        return this.imgSmallBytes;
    }

    public Boolean realmGet$isAction() {
        return this.isAction;
    }

    public Pamyatka realmGet$pamyatka() {
        return this.pamyatka;
    }

    public String realmGet$phoneNumber() {
        return this.phoneNumber;
    }

    public String realmGet$price() {
        return this.price;
    }

    public String realmGet$priceOld() {
        return this.priceOld;
    }

    public Boolean realmGet$rentEnabled() {
        return this.rentEnabled;
    }

    public String realmGet$rooms() {
        return this.rooms;
    }

    public Boolean realmGet$sellEnabled() {
        return this.sellEnabled;
    }

    public Double realmGet$square() {
        return this.square;
    }

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$address(String str) {
        this.address = str;
    }

    public void realmSet$buttonTexts(FlatButtons flatButtons) {
        this.buttonTexts = flatButtons;
    }

    public void realmSet$complexId(String str) {
        this.complexId = str;
    }

    public void realmSet$complexTitle(String str) {
        this.complexTitle = str;
    }

    public void realmSet$dateEnd(String str) {
        this.dateEnd = str;
    }

    public void realmSet$descriptionSmall(String str) {
        this.descriptionSmall = str;
    }

    public void realmSet$favorites(Integer num) {
        this.favorites = num;
    }

    public void realmSet$flatId(String str) {
        this.flatId = str;
    }

    public void realmSet$flatInfoList(RealmList realmList) {
        this.flatInfoList = realmList;
    }

    public void realmSet$floor(Integer num) {
        this.floor = num;
    }

    public void realmSet$floorTotal(String str) {
        this.floorTotal = str;
    }

    public void realmSet$id(String str) {
        this.f6654id = str;
    }

    public void realmSet$imageSize(ImageSize imageSize2) {
        this.imageSize = imageSize2;
    }

    public void realmSet$imgBig(String str) {
        this.imgBig = str;
    }

    public void realmSet$imgBigBytes(byte[] bArr) {
        this.imgBigBytes = bArr;
    }

    public void realmSet$imgSmall(String str) {
        this.imgSmall = str;
    }

    public void realmSet$imgSmallBytes(byte[] bArr) {
        this.imgSmallBytes = bArr;
    }

    public void realmSet$isAction(Boolean bool) {
        this.isAction = bool;
    }

    public void realmSet$pamyatka(Pamyatka pamyatka2) {
        this.pamyatka = pamyatka2;
    }

    public void realmSet$phoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void realmSet$price(String str) {
        this.price = str;
    }

    public void realmSet$priceOld(String str) {
        this.priceOld = str;
    }

    public void realmSet$rentEnabled(Boolean bool) {
        this.rentEnabled = bool;
    }

    public void realmSet$rooms(String str) {
        this.rooms = str;
    }

    public void realmSet$sellEnabled(Boolean bool) {
        this.sellEnabled = bool;
    }

    public void realmSet$square(Double d) {
        this.square = d;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public Flat() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public ImageSize getImageSize() {
        return realmGet$imageSize();
    }

    public void setImageSize(ImageSize imageSize2) {
        realmSet$imageSize(imageSize2);
    }

    public FlatButtons getButtonTexts() {
        return realmGet$buttonTexts();
    }

    public void setButtonTexts(FlatButtons flatButtons) {
        realmSet$buttonTexts(flatButtons);
    }

    public Pamyatka getPamyatka() {
        return realmGet$pamyatka();
    }

    public void setPamyatka(Pamyatka pamyatka2) {
        realmSet$pamyatka(pamyatka2);
    }

    public String getAddress() {
        return realmGet$address();
    }

    public void setAddress(String str) {
        realmSet$address(str);
    }

    public String getFlatId() {
        return realmGet$flatId();
    }

    public String getPriceOld() {
        return realmGet$priceOld();
    }

    public void setPriceOld(String str) {
        realmSet$priceOld(str);
    }

    public Boolean getAction() {
        return realmGet$isAction();
    }

    public void setAction(Boolean bool) {
        realmSet$isAction(bool);
    }

    public Boolean getSellEnabled() {
        return Boolean.valueOf(realmGet$sellEnabled() == null ? false : realmGet$sellEnabled().booleanValue());
    }

    public void setSellEnabled(Boolean bool) {
        realmSet$sellEnabled(bool);
    }

    public Boolean getRentEnabled() {
        return realmGet$rentEnabled();
    }

    public String getUrl() {
        return realmGet$url();
    }

    public void setUrl(String str) {
        realmSet$url(str);
    }

    public String getComplexID() {
        return realmGet$complexId();
    }

    public void setComplexID(String str) {
        realmSet$complexId(str);
    }

    public String getFlatsUID() {
        return realmGet$id();
    }

    public void setFlatsUID(String str) {
        realmSet$id(str);
    }

    public String getDateEnd() {
        return realmGet$dateEnd();
    }

    public void setDateEnd(String str) {
        realmSet$dateEnd(str);
    }

    public String getPhoneNumber() {
        return realmGet$phoneNumber();
    }

    public void setPhoneNumber(String str) {
        realmSet$phoneNumber(str);
    }

    public String getRooms() {
        return realmGet$rooms();
    }

    public void setRooms(String str) {
        realmSet$rooms(str);
    }

    public Double getSquare() {
        return realmGet$square();
    }

    public void setSquare(Double d) {
        realmSet$square(d);
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(Double.valueOf(realmGet$price()).doubleValue());
    }

    public void setPrice(BigDecimal bigDecimal) {
        realmSet$price(bigDecimal.toString());
    }

    public Integer getFloor() {
        return realmGet$floor();
    }

    public void setFloor(Integer num) {
        realmSet$floor(num);
    }

    public String getFloorTotal() {
        return realmGet$floorTotal();
    }

    public void setFloorTotal(String str) {
        realmSet$floorTotal(str);
    }

    public String getDescriptionSmall() {
        return realmGet$descriptionSmall();
    }

    public void setDescriptionSmall(String str) {
        realmSet$descriptionSmall(str);
    }

    public Integer getFavorites() {
        return Integer.valueOf(realmGet$favorites() == null ? 0 : realmGet$favorites().intValue());
    }

    public void setFavorites(Integer num) {
        realmSet$favorites(num);
    }

    public String getImgBig() {
        return realmGet$imgBig();
    }

    public void setImgBig(String str) {
        realmSet$imgBig(str);
    }

    public byte[] getImgBigBytes() {
        return realmGet$imgBigBytes();
    }

    public void setImgBigBytes(byte[] bArr) {
        realmSet$imgBigBytes(bArr);
    }

    public String getImgSmall() {
        return realmGet$imgSmall();
    }

    public void setImgSmall(String str) {
        realmSet$imgSmall(str);
    }

    public byte[] getImgSmallBytes() {
        return realmGet$imgSmallBytes();
    }

    public void setImgSmallBytes(byte[] bArr) {
        realmSet$imgSmallBytes(bArr);
    }

    public RealmList<FlatInfo> getFlatInfoList() {
        return realmGet$flatInfoList();
    }

    public void setFlatInfoList(RealmList<FlatInfo> realmList) {
        realmSet$flatInfoList(realmList);
    }

    public String getComplexTitle() {
        return realmGet$complexTitle();
    }

    public void setComplexTitle(String str) {
        realmSet$complexTitle(str);
    }
}
