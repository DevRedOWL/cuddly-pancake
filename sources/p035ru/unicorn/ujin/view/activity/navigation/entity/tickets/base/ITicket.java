package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base;

import android.os.Parcelable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket */
public interface ITicket extends Parcelable, Ticketable {

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket$GlobalTicketTypes */
    public enum GlobalTicketTypes {
        Service,
        Rent
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket$TicketProperty */
    public enum TicketProperty {
        property,
        property_type,
        property_service
    }

    GlobalTicketTypes getGlobalTicketType();

    String getName();

    TicketProperty getTicketProperty();

    boolean isCreate();
}
