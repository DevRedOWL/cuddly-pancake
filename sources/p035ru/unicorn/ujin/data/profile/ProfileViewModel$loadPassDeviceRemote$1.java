package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$loadPassDeviceRemote$1 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$loadPassDeviceRemote$1<T> implements Consumer<Resource<BleData>> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$loadPassDeviceRemote$1(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(Resource<BleData> resource) {
        this.this$0.getHasBleDevice().setValue(resource);
    }
}
