package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.LineData */
class LineData implements Diffable<LineData> {
    private String[] data;
    @SerializedName("title")
    @Expose
    private String title;

    public boolean areContentsTheSame(LineData lineData) {
        return false;
    }

    public boolean areItemsTheSame(LineData lineData) {
        return false;
    }

    LineData() {
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String[] getData() {
        return this.data;
    }

    public void setData(String[] strArr) {
        this.data = strArr;
    }
}
