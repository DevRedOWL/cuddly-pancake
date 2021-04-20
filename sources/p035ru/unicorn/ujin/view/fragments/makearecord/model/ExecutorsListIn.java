package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsListIn;", "", "items", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsListIn */
/* compiled from: ExecutorsListIn.kt */
public final class ExecutorsListIn {
    private final List<ExecutorsIn> items;

    public static /* synthetic */ ExecutorsListIn copy$default(ExecutorsListIn executorsListIn, List<ExecutorsIn> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = executorsListIn.items;
        }
        return executorsListIn.copy(list);
    }

    public final List<ExecutorsIn> component1() {
        return this.items;
    }

    public final ExecutorsListIn copy(List<? extends ExecutorsIn> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        return new ExecutorsListIn(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ExecutorsListIn) && Intrinsics.areEqual((Object) this.items, (Object) ((ExecutorsListIn) obj).items);
        }
        return true;
    }

    public int hashCode() {
        List<ExecutorsIn> list = this.items;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ExecutorsListIn(items=" + this.items + ")";
    }

    public ExecutorsListIn(List<? extends ExecutorsIn> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.items = list;
    }

    public final List<ExecutorsIn> getItems() {
        return this.items;
    }
}
