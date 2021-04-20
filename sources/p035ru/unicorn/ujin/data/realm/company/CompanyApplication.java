package p035ru.unicorn.ujin.data.realm.company;

import kotlin.Metadata;
import p046io.realm.C4600xd2ac66e2;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/company/CompanyApplication;", "Lio/realm/RealmObject;", "status", "", "enterprise", "Lru/unicorn/ujin/data/realm/company/EnterpriseApplication;", "comment", "", "(Ljava/lang/Boolean;Lru/unicorn/ujin/data/realm/company/EnterpriseApplication;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "getEnterprise", "()Lru/unicorn/ujin/data/realm/company/EnterpriseApplication;", "setEnterprise", "(Lru/unicorn/ujin/data/realm/company/EnterpriseApplication;)V", "getStatus", "()Ljava/lang/Boolean;", "setStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.company.CompanyApplication */
/* compiled from: CompanyApplication.kt */
public class CompanyApplication extends RealmObject implements C4600xd2ac66e2 {
    private String comment;
    private EnterpriseApplication enterprise;
    private Boolean status;

    public CompanyApplication() {
        this((Boolean) null, (EnterpriseApplication) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$comment() {
        return this.comment;
    }

    public EnterpriseApplication realmGet$enterprise() {
        return this.enterprise;
    }

    public Boolean realmGet$status() {
        return this.status;
    }

    public void realmSet$comment(String str) {
        this.comment = str;
    }

    public void realmSet$enterprise(EnterpriseApplication enterpriseApplication) {
        this.enterprise = enterpriseApplication;
    }

    public void realmSet$status(Boolean bool) {
        this.status = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompanyApplication(Boolean bool, EnterpriseApplication enterpriseApplication, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : enterpriseApplication, (i & 4) != 0 ? null : str);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final Boolean getStatus() {
        return realmGet$status();
    }

    public final void setStatus(Boolean bool) {
        realmSet$status(bool);
    }

    public final EnterpriseApplication getEnterprise() {
        return realmGet$enterprise();
    }

    public final void setEnterprise(EnterpriseApplication enterpriseApplication) {
        realmSet$enterprise(enterpriseApplication);
    }

    public final String getComment() {
        return realmGet$comment();
    }

    public final void setComment(String str) {
        realmSet$comment(str);
    }

    public CompanyApplication(Boolean bool, EnterpriseApplication enterpriseApplication, String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$status(bool);
        realmSet$enterprise(enterpriseApplication);
        realmSet$comment(str);
    }
}
