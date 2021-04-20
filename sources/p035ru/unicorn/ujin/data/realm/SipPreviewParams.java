package p035ru.unicorn.ujin.data.realm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.SipPreviewParams */
public class SipPreviewParams extends RealmObject implements Parcelable, ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface {
    @SerializedName("fps")
    @Expose
    private Integer fps;
    @SerializedName("mjpeg")
    @Expose
    private String mjpegUrl;
    @SerializedName("url")
    @Expose
    private String url;

    public int describeContents() {
        return 0;
    }

    public Integer realmGet$fps() {
        return this.fps;
    }

    public String realmGet$mjpegUrl() {
        return this.mjpegUrl;
    }

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$fps(Integer num) {
        this.fps = num;
    }

    public void realmSet$mjpegUrl(String str) {
        this.mjpegUrl = str;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public SipPreviewParams() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getMjpegUrl() {
        return realmGet$mjpegUrl();
    }

    public void setMjpegUrl(String str) {
        realmSet$mjpegUrl(str);
    }

    public Integer getFps() {
        return realmGet$fps();
    }

    public void setFps(Integer num) {
        realmSet$fps(num);
    }

    public String getUrl() {
        return realmGet$url();
    }

    public void setUrl(String str) {
        realmSet$url(str);
    }

    public String toString() {
        return "SipPreviewParams{fps=" + realmGet$fps() + ", url='" + realmGet$url() + '\'' + ", mjpegUrl='" + realmGet$mjpegUrl() + '\'' + '}';
    }
}
