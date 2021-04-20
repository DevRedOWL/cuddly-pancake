package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4811x4ea5e5d4;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoDates */
public class VideoDates extends RealmObject implements C4811x4ea5e5d4 {
    @SerializedName("dates")
    @Expose
    private RealmList<Long> dates;

    public RealmList realmGet$dates() {
        return this.dates;
    }

    public void realmSet$dates(RealmList realmList) {
        this.dates = realmList;
    }

    public VideoDates() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList<Long> getDates() {
        return realmGet$dates();
    }

    public void setDates(RealmList<Long> realmList) {
        realmSet$dates(realmList);
    }
}
