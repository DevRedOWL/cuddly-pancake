package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke", "ru/unicorn/ujin/view/activity/navigation/ui/pass/company/ConnectToCompanyFragment$showSuccesMessage$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ConnectToCompanyFragment$showSuccesMessage$$inlined$let$lambda$1 */
/* compiled from: ConnectToCompanyFragment.kt */
final class ConnectToCompanyFragment$showSuccesMessage$$inlined$let$lambda$1 extends Lambda implements Function1<MaterialDialog, Unit> {
    final /* synthetic */ ConnectToCompanyFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConnectToCompanyFragment$showSuccesMessage$$inlined$let$lambda$1(ConnectToCompanyFragment connectToCompanyFragment) {
        super(1);
        this.this$0 = connectToCompanyFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MaterialDialog) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(MaterialDialog materialDialog) {
        Intrinsics.checkNotNullParameter(materialDialog, "it");
        this.this$0.nextFragment(new MyRentaCompanyFragment(), false, BaseActivity.FRAGMENT_MY_COMPANY);
    }
}
