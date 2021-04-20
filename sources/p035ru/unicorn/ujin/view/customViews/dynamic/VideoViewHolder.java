package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.VideoField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/VideoViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.VideoViewHolder */
/* compiled from: VideoViewHolder.kt */
public final class VideoViewHolder extends BaseViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        GlideRequest load = GlideApp.with((View) (ImageView) view.findViewById(C5619R.C5622id.ivPreview)).load(((VideoField) field).getUrl());
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        load.into((ImageView) view2.findViewById(C5619R.C5622id.ivPreview));
        this.itemView.setOnClickListener(new VideoViewHolder$bind$1(this, field));
    }
}
