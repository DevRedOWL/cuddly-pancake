package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4705xde42ce26;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages */
public class ServiceMessages extends RealmObject implements Diffable<ServiceMessages>, C4705xde42ce26 {
    @SerializedName("datauser_id")
    @Expose
    private String datauserId;
    @SerializedName("message_dt")
    @Expose
    private String messageDt;
    @SerializedName("message_id")
    @PrimaryKey
    @Expose
    private String messageId;
    @SerializedName("message_text")
    @Expose
    private String messageText;
    @SerializedName("userdata_fullname")
    @Expose
    private String userdataFullname;

    public boolean areContentsTheSame(ServiceMessages serviceMessages) {
        return false;
    }

    public boolean areItemsTheSame(ServiceMessages serviceMessages) {
        return false;
    }

    public String realmGet$datauserId() {
        return this.datauserId;
    }

    public String realmGet$messageDt() {
        return this.messageDt;
    }

    public String realmGet$messageId() {
        return this.messageId;
    }

    public String realmGet$messageText() {
        return this.messageText;
    }

    public String realmGet$userdataFullname() {
        return this.userdataFullname;
    }

    public void realmSet$datauserId(String str) {
        this.datauserId = str;
    }

    public void realmSet$messageDt(String str) {
        this.messageDt = str;
    }

    public void realmSet$messageId(String str) {
        this.messageId = str;
    }

    public void realmSet$messageText(String str) {
        this.messageText = str;
    }

    public void realmSet$userdataFullname(String str) {
        this.userdataFullname = str;
    }

    public ServiceMessages() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getMessageId() {
        return realmGet$messageId();
    }

    public void setMessageId(String str) {
        realmSet$messageId(str);
    }

    public String getDatauserId() {
        return realmGet$datauserId();
    }

    public void setDatauserId(String str) {
        realmSet$datauserId(str);
    }

    public String getMessageDt() {
        return realmGet$messageDt();
    }

    public void setMessageDt(String str) {
        realmSet$messageDt(str);
    }

    public String getMessageText() {
        return realmGet$messageText();
    }

    public void setMessageText(String str) {
        realmSet$messageText(str);
    }

    public String getUserdataFullname() {
        return realmGet$userdataFullname();
    }

    public void setUserdataFullname(String str) {
        realmSet$userdataFullname(str);
    }
}
