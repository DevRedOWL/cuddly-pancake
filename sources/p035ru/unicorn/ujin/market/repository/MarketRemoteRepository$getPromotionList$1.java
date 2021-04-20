package p035ru.unicorn.ujin.market.repository;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.PromotionListResponse;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p035ru.unicorn.ujin.viewModel.events.market.PromotionListEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/marketplace/PromotionListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$getPromotionList$1 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$getPromotionList$1<T> implements Consumer<PromotionListResponse> {
    final /* synthetic */ int $offset;
    final /* synthetic */ MarketRemoteRepository this$0;

    MarketRemoteRepository$getPromotionList$1(MarketRemoteRepository marketRemoteRepository, int i) {
        this.this$0 = marketRemoteRepository;
        this.$offset = i;
    }

    public final void accept(PromotionListResponse promotionListResponse) {
        MarketRemoteRepository marketRemoteRepository = this.this$0;
        if (promotionListResponse.getError() == 0) {
            if (this.$offset == 0) {
                marketRemoteRepository.getRealm().executeTransaction(MarketRemoteRepository$getPromotionList$1$1$1.INSTANCE);
            }
            Iterator<Promotion> it = promotionListResponse.getData().getPromotions().iterator();
            while (it.hasNext()) {
                marketRemoteRepository.getRealm().executeTransaction(new MarketRemoteRepository$getPromotionList$1$1$2(it.next()));
            }
        }
        PublishSubject<PromotionListEvent> promotionListSubject = marketRemoteRepository.getPromotionListSubject();
        int i = 0;
        boolean z = promotionListResponse.getError() == 0;
        String message = promotionListResponse.getMessage();
        Integer totalCount = promotionListResponse.getData().getTotalCount();
        if (totalCount != null) {
            i = totalCount.intValue();
        }
        promotionListSubject.onNext(new PromotionListEvent(z, message, i, promotionListResponse.getData().getPromotions()));
    }
}
