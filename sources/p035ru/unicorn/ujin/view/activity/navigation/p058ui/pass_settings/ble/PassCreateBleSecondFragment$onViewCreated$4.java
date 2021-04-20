package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.app.Application;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.BleWorkerImpl;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "pair", "Landroid/util/Pair;", "Lru/unicorn/ujin/ble/data/BleReader;", "Lru/unicorn/ujin/ble/data/BleKeyData;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment$onViewCreated$4 */
/* compiled from: PassCreateBleSecondFragment.kt */
final class PassCreateBleSecondFragment$onViewCreated$4 extends Lambda implements Function1<Pair<BleReader, BleKeyData>, Unit> {
    final /* synthetic */ PassCreateBleSecondFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateBleSecondFragment$onViewCreated$4(PassCreateBleSecondFragment passCreateBleSecondFragment) {
        super(1);
        this.this$0 = passCreateBleSecondFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Pair<BleReader, BleKeyData>) (Pair) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Pair<BleReader, BleKeyData> pair) {
        Log.d("TAG", "MY BLE 0 " + pair.toString() + ' ');
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            PassCreateBleSecondFragment passCreateBleSecondFragment = this.this$0;
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            Application application = activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "activity.application");
            BleWorkerImpl bleWorkerImpl = new BleWorkerImpl(application, this.this$0, (StringBuilder) null, 4, (DefaultConstructorMarker) null);
            Object obj = pair.first;
            Intrinsics.checkNotNullExpressionValue(obj, "pair.first");
            Object obj2 = pair.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "pair.second");
            bleWorkerImpl.startScan((BleReader) obj, (BleKeyData) obj2);
            Unit unit = Unit.INSTANCE;
            passCreateBleSecondFragment.setBleWorker(bleWorkerImpl);
        }
    }
}
