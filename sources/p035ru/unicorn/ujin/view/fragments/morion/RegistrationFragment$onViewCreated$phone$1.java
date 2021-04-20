package p035ru.unicorn.ujin.view.fragments.morion;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.helper.ValidationHelper;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "data", "", "apply", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.morion.RegistrationFragment$onViewCreated$phone$1 */
/* compiled from: RegistrationFragment.kt */
final class RegistrationFragment$onViewCreated$phone$1<T, R> implements Function<CharSequence, Boolean> {
    public static final RegistrationFragment$onViewCreated$phone$1 INSTANCE = new RegistrationFragment$onViewCreated$phone$1();

    RegistrationFragment$onViewCreated$phone$1() {
    }

    public final Boolean apply(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "data");
        return Boolean.valueOf(ValidationHelper.isValidPhone(charSequence));
    }
}
