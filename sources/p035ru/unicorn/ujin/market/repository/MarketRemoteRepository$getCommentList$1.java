package p035ru.unicorn.ujin.market.repository;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CommentListResponse;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p035ru.unicorn.ujin.viewModel.events.market.CommentListEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/marketplace/CommentListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$getCommentList$1 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$getCommentList$1<T> implements Consumer<CommentListResponse> {
    final /* synthetic */ int $offset;
    final /* synthetic */ MarketRemoteRepository this$0;

    MarketRemoteRepository$getCommentList$1(MarketRemoteRepository marketRemoteRepository, int i) {
        this.this$0 = marketRemoteRepository;
        this.$offset = i;
    }

    public final void accept(CommentListResponse commentListResponse) {
        MarketRemoteRepository marketRemoteRepository = this.this$0;
        if (commentListResponse.getError() == 0) {
            if (this.$offset == 0) {
                marketRemoteRepository.getRealm().executeTransaction(MarketRemoteRepository$getCommentList$1$1$1.INSTANCE);
            }
            Iterator<Comment> it = commentListResponse.getData().getComments().iterator();
            while (it.hasNext()) {
                marketRemoteRepository.getRealm().executeTransaction(new MarketRemoteRepository$getCommentList$1$1$2(it.next()));
            }
        }
        PublishSubject<CommentListEvent> commentListSubject = marketRemoteRepository.getCommentListSubject();
        boolean z = commentListResponse.getError() == 0;
        String message = commentListResponse.getMessage();
        String totalComments = commentListResponse.getData().getTotalComments();
        if (totalComments == null) {
            totalComments = "0";
        }
        commentListSubject.onNext(new CommentListEvent(z, message, totalComments, commentListResponse.getData().getComments()));
    }
}
