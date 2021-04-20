package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.data.realm.PushAction */
public class PushAction {
    @SerializedName("url")
    private String actionUrl;
    @SerializedName("action_title")
    private String buttonTitle;
    @SerializedName("body")
    private String pushBody;
    @SerializedName("title")
    private String pushTitle;

    public String getActionUrl() {
        return this.actionUrl;
    }

    public String getButtonTitle() {
        return this.buttonTitle;
    }

    public void setActionUrl(String str) {
        this.actionUrl = str;
    }

    public String getPushTitle() {
        return this.pushTitle;
    }

    public void setPushTitle(String str) {
        this.pushTitle = str;
    }

    public String getPushBody() {
        return this.pushBody;
    }

    public void setPushBody(String str) {
        this.pushBody = str;
    }

    public void setButtonTitle(String str) {
        this.buttonTitle = str;
    }
}
