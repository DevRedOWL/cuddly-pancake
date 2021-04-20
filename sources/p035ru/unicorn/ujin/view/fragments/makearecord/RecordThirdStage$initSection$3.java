package p035ru.unicorn.ujin.view.fragments.makearecord;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleCellsIn;
import p059rx.functions.Action1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleCellsIn;", "kotlin.jvm.PlatformType", "call"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordThirdStage$initSection$3 */
/* compiled from: RecordThirdStage.kt */
final class RecordThirdStage$initSection$3<T> implements Action1<ScheduleCellsIn> {
    final /* synthetic */ RecordThirdStage this$0;

    RecordThirdStage$initSection$3(RecordThirdStage recordThirdStage) {
        this.this$0 = recordThirdStage;
    }

    public final void call(ScheduleCellsIn scheduleCellsIn) {
        this.this$0.onCellClick(scheduleCellsIn);
    }
}
