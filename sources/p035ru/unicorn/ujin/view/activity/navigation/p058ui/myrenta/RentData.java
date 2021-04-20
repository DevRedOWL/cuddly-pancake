package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentData */
public class RentData {
    @SerializedName("rent")
    private Rent rent;

    public Rent getRent() {
        return this.rent;
    }

    public void setRent(Rent rent2) {
        this.rent = rent2;
    }
}
