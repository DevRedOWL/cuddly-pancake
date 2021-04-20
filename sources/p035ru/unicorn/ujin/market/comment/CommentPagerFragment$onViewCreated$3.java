package p035ru.unicorn.ujin.market.comment;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.CommentPagerFragment$onViewCreated$3 */
/* compiled from: CommentPagerFragment.kt */
final class CommentPagerFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ CommentPagerFragment this$0;

    CommentPagerFragment$onViewCreated$3(CommentPagerFragment commentPagerFragment) {
        this.this$0 = commentPagerFragment;
    }

    public final void onClick(View view) {
        CommentPagerFragment commentPagerFragment = this.this$0;
        commentPagerFragment.showCommentListFragment(commentPagerFragment.threadId, this.this$0.threadType);
    }
}
