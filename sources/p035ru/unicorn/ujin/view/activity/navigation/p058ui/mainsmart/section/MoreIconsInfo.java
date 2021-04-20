package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4735x8687f2a8;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.MoreIconsInfo */
public class MoreIconsInfo extends RealmObject implements Diffable<MoreIconsInfo>, C4735x8687f2a8 {
    @SerializedName("dt")
    @Expose

    /* renamed from: dt */
    private String f6790dt;
    @SerializedName("serialnumber")
    @Expose
    private String serialnumber;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("state_machine")
    @Expose
    private String stateMachine;
    @SerializedName("title")
    @Expose
    private String title;

    public String realmGet$dt() {
        return this.f6790dt;
    }

    public String realmGet$serialnumber() {
        return this.serialnumber;
    }

    public String realmGet$state() {
        return this.state;
    }

    public String realmGet$stateMachine() {
        return this.stateMachine;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$dt(String str) {
        this.f6790dt = str;
    }

    public void realmSet$serialnumber(String str) {
        this.serialnumber = str;
    }

    public void realmSet$state(String str) {
        this.state = str;
    }

    public void realmSet$stateMachine(String str) {
        this.stateMachine = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public MoreIconsInfo() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getSerialnumber() {
        return realmGet$serialnumber();
    }

    public void setSerialnumber(String str) {
        realmSet$serialnumber(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getState() {
        return realmGet$state();
    }

    public void setState(String str) {
        realmSet$state(str);
    }

    public String getStateMachine() {
        return realmGet$stateMachine();
    }

    public void setStateMachine(String str) {
        realmSet$stateMachine(str);
    }

    public String getDt() {
        return realmGet$dt();
    }

    public void setDt(String str) {
        realmSet$dt(str);
    }

    public boolean areItemsTheSame(MoreIconsInfo moreIconsInfo) {
        return (realmGet$serialnumber() == null || realmGet$title() == null || moreIconsInfo.realmGet$serialnumber() == null || moreIconsInfo.realmGet$title() == null || !realmGet$serialnumber().equals(moreIconsInfo.getSerialnumber()) || !realmGet$title().equals(moreIconsInfo.getTitle())) ? false : true;
    }

    public boolean areContentsTheSame(MoreIconsInfo moreIconsInfo) {
        return realmGet$serialnumber().equals(moreIconsInfo.getSerialnumber()) && realmGet$title().equals(moreIconsInfo.getTitle());
    }
}
