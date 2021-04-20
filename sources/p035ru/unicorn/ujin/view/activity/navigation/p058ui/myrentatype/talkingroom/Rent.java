package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4769x39a64b2;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent */
public class Rent extends RealmObject implements C4769x39a64b2 {
    @SerializedName("permissions")
    @Expose
    private ManagePermissions canManage;
    @SerializedName("finish_date")
    @Expose
    private long finishDate;
    @SerializedName("human_finish_date")
    @Expose
    public String finishDateHuman;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private String f6824id;
    @SerializedName("owner_contractor_id")
    @Expose
    private Integer ownerContractorId;
    @SerializedName("property_id")
    @Expose
    private Integer propertyId;
    @SerializedName("renters")
    @Expose
    private RealmList<Renters> renters;
    @SerializedName("start_date")
    @Expose
    private long startDate;
    @SerializedName("human_start_date")
    @Expose
    public String startDateHuman;
    @SerializedName("state")
    @Expose
    private RentState state;
    @SerializedName("property")
    @Expose
    private TalkingInfo talkingInfo;
    @SerializedName("timezone")
    @Expose
    private String timezone;

    public ManagePermissions realmGet$canManage() {
        return this.canManage;
    }

    public long realmGet$finishDate() {
        return this.finishDate;
    }

    public String realmGet$finishDateHuman() {
        return this.finishDateHuman;
    }

    public String realmGet$id() {
        return this.f6824id;
    }

    public Integer realmGet$ownerContractorId() {
        return this.ownerContractorId;
    }

    public Integer realmGet$propertyId() {
        return this.propertyId;
    }

    public RealmList realmGet$renters() {
        return this.renters;
    }

    public long realmGet$startDate() {
        return this.startDate;
    }

    public String realmGet$startDateHuman() {
        return this.startDateHuman;
    }

    public RentState realmGet$state() {
        return this.state;
    }

    public TalkingInfo realmGet$talkingInfo() {
        return this.talkingInfo;
    }

    public String realmGet$timezone() {
        return this.timezone;
    }

    public void realmSet$canManage(ManagePermissions managePermissions) {
        this.canManage = managePermissions;
    }

    public void realmSet$finishDate(long j) {
        this.finishDate = j;
    }

    public void realmSet$finishDateHuman(String str) {
        this.finishDateHuman = str;
    }

    public void realmSet$id(String str) {
        this.f6824id = str;
    }

    public void realmSet$ownerContractorId(Integer num) {
        this.ownerContractorId = num;
    }

    public void realmSet$propertyId(Integer num) {
        this.propertyId = num;
    }

    public void realmSet$renters(RealmList realmList) {
        this.renters = realmList;
    }

    public void realmSet$startDate(long j) {
        this.startDate = j;
    }

    public void realmSet$startDateHuman(String str) {
        this.startDateHuman = str;
    }

    public void realmSet$state(RentState rentState) {
        this.state = rentState;
    }

    public void realmSet$talkingInfo(TalkingInfo talkingInfo2) {
        this.talkingInfo = talkingInfo2;
    }

    public void realmSet$timezone(String str) {
        this.timezone = str;
    }

    public Rent() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public TalkingInfo getTalkingInfo() {
        return realmGet$talkingInfo();
    }

    public void setTalkingInfo(TalkingInfo talkingInfo2) {
        realmSet$talkingInfo(talkingInfo2);
    }

    public RealmList<Renters> getRenters() {
        return realmGet$renters();
    }

    public ManagePermissions getCanManage() {
        return realmGet$canManage();
    }

    public void setCanManage(ManagePermissions managePermissions) {
        realmSet$canManage(managePermissions);
    }

    public void setRenters(RealmList<Renters> realmList) {
        realmSet$renters(realmList);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public Integer getPropertyId() {
        return realmGet$propertyId();
    }

    public void setPropertyId(Integer num) {
        realmSet$propertyId(num);
    }

    public Integer getOwnerContractorId() {
        return realmGet$ownerContractorId();
    }

    public void setOwnerContractorId(Integer num) {
        realmSet$ownerContractorId(num);
    }

    public long getStartDate() {
        return realmGet$startDate();
    }

    public void setStartDate(long j) {
        realmSet$startDate(j);
    }

    public long getFinishDate() {
        return realmGet$finishDate();
    }

    public void setFinishDate(long j) {
        realmSet$finishDate(j);
    }

    public String getTimezone() {
        return realmGet$timezone();
    }

    public void setTimezone(String str) {
        realmSet$timezone(str);
    }

    public RentState getState() {
        return realmGet$state();
    }

    public void setState(RentState rentState) {
        realmSet$state(rentState);
    }

    public String toString() {
        return "Rent{id=" + realmGet$id() + ", propertyId=" + realmGet$propertyId() + ", ownerContractorId=" + realmGet$ownerContractorId() + ", startDate=" + realmGet$startDate() + ", finishDate=" + realmGet$finishDate() + ", timezone='" + realmGet$timezone() + '\'' + ", state=" + realmGet$state() + ", renters=" + realmGet$renters() + '}';
    }
}
