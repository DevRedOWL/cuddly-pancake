package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.Icon */
public class Icon {
    @SerializedName("channel_type_id")
    @Expose
    private Integer channelTypeId;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("more")
    @Expose
    private List<MoreIconsInfo> more = null;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;

    public List<MoreIconsInfo> getMore() {
        return this.more;
    }

    public void setMore(List<MoreIconsInfo> list) {
        this.more = list;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer num) {
        this.state = num;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Integer getChannelTypeId() {
        return this.channelTypeId;
    }

    public void setChannelTypeId(Integer num) {
        this.channelTypeId = num;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
