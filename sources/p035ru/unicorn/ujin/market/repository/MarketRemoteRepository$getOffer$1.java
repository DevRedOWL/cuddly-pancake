package p035ru.unicorn.ujin.market.repository;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.OfferResponse;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.viewModel.events.market.OfferEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/marketplace/OfferResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$getOffer$1 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$getOffer$1<T> implements Consumer<OfferResponse> {
    final /* synthetic */ MarketRemoteRepository this$0;

    MarketRemoteRepository$getOffer$1(MarketRemoteRepository marketRemoteRepository) {
        this.this$0 = marketRemoteRepository;
    }

    public final void accept(OfferResponse offerResponse) {
        MarketRemoteRepository marketRemoteRepository = this.this$0;
        if (offerResponse.getService().getError() == null) {
            RealmList<Offer> offers = offerResponse.getData().getOffers();
            if (offers != null && (!offers.isEmpty())) {
                Iterator<Offer> it = offerResponse.getData().getOffers().iterator();
                while (it.hasNext()) {
                    marketRemoteRepository.getRealm().executeTransaction(new MarketRemoteRepository$getOffer$1$1$1(it.next()));
                }
            }
            marketRemoteRepository.getOfferSubject().onNext(new OfferEvent(true, ""));
            return;
        }
        PublishSubject<OfferEvent> offerSubject = marketRemoteRepository.getOfferSubject();
        String message = offerResponse.getService().getError().getMessage();
        if (message == null) {
            message = "";
        }
        offerSubject.onNext(new OfferEvent(false, message));
    }
}
