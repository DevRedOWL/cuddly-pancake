package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Favourite */
public class Favourite extends RealmObject implements ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface {
    @SerializedName("complex_info")
    private String complexTitle;
    @SerializedName("date_end")
    private String dateEnd;
    @SerializedName("description_small")
    private String descriptionSmall;
    private Integer favorites;
    private String floor;
    @SerializedName("floor_total")
    private String floorTotal;
    @SerializedName("uid")
    @PrimaryKey

    /* renamed from: id */
    private String f6650id;
    @SerializedName("img_big")
    private String imgBig;
    private byte[] imgBigBytes;
    @SerializedName("img_small")
    private String imgSmall;
    private byte[] imgSmallBytes;
    @SerializedName("is_action")
    private Boolean isAction;
    private Integer number;
    private String price;
    @SerializedName("old_price")
    private String priceOld;
    private String rooms;
    private String square;

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

    public String realmGet$floor() {
        return this.floor;
    }

    public String realmGet$floorTotal() {
        return this.floorTotal;
    }

    public String realmGet$id() {
        return this.f6650id;
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

    public Integer realmGet$number() {
        return this.number;
    }

    public String realmGet$price() {
        return this.price;
    }

    public String realmGet$priceOld() {
        return this.priceOld;
    }

    public String realmGet$rooms() {
        return this.rooms;
    }

    public String realmGet$square() {
        return this.square;
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

    public void realmSet$floor(String str) {
        this.floor = str;
    }

    public void realmSet$floorTotal(String str) {
        this.floorTotal = str;
    }

    public void realmSet$id(String str) {
        this.f6650id = str;
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

    public void realmSet$number(Integer num) {
        this.number = num;
    }

    public void realmSet$price(String str) {
        this.price = str;
    }

    public void realmSet$priceOld(String str) {
        this.priceOld = str;
    }

    public void realmSet$rooms(String str) {
        this.rooms = str;
    }

    public void realmSet$square(String str) {
        this.square = str;
    }

    public Favourite() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
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

    /* renamed from: ru.unicorn.ujin.data.realm.Favourite$Fields */
    public class Fields {

        /* renamed from: id */
        public static final String f6651id = "id";

        public Fields() {
        }
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getDateEnd() {
        return realmGet$dateEnd();
    }

    public void setDateEnd(String str) {
        realmSet$dateEnd(str);
    }

    public Integer getNumber() {
        return realmGet$number();
    }

    public void setNumber(Integer num) {
        realmSet$number(num);
    }

    public String getRooms() {
        return realmGet$rooms();
    }

    public void setRooms(String str) {
        realmSet$rooms(str);
    }

    public String getSquare() {
        return realmGet$square();
    }

    public void setSquare(String str) {
        realmSet$square(str);
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(Double.valueOf(realmGet$price()).doubleValue());
    }

    public void setPrice(BigDecimal bigDecimal) {
        realmSet$price(bigDecimal.toString());
    }

    public String getFloor() {
        return realmGet$floor();
    }

    public void setFloor(String str) {
        realmSet$floor(str);
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
        return realmGet$favorites();
    }

    public void setFavorites(Integer num) {
        realmSet$favorites(num);
    }

    public void setImgBig(String str) {
        realmSet$imgBig(str);
    }

    public String getImgBig() {
        return realmGet$imgBig();
    }

    public byte[] getImgBigBytes() {
        return realmGet$imgBigBytes();
    }

    public void setImgBigBytes(byte[] bArr) {
        realmSet$imgBigBytes(bArr);
    }

    public void setImgSmall(String str) {
        realmSet$imgSmall(str);
    }

    public String getImgSmall() {
        return realmGet$imgSmall();
    }

    public byte[] getImgSmallBytes() {
        return realmGet$imgSmallBytes();
    }

    public void setImgSmallBytes(byte[] bArr) {
        realmSet$imgSmallBytes(bArr);
    }

    public String getComplexTitle() {
        return realmGet$complexTitle();
    }

    public void setComplexTitle(String str) {
        realmSet$complexTitle(str);
    }
}
