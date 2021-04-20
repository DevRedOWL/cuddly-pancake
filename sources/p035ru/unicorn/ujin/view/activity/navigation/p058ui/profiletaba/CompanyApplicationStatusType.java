package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationStatusType;", "", "title", "", "color", "status", "", "(Ljava/lang/String;IIILjava/lang/Boolean;)V", "getColor", "()I", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "REVIEW", "APPROVED", "CANCELED", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.CompanyApplicationStatusType */
/* compiled from: CompanyApplicationStatusType.kt */
public enum CompanyApplicationStatusType {
    REVIEW(R.string.status_on_review, R.color.company_application_state_review, (int) null),
    APPROVED(R.string.status_approved, R.color.company_application_state_approved, true),
    CANCELED(R.string.status_canceled, R.color.company_application_state_canceled, false);
    
    public static final Companion Companion = null;
    private final int color;
    private final Boolean status;
    private final int title;

    @JvmStatic
    public static final CompanyApplicationStatusType getByNumber(Boolean bool) {
        return Companion.getByNumber(bool);
    }

    private CompanyApplicationStatusType(int i, int i2, Boolean bool) {
        this.title = i;
        this.color = i2;
        this.status = bool;
    }

    public final int getColor() {
        return this.color;
    }

    public final Boolean getStatus() {
        return this.status;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationStatusType$Companion;", "", "()V", "getByNumber", "Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationStatusType;", "status", "", "(Ljava/lang/Boolean;)Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/CompanyApplicationStatusType;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.CompanyApplicationStatusType$Companion */
    /* compiled from: CompanyApplicationStatusType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final CompanyApplicationStatusType getByNumber(Boolean bool) {
            for (CompanyApplicationStatusType companyApplicationStatusType : CompanyApplicationStatusType.values()) {
                if (Intrinsics.areEqual((Object) companyApplicationStatusType.getStatus(), (Object) bool)) {
                    return companyApplicationStatusType;
                }
            }
            return null;
        }
    }
}
