package p035ru.unicorn.ujin.view.fragments.providerService;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ReactConst;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderData;", "", "services", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getServices", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ActiveProviderData */
/* compiled from: ActiveProviderInfoData.kt */
public final class ActiveProviderData {
    private final ArrayList<Integer> services;

    public static /* synthetic */ ActiveProviderData copy$default(ActiveProviderData activeProviderData, ArrayList<Integer> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = activeProviderData.services;
        }
        return activeProviderData.copy(arrayList);
    }

    public final ArrayList<Integer> component1() {
        return this.services;
    }

    public final ActiveProviderData copy(ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, ReactConst.SERVICETAB);
        return new ActiveProviderData(arrayList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ActiveProviderData) && Intrinsics.areEqual((Object) this.services, (Object) ((ActiveProviderData) obj).services);
        }
        return true;
    }

    public int hashCode() {
        ArrayList<Integer> arrayList = this.services;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ActiveProviderData(services=" + this.services + ")";
    }

    public ActiveProviderData(ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, ReactConst.SERVICETAB);
        this.services = arrayList;
    }

    public final ArrayList<Integer> getServices() {
        return this.services;
    }
}
