package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble.PassCreateBleZeroFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "types", "", "Lru/unicorn/ujin/ble/data/BleReader;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassSettingsBleFragment$getAssignKey$1 */
/* compiled from: PassSettingsBleFragment.kt */
final class PassSettingsBleFragment$getAssignKey$1 extends Lambda implements Function1<List<BleReader>, Unit> {
    final /* synthetic */ PassSettingsBleFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassSettingsBleFragment$getAssignKey$1(PassSettingsBleFragment passSettingsBleFragment) {
        super(1);
        this.this$0 = passSettingsBleFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<BleReader>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<BleReader> list) {
        Intrinsics.checkNotNullExpressionValue(list, "types");
        Iterable<BleReader> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BleReader deviceClass : iterable) {
            arrayList.add(deviceClass.getDeviceClass());
        }
        Set set = CollectionsKt.toSet((List) arrayList);
        if (set.contains("nedap") && !set.contains("gate")) {
            this.this$0.checkNedapPermissions();
        } else if (set.contains("nedap") || !set.contains("gate")) {
            PassSettingsBleFragment passSettingsBleFragment = this.this$0;
            PassCreateBleZeroFragment.Companion companion = PassCreateBleZeroFragment.Companion;
            Bundle arguments = this.this$0.getArguments();
            passSettingsBleFragment.nextFragment(companion.newInstance(arguments != null ? arguments.getBoolean("ARG_HAS_GATE", false) : false), false);
        } else {
            this.this$0.checkGatePermission();
        }
    }
}
