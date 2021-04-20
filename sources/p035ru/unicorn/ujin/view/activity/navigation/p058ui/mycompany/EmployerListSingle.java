package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.EmployerListSingle */
public class EmployerListSingle {
    @SerializedName("employee")
    UserProfile userProfiles;

    public UserProfile getUserProfiles() {
        return this.userProfiles;
    }

    public void setUserProfiles(UserProfile userProfile) {
        this.userProfiles = userProfile;
    }
}
