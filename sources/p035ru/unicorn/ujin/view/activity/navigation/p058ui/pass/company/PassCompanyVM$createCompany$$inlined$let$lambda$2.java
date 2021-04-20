package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyListUno;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyOUT;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyListUno;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lkotlin/Unit;)Lio/reactivex/ObservableSource;", "ru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM$createCompany$4$7"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$2 */
/* compiled from: PassCompanyVM.kt */
final class PassCompanyVM$createCompany$$inlined$let$lambda$2<T, R> implements Function<Unit, ObservableSource<? extends Resource<CompanyListUno>>> {
    final /* synthetic */ NewCompanyOUT $companyToUpload;
    final /* synthetic */ PassCompanyVM this$0;

    PassCompanyVM$createCompany$$inlined$let$lambda$2(NewCompanyOUT newCompanyOUT, PassCompanyVM passCompanyVM) {
        this.$companyToUpload = newCompanyOUT;
        this.this$0 = passCompanyVM;
    }

    public final ObservableSource<? extends Resource<CompanyListUno>> apply(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "it");
        return this.this$0.getCompanyPassRep().createCompany(this.$companyToUpload);
    }
}
