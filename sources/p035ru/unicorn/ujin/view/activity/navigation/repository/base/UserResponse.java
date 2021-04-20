package p035ru.unicorn.ujin.view.activity.navigation.repository.base;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.base.UserResponse */
public class UserResponse extends Resource<User> {
    @SerializedName("user")
    private User user;

    public UserResponse(User user2, Resource.Status status) {
        super(user2, status);
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
