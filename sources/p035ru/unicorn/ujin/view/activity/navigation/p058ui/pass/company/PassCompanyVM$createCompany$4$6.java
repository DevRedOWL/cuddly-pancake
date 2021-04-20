package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyAttachment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyOUT;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "uploadedListFiles", "", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/NewCompanyAttachment;", "kotlin.jvm.PlatformType", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$6 */
/* compiled from: PassCompanyVM.kt */
final class PassCompanyVM$createCompany$4$6<T, R> implements Function<List<NewCompanyAttachment>, Unit> {
    final /* synthetic */ NewCompanyOUT $companyToUpload;

    PassCompanyVM$createCompany$4$6(NewCompanyOUT newCompanyOUT) {
        this.$companyToUpload = newCompanyOUT;
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        apply((List<NewCompanyAttachment>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void apply(List<NewCompanyAttachment> list) {
        Intrinsics.checkNotNullParameter(list, "uploadedListFiles");
        this.$companyToUpload.setAttachments(list);
    }
}
