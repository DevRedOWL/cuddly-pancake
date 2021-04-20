package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;
import p035ru.unicorn.ujin.view.fragments.oss.response.Oss;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "oss", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "invoke", "ru/unicorn/ujin/view/fragments/oss/fragments/OssActiveArchiveFragment$onViewCreated$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssActiveArchiveFragment$onViewCreated$$inlined$apply$lambda$1 */
/* compiled from: OssActiveArchiveFragment.kt */
final class OssActiveArchiveFragment$onViewCreated$$inlined$apply$lambda$1 extends Lambda implements Function1<Oss, Unit> {
    final /* synthetic */ OssActiveArchiveFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OssActiveArchiveFragment$onViewCreated$$inlined$apply$lambda$1(OssActiveArchiveFragment ossActiveArchiveFragment) {
        super(1);
        this.this$0 = ossActiveArchiveFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Oss) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Oss oss) {
        Intrinsics.checkNotNullParameter(oss, SmartNavFragment.OSS);
        this.this$0.handleOssClick(oss);
    }
}
