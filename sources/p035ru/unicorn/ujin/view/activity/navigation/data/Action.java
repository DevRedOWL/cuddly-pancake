package p035ru.unicorn.ujin.view.activity.navigation.data;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.data.Action */
public class Action {
    public static final String CALL = "call";
    public static final String FRAGMENT = "fragment";
    public static final String OPEN_DOOR = "open_door";
    public static final String VIDEO = "video";
    @SerializedName("action")
    private String action;
    @SerializedName("call-number")
    private String callNumber;
    private String name;
    private String value;

    public Action(String str, String str2) {
        this.action = str;
        this.callNumber = str2;
    }

    public Action(String str) {
        this.name = str;
    }

    public Action(String str, String str2, boolean z) {
        this.name = str;
        this.value = str2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getCallNumber() {
        return this.callNumber;
    }

    public void setCallNumber(String str) {
        this.callNumber = str;
    }
}
