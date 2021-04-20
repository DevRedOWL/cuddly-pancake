package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.UserDataIdList */
public class UserDataIdList {
    @SerializedName("userdata")
    @Expose
    private List<Integer> list;

    public UserDataIdList(List<Integer> list2) {
        this.list = list2;
    }

    public List<Integer> getList() {
        return this.list;
    }

    public void setList(List<Integer> list2) {
        this.list = list2;
    }
}
