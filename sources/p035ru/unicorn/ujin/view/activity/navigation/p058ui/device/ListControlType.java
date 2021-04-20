package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.ListControlType */
public class ListControlType implements Diffable<ListControlType> {
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f6763id;
    @SerializedName("title")
    @Expose
    private String title;

    public String getId() {
        return this.f6763id;
    }

    public void setId(String str) {
        this.f6763id = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public static String findIdByTitle(List<ListControlType> list, String str, String str2) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f6763id.equals(str)) {
                return list.get(i).title;
            }
        }
        return str2;
    }

    public boolean areItemsTheSame(ListControlType listControlType) {
        return this.f6763id.equals(listControlType.f6763id);
    }

    public boolean areContentsTheSame(ListControlType listControlType) {
        return this.title.equals(listControlType.title);
    }
}
