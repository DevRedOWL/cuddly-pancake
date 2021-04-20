package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Talking */
public class Talking {
    @SerializedName("properties")
    @Expose
    private List<TalkingInfo> data;

    public List<TalkingInfo> getData() {
        return this.data;
    }

    public void setData(List<TalkingInfo> list) {
        this.data = list;
    }
}
