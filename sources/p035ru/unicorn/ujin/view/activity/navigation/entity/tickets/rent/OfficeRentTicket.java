package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.OfficeRentTicket */
public class OfficeRentTicket extends AbstractRentTicket implements Attributable {
    private Map<String, String> additionalData;
    private int enterpriseId;

    public int describeContents() {
        return 0;
    }

    public String getLocalTicketTypeName() {
        return "Офис";
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public ITicket.TicketProperty getTicketProperty() {
        return ITicket.TicketProperty.property_type;
    }

    public String getTicketTextForTicket() {
        return getTicketText();
    }

    public AbstractRentTicket.RentTicketTypes getLocalTicketType() {
        return AbstractRentTicket.RentTicketTypes.Office;
    }

    public AbstractRentTicket.DetailType getDetailDataType() {
        return AbstractRentTicket.DetailType.byFilter;
    }

    public Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public void setAdditionalData(Map<String, String> map) {
        this.additionalData = map;
    }

    public int getEnterpriseId() {
        return this.enterpriseId;
    }

    public void setEnterpriseId(int i) {
        this.enterpriseId = i;
    }

    /* renamed from: to */
    public List<IKeyValueData> mo67643to() {
        ArrayList arrayList = new ArrayList();
        Map<String, AttributableObject> iAttributeObjectList = getIAttributeObjectList();
        for (Map.Entry next : getAdditionalData().entrySet()) {
            if (iAttributeObjectList.containsKey(next.getKey())) {
                AttributableObject attributableObject = iAttributeObjectList.get(next.getKey());
                boolean equals = attributableObject.getType().equals("boolean");
                String str = (String) next.getValue();
                if (equals) {
                    str = str.equals("false") ? "нет" : "да";
                }
                String title = attributableObject.getTitle();
                arrayList.add(new IKeyValueDataImpl(title, str + " " + attributableObject.getUnits()));
            } else {
                arrayList.add(new IKeyValueDataImpl((String) next.getKey(), next.getValue()));
            }
        }
        return arrayList;
    }

    public Map<String, String> getAttribute() {
        return getAdditionalData();
    }

    public Map<String, AttributableObject> getIAttributeObjectList() {
        HashMap hashMap = new HashMap();
        hashMap.put("area", new AttributableObject("area", "float", "Площадь", "м²"));
        hashMap.put("capacity", new AttributableObject("capacity", "int", "Вместимость", "чел"));
        hashMap.put("floor", new AttributableObject("floor", "float", "Этаж", "эт."));
        hashMap.put("truck_access", new AttributableObject("truck_access", "boolean", "Подъезд грузового авто", ""));
        hashMap.put("is_office", new AttributableObject("is_office", "boolean", "Офисное поещение", ""));
        hashMap.put("is_manufacture", new AttributableObject("is_manufacture ", "boolean", "Производственное помещение", ""));
        return hashMap;
    }
}
