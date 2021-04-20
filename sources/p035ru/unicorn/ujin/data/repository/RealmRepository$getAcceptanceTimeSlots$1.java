package p035ru.unicorn.ujin.data.repository;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.acceptance.AcceptanceTimeSlotsResponse;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/acceptance/AcceptanceTimeSlotsResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$getAcceptanceTimeSlots$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$getAcceptanceTimeSlots$1<T> implements Consumer<AcceptanceTimeSlotsResponse> {
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$getAcceptanceTimeSlots$1(RealmRepository realmRepository) {
        this.this$0 = realmRepository;
    }

    public final void accept(AcceptanceTimeSlotsResponse acceptanceTimeSlotsResponse) {
        RealmRepository realmRepository = this.this$0;
        if (acceptanceTimeSlotsResponse.getError() == 0) {
            realmRepository.getRealm().executeTransaction(RealmRepository$getAcceptanceTimeSlots$1$1$1.INSTANCE);
            Iterator<TimeSlot> it = acceptanceTimeSlotsResponse.getData().getWindow().iterator();
            while (it.hasNext()) {
                realmRepository.getRealm().executeTransaction(new RealmRepository$getAcceptanceTimeSlots$1$1$2(it.next()));
            }
            realmRepository.getModelSubject().onNext(new UpdateEvent(true, ""));
            return;
        }
        realmRepository.getModelSubject().onNext(new UpdateEvent(false, acceptanceTimeSlotsResponse.getMessage()));
    }
}
