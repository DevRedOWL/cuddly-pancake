package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.Attributable;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.CoworkingRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.EventAreaRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.OfficeRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p046io.realm.C4747x9e0f12d9;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfoObject */
public class RentInfoObject extends RealmObject implements C4747x9e0f12d9 {
    @SerializedName("properties")
    private RealmList<Integer> childrens;
    @SerializedName("desired_attributes")
    private RealmList<RentAttributes> desiredAttributes;
    @SerializedName("enterprise_id")
    private Integer enterpriseId;
    @SerializedName("finish_date")
    private String finishDate;
    @SerializedName("start_date")
    private String startDate;

    public RealmList realmGet$childrens() {
        return this.childrens;
    }

    public RealmList realmGet$desiredAttributes() {
        return this.desiredAttributes;
    }

    public Integer realmGet$enterpriseId() {
        return this.enterpriseId;
    }

    public String realmGet$finishDate() {
        return this.finishDate;
    }

    public String realmGet$startDate() {
        return this.startDate;
    }

    public void realmSet$childrens(RealmList realmList) {
        this.childrens = realmList;
    }

    public void realmSet$desiredAttributes(RealmList realmList) {
        this.desiredAttributes = realmList;
    }

    public void realmSet$enterpriseId(Integer num) {
        this.enterpriseId = num;
    }

    public void realmSet$finishDate(String str) {
        this.finishDate = str;
    }

    public void realmSet$startDate(String str) {
        this.startDate = str;
    }

    public RentInfoObject() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RentInfoObject(ITicket iTicket) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        if (iTicket.getGlobalTicketType() != ITicket.GlobalTicketTypes.Service && iTicket.getGlobalTicketType() == ITicket.GlobalTicketTypes.Rent) {
            AbstractRentTicket abstractRentTicket = (AbstractRentTicket) iTicket;
            realmSet$startDate(abstractRentTicket.getStartDate());
            realmSet$finishDate(abstractRentTicket.getFinishDate());
            if (iTicket instanceof AbstractRentTicketWithId) {
                if (iTicket instanceof CoworkingRentTicket) {
                    realmSet$childrens((RealmList) ((CoworkingRentTicket) iTicket).getChildIdList());
                } else if (iTicket instanceof EventAreaRentTicket) {
                    realmSet$childrens((RealmList) Collections.singletonList(Integer.valueOf(((EventAreaRentTicket) iTicket).getRentId())));
                }
            } else if (iTicket instanceof OfficeRentTicket) {
                realmSet$enterpriseId(Integer.valueOf(((OfficeRentTicket) iTicket).getEnterpriseId()));
            }
            if (iTicket instanceof Attributable) {
                realmSet$desiredAttributes((RealmList) RentAttributes.fromMapToList(((Attributable) iTicket).getAttribute()));
            }
        }
    }

    public String getStartDate() {
        return realmGet$startDate();
    }

    public String getHumanDate(String str) {
        return str == null ? "" : DateUtils.formatDate(Long.valueOf(Long.parseLong(str) * 1000));
    }

    public void setStartDate(String str) {
        realmSet$startDate(str);
    }

    public String getFinishDate() {
        return realmGet$finishDate();
    }

    public void setFinishDate(String str) {
        realmSet$finishDate(str);
    }

    public Integer getEnterpriseId() {
        return realmGet$enterpriseId();
    }

    public void setEnterpriseId(Integer num) {
        realmSet$enterpriseId(num);
    }

    public RealmList<Integer> getChildrens() {
        return realmGet$childrens();
    }

    public void setChildrens(RealmList<Integer> realmList) {
        realmSet$childrens(realmList);
    }

    public RealmList<RentAttributes> getDesiredAttributes() {
        return realmGet$desiredAttributes();
    }

    public void setDesiredAttributes(RealmList<RentAttributes> realmList) {
        realmSet$desiredAttributes(realmList);
    }
}
