package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4713x1cef0fa1;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApartment */
public class TicketApartment extends RealmObject implements C4713x1cef0fa1 {
    @SerializedName("title")
    String title;

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public TicketApartment() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }
}
