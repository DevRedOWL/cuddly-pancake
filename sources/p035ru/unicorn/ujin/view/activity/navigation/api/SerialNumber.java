package p035ru.unicorn.ujin.view.activity.navigation.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.api.SerialNumber */
public class SerialNumber {
    @SerializedName("serialnumber")
    @Expose
    private Long serialNumber;

    public Long getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(Long l) {
        this.serialNumber = l;
    }
}
