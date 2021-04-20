package p035ru.unicorn.ujin.market.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/CompanyContactType;", "", "icon", "", "(Ljava/lang/String;II)V", "getIcon", "()I", "ADDRESS", "EMAIL", "WEBSITE", "PHONE", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.enums.CompanyContactType */
/* compiled from: CompanyContactType.kt */
public enum CompanyContactType {
    ADDRESS(R.drawable.icon_contact_address),
    EMAIL(R.drawable.icon_contact_email),
    WEBSITE(R.drawable.icon_contact_website),
    PHONE(R.drawable.icon_contact_phone);
    
    public static final Companion Companion = null;
    private final int icon;

    private CompanyContactType(int i) {
        this.icon = i;
    }

    public final int getIcon() {
        return this.icon;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/CompanyContactType$Companion;", "", "()V", "getIcon", "", "name", "", "getType", "Lru/unicorn/ujin/market/enums/CompanyContactType;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.enums.CompanyContactType$Companion */
    /* compiled from: CompanyContactType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getIcon(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return CompanyContactType.valueOf(upperCase).getIcon();
        }

        public final CompanyContactType getType(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return CompanyContactType.valueOf(upperCase);
        }
    }
}
