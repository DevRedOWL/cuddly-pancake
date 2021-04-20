package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassIn;
import p059rx.functions.Action1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassIn;", "kotlin.jvm.PlatformType", "call"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaFragment$initSections$1 */
/* compiled from: CoronaFragment.kt */
final class CoronaFragment$initSections$1<T> implements Action1<PassIn> {
    final /* synthetic */ CoronaFragment this$0;

    CoronaFragment$initSections$1(CoronaFragment coronaFragment) {
        this.this$0 = coronaFragment;
    }

    public final void call(PassIn passIn) {
        CoronaFragment coronaFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(passIn, "data");
        coronaFragment.onClick(passIn);
    }
}
