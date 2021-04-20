package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.github.mikephil.charting.utils.Utils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.annotations.Ignore;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.MeasuresData */
public class MeasuresData implements Diffable<MeasuresData> {
    @SerializedName("counterStatus")
    @Expose
    private Boolean counterStatus;
    @Ignore
    private Double currentValue = Double.valueOf(-1.0d);
    @SerializedName("currentValueCounter")
    @Expose
    private Double currentValueCounter;
    @SerializedName("lastDateCurrentValue")
    @Expose
    private String lastDateCurrentValue;
    private Double lastValueCounter;
    @SerializedName("serialNumber")
    @Expose
    private String serialNumber;
    @SerializedName("signal_id")
    @Expose
    private String signalId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("totalLastMonth")
    @Expose
    private Double totalLastMonth;
    @SerializedName("unitName")
    @Expose
    private String unitName;

    public boolean areContentsTheSame(MeasuresData measuresData) {
        return true;
    }

    public MeasuresData cloneForSending() {
        MeasuresData measuresData = new MeasuresData();
        measuresData.serialNumber = this.serialNumber;
        measuresData.counterStatus = this.counterStatus;
        measuresData.unitName = this.unitName;
        measuresData.title = this.title;
        measuresData.signalId = this.signalId;
        measuresData.currentValueCounter = Double.valueOf(Utils.DOUBLE_EPSILON);
        measuresData.lastValueCounter = this.currentValueCounter;
        measuresData.lastDateCurrentValue = this.lastDateCurrentValue;
        measuresData.totalLastMonth = this.totalLastMonth;
        measuresData.currentValue = this.currentValue;
        return measuresData;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String str) {
        this.serialNumber = str;
    }

    public Boolean getCounterStatus() {
        return this.counterStatus;
    }

    public void setCounterStatus(Boolean bool) {
        this.counterStatus = bool;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String str) {
        this.unitName = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getSignalId() {
        return this.signalId;
    }

    public void setSignalId(String str) {
        this.signalId = str;
    }

    public Double getCurrentValueCounter() {
        return this.currentValueCounter;
    }

    public void setCurrentValueCounter(Double d) {
        this.currentValueCounter = d;
    }

    public String getLastDateCurrentValue() {
        return this.lastDateCurrentValue;
    }

    public void setLastDateCurrentValue(String str) {
        this.lastDateCurrentValue = str;
    }

    public Double getTotalLastMonth() {
        return this.totalLastMonth;
    }

    public void setTotalLastMonth(Double d) {
        this.totalLastMonth = d;
    }

    public boolean areItemsTheSame(MeasuresData measuresData) {
        return this.serialNumber.equals(measuresData.serialNumber);
    }

    public Double getCurrentValue() {
        return this.currentValue;
    }

    public void setCurrentValue(Double d) {
        this.currentValue = d;
    }

    public Double getLastValueCounter() {
        return this.lastValueCounter;
    }

    public void setLastValueCounter(Double d) {
        this.lastValueCounter = d;
    }
}
