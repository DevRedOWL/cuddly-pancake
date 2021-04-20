package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4731x1ef269a0;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets */
public class Tickets extends RealmObject implements Diffable<Tickets>, C4731x1ef269a0 {
    @SerializedName("city")
    String city;
    @SerializedName("has_debts")
    boolean hasDebts;
    @PrimaryKey

    /* renamed from: id */
    int f6786id;
    @SerializedName("ticket")
    TicketInfo ticket;
    @SerializedName("account")
    TicketAccountsList ticketAccountsList;
    @SerializedName("apartment")
    TicketApartment ticketApartment;
    @SerializedName("applicant")
    TicketApplicant ticketApplicant;
    @SerializedName("chat")
    TicketChatData ticketChatData;
    @SerializedName("performer")
    TicketPerformer ticketPerformer;

    public String realmGet$city() {
        return this.city;
    }

    public boolean realmGet$hasDebts() {
        return this.hasDebts;
    }

    public int realmGet$id() {
        return this.f6786id;
    }

    public TicketInfo realmGet$ticket() {
        return this.ticket;
    }

    public TicketAccountsList realmGet$ticketAccountsList() {
        return this.ticketAccountsList;
    }

    public TicketApartment realmGet$ticketApartment() {
        return this.ticketApartment;
    }

    public TicketApplicant realmGet$ticketApplicant() {
        return this.ticketApplicant;
    }

    public TicketChatData realmGet$ticketChatData() {
        return this.ticketChatData;
    }

    public TicketPerformer realmGet$ticketPerformer() {
        return this.ticketPerformer;
    }

    public void realmSet$city(String str) {
        this.city = str;
    }

    public void realmSet$hasDebts(boolean z) {
        this.hasDebts = z;
    }

    public void realmSet$id(int i) {
        this.f6786id = i;
    }

    public void realmSet$ticket(TicketInfo ticketInfo) {
        this.ticket = ticketInfo;
    }

    public void realmSet$ticketAccountsList(TicketAccountsList ticketAccountsList2) {
        this.ticketAccountsList = ticketAccountsList2;
    }

    public void realmSet$ticketApartment(TicketApartment ticketApartment2) {
        this.ticketApartment = ticketApartment2;
    }

    public void realmSet$ticketApplicant(TicketApplicant ticketApplicant2) {
        this.ticketApplicant = ticketApplicant2;
    }

    public void realmSet$ticketChatData(TicketChatData ticketChatData2) {
        this.ticketChatData = ticketChatData2;
    }

    public void realmSet$ticketPerformer(TicketPerformer ticketPerformer2) {
        this.ticketPerformer = ticketPerformer2;
    }

    public Tickets() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public TicketInfo getTicket() {
        return realmGet$ticket();
    }

    public String getCity() {
        return realmGet$city();
    }

    public void setCity(String str) {
        realmSet$city(str);
    }

    public boolean isHasDebts() {
        return realmGet$hasDebts();
    }

    public void setHasDebts(boolean z) {
        realmSet$hasDebts(z);
    }

    public TicketPerformer getTicketPerformer() {
        return realmGet$ticketPerformer();
    }

    public void setTicketPerformer(TicketPerformer ticketPerformer2) {
        realmSet$ticketPerformer(ticketPerformer2);
    }

    public TicketApplicant getTicketApplicant() {
        return realmGet$ticketApplicant();
    }

    public void setTicketApplicant(TicketApplicant ticketApplicant2) {
        realmSet$ticketApplicant(ticketApplicant2);
    }

    public TicketApartment getTicketApartment() {
        return realmGet$ticketApartment();
    }

    public void setTicketApartment(TicketApartment ticketApartment2) {
        realmSet$ticketApartment(ticketApartment2);
    }

    public TicketAccountsList getTicketAccountsList() {
        return realmGet$ticketAccountsList();
    }

    public void setTicketAccountsList(TicketAccountsList ticketAccountsList2) {
        realmSet$ticketAccountsList(ticketAccountsList2);
    }

    public TicketChatData getTicketChatData() {
        return realmGet$ticketChatData();
    }

    public void setTicketChatData(TicketChatData ticketChatData2) {
        realmSet$ticketChatData(ticketChatData2);
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
    }

    public void setTicket(TicketInfo ticketInfo) {
        realmSet$ticket(ticketInfo);
    }

    public boolean areItemsTheSame(Tickets tickets) {
        return realmGet$ticket().realmGet$id() == tickets.realmGet$ticket().realmGet$id();
    }

    public boolean areContentsTheSame(Tickets tickets) {
        return realmGet$ticket().realmGet$text().equals(tickets.realmGet$ticket().realmGet$text()) || realmGet$ticket().realmGet$ticketState().equals(tickets.realmGet$ticket().getTicketState());
    }
}
