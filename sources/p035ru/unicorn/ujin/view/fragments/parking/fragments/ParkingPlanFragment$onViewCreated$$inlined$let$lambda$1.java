package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingPlanFragment$onViewCreated$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingPlanFragment$onViewCreated$$inlined$let$lambda$1 */
/* compiled from: ParkingPlanFragment.kt */
final class ParkingPlanFragment$onViewCreated$$inlined$let$lambda$1 implements View.OnClickListener {
    final /* synthetic */ String $url;
    final /* synthetic */ ParkingPlanFragment this$0;

    ParkingPlanFragment$onViewCreated$$inlined$let$lambda$1(String str, ParkingPlanFragment parkingPlanFragment) {
        this.$url = str;
        this.this$0 = parkingPlanFragment;
    }

    public final void onClick(View view) {
        ParkingMiniPlanDialog newInstance = ParkingMiniPlanDialog.Companion.newInstance(this.$url);
        BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
        newInstance.show(access$getBaseActivity.getSupportFragmentManager(), "");
    }
}
