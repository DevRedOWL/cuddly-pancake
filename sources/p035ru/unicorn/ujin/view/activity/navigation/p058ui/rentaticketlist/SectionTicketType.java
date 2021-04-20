package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\t¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/SectionTicketType;", "", "id", "", "title", "(Ljava/lang/String;III)V", "getId", "()I", "getTitle", "ACCOMPLISHMENT", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.SectionTicketType */
/* compiled from: SectionTicketType.kt */
public enum SectionTicketType {
    ACCOMPLISHMENT(72, R.string.ticket_accomplishment);
    
    public static final Companion Companion = null;

    /* renamed from: id */
    private final int f6860id;
    private final int title;

    @JvmStatic
    public static final SectionTicketType getByNumber(String str) {
        return Companion.getByNumber(str);
    }

    @JvmStatic
    public static final SectionTicketType getType(String str) {
        return Companion.getType(str);
    }

    private SectionTicketType(int i, int i2) {
        this.f6860id = i;
        this.title = i2;
    }

    public final int getId() {
        return this.f6860id;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/SectionTicketType$Companion;", "", "()V", "getByNumber", "Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/SectionTicketType;", "id", "", "getType", "name", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.SectionTicketType$Companion */
    /* compiled from: SectionTicketType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SectionTicketType getByNumber(String str) {
            Intrinsics.checkNotNullParameter(str, "id");
            for (SectionTicketType sectionTicketType : SectionTicketType.values()) {
                if (Intrinsics.areEqual((Object) String.valueOf(sectionTicketType.getId()), (Object) str)) {
                    return sectionTicketType;
                }
            }
            return null;
        }

        @JvmStatic
        public final SectionTicketType getType(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return SectionTicketType.valueOf(upperCase);
        }
    }
}
