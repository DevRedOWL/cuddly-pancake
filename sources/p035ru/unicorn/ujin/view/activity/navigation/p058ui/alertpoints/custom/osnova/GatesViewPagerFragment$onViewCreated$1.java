package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment$onViewCreated$1 */
/* compiled from: GatesViewPagerFragment.kt */
final class GatesViewPagerFragment$onViewCreated$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ GatesViewPagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GatesViewPagerFragment$onViewCreated$1(GatesViewPagerFragment gatesViewPagerFragment) {
        super(1);
        this.this$0 = gatesViewPagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Boolean bool) {
        ProgressBar progressBar = this.this$0.f6913pb;
        if (progressBar != null) {
            Intrinsics.checkNotNullExpressionValue(bool, "it");
            ExtensionKt.setVisible(progressBar, bool.booleanValue());
        }
    }
}
