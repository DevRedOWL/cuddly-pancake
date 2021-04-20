package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "ru/unicorn/ujin/view/fragments/newSmartNav/NewSmartNavFragment$showDynamicDialog$1$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$showDynamicDialog$$inlined$let$lambda$3 */
/* compiled from: NewSmartNavFragment.kt */
final class NewSmartNavFragment$showDynamicDialog$$inlined$let$lambda$3 implements DialogInterface.OnClickListener {
    final /* synthetic */ AlertDialog.Builder $dialogBuilder$inlined;
    final /* synthetic */ DialogButtons $finalDialogButtons;
    final /* synthetic */ NewSmartNavFragment this$0;

    NewSmartNavFragment$showDynamicDialog$$inlined$let$lambda$3(DialogButtons dialogButtons, NewSmartNavFragment newSmartNavFragment, AlertDialog.Builder builder) {
        this.$finalDialogButtons = dialogButtons;
        this.this$0 = newSmartNavFragment;
        this.$dialogBuilder$inlined = builder;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        NewSmartNavFragment newSmartNavFragment = this.this$0;
        DialogButtons dialogButtons = this.$finalDialogButtons;
        Intrinsics.checkNotNullExpressionValue(dialogInterface, "dialog");
        newSmartNavFragment.makeAction(dialogButtons, dialogInterface);
    }
}
