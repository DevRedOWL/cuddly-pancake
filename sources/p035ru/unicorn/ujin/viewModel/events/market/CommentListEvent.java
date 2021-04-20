package p035ru.unicorn.ujin.viewModel.events.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/market/CommentListEvent;", "", "success", "", "message", "", "totalCount", "commentList", "", "Lru/unicorn/ujin/data/realm/marketplace/Comment;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCommentList", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "getTotalCount", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.market.CommentListEvent */
/* compiled from: CommentListEvent.kt */
public final class CommentListEvent {
    private final List<Comment> commentList;
    private final String message;
    private final boolean success;
    private final String totalCount;

    public CommentListEvent(boolean z, String str, String str2, List<Comment> list) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "totalCount");
        Intrinsics.checkNotNullParameter(list, "commentList");
        this.success = z;
        this.message = str;
        this.totalCount = str2;
        this.commentList = list;
    }

    public final List<Comment> getCommentList() {
        return this.commentList;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getTotalCount() {
        return this.totalCount;
    }
}
