package p035ru.unicorn.ujin.view.fragments.makearecord;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.functions.Action;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel$cancelRecord$1$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$cancelRecord$$inlined$let$lambda$3 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$cancelRecord$$inlined$let$lambda$3 implements Action {
    final /* synthetic */ RecordsViewModel this$0;

    RecordsViewModel$cancelRecord$$inlined$let$lambda$3(RecordsViewModel recordsViewModel) {
        this.this$0 = recordsViewModel;
    }

    public final void run() {
        SingleLiveEvent singleLiveEvent = this.this$0.showLoader;
        Intrinsics.checkNotNullExpressionValue(singleLiveEvent, "showLoader");
        singleLiveEvent.setValue(false);
    }
}
