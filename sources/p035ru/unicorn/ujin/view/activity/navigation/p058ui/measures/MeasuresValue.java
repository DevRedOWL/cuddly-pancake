package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.MeasuresValue */
public class MeasuresValue {
    @SerializedName("signal_id")
    @Expose

    /* renamed from: id */
    private String f6799id;
    @SerializedName("signal_value")
    @Expose
    private String value;

    public MeasuresValue(String str, String str2) {
        this.f6799id = str;
        this.value = str2;
    }

    public String getId() {
        return this.f6799id;
    }

    public void setId(String str) {
        this.f6799id = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
