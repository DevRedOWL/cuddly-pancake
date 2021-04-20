package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.Line */
public class Line {
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String str) {
        this.color = str;
    }
}
