package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.CoworkingRentTicket */
public class CoworkingRentTicket extends AbstractRentTicketWithId {
    private Set<RentChildren> children = new HashSet();

    public int describeContents() {
        return 0;
    }

    public String getLocalTicketTypeName() {
        return "Коворкинг";
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
        return AbstractRentTicket.RentTicketTypes.Coworking;
    }

    public AbstractRentTicket.DetailType getDetailDataType() {
        return AbstractRentTicket.DetailType.byId;
    }

    public Set<RentChildren> getChildren() {
        return this.children;
    }

    public void setChildren(Set<RentChildren> set) {
        this.children = set;
    }

    public void appendChild(List<IKeyValueData> list, int i) {
        if (i > 0) {
            list.add(new IKeyValueDataImpl("Выбранные места", String.valueOf(i)));
        }
    }

    public List<SomeString> getChildList() {
        ArrayList arrayList = new ArrayList();
        for (RentChildren title : getChildren()) {
            arrayList.add(new SomeString(title.getTitle()));
        }
        return arrayList;
    }

    public List<Integer> getChildIdList() {
        ArrayList arrayList = new ArrayList();
        for (RentChildren id : getChildren()) {
            arrayList.add(Integer.valueOf(id.getId()));
        }
        return arrayList;
    }
}
