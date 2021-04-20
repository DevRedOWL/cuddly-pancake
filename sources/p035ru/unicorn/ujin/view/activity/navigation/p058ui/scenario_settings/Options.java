package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4803x4cff85e1;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options */
public class Options extends RealmObject implements Diffable<Options>, C4803x4cff85e1 {
    @SerializedName("apartment_scenario_id")
    @Expose
    private String apartmentScenarioId;
    @SerializedName("apartment_scenario_option_add")
    @Expose
    private ApartmentScenarioOptionAdd apartmentScenarioOptionAdd;
    @SerializedName("apartment_scenario_option_href")
    @Expose
    private String apartmentScenarioOptionHref;
    @SerializedName("apartment_scenario_option_href_text")
    @Expose
    private String apartmentScenarioOptionHrefText;
    @SerializedName("apartment_scenario_option_id")
    @PrimaryKey
    @Expose
    private String apartmentScenarioOptionId;
    @SerializedName("apartment_scenario_option_state")
    @Expose
    private Integer apartmentScenarioOptionState;
    @SerializedName("apartment_scenario_option_type")
    @Expose
    private String apartmentScenarioOptionType;
    private String header;
    @SerializedName("optionDescription")
    @Expose
    private String optionDescription;
    @SerializedName("optionName")
    @Expose
    private String optionName;

    public String realmGet$apartmentScenarioId() {
        return this.apartmentScenarioId;
    }

    public ApartmentScenarioOptionAdd realmGet$apartmentScenarioOptionAdd() {
        return this.apartmentScenarioOptionAdd;
    }

    public String realmGet$apartmentScenarioOptionHref() {
        return this.apartmentScenarioOptionHref;
    }

    public String realmGet$apartmentScenarioOptionHrefText() {
        return this.apartmentScenarioOptionHrefText;
    }

    public String realmGet$apartmentScenarioOptionId() {
        return this.apartmentScenarioOptionId;
    }

    public Integer realmGet$apartmentScenarioOptionState() {
        return this.apartmentScenarioOptionState;
    }

    public String realmGet$apartmentScenarioOptionType() {
        return this.apartmentScenarioOptionType;
    }

    public String realmGet$header() {
        return this.header;
    }

    public String realmGet$optionDescription() {
        return this.optionDescription;
    }

    public String realmGet$optionName() {
        return this.optionName;
    }

    public void realmSet$apartmentScenarioId(String str) {
        this.apartmentScenarioId = str;
    }

    public void realmSet$apartmentScenarioOptionAdd(ApartmentScenarioOptionAdd apartmentScenarioOptionAdd2) {
        this.apartmentScenarioOptionAdd = apartmentScenarioOptionAdd2;
    }

    public void realmSet$apartmentScenarioOptionHref(String str) {
        this.apartmentScenarioOptionHref = str;
    }

    public void realmSet$apartmentScenarioOptionHrefText(String str) {
        this.apartmentScenarioOptionHrefText = str;
    }

    public void realmSet$apartmentScenarioOptionId(String str) {
        this.apartmentScenarioOptionId = str;
    }

    public void realmSet$apartmentScenarioOptionState(Integer num) {
        this.apartmentScenarioOptionState = num;
    }

    public void realmSet$apartmentScenarioOptionType(String str) {
        this.apartmentScenarioOptionType = str;
    }

    public void realmSet$header(String str) {
        this.header = str;
    }

    public void realmSet$optionDescription(String str) {
        this.optionDescription = str;
    }

    public void realmSet$optionName(String str) {
        this.optionName = str;
    }

    public String getHeader() {
        return realmGet$header();
    }

    public Options(String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$header(str);
    }

    public Options() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getApartmentScenarioOptionId() {
        return realmGet$apartmentScenarioOptionId();
    }

    public void setApartmentScenarioOptionId(String str) {
        realmSet$apartmentScenarioOptionId(str);
    }

    public String getApartmentScenarioOptionType() {
        return realmGet$apartmentScenarioOptionType();
    }

    public void setApartmentScenarioOptionType(String str) {
        realmSet$apartmentScenarioOptionType(str);
    }

    public String getApartmentScenarioOptionHref() {
        return realmGet$apartmentScenarioOptionHref();
    }

    public void setApartmentScenarioOptionHref(String str) {
        realmSet$apartmentScenarioOptionHref(str);
    }

    public String getApartmentScenarioOptionHrefText() {
        return realmGet$apartmentScenarioOptionHrefText();
    }

    public void setApartmentScenarioOptionHrefText(String str) {
        realmSet$apartmentScenarioOptionHrefText(str);
    }

    public String getApartmentScenarioId() {
        return realmGet$apartmentScenarioId();
    }

    public void setApartmentScenarioId(String str) {
        realmSet$apartmentScenarioId(str);
    }

    public Integer getApartmentScenarioOptionState() {
        return realmGet$apartmentScenarioOptionState();
    }

    public void setApartmentScenarioOptionState(Integer num) {
        realmSet$apartmentScenarioOptionState(num);
    }

    public String getOptionName() {
        return realmGet$optionName();
    }

    public void setOptionName(String str) {
        realmSet$optionName(str);
    }

    public String getOptionDescription() {
        return realmGet$optionDescription();
    }

    public void setOptionDescription(String str) {
        realmSet$optionDescription(str);
    }

    public ApartmentScenarioOptionAdd getApartmentScenarioOptionAdd() {
        return realmGet$apartmentScenarioOptionAdd();
    }

    public void setApartmentScenarioOptionAdd(ApartmentScenarioOptionAdd apartmentScenarioOptionAdd2) {
        realmSet$apartmentScenarioOptionAdd(apartmentScenarioOptionAdd2);
    }

    public boolean areItemsTheSame(Options options) {
        if (options.getApartmentScenarioOptionType() != null) {
            return realmGet$apartmentScenarioId().equals(options.getApartmentScenarioId());
        }
        if (realmGet$apartmentScenarioOptionAdd() != null) {
            return realmGet$apartmentScenarioOptionAdd().getTemperature().equals(options.realmGet$apartmentScenarioOptionAdd().getTemperature());
        }
        return true;
    }

    public boolean areContentsTheSame(Options options) {
        return realmGet$apartmentScenarioOptionState() == options.getApartmentScenarioOptionState();
    }
}
