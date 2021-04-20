package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "companyObjects", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyObjectFragment$onViewCreated$1 */
/* compiled from: CompanyObjectFragment.kt */
final class CompanyObjectFragment$onViewCreated$1<T> implements Observer<List<CompanyObject>> {
    final /* synthetic */ CompanyObjectFragment this$0;

    CompanyObjectFragment$onViewCreated$1(CompanyObjectFragment companyObjectFragment) {
        this.this$0 = companyObjectFragment;
    }

    public final void onChanged(List<CompanyObject> list) {
        this.this$0.showCompanyObjects(list);
    }
}
