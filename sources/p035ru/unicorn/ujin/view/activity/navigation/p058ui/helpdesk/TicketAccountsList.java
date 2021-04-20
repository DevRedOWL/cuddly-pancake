package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4711x22e6729d;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketAccountsList */
public class TicketAccountsList extends RealmObject implements C4711x22e6729d {
    @SerializedName("title")
    String title;

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public TicketAccountsList() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }
}
