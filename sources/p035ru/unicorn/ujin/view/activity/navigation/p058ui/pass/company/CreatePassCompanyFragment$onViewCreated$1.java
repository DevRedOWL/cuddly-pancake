package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyListUno;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyListUno;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CreatePassCompanyFragment$onViewCreated$1 */
/* compiled from: CreatePassCompanyFragment.kt */
final class CreatePassCompanyFragment$onViewCreated$1<T> implements Observer<Resource<CompanyListUno>> {
    final /* synthetic */ CreatePassCompanyFragment this$0;

    CreatePassCompanyFragment$onViewCreated$1(CreatePassCompanyFragment createPassCompanyFragment) {
        this.this$0 = createPassCompanyFragment;
    }

    public final void onChanged(Resource<CompanyListUno> resource) {
        this.this$0.onCreateCompanyResult(resource);
    }
}
