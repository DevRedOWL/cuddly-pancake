package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.view.View;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$onViewCreated$3 */
/* compiled from: PassDetailFragment2.kt */
final class PassDetailFragment2$onViewCreated$3 extends Lambda implements Function1<List<BleKeyData>, Unit> {
    final /* synthetic */ PassDetailFragment2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassDetailFragment2$onViewCreated$3(PassDetailFragment2 passDetailFragment2) {
        super(1);
        this.this$0 = passDetailFragment2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<BleKeyData>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<BleKeyData> list) {
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            for (BleKeyData next : list) {
                if (Intrinsics.areEqual((Object) next.getInterfaceType(), (Object) PASS_TYPE.BLE.getType())) {
                    DynamicBackgroundButton dynamicBackgroundButton = this.this$0.getBinding().openDoor;
                    Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "binding.openDoor");
                    dynamicBackgroundButton.setVisibility(0);
                    String deviceClass = next.getDeviceClass();
                    int hashCode = deviceClass.hashCode();
                    if (hashCode != 3165387) {
                        if (hashCode == 104695420 && deviceClass.equals("nedap")) {
                            this.this$0.getBinding().openDoor.setOnClickListener(new View.OnClickListener(this) {
                                final /* synthetic */ PassDetailFragment2$onViewCreated$3 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                public final void onClick(View view) {
                                    this.this$0.this$0.onOpenDoorClick();
                                }
                            });
                        }
                    } else if (deviceClass.equals("gate")) {
                        this.this$0.setNeedDestroy(true);
                        this.this$0.getGateKey();
                    }
                }
            }
        }
    }
}
