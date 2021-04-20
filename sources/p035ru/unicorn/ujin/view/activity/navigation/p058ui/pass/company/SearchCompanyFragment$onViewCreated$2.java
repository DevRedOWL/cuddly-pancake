package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.CompanyDataIn;
import p059rx.functions.Action1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyDataIn;", "kotlin.jvm.PlatformType", "call"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.SearchCompanyFragment$onViewCreated$2 */
/* compiled from: SearchCompanyFragment.kt */
final class SearchCompanyFragment$onViewCreated$2<T> implements Action1<CompanyDataIn> {
    final /* synthetic */ PassCompanyVM $viewModell;
    final /* synthetic */ SearchCompanyFragment this$0;

    SearchCompanyFragment$onViewCreated$2(SearchCompanyFragment searchCompanyFragment, PassCompanyVM passCompanyVM) {
        this.this$0 = searchCompanyFragment;
        this.$viewModell = passCompanyVM;
    }

    public final void call(CompanyDataIn companyDataIn) {
        PassCompanyVM passCompanyVM = this.$viewModell;
        if (passCompanyVM != null) {
            Intrinsics.checkNotNullExpressionValue(companyDataIn, "data");
            passCompanyVM.showInfoAboutCompany(companyDataIn);
        }
        PassCompanyVM passCompanyVM2 = this.$viewModell;
        if (passCompanyVM2 != null) {
            passCompanyVM2.clearedSearchResult();
        }
        FragmentActivity activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity);
        UIHelper.hideKeyboard(activity, this.this$0.getView());
        this.this$0.nextFragment(new ConnectToCompanyFragment(), false);
    }
}
