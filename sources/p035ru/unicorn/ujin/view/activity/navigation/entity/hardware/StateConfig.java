package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.StateConfig */
public class StateConfig {
    @SerializedName("off")
    @Expose
    private Integer off;
    @SerializedName("on")
    @Expose

    /* renamed from: on */
    private Integer f6723on;

    public Integer getOn() {
        return this.f6723on;
    }

    public void setOn(Integer num) {
        this.f6723on = num;
    }

    public Integer getOff() {
        return this.off;
    }

    public void setOff(Integer num) {
        this.off = num;
    }
}
