package p035ru.unicorn.ujin.view.fragments.makearecord;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059rx.functions.Action1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordThirdStage$initSection$1 */
/* compiled from: RecordThirdStage.kt */
final class RecordThirdStage$initSection$1<T> implements Action1<Integer> {
    final /* synthetic */ RecordThirdStage this$0;

    RecordThirdStage$initSection$1(RecordThirdStage recordThirdStage) {
        this.this$0 = recordThirdStage;
    }

    public final void call(Integer num) {
        RecordThirdStage recordThirdStage = this.this$0;
        Intrinsics.checkNotNullExpressionValue(num, "data");
        recordThirdStage.onDateClick(num.intValue());
    }
}
