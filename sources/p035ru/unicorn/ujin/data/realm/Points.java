package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.data.realm.Points */
public class Points {
    @SerializedName("points")
    private List<Point> points;

    public Points() {
    }

    public Points(List<Point> list) {
        this.points = list;
    }

    public List<Point> getPoints() {
        return this.points;
    }

    public void setPoints(List<Point> list) {
        this.points = list;
    }
}
