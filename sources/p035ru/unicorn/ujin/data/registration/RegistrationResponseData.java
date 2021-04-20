package p035ru.unicorn.ujin.data.registration;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.StringUtils;

/* renamed from: ru.unicorn.ujin.data.registration.RegistrationResponseData */
public class RegistrationResponseData {
    @SerializedName("app_link")
    public AppLink appLink;
    @SerializedName("new_token")
    private String newToken;

    /* renamed from: q1 */
    private String f6709q1;
    private Integer stage;
    private String token;

    public String getToken() {
        return StringUtils.isEmpty(this.token) ? "" : this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getQ1() {
        return StringUtils.isEmpty(this.f6709q1) ? "" : this.f6709q1;
    }

    public void setQ1(String str) {
        this.f6709q1 = str;
    }

    public String getNewToken() {
        return StringUtils.isEmpty(this.newToken) ? "" : this.newToken;
    }

    public void setNewToken(String str) {
        this.newToken = str;
    }

    public int getStage() {
        Integer num = this.stage;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void setStage(int i) {
        this.stage = Integer.valueOf(i);
    }

    /* renamed from: ru.unicorn.ujin.data.registration.RegistrationResponseData$AppLink */
    public class AppLink {

        /* renamed from: android  reason: collision with root package name */
        private String f7032android;
        private String ios;

        public AppLink() {
        }

        public String getAndroid() {
            return this.f7032android;
        }

        public void setAndroid(String str) {
            this.f7032android = str;
        }

        public String getIos() {
            return this.ios;
        }

        public void setIos(String str) {
            this.ios = str;
        }
    }
}
