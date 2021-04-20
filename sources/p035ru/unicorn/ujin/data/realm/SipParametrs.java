package p035ru.unicorn.ujin.data.realm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.SipParametrs */
public class SipParametrs extends RealmObject implements Parcelable, ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface {
    public static final String DOMAIN = "domain";
    public static final String DTMF = "dtmf";
    public static final String FPS = "fps";

    /* renamed from: ID */
    public static final String f6663ID = "id";
    public static final String MJPEG = "mjpeg_url";
    public static final String NAME = "name";
    public static final String PASSWORD = "password";
    public static final String URL = "url";
    public static final String URL_DOOR = "open_door";
    public static final String VIDEO_SOURCE = "video_source";
    public static final String WHO_CALL = "who_calling";
    @SerializedName("open")
    @Expose
    private SipOpenDoorParam openDoorParam;
    @SerializedName("preview")
    @Expose
    private SipPreviewParams previewParams;
    @SerializedName("sip_codec_audio")
    @Expose
    private String sipCodecAudio;
    @SerializedName("sip_codec_video")
    @Expose
    private String sipCodecVideo;
    @SerializedName("sip_domain")
    @Expose
    private String sipDomain;
    @SerializedName("sip_password")
    @Expose
    private String sipPassword;
    @SerializedName("sip_port")
    @Expose
    private Integer sipPort;
    @SerializedName("sip_proxy")
    @Expose
    private String sipProxy;
    @SerializedName("sip_proxy_port")
    @Expose
    private Integer sipProxyPort;
    @SerializedName("sip_transport")
    @Expose
    private String sipTransport;
    @SerializedName("sip_user")
    @PrimaryKey
    @Expose
    private Integer sipUser;
    @SerializedName("video_source")
    @Expose
    private String videoSource;

    public int describeContents() {
        return 0;
    }

    public SipOpenDoorParam realmGet$openDoorParam() {
        return this.openDoorParam;
    }

    public SipPreviewParams realmGet$previewParams() {
        return this.previewParams;
    }

    public String realmGet$sipCodecAudio() {
        return this.sipCodecAudio;
    }

    public String realmGet$sipCodecVideo() {
        return this.sipCodecVideo;
    }

    public String realmGet$sipDomain() {
        return this.sipDomain;
    }

    public String realmGet$sipPassword() {
        return this.sipPassword;
    }

    public Integer realmGet$sipPort() {
        return this.sipPort;
    }

    public String realmGet$sipProxy() {
        return this.sipProxy;
    }

    public Integer realmGet$sipProxyPort() {
        return this.sipProxyPort;
    }

    public String realmGet$sipTransport() {
        return this.sipTransport;
    }

    public Integer realmGet$sipUser() {
        return this.sipUser;
    }

    public String realmGet$videoSource() {
        return this.videoSource;
    }

    public void realmSet$openDoorParam(SipOpenDoorParam sipOpenDoorParam) {
        this.openDoorParam = sipOpenDoorParam;
    }

    public void realmSet$previewParams(SipPreviewParams sipPreviewParams) {
        this.previewParams = sipPreviewParams;
    }

    public void realmSet$sipCodecAudio(String str) {
        this.sipCodecAudio = str;
    }

    public void realmSet$sipCodecVideo(String str) {
        this.sipCodecVideo = str;
    }

    public void realmSet$sipDomain(String str) {
        this.sipDomain = str;
    }

    public void realmSet$sipPassword(String str) {
        this.sipPassword = str;
    }

    public void realmSet$sipPort(Integer num) {
        this.sipPort = num;
    }

    public void realmSet$sipProxy(String str) {
        this.sipProxy = str;
    }

    public void realmSet$sipProxyPort(Integer num) {
        this.sipProxyPort = num;
    }

    public void realmSet$sipTransport(String str) {
        this.sipTransport = str;
    }

    public void realmSet$sipUser(Integer num) {
        this.sipUser = num;
    }

    public void realmSet$videoSource(String str) {
        this.videoSource = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public SipParametrs() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Integer getSipUser() {
        return realmGet$sipUser();
    }

    public void setSipUser(Integer num) {
        realmSet$sipUser(num);
    }

    public String getSipPassword() {
        return realmGet$sipPassword();
    }

    public void setSipPassword(String str) {
        realmSet$sipPassword(str);
    }

    public Integer getSipPort() {
        return realmGet$sipPort();
    }

    public void setSipPort(Integer num) {
        realmSet$sipPort(num);
    }

    public String getSipDomain() {
        return realmGet$sipDomain();
    }

    public void setSipDomain(String str) {
        realmSet$sipDomain(str);
    }

    public String getSipProxy() {
        return realmGet$sipProxy();
    }

    public void setSipProxy(String str) {
        realmSet$sipProxy(str);
    }

    public Integer getSipProxyPort() {
        return realmGet$sipProxyPort();
    }

    public void setSipProxyPort(Integer num) {
        realmSet$sipProxyPort(num);
    }

    public String getSipCodecAudio() {
        return realmGet$sipCodecAudio();
    }

    public void setSipCodecAudio(String str) {
        realmSet$sipCodecAudio(str);
    }

    public String getSipCodecVideo() {
        return realmGet$sipCodecVideo();
    }

    public void setSipCodecVideo(String str) {
        realmSet$sipCodecVideo(str);
    }

    public String getSipTransport() {
        return realmGet$sipTransport();
    }

    public void setSipTransport(String str) {
        realmSet$sipTransport(str);
    }

    public SipPreviewParams getPreviewParams() {
        return realmGet$previewParams();
    }

    public void setPreviewParams(SipPreviewParams sipPreviewParams) {
        realmSet$previewParams(sipPreviewParams);
    }

    public SipOpenDoorParam getOpenDoorParam() {
        return realmGet$openDoorParam();
    }

    public void setOpenDoorParam(SipOpenDoorParam sipOpenDoorParam) {
        realmSet$openDoorParam(sipOpenDoorParam);
    }

    public String getVideoSource() {
        return realmGet$videoSource();
    }

    public void setVideoSource(String str) {
        realmSet$videoSource(str);
    }

    public String toString() {
        return "SipParametrs{sipUser=" + realmGet$sipUser() + ", sipPassword='" + realmGet$sipPassword() + '\'' + ", sipPort=" + realmGet$sipPort() + ", sipDomain='" + realmGet$sipDomain() + '\'' + ", sipProxy='" + realmGet$sipProxy() + '\'' + ", sipProxyPort=" + realmGet$sipProxyPort() + ", sipCodecAudio='" + realmGet$sipCodecAudio() + '\'' + ", sipCodecVideo='" + realmGet$sipCodecVideo() + '\'' + ", sipTransport='" + realmGet$sipTransport() + '\'' + ", previewParams=" + realmGet$previewParams() + ", openDoorParam=" + realmGet$openDoorParam() + '}';
    }
}
