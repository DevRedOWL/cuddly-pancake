package p035ru.unicorn.ujin.ble.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B1\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/ble/data/BleData;", "", "reader", "", "Lru/unicorn/ujin/ble/data/BleReader;", "bleKey", "Lru/unicorn/ujin/ble/data/BleKeyData;", "system", "Lru/unicorn/ujin/ble/data/AvailableDeviceType;", "(Ljava/util/List;Ljava/util/List;Lru/unicorn/ujin/ble/data/AvailableDeviceType;)V", "getBleKey", "()Ljava/util/List;", "getReader", "getSystem", "()Lru/unicorn/ujin/ble/data/AvailableDeviceType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.data.BleData */
/* compiled from: BleData.kt */
public final class BleData {
    @SerializedName("key")
    private final List<BleKeyData> bleKey;
    private final List<BleReader> reader;
    private final AvailableDeviceType system;

    public static /* synthetic */ BleData copy$default(BleData bleData, List<BleReader> list, List<BleKeyData> list2, AvailableDeviceType availableDeviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleData.reader;
        }
        if ((i & 2) != 0) {
            list2 = bleData.bleKey;
        }
        if ((i & 4) != 0) {
            availableDeviceType = bleData.system;
        }
        return bleData.copy(list, list2, availableDeviceType);
    }

    public final List<BleReader> component1() {
        return this.reader;
    }

    public final List<BleKeyData> component2() {
        return this.bleKey;
    }

    public final AvailableDeviceType component3() {
        return this.system;
    }

    public final BleData copy(List<? extends BleReader> list, List<? extends BleKeyData> list2, AvailableDeviceType availableDeviceType) {
        return new BleData(list, list2, availableDeviceType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleData)) {
            return false;
        }
        BleData bleData = (BleData) obj;
        return Intrinsics.areEqual((Object) this.reader, (Object) bleData.reader) && Intrinsics.areEqual((Object) this.bleKey, (Object) bleData.bleKey) && Intrinsics.areEqual((Object) this.system, (Object) bleData.system);
    }

    public int hashCode() {
        List<BleReader> list = this.reader;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<BleKeyData> list2 = this.bleKey;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        AvailableDeviceType availableDeviceType = this.system;
        if (availableDeviceType != null) {
            i = availableDeviceType.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "BleData(reader=" + this.reader + ", bleKey=" + this.bleKey + ", system=" + this.system + ")";
    }

    public BleData(List<? extends BleReader> list, List<? extends BleKeyData> list2, AvailableDeviceType availableDeviceType) {
        this.reader = list;
        this.bleKey = list2;
        this.system = availableDeviceType;
    }

    public final List<BleReader> getReader() {
        return this.reader;
    }

    public final List<BleKeyData> getBleKey() {
        return this.bleKey;
    }

    public final AvailableDeviceType getSystem() {
        return this.system;
    }
}
