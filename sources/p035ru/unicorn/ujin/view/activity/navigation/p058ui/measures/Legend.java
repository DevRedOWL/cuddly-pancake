package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.annotations.Ignore;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.Legend */
public class Legend implements Diffable<Legend> {
    @Ignore
    private String color;
    @SerializedName("delta")
    @Expose
    private Double delta;
    @SerializedName("dimension")
    @Expose
    private String dimension;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("title")
    @Expose
    private String title;

    public boolean areContentsTheSame(Legend legend) {
        return false;
    }

    public boolean areItemsTheSame(Legend legend) {
        return false;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDimension() {
        return this.dimension;
    }

    public void setDimension(String str) {
        this.dimension = str;
    }

    public Double getDelta() {
        return this.delta;
    }

    public void setDelta(Double d) {
        this.delta = d;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double d) {
        this.price = d;
    }
}
