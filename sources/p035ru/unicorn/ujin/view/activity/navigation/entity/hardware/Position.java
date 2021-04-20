package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.Position */
public class Position {
    @SerializedName("x")
    @Expose

    /* renamed from: x */
    private String f6720x;
    @SerializedName("y")
    @Expose

    /* renamed from: y */
    private String f6721y;

    public String getX() {
        return this.f6720x;
    }

    public void setX(String str) {
        this.f6720x = str;
    }

    public String getY() {
        return this.f6721y;
    }

    public void setY(String str) {
        this.f6721y = str;
    }
}
