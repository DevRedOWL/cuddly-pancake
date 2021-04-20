package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "invoke", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/new_iteration/AnotherPassNewFragment$handleEmployeeSlots$1$1$1$1", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/new_iteration/AnotherPassNewFragment$$special$$inlined$apply$lambda$1", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/new_iteration/AnotherPassNewFragment$$special$$inlined$apply$lambda$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$handleEmployeeSlots$$inlined$let$lambda$1 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$handleEmployeeSlots$$inlined$let$lambda$1 extends Lambda implements Function1<Zone, Unit> {
    final /* synthetic */ ArrayList $it$inlined;
    final /* synthetic */ ArrayList $zoneList$inlined;
    final /* synthetic */ AnotherPassNewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnotherPassNewFragment$handleEmployeeSlots$$inlined$let$lambda$1(ArrayList arrayList, ArrayList arrayList2, AnotherPassNewFragment anotherPassNewFragment) {
        super(1);
        this.$zoneList$inlined = arrayList;
        this.$it$inlined = arrayList2;
        this.this$0 = anotherPassNewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Zone) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Zone zone) {
        Intrinsics.checkNotNullParameter(zone, "slot");
        this.this$0.handleSlotClick(zone, (Zone) null);
    }
}
