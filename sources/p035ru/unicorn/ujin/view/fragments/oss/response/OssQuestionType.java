package p035ru.unicorn.ujin.view.fragments.oss.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssQuestionType;", "", "slug", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Slug", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssQuestionType */
/* compiled from: OssResponse.kt */
public final class OssQuestionType {
    private final String slug;
    private final String title;

    public static /* synthetic */ OssQuestionType copy$default(OssQuestionType ossQuestionType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ossQuestionType.slug;
        }
        if ((i & 2) != 0) {
            str2 = ossQuestionType.title;
        }
        return ossQuestionType.copy(str, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.title;
    }

    public final OssQuestionType copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "slug");
        Intrinsics.checkNotNullParameter(str2, "title");
        return new OssQuestionType(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssQuestionType)) {
            return false;
        }
        OssQuestionType ossQuestionType = (OssQuestionType) obj;
        return Intrinsics.areEqual((Object) this.slug, (Object) ossQuestionType.slug) && Intrinsics.areEqual((Object) this.title, (Object) ossQuestionType.title);
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
        return "OssQuestionType(slug=" + this.slug + ", title=" + this.title + ")";
    }

    public OssQuestionType(String str, String str2) {
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

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssQuestionType$Slug;", "", "()V", "select", "", "getSelect", "()Ljava/lang/String;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssQuestionType$Slug */
    /* compiled from: OssResponse.kt */
    public static final class Slug {
        public static final Slug INSTANCE = new Slug();
        private static final String select = "SELECT";

        private Slug() {
        }

        public final String getSelect() {
            return select;
        }
    }
}
