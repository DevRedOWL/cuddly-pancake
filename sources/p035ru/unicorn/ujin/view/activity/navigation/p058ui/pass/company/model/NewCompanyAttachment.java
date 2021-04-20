package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/NewCompanyAttachment;", "", "id", "", "type", "", "(ILjava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyAttachment */
/* compiled from: NewCompanyOUT.kt */
public final class NewCompanyAttachment {

    /* renamed from: id */
    private int f6838id;
    private String type;

    public NewCompanyAttachment() {
        this(0, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NewCompanyAttachment copy$default(NewCompanyAttachment newCompanyAttachment, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newCompanyAttachment.f6838id;
        }
        if ((i2 & 2) != 0) {
            str = newCompanyAttachment.type;
        }
        return newCompanyAttachment.copy(i, str);
    }

    public final int component1() {
        return this.f6838id;
    }

    public final String component2() {
        return this.type;
    }

    public final NewCompanyAttachment copy(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        return new NewCompanyAttachment(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCompanyAttachment)) {
            return false;
        }
        NewCompanyAttachment newCompanyAttachment = (NewCompanyAttachment) obj;
        return this.f6838id == newCompanyAttachment.f6838id && Intrinsics.areEqual((Object) this.type, (Object) newCompanyAttachment.type);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6838id).hashCode() * 31;
        String str = this.type;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NewCompanyAttachment(id=" + this.f6838id + ", type=" + this.type + ")";
    }

    public NewCompanyAttachment(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        this.f6838id = i;
        this.type = str;
    }

    public final int getId() {
        return this.f6838id;
    }

    public final void setId(int i) {
        this.f6838id = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewCompanyAttachment(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
