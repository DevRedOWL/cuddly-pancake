package p035ru.unicorn.ujin.data.login;

import com.google.android.gms.common.util.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;

/* renamed from: ru.unicorn.ujin.data.login.LoginResponseDataUser */
public class LoginResponseDataUser {
    @SerializedName("apartment")
    private ArrayList<Apartment> apartments;
    @SerializedName("user_avatar")
    private String avatar;
    @SerializedName("user_balance")
    private Integer balance;
    @SerializedName("is_demo")
    private Integer demo;
    @SerializedName("user_mail")
    private String email;
    @SerializedName("user_fullname")
    private String fullName;
    @SerializedName("user_gender")
    private Integer gender;
    @SerializedName("user_search_disable")
    private Integer hideAccount;
    @SerializedName("user_search_disable_fulltext")
    private String hideAccountFullText;
    @SerializedName("user_search_disable_text")
    private String hideAccountText;
    @SerializedName("user_id")

    /* renamed from: id */
    private Long f6630id;
    @SerializedName("user_name")
    private String name;
    @SerializedName("user_patronymic")
    private String patronymic;
    @SerializedName("user_phone")
    private String phone;
    @SerializedName("user_role_id")
    private Integer roleId;
    @SerializedName("stage")
    private Integer stage;
    @SerializedName("user_status")
    private Integer status;
    private List<SubAccount> subAccountList;
    @SerializedName("user_surname")
    private String surname;
    @SerializedName("token")
    private String token;

    public Long getId() {
        Long l = this.f6630id;
        return Long.valueOf(l == null ? 0 : l.longValue());
    }

    public void setId(Long l) {
        this.f6630id = l;
    }

    public String getFullName() {
        return StringUtils.isEmpty(this.fullName) ? "" : this.fullName;
    }

    public void setFullName(String str) {
        this.fullName = str;
    }

    public String getName() {
        return StringUtils.isEmpty(this.name) ? "" : this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getSurname() {
        return StringUtils.isEmpty(this.surname) ? "" : this.surname;
    }

    public void setSurname(String str) {
        this.surname = str;
    }

    public String getPatronymic() {
        return StringUtils.isEmpty(this.patronymic) ? "" : this.patronymic;
    }

    public void setPatronymic(String str) {
        this.patronymic = str;
    }

    public String getEmail() {
        return StringUtils.isEmpty(this.email) ? "" : this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getPhone() {
        return StringUtils.isEmpty(this.phone) ? "" : this.phone;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public Integer getBalance() {
        Integer num = this.balance;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public void setBalance(Integer num) {
        this.balance = num;
    }

    public String getToken() {
        return StringUtils.isEmpty(this.token) ? "" : this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public Integer getStage() {
        Integer num = this.stage;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public void setStage(Integer num) {
        this.stage = num;
    }

    public boolean isHideAccount() {
        return this.hideAccount.intValue() == 1;
    }

    public void setHideAccount(boolean z) {
        this.hideAccount = Integer.valueOf(z ? 1 : 0);
    }

    public String getHideAccountText() {
        return StringUtils.isEmpty(this.hideAccountText) ? "" : this.hideAccountText;
    }

    public void setHideAccountText(String str) {
        this.hideAccountText = str;
    }

    public String getHideAccountFullText() {
        return StringUtils.isEmpty(this.hideAccountFullText) ? "" : this.hideAccountFullText;
    }

    public void setHideAccountFullText(String str) {
        this.hideAccountFullText = str;
    }

    public Boolean isDemo() {
        boolean z = false;
        if (this.demo == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void setDemo(boolean z) {
        this.demo = Integer.valueOf(z ? 1 : 0);
    }

    public ArrayList<Apartment> getApartments() {
        return CollectionUtils.isEmpty(this.apartments) ? new ArrayList<>() : this.apartments;
    }

    public void setApartments(ArrayList<Apartment> arrayList) {
        this.apartments = arrayList;
    }

    public List<SubAccount> getSubAccountList() {
        return CollectionUtils.isEmpty(this.subAccountList) ? new ArrayList() : this.subAccountList;
    }

    public void setSubAccountList(List<SubAccount> list) {
        this.subAccountList = list;
    }

    public String getAvatar() {
        return StringUtils.isEmpty(this.avatar) ? "" : this.avatar;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public Integer getStatus() {
        Integer num = this.status;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public Integer getRoleId() {
        Integer num = this.roleId;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public void setRoleId(Integer num) {
        this.roleId = num;
    }

    public Integer getGender() {
        return Integer.valueOf(this.gender == null ? 0 : 1);
    }

    public void setGender(Integer num) {
        this.gender = num;
    }
}
