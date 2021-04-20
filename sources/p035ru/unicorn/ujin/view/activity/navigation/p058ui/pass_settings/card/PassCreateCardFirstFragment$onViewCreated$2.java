package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.card;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.data.BleReader;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/ble/data/BleReader;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassCreateCardFirstFragment$onViewCreated$2 */
/* compiled from: PassCreateCardFirstFragment.kt */
final class PassCreateCardFirstFragment$onViewCreated$2 extends Lambda implements Function1<List<BleReader>, Unit> {
    final /* synthetic */ PassCreateCardFirstFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateCardFirstFragment$onViewCreated$2(PassCreateCardFirstFragment passCreateCardFirstFragment) {
        super(1);
        this.this$0 = passCreateCardFirstFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<BleReader>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<BleReader> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        this.this$0.bleReaderSection.setData(list);
    }
}
