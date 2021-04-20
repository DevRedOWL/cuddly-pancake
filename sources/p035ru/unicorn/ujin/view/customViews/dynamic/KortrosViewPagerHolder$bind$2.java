package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo51343d2 = {"ru/unicorn/ujin/view/customViews/dynamic/KortrosViewPagerHolder$bind$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.KortrosViewPagerHolder$bind$2 */
/* compiled from: KortrosViewPagerHolder.kt */
public final class KortrosViewPagerHolder$bind$2 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ KortrosViewPagerHolder this$0;

    KortrosViewPagerHolder$bind$2(KortrosViewPagerHolder kortrosViewPagerHolder) {
        this.this$0 = kortrosViewPagerHolder;
    }

    public void onGlobalLayout() {
        View view = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        PagerAdapter adapter = ((ViewPager) view).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
