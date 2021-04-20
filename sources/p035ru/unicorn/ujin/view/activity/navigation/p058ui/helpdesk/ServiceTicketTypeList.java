package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketTypeList */
public class ServiceTicketTypeList {
    @SerializedName("types")
    @Expose
    private RealmList<ServiceTicketType> serviceTicketTypes;

    public RealmList<ServiceTicketType> getServiceTicketTypes() {
        return this.serviceTicketTypes;
    }

    public void setServiceTicketTypes(RealmList<ServiceTicketType> realmList) {
        this.serviceTicketTypes = realmList;
    }
}
