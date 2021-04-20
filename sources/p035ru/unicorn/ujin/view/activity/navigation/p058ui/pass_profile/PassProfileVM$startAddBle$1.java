package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$startAddBle$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$startAddBle$1<T> implements Consumer<Resource<Unit>> {
    final /* synthetic */ PassProfileVM this$0;

    PassProfileVM$startAddBle$1(PassProfileVM passProfileVM) {
        this.this$0 = passProfileVM;
    }

    public final void accept(Resource<Unit> resource) {
        Intrinsics.checkNotNullExpressionValue(resource, "resource");
        Integer error = resource.getError();
        if (error != null && error.intValue() == 0) {
            SingleLiveEvent<Boolean> saveBleResult = this.this$0.getSaveBleResult();
            Integer error2 = resource.getError();
            boolean z = true;
            if (error2 != null && error2.intValue() == 1) {
                z = false;
            }
            saveBleResult.setValue(Boolean.valueOf(z));
            return;
        }
        this.this$0.getIterationError().setValue(resource.getMessage());
    }
}
