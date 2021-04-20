package p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Data;", "", "passes", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getPasses", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Data */
/* compiled from: Data.kt */
public final class Data {
    private final ArrayList<Passe> passes;

    public static /* synthetic */ Data copy$default(Data data, ArrayList<Passe> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = data.passes;
        }
        return data.copy(arrayList);
    }

    public final ArrayList<Passe> component1() {
        return this.passes;
    }

    public final Data copy(ArrayList<Passe> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "passes");
        return new Data(arrayList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Data) && Intrinsics.areEqual((Object) this.passes, (Object) ((Data) obj).passes);
        }
        return true;
    }

    public int hashCode() {
        ArrayList<Passe> arrayList = this.passes;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Data(passes=" + this.passes + ")";
    }

    public Data(ArrayList<Passe> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "passes");
        this.passes = arrayList;
    }

    public final ArrayList<Passe> getPasses() {
        return this.passes;
    }
}
