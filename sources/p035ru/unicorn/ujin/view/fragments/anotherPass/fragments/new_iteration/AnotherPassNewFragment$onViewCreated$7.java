package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentAnotherPassBinding;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$7 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$7 implements View.OnClickListener {
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$onViewCreated$7(AnotherPassNewFragment anotherPassNewFragment) {
        this.this$0 = anotherPassNewFragment;
    }

    public final void onClick(View view) {
        View currentFocus;
        FragmentActivity activity = this.this$0.getActivity();
        if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
            currentFocus.clearFocus();
        }
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), this.this$0._$_findCachedViewById(C5619R.C5622id.data11));
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).group;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.group");
        dynamicBackgroundButton.setVisibility(8);
        View _$_findCachedViewById = this.this$0._$_findCachedViewById(C5619R.C5622id.paddingGroup);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "paddingGroup");
        _$_findCachedViewById.setVisibility(0);
        View _$_findCachedViewById2 = this.this$0._$_findCachedViewById(C5619R.C5622id.title7);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "title7");
        _$_findCachedViewById2.setVisibility(0);
        View _$_findCachedViewById3 = this.this$0._$_findCachedViewById(C5619R.C5622id.data17);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "data17");
        _$_findCachedViewById3.setVisibility(0);
        ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).llAdditional.requestFocus();
        LinearLayout linearLayout = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).llAdditional;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewDataBinding.llAdditional");
        if (linearLayout.getChildCount() == 0) {
            View _$_findCachedViewById4 = this.this$0._$_findCachedViewById(C5619R.C5622id.title6);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "title6");
            _$_findCachedViewById4.setVisibility(8);
        }
    }
}
