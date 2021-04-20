package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmObject;
import p046io.realm.annotations.Ignore;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.IntercomVal */
public class IntercomVal extends RealmObject implements Diffable<IntercomVal>, ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface {
    @SerializedName("archive_available")
    @Expose
    private Boolean archiveAvailable;
    @SerializedName("button-caption")
    @Expose
    private String buttonCaption;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("camera_id")
    @Expose
    private String idCamera;
    @SerializedName("open_door_hide")
    private int isButtonNeedHide;
    @SerializedName("mjpeg_new")
    @Expose
    private String mjpegNew;
    @SerializedName("name")
    @Expose
    private String name;
    @Ignore
    boolean openDoor;
    @SerializedName("open-url")
    @Expose
    private String openUrl;
    @SerializedName("preview")
    @Expose
    private String preview;
    @SerializedName("rtmp")
    @Expose
    private String rtmp;
    @SerializedName("url")
    @Expose
    private String url;

    public Boolean realmGet$archiveAvailable() {
        return this.archiveAvailable;
    }

    public String realmGet$buttonCaption() {
        return this.buttonCaption;
    }

    public Integer realmGet$code() {
        return this.code;
    }

    public String realmGet$idCamera() {
        return this.idCamera;
    }

    public int realmGet$isButtonNeedHide() {
        return this.isButtonNeedHide;
    }

    public String realmGet$mjpegNew() {
        return this.mjpegNew;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$openUrl() {
        return this.openUrl;
    }

    public String realmGet$preview() {
        return this.preview;
    }

    public String realmGet$rtmp() {
        return this.rtmp;
    }

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$archiveAvailable(Boolean bool) {
        this.archiveAvailable = bool;
    }

    public void realmSet$buttonCaption(String str) {
        this.buttonCaption = str;
    }

    public void realmSet$code(Integer num) {
        this.code = num;
    }

    public void realmSet$idCamera(String str) {
        this.idCamera = str;
    }

    public void realmSet$isButtonNeedHide(int i) {
        this.isButtonNeedHide = i;
    }

    public void realmSet$mjpegNew(String str) {
        this.mjpegNew = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$openUrl(String str) {
        this.openUrl = str;
    }

    public void realmSet$preview(String str) {
        this.preview = str;
    }

    public void realmSet$rtmp(String str) {
        this.rtmp = str;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public IntercomVal() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        this.openDoor = false;
    }

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public String getUrl() {
        return realmGet$url();
    }

    public void setUrl(String str) {
        realmSet$url(str);
    }

    public String getOpenUrl() {
        return realmGet$openUrl();
    }

    public void setOpenUrl(String str) {
        realmSet$openUrl(str);
    }

    public String getRtmp() {
        return realmGet$rtmp();
    }

    public void setRtmp(String str) {
        realmSet$rtmp(str);
    }

    public Integer getCode() {
        return realmGet$code();
    }

    public void setCode(Integer num) {
        realmSet$code(num);
    }

    public String getMjpegNew() {
        return realmGet$mjpegNew();
    }

    public void setMjpegNew(String str) {
        realmSet$mjpegNew(str);
    }

    public boolean isOpenDoor() {
        return this.openDoor;
    }

    public void setOpenDoor(boolean z) {
        this.openDoor = z;
    }

    public boolean areItemsTheSame(IntercomVal intercomVal) {
        if (realmGet$idCamera() == null || intercomVal.realmGet$idCamera() == null) {
            return false;
        }
        return realmGet$idCamera().equals(intercomVal.realmGet$idCamera());
    }

    public boolean areContentsTheSame(IntercomVal intercomVal) {
        return realmGet$mjpegNew().equals(intercomVal.realmGet$mjpegNew());
    }

    public String getIdCamera() {
        return realmGet$idCamera();
    }

    public void setIdCamera(String str) {
        realmSet$idCamera(str);
    }

    public String getPreview() {
        return realmGet$preview();
    }

    public void setPreview(String str) {
        realmSet$preview(str);
    }

    public String getButtonCaption() {
        return realmGet$buttonCaption();
    }

    public Boolean getArchiveAvailable() {
        return Boolean.valueOf(realmGet$archiveAvailable() == null ? false : realmGet$archiveAvailable().booleanValue());
    }

    public boolean isButtonNeedHide() {
        return realmGet$isButtonNeedHide() == 1;
    }
}
