package p035ru.unicorn.ujin.view.activity.navigation.entity.video;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.video.VideoObject */
public class VideoObject {
    @SerializedName("camera")
    List<C5788Video> videoList;

    public List<C5788Video> getVideoList() {
        return this.videoList;
    }
}
