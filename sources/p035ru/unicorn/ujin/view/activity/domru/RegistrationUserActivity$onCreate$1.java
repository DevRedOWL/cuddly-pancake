package p035ru.unicorn.ujin.view.activity.domru;

import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/domru/RegistrationUserActivity$onCreate$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.RegistrationUserActivity$onCreate$1 */
/* compiled from: RegistrationUserActivity.kt */
public final class RegistrationUserActivity$onCreate$1 implements ViewPager.OnPageChangeListener {
    final /* synthetic */ RegistrationUserActivity this$0;

    public void onPageScrollStateChanged(int i) {
    }

    RegistrationUserActivity$onCreate$1(RegistrationUserActivity registrationUserActivity) {
        this.this$0 = registrationUserActivity;
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.this$0.currentStep = i;
    }

    public void onPageSelected(int i) {
        this.this$0.currentStep = i;
    }
}
