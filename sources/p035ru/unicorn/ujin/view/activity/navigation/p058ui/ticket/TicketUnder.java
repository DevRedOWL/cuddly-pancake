package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketUnder */
public class TicketUnder {
    @SerializedName("months")
    @Expose
    private List<TicketList> ticketList;

    public List<TicketList> getTicketList() {
        return this.ticketList;
    }

    public void setTicketList(List<TicketList> list) {
        this.ticketList = list;
    }
}
