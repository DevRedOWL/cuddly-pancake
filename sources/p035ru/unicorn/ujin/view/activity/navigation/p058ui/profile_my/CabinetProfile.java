package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.CabinetProfile */
public class CabinetProfile {
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("carBrand")
    @Expose
    private String carBrand;
    @SerializedName("carNumber")
    @Expose
    private String carNumber;
    @SerializedName("fio")
    @Expose
    private String fio;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("organization")
    @Expose
    private String organization;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("position")
    @Expose
    private String position;

    public String getFio() {
        return this.fio;
    }

    public void setFio(String str) {
        this.fio = str;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(String str) {
        this.organization = str;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public String getCarNumber() {
        return this.carNumber;
    }

    public void setCarNumber(String str) {
        this.carNumber = str;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public void setCarBrand(String str) {
        this.carBrand = str;
    }

    public String getPhone() {
        return this.phone;
    }
}
