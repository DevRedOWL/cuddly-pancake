package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.GetFlatsResponse;
import p035ru.unicorn.ujin.data.realm.GetFlatsResponseData;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/GetFlatsResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestFilterFlatList$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestFilterFlatList$1<T> implements Consumer<GetFlatsResponse> {
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$requestFilterFlatList$1(RealmRepository realmRepository) {
        this.this$0 = realmRepository;
    }

    public final void accept(GetFlatsResponse getFlatsResponse) {
        RealmRepository realmRepository = this.this$0;
        String ghostToken = getFlatsResponse.getGhostToken();
        if (ghostToken != null) {
            realmRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        if (getFlatsResponse.getError() == 0) {
            GetFlatsResponseData data = getFlatsResponse.getData();
            data.setId(GetFlatsResponseData.Fields.filter);
            realmRepository.getRealm().executeTransaction(new RealmRepository$requestFilterFlatList$1$1$2(data));
            realmRepository.getModelSubject().onNext(new UpdateEvent(true, ""));
            return;
        }
        realmRepository.getModelSubject().onNext(new UpdateEvent(false, getFlatsResponse.getMessage()));
    }
}
