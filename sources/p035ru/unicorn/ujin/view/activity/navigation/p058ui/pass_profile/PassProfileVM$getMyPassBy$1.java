package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "kotlin.jvm.PlatformType", "", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$getMyPassBy$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$getMyPassBy$1<T> implements Consumer<List<BleKeyData>> {
    final /* synthetic */ PassProfileVM this$0;

    PassProfileVM$getMyPassBy$1(PassProfileVM passProfileVM) {
        this.this$0 = passProfileVM;
    }

    public final void accept(List<BleKeyData> list) {
        this.this$0.getBleKeyDataFilterBy().setValue(list);
    }
}
