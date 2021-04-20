package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketObject */
public class ServiceTicketObject {
    @SerializedName("ticket")
    @Expose
    private ServiceTicket serviceTicket;

    public ServiceTicket getServiceTicket() {
        return this.serviceTicket;
    }

    public void setServiceTicket(ServiceTicket serviceTicket2) {
        this.serviceTicket = serviceTicket2;
    }
}
