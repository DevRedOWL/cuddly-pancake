package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketList */
public class TicketList implements Diffable<TicketList> {
    @SerializedName("receipts")
    @Expose
    private Ticket tickets;
    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public Ticket getTickets() {
        return this.tickets;
    }

    public void setTickets(Ticket ticket) {
        this.tickets = ticket;
    }

    public boolean areItemsTheSame(TicketList ticketList) {
        return this.title.equals(ticketList.title);
    }

    public boolean areContentsTheSame(TicketList ticketList) {
        return this.title.equals(ticketList.title);
    }
}
