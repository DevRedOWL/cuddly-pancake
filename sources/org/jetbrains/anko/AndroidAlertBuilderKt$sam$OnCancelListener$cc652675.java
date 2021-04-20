package org.jetbrains.anko;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 1}, mo51344k = 3, mo51345mv = {1, 1, 5})
/* compiled from: AndroidAlertBuilder.kt */
final class AndroidAlertBuilderKt$sam$OnCancelListener$cc652675 implements DialogInterface.OnCancelListener {
    private final /* synthetic */ Function1 function;

    AndroidAlertBuilderKt$sam$OnCancelListener$cc652675(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        Intrinsics.checkExpressionValueIsNotNull(this.function.invoke(dialogInterface), "invoke(...)");
    }
}
