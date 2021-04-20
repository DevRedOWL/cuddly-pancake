package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$showNotAvailableDialog$2 */
/* compiled from: NewSmartNavFragment.kt */
final class NewSmartNavFragment$showNotAvailableDialog$2 implements DialogInterface.OnClickListener {
    public static final NewSmartNavFragment$showNotAvailableDialog$2 INSTANCE = new NewSmartNavFragment$showNotAvailableDialog$2();

    NewSmartNavFragment$showNotAvailableDialog$2() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }
}
