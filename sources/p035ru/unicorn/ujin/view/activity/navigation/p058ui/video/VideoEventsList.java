package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4813x7044a9a4;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEventsList */
public class VideoEventsList extends RealmObject implements C4813x7044a9a4 {
    @SerializedName("events")
    @Expose
    private RealmList<VideoEvents> dates;

    public RealmList realmGet$dates() {
        return this.dates;
    }

    public void realmSet$dates(RealmList realmList) {
        this.dates = realmList;
    }

    public VideoEventsList() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList<VideoEvents> getDates() {
        return realmGet$dates();
    }

    public void setDates(RealmList<VideoEvents> realmList) {
        realmSet$dates(realmList);
    }
}
