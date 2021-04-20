package p035ru.unicorn.ujin.serviceticket.domain;

import kotlin.Metadata;
import p035ru.unicorn.ujin.serviceticket.data.TicketListDataInX;
import p046io.reactivex.Single;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/domain/IServiceTicketRepository;", "", "loadAllTicketsFromServer", "Lio/reactivex/Single;", "Lru/unicorn/ujin/serviceticket/data/TicketListDataInX;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.domain.IServiceTicketRepository */
/* compiled from: IServiceTicketRepository.kt */
public interface IServiceTicketRepository {
    Single<TicketListDataInX> loadAllTicketsFromServer();
}
