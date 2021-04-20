package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDescription;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDetailRealmProxyInterface */
public interface C4807xe35bc3c2 {
    String realmGet$dateTitle();

    RealmList<TicketDescription> realmGet$descriptions();

    String realmGet$measure();

    Integer realmGet$paid();

    String realmGet$receiptsNumber();

    Double realmGet$sum();

    void realmSet$dateTitle(String str);

    void realmSet$descriptions(RealmList<TicketDescription> realmList);

    void realmSet$measure(String str);

    void realmSet$paid(Integer num);

    void realmSet$receiptsNumber(String str);

    void realmSet$sum(Double d);
}
