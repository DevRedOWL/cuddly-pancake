package com.afollestad.date;

import com.afollestad.date.controllers.DatePickerController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: DatePicker.kt */
final /* synthetic */ class DatePicker$onFinishInflate$2 extends FunctionReference implements Function0<Unit> {
    DatePicker$onFinishInflate$2(DatePickerController datePickerController) {
        super(0, datePickerController);
    }

    public final String getName() {
        return "nextMonth";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(DatePickerController.class);
    }

    public final String getSignature() {
        return "nextMonth()V";
    }

    public final void invoke() {
        ((DatePickerController) this.receiver).nextMonth();
    }
}
