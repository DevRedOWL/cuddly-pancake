package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.Lines */
public class Lines {
    @SerializedName("counterStatus")
    @Expose
    private String counterStatus;
    @SerializedName("counterStatusColor")
    @Expose
    private String counterStatusColor;
    @SerializedName("currentValueCounter")
    @Expose
    private String currentValueCounter;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("lineColor")
    @Expose
    private String lineColor;
    @SerializedName("signal_id")
    @Expose
    private String signalId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("totalSum")
    @Expose
    private Double totalSum;
    @SerializedName("unitName")
    @Expose
    private String unitName;

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

    public String getCurrentValueCounter() {
        return this.currentValueCounter;
    }

    public void setCurrentValueCounter(String str) {
        this.currentValueCounter = str;
    }

    public String getLineColor() {
        return this.lineColor;
    }

    public void setLineColor(String str) {
        this.lineColor = str;
    }

    public Double getTotalSum() {
        return this.totalSum;
    }

    public void setTotalSum(Double d) {
        this.totalSum = d;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String str) {
        this.unitName = str;
    }

    public String getCounterStatus() {
        return this.counterStatus;
    }

    public void setCounterStatus(String str) {
        this.counterStatus = str;
    }

    public String getCounterStatusColor() {
        return this.counterStatusColor;
    }

    public void setCounterStatusColor(String str) {
        this.counterStatusColor = str;
    }

    public List<Datum> getData() {
        return this.data;
    }

    public void setData(List<Datum> list) {
        this.data = list;
    }
}
