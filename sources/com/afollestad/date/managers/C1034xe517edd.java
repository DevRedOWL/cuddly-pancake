package com.afollestad.date.managers;

import android.widget.TextView;
import com.afollestad.date.managers.DatePickerLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/widget/TextView;", "invoke", "com/afollestad/date/managers/DatePickerLayoutManager$setupNavigationViews$1$1"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* renamed from: com.afollestad.date.managers.DatePickerLayoutManager$setupNavigationViews$$inlined$apply$lambda$1 */
/* compiled from: DatePickerLayoutManager.kt */
final class C1034xe517edd extends Lambda implements Function1<TextView, Unit> {
    final /* synthetic */ DatePickerLayoutManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1034xe517edd(DatePickerLayoutManager datePickerLayoutManager) {
        super(1);
        this.this$0 = datePickerLayoutManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextView) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "it");
        this.this$0.setMode(DatePickerLayoutManager.Mode.MONTH_LIST);
    }
}
