package p035ru.unicorn.ujin.view.activity.navigation.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.api.SignalSettings */
public class SignalSettings {
    @SerializedName("device_class_id")
    @Expose
    private String deviceClassId;
    @SerializedName("device_class_name")
    @Expose
    private String deviceClassName;
    @SerializedName("device_class_title")
    @Expose
    private String deviceClassTitle;
    @SerializedName("device_model_id")
    @Expose
    private String deviceModelId;
    @SerializedName("device_model_name")
    @Expose
    private String deviceModelName;
    @SerializedName("device_model_title")
    @Expose
    private String deviceModelTitle;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("img_app")
    @Expose
    private String imgApp;
    @SerializedName("manual")
    @Expose
    private String manual;
    @SerializedName("room_info")
    @Expose
    private RoomInfo roomInfo;
    @SerializedName("signals")
    @Expose
    private RealmList<SignalRemote> signals = null;
    @SerializedName("state_text")
    @Expose
    private String stateText;
    @SerializedName("title")
    @Expose
    private String title;

    public String getImage() {
        return this.image;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public RoomInfo getRoomInfo() {
        return this.roomInfo;
    }

    public void setRoomInfo(RoomInfo roomInfo2) {
        this.roomInfo = roomInfo2;
    }

    public String getDeviceModelName() {
        return this.deviceModelName;
    }

    public void setDeviceModelName(String str) {
        this.deviceModelName = str;
    }

    public String getDeviceModelTitle() {
        return this.deviceModelTitle;
    }

    public void setDeviceModelTitle(String str) {
        this.deviceModelTitle = str;
    }

    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public void setDeviceModelId(String str) {
        this.deviceModelId = str;
    }

    public String getDeviceClassName() {
        return this.deviceClassName;
    }

    public void setDeviceClassName(String str) {
        this.deviceClassName = str;
    }

    public String getDeviceClassId() {
        return this.deviceClassId;
    }

    public void setDeviceClassId(String str) {
        this.deviceClassId = str;
    }

    public String getDeviceClassTitle() {
        return this.deviceClassTitle;
    }

    public void setDeviceClassTitle(String str) {
        this.deviceClassTitle = str;
    }

    public String getImgApp() {
        return this.imgApp;
    }

    public void setImgApp(String str) {
        this.imgApp = str;
    }

    public String getManual() {
        return this.manual;
    }

    public void setManual(String str) {
        this.manual = str;
    }

    public String getStateText() {
        return this.stateText;
    }

    public void setStateText(String str) {
        this.stateText = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public RealmList<SignalRemote> getSignals() {
        return this.signals;
    }

    public void setSignals(RealmList<SignalRemote> realmList) {
        this.signals = realmList;
    }
}
