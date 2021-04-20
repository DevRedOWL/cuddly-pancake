package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentObjectBody */
public class RentObjectBody {
    @SerializedName("object")
    private RentObject2 rentDataInfo;
    @SerializedName("rent")
    private RentInfoObjectOutgoing rentInfo;
    @SerializedName("objects")
    List<RentObject> rentObject;
    @SerializedName("section_id")
    private String sectionId;
    @SerializedName("text")
    private String text;
    @SerializedName("title")
    String title;

    public RentObjectBody(ITicket iTicket) {
        this.title = iTicket.loadTicketTitle();
        this.text = iTicket.getTicketTextForTicket();
        this.sectionId = iTicket.getSectionId();
        if (iTicket.getGlobalTicketType() == ITicket.GlobalTicketTypes.Rent) {
            this.rentInfo = new RentInfoObjectOutgoing(iTicket);
        }
        this.rentDataInfo = new RentObject2(iTicket);
    }
}
