package p035ru.unicorn.ujin.view.activity.navigation.repository.base;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.data.realm.profile.User;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.base.UserData */
public class UserData {
    @SerializedName("user")
    private User user;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
