package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RentTicketList */
public class RentTicketList {
    @SerializedName("tickets")
    private List<Tickets> ticketsList;

    public List<Tickets> getTicketsList() {
        return this.ticketsList;
    }

    public void setTicketsList(List<Tickets> list) {
        this.ticketsList = list;
    }
}
