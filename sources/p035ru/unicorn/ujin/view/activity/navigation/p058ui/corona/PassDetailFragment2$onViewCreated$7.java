package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$onViewCreated$7 */
/* compiled from: PassDetailFragment2.kt */
final class PassDetailFragment2$onViewCreated$7 extends Lambda implements Function1<Resource<BleData>, Unit> {
    final /* synthetic */ PassDetailFragment2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassDetailFragment2$onViewCreated$7(PassDetailFragment2 passDetailFragment2) {
        super(1);
        this.this$0 = passDetailFragment2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Resource<BleData>) (Resource) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Resource<BleData> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        if (resource.getStatus() == Resource.Status.SUCCESS) {
            PassDetailFragment2.access$getPassProfileVM$p(this.this$0).loadAllAssignKey();
            PassDetailFragment2.access$getPassProfileVM$p(this.this$0).getAssignKey();
            PassDetailFragment2.access$getPassProfileVM$p(this.this$0).getAllAvailableType();
        }
    }
}
