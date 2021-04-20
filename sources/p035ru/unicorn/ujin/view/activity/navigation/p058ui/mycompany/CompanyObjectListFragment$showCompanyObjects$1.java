package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyObjectListAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListFragment$showCompanyObjects$1", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter$CompanyObjectListAdapterListener;", "onObjectSelected", "", "companyObject", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyObjectListFragment$showCompanyObjects$1 */
/* compiled from: CompanyObjectListFragment.kt */
public final class CompanyObjectListFragment$showCompanyObjects$1 implements CompanyObjectListAdapter.CompanyObjectListAdapterListener {
    final /* synthetic */ CompanyObjectListFragment this$0;

    CompanyObjectListFragment$showCompanyObjects$1(CompanyObjectListFragment companyObjectListFragment) {
        this.this$0 = companyObjectListFragment;
    }

    public void onObjectSelected(CompanyObject companyObject) {
        SingleLiveEvent<CompanyObject> currentCompanyObjectMutableLiveData = CompanyObjectListFragment.access$getViewModell$p(this.this$0).getCurrentCompanyObjectMutableLiveData();
        Intrinsics.checkNotNullExpressionValue(currentCompanyObjectMutableLiveData, "viewModell.currentCompanyObjectMutableLiveData");
        currentCompanyObjectMutableLiveData.setValue(companyObject);
        this.this$0.nextFragment(new CompanyObjectFragment(), false);
    }
}
