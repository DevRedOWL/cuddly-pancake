package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.Datum */
public class Datum {
    @SerializedName("x")
    @Expose

    /* renamed from: x */
    private Integer f6797x;
    @SerializedName("y")
    @Expose

    /* renamed from: y */
    private Double f6798y;

    public Integer getX() {
        return this.f6797x;
    }

    public void setX(Integer num) {
        this.f6797x = num;
    }

    public Double getY() {
        return this.f6798y;
    }

    public void setY(Double d) {
        this.f6798y = d;
    }
}
