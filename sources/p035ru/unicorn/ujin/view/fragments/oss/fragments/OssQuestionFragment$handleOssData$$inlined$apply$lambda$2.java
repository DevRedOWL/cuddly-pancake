package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "name", "", "invoke", "ru/unicorn/ujin/view/fragments/oss/fragments/OssQuestionFragment$handleOssData$1$1$4", "ru/unicorn/ujin/view/fragments/oss/fragments/OssQuestionFragment$$special$$inlined$also$lambda$4"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$$inlined$apply$lambda$2 */
/* compiled from: OssQuestionFragment.kt */
final class OssQuestionFragment$handleOssData$$inlined$apply$lambda$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ RecyclerView $this_apply$inlined;
    final /* synthetic */ OssQuestionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OssQuestionFragment$handleOssData$$inlined$apply$lambda$2(RecyclerView recyclerView, OssQuestionFragment ossQuestionFragment) {
        super(1);
        this.$this_apply$inlined = recyclerView;
        this.this$0 = ossQuestionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        OssQuestionFragment ossQuestionFragment = this.this$0;
        ossQuestionFragment.showSmsConfirmation(ossQuestionFragment.getOss());
    }
}
