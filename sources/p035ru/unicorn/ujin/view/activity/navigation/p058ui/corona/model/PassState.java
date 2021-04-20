package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassState;", "", "slug", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.PassState */
/* compiled from: PassListIn.kt */
public final class PassState {
    private final String slug;
    private final String title;

    public static /* synthetic */ PassState copy$default(PassState passState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passState.slug;
        }
        if ((i & 2) != 0) {
            str2 = passState.title;
        }
        return passState.copy(str, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.title;
    }

    public final PassState copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "slug");
        Intrinsics.checkNotNullParameter(str2, "title");
        return new PassState(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassState)) {
            return false;
        }
        PassState passState = (PassState) obj;
        return Intrinsics.areEqual((Object) this.slug, (Object) passState.slug) && Intrinsics.areEqual((Object) this.title, (Object) passState.title);
    }

    public int hashCode() {
        String str = this.slug;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PassState(slug=" + this.slug + ", title=" + this.title + ")";
    }

    public PassState(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "slug");
        Intrinsics.checkNotNullParameter(str2, "title");
        this.slug = str;
        this.title = str2;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTitle() {
        return this.title;
    }
}
