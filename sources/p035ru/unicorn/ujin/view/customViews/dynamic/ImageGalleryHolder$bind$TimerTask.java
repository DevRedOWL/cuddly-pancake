package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo51343d2 = {"ru/unicorn/ujin/view/customViews/dynamic/ImageGalleryHolder$bind$TimerTask", "Ljava/util/TimerTask;", "(Lru/unicorn/ujin/view/customViews/dynamic/ImageGalleryHolder;Lru/unicorn/ujin/view/dialogs/dataEntry/GalleryField;)V", "run", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryHolder$bind$TimerTask */
/* compiled from: ImageGalleryHolder.kt */
public final class ImageGalleryHolder$bind$TimerTask extends TimerTask {
    final /* synthetic */ GalleryField $field;
    final /* synthetic */ ImageGalleryHolder this$0;

    public ImageGalleryHolder$bind$TimerTask(ImageGalleryHolder imageGalleryHolder, GalleryField galleryField) {
        this.this$0 = imageGalleryHolder;
        this.$field = galleryField;
    }

    public void run() {
        View view = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        if (context != null) {
            ((Activity) context).runOnUiThread(new ImageGalleryHolder$bind$TimerTask$run$$inlined$let$lambda$1(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }
}
