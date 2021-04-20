package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent;

import android.os.Parcel;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.EventAreaRentTicket */
public class EventAreaRentTicket extends AbstractRentTicketWithId {
    public int describeContents() {
        return 0;
    }

    public String getLocalTicketTypeName() {
        return "Зона мероприятия";
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public ITicket.TicketProperty getTicketProperty() {
        return ITicket.TicketProperty.property;
    }

    public String getTicketTextForTicket() {
        return getTicketText();
    }

    public AbstractRentTicket.RentTicketTypes getLocalTicketType() {
        return AbstractRentTicket.RentTicketTypes.EventArea;
    }

    public AbstractRentTicket.DetailType getDetailDataType() {
        return AbstractRentTicket.DetailType.byId;
    }
}
