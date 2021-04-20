package p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.HeaderData */
public class HeaderData {
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("devName")
    @Expose
    private String devName;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private Long f6739id;

    public Long getId() {
        return this.f6739id;
    }

    public void setId(Long l) {
        this.f6739id = l;
    }

    public String getDevName() {
        return this.devName;
    }

    public void setDevName(String str) {
        this.devName = str;
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public String toString() {
        return "HeaderData{id=" + this.f6739id + ", devName='" + this.devName + '\'' + ", data=" + this.data.toString() + '}';
    }
}
