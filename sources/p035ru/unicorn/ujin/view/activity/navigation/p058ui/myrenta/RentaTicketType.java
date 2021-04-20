package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentaTicketType;", "", "number", "", "color", "(Ljava/lang/String;III)V", "getColor", "()I", "getNumber", "OPEN", "FINISHED", "ACCEPTED", "REVIEW", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaTicketType */
/* compiled from: RentaTicketType.kt */
public enum RentaTicketType {
    OPEN(1, R.color.rent_ticket_state_open),
    FINISHED(2, R.color.rent_ticket_state_finished),
    ACCEPTED(4, R.color.rent_ticket_state_accepted),
    REVIEW(3, R.color.rent_ticket_state_review);
    
    public static final Companion Companion = null;
    private final int color;
    private final int number;

    @JvmStatic
    public static final RentaTicketType getByNumber(String str) {
        return Companion.getByNumber(str);
    }

    @JvmStatic
    public static final RentaTicketType getType(String str) {
        return Companion.getType(str);
    }

    private RentaTicketType(int i, int i2) {
        this.number = i;
        this.color = i2;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getNumber() {
        return this.number;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentaTicketType$Companion;", "", "()V", "getByNumber", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentaTicketType;", "number", "", "getType", "name", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaTicketType$Companion */
    /* compiled from: RentaTicketType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final RentaTicketType getByNumber(String str) {
            Intrinsics.checkNotNullParameter(str, CardFragment.ARG_NUMBER);
            for (RentaTicketType rentaTicketType : RentaTicketType.values()) {
                if (Intrinsics.areEqual((Object) String.valueOf(rentaTicketType.getNumber()), (Object) str)) {
                    return rentaTicketType;
                }
            }
            return null;
        }

        @JvmStatic
        public final RentaTicketType getType(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return RentaTicketType.valueOf(upperCase);
        }
    }
}
