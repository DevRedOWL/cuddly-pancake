package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyAttachment;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CreateCompanyModel */
public class CreateCompanyModel {
    /* access modifiers changed from: private */
    @SerializedName("actual_address")
    public String address;
    private boolean allFieldCorrect;
    /* access modifiers changed from: private */
    @SerializedName("attachments")
    public List<NewCompanyAttachment> attachments;
    @SerializedName("id")

    /* renamed from: id */
    private String f6802id;
    /* access modifiers changed from: private */
    @SerializedName("inn")
    public String inn;
    /* access modifiers changed from: private */
    @SerializedName("ogrn")
    public String ogrn;
    /* access modifiers changed from: private */
    @SerializedName("okved")
    public String okved;
    /* access modifiers changed from: private */
    @SerializedName("title")
    public String title;

    public CreateCompanyModel(String str, String str2, String str3) {
        this.title = str;
        this.ogrn = str2;
        this.inn = str3;
        this.allFieldCorrect = !str.isEmpty() && !str2.isEmpty() && !str3.isEmpty();
    }

    public CreateCompanyModel(String str, String str2, String str3, String str4) {
        this.title = str;
        this.ogrn = str2;
        this.inn = str3;
        this.f6802id = str4;
    }

    public CreateCompanyModel(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.ogrn = str3;
        this.inn = str2;
        this.okved = str4;
        this.address = str5;
    }

    public CreateCompanyModel(@Nullable String str) {
        this.f6802id = str;
    }

    public CreateCompanyModel(String str, String str2, String str3, String str4, String str5, List<NewCompanyAttachment> list) {
        this.title = str;
        this.ogrn = str3;
        this.inn = str2;
        this.okved = str4;
        this.address = str5;
        this.attachments = list;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getOgrn() {
        return this.ogrn;
    }

    public void setOgrn(String str) {
        this.ogrn = str;
    }

    public String getInn() {
        return this.inn;
    }

    public void setInn(String str) {
        this.inn = str;
    }

    public String getId() {
        return this.f6802id;
    }

    public void setId(String str) {
        this.f6802id = str;
    }

    public boolean isAllFieldCorrect() {
        return this.allFieldCorrect;
    }

    public void setAllFieldCorrect(boolean z) {
        this.allFieldCorrect = z;
    }

    public String toString() {
        return "CreateCompanyModel{title='" + this.title + '\'' + ", ogrn='" + this.ogrn + '\'' + ", inn='" + this.inn + '\'' + '}';
    }

    public List<NewCompanyAttachment> getAttachments() {
        return this.attachments;
    }

    public void setAttachments(List<NewCompanyAttachment> list) {
        this.attachments = list;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CreateCompanyModel$CreateCompanyObject */
    public static class CreateCompanyObject {
        @SerializedName("enterprise")
        CreateCompanyModel createCompanyModel;

        public CreateCompanyObject(CreateCompanyModel createCompanyModel2) {
            this.createCompanyModel = new CreateCompanyModel(createCompanyModel2.title, createCompanyModel2.inn, createCompanyModel2.ogrn, createCompanyModel2.okved, createCompanyModel2.address, createCompanyModel2.attachments);
        }
    }
}
