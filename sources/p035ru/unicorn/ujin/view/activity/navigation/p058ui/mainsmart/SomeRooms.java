package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.SomeRooms */
public class SomeRooms {
    private List<Hardware> hardwares;
    private List<Rooms> rooms;

    public SomeRooms(List<Hardware> list, List<Rooms> list2) {
        this.hardwares = list;
        this.rooms = list2;
    }

    public List<Hardware> getHardwares() {
        return this.hardwares;
    }

    public void setHardwares(List<Hardware> list) {
        this.hardwares = list;
    }

    public List<Rooms> getRooms() {
        return this.rooms;
    }

    public void setRooms1(List<Rooms> list) {
        this.rooms = list;
    }
}
