package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base;

import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.OfficeRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.coworking.ChooseRentPeriodFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingRoomFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.MorionTicketFragmentE;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.OfficeParametrsFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter */
public class ITicketRouter {
    private static ITicketRouter rentRouter;

    private ITicketRouter() {
    }

    public static ITicketRouter getInstance() {
        if (rentRouter == null) {
            rentRouter = new ITicketRouter();
        }
        return rentRouter;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter$1 */
    static /* synthetic */ class C57871 {

        /* renamed from: $SwitchMap$ru$unicorn$ujin$view$activity$navigation$entity$tickets$rent$AbstractRentTicket$RentTicketTypes */
        static final /* synthetic */ int[] f6729x54c3ce41 = new int[AbstractRentTicket.RentTicketTypes.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket$RentTicketTypes[] r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket.RentTicketTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6729x54c3ce41 = r0
                int[] r0 = f6729x54c3ce41     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket$RentTicketTypes r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket.RentTicketTypes.NoType     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6729x54c3ce41     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket$RentTicketTypes r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket.RentTicketTypes.Office     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6729x54c3ce41     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket$RentTicketTypes r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket.RentTicketTypes.Coworking     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f6729x54c3ce41     // Catch:{ NoSuchFieldError -> 0x0035 }
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket$RentTicketTypes r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket.RentTicketTypes.TalkingRoom     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f6729x54c3ce41     // Catch:{ NoSuchFieldError -> 0x0040 }
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket$RentTicketTypes r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket.RentTicketTypes.EventArea     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter.C57871.<clinit>():void");
        }
    }

    public void ticketRouter(BaseFragment baseFragment, AbstractRentTicket abstractRentTicket) {
        AbstractRentTicket createTicketByType = AbstractRentTicket.createTicketByType(abstractRentTicket.getLocalTicketTypeName());
        if (C57871.f6729x54c3ce41[abstractRentTicket.getLocalTicketType().ordinal()] == 1) {
            baseFragment.nextFragment(MorionTicketFragmentE.start(createTicketByType), false);
        }
    }

    public void ticketRouter(BaseFragment baseFragment, RentType rentType) {
        AbstractRentTicket createTicketByType = AbstractRentTicket.createTicketByType(rentType);
        int i = C57871.f6729x54c3ce41[createTicketByType.getLocalTicketType().ordinal()];
        if (i == 2) {
            baseFragment.nextFragment(OfficeParametrsFragment.start((OfficeRentTicket) createTicketByType), false, AbstractRentTicket.FRAGMENT_TAG);
        } else if (i == 3) {
            baseFragment.nextFragment(ChooseRentPeriodFragment.start(createTicketByType), false, AbstractRentTicket.FRAGMENT_TAG);
        } else if (i == 4 || i == 5) {
            baseFragment.nextFragment(TalkingRoomFragment.start(createTicketByType), false, AbstractRentTicket.FRAGMENT_TAG);
        }
    }
}
