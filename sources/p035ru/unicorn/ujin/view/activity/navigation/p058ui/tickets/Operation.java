package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import com.github.mikephil.charting.utils.Utils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.Operation */
public class Operation {
    @SerializedName("account_number")
    @Expose
    private String accountNumber;
    @SerializedName("balance")
    @Expose
    private Double balance;
    @SerializedName("company_title")
    @Expose
    private String companyTitle;
    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f6876id;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("sum")
    @Expose
    private Double sum;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("document")
    @Expose
    private String urlOnDoc;

    public String getId() {
        return this.f6876id;
    }

    public void setId(String str) {
        this.f6876id = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Integer getDate() {
        return this.date;
    }

    public void setDate(Integer num) {
        this.date = num;
    }

    public Double getSum() {
        Double d = this.sum;
        return Double.valueOf(d == null ? Utils.DOUBLE_EPSILON : d.doubleValue());
    }

    public void setSum(Double d) {
        this.sum = d;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double d) {
        this.balance = d;
    }

    public String getCompanyTitle() {
        return this.companyTitle;
    }

    public void setCompanyTitle(String str) {
        this.companyTitle = str;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public String getUrlOnDoc() {
        return this.urlOnDoc;
    }

    public void setUrlOnDoc(String str) {
        this.urlOnDoc = str;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }
}
