package p035ru.unicorn.ujin.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import p035ru.unicorn.ujin.data.login.LoginResponseDataUser;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.util.LinphoneHelper;
import p035ru.unicorn.ujin.util.ServiceHelper;
import p046io.realm.Realm;

/* renamed from: ru.unicorn.ujin.data.Profile */
public class Profile {
    private static final long DEMO_TIMEOUT = 1800000;
    private static final String PREFERENCE_DEMO_USER = "demoUserR";
    public static final String PREFERENCE_FIREBASE = "firebase";
    private static final String PREFERENCE_PROFILE_DATA = "profileData";
    private static final String PREFERENCE_TOKEN = "tokenT";
    private static final String PREFERENCE_USER_LOGGED_IN = "userLoggedIn";
    private static volatile Profile instance;
    private Context context;
    private LoginResponseDataUser data;
    private boolean demoUser;
    private boolean firstTimeSinceLogin = false;
    private long lastActionTimestamp = System.currentTimeMillis();
    private String token;
    private boolean userLoggedIn;

    private Profile(Context context2) {
        this.context = context2;
        SharedPreferences sharedPreferences = context2.getSharedPreferences(PREFERENCE_PROFILE_DATA, 0);
        this.data = (LoginResponseDataUser) new Gson().fromJson(sharedPreferences.getString(PREFERENCE_PROFILE_DATA, ""), LoginResponseDataUser.class);
        this.userLoggedIn = sharedPreferences.getBoolean(PREFERENCE_USER_LOGGED_IN, false);
        this.demoUser = sharedPreferences.getBoolean(PREFERENCE_DEMO_USER, false);
        this.token = sharedPreferences.getString(PREFERENCE_TOKEN, "");
    }

    public static Profile getInstance(Context context2) {
        if (instance == null) {
            synchronized (Profile.class) {
                if (instance == null) {
                    instance = new Profile(context2);
                }
            }
        }
        return instance;
    }

    public LoginResponseDataUser getData() {
        return this.data;
    }

    public void setData(LoginResponseDataUser loginResponseDataUser) {
        this.data = loginResponseDataUser;
        this.userLoggedIn = true;
        this.demoUser = false;
        this.token = loginResponseDataUser.getToken();
        saveData();
        LinphoneHelper.pushToken(this.context, loginResponseDataUser.getToken(), true);
        AppUtils.saveKeyValuePair("token", loginResponseDataUser.getToken(), this.context);
    }

    public void setData(String str) {
        this.data = new LoginResponseDataUser();
        this.data.setToken(str);
        this.data.setHideAccount(false);
        this.userLoggedIn = true;
        this.demoUser = false;
        saveData();
        LinphoneHelper.pushToken(this.context, str, true);
        AppUtils.saveKeyValuePair("token", this.data.getToken(), this.context);
    }

    public void saveData() {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(PREFERENCE_PROFILE_DATA, 0).edit();
        edit.putString(PREFERENCE_PROFILE_DATA, new Gson().toJson((Object) this.data));
        edit.putBoolean(PREFERENCE_USER_LOGGED_IN, this.userLoggedIn);
        edit.putBoolean(PREFERENCE_DEMO_USER, this.demoUser);
        edit.putString(PREFERENCE_TOKEN, this.token);
        edit.apply();
    }

    public void deleteData() {
        ServiceHelper.stopLinphoneService(this.context);
        LinphoneHelper.deleteAccount();
        deleteSip();
        LoginResponseDataUser loginResponseDataUser = this.data;
        if (loginResponseDataUser != null) {
            LinphoneHelper.pushToken(this.context, loginResponseDataUser.getToken(), false);
        } else {
            LinphoneHelper.pushToken(this.context, this.token, false);
        }
        ServiceHelper.stopLocationService(this.context);
        this.data = null;
        this.userLoggedIn = false;
        this.demoUser = true;
        this.token = "";
        saveData();
    }

    public void deleteSip() {
        Realm defaultInstance = Realm.getDefaultInstance();
        defaultInstance.beginTransaction();
        defaultInstance.delete(SipParametrs.class);
        defaultInstance.commitTransaction();
        defaultInstance.close();
    }

    public boolean isUserLoggedIn() {
        return this.userLoggedIn;
    }

    private void setUserLoggedIn(boolean z) {
        this.userLoggedIn = z;
    }

    public boolean isDemoUser() {
        return this.demoUser;
    }

    public void setDemoUser(boolean z) {
        this.demoUser = z;
    }

    public void registerGhostUser(String str) {
        this.data = new LoginResponseDataUser();
        this.data.setToken(str);
        this.userLoggedIn = false;
        this.demoUser = true;
        saveData();
    }

    public void saveFirebaseToProfile(String str) {
        AppUtils.saveKeyValuePair("firebase", str, this.context);
        SharedPreferences.Editor edit = this.context.getSharedPreferences(PREFERENCE_PROFILE_DATA, 0).edit();
        edit.putString("firebase", str);
        edit.apply();
    }

    public String getFirebaseDataFromProfile() {
        return this.context.getSharedPreferences(PREFERENCE_PROFILE_DATA, 0).getString("firebase", (String) null);
    }

    public void updateLastActionTimestamp() {
        this.lastActionTimestamp = System.currentTimeMillis();
    }

    public boolean isTimeoutExpiredForDemoUser() {
        return System.currentTimeMillis() - this.lastActionTimestamp > 1800000 && this.demoUser;
    }

    public boolean isFirstTimeSinceLogin() {
        return this.firstTimeSinceLogin;
    }

    public void setFirstTimeSinceLogin(boolean z) {
        this.firstTimeSinceLogin = z;
    }
}
