package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/view/customViews/dynamic/KortrosViewPagerHolder$bind$TimerTask$run$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.KortrosViewPagerHolder$bind$TimerTask$run$$inlined$let$lambda$1 */
/* compiled from: KortrosViewPagerHolder.kt */
final class KortrosViewPagerHolder$bind$TimerTask$run$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ KortrosViewPagerHolder$bind$TimerTask this$0;

    KortrosViewPagerHolder$bind$TimerTask$run$$inlined$let$lambda$1(KortrosViewPagerHolder$bind$TimerTask kortrosViewPagerHolder$bind$TimerTask) {
        this.this$0 = kortrosViewPagerHolder$bind$TimerTask;
    }

    public final void run() {
        View view = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        int currentItem = ((ViewPager) view).getCurrentItem() + 1;
        if (currentItem > 3) {
            currentItem = 0;
        }
        View view2 = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        ((ViewPager) view2).setCurrentItem(currentItem);
    }
}
