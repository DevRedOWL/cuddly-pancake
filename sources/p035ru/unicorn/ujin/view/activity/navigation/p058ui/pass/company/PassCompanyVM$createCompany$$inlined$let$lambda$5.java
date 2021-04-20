package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyListUno;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyListUno;", "kotlin.jvm.PlatformType", "accept", "ru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM$createCompany$4$10"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$5 */
/* compiled from: PassCompanyVM.kt */
final class PassCompanyVM$createCompany$$inlined$let$lambda$5<T> implements Consumer<Resource<CompanyListUno>> {
    final /* synthetic */ PassCompanyVM this$0;

    PassCompanyVM$createCompany$$inlined$let$lambda$5(PassCompanyVM passCompanyVM) {
        this.this$0 = passCompanyVM;
    }

    public final void accept(Resource<CompanyListUno> resource) {
        Intrinsics.checkNotNullExpressionValue(resource, "data");
        if (resource.getStatus() == Resource.Status.SUCCESS) {
            this.this$0.getCreateCompanyResult().setValue(resource);
        } else if (resource.getStatus() == Resource.Status.ERROR) {
            SingleLiveEvent singleLiveEvent = this.this$0.showError;
            Intrinsics.checkNotNullExpressionValue(singleLiveEvent, "showError");
            singleLiveEvent.setValue(resource.getMessage());
        }
    }
}
