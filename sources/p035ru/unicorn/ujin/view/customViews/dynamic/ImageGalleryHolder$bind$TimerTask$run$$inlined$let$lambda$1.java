package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.WrapContentHeightViewPager;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/view/customViews/dynamic/ImageGalleryHolder$bind$TimerTask$run$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryHolder$bind$TimerTask$run$$inlined$let$lambda$1 */
/* compiled from: ImageGalleryHolder.kt */
final class ImageGalleryHolder$bind$TimerTask$run$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ ImageGalleryHolder$bind$TimerTask this$0;

    ImageGalleryHolder$bind$TimerTask$run$$inlined$let$lambda$1(ImageGalleryHolder$bind$TimerTask imageGalleryHolder$bind$TimerTask) {
        this.this$0 = imageGalleryHolder$bind$TimerTask;
    }

    public final void run() {
        View view = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) view.findViewById(C5619R.C5622id.vpImageGallery);
        Intrinsics.checkNotNullExpressionValue(wrapContentHeightViewPager, "itemView.vpImageGallery");
        int currentItem = wrapContentHeightViewPager.getCurrentItem() + 1;
        if (currentItem >= this.this$0.$field.getImageList().size()) {
            currentItem = 0;
        }
        View view2 = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        WrapContentHeightViewPager wrapContentHeightViewPager2 = (WrapContentHeightViewPager) view2.findViewById(C5619R.C5622id.vpImageGallery);
        Intrinsics.checkNotNullExpressionValue(wrapContentHeightViewPager2, "itemView.vpImageGallery");
        wrapContentHeightViewPager2.setCurrentItem(currentItem);
    }
}
