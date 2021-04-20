package p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Enterprise;", "", "actual_address", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getActual_address", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Enterprise */
/* compiled from: Enterprise.kt */
public final class Enterprise {
    private final String actual_address;
    private final String title;

    public static /* synthetic */ Enterprise copy$default(Enterprise enterprise, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enterprise.actual_address;
        }
        if ((i & 2) != 0) {
            str2 = enterprise.title;
        }
        return enterprise.copy(str, str2);
    }

    public final String component1() {
        return this.actual_address;
    }

    public final String component2() {
        return this.title;
    }

    public final Enterprise copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "title");
        return new Enterprise(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Enterprise)) {
            return false;
        }
        Enterprise enterprise = (Enterprise) obj;
        return Intrinsics.areEqual((Object) this.actual_address, (Object) enterprise.actual_address) && Intrinsics.areEqual((Object) this.title, (Object) enterprise.title);
    }

    public int hashCode() {
        String str = this.actual_address;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Enterprise(actual_address=" + this.actual_address + ", title=" + this.title + ")";
    }

    public Enterprise(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "title");
        this.actual_address = str;
        this.title = str2;
    }

    public final String getActual_address() {
        return this.actual_address;
    }

    public final String getTitle() {
        return this.title;
    }
}
