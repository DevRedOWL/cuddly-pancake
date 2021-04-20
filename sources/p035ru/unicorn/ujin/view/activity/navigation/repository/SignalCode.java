package p035ru.unicorn.ujin.view.activity.navigation.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.SignalCode */
public class SignalCode {
    @SerializedName("serial")
    @Expose
    private String serial;
    @SerializedName("value")
    @Expose
    private String value;

    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String str) {
        this.serial = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
