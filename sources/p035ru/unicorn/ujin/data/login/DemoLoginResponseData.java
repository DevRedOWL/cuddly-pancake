package p035ru.unicorn.ujin.data.login;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.data.realm.profile.DemoUser;

/* renamed from: ru.unicorn.ujin.data.login.DemoLoginResponseData */
public class DemoLoginResponseData {
    @SerializedName("user")
    private DemoUser user;

    public DemoUser getUser() {
        return this.user;
    }
}
