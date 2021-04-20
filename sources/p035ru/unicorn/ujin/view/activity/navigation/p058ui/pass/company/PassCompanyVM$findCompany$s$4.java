package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.CompanyDataIn;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyDataIn;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$findCompany$s$4 */
/* compiled from: PassCompanyVM.kt */
final class PassCompanyVM$findCompany$s$4<T> implements Consumer<List<CompanyDataIn>> {
    final /* synthetic */ PassCompanyVM this$0;

    PassCompanyVM$findCompany$s$4(PassCompanyVM passCompanyVM) {
        this.this$0 = passCompanyVM;
    }

    public final void accept(List<CompanyDataIn> list) {
        this.this$0.getCompanyList().setValue(list);
    }
}
