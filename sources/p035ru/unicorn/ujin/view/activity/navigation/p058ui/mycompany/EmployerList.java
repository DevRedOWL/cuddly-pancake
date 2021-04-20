package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.EmployerList */
public class EmployerList {
    @SerializedName("employees")
    private List<UserProfile> userProfiles;

    public List<UserProfile> getUserProfiles() {
        return this.userProfiles;
    }

    public void setUserProfiles(List<UserProfile> list) {
        this.userProfiles = list;
    }
}
