package org.jetbrains.anko;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Landroid/content/DialogInterface;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 5})
/* compiled from: AlertDialogBuilder.kt */
final class AlertDialogBuilder$noButton$1 extends Lambda implements Function1<DialogInterface, Unit> {
    public static final AlertDialogBuilder$noButton$1 INSTANCE = new AlertDialogBuilder$noButton$1();

    AlertDialogBuilder$noButton$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DialogInterface) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(DialogInterface dialogInterface) {
        Intrinsics.checkParameterIsNotNull(dialogInterface, "$receiver");
        dialogInterface.dismiss();
    }
}
