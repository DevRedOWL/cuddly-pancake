package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p046io.realm.C4775xa897b3c5;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo */
public class TalkingInfo extends RealmObject implements C4775xa897b3c5 {
    @SerializedName("address")
    @Expose
    private String adress;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private int f6829id;
    @SerializedName("photos")
    @Expose
    private RealmList<TalkingPhotos> image;
    @SerializedName("is_busy")
    @Expose
    private boolean parentIsBusy;
    @SerializedName("app_attributes_rows")
    @Expose
    private RealmList<RentAttributes> rentAttributes;
    @SerializedName("children")
    @Expose
    private RealmList<RentChildren> rentChildre;
    @SerializedName("renters")
    @Expose
    private RealmList<Renters> renters;
    @SerializedName("schema")
    @Expose
    private TalkingPhotosFile schemaPhoto;
    @SerializedName("type")
    @Expose
    private StateRenta stateRenta;
    @SerializedName("title")
    @Expose
    private String title;

    public String realmGet$adress() {
        return this.adress;
    }

    public int realmGet$id() {
        return this.f6829id;
    }

    public RealmList realmGet$image() {
        return this.image;
    }

    public boolean realmGet$parentIsBusy() {
        return this.parentIsBusy;
    }

    public RealmList realmGet$rentAttributes() {
        return this.rentAttributes;
    }

    public RealmList realmGet$rentChildre() {
        return this.rentChildre;
    }

    public RealmList realmGet$renters() {
        return this.renters;
    }

    public TalkingPhotosFile realmGet$schemaPhoto() {
        return this.schemaPhoto;
    }

    public StateRenta realmGet$stateRenta() {
        return this.stateRenta;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$adress(String str) {
        this.adress = str;
    }

    public void realmSet$id(int i) {
        this.f6829id = i;
    }

    public void realmSet$image(RealmList realmList) {
        this.image = realmList;
    }

    public void realmSet$parentIsBusy(boolean z) {
        this.parentIsBusy = z;
    }

    public void realmSet$rentAttributes(RealmList realmList) {
        this.rentAttributes = realmList;
    }

    public void realmSet$rentChildre(RealmList realmList) {
        this.rentChildre = realmList;
    }

    public void realmSet$renters(RealmList realmList) {
        this.renters = realmList;
    }

    public void realmSet$schemaPhoto(TalkingPhotosFile talkingPhotosFile) {
        this.schemaPhoto = talkingPhotosFile;
    }

    public void realmSet$stateRenta(StateRenta stateRenta2) {
        this.stateRenta = stateRenta2;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public TalkingInfo() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$image((RealmList) null);
        realmSet$rentAttributes((RealmList) null);
        realmSet$rentChildre((RealmList) null);
        realmSet$renters((RealmList) null);
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getAdress() {
        return realmGet$adress();
    }

    public void setAdress(String str) {
        realmSet$adress(str);
    }

    public List<TalkingPhotos> getImage() {
        return realmGet$image();
    }

    public void setImage(RealmList<TalkingPhotos> realmList) {
        realmSet$image(realmList);
    }

    public void setRentAttributes(RealmList<RentAttributes> realmList) {
        realmSet$rentAttributes(realmList);
    }

    public List<RentAttributes> getRentAttributes() {
        return realmGet$rentAttributes();
    }

    public void setStateRenta(StateRenta stateRenta2) {
        realmSet$stateRenta(stateRenta2);
    }

    public StateRenta getStateRenta() {
        return realmGet$stateRenta();
    }

    public boolean isParentIsBusy() {
        return realmGet$parentIsBusy();
    }

    public void setParentIsBusy(boolean z) {
        realmSet$parentIsBusy(z);
    }

    public RealmList<RentChildren> getRentChildre() {
        return realmGet$rentChildre();
    }

    public void setRentChildre(RealmList<RentChildren> realmList) {
        realmSet$rentChildre(realmList);
    }

    public TalkingPhotosFile getSchemaPhoto() {
        return realmGet$schemaPhoto();
    }

    public void setSchemaPhoto(TalkingPhotosFile talkingPhotosFile) {
        realmSet$schemaPhoto(talkingPhotosFile);
    }

    public RealmList<Renters> getRenters() {
        return realmGet$renters();
    }
}
