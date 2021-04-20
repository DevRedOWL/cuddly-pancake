package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.Icons */
public class Icons {
    @SerializedName("icons")
    @Expose
    private List<Icon> list;

    public List<Icon> getList() {
        return this.list;
    }

    public void setList(List<Icon> list2) {
        this.list = list2;
    }
}
