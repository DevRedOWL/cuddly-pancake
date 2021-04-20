package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/ble/data/BleKeyData;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$getMyPassBy$dateRemote$3 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$getMyPassBy$dateRemote$3<T> implements Predicate<BleKeyData> {
    final /* synthetic */ String $passType;

    PassProfileVM$getMyPassBy$dateRemote$3(String str) {
        this.$passType = str;
    }

    public final boolean test(BleKeyData bleKeyData) {
        Intrinsics.checkNotNullParameter(bleKeyData, "it");
        return StringsKt.contains((CharSequence) bleKeyData.getInterfaceType(), (CharSequence) this.$passType, false);
    }
}