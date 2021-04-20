package p035ru.unicorn.ujin.serviceticket.data;

import kotlin.Metadata;
import p046io.realm.C4635x52f550c9;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/data/AllTicketDataInX;", "Lio/realm/RealmObject;", "()V", "id", "", "getId", "()I", "setId", "(I)V", "ticket", "Lru/unicorn/ujin/serviceticket/data/TicketDataInX;", "getTicket", "()Lru/unicorn/ujin/serviceticket/data/TicketDataInX;", "setTicket", "(Lru/unicorn/ujin/serviceticket/data/TicketDataInX;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.data.AllTicketDataInX */
/* compiled from: TicketListDataInX.kt */
public class AllTicketDataInX extends RealmObject implements C4635x52f550c9 {
    @PrimaryKey

    /* renamed from: id */
    private int f6711id;
    private TicketDataInX ticket;

    public int realmGet$id() {
        return this.f6711id;
    }

    public TicketDataInX realmGet$ticket() {
        return this.ticket;
    }

    public void realmSet$id(int i) {
        this.f6711id = i;
    }

    public void realmSet$ticket(TicketDataInX ticketDataInX) {
        this.ticket = ticketDataInX;
    }

    public AllTicketDataInX() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        TicketDataInX realmGet$ticket = realmGet$ticket();
        realmSet$id(realmGet$ticket != null ? realmGet$ticket.getId() : 0);
    }

    public final TicketDataInX getTicket() {
        return realmGet$ticket();
    }

    public final void setTicket(TicketDataInX ticketDataInX) {
        realmSet$ticket(ticketDataInX);
    }

    public final int getId() {
        return realmGet$id();
    }

    public final void setId(int i) {
        realmSet$id(i);
    }
}
