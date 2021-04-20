package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4723x2a576985;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketPerformer */
public class TicketPerformer extends RealmObject implements C4723x2a576985 {
    @SerializedName("title")
    String title;

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public TicketPerformer() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }
}
