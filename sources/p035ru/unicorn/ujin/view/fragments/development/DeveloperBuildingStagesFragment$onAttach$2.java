package p035ru.unicorn.ujin.view.fragments.development;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "show", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$onAttach$2 */
/* compiled from: DeveloperBuildingStagesFragment.kt */
final class DeveloperBuildingStagesFragment$onAttach$2<T> implements Observer<Boolean> {
    final /* synthetic */ DeveloperBuildingStagesFragment this$0;

    DeveloperBuildingStagesFragment$onAttach$2(DeveloperBuildingStagesFragment developerBuildingStagesFragment) {
        this.this$0 = developerBuildingStagesFragment;
    }

    public final void onChanged(Boolean bool) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "pbLoading");
        Intrinsics.checkNotNullExpressionValue(bool, "show");
        constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
    }
}
