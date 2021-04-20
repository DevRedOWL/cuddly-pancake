package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.ComplexListResponse;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/ComplexListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestUpdateCityComplexList$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestUpdateCityComplexList$1<T> implements Consumer<ComplexListResponse> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$requestUpdateCityComplexList$1(RealmRepository realmRepository, String str) {
        this.this$0 = realmRepository;
        this.$cityId = str;
    }

    public final void accept(ComplexListResponse complexListResponse) {
        RealmRepository realmRepository = this.this$0;
        String ghostToken = complexListResponse.getGhostToken();
        if (ghostToken != null) {
            realmRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        if (complexListResponse.getError() == 0) {
            realmRepository.getRealm().executeTransaction(new C5745x88ec2adc(this, complexListResponse));
            realmRepository.getComplexListSubject().onNext(new UpdateEvent(true, ""));
            return;
        }
        realmRepository.getComplexListSubject().onNext(new UpdateEvent(false, complexListResponse.getMessage()));
    }
}
