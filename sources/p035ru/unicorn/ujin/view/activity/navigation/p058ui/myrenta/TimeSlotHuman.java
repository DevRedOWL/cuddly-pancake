package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4759xeb3c1dd3;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHuman */
public class TimeSlotHuman extends RealmObject implements C4759xeb3c1dd3 {
    @SerializedName("finish")
    public TimeSlotHumanValue finishValue;
    @SerializedName("start")
    public TimeSlotHumanValue startValue;

    public TimeSlotHumanValue realmGet$finishValue() {
        return this.finishValue;
    }

    public TimeSlotHumanValue realmGet$startValue() {
        return this.startValue;
    }

    public void realmSet$finishValue(TimeSlotHumanValue timeSlotHumanValue) {
        this.finishValue = timeSlotHumanValue;
    }

    public void realmSet$startValue(TimeSlotHumanValue timeSlotHumanValue) {
        this.startValue = timeSlotHumanValue;
    }

    public TimeSlotHuman() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }
}
