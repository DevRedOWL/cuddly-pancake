package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.DevicesList */
public class DevicesList {
    @SerializedName("devices")
    @Expose
    private List<Devices> devicesList;

    public List<Devices> getDevicesList() {
        return this.devicesList;
    }
}
