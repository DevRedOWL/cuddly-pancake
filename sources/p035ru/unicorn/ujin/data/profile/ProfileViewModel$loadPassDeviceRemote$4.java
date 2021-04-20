package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import kotlin.Pair;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lru/unicorn/ujin/ble/data/BleReader;", "Lru/unicorn/ujin/ble/data/BleKeyData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$loadPassDeviceRemote$4 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$loadPassDeviceRemote$4<T> implements Consumer<Pair<? extends BleReader, ? extends BleKeyData>> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$loadPassDeviceRemote$4(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(Pair<? extends BleReader, ? extends BleKeyData> pair) {
        this.this$0.getCurrentBleDevice().setValue(pair);
    }
}
