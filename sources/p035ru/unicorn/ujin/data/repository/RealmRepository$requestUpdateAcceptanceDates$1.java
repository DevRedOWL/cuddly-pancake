package p035ru.unicorn.ujin.data.repository;

import java.util.Collection;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.acceptance.AcceptanceDatesResponse;
import p035ru.unicorn.ujin.viewModel.events.AcceptanceDatesEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/acceptance/AcceptanceDatesResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestUpdateAcceptanceDates$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestUpdateAcceptanceDates$1<T> implements Consumer<AcceptanceDatesResponse> {
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$requestUpdateAcceptanceDates$1(RealmRepository realmRepository) {
        this.this$0 = realmRepository;
    }

    public final void accept(AcceptanceDatesResponse acceptanceDatesResponse) {
        RealmRepository realmRepository = this.this$0;
        boolean z = true;
        if (acceptanceDatesResponse.getError() == 0) {
            realmRepository.getRealm().executeTransaction(RealmRepository$requestUpdateAcceptanceDates$1$1$1.INSTANCE);
            Collection data = acceptanceDatesResponse.getData();
            if (!(data == null || data.isEmpty())) {
                realmRepository.getRealm().executeTransaction(new C5744x247d80d1(acceptanceDatesResponse));
            }
        }
        PublishSubject<AcceptanceDatesEvent> acceptanceDatesSubject = realmRepository.getAcceptanceDatesSubject();
        if (acceptanceDatesResponse.getError() != 0) {
            z = false;
        }
        acceptanceDatesSubject.onNext(new AcceptanceDatesEvent(z, acceptanceDatesResponse.getMessage()));
    }
}
