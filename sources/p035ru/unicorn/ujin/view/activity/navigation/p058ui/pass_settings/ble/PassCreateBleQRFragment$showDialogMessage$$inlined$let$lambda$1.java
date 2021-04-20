package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "i", "", "onClick", "ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleQRFragment$showDialogMessage$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleQRFragment$showDialogMessage$$inlined$let$lambda$1 */
/* compiled from: PassCreateBleQRFragment.kt */
final class PassCreateBleQRFragment$showDialogMessage$$inlined$let$lambda$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ String $label$inlined;
    final /* synthetic */ PassCreateBleQRFragment this$0;

    PassCreateBleQRFragment$showDialogMessage$$inlined$let$lambda$1(PassCreateBleQRFragment passCreateBleQRFragment, String str) {
        this.this$0 = passCreateBleQRFragment;
        this.$label$inlined = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
        this.this$0.popFragment();
        dialogInterface.dismiss();
    }
}
