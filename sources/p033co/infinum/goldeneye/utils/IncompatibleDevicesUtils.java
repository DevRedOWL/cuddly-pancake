package p033co.infinum.goldeneye.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, mo51343d2 = {"Lco/infinum/goldeneye/utils/IncompatibleDevicesUtils;", "", "()V", "isIncompatibleDevice", "", "model", "", "Device", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.utils.IncompatibleDevicesUtils */
/* compiled from: IncompatibleDevicesUtils.kt */
public final class IncompatibleDevicesUtils {
    public static final IncompatibleDevicesUtils INSTANCE = new IncompatibleDevicesUtils();

    private IncompatibleDevicesUtils() {
    }

    public final boolean isIncompatibleDevice(String str) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(str, "model");
        Device[] values = Device.values();
        Collection arrayList = new ArrayList();
        for (Device models : values) {
            CollectionsKt.addAll(arrayList, models.getModels());
        }
        Iterator it = ((List) arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.equals((String) obj, str, false)) {
                break;
            }
        }
        return obj != null;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, mo51343d2 = {"Lco/infinum/goldeneye/utils/IncompatibleDevicesUtils$Device;", "", "models", "", "", "(Ljava/lang/String;ILjava/util/List;)V", "getModels", "()Ljava/util/List;", "ONE_PLUS_6", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.utils.IncompatibleDevicesUtils$Device */
    /* compiled from: IncompatibleDevicesUtils.kt */
    public enum Device {
        ONE_PLUS_6(CollectionsKt.listOf("oneplus a6000", "oneplus a6003"));
        
        private final List<String> models;

        protected Device(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "models");
            this.models = list;
        }

        public final List<String> getModels() {
            return this.models;
        }
    }
}
