package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4815x8acca722;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEvents */
public class VideoEvents extends RealmObject implements C4815x8acca722 {
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f6890id;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    public Integer realmGet$duration() {
        return this.duration;
    }

    public String realmGet$id() {
        return this.f6890id;
    }

    public String realmGet$timestamp() {
        return this.timestamp;
    }

    public void realmSet$duration(Integer num) {
        this.duration = num;
    }

    public void realmSet$id(String str) {
        this.f6890id = str;
    }

    public void realmSet$timestamp(String str) {
        this.timestamp = str;
    }

    public VideoEvents() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getTimestamp() {
        return realmGet$timestamp();
    }

    public void setTimestamp(String str) {
        realmSet$timestamp(str);
    }

    public Integer getDuration() {
        return realmGet$duration();
    }

    public void setDuration(Integer num) {
        realmSet$duration(num);
    }
}
