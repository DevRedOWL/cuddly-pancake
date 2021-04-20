package p035ru.unicorn.ujin.view.customViews.dynamic;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder$onValueChangedListener$1 */
/* compiled from: DatePickerViewHolder.kt */
final class DatePickerViewHolder$onValueChangedListener$1 extends Lambda implements Function1<String, Unit> {
    public static final DatePickerViewHolder$onValueChangedListener$1 INSTANCE = new DatePickerViewHolder$onValueChangedListener$1();

    DatePickerViewHolder$onValueChangedListener$1() {
        super(1);
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }
}
