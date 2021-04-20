package com.afollestad.materialdialogs.input;

import android.text.Editable;
import android.view.View;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a7\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u0002H\u00062\u0019\b\u0004\u0010\b\u001a\u0013\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\b¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\r"}, mo51343d2 = {"invalidateInputMaxLength", "", "Lcom/afollestad/materialdialogs/MaterialDialog;", "allowEmpty", "", "postRun", "T", "Landroid/view/View;", "exec", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Z", "showKeyboardIfApplicable", "input"}, mo51344k = 2, mo51345mv = {1, 1, 16})
/* compiled from: InputUtilExt.kt */
public final class InputUtilExtKt {
    public static final void invalidateInputMaxLength(MaterialDialog materialDialog, boolean z) {
        int counterMaxLength;
        Intrinsics.checkParameterIsNotNull(materialDialog, "$this$invalidateInputMaxLength");
        Editable text = DialogInputExtKt.getInputField(materialDialog).getText();
        boolean z2 = false;
        int length = text != null ? text.length() : 0;
        if ((z || length != 0) && (counterMaxLength = DialogInputExtKt.getInputLayout(materialDialog).getCounterMaxLength()) > 0) {
            WhichButton whichButton = WhichButton.POSITIVE;
            if (length <= counterMaxLength) {
                z2 = true;
            }
            DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z2);
        }
    }

    public static final void showKeyboardIfApplicable(MaterialDialog materialDialog) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "$this$showKeyboardIfApplicable");
        View inputField = DialogInputExtKt.getInputField(materialDialog);
        inputField.post(new InputUtilExtKt$showKeyboardIfApplicable$$inlined$postRun$1(inputField, materialDialog));
    }

    public static final <T extends View> boolean postRun(T t, Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(t, "$this$postRun");
        Intrinsics.checkParameterIsNotNull(function1, "exec");
        return t.post(new InputUtilExtKt$postRun$1(t, function1));
    }
}
