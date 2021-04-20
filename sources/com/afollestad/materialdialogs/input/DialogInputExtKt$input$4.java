package com.afollestad.materialdialogs.input;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: DialogInputExt.kt */
final class DialogInputExtKt$input$4 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ boolean $allowEmpty;
    final /* synthetic */ Function2 $callback;
    final /* synthetic */ Integer $maxLength;
    final /* synthetic */ MaterialDialog $this_input;
    final /* synthetic */ boolean $waitForPositiveButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DialogInputExtKt$input$4(MaterialDialog materialDialog, boolean z, Integer num, boolean z2, Function2 function2) {
        super(1);
        this.$this_input = materialDialog;
        this.$allowEmpty = z;
        this.$maxLength = num;
        this.$waitForPositiveButton = z2;
        this.$callback = function2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CharSequence) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(CharSequence charSequence) {
        Function2 function2;
        Intrinsics.checkParameterIsNotNull(charSequence, "it");
        if (!this.$allowEmpty) {
            DialogActionExtKt.setActionButtonEnabled(this.$this_input, WhichButton.POSITIVE, charSequence.length() > 0);
        }
        Integer num = this.$maxLength;
        if (num != null) {
            num.intValue();
            InputUtilExtKt.invalidateInputMaxLength(this.$this_input, this.$allowEmpty);
        }
        if (!this.$waitForPositiveButton && (function2 = this.$callback) != null) {
            function2.invoke(this.$this_input, charSequence);
        }
    }
}
