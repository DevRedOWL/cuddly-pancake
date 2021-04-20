package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings;

import android.view.View;
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
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassSettingsBinding;
import p035ru.unicorn.databinding.ItemImageBinding;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble.PassSettingsBleFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "types", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.PassSettingsFragment$getAssignKey$1 */
/* compiled from: PassSettingsFragment.kt */
final class PassSettingsFragment$getAssignKey$1 extends Lambda implements Function1<List<? extends BleKeyData>, Unit> {
    final /* synthetic */ PassSettingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassSettingsFragment$getAssignKey$1(PassSettingsFragment passSettingsFragment) {
        super(1);
        this.this$0 = passSettingsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends BleKeyData>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<? extends BleKeyData> list) {
        Intrinsics.checkNotNullParameter(list, "types");
        Iterable<BleKeyData> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BleKeyData interfaceType : iterable) {
            arrayList.add(interfaceType.getInterfaceType());
        }
        Set set = CollectionsKt.toSet((List) arrayList);
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BleKeyData deviceClass : iterable) {
            arrayList2.add(Boolean.valueOf(Intrinsics.areEqual((Object) deviceClass.getDeviceClass(), (Object) "gate")));
        }
        final Set set2 = CollectionsKt.toSet((List) arrayList2);
        ItemImageBinding itemImageBinding = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).passIcon.id2;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding, "viewDataBinding.passIcon.id2");
        itemImageBinding.setActive(Boolean.valueOf(set.contains(PASS_TYPE.BLE.getType())));
        ItemImageBinding itemImageBinding2 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).passIcon.id3;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding2, "viewDataBinding.passIcon.id3");
        itemImageBinding2.setActive(Boolean.valueOf(set.contains(PASS_TYPE.CARD.getType())));
        ItemImageBinding itemImageBinding3 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).passIcon.id4;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding3, "viewDataBinding.passIcon.id4");
        itemImageBinding3.setActive(Boolean.valueOf(set.contains(PASS_TYPE.FACE.getType())));
        ItemImageBinding itemImageBinding4 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).passIcon.id5;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding4, "viewDataBinding.passIcon.id5");
        itemImageBinding4.setActive(Boolean.valueOf(set.contains(PASS_TYPE.FINGER.getType())));
        ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).choose3.parent.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ PassSettingsFragment$getAssignKey$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.this$0.nextFragment(PassSettingsBleFragment.Companion.newInstance(R.drawable.ic_svg_id_ble, R.string.label_id_ble, PASS_TYPE.BLE.getType(), !set2.isEmpty()), false, BaseActivity.FRAGMENT_BLE_START);
            }
        });
    }
}
