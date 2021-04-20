package p035ru.unicorn.ujin.ble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import p035ru.unicorn.ujin.ble.data.AvailableDeviceType;
import p035ru.unicorn.ujin.ble.data.AvailablePassType;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmObject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleRepo$loadMyPassDevice$2 */
/* compiled from: BleRepo.kt */
final class BleRepo$loadMyPassDevice$2<T> implements Consumer<Resource<BleData>> {
    public static final BleRepo$loadMyPassDevice$2 INSTANCE = new BleRepo$loadMyPassDevice$2();

    BleRepo$loadMyPassDevice$2() {
    }

    public final void accept(Resource<BleData> resource) {
        BleData data;
        List list;
        List<String> available;
        if (resource != null && (data = resource.getData()) != null) {
            LocalRepository.getInstance().saveDataOrUpdate((List<? extends RealmObject>) data.getReader());
            LocalRepository.getInstance().delete(BleKeyData.class);
            LocalRepository.getInstance().saveDataOrUpdate((List<? extends RealmObject>) data.getBleKey());
            AvailableDeviceType system = data.getSystem();
            if (system == null || (available = system.getAvailable()) == null) {
                list = null;
            } else {
                Iterable<String> iterable = available;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (String availablePassType : iterable) {
                    arrayList.add(new AvailablePassType(availablePassType));
                }
                list = (List) arrayList;
            }
            LocalRepository.getInstance().saveDataOrUpdate((List<? extends RealmObject>) list);
        }
    }
}
