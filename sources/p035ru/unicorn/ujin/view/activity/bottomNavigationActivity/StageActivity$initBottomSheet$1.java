package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import android.view.View;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/bottomNavigationActivity/StageActivity$initBottomSheet$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$initBottomSheet$1 */
/* compiled from: StageActivity.kt */
public final class StageActivity$initBottomSheet$1 extends BottomSheetBehavior.BottomSheetCallback {
    final /* synthetic */ StageActivity this$0;

    public void onSlide(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
    }

    StageActivity$initBottomSheet$1(StageActivity stageActivity) {
        this.this$0 = stageActivity;
    }

    public void onStateChanged(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
        if (3 == i) {
            ImageView access$getIvHot$p = this.this$0.ivHot;
            Intrinsics.checkNotNullExpressionValue(access$getIvHot$p, "ivHot");
            access$getIvHot$p.setLayoutParams(UIHelper.setLayoutParams(32, 8, this.this$0));
            this.this$0.ivHot.setBackgroundResource(R.drawable.ic_svg_arrow_down);
        } else if (4 == i) {
            ImageView access$getIvHot$p2 = this.this$0.ivHot;
            Intrinsics.checkNotNullExpressionValue(access$getIvHot$p2, "ivHot");
            access$getIvHot$p2.setLayoutParams(UIHelper.setLayoutParams(-2, -2, this.this$0));
            this.this$0.ivHot.setBackgroundResource(R.drawable.ic_bottom_sheet);
        }
    }
}
