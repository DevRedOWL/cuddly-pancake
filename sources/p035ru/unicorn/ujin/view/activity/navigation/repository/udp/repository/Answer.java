package p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Answer */
public class Answer {
    @SerializedName("serialnumber")
    @Expose
    private String serialnumber;
    @SerializedName("signal")
    @Expose
    private List<Signal> signal = null;

    public List<Signal> getSignal() {
        return this.signal;
    }

    public void setSignal(List<Signal> list) {
        this.signal = list;
    }

    public String getSerialnumber() {
        return this.serialnumber;
    }

    public void setSerialnumber(String str) {
        this.serialnumber = str;
    }
}
