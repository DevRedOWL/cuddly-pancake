package p035ru.unicorn.ujin.view.fragments.makearecord;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordThirdStage$scrollSelectedItemInCenter$1 */
/* compiled from: RecordThirdStage.kt */
final class RecordThirdStage$scrollSelectedItemInCenter$1 implements Runnable {
    final /* synthetic */ int $halfScreen;
    final /* synthetic */ LinearLayoutManager $llm;
    final /* synthetic */ int $position;

    RecordThirdStage$scrollSelectedItemInCenter$1(LinearLayoutManager linearLayoutManager, int i, int i2) {
        this.$llm = linearLayoutManager;
        this.$position = i;
        this.$halfScreen = i2;
    }

    public final void run() {
        this.$llm.scrollToPositionWithOffset(this.$position, this.$halfScreen);
    }
}
