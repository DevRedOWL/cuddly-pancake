package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.oss.OssViewModel;
import p035ru.unicorn.ujin.view.fragments.oss.response.Oss;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "code", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssBaseFragment$showSmsConfirmation$2 */
/* compiled from: OssBaseFragment.kt */
final class OssBaseFragment$showSmsConfirmation$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Oss $oss;
    final /* synthetic */ OssBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OssBaseFragment$showSmsConfirmation$2(OssBaseFragment ossBaseFragment, Oss oss) {
        super(1);
        this.this$0 = ossBaseFragment;
        this.$oss = oss;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        OssViewModel ossViewModel = this.this$0.getOssViewModel();
        Oss oss = this.$oss;
        ossViewModel.sendCode(oss != null ? oss.getId() : 0, str);
    }
}
