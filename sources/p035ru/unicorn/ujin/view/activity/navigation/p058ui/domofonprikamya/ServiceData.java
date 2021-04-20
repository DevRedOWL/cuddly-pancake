package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4689x93e0fb82;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.Ignore;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceData */
public class ServiceData extends RealmObject implements C4689x93e0fb82 {
    @SerializedName("agreement_message")
    @Expose
    private String agreementMessage;
    @SerializedName("company_title")
    @Expose
    private String companyTitle;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("files")
    @Expose
    private RealmList<FilesUrl> files;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private Integer f6769id;
    @Ignore
    private boolean isAgree;
    @SerializedName("status")
    @Expose
    private ServiceStatus status;
    @SerializedName("title")
    @Expose
    private String title;

    public String realmGet$agreementMessage() {
        return this.agreementMessage;
    }

    public String realmGet$companyTitle() {
        return this.companyTitle;
    }

    public String realmGet$description() {
        return this.description;
    }

    public RealmList realmGet$files() {
        return this.files;
    }

    public Integer realmGet$id() {
        return this.f6769id;
    }

    public ServiceStatus realmGet$status() {
        return this.status;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$agreementMessage(String str) {
        this.agreementMessage = str;
    }

    public void realmSet$companyTitle(String str) {
        this.companyTitle = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$files(RealmList realmList) {
        this.files = realmList;
    }

    public void realmSet$id(Integer num) {
        this.f6769id = num;
    }

    public void realmSet$status(ServiceStatus serviceStatus) {
        this.status = serviceStatus;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public ServiceData() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$files((RealmList) null);
        this.isAgree = false;
    }

    public Integer getId() {
        return realmGet$id();
    }

    public void setId(Integer num) {
        realmSet$id(num);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getDescription() {
        return realmGet$description();
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public String getCompanyTitle() {
        return realmGet$companyTitle();
    }

    public void setCompanyTitle(String str) {
        realmSet$companyTitle(str);
    }

    public ServiceStatus getStatus() {
        return realmGet$status();
    }

    public void setStatus(ServiceStatus serviceStatus) {
        realmSet$status(serviceStatus);
    }

    public String getAgreementMessage() {
        return realmGet$agreementMessage();
    }

    public void setAgreementMessage(String str) {
        realmSet$agreementMessage(str);
    }

    public RealmList<FilesUrl> getFiles() {
        return realmGet$files();
    }

    public void setFiles(RealmList<FilesUrl> realmList) {
        realmSet$files(realmList);
    }

    public boolean isAgree() {
        return this.isAgree;
    }

    public void setAgree(boolean z) {
        this.isAgree = z;
    }
}
