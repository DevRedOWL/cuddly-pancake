package p035ru.unicorn.ujin.ble;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "kotlin.jvm.PlatformType", "data", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleRepo$loadMyPassDevice$1 */
/* compiled from: BleRepo.kt */
final class BleRepo$loadMyPassDevice$1<T, R> implements Function<Resource<BleData>, Resource<BleData>> {
    public static final BleRepo$loadMyPassDevice$1 INSTANCE = new BleRepo$loadMyPassDevice$1();

    BleRepo$loadMyPassDevice$1() {
    }

    public final Resource<BleData> apply(Resource<BleData> resource) {
        Intrinsics.checkNotNullParameter(resource, "data");
        Integer error = resource.getError();
        String message = resource.getMessage();
        if (message == null) {
            message = "";
        }
        return Resource.success(error, message, resource.getData());
    }
}
