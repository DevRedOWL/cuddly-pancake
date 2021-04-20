package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyAttachment;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "file", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/NewCompanyAttachment;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$5 */
/* compiled from: PassCompanyVM.kt */
final class PassCompanyVM$createCompany$4$5<T> implements Predicate<NewCompanyAttachment> {
    public static final PassCompanyVM$createCompany$4$5 INSTANCE = new PassCompanyVM$createCompany$4$5();

    PassCompanyVM$createCompany$4$5() {
    }

    public final boolean test(NewCompanyAttachment newCompanyAttachment) {
        Intrinsics.checkNotNullParameter(newCompanyAttachment, UriUtil.LOCAL_FILE_SCHEME);
        return newCompanyAttachment.getId() != 0;
    }
}
