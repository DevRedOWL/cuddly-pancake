package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$6 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$6 implements View.OnClickListener {
    final /* synthetic */ AnotherPassViewModel $viewModell;
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$onViewCreated$6(AnotherPassNewFragment anotherPassNewFragment, AnotherPassViewModel anotherPassViewModel) {
        this.this$0 = anotherPassNewFragment;
        this.$viewModell = anotherPassViewModel;
    }

    public final void onClick(View view) {
        View currentFocus;
        FragmentActivity activity = this.this$0.getActivity();
        if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
            currentFocus.clearFocus();
        }
        if (this.this$0.valid()) {
            ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.pbLoading);
            Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
            progressBar.setVisibility(0);
            AnotherPassViewModel anotherPassViewModel = this.$viewModell;
            if (anotherPassViewModel != null) {
                anotherPassViewModel.createAnotherPass();
            }
        }
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), this.this$0._$_findCachedViewById(C5619R.C5622id.data11));
    }
}
