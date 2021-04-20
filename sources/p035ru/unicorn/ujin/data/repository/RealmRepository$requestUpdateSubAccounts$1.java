package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SubAccountsResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.viewModel.events.ProfileSubAccountUpdateEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SubAccountsResponseData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestUpdateSubAccounts$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestUpdateSubAccounts$1<T> implements Consumer<Resource<SubAccountsResponseData>> {
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$requestUpdateSubAccounts$1(RealmRepository realmRepository) {
        this.this$0 = realmRepository;
    }

    public final void accept(Resource<SubAccountsResponseData> resource) {
        PublishSubject<ProfileSubAccountUpdateEvent> profileSubAccountUpdateSubject = this.this$0.getProfileSubAccountUpdateSubject();
        Intrinsics.checkNotNullExpressionValue(resource, "response");
        Integer error = resource.getError();
        boolean z = error != null && error.intValue() == 0;
        String message = resource.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "response.message");
        profileSubAccountUpdateSubject.onNext(new ProfileSubAccountUpdateEvent(z, message, resource.getData().getSubAccountList()));
    }
}
