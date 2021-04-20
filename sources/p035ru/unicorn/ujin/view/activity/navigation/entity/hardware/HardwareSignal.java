package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.ListControlType;
import p046io.realm.C4645x6a0de1c;
import p046io.realm.RealmObject;
import p046io.realm.annotations.Ignore;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal */
public class HardwareSignal extends RealmObject implements Diffable<HardwareSignal>, C4645x6a0de1c {
    @SerializedName("counter_max")
    @Expose
    private Integer counterMax;
    @SerializedName("counter_min")
    @Expose
    private Integer counterMin;
    @SerializedName("dt")
    @Expose

    /* renamed from: dt */
    private String f6718dt;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f6719id;
    @Ignore
    @SerializedName("list")
    @Expose
    @Nullable
    private List<ListControlType> listControlTypes;
    @SerializedName("measure")
    @Expose
    private String measure;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("readonly_label")
    @Expose
    private Integer readonlyLabel;
    @SerializedName("readonly_value")
    @Expose
    private Integer readonlyValue;
    @SerializedName("show_small_window")
    @Expose
    private String showSmallWindow;
    @SerializedName("signal_id")
    @Expose
    private String signalId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type_control")
    @Expose
    private String typeControl;
    @SerializedName("value")
    @Expose
    private String value;

    public Integer realmGet$counterMax() {
        return this.counterMax;
    }

    public Integer realmGet$counterMin() {
        return this.counterMin;
    }

    public String realmGet$dt() {
        return this.f6718dt;
    }

    public String realmGet$id() {
        return this.f6719id;
    }

    public String realmGet$measure() {
        return this.measure;
    }

    public String realmGet$name() {
        return this.name;
    }

    public Integer realmGet$readonlyLabel() {
        return this.readonlyLabel;
    }

    public Integer realmGet$readonlyValue() {
        return this.readonlyValue;
    }

    public String realmGet$showSmallWindow() {
        return this.showSmallWindow;
    }

    public String realmGet$signalId() {
        return this.signalId;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$typeControl() {
        return this.typeControl;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$counterMax(Integer num) {
        this.counterMax = num;
    }

    public void realmSet$counterMin(Integer num) {
        this.counterMin = num;
    }

    public void realmSet$dt(String str) {
        this.f6718dt = str;
    }

    public void realmSet$id(String str) {
        this.f6719id = str;
    }

    public void realmSet$measure(String str) {
        this.measure = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$readonlyLabel(Integer num) {
        this.readonlyLabel = num;
    }

    public void realmSet$readonlyValue(Integer num) {
        this.readonlyValue = num;
    }

    public void realmSet$showSmallWindow(String str) {
        this.showSmallWindow = str;
    }

    public void realmSet$signalId(String str) {
        this.signalId = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$typeControl(String str) {
        this.typeControl = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    public HardwareSignal() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    @Nullable
    public List<ListControlType> getListControlTypes() {
        return this.listControlTypes;
    }

    public void setListControlTypes(@Nullable List<ListControlType> list) {
        this.listControlTypes = list;
    }

    public boolean areItemsTheSame(HardwareSignal hardwareSignal) {
        return realmGet$id().equals(hardwareSignal.realmGet$id()) && realmGet$name().equals(hardwareSignal.realmGet$name());
    }

    public boolean areContentsTheSame(HardwareSignal hardwareSignal) {
        return realmGet$title() != null && hardwareSignal.getTitle() != null && realmGet$title().equals(hardwareSignal.getTitle()) && realmGet$id().equals(hardwareSignal.realmGet$id()) && realmGet$value().equals(hardwareSignal.realmGet$value());
    }

    public Integer getCounterMin() {
        return realmGet$counterMin();
    }

    public void setCounterMin(Integer num) {
        realmSet$counterMin(num);
    }

    public Integer getCounterMax() {
        return realmGet$counterMax();
    }

    public void setCounterMax(Integer num) {
        realmSet$counterMax(num);
    }

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getShowSmallWindow() {
        return realmGet$showSmallWindow();
    }

    public void setShowSmallWindow(String str) {
        realmSet$showSmallWindow(str);
    }

    public String getValue() {
        return realmGet$value();
    }

    public void setValue(String str) {
        realmSet$value(str);
    }

    public String getDt() {
        return realmGet$dt();
    }

    public void setDt(String str) {
        realmSet$dt(str);
    }

    public String getMeasure() {
        return realmGet$measure();
    }

    public void setMeasure(String str) {
        realmSet$measure(str);
    }

    public String getTypeControl() {
        return realmGet$typeControl();
    }

    public void setTypeControl(String str) {
        realmSet$typeControl(str);
    }

    public Integer getReadonlyLabel() {
        return realmGet$readonlyLabel();
    }

    public void setReadonlyLabel(Integer num) {
        realmSet$readonlyLabel(num);
    }

    public Integer getReadonlyValue() {
        return realmGet$readonlyValue();
    }

    public void setReadonlyValue(Integer num) {
        realmSet$readonlyValue(num);
    }

    public String getSignalId() {
        return realmGet$signalId();
    }

    public void setSignalId(String str) {
        realmSet$signalId(str);
    }
}
