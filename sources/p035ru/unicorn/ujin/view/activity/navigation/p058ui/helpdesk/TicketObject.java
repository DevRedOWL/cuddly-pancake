package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4721x2e294a62;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketObject */
public class TicketObject extends RealmObject implements C4721x2e294a62 {
    @SerializedName("id")

    /* renamed from: id */
    int f6784id;
    @SerializedName("type")
    String type;

    public int realmGet$id() {
        return this.f6784id;
    }

    public String realmGet$type() {
        return this.type;
    }

    public void realmSet$id(int i) {
        this.f6784id = i;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    public TicketObject() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
    }

    public String getType() {
        return realmGet$type();
    }

    public void setType(String str) {
        realmSet$type(str);
    }
}
