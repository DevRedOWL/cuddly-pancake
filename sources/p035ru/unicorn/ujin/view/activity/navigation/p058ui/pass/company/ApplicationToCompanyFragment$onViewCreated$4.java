package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.view.View;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$4 */
/* compiled from: ApplicationToCompanyFragment.kt */
final class ApplicationToCompanyFragment$onViewCreated$4 implements View.OnClickListener {
    final /* synthetic */ PassCompanyVM $viewModell;
    final /* synthetic */ ApplicationToCompanyFragment this$0;

    ApplicationToCompanyFragment$onViewCreated$4(ApplicationToCompanyFragment applicationToCompanyFragment, PassCompanyVM passCompanyVM) {
        this.this$0 = applicationToCompanyFragment;
        this.$viewModell = passCompanyVM;
    }

    public final void onClick(View view) {
        if (this.this$0.isValid()) {
            UIHelper.hideKeyboard(this.this$0.getBaseActivity(), view);
            ProgressBar progressBar = ((FragmentApplicationToCompanyBinding) this.this$0.getViewDataBinding()).pbLoading;
            Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.pbLoading");
            progressBar.setVisibility(0);
            PassCompanyVM passCompanyVM = this.$viewModell;
            if (passCompanyVM != null) {
                passCompanyVM.becomeEmployee();
            }
        }
    }
}
