package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/SearchBodyOut;", "", "type", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "inn", "getInn", "()Ljava/lang/String;", "ogrn", "getOgrn", "getTitle", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.SearchBodyOut */
/* compiled from: SearchBodyOut.kt */
public final class SearchBodyOut {
    private final String inn;
    private final String ogrn;
    private final String title;
    private final String type;

    public static /* synthetic */ SearchBodyOut copy$default(SearchBodyOut searchBodyOut, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchBodyOut.type;
        }
        if ((i & 2) != 0) {
            str2 = searchBodyOut.title;
        }
        return searchBodyOut.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.title;
    }

    public final SearchBodyOut copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "title");
        return new SearchBodyOut(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBodyOut)) {
            return false;
        }
        SearchBodyOut searchBodyOut = (SearchBodyOut) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) searchBodyOut.type) && Intrinsics.areEqual((Object) this.title, (Object) searchBodyOut.title);
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SearchBodyOut(type=" + this.type + ", title=" + this.title + ")";
    }

    public SearchBodyOut(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "title");
        this.type = str;
        this.title = str2;
        String str3 = this.title;
        this.inn = str3;
        this.ogrn = str3;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getInn() {
        return this.inn;
    }

    public final String getOgrn() {
        return this.ogrn;
    }
}
