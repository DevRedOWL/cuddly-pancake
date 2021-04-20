package p035ru.unicorn.ujin.view.fragments.makearecord;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordThirdStage$onDateClick$1 */
/* compiled from: RecordThirdStage.kt */
final class RecordThirdStage$onDateClick$1 implements Runnable {
    final /* synthetic */ int $halfScreen;
    final /* synthetic */ int $position;
    final /* synthetic */ RecordThirdStage this$0;

    RecordThirdStage$onDateClick$1(RecordThirdStage recordThirdStage, int i, int i2) {
        this.this$0 = recordThirdStage;
        this.$position = i;
        this.$halfScreen = i2;
    }

    public final void run() {
        this.this$0.getLlm().scrollToPositionWithOffset(this.$position, this.$halfScreen);
    }
}
