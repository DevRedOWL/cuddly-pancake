package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.Attributable;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.CoworkingRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.EventAreaRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.OfficeRentTicket;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfoObjectOutgoing */
public class RentInfoObjectOutgoing {
    @SerializedName("properties")
    private List<Integer> childrens;
    @SerializedName("desired_attributes")
    private List<RentAttribute> desiredAttributes;
    @SerializedName("enterprise_id")
    private Integer enterpriseId;
    @SerializedName("finish_date")
    private String finishDate;
    @SerializedName("start_date")
    private String startDate;

    public RentInfoObjectOutgoing() {
    }

    public RentInfoObjectOutgoing(ITicket iTicket) {
        if (iTicket.getGlobalTicketType() != ITicket.GlobalTicketTypes.Service && iTicket.getGlobalTicketType() == ITicket.GlobalTicketTypes.Rent) {
            AbstractRentTicket abstractRentTicket = (AbstractRentTicket) iTicket;
            if ((abstractRentTicket instanceof CoworkingRentTicket) || (abstractRentTicket instanceof EventAreaRentTicket)) {
                this.startDate = abstractRentTicket.getStartDate();
                this.finishDate = abstractRentTicket.getFinishDate();
            } else {
                this.startDate = abstractRentTicket.getStartDate();
                this.finishDate = abstractRentTicket.getFinishDate();
            }
            if (iTicket instanceof AbstractRentTicketWithId) {
                if (iTicket instanceof CoworkingRentTicket) {
                    this.childrens = ((CoworkingRentTicket) iTicket).getChildIdList();
                } else if (iTicket instanceof EventAreaRentTicket) {
                    this.childrens = Collections.singletonList(Integer.valueOf(((EventAreaRentTicket) iTicket).getRentId()));
                }
            } else if (iTicket instanceof OfficeRentTicket) {
                this.enterpriseId = Integer.valueOf(((OfficeRentTicket) iTicket).getEnterpriseId());
            }
            if (iTicket instanceof Attributable) {
                this.desiredAttributes = RentAttribute.fromMapToList(((Attributable) iTicket).getAttribute());
            }
        }
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }

    public String getFinishDate() {
        return this.finishDate;
    }

    public void setFinishDate(String str) {
        this.finishDate = str;
    }

    public Integer getEnterpriseId() {
        return this.enterpriseId;
    }

    public void setEnterpriseId(Integer num) {
        this.enterpriseId = num;
    }

    public List<Integer> getChildrens() {
        return this.childrens;
    }

    public void setChildrens(RealmList<Integer> realmList) {
        this.childrens = realmList;
    }
}
