package p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository;

import com.google.gson.annotations.SerializedName;
import p046io.realm.annotations.Ignore;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.SomeData */
public class SomeData {
    @SerializedName("header")
    private HeaderData data;
    @Ignore
    private int uniqId;

    public HeaderData getData() {
        return this.data;
    }

    public void setData(HeaderData headerData) {
        this.data = headerData;
    }

    public void setUniqId(int i) {
        this.uniqId = i;
    }

    public int getUniqId() {
        return this.uniqId;
    }

    public String toString() {
        HeaderData headerData = this.data;
        String headerData2 = headerData != null ? headerData.toString() : "";
        return "SomeData{data=" + headerData2 + '}';
    }
}
