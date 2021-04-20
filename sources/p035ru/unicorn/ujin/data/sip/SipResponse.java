package p035ru.unicorn.ujin.data.sip;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.StringUtils;
import p035ru.unicorn.ujin.data.realm.SipParametrs;

/* renamed from: ru.unicorn.ujin.data.sip.SipResponse */
public class SipResponse {
    private String command;
    private SipParametrs data;
    private Integer error;
    @SerializedName("fromdomain")
    private String fromDomain;
    private String message;
    @SerializedName("worktime")
    private String workTime;

    public void setError(Integer num) {
        this.error = num;
    }

    public SipParametrs getData() {
        return this.data;
    }

    public void setData(SipParametrs sipParametrs) {
        this.data = sipParametrs;
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
