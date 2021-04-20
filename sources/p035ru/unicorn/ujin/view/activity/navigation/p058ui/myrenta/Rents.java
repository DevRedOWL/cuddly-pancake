package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.Rents */
public class Rents {
    @SerializedName("rents")
    @Expose
    private List<RentInfo> rents;

    public List<RentInfo> getRents() {
        return this.rents;
    }

    public void setRents(List<RentInfo> list) {
        this.rents = list;
    }
}
