package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p046io.realm.annotations.PrimaryKey;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.AccountTicket */
public class AccountTicket {
    @SerializedName("account_number")
    @Expose
    private String accountNumber;
    @SerializedName("company_title")
    @Expose
    private String companyTitle;
    @SerializedName("current_balance")
    @Expose
    private Double currentBalance;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private int f6872id;
    @SerializedName("operations")
    @Expose
    private List<Operation> operations = null;

    public static List<AccountModel> makeTicketModel(AccountTicket accountTicket) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AccountModel("Лицевой счет", accountTicket.accountNumber));
        arrayList.add(new AccountModel("Баланс на сегодня", accountTicket.currentBalance + " ₽"));
        return arrayList;
    }

    public static List<OperationModel> makePaymentModel(AccountTicket accountTicket, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OperationModel("Текущий баланс", accountTicket.currentBalance + " ₽"));
        arrayList.add(new OperationModel("Компания", accountTicket.companyTitle));
        arrayList.add(new OperationModel("Оплата", str));
        arrayList.add(new OperationModel("Адрес", str2));
        return arrayList;
    }

    public static List<TicketListModel> makeOperationsModel(AccountTicket accountTicket) {
        ArrayList arrayList = new ArrayList();
        List<Operation> list = accountTicket.operations;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new TicketListModel(accountTicket, list.get(i)));
            }
        }
        return arrayList;
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

    public List<Operation> getOperations() {
        return this.operations;
    }

    public void setOperations(List<Operation> list) {
        this.operations = list;
    }

    public Double getCurrentBalance() {
        return this.currentBalance;
    }

    public void setCurrentBalance(Double d) {
        this.currentBalance = d;
    }

    public int getId() {
        return this.f6872id;
    }

    public void setId(int i) {
        this.f6872id = i;
    }
}
