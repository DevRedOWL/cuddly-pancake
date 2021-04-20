package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkinkRentaObject */
public class TalkinkRentaObject {
    @SerializedName("rent")
    @Expose
    private Rent rent;

    public Rent getRent() {
        return this.rent;
    }

    public void setRent(Rent rent2) {
        this.rent = rent2;
    }
}
