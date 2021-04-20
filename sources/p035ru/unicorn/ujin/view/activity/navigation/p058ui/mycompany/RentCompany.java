package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.EmployeeDataType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p046io.realm.C4739xa49e67fc;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.Ignore;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany */
public class RentCompany extends RealmObject implements IKeyValueData, EmployeeDataType, C4739xa49e67fc {
    @SerializedName("actual_address")
    private String address;
    @SerializedName("director_id")
    @Expose
    private int directorId;
    @SerializedName("employee_permissions")
    private RealmList<String> employeePermissions;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private String f6803id;
    @SerializedName("inn")
    @Expose
    private String inn;
    @SerializedName("is_director")
    @Expose
    private boolean isDirector;
    @SerializedName("employee_is_verified")
    private boolean isEmployeeVerified;
    @SerializedName("is_verified")
    private boolean isVerified;
    @SerializedName("ogrn")
    @Expose
    private String ogrn;
    @SerializedName("okved")
    @Expose
    private String okved;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("employees")
    @Ignore
    private List<UserProfile> userProfiles;

    public int getDataType() {
        return 0;
    }

    public Object getValue() {
        return null;
    }

    public String realmGet$address() {
        return this.address;
    }

    public int realmGet$directorId() {
        return this.directorId;
    }

    public RealmList realmGet$employeePermissions() {
        return this.employeePermissions;
    }

    public String realmGet$id() {
        return this.f6803id;
    }

    public String realmGet$inn() {
        return this.inn;
    }

    public boolean realmGet$isDirector() {
        return this.isDirector;
    }

    public boolean realmGet$isEmployeeVerified() {
        return this.isEmployeeVerified;
    }

    public boolean realmGet$isVerified() {
        return this.isVerified;
    }

    public String realmGet$ogrn() {
        return this.ogrn;
    }

    public String realmGet$okved() {
        return this.okved;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$address(String str) {
        this.address = str;
    }

    public void realmSet$directorId(int i) {
        this.directorId = i;
    }

    public void realmSet$employeePermissions(RealmList realmList) {
        this.employeePermissions = realmList;
    }

    public void realmSet$id(String str) {
        this.f6803id = str;
    }

    public void realmSet$inn(String str) {
        this.inn = str;
    }

    public void realmSet$isDirector(boolean z) {
        this.isDirector = z;
    }

    public void realmSet$isEmployeeVerified(boolean z) {
        this.isEmployeeVerified = z;
    }

    public void realmSet$isVerified(boolean z) {
        this.isVerified = z;
    }

    public void realmSet$ogrn(String str) {
        this.ogrn = str;
    }

    public void realmSet$okved(String str) {
        this.okved = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public RentCompany() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public List<UserProfile> getUserProfiles() {
        return this.userProfiles;
    }

    public void setUserProfiles(List<UserProfile> list) {
        this.userProfiles = list;
    }

    public static Map<IKeyValueData.OPTIONS, Object> setValues() {
        HashMap hashMap = new HashMap();
        hashMap.put(IKeyValueData.OPTIONS.ARROW, true);
        return hashMap;
    }

    public String getOkved() {
        return realmGet$okved();
    }

    public void setOkved(String str) {
        realmSet$okved(str);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getOgrn() {
        return realmGet$ogrn();
    }

    public void setOgrn(String str) {
        realmSet$ogrn(str);
    }

    public String getInn() {
        return realmGet$inn();
    }

    public void setInn(String str) {
        realmSet$inn(str);
    }

    public int getDirectorId() {
        return realmGet$directorId();
    }

    public void setDirectorId(int i) {
        realmSet$directorId(i);
    }

    public boolean areItemsTheSame(IKeyValueData iKeyValueData) {
        return getKey().equals(iKeyValueData.getKey());
    }

    public boolean areContentsTheSame(IKeyValueData iKeyValueData) {
        return realmGet$title().equals(iKeyValueData.getValue());
    }

    public Integer getDataId() {
        return Integer.valueOf(Integer.parseInt(getId()));
    }

    public String getKey() {
        return realmGet$title();
    }

    public boolean isDirector() {
        return realmGet$isDirector();
    }

    public void setIsDirector(boolean z) {
        realmSet$isDirector(z);
    }

    public Map<IKeyValueData.OPTIONS, Object> getOptions() {
        return new HashMap();
    }

    /* renamed from: to */
    public static List<IKeyValueData> m6927to(List<RentCompany> list) {
        return new ArrayList(list);
    }

    /* renamed from: to */
    public static List<IKeyValueData> m6928to(RentCompany rentCompany) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IKeyValueDataImpl("Название", rentCompany.realmGet$title()));
        arrayList.add(new IKeyValueDataImpl(CreateMyCompanyFragment.OGRN, rentCompany.getOgrn()));
        arrayList.add(new IKeyValueDataImpl("ИНН", rentCompany.getInn()));
        arrayList.add(new IKeyValueDataImpl("ОКВЭД", rentCompany.getOkved()));
        arrayList.add(new IKeyValueDataImpl("Адрес", rentCompany.getAddress()));
        arrayList.add(new IKeyValueDataImpl("Статус", rentCompany.isVerified() ? "Верифицирована" : "Не верифицирована"));
        return arrayList;
    }

    public static List<String> onlyComapyName(List<RentCompany> list) {
        ArrayList arrayList = new ArrayList();
        for (RentCompany title2 : list) {
            arrayList.add(title2.getTitle());
        }
        return arrayList;
    }

    public String toString() {
        return realmGet$title();
    }

    public boolean isVerified() {
        return realmGet$isVerified();
    }

    public void setVerified(boolean z) {
        realmSet$isVerified(z);
    }

    public String getAddress() {
        return realmGet$address();
    }

    public boolean isEmployeeVerified() {
        return realmGet$isEmployeeVerified();
    }

    public void setEmployeeVerified(boolean z) {
        realmSet$isEmployeeVerified(z);
    }

    public RealmList<String> getEmployeePermissions() {
        return realmGet$employeePermissions();
    }

    public void setEmployeePermissions(RealmList<String> realmList) {
        realmSet$employeePermissions(realmList);
    }
}
