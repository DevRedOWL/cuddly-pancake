package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4761x4fbeca50;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHumanValue */
public class TimeSlotHumanValue extends RealmObject implements C4761x4fbeca50 {
    public String date;
    public String time;
    @SerializedName("day_of_week")
    public String weekDay;

    public String realmGet$date() {
        return this.date;
    }

    public String realmGet$time() {
        return this.time;
    }

    public String realmGet$weekDay() {
        return this.weekDay;
    }

    public void realmSet$date(String str) {
        this.date = str;
    }

    public void realmSet$time(String str) {
        this.time = str;
    }

    public void realmSet$weekDay(String str) {
        this.weekDay = str;
    }

    public TimeSlotHumanValue() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }
}
