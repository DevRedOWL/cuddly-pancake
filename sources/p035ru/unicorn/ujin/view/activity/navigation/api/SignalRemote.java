package p035ru.unicorn.ujin.view.activity.navigation.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4640x38f68a54;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.api.SignalRemote */
public class SignalRemote extends RealmObject implements Diffable<SignalRemote>, C4640x38f68a54 {
    @SerializedName("active_button_img")
    @Expose
    private String activeButtonImg;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f6714id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("readonly_label")
    @Expose
    private Integer readonlyLabel;
    @SerializedName("readonly_value")
    @Expose
    private Integer readonlyValue;
    @SerializedName("show_small_window")
    @Expose
    private Integer showSmallWindow;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type_control")
    @Expose
    private String typeControl;
    @SerializedName("value")
    @Expose
    private String value;

    public boolean areContentsTheSame(SignalRemote signalRemote) {
        return false;
    }

    public boolean areItemsTheSame(SignalRemote signalRemote) {
        return false;
    }

    public String realmGet$activeButtonImg() {
        return this.activeButtonImg;
    }

    public String realmGet$id() {
        return this.f6714id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public Integer realmGet$readonlyLabel() {
        return this.readonlyLabel;
    }

    public Integer realmGet$readonlyValue() {
        return this.readonlyValue;
    }

    public Integer realmGet$showSmallWindow() {
        return this.showSmallWindow;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$typeControl() {
        return this.typeControl;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$activeButtonImg(String str) {
        this.activeButtonImg = str;
    }

    public void realmSet$id(String str) {
        this.f6714id = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$readonlyLabel(Integer num) {
        this.readonlyLabel = num;
    }

    public void realmSet$readonlyValue(Integer num) {
        this.readonlyValue = num;
    }

    public void realmSet$showSmallWindow(Integer num) {
        this.showSmallWindow = num;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$typeControl(String str) {
        this.typeControl = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    public SignalRemote() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public static List<SignalRemote> getSignals(RealmList<SignalRemote> realmList) {
        if (realmList == null || realmList.isEmpty()) {
            return realmList;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < realmList.size(); i++) {
            SignalRemote signalRemote = realmList.get(i);
            if (signalRemote.getReadonlyValue().intValue() != 1 && signalRemote.getTypeControl().equals("uniremote")) {
                arrayList.add(realmList.get(i));
            }
        }
        return arrayList;
    }

    public Integer getReadonlyValue() {
        return realmGet$readonlyValue();
    }

    public void setReadonlyValue(Integer num) {
        realmSet$readonlyValue(num);
    }

    public Integer getReadonlyLabel() {
        return realmGet$readonlyLabel();
    }

    public void setReadonlyLabel(Integer num) {
        realmSet$readonlyLabel(num);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getValue() {
        return realmGet$value();
    }

    public void setValue(String str) {
        realmSet$value(str);
    }

    public String getTypeControl() {
        return realmGet$typeControl();
    }

    public void setTypeControl(String str) {
        realmSet$typeControl(str);
    }

    public Integer getShowSmallWindow() {
        return realmGet$showSmallWindow();
    }

    public void setShowSmallWindow(Integer num) {
        realmSet$showSmallWindow(num);
    }

    public String getActiveButtonImg() {
        return realmGet$activeButtonImg();
    }

    public void setActiveButtonImg(String str) {
        realmSet$activeButtonImg(str);
    }
}
