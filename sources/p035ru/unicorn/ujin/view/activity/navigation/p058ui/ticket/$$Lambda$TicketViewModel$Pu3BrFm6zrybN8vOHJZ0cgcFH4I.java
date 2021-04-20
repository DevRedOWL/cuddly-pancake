package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.-$$Lambda$TicketViewModel$Pu3BrFm6zrybN8vOHJZ0cgcFH4I  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TicketViewModel$Pu3BrFm6zrybN8vOHJZ0cgcFH4I implements Predicate {
    public static final /* synthetic */ $$Lambda$TicketViewModel$Pu3BrFm6zrybN8vOHJZ0cgcFH4I INSTANCE = new $$Lambda$TicketViewModel$Pu3BrFm6zrybN8vOHJZ0cgcFH4I();

    private /* synthetic */ $$Lambda$TicketViewModel$Pu3BrFm6zrybN8vOHJZ0cgcFH4I() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
