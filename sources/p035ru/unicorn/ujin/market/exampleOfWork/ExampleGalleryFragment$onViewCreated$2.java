package p035ru.unicorn.ujin.market.exampleOfWork;

import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0017J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, mo51343d2 = {"ru/unicorn/ujin/market/exampleOfWork/ExampleGalleryFragment$onViewCreated$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.exampleOfWork.ExampleGalleryFragment$onViewCreated$2 */
/* compiled from: ExampleGalleryFragment.kt */
public final class ExampleGalleryFragment$onViewCreated$2 implements ViewPager.OnPageChangeListener {
    final /* synthetic */ ExampleGalleryFragment this$0;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    ExampleGalleryFragment$onViewCreated$2(ExampleGalleryFragment exampleGalleryFragment) {
        this.this$0 = exampleGalleryFragment;
    }

    public void onPageSelected(int i) {
        this.this$0.currentPosition = i;
        this.this$0.setTitle();
    }
}
