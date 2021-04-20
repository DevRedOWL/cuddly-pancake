package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.content.Intent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.VideoPlayerActivity;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.VideoField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.VideoViewHolder$bind$1 */
/* compiled from: VideoViewHolder.kt */
final class VideoViewHolder$bind$1 implements View.OnClickListener {
    final /* synthetic */ Field $item;
    final /* synthetic */ VideoViewHolder this$0;

    VideoViewHolder$bind$1(VideoViewHolder videoViewHolder, Field field) {
        this.this$0 = videoViewHolder;
        this.$item = field;
    }

    public final void onClick(View view) {
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        Intent intent = new Intent(view2.getContext(), VideoPlayerActivity.class);
        intent.putExtra(VideoPlayerActivity.VIDEO_URL, ((VideoField) this.$item).getUrl());
        View view3 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        view3.getContext().startActivity(intent);
    }
}
