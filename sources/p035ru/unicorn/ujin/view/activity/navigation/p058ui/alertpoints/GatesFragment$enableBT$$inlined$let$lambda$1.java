package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.content.Intent;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.TransparentActivityKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke", "ru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesFragment$enableBT$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$enableBT$$inlined$let$lambda$1 */
/* compiled from: GatesFragment.kt */
final class GatesFragment$enableBT$$inlined$let$lambda$1 extends Lambda implements Function1<MaterialDialog, Unit> {
    final /* synthetic */ GatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GatesFragment$enableBT$$inlined$let$lambda$1(GatesFragment gatesFragment) {
        super(1);
        this.this$0 = gatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MaterialDialog) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(MaterialDialog materialDialog) {
        Intrinsics.checkNotNullParameter(materialDialog, "dialog");
        materialDialog.dismiss();
        this.this$0.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), TransparentActivityKt.REQUEST_ENABLE_BT);
    }
}
