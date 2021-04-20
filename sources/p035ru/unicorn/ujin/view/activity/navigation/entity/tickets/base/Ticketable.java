package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.Ticketable */
interface Ticketable {
    String getSectionId();

    String getSectionTitle();

    String getTicketTextForTicket();

    boolean isCorrect();

    String loadTicketText();

    String loadTicketTitle();

    void saveSectionId(String str);

    void saveSectionTitle(String str);

    void saveTicketText(String str);

    void saveTicketTitle(String str);
}
