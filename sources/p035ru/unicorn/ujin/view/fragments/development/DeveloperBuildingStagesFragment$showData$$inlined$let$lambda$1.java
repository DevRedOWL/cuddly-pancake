package p035ru.unicorn.ujin.view.fragments.development;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "position", "", "invoke", "ru/unicorn/ujin/view/fragments/development/DeveloperBuildingStagesFragment$showData$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$1 */
/* compiled from: DeveloperBuildingStagesFragment.kt */
final class DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ DeveloperBuildingStagesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$1(DeveloperBuildingStagesFragment developerBuildingStagesFragment) {
        super(1);
        this.this$0 = developerBuildingStagesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.this$0.onItemClicked(i);
    }
}
