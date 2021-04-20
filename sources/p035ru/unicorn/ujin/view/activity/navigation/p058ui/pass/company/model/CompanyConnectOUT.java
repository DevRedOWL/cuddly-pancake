package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyConnectOUT;", "", "enterprise_id", "", "(I)V", "getEnterprise_id", "()I", "setEnterprise_id", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.CompanyConnectOUT */
/* compiled from: CompanyConnectOUT.kt */
public final class CompanyConnectOUT {
    private int enterprise_id;

    public CompanyConnectOUT() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CompanyConnectOUT copy$default(CompanyConnectOUT companyConnectOUT, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = companyConnectOUT.enterprise_id;
        }
        return companyConnectOUT.copy(i);
    }

    public final int component1() {
        return this.enterprise_id;
    }

    public final CompanyConnectOUT copy(int i) {
        return new CompanyConnectOUT(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CompanyConnectOUT) && this.enterprise_id == ((CompanyConnectOUT) obj).enterprise_id;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.enterprise_id).hashCode();
    }

    public String toString() {
        return "CompanyConnectOUT(enterprise_id=" + this.enterprise_id + ")";
    }

    public CompanyConnectOUT(int i) {
        this.enterprise_id = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompanyConnectOUT(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i);
    }

    public final int getEnterprise_id() {
        return this.enterprise_id;
    }

    public final void setEnterprise_id(int i) {
        this.enterprise_id = i;
    }
}
