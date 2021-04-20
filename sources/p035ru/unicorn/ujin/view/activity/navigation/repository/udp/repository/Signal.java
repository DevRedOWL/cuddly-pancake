package p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Signal */
public class Signal {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("result")
    @Expose
    private Integer result;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Integer getResult() {
        return this.result;
    }

    public void setResult(Integer num) {
        this.result = num;
    }
}
