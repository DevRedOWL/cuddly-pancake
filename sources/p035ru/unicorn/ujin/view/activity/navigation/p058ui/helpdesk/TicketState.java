package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4727x7c26a462;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketState */
public class TicketState extends RealmObject implements C4727x7c26a462 {
    @SerializedName("slug")
    String slug;
    @SerializedName("title")
    String title;

    public String realmGet$slug() {
        return this.slug;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$slug(String str) {
        this.slug = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public TicketState() {
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

    public String getSlug() {
        return realmGet$slug();
    }

    public void setSlug(String str) {
        realmSet$slug(str);
    }
}
