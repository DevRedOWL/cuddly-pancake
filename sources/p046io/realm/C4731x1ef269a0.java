package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketAccountsList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApartment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApplicant;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketChatData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketPerformer;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxyInterface */
public interface C4731x1ef269a0 {
    String realmGet$city();

    boolean realmGet$hasDebts();

    int realmGet$id();

    TicketInfo realmGet$ticket();

    TicketAccountsList realmGet$ticketAccountsList();

    TicketApartment realmGet$ticketApartment();

    TicketApplicant realmGet$ticketApplicant();

    TicketChatData realmGet$ticketChatData();

    TicketPerformer realmGet$ticketPerformer();

    void realmSet$city(String str);

    void realmSet$hasDebts(boolean z);

    void realmSet$id(int i);

    void realmSet$ticket(TicketInfo ticketInfo);

    void realmSet$ticketAccountsList(TicketAccountsList ticketAccountsList);

    void realmSet$ticketApartment(TicketApartment ticketApartment);

    void realmSet$ticketApplicant(TicketApplicant ticketApplicant);

    void realmSet$ticketChatData(TicketChatData ticketChatData);

    void realmSet$ticketPerformer(TicketPerformer ticketPerformer);
}
