package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.ButtonSettings */
public class ButtonSettings {
    private String action;
    @SerializedName("action_value")
    private String actionValue;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getActionValue() {
        return this.actionValue;
    }

    public void setActionValue(String str) {
        this.actionValue = str;
    }
}
