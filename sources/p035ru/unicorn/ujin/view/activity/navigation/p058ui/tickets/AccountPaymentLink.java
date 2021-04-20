package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.AccountPaymentLink */
public class AccountPaymentLink {
    @SerializedName("payment_form")
    @Expose
    private String paymentLink;

    public String getPaymentLink() {
        return this.paymentLink;
    }
}
