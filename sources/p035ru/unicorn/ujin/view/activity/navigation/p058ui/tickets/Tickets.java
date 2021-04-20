package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.BooleanUtils;
import p046io.realm.annotations.PrimaryKey;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.Tickets */
public class Tickets {
    @SerializedName("account_number")
    @Expose
    private String accountNumber;
    @SerializedName("balance")
    @Expose
    private String balance;
    @SerializedName("company_title")
    @Expose
    private String companyTitle;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private int f6884id;
    @SerializedName("payment_available")
    @Expose
    private Boolean paymentAvailable;
    @SerializedName("service_title")
    @Expose
    private String serviceTitle;

    public String getServiceTitle() {
        return this.serviceTitle;
    }

    public void setServiceTitle(String str) {
        this.serviceTitle = str;
    }

    public int getId() {
        return this.f6884id;
    }

    public void setId(int i) {
        this.f6884id = i;
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

    public Boolean getPaymentAvailable() {
        return Boolean.valueOf(BooleanUtils.toBooleanDefaultIfNull(this.paymentAvailable, false));
    }

    public void setPaymentAvailable(Boolean bool) {
        this.paymentAvailable = bool;
    }

    public String getBalance() {
        return this.balance;
    }
}
