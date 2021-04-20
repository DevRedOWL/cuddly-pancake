package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4699x47c0640f;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceTariff */
public class DomServiceTariff extends RealmObject implements Diffable<DomServiceTariff>, C4699x47c0640f {
    @SerializedName("connected_dt")
    @Expose
    private Integer connectedDt;
    @SerializedName("description1")
    @Expose
    private String description1;
    @SerializedName("description2")
    @Expose
    private String description2;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("indicators")
    @Expose
    private RealmList<DomServiceIndicator> indicators;
    @SerializedName("is_available")
    @Expose
    private Boolean isAvailable;
    @SerializedName("is_current")
    @Expose
    private Boolean isCurrent;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("tariff_id")
    @Expose
    private String tariffId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("url_frame")
    @Expose
    private String urlFrame;

    public Integer realmGet$connectedDt() {
        return this.connectedDt;
    }

    public String realmGet$description1() {
        return this.description1;
    }

    public String realmGet$description2() {
        return this.description2;
    }

    public String realmGet$image() {
        return this.image;
    }

    public RealmList realmGet$indicators() {
        return this.indicators;
    }

    public Boolean realmGet$isAvailable() {
        return this.isAvailable;
    }

    public Boolean realmGet$isCurrent() {
        return this.isCurrent;
    }

    public Integer realmGet$price() {
        return this.price;
    }

    public String realmGet$tariffId() {
        return this.tariffId;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$unit() {
        return this.unit;
    }

    public String realmGet$url() {
        return this.url;
    }

    public String realmGet$urlFrame() {
        return this.urlFrame;
    }

    public void realmSet$connectedDt(Integer num) {
        this.connectedDt = num;
    }

    public void realmSet$description1(String str) {
        this.description1 = str;
    }

    public void realmSet$description2(String str) {
        this.description2 = str;
    }

    public void realmSet$image(String str) {
        this.image = str;
    }

    public void realmSet$indicators(RealmList realmList) {
        this.indicators = realmList;
    }

    public void realmSet$isAvailable(Boolean bool) {
        this.isAvailable = bool;
    }

    public void realmSet$isCurrent(Boolean bool) {
        this.isCurrent = bool;
    }

    public void realmSet$price(Integer num) {
        this.price = num;
    }

    public void realmSet$tariffId(String str) {
        this.tariffId = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$unit(String str) {
        this.unit = str;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public void realmSet$urlFrame(String str) {
        this.urlFrame = str;
    }

    public DomServiceTariff() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$indicators((RealmList) null);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getTariffId() {
        return realmGet$tariffId();
    }

    public void setTariffId(String str) {
        realmSet$tariffId(str);
    }

    public String getDescription1() {
        return realmGet$description1();
    }

    public void setDescription1(String str) {
        realmSet$description1(str);
    }

    public String getDescription2() {
        return realmGet$description2();
    }

    public void setDescription2(String str) {
        realmSet$description2(str);
    }

    public String getImage() {
        return realmGet$image();
    }

    public void setImage(String str) {
        realmSet$image(str);
    }

    public Integer getPrice() {
        return realmGet$price();
    }

    public void setPrice(Integer num) {
        realmSet$price(num);
    }

    public String getUnit() {
        return realmGet$unit();
    }

    public void setUnit(String str) {
        realmSet$unit(str);
    }

    public Boolean getCurrent() {
        return realmGet$isCurrent();
    }

    public void setCurrent(Boolean bool) {
        realmSet$isCurrent(bool);
    }

    public Boolean getAvailable() {
        return realmGet$isAvailable();
    }

    public void setAvailable(Boolean bool) {
        realmSet$isAvailable(bool);
    }

    public String getUrl() {
        return realmGet$url();
    }

    public void setUrl(String str) {
        realmSet$url(str);
    }

    public String getUrlFrame() {
        return realmGet$urlFrame();
    }

    public void setUrlFrame(String str) {
        realmSet$urlFrame(str);
    }

    public RealmList<DomServiceIndicator> getIndicators() {
        return realmGet$indicators();
    }

    public void setIndicators(RealmList<DomServiceIndicator> realmList) {
        realmSet$indicators(realmList);
    }

    public Integer getConnectedDt() {
        return realmGet$connectedDt();
    }

    public void setConnectedDt(Integer num) {
        realmSet$connectedDt(num);
    }

    public boolean areItemsTheSame(DomServiceTariff domServiceTariff) {
        return realmGet$tariffId().equals(domServiceTariff.realmGet$tariffId());
    }

    public boolean areContentsTheSame(DomServiceTariff domServiceTariff) {
        return realmGet$tariffId().equals(domServiceTariff.realmGet$tariffId());
    }
}
