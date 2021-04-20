package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "list", "Ljava/util/HashSet;", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$1 */
/* compiled from: PassCompanyVM.kt */
final class PassCompanyVM$createCompany$4$1<T> implements Predicate<HashSet<AttachablePreview>> {
    public static final PassCompanyVM$createCompany$4$1 INSTANCE = new PassCompanyVM$createCompany$4$1();

    PassCompanyVM$createCompany$4$1() {
    }

    public final boolean test(HashSet<AttachablePreview> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "list");
        return !hashSet.isEmpty();
    }
}
