package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxyInterface */
public interface C4707xa3193a66 {
    String realmGet$chatId();

    String realmGet$city();

    RealmList<ServiceFile> realmGet$fileList();

    String realmGet$messageLastMessage();

    RealmList<ServiceMessages> realmGet$messageList();

    String realmGet$number();

    int realmGet$objectId();

    String realmGet$objectTitle();

    String realmGet$objectType();

    String realmGet$objectTypeName();

    String realmGet$performerEmail();

    String realmGet$performerFio();

    String realmGet$performerId();

    String realmGet$performerPhone();

    Float realmGet$rating();

    RealmList<TicketRating> realmGet$ratingList();

    RentInfoObject realmGet$rentInfoObject();

    String realmGet$sectionId();

    String realmGet$ticketAddress();

    String realmGet$ticketApartment();

    String realmGet$ticketDtEnd();

    String realmGet$ticketDtFinish();

    String realmGet$ticketDtStart();

    String realmGet$ticketId();

    String realmGet$ticketStateId();

    String realmGet$ticketStateTitle();

    String realmGet$ticketText();

    String realmGet$ticketTitle();

    String realmGet$ticketType();

    String realmGet$ticketTypeSlug();

    String realmGet$ticketTypeTitle();

    String realmGet$ticketUrgency();

    String realmGet$ticketUrgencyId();

    String realmGet$unread();

    String realmGet$userdataEmail();

    String realmGet$userdataFio();

    String realmGet$userdataId();

    String realmGet$userdataPhone();

    void realmSet$chatId(String str);

    void realmSet$city(String str);

    void realmSet$fileList(RealmList<ServiceFile> realmList);

    void realmSet$messageLastMessage(String str);

    void realmSet$messageList(RealmList<ServiceMessages> realmList);

    void realmSet$number(String str);

    void realmSet$objectId(int i);

    void realmSet$objectTitle(String str);

    void realmSet$objectType(String str);

    void realmSet$objectTypeName(String str);

    void realmSet$performerEmail(String str);

    void realmSet$performerFio(String str);

    void realmSet$performerId(String str);

    void realmSet$performerPhone(String str);

    void realmSet$rating(Float f);

    void realmSet$ratingList(RealmList<TicketRating> realmList);

    void realmSet$rentInfoObject(RentInfoObject rentInfoObject);

    void realmSet$sectionId(String str);

    void realmSet$ticketAddress(String str);

    void realmSet$ticketApartment(String str);

    void realmSet$ticketDtEnd(String str);

    void realmSet$ticketDtFinish(String str);

    void realmSet$ticketDtStart(String str);

    void realmSet$ticketId(String str);

    void realmSet$ticketStateId(String str);

    void realmSet$ticketStateTitle(String str);

    void realmSet$ticketText(String str);

    void realmSet$ticketTitle(String str);

    void realmSet$ticketType(String str);

    void realmSet$ticketTypeSlug(String str);

    void realmSet$ticketTypeTitle(String str);

    void realmSet$ticketUrgency(String str);

    void realmSet$ticketUrgencyId(String str);

    void realmSet$unread(String str);

    void realmSet$userdataEmail(String str);

    void realmSet$userdataFio(String str);

    void realmSet$userdataId(String str);

    void realmSet$userdataPhone(String str);
}
