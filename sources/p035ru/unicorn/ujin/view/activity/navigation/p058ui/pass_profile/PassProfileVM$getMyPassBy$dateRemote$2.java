package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "kotlin.jvm.PlatformType", "", "res", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$getMyPassBy$dateRemote$2 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$getMyPassBy$dateRemote$2<T, R> implements Function<Resource<BleData>, Iterable<? extends BleKeyData>> {
    public static final PassProfileVM$getMyPassBy$dateRemote$2 INSTANCE = new PassProfileVM$getMyPassBy$dateRemote$2();

    PassProfileVM$getMyPassBy$dateRemote$2() {
    }

    public final Iterable<BleKeyData> apply(Resource<BleData> resource) {
        Intrinsics.checkNotNullParameter(resource, UriUtil.LOCAL_RESOURCE_SCHEME);
        BleData data = resource.getData();
        return data != null ? data.getBleKey() : null;
    }
}
