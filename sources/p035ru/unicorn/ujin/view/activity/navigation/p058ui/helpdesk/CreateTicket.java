package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.CreateTicket */
public class CreateTicket {
    @SerializedName("created")
    private Tickets ticket;

    public Tickets getTicket() {
        return this.ticket;
    }

    public void setTicket(Tickets tickets) {
        this.ticket = tickets;
    }
}
