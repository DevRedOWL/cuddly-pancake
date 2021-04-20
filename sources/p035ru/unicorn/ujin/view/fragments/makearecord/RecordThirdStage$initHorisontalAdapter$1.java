package p035ru.unicorn.ujin.view.fragments.makearecord;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/makearecord/RecordThirdStage$initHorisontalAdapter$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordThirdStage$initHorisontalAdapter$1 */
/* compiled from: RecordThirdStage.kt */
public final class RecordThirdStage$initHorisontalAdapter$1 extends RecyclerView.OnScrollListener {
    final /* synthetic */ RecordThirdStage this$0;

    RecordThirdStage$initHorisontalAdapter$1(RecordThirdStage recordThirdStage) {
        this.this$0 = recordThirdStage;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.this$0.scrollSelectedItemInCenter(recyclerView);
        }
    }
}
