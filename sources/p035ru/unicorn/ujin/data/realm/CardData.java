package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmObject;
import p046io.realm.annotations.Ignore;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.CardData */
public class CardData extends RealmObject implements Diffable<CardData>, ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface {
    @SerializedName("address")
    @Expose
    private CardAdress address;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("date_end")
    @Expose
    private long dateEnd;
    @SerializedName("date_start")
    @Expose
    private long dateStart;
    @SerializedName("guest_fullname")
    @Expose
    private String guestFullname;
    @SerializedName("guest_phone")
    @Expose
    private String guestPhone;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f6637id;
    @SerializedName("id_number")
    @Expose
    private String idNumber;
    @SerializedName("type")
    @Expose
    private String type;
    @Ignore
    private Integer viewId;

    public CardAdress realmGet$address() {
        return this.address;
    }

    public String realmGet$brand() {
        return this.brand;
    }

    public String realmGet$comment() {
        return this.comment;
    }

    public long realmGet$dateEnd() {
        return this.dateEnd;
    }

    public long realmGet$dateStart() {
        return this.dateStart;
    }

    public String realmGet$guestFullname() {
        return this.guestFullname;
    }

    public String realmGet$guestPhone() {
        return this.guestPhone;
    }

    public String realmGet$id() {
        return this.f6637id;
    }

    public String realmGet$idNumber() {
        return this.idNumber;
    }

    public String realmGet$type() {
        return this.type;
    }

    public void realmSet$address(CardAdress cardAdress) {
        this.address = cardAdress;
    }

    public void realmSet$brand(String str) {
        this.brand = str;
    }

    public void realmSet$comment(String str) {
        this.comment = str;
    }

    public void realmSet$dateEnd(long j) {
        this.dateEnd = j;
    }

    public void realmSet$dateStart(long j) {
        this.dateStart = j;
    }

    public void realmSet$guestFullname(String str) {
        this.guestFullname = str;
    }

    public void realmSet$guestPhone(String str) {
        this.guestPhone = str;
    }

    public void realmSet$id(String str) {
        this.f6637id = str;
    }

    public void realmSet$idNumber(String str) {
        this.idNumber = str;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    public CardData() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getIdNumber() {
        return realmGet$idNumber();
    }

    public void setIdNumber(String str) {
        realmSet$idNumber(str);
    }

    public String getBrand() {
        return realmGet$brand();
    }

    public void setBrand(String str) {
        realmSet$brand(str);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public CardAdress getAddress() {
        return realmGet$address();
    }

    public void setAddress(CardAdress cardAdress) {
        realmSet$address(cardAdress);
    }

    public String getType() {
        return realmGet$type();
    }

    public void setType(String str) {
        realmSet$type(str);
    }

    public String getComment() {
        return realmGet$comment();
    }

    public void setComment(String str) {
        realmSet$comment(str);
    }

    public String getGuestFullname() {
        return realmGet$guestFullname();
    }

    public void setGuestFullname(String str) {
        realmSet$guestFullname(str);
    }

    public String getGuestPhone() {
        return realmGet$guestPhone();
    }

    public void setGuestPhone(String str) {
        realmSet$guestPhone(str);
    }

    public void setDateStart(Integer num) {
        realmSet$dateStart((long) num.intValue());
    }

    public long getDateStart() {
        return realmGet$dateStart();
    }

    public void setDateStart(long j) {
        realmSet$dateStart(j);
    }

    public long getDateEnd() {
        return realmGet$dateEnd();
    }

    public void setDateEnd(long j) {
        realmSet$dateEnd(j);
    }

    public void setDateEnd(Integer num) {
        realmSet$dateEnd((long) num.intValue());
    }

    public boolean areItemsTheSame(CardData cardData) {
        return realmGet$id().equals(cardData.getId());
    }

    public boolean areContentsTheSame(CardData cardData) {
        return realmGet$id().equals(cardData.realmGet$id());
    }

    public Integer getViewId() {
        return this.viewId;
    }

    public void setViewId(Integer num) {
        this.viewId = num;
    }
}
