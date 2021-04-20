package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p046io.realm.C4709x9f6ffecc;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType */
public class ServiceTicketType extends RealmObject implements C4709x9f6ffecc {
    private String description;
    @PrimaryKey

    /* renamed from: id */
    private int f6781id;
    private String slug;
    private String title;

    public String realmGet$description() {
        return this.description;
    }

    public int realmGet$id() {
        return this.f6781id;
    }

    public String realmGet$slug() {
        return this.slug;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$id(int i) {
        this.f6781id = i;
    }

    public void realmSet$slug(String str) {
        this.slug = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public ServiceTicketType() {
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

    public String getDescription() {
        return realmGet$description();
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }
}
