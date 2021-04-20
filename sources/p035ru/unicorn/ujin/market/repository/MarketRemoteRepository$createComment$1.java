package p035ru.unicorn.ujin.market.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CreateCommentResponse;
import p035ru.unicorn.ujin.viewModel.events.market.CreateCommentEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/marketplace/CreateCommentResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$createComment$1 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$createComment$1<T> implements Consumer<CreateCommentResponse> {
    final /* synthetic */ MarketRemoteRepository this$0;

    MarketRemoteRepository$createComment$1(MarketRemoteRepository marketRemoteRepository) {
        this.this$0 = marketRemoteRepository;
    }

    public final void accept(CreateCommentResponse createCommentResponse) {
        MarketRemoteRepository marketRemoteRepository = this.this$0;
        if (createCommentResponse.getError() == 0) {
            marketRemoteRepository.getRealm().executeTransaction(new C5767xc54e1307(createCommentResponse));
        }
        marketRemoteRepository.getCreateCommentSubject().onNext(new CreateCommentEvent(createCommentResponse.getError() == 0, createCommentResponse.getMessage(), createCommentResponse.getData().getId()));
    }
}
