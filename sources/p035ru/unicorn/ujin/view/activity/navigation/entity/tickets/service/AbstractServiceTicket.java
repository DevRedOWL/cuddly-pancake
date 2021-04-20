package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.service;

import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.service.AbstractServiceTicket */
public abstract class AbstractServiceTicket implements ITicket {
    protected String sectionId;
    protected String sectionTitle;
    protected int ticketId;
    protected String ticketText;
    protected String ticketTitle;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.service.AbstractServiceTicket$IHasRentID */
    public interface IHasRentID {
        int getRentId();
    }

    public ITicket.GlobalTicketTypes getGlobalTicketType() {
        return ITicket.GlobalTicketTypes.Service;
    }

    public ITicket.TicketProperty getTicketProperty() {
        return ITicket.TicketProperty.property_service;
    }

    public String getTicketTitle() {
        return this.ticketTitle;
    }

    public void setTicketTitle(String str) {
        this.ticketTitle = str;
    }

    public String getTicketText() {
        return this.ticketText;
    }

    public void setTicketText(String str) {
        this.ticketText = str;
    }

    public int getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(int i) {
        this.ticketId = i;
    }

    public String loadTicketText() {
        return getTicketText();
    }

    public void saveTicketText(String str) {
        setTicketText(str);
    }

    public String loadTicketTitle() {
        return getTicketTitle();
    }

    public void saveTicketTitle(String str) {
        setTicketTitle(str);
    }

    public String getSectionId() {
        return this.sectionId;
    }

    public void saveSectionId(String str) {
        this.sectionId = str;
    }

    public String getSectionTitle() {
        return this.sectionTitle;
    }

    public void saveSectionTitle(String str) {
        this.sectionTitle = str;
    }

    public boolean isCorrect() {
        String str = this.ticketText;
        return str != null && this.ticketTitle != null && !str.isEmpty() && !this.ticketTitle.isEmpty();
    }

    public boolean isCreate() {
        return this.ticketId != 0;
    }
}
