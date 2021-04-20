package p035ru.unicorn.ujin.market.repository;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.TagListResponse;
import p035ru.unicorn.ujin.data.api.response.marketplace.TagListResponseData;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p035ru.unicorn.ujin.viewModel.events.market.TagListEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/marketplace/TagListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$getTagList$1 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$getTagList$1<T> implements Consumer<TagListResponse> {
    final /* synthetic */ MarketRemoteRepository this$0;

    MarketRemoteRepository$getTagList$1(MarketRemoteRepository marketRemoteRepository) {
        this.this$0 = marketRemoteRepository;
    }

    public final void accept(TagListResponse tagListResponse) {
        RealmList<Tag> tags;
        MarketRemoteRepository marketRemoteRepository = this.this$0;
        if (tagListResponse.getService().getError() == null) {
            marketRemoteRepository.getRealm().executeTransaction(MarketRemoteRepository$getTagList$1$1$1.INSTANCE);
            TagListResponseData data = tagListResponse.getData();
            if (!(data == null || (tags = data.getTags()) == null || !(!tags.isEmpty()))) {
                Iterator<Tag> it = tagListResponse.getData().getTags().iterator();
                while (it.hasNext()) {
                    marketRemoteRepository.getRealm().executeTransaction(new MarketRemoteRepository$getTagList$1$1$2(it.next()));
                }
            }
            marketRemoteRepository.getTagListSubject().onNext(new TagListEvent(true, ""));
            return;
        }
        PublishSubject<TagListEvent> tagListSubject = marketRemoteRepository.getTagListSubject();
        String message = tagListResponse.getService().getError().getMessage();
        if (message == null) {
            message = "";
        }
        tagListSubject.onNext(new TagListEvent(false, message));
    }
}
