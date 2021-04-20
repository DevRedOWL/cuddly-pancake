package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.UpdateFavouriteResponse;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateFavouriteEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateSearchFavouriteFlatEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/UpdateFavouriteResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestUpdateFlatFavourite$2 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestUpdateFlatFavourite$2<T> implements Consumer<UpdateFavouriteResponse> {
    final /* synthetic */ boolean $favouriteFlag;
    final /* synthetic */ String $flatId;
    final /* synthetic */ int $searchPosition;
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$requestUpdateFlatFavourite$2(RealmRepository realmRepository, String str, boolean z, int i) {
        this.this$0 = realmRepository;
        this.$flatId = str;
        this.$favouriteFlag = z;
        this.$searchPosition = i;
    }

    public final void accept(UpdateFavouriteResponse updateFavouriteResponse) {
        RealmRepository realmRepository = this.this$0;
        String ghostToken = updateFavouriteResponse.getGhostToken();
        if (ghostToken != null) {
            realmRepository.getGhostRegisterSubject().onNext(new RegisterGhostEvent(ghostToken));
        }
        if (updateFavouriteResponse.getError() == 0) {
            realmRepository.getRealm().executeTransaction(new C5749x1626e96e(this, updateFavouriteResponse));
            realmRepository.getModelFavouriteSubject().onNext(new UpdateFavouriteEvent(true, "", this.$flatId));
            realmRepository.getModelSearchFavouriteSubject().onNext(new UpdateSearchFavouriteFlatEvent(true, "", this.$flatId, this.$searchPosition));
            return;
        }
        realmRepository.getModelFavouriteSubject().onNext(new UpdateFavouriteEvent(false, updateFavouriteResponse.getMessage(), this.$flatId));
    }
}
