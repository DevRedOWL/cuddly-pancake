package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.oss.events.OssDataEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/view/fragments/oss/events/OssDataEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$onViewCreated$2 */
/* compiled from: OssQuestionFragment.kt */
final class OssQuestionFragment$onViewCreated$2<T> implements Observer<OssDataEvent> {
    final /* synthetic */ OssQuestionFragment this$0;

    OssQuestionFragment$onViewCreated$2(OssQuestionFragment ossQuestionFragment) {
        this.this$0 = ossQuestionFragment;
    }

    public final void onChanged(OssDataEvent ossDataEvent) {
        OssQuestionFragment ossQuestionFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(ossDataEvent, "event");
        ossQuestionFragment.handleOssData(ossDataEvent);
    }
}
