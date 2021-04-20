package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "text", "", "invoke", "ru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassEditProfileFragment$onButtonAddAdressClick$1$1$1", "ru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassEditProfileFragment$$special$$inlined$show$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassEditProfileFragment$onButtonAddAdressClick$$inlined$let$lambda$1 */
/* compiled from: PassEditProfileFragment.kt */
final class C5907xe69b1dde extends Lambda implements Function2<MaterialDialog, CharSequence, Unit> {
    final /* synthetic */ PassEditProfileFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5907xe69b1dde(PassEditProfileFragment passEditProfileFragment) {
        super(2);
        this.this$0 = passEditProfileFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((MaterialDialog) obj, (CharSequence) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(MaterialDialog materialDialog, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(materialDialog, "dialog");
        Intrinsics.checkNotNullParameter(charSequence, "text");
        this.this$0.onAddAdressClick(charSequence.toString());
    }
}
