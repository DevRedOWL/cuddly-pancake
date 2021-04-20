package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4725x861a3344;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating */
public class TicketRating extends RealmObject implements C4725x861a3344 {
    @SerializedName("comment")
    private String comment;
    @SerializedName("id")
    @PrimaryKey

    /* renamed from: id */
    private String f6785id;
    @SerializedName("rating")
    private Integer rating;

    public String realmGet$comment() {
        return this.comment;
    }

    public String realmGet$id() {
        return this.f6785id;
    }

    public Integer realmGet$rating() {
        return this.rating;
    }

    public void realmSet$comment(String str) {
        this.comment = str;
    }

    public void realmSet$id(String str) {
        this.f6785id = str;
    }

    public void realmSet$rating(Integer num) {
        this.rating = num;
    }

    public TicketRating() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getId() {
        return realmGet$id();
    }

    public Integer getRating() {
        return Integer.valueOf(realmGet$rating() == null ? 0 : realmGet$rating().intValue());
    }

    public String getComment() {
        return realmGet$comment();
    }
}
