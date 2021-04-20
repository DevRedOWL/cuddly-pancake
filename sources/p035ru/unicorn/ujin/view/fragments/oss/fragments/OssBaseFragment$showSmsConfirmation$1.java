package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.oss.OssViewModel;
import p035ru.unicorn.ujin.view.fragments.oss.response.Oss;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssBaseFragment$showSmsConfirmation$1 */
/* compiled from: OssBaseFragment.kt */
final class OssBaseFragment$showSmsConfirmation$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Oss $oss;
    final /* synthetic */ OssBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OssBaseFragment$showSmsConfirmation$1(OssBaseFragment ossBaseFragment, Oss oss) {
        super(0);
        this.this$0 = ossBaseFragment;
        this.$oss = oss;
    }

    public final void invoke() {
        OssViewModel ossViewModel = this.this$0.getOssViewModel();
        Oss oss = this.$oss;
        ossViewModel.getSmsCode(oss != null ? oss.getId() : 0);
    }
}
