package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4807xe35bc3c2;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetail */
public class TicketDetail extends RealmObject implements C4807xe35bc3c2 {
    @SerializedName("date_title")
    @Expose
    private String dateTitle;
    @SerializedName("details")
    @Expose
    private RealmList<TicketDescription> descriptions;
    @SerializedName("measure")
    @Expose
    private String measure;
    @SerializedName("paid")
    @Expose
    private Integer paid;
    @SerializedName("receipts_number")
    @Expose
    private String receiptsNumber;
    @SerializedName("sum")
    @Expose
    private Double sum;

    public String realmGet$dateTitle() {
        return this.dateTitle;
    }

    public RealmList realmGet$descriptions() {
        return this.descriptions;
    }

    public String realmGet$measure() {
        return this.measure;
    }

    public Integer realmGet$paid() {
        return this.paid;
    }

    public String realmGet$receiptsNumber() {
        return this.receiptsNumber;
    }

    public Double realmGet$sum() {
        return this.sum;
    }

    public void realmSet$dateTitle(String str) {
        this.dateTitle = str;
    }

    public void realmSet$descriptions(RealmList realmList) {
        this.descriptions = realmList;
    }

    public void realmSet$measure(String str) {
        this.measure = str;
    }

    public void realmSet$paid(Integer num) {
        this.paid = num;
    }

    public void realmSet$receiptsNumber(String str) {
        this.receiptsNumber = str;
    }

    public void realmSet$sum(Double d) {
        this.sum = d;
    }

    public TicketDetail() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getReceiptsNumber() {
        return realmGet$receiptsNumber();
    }

    public void setReceiptsNumber(String str) {
        realmSet$receiptsNumber(str);
    }

    public Integer getPaid() {
        return realmGet$paid();
    }

    public void setPaid(Integer num) {
        realmSet$paid(num);
    }

    public String getDateTitle() {
        return realmGet$dateTitle();
    }

    public void setDateTitle(String str) {
        realmSet$dateTitle(str);
    }

    public RealmList<TicketDescription> getDescriptions() {
        return realmGet$descriptions();
    }

    public void setDescriptions(RealmList<TicketDescription> realmList) {
        realmSet$descriptions(realmList);
    }

    public Double getSum() {
        return realmGet$sum();
    }

    public void setSum(Double d) {
        realmSet$sum(d);
    }

    public String getMeasure() {
        return realmGet$measure();
    }

    public void setMeasure(String str) {
        realmSet$measure(str);
    }
}
