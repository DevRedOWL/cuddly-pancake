package p035ru.unicorn.ujin.data.registration;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.StringUtils;

/* renamed from: ru.unicorn.ujin.data.registration.RegistrationResponse */
public class RegistrationResponse {
    private String command;
    private RegistrationResponseData data;
    private Integer error;
    @SerializedName("fromdomain")
    private String fromDomain;
    private String message;
    private String token;
    @SerializedName("worktime")
    private String workTime;

    public RegistrationResponseData getData() {
        return this.data;
    }

    public void setData(RegistrationResponseData registrationResponseData) {
        this.data = registrationResponseData;
    }

    public String getCommand() {
        return StringUtils.isEmpty(this.command) ? "" : this.command;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public int getError() {
        Integer num = this.error;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public void setError(int i) {
        this.error = Integer.valueOf(i);
    }

    public String getMessage() {
        return StringUtils.isEmpty(this.message) ? "" : this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getToken() {
        return StringUtils.isEmpty(this.token) ? "" : this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getFromDomain() {
        return StringUtils.isEmpty(this.fromDomain) ? "" : this.fromDomain;
    }

    public void setFromDomain(String str) {
        this.fromDomain = str;
    }

    public String getWorkTime() {
        return StringUtils.isEmpty(this.workTime) ? "" : this.workTime;
    }

    public void setWorkTime(String str) {
        this.workTime = str;
    }
}
