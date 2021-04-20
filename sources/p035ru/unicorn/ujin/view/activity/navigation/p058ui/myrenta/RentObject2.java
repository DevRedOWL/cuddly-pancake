package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.service.AbstractServiceTicket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentObject2 */
public class RentObject2 {
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private int f6814id;
    @SerializedName("type")
    @Expose
    private String type;

    public RentObject2(ITicket iTicket) {
        if (iTicket.getGlobalTicketType() == ITicket.GlobalTicketTypes.Rent) {
            if (iTicket instanceof AbstractRentTicketWithId) {
                this.f6814id = ((AbstractRentTicketWithId) iTicket).getRentId();
            } else if (iTicket instanceof AbstractRentTicket) {
                this.f6814id = ((AbstractRentTicket) iTicket).getRentTypeId();
            }
        } else if (iTicket.getGlobalTicketType() == ITicket.GlobalTicketTypes.Service && (iTicket instanceof AbstractServiceTicket.IHasRentID)) {
            this.f6814id = ((AbstractServiceTicket.IHasRentID) iTicket).getRentId();
        }
        this.type = iTicket.getTicketProperty().name();
    }
}
