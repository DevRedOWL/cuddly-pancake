package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketUrgency;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxyInterface */
public interface C4719xebc98253 {
    long realmGet$dateEnd();

    long realmGet$dateFinish();

    long realmGet$dateStart();

    int realmGet$id();

    String realmGet$number();

    String realmGet$sectionId();

    String realmGet$text();

    TicketObject realmGet$ticketObject();

    TicketState realmGet$ticketState();

    TicketUrgency realmGet$ticketUrgency();

    String realmGet$title();

    void realmSet$dateEnd(long j);

    void realmSet$dateFinish(long j);

    void realmSet$dateStart(long j);

    void realmSet$id(int i);

    void realmSet$number(String str);

    void realmSet$sectionId(String str);

    void realmSet$text(String str);

    void realmSet$ticketObject(TicketObject ticketObject);

    void realmSet$ticketState(TicketState ticketState);

    void realmSet$ticketUrgency(TicketUrgency ticketUrgency);

    void realmSet$title(String str);
}
