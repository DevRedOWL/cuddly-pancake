package org.jetbrains.anko;

import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 1}, mo51344k = 3, mo51345mv = {1, 1, 5})
/* compiled from: AndroidAlertBuilder.kt */
final class AndroidAlertBuilderKt$sam$OnKeyListener$4694417a implements DialogInterface.OnKeyListener {
    private final /* synthetic */ Function3 function;

    AndroidAlertBuilderKt$sam$OnKeyListener$4694417a(Function3 function3) {
        this.function = function3;
    }

    public final /* synthetic */ boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Object invoke = this.function.invoke(dialogInterface, Integer.valueOf(i), keyEvent);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
