package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import android.view.ViewTreeObserver;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.profile.ProfileFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/bottomNavigationActivity/StageActivity$navigateProfile$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$navigateProfile$1 */
/* compiled from: StageActivity.kt */
public final class StageActivity$navigateProfile$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ String $whatToOpen;
    final /* synthetic */ StageActivity this$0;

    StageActivity$navigateProfile$1(StageActivity stageActivity, String str) {
        this.this$0 = stageActivity;
        this.$whatToOpen = str;
    }

    public void onGlobalLayout() {
        if (Intrinsics.areEqual((Object) this.$whatToOpen, (Object) ProfileFragment.Companion.getCURRENT_APARTMENT())) {
            this.this$0.needToShowMyFlatImmediatelly = true;
        }
        this.this$0.bottomNavigationView.findViewById(R.id.navigation_more_id).performClick();
        BottomNavigationView bottomNavigationView = this.this$0.bottomNavigationView;
        Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottomNavigationView");
        bottomNavigationView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
