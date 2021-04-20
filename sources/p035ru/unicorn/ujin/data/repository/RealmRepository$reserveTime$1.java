package p035ru.unicorn.ujin.data.repository;

import java.util.Date;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.ReserveTimeResponse;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/ReserveTimeResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$reserveTime$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$reserveTime$1<T> implements Consumer<ReserveTimeResponse> {
    final /* synthetic */ Date $date;
    final /* synthetic */ String $token;
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$reserveTime$1(RealmRepository realmRepository, String str, Date date) {
        this.this$0 = realmRepository;
        this.$token = str;
        this.$date = date;
    }

    public final void accept(ReserveTimeResponse reserveTimeResponse) {
        RealmRepository realmRepository = this.this$0;
        if (reserveTimeResponse.getError() == 0) {
            realmRepository.getAcceptanceState(this.$token, this.$date);
        } else {
            realmRepository.getModelSubject().onNext(new UpdateEvent(false, reserveTimeResponse.getMessage()));
        }
    }
}
