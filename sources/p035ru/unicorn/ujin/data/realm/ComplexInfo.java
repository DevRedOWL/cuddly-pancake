package p035ru.unicorn.ujin.data.realm;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.annotations.RealmClass;
import p046io.realm.annotations.Required;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface;

@RealmClass
/* renamed from: ru.unicorn.ujin.data.realm.ComplexInfo */
public class ComplexInfo implements RealmModel, ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface {
    @SerializedName("action")
    private Action action;
    @SerializedName("build_progress")
    private Double buildProgress;
    @SerializedName("date_end")
    private String dateEnd;
    @SerializedName("dateEnd")
    private String deliveryDate;
    @SerializedName("demo_flat_uid")
    private String demoFlatUid;
    private String description;
    @SerializedName("description_more")
    private String descriptionMore;
    @PrimaryKey

    /* renamed from: id */
    private String f6644id;
    @SerializedName("img")
    private RealmList<String> imageList;
    private RealmList<byte[]> imageListBytes;
    @SerializedName("ipoteka")
    @Nullable
    private RealmList<Mortrage> mortrageList;
    @SerializedName("presentation_link")
    private String presentationLink;
    @SerializedName("price")
    private RealmList<Price> priceList;
    @SerializedName("complex_schema_link")
    private String schemaLink;
    @SerializedName("has_smart_house")
    private Boolean showDemo;
    @SerializedName("site")
    private String site;
    @Required
    private String title;
    private String uid;

    public Action realmGet$action() {
        return this.action;
    }

    public Double realmGet$buildProgress() {
        return this.buildProgress;
    }

    public String realmGet$dateEnd() {
        return this.dateEnd;
    }

    public String realmGet$deliveryDate() {
        return this.deliveryDate;
    }

    public String realmGet$demoFlatUid() {
        return this.demoFlatUid;
    }

    public String realmGet$description() {
        return this.description;
    }

    public String realmGet$descriptionMore() {
        return this.descriptionMore;
    }

    public String realmGet$id() {
        return this.f6644id;
    }

    public RealmList realmGet$imageList() {
        return this.imageList;
    }

    public RealmList realmGet$imageListBytes() {
        return this.imageListBytes;
    }

    public RealmList realmGet$mortrageList() {
        return this.mortrageList;
    }

    public String realmGet$presentationLink() {
        return this.presentationLink;
    }

    public RealmList realmGet$priceList() {
        return this.priceList;
    }

    public String realmGet$schemaLink() {
        return this.schemaLink;
    }

    public Boolean realmGet$showDemo() {
        return this.showDemo;
    }

    public String realmGet$site() {
        return this.site;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$uid() {
        return this.uid;
    }

    public void realmSet$action(Action action2) {
        this.action = action2;
    }

    public void realmSet$buildProgress(Double d) {
        this.buildProgress = d;
    }

    public void realmSet$dateEnd(String str) {
        this.dateEnd = str;
    }

    public void realmSet$deliveryDate(String str) {
        this.deliveryDate = str;
    }

    public void realmSet$demoFlatUid(String str) {
        this.demoFlatUid = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$descriptionMore(String str) {
        this.descriptionMore = str;
    }

    public void realmSet$id(String str) {
        this.f6644id = str;
    }

    public void realmSet$imageList(RealmList realmList) {
        this.imageList = realmList;
    }

    public void realmSet$imageListBytes(RealmList realmList) {
        this.imageListBytes = realmList;
    }

    public void realmSet$mortrageList(RealmList realmList) {
        this.mortrageList = realmList;
    }

    public void realmSet$presentationLink(String str) {
        this.presentationLink = str;
    }

    public void realmSet$priceList(RealmList realmList) {
        this.priceList = realmList;
    }

    public void realmSet$schemaLink(String str) {
        this.schemaLink = str;
    }

    public void realmSet$showDemo(Boolean bool) {
        this.showDemo = bool;
    }

    public void realmSet$site(String str) {
        this.site = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$uid(String str) {
        this.uid = str;
    }

    public ComplexInfo() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getSite() {
        return realmGet$site();
    }

    public void setSite(String str) {
        realmSet$site(str);
    }

    public Boolean getShowDemo() {
        return Boolean.valueOf(realmGet$showDemo() == null ? false : realmGet$showDemo().booleanValue());
    }

    public void setShowDemo(Boolean bool) {
        realmSet$showDemo(bool);
    }

    public String getDateEnd() {
        return realmGet$dateEnd();
    }

    public void setDateEnd(String str) {
        realmSet$dateEnd(str);
    }

    public String getDemoFlatUid() {
        return realmGet$demoFlatUid() == null ? "fa698dab-bea6-e811-80cc-005056011830" : realmGet$demoFlatUid();
    }

    public void setDemoFlatUid(String str) {
        realmSet$demoFlatUid(str);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getUid() {
        return realmGet$uid();
    }

    public void setUid(String str) {
        realmSet$uid(str);
    }

    public String getTitle() {
        return (String) StringUtils.defaultIfEmpty(realmGet$title(), "");
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public RealmList<Price> getPriceList() {
        return CollectionUtils.isEmpty(realmGet$priceList()) ? new RealmList<>() : realmGet$priceList();
    }

    public void setPriceList(RealmList<Price> realmList) {
        realmSet$priceList(realmList);
    }

    public RealmList<Mortrage> getMortrageList() {
        return CollectionUtils.isEmpty(realmGet$mortrageList()) ? new RealmList<>() : realmGet$mortrageList();
    }

    public void setMortrageList(RealmList<Mortrage> realmList) {
        realmSet$mortrageList(realmList);
    }

    public Double getBuildProgress() {
        return Double.valueOf(realmGet$buildProgress() == null ? Utils.DOUBLE_EPSILON : realmGet$buildProgress().doubleValue());
    }

    public void setBuildProgress(Double d) {
        realmSet$buildProgress(d);
    }

    public RealmList<String> getImageList() {
        return CollectionUtils.isEmpty(realmGet$imageList()) ? new RealmList<>() : realmGet$imageList();
    }

    public void setImageList(RealmList<String> realmList) {
        realmSet$imageList(realmList);
    }

    public String getDeliveryDate() {
        return (String) StringUtils.defaultIfEmpty(realmGet$deliveryDate(), "");
    }

    public void setDeliveryDate(String str) {
        realmSet$deliveryDate(str);
    }

    public String getDescription() {
        return (String) StringUtils.defaultIfEmpty(realmGet$description(), "");
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public String getDescriptionMore() {
        return (String) StringUtils.defaultIfEmpty(realmGet$descriptionMore(), "");
    }

    public void setDescriptionMore(String str) {
        realmSet$descriptionMore(str);
    }

    public Action getAction() {
        return realmGet$action() == null ? new Action() : realmGet$action();
    }

    public void setAction(Action action2) {
        realmSet$action(action2);
    }

    public RealmList<byte[]> getImageListBytes() {
        return realmGet$imageListBytes();
    }

    public void setImageListBytes(RealmList<byte[]> realmList) {
        realmSet$imageListBytes(realmList);
    }

    public String getPresentationLink() {
        return realmGet$presentationLink();
    }

    public String getSchemaLink() {
        return realmGet$schemaLink();
    }

    /* renamed from: ru.unicorn.ujin.data.realm.ComplexInfo$Fields */
    public class Fields {

        /* renamed from: id */
        public static final String f6645id = "id";

        public Fields() {
        }
    }
}
