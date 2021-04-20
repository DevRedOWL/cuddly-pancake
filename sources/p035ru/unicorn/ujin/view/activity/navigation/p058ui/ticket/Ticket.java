package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4809xc44aae93;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.Ticket */
public class Ticket extends RealmObject implements Diffable<Ticket>, C4809xc44aae93 {
    @SerializedName("account")
    @Expose
    private Integer account;
    @SerializedName("date_title")
    @Expose
    private String dateTitle;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f6866id;
    @SerializedName("measure")
    @Expose
    private String measure;
    @SerializedName("paid")
    @Expose
    private Integer paid;
    @SerializedName("sum")
    @Expose
    private Double sum;

    public boolean areContentsTheSame(Ticket ticket) {
        return true;
    }

    public boolean areItemsTheSame(Ticket ticket) {
        return true;
    }

    public Integer realmGet$account() {
        return this.account;
    }

    public String realmGet$dateTitle() {
        return this.dateTitle;
    }

    public String realmGet$id() {
        return this.f6866id;
    }

    public String realmGet$measure() {
        return this.measure;
    }

    public Integer realmGet$paid() {
        return this.paid;
    }

    public Double realmGet$sum() {
        return this.sum;
    }

    public void realmSet$account(Integer num) {
        this.account = num;
    }

    public void realmSet$dateTitle(String str) {
        this.dateTitle = str;
    }

    public void realmSet$id(String str) {
        this.f6866id = str;
    }

    public void realmSet$measure(String str) {
        this.measure = str;
    }

    public void realmSet$paid(Integer num) {
        this.paid = num;
    }

    public void realmSet$sum(Double d) {
        this.sum = d;
    }

    public Ticket() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getDateTitle() {
        return realmGet$dateTitle();
    }

    public void setDateTitle(String str) {
        realmSet$dateTitle(str);
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

    public Integer getPaid() {
        return realmGet$paid();
    }

    public void setPaid(Integer num) {
        realmSet$paid(num);
    }

    public Integer getAccount() {
        return realmGet$account();
    }

    public void setAccount(Integer num) {
        realmSet$account(num);
    }
}
