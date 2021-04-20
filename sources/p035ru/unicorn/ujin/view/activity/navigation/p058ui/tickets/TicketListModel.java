package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import com.github.mikephil.charting.utils.Utils;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketListModel */
public class TicketListModel implements Diffable<TicketListModel> {
    private int accountId;
    private Double balance;
    private String date;

    /* renamed from: id */
    private String f6883id;
    private Double lastSum;
    private String measures;
    private String state;
    private String status;
    private String title;
    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public Double getLastSum() {
        return this.lastSum;
    }

    public void setLastSum(Double d) {
        this.lastSum = d;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double d) {
        this.balance = d;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getMeasures() {
        return this.measures;
    }

    public void setMeasures(String str) {
        this.measures = str;
    }

    public boolean isNegativeBalance() {
        return this.balance.doubleValue() < Utils.DOUBLE_EPSILON;
    }

    public TicketListModel(AccountTicket accountTicket, Operation operation) {
        this.f6883id = operation.getId();
        this.accountId = accountTicket.getId();
        this.title = accountTicket.getCompanyTitle();
        this.lastSum = operation.getSum();
        this.balance = operation.getBalance();
        this.date = DateUtils.formatDate(Long.valueOf(((long) operation.getDate().intValue()) * 1000));
        this.type = operation.getType();
        this.state = operation.getState();
    }

    public String getId() {
        return this.f6883id;
    }

    public void setId(String str) {
        this.f6883id = str;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountId(int i) {
        this.accountId = i;
    }

    public boolean areItemsTheSame(TicketListModel ticketListModel) {
        return this.f6883id.equals(ticketListModel.f6883id);
    }

    public boolean areContentsTheSame(TicketListModel ticketListModel) {
        return this.lastSum.equals(ticketListModel.getLastSum());
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }
}
