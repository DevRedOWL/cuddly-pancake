package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p046io.realm.C4701x34257330;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServicesList */
public class DomServicesList extends RealmObject implements C4701x34257330 {
    @SerializedName("category")
    @Expose
    private DomServiceCategory domServiceCategory;
    @SerializedName("tariffs")
    @Expose
    private RealmList<DomServiceTariff> domServiceTariff;

    public DomServiceCategory realmGet$domServiceCategory() {
        return this.domServiceCategory;
    }

    public RealmList realmGet$domServiceTariff() {
        return this.domServiceTariff;
    }

    public void realmSet$domServiceCategory(DomServiceCategory domServiceCategory2) {
        this.domServiceCategory = domServiceCategory2;
    }

    public void realmSet$domServiceTariff(RealmList realmList) {
        this.domServiceTariff = realmList;
    }

    public DomServicesList() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public DomServiceCategory getDomServiceCategory() {
        return realmGet$domServiceCategory();
    }

    public void setDomServiceCategory(DomServiceCategory domServiceCategory2) {
        realmSet$domServiceCategory(domServiceCategory2);
    }

    public List<DomServiceTariff> getDomServiceTariff() {
        return realmGet$domServiceTariff();
    }

    public void setDomServiceTariff(RealmList<DomServiceTariff> realmList) {
        realmSet$domServiceTariff(realmList);
    }
}
