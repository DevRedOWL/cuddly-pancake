package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeList */
public class RentTypeList {
    @SerializedName("data")
    @Expose
    private List<RentType> rents;

    public List<RentType> getRents() {
        return this.rents;
    }

    public void setRents(List<RentType> list) {
        this.rents = list;
    }
}
