package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4817xeb68be6a;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoUrl */
public class VideoUrl extends RealmObject implements C4817xeb68be6a {
    @SerializedName("mjpeg-url")
    @Expose
    private String url;

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public VideoUrl() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getUrl() {
        return realmGet$url();
    }

    public void setUrl(String str) {
        realmSet$url(str);
    }
}
