package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4805x1fb91be5;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDescription */
public class TicketDescription extends RealmObject implements Diffable<TicketDescription>, C4805x1fb91be5 {
    @SerializedName("value")
    @Expose
    private String sum;
    @SerializedName("title")
    @Expose
    private String title;

    public boolean areContentsTheSame(TicketDescription ticketDescription) {
        return true;
    }

    public boolean areItemsTheSame(TicketDescription ticketDescription) {
        return true;
    }

    public String realmGet$sum() {
        return this.sum;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$sum(String str) {
        this.sum = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public TicketDescription() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getSum() {
        return realmGet$sum();
    }

    public void setSum(String str) {
        realmSet$sum(str);
    }
}
