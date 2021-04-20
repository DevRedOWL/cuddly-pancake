package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent;

import android.os.Parcelable;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFifthFragment;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket */
public abstract class AbstractRentTicket implements ITicket, Parcelable {
    public static final String FRAGMENT_TAG = AbstractRentTicket.class.getName();
    protected String finishDate;
    protected int rentTypeId;
    protected String sectionId;
    protected String sectionTitle;
    protected String startDate;
    protected int ticketId;
    protected String ticketText;
    protected String ticketTitle;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket$DetailType */
    public enum DetailType {
        byId,
        byTypeId,
        byFilter,
        noData
    }

    public abstract DetailType getDetailDataType();

    public abstract RentTicketTypes getLocalTicketType();

    public abstract String getLocalTicketTypeName();

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket$RentTicketTypes */
    public enum RentTicketTypes {
        All_My_Rents("all"),
        TalkingRoom("meeting_room"),
        EventArea("event_area"),
        Office(AnotherPassFifthFragment.OFFICE_FIELD),
        Coworking("coworking"),
        Workplace("workplace"),
        NoType("no_such_type");
        
        private final String rentTypeName;

        private RentTicketTypes(String str) {
            this.rentTypeName = str;
        }
    }

    public static AbstractRentTicket createTicketByType(RentType rentType) {
        AbstractRentTicket createTicketByType = createTicketByType(rentType.getName());
        if (createTicketByType != null) {
            createTicketByType.setRentTypeId(rentType.getId());
        }
        return createTicketByType;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket createTicketByType(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1604969377: goto L_0x0029;
                case -1140748987: goto L_0x001f;
                case -1019789636: goto L_0x0015;
                case 983803666: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "event_area"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "office"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "coworking"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "meeting_room"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0054
            if (r4 == r3) goto L_0x004e
            if (r4 == r2) goto L_0x0048
            if (r4 == r1) goto L_0x0042
            ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.NoTypeRentTicket r4 = new ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.NoTypeRentTicket
            r4.<init>()
            return r4
        L_0x0042:
            ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.EventAreaRentTicket r4 = new ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.EventAreaRentTicket
            r4.<init>()
            return r4
        L_0x0048:
            ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.MeetingRentTicket r4 = new ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.MeetingRentTicket
            r4.<init>()
            return r4
        L_0x004e:
            ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.CoworkingRentTicket r4 = new ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.CoworkingRentTicket
            r4.<init>()
            return r4
        L_0x0054:
            ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.OfficeRentTicket r4 = new ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.OfficeRentTicket
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket.createTicketByType(java.lang.String):ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket");
    }

    public static AbstractRentTicket fromServiceTicket(AbstractRentTicket abstractRentTicket, ServiceTicket serviceTicket) {
        abstractRentTicket.setTicketId(serviceTicket.getTicketId() == null ? 0 : Integer.valueOf(serviceTicket.getTicketId()).intValue());
        abstractRentTicket.setTicketTitle(serviceTicket.getTicketTitle());
        abstractRentTicket.setTicketText(serviceTicket.getTicketText());
        if (serviceTicket.getRentInfoObject() != null) {
            abstractRentTicket.setFinishDate(serviceTicket.getRentInfoObject().getFinishDate());
            abstractRentTicket.setStartDate(serviceTicket.getRentInfoObject().getFinishDate());
        }
        if (abstractRentTicket instanceof AbstractRentTicketWithId) {
            ((AbstractRentTicketWithId) abstractRentTicket).setRentId(serviceTicket.getObjectId());
        }
        if (abstractRentTicket instanceof OfficeRentTicket) {
            ((OfficeRentTicket) abstractRentTicket).setAdditionalData(RentAttributes.fromListToMap(serviceTicket.getRentInfoObject().getDesiredAttributes()));
        }
        return abstractRentTicket;
    }

    public ITicket.GlobalTicketTypes getGlobalTicketType() {
        return ITicket.GlobalTicketTypes.Rent;
    }

    public String getName() {
        return getLocalTicketTypeName();
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }

    public String getFinishDate() {
        return this.finishDate;
    }

    public void setFinishDate(String str) {
        this.finishDate = str;
    }

    public String getTicketTitle() {
        return this.ticketTitle;
    }

    public void setTicketTitle(String str) {
        this.ticketTitle = str;
    }

    public void setTicketId(int i) {
        this.ticketId = i;
    }

    public int getTicketId() {
        return this.ticketId;
    }

    public String getTicketText() {
        return this.ticketText;
    }

    public void setTicketText(String str) {
        this.ticketText = str;
    }

    public int getRentTypeId() {
        return this.rentTypeId;
    }

    public void setRentTypeId(int i) {
        this.rentTypeId = i;
    }

    public List<IKeyValueData> generateFinishInfo(List<IKeyValueData> list) {
        if (!(getStartDate() == null || getFinishDate() == null)) {
            list.add(new IKeyValueDataImpl("Дата начала аренды ", this.startDate));
            list.add(new IKeyValueDataImpl("Дата окончания аренды ", this.finishDate));
        }
        return list;
    }

    public String loadTicketText() {
        return getTicketText();
    }

    public void saveTicketText(String str) {
        setTicketText(str);
    }

    public String loadTicketTitle() {
        return getTicketTitle();
    }

    public void saveTicketTitle(String str) {
        setTicketTitle(str);
    }

    public String getSectionId() {
        return this.sectionId;
    }

    public void saveSectionId(String str) {
        this.sectionId = str;
    }

    public String getSectionTitle() {
        return this.sectionTitle;
    }

    public void saveSectionTitle(String str) {
        this.sectionTitle = str;
    }

    public boolean isCorrect() {
        String str = this.ticketText;
        return str != null && this.ticketTitle != null && !str.isEmpty() && !this.ticketTitle.isEmpty();
    }

    public boolean isCreate() {
        return this.ticketId != 0;
    }
}
