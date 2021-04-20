package p035ru.unicorn.ujin.data.developerPage;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.data.developerPage.DeveloperPageDataPercent */
public class DeveloperPageDataPercent {
    private float percent;
    private String text;
    @SerializedName("view_complex_readiness")
    private Boolean visible;

    public float getPercent() {
        return this.percent;
    }

    public void setPercent(float f) {
        this.percent = f;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public Boolean getVisible() {
        return this.visible;
    }
}
