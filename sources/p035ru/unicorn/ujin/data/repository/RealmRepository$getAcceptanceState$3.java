package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.acceptance.AcceptanceStateResponse;
import p035ru.unicorn.ujin.viewModel.events.AcceptanceStateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/acceptance/AcceptanceStateResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$getAcceptanceState$3 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$getAcceptanceState$3<T> implements Consumer<AcceptanceStateResponse> {
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$getAcceptanceState$3(RealmRepository realmRepository) {
        this.this$0 = realmRepository;
    }

    public final void accept(AcceptanceStateResponse acceptanceStateResponse) {
        RealmRepository realmRepository = this.this$0;
        if (acceptanceStateResponse.getError() == 0) {
            realmRepository.getRealm().executeTransaction(new C5743xb21a4d61(acceptanceStateResponse));
            realmRepository.getAcceptanceStateSubject().onNext(new AcceptanceStateEvent(true, ""));
            return;
        }
        realmRepository.getAcceptanceStateSubject().onNext(new AcceptanceStateEvent(false, acceptanceStateResponse.getMessage()));
    }
}
