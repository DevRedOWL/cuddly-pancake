package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import com.google.gson.annotations.SerializedName;
import javax.annotation.Nullable;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4669x6b662644;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema */
public class Schema extends RealmObject implements Diffable<Schema>, C4669x6b662644 {
    public static final String CALL = "call";
    public static final String CALL_METHOD = "call_method";
    public static final String CUSTOM = "custom";
    public static final String DIALOG = "dialogue";
    public static final String EMAIL = "email";
    public static final String EMPTY = "empty";
    public static final String WEB = "web";
    @SerializedName("action")
    private String action;
    @SerializedName("action_value")
    private String actionValue;
    @SerializedName("alert_message")
    @Nullable
    private String alertMessage;
    @SerializedName("description")
    private String description;
    @SerializedName("buttons")
    private RealmList<DialogButtons> dialogButtons;
    @SerializedName("domru_category_name")
    @Nullable
    private String domRuId;
    @SerializedName("guard")
    private Guard guard;
    @SerializedName("icon_url")
    private String iconUrl;
    @SerializedName("id")
    @PrimaryKey

    /* renamed from: id */
    private Integer f6727id;
    @SerializedName("is_active")
    private Boolean isActive;
    @SerializedName("min_version")
    private MinVersion minVersion;
    @SerializedName("product_state")
    private String productState;
    @SerializedName("provider")
    private String provider;
    @SerializedName("provider_icon")
    private String providerIconUrl;
    @SerializedName("callback")
    private SchemaCallback schemaCallback;
    @SerializedName("section_id")
    private String sectionId;
    @SerializedName("section_slug")
    private String sectionSlug;
    @SerializedName("section_title")
    private String sectionTitle;
    @SerializedName("service_id")
    private Integer serviceId;
    @SerializedName("services")
    private Services services;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;

    public String realmGet$action() {
        return this.action;
    }

    public String realmGet$actionValue() {
        return this.actionValue;
    }

    public String realmGet$alertMessage() {
        return this.alertMessage;
    }

    public String realmGet$description() {
        return this.description;
    }

    public RealmList realmGet$dialogButtons() {
        return this.dialogButtons;
    }

    public String realmGet$domRuId() {
        return this.domRuId;
    }

    public Guard realmGet$guard() {
        return this.guard;
    }

    public String realmGet$iconUrl() {
        return this.iconUrl;
    }

    public Integer realmGet$id() {
        return this.f6727id;
    }

    public Boolean realmGet$isActive() {
        return this.isActive;
    }

    public MinVersion realmGet$minVersion() {
        return this.minVersion;
    }

    public String realmGet$productState() {
        return this.productState;
    }

    public String realmGet$provider() {
        return this.provider;
    }

    public String realmGet$providerIconUrl() {
        return this.providerIconUrl;
    }

    public SchemaCallback realmGet$schemaCallback() {
        return this.schemaCallback;
    }

    public String realmGet$sectionId() {
        return this.sectionId;
    }

    public String realmGet$sectionSlug() {
        return this.sectionSlug;
    }

    public String realmGet$sectionTitle() {
        return this.sectionTitle;
    }

    public Integer realmGet$serviceId() {
        return this.serviceId;
    }

    public Services realmGet$services() {
        return this.services;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$action(String str) {
        this.action = str;
    }

    public void realmSet$actionValue(String str) {
        this.actionValue = str;
    }

    public void realmSet$alertMessage(String str) {
        this.alertMessage = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$dialogButtons(RealmList realmList) {
        this.dialogButtons = realmList;
    }

    public void realmSet$domRuId(String str) {
        this.domRuId = str;
    }

    public void realmSet$guard(Guard guard2) {
        this.guard = guard2;
    }

    public void realmSet$iconUrl(String str) {
        this.iconUrl = str;
    }

    public void realmSet$id(Integer num) {
        this.f6727id = num;
    }

    public void realmSet$isActive(Boolean bool) {
        this.isActive = bool;
    }

    public void realmSet$minVersion(MinVersion minVersion2) {
        this.minVersion = minVersion2;
    }

    public void realmSet$productState(String str) {
        this.productState = str;
    }

    public void realmSet$provider(String str) {
        this.provider = str;
    }

    public void realmSet$providerIconUrl(String str) {
        this.providerIconUrl = str;
    }

    public void realmSet$schemaCallback(SchemaCallback schemaCallback2) {
        this.schemaCallback = schemaCallback2;
    }

    public void realmSet$sectionId(String str) {
        this.sectionId = str;
    }

    public void realmSet$sectionSlug(String str) {
        this.sectionSlug = str;
    }

    public void realmSet$sectionTitle(String str) {
        this.sectionTitle = str;
    }

    public void realmSet$serviceId(Integer num) {
        this.serviceId = num;
    }

    public void realmSet$services(Services services2) {
        this.services = services2;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public Schema() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList<DialogButtons> getDialogButtons() {
        return realmGet$dialogButtons();
    }

    public Guard getGuard() {
        return realmGet$guard();
    }

    public void setGuard(Guard guard2) {
        realmSet$guard(guard2);
    }

    public Services getServices() {
        return realmGet$services();
    }

    public void setServices(Services services2) {
        realmSet$services(services2);
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
    }

    public String getAction() {
        return realmGet$action();
    }

    public void setAction(String str) {
        realmSet$action(str);
    }

    public String getActionValue() {
        return realmGet$actionValue();
    }

    public void setActionValue(String str) {
        realmSet$actionValue(str);
    }

    public String getIconUrl() {
        return realmGet$iconUrl();
    }

    public void setIconUrl(String str) {
        realmSet$iconUrl(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getDescription() {
        return realmGet$description();
    }

    @Nullable
    public String getAlertMessage() {
        return realmGet$alertMessage();
    }

    @Nullable
    public String getDomRuId() {
        return realmGet$domRuId();
    }

    public void setDomRuId(@Nullable String str) {
        realmSet$domRuId(str);
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public boolean areItemsTheSame(Schema schema) {
        return realmGet$id().equals(schema.getId());
    }

    public boolean areContentsTheSame(Schema schema) {
        return realmGet$title().equals(schema.realmGet$title());
    }

    public MinVersion getMinVersion() {
        return realmGet$minVersion();
    }

    public void setMinVersion(MinVersion minVersion2) {
        realmSet$minVersion(minVersion2);
    }

    public SchemaCallback getSchemaCallback() {
        return realmGet$schemaCallback();
    }

    public String getProviderIconUrl() {
        return realmGet$providerIconUrl();
    }

    public String getProvider() {
        return realmGet$provider();
    }

    public String getProductState() {
        return realmGet$productState();
    }

    public Integer getServiceId() {
        return realmGet$serviceId();
    }

    public String getSectionId() {
        return realmGet$sectionId();
    }

    public String getSectionSlug() {
        return realmGet$sectionSlug();
    }

    public String getSectionTitle() {
        return realmGet$sectionTitle();
    }

    public String getUrl() {
        return realmGet$url();
    }

    public Boolean getIsActive() {
        return Boolean.valueOf(realmGet$isActive() == null ? false : realmGet$isActive().booleanValue());
    }
}
