package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.data.BleReader;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/ble/data/BleReader;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$onViewCreated$2 */
/* compiled from: PassDetailFragment2.kt */
final class PassDetailFragment2$onViewCreated$2 extends Lambda implements Function1<List<BleReader>, Unit> {
    final /* synthetic */ PassDetailFragment2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassDetailFragment2$onViewCreated$2(PassDetailFragment2 passDetailFragment2) {
        super(1);
        this.this$0 = passDetailFragment2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<BleReader>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<BleReader> list) {
        PassDetailFragment2 passDetailFragment2 = this.this$0;
        Intrinsics.checkNotNullExpressionValue(list, "it");
        passDetailFragment2.bleList = list;
        PassDetailFragment2 passDetailFragment22 = this.this$0;
        Iterable<BleReader> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BleReader deviceMac : iterable) {
            String deviceMac2 = deviceMac.getDeviceMac();
            if (deviceMac2 != null) {
                String lowerCase = deviceMac2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        passDetailFragment22.bleListMac = CollectionsKt.toMutableList((List) arrayList);
    }
}
