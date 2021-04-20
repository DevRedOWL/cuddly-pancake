package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CreateMyCompanyFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyDataIn;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "title", "", "inn", "ogrn", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getInn", "()Ljava/lang/String;", "setInn", "(Ljava/lang/String;)V", "getOgrn", "setOgrn", "getTitle", "setTitle", "areContentsTheSame", "", "other", "areItemsTheSame", "component1", "component2", "component3", "component4", "copy", "equals", "", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.CompanyDataIn */
/* compiled from: CompanyListIn.kt */
public final class CompanyDataIn implements Diffable<CompanyDataIn> {

    /* renamed from: id */
    private int f6837id;
    private String inn;
    private String ogrn;
    private String title;

    public CompanyDataIn() {
        this(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CompanyDataIn copy$default(CompanyDataIn companyDataIn, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = companyDataIn.f6837id;
        }
        if ((i2 & 2) != 0) {
            str = companyDataIn.title;
        }
        if ((i2 & 4) != 0) {
            str2 = companyDataIn.inn;
        }
        if ((i2 & 8) != 0) {
            str3 = companyDataIn.ogrn;
        }
        return companyDataIn.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.f6837id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.inn;
    }

    public final String component4() {
        return this.ogrn;
    }

    public final CompanyDataIn copy(int i, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, CreateMyCompanyFragment.INN);
        Intrinsics.checkNotNullParameter(str3, "ogrn");
        return new CompanyDataIn(i, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanyDataIn)) {
            return false;
        }
        CompanyDataIn companyDataIn = (CompanyDataIn) obj;
        return this.f6837id == companyDataIn.f6837id && Intrinsics.areEqual((Object) this.title, (Object) companyDataIn.title) && Intrinsics.areEqual((Object) this.inn, (Object) companyDataIn.inn) && Intrinsics.areEqual((Object) this.ogrn, (Object) companyDataIn.ogrn);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6837id).hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.inn;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.ogrn;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CompanyDataIn(id=" + this.f6837id + ", title=" + this.title + ", inn=" + this.inn + ", ogrn=" + this.ogrn + ")";
    }

    public CompanyDataIn(int i, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, CreateMyCompanyFragment.INN);
        Intrinsics.checkNotNullParameter(str3, "ogrn");
        this.f6837id = i;
        this.title = str;
        this.inn = str2;
        this.ogrn = str3;
    }

    public final int getId() {
        return this.f6837id;
    }

    public final void setId(int i) {
        this.f6837id = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getInn() {
        return this.inn;
    }

    public final void setInn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.inn = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompanyDataIn(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }

    public final String getOgrn() {
        return this.ogrn;
    }

    public final void setOgrn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ogrn = str;
    }

    public boolean areItemsTheSame(CompanyDataIn companyDataIn) {
        return companyDataIn != null && this.f6837id == companyDataIn.f6837id;
    }

    public boolean areContentsTheSame(CompanyDataIn companyDataIn) {
        return Intrinsics.areEqual((Object) this.inn, (Object) companyDataIn != null ? companyDataIn.inn : null);
    }
}
