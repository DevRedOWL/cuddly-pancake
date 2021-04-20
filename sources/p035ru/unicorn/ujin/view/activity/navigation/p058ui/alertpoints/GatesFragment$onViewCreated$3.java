package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "url", "", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$onViewCreated$3 */
/* compiled from: GatesFragment.kt */
final class GatesFragment$onViewCreated$3<T> implements Consumer<String> {
    final /* synthetic */ GatesFragment this$0;

    GatesFragment$onViewCreated$3(GatesFragment gatesFragment) {
        this.this$0 = gatesFragment;
    }

    public final void accept(String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.this$0.onShowVideoClick(str);
    }
}
