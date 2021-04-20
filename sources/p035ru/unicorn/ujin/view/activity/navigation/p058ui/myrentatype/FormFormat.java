package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.FormFormat */
public class FormFormat {
    private String body;
    @SerializedName("button")
    private ButtonSettings buttonSettings;

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public ButtonSettings getButtonSettings() {
        return this.buttonSettings;
    }

    public void setButtonSettings(ButtonSettings buttonSettings2) {
        this.buttonSettings = buttonSettings2;
    }
}
