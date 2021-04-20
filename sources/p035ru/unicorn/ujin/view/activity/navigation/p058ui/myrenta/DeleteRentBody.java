package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.DeleteRentBody */
public class DeleteRentBody {
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private int f6810id;

    public DeleteRentBody(int i) {
        this.f6810id = i;
    }

    public int getId() {
        return this.f6810id;
    }

    public void setId(int i) {
        this.f6810id = i;
    }
}
