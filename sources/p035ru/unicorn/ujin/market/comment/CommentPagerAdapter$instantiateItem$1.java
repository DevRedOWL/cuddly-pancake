package p035ru.unicorn.ujin.market.comment;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.CommentPagerAdapter$instantiateItem$1 */
/* compiled from: CommentPagerAdapter.kt */
final class CommentPagerAdapter$instantiateItem$1 implements View.OnClickListener {
    final /* synthetic */ Comment $comment;
    final /* synthetic */ CommentPagerAdapter this$0;

    CommentPagerAdapter$instantiateItem$1(CommentPagerAdapter commentPagerAdapter, Comment comment) {
        this.this$0 = commentPagerAdapter;
        this.$comment = comment;
    }

    public final void onClick(View view) {
        this.this$0.getShowCommentFragment().invoke(String.valueOf(this.$comment.getId()));
    }
}
