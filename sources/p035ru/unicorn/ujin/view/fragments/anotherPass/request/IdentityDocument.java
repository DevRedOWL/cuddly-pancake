package p035ru.unicorn.ujin.view.fragments.anotherPass.request;

import androidx.databinding.BaseObservable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/request/IdentityDocument;", "Landroidx/databinding/BaseObservable;", "type", "", "number", "issuedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIssuedDate", "()Ljava/lang/String;", "setIssuedDate", "(Ljava/lang/String;)V", "getNumber", "setNumber", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument */
/* compiled from: CreateAnotherPassRequestBody.kt */
public final class IdentityDocument extends BaseObservable {
    @SerializedName("issued_date")
    private String issuedDate;
    private String number;
    private String type;

    public static /* synthetic */ IdentityDocument copy$default(IdentityDocument identityDocument, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identityDocument.type;
        }
        if ((i & 2) != 0) {
            str2 = identityDocument.number;
        }
        if ((i & 4) != 0) {
            str3 = identityDocument.issuedDate;
        }
        return identityDocument.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.number;
    }

    public final String component3() {
        return this.issuedDate;
    }

    public final IdentityDocument copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_NUMBER);
        Intrinsics.checkNotNullParameter(str3, "issuedDate");
        return new IdentityDocument(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityDocument)) {
            return false;
        }
        IdentityDocument identityDocument = (IdentityDocument) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) identityDocument.type) && Intrinsics.areEqual((Object) this.number, (Object) identityDocument.number) && Intrinsics.areEqual((Object) this.issuedDate, (Object) identityDocument.issuedDate);
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.number;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.issuedDate;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "IdentityDocument(type=" + this.type + ", number=" + this.number + ", issuedDate=" + this.issuedDate + ")";
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getNumber() {
        return this.number;
    }

    public final void setNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.number = str;
    }

    public final String getIssuedDate() {
        return this.issuedDate;
    }

    public final void setIssuedDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.issuedDate = str;
    }

    public IdentityDocument(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_NUMBER);
        Intrinsics.checkNotNullParameter(str3, "issuedDate");
        this.type = str;
        this.number = str2;
        this.issuedDate = str3;
    }
}
