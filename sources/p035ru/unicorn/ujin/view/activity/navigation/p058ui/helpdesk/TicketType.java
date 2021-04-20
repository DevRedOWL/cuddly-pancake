package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/TicketType;", "", "number", "", "title", "color", "(Ljava/lang/String;IIII)V", "getColor", "()I", "getNumber", "getTitle", "NEW", "ASSIGNED", "WORK", "PAUSED", "CONFIRMATION", "DONE", "DENIED", "RETURNED", "CANCELED", "CLOSED", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketType */
/* compiled from: TicketType.kt */
public enum TicketType {
    NEW(0, R.string.ticket_state_new, R.color.ticket_state_new),
    ASSIGNED(1, R.string.ticket_state_assigned, R.color.ticket_state_assigned),
    WORK(2, R.string.ticket_state_work, R.color.ticket_state_work),
    PAUSED(3, R.string.ticket_state_paused, R.color.ticket_state_paused),
    CONFIRMATION(4, R.string.ticket_state_confirmation, R.color.ticket_state_confirmation),
    DONE(5, R.string.ticket_state_done, R.color.ticket_state_done),
    DENIED(6, R.string.ticket_state_denied, R.color.ticket_state_denied),
    RETURNED(7, R.string.ticket_state_returned, R.color.ticket_state_returned),
    CANCELED(8, R.string.ticket_state_canceled, R.color.ticket_state_canceled),
    CLOSED(9, R.string.ticket_state_closed, R.color.ticket_state_closed);
    
    public static final Companion Companion = null;
    private final int color;
    private final int number;
    private final int title;

    @JvmStatic
    public static final TicketType getByNumber(String str) {
        return Companion.getByNumber(str);
    }

    @JvmStatic
    public static final TicketType getType(String str) {
        return Companion.getType(str);
    }

    private TicketType(int i, int i2, int i3) {
        this.number = i;
        this.title = i2;
        this.color = i3;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/TicketType$Companion;", "", "()V", "getByNumber", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/TicketType;", "number", "", "getType", "name", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketType$Companion */
    /* compiled from: TicketType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final TicketType getByNumber(String str) {
            Intrinsics.checkNotNullParameter(str, CardFragment.ARG_NUMBER);
            for (TicketType ticketType : TicketType.values()) {
                if (Intrinsics.areEqual((Object) String.valueOf(ticketType.getNumber()), (Object) str)) {
                    return ticketType;
                }
            }
            return null;
        }

        @JvmStatic
        public final TicketType getType(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return TicketType.valueOf(upperCase);
        }
    }
}
