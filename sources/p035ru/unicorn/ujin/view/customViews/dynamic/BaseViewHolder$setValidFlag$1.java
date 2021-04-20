package p035ru.unicorn.ujin.view.customViews.dynamic;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.BaseViewHolder$setValidFlag$1 */
/* compiled from: BaseViewHolder.kt */
final class BaseViewHolder$setValidFlag$1 extends Lambda implements Function2<Boolean, String, Unit> {
    public static final BaseViewHolder$setValidFlag$1 INSTANCE = new BaseViewHolder$setValidFlag$1();

    BaseViewHolder$setValidFlag$1() {
        super(2);
    }

    public final void invoke(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), (String) obj2);
        return Unit.INSTANCE;
    }
}
