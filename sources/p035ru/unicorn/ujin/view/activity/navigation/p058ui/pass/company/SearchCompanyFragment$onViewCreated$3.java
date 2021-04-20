package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.CompanyDataIn;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyDataIn;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.SearchCompanyFragment$onViewCreated$3 */
/* compiled from: SearchCompanyFragment.kt */
final class SearchCompanyFragment$onViewCreated$3<T> implements Observer<List<? extends CompanyDataIn>> {
    final /* synthetic */ SearchCompanyFragment this$0;

    SearchCompanyFragment$onViewCreated$3(SearchCompanyFragment searchCompanyFragment) {
        this.this$0 = searchCompanyFragment;
    }

    public final void onChanged(List<CompanyDataIn> list) {
        this.this$0.showCompanyList(list);
    }
}
