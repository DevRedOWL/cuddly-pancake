package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmList;
import p046io.realm.annotations.Ignore;
import p046io.realm.annotations.PrimaryKey;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceFields */
public class ServiceFields implements Diffable<ServiceFields> {
    @SerializedName("default_value")
    @Expose
    private String defaultValue;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    String f6771id;
    @SerializedName("items")
    @Expose
    private RealmList<ServiceFieldItems> items = null;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("readonly")
    @Expose
    private Boolean readonly;
    @SerializedName("required")
    @Expose
    private Boolean required;
    @Ignore
    private boolean showError = false;
    @SerializedName("type")
    @Expose
    private String type;
    @Ignore
    private String value;

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean bool) {
        this.required = bool;
    }

    public Boolean getReadonly() {
        return this.readonly;
    }

    public void setReadonly(Boolean bool) {
        this.readonly = bool;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public RealmList<ServiceFieldItems> getItems() {
        return this.items;
    }

    public void setItems(RealmList<ServiceFieldItems> realmList) {
        this.items = realmList;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public boolean areItemsTheSame(ServiceFields serviceFields) {
        return this.label.equals(serviceFields.label);
    }

    public boolean areContentsTheSame(ServiceFields serviceFields) {
        if (this.value != null && serviceFields.getValue() != null) {
            return this.value.equals(serviceFields.getValue());
        }
        if (this.defaultValue == null || serviceFields.getDefaultValue() == null) {
            return false;
        }
        return this.defaultValue.equals(serviceFields.getDefaultValue());
    }

    public boolean hasSelector() {
        return this.items != null;
    }

    public boolean isShowError() {
        return this.showError;
    }

    public void setShowError(boolean z) {
        this.showError = z;
    }

    public String getId() {
        return this.f6771id;
    }

    public void setId(String str) {
        this.f6771id = str;
    }
}
