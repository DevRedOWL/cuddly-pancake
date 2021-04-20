package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.Room */
public class Room {
    @SerializedName("rooms")
    @Expose
    private List<Rooms> list;

    public List<Rooms> getList() {
        return this.list;
    }

    public void setList(RealmList<Rooms> realmList) {
        this.list = realmList;
    }
}
