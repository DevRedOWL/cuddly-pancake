package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$deleteByInterfaceType$2 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$deleteByInterfaceType$2<T> implements Consumer<Resource<BleData>> {
    final /* synthetic */ PassProfileVM this$0;

    PassProfileVM$deleteByInterfaceType$2(PassProfileVM passProfileVM) {
        this.this$0 = passProfileVM;
    }

    public final void accept(Resource<BleData> resource) {
        SingleLiveEvent<Boolean> saveFaceResult = this.this$0.getSaveFaceResult();
        Intrinsics.checkNotNullExpressionValue(resource, "it");
        Integer error = resource.getError();
        boolean z = true;
        if (error != null && error.intValue() == 1) {
            z = false;
        }
        saveFaceResult.setValue(Boolean.valueOf(z));
    }
}
