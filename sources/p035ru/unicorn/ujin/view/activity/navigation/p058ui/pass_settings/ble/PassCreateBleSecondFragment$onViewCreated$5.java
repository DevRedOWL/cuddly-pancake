package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/ble/data/BleReader;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment$onViewCreated$5 */
/* compiled from: PassCreateBleSecondFragment.kt */
final class PassCreateBleSecondFragment$onViewCreated$5 extends Lambda implements Function1<List<BleReader>, Unit> {
    final /* synthetic */ PassCreateBleSecondFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateBleSecondFragment$onViewCreated$5(PassCreateBleSecondFragment passCreateBleSecondFragment) {
        super(1);
        this.this$0 = passCreateBleSecondFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<BleReader>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<BleReader> list) {
        PassCreateBleSecondFragment passCreateBleSecondFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(list, "it");
        passCreateBleSecondFragment.bleList = list;
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.buttonSend);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonSend");
        dynamicBackgroundButton.setVisibility(0);
    }
}
