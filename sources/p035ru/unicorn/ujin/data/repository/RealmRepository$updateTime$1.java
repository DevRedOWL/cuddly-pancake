package p035ru.unicorn.ujin.data.repository;

import java.util.Date;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.RemoveTimeResponse;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/RemoveTimeResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$updateTime$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$updateTime$1<T> implements Consumer<RemoveTimeResponse> {
    final /* synthetic */ Date $date;
    final /* synthetic */ String $id;
    final /* synthetic */ String $token;
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$updateTime$1(RealmRepository realmRepository, String str, String str2, Date date) {
        this.this$0 = realmRepository;
        this.$token = str;
        this.$id = str2;
        this.$date = date;
    }

    public final void accept(RemoveTimeResponse removeTimeResponse) {
        RealmRepository realmRepository = this.this$0;
        if (removeTimeResponse.getError() == 0) {
            realmRepository.reserveTime(this.$token, this.$id, this.$date);
        } else {
            realmRepository.getModelSubject().onNext(new UpdateEvent(false, removeTimeResponse.getMessage()));
        }
    }
}
